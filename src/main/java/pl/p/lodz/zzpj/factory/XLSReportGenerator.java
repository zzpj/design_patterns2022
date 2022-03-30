package pl.p.lodz.zzpj.factory;

public class XLSReportGenerator implements ReportGenerator{
    @Override
    public Report generateReport() {
        System.out.println("XLSReportGenerator created!");
        return new XLSReport();
    }
}
