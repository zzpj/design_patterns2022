package pl.p.lodz.zzpj.chain;

public interface IChainHandler {

    void handle (User user);
    void setNext(IChainHandler next);
}
