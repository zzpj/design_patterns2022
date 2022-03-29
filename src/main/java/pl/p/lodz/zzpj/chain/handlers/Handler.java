package pl.p.lodz.zzpj.chain.handlers;

import pl.p.lodz.zzpj.chain.model.DataBase;

public abstract class Handler {

    Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public Handler getNext() {
        return next;
    }

    public boolean checkNext(DataBase dataBase, String login , String password , String msg ) {
        if ( next == null) return true;
        return next.check(dataBase, login , password , msg );
    }

    public abstract boolean check(DataBase dataBase, String login, String password, String msg);









}
