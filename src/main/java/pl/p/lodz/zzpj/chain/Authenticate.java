package pl.p.lodz.zzpj.chain;

public class Authenticate extends BaseChainHandler{


    @Override
    public void handle(User user) {

        if (user.getUsername().equals("test") && user.getPassword().equals("test"))
            super.handle(user);
        else
            System.out.println("no authentication");
    }
}
