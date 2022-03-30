package pl.p.lodz.zzpj.factory;

public class XLSReport implements Report{
    @Override
    public Page createNewPage() {
        return new Page();
    }

    @Override
    public Table createNewTable() {
        return new Table();
    }

    @Override
    public Cell createNewCell() {
        return new Cell();
    }
}
