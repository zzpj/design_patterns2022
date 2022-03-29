package pl.p.lodz.zzpj.chain;

public interface UserDataHandler {
    void setNext(UserDataHandler handler);
    void handle();
}
