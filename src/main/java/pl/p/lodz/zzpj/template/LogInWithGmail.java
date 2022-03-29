package pl.p.lodz.zzpj.template;

public class LogInWithGmail extends LogIn{
    @Override
    public boolean authenticate() {
        return false; //because why not?
    }

    @Override
    public void authorize() {
        //some stuff
    }
}
