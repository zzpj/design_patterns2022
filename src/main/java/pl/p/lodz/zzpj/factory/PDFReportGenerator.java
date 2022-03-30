package pl.p.lodz.zzpj.factory;

public class PDFReportGenerator implements ReportGenerator{
    @Override
    public Report generateReport() {
        System.out.println("PDFReportGenerator created!");
        return new PDFReport();
    }
}
