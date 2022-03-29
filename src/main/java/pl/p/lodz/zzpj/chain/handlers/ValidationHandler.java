package pl.p.lodz.zzpj.chain.handlers;

import pl.p.lodz.zzpj.chain.model.DataBase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationHandler extends Handler{


    @Override
    public boolean check(DataBase dataBase, String login, String password, String msg) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(msg);
        if (matcher.find()) return checkNext(dataBase, login, password,msg);
        return false;
    }
}
