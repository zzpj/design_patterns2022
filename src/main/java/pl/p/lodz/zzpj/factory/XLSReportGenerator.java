package pl.p.lodz.zzpj.factory;

public class XLSReportGenerator implements ReportGenerator {
    @Override
    public Report generateReport() {
        return new XLSReport();
    }
}
