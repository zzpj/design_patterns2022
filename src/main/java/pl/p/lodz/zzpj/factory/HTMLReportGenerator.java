package pl.p.lodz.zzpj.factory;

public class HTMLReportGenerator implements ReportGenerator{
    @Override
    public Report generateReport() {
        System.out.println("HTMLReportGenerator created!");
        return new HTMLReport();
    }
}
