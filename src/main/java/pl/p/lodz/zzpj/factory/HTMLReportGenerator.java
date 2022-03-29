package pl.p.lodz.zzpj.factory;

public class HTMLReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport() {
        return new HTMLReport();
    }
}
