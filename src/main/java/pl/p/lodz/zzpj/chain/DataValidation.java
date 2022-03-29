package pl.p.lodz.zzpj.chain;

public class DataValidation implements UserDataHandler {

    private UserDataHandler next;
    private final User user;
    private final String data;

    public DataValidation(User user, String data) {
        this.user = user;
        this.data = data;
    }

    @Override
    public void setNext(UserDataHandler handler) {
        next = handler;
    }

    @Override
    public void handle() {
        System.out.println("Walidacja danych...");
        if (data.contains("not valid")) {
            throw new IllegalArgumentException("Wrong data passed");
        }
        if (next != null) {
            next.handle();
        }
    }
}
