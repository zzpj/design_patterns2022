package pl.p.lodz.zzpj.chain;

public class Authorize extends BaseChainHandler{


    @Override
    public void handle(User user) {

        if (user.isAdmin())
            super.handle(user);
        else
            System.out.println("Admin permission is necessary");
    }
}
