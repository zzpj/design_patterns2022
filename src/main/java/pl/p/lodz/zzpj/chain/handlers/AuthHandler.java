package pl.p.lodz.zzpj.chain.handlers;

import pl.p.lodz.zzpj.chain.model.DataBase;

public class AuthHandler extends Handler{

    @Override
    public boolean check(DataBase dataBase, String login, String password, String msg) {
        boolean present = dataBase.authorization(login,password);
        if(present) return checkNext(dataBase, login, password,msg);
        return false;
    }
}
