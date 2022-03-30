package pl.p.lodz.zzpj.template;

public class LogInWithFacebook extends LogIn{

    @Override
    public boolean authenticate() {
        //logging in with facebook
        return true;
    }

    @Override
    public void authorize() {
        //authorization
    }
}
