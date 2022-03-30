package pl.p.lodz.zzpj.factory;

public class XMLReportGenerator implements ReportGenerator{
    @Override
    public Report generateReport() {
        System.out.println("XMLReportGenerator created!");
        return new XMLReport();
    }
}
