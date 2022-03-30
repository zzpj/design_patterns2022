package pl.p.lodz.zzpj.template;

public class LogInWithTwitter extends LogIn{
    @Override
    public boolean authenticate() {
        return true;
    }

    @Override
    public void authorize() {

    }
}
