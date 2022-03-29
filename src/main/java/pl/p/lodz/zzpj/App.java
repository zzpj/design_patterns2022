package pl.p.lodz.zzpj;

import pl.p.lodz.zzpj.builder.Building;
import pl.p.lodz.zzpj.factory.PDFReport;
import pl.p.lodz.zzpj.factory.PDFReportGenerator;
import pl.p.lodz.zzpj.factory.Report;
import pl.p.lodz.zzpj.factory.ReportGenerator;
import pl.p.lodz.zzpj.singleton.Config;

public class App {

    static Config config1;
    static Config config2;

    public static void main(String[] args) throws InterruptedException {


//        ReportGenerator reportGenerator = new PDFReportGenerator();
//        Report report = reportGenerator.generateReport();
//        report.createNewPage();

//        Building building = new Building.BuildingBuilder().buildingCompanyName("NewComp").constructionYear(1999).hasGarden(1).build();

//        Runnable runnable1 = () -> config1 = Config.getInstance();
//        Runnable runnable2 = () -> config2 = Config.getInstance();
//
//        int success = 0;
//        int fail = 0;
//
//        for (int i = 0; i < 10_000; i++) {
//            ExecutorService executorService = Executors.newFixedThreadPool(2);
//            executorService.submit(runnable1);
//            executorService.submit(runnable2);
//            executorService.shutdown();
//            executorService.awaitTermination(1, TimeUnit.SECONDS);
//
//            if (config1.equals(config2)) {
//                success++;
//            } else {
//                fail++;
//            }
//        }
//        System.out.println("success " + success);
//        System.out.println("fail " + fail);

    }
}

