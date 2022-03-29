package pl.p.lodz.zzpj.chain.model;

public class User {
    String login;
    String password;
    Actor actor;

    public User(String login, String password, Actor actor) {
        this.login = login;
        this.password = password;
        this.actor = actor;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Actor getActor() {
        return actor;
    }
}
