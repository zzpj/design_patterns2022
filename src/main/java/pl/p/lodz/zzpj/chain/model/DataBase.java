package pl.p.lodz.zzpj.chain.model;

import pl.p.lodz.zzpj.chain.handlers.Handler;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataBase {

    ArrayList<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public boolean authorization(String login, String password) {
        for (User user :
                users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) return true;
        }
        return false;

    }

    public Actor getActor(String login) {
        for (User user :
                users) {
            if (user.getLogin().equals(login)) return user.getActor();
        }
        return null;
    }


}
