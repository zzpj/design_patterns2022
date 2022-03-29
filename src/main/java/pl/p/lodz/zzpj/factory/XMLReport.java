package pl.p.lodz.zzpj.factory;

public class XMLReport implements Report{
    @Override
    public Page createNewPage() {
        System.out.println("Create page in xml");
        return new Page();
    }

    @Override
    public Table createNewTable() {
        System.out.println("Create table in xml");
        return new Table();
    }

    @Override
    public Cell createNewCell() {
        System.out.println("Create cell in xml");
        return new Cell();
    }
}
