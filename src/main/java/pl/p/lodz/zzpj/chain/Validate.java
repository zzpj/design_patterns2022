package pl.p.lodz.zzpj.chain;

public class Validate extends BaseChainHandler{

    @Override
    public void handle(User user) {

        if (user.getData().isEmpty())
            System.out.println("Data can not be empty!");
        else
            System.out.println("Everything is fine!");
    }
}
