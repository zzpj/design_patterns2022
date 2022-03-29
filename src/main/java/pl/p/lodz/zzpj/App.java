package pl.p.lodz.zzpj;

import pl.p.lodz.zzpj.builder.Value;
import pl.p.lodz.zzpj.observer.StationCompany;
import pl.p.lodz.zzpj.observer.StationNews;
import pl.p.lodz.zzpj.proxy.Image;
import pl.p.lodz.zzpj.proxy.ImageProxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import pl.p.lodz.zzpj.factory.*;
import pl.p.lodz.zzpj.singleton.Config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    static Config config1, config2;

    public static void main(String args[]) throws InterruptedException {


//        Building gg = new Building.BuildingBuilder().buildingCompanyName("gg").flatsNumber(20).build();
        //Building building = new BuildingBuilder().setCompleteRentAreaUnit("").setFlatsNumber(20).createBuilding();


        //Fabryka
        Report report;
        ReportGenerator reportGenerator;
        if(args[0].equals("pdf")) {
            reportGenerator = new PDFReportGenerator();
            report = reportGenerator.generateReport();
        } else if(args[0].equals("xml")) {
            reportGenerator = new XMLReportGenerator();
            report = reportGenerator.generateReport();
        } else if(args[0].equals("xls")) {
            reportGenerator = new XLSReportGenerator();
            report = reportGenerator.generateReport();
        } else {
            reportGenerator = new HTMLReportGenerator();
            report = reportGenerator.generateReport();
        }
        report.createNewCell();
        report.createNewTable();
        report.createNewPage();

        //Singleton
        Runnable runnable1 = () -> config1 = Config.getInstance();
        Runnable runnable2 = () -> config2 = Config.getInstance();

        int succcess =0;
        int fails = 0;

        for (int i = 0; i< 10_000; i++) {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            executorService.submit(runnable1);
            executorService.submit(runnable2);
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.SECONDS);

            if(config1.equals(config2)){
                succcess++;
            }
            else {
                fails++;
            }
        }
        System.out.println("Success "+ succcess + " fails " + fails);
        Value value = new Value.ValueBuilder("cd","xd").value3(3).value4("cos").build();
        Value value2 = new Value.ValueBuilder("cd1","xd1").value3(4).build();
        System.out.printf(value.getValue() + value.getValue2() + value.getValue3() + value.getValue4()+"\n");
        System.out.printf(value2.getValue()+ value2.getValue2()+ value2.getValue3()+ value2.getValue4()+"\n");
        Image image = new ImageProxy();
        image.calculate();
        image.calculate();
        StationCompany observable = new StationCompany();
        StationNews observer = new StationNews();
        observable.addObserver(observer);
        observable.setInfo("info");
        assertEquals(observer.getNews(), "info");

    }

}

