package pl.p.lodz.zzpj.chain;

public class ActorizeUserMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@abcd.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
