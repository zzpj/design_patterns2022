package pl.p.lodz.zzpj.factory;

public class HTMLReport implements Report {
    @Override
    public Page createNewPage() {
        System.out.println("Create page in html");
        return new Page();
    }

    @Override
    public Table createNewTable() {
        System.out.println("Create table in html");
        return new Table();
    }

    @Override
    public Cell createNewCell() {
        System.out.println("Cell page in html");
        return new Cell();
    }
}
