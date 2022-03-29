package pl.p.lodz.zzpj.chain;

import java.util.Objects;

public class UserDataAuthentication implements UserDataHandler {

    private UserDataHandler next;
    private final User user;
    private final String data;


    public UserDataAuthentication(User user, String data) {
        this.user = user;
        this.data = data;
    }

    @Override
    public void setNext(UserDataHandler handler) {
        next = handler;
    }

    @Override
    public void handle() {
        System.out.println("Autentykacja użytkownika...");
        if (!user.getUsername().equals("john")) {
            throw new IllegalArgumentException("Wrong user name");
        }
        if (next != null) {
            next.handle();
        }
    }
}
