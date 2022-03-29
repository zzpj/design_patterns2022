package pl.p.lodz.zzpj.factory;

public class XLSReport implements Report{
    @Override
    public Page createNewPage() {
        System.out.println("Create page in xls");
        return new Page();
    }

    @Override
    public Table createNewTable() {
        System.out.println("Create table in xls");
        return new Table();
    }

    @Override
    public Cell createNewCell() {
        System.out.println("Create cell in xls");
        return new Cell();
    }
}
