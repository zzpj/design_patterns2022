package pl.p.lodz.zzpj.chain;

public class User {

    private String username;
    private String password;
    private boolean isAdmin;
    private String data;

    public User(String username, String password, boolean isAdmin, String data) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
