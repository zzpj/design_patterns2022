package pl.p.lodz.zzpj.factory;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport() {
        return new PDFReport();
    }
}