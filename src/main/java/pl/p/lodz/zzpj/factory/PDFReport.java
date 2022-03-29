package pl.p.lodz.zzpj.factory;

public class PDFReport implements Report {
    @Override
    public Page createNewPage() {
        System.out.println("Create page in pdf");
        return new Page();
    }

    @Override
    public Table createNewTable() {
        System.out.println("Create table in pdf");
        return new Table();
    }

    @Override
    public Cell createNewCell() {
        System.out.println("Create cell in pdf");
        return new Cell();
    }
}
