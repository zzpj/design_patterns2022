package pl.p.lodz.zzpj.chain;

public class BaseChainHandler implements IChainHandler{

    private IChainHandler next;

    @Override
    public void handle(User user) {

        if (next != null)
            next.handle(user);
    }

    @Override
    public void setNext(IChainHandler next) {
        this.next = next;
    }
}
