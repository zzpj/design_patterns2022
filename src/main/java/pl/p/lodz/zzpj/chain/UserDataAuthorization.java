package pl.p.lodz.zzpj.chain;

public class UserDataAuthorization implements UserDataHandler {

    private UserDataHandler next;
    private final User user;
    private final String data;

    public UserDataAuthorization(User user, String data) {
        this.user = user;
        this.data = data;
    }

    @Override
    public void setNext(UserDataHandler handler) {
        next = handler;
    }

    @Override
    public void handle() {
        System.out.println("Autoryzacja użytkownika...");
        if (!user.getPassword().equals("qwerty")) {
            throw new IllegalArgumentException("Wrong user password");
        }
        if (next != null) {
            next.handle();
        }
    }
}
