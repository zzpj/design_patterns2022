package pl.p.lodz.zzpj.factory;

public interface Report {

    Page createNewPage();
    Table createNewTable();
    Cell createNewCell();

}

class Page{}
class Table{}
class Cell{}
