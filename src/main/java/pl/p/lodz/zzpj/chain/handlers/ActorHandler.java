package pl.p.lodz.zzpj.chain.handlers;

import pl.p.lodz.zzpj.chain.model.Actor;
import pl.p.lodz.zzpj.chain.model.DataBase;

public class ActorHandler extends Handler{
    @Override
    public boolean check(DataBase dataBase, String login, String password, String msg) {
        Actor actor = dataBase.getActor(login);
        if(actor != null) return checkNext(dataBase,login,password,msg);
        return false;
    }
}
