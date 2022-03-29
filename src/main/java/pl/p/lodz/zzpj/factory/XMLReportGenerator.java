package pl.p.lodz.zzpj.factory;

public class XMLReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport() {
        return new XMLReport();
    }
}
