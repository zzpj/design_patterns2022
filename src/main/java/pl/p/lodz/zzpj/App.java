package pl.p.lodz.zzpj;

import pl.p.lodz.zzpj.builder.Building;
import pl.p.lodz.zzpj.factory.*;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        //Builder example
        Building b = Building.builder().buildingCompanyName("ZZPJ2022").
                flatsNumber(20).petFriendlyFlag(true).build();
        System.out.println(b.getBuildingCompanyName() + " " + b.getFlatsNumber());

        //Factory example
        Scanner in = new Scanner(System.in);
        String formatType = in.nextLine();
        System.out.println(formatType);
        ReportGenerator reportGenerator;
        Report report = null;
        if (Objects.equals(formatType, "pdf")){
            reportGenerator = new PDFReportGenerator();
            report = reportGenerator.generateReport();
        }
        else if (Objects.equals(formatType, "html")){
            reportGenerator = new HTMLReportGenerator();
            report = reportGenerator.generateReport();
        }
        else if (Objects.equals(formatType, "xml")){
            reportGenerator = new XMLReportGenerator();
            report = reportGenerator.generateReport();
        }
        else if (Objects.equals(formatType, "xls")){
            reportGenerator = new XLSReportGenerator();
            report = reportGenerator.generateReport();
        }
        else {
            System.out.println("Bad value passed!");
        }
        report.createNewCell();
        report.createNewTable();
        report.createNewTable();
    }
}

