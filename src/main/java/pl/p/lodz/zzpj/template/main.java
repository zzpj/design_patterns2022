package pl.p.lodz.zzpj.template;

public class main {
    public static void main(String[] args) {

        LogIn logInF = new LogInFacebook();
        logInF.signIn();

        LogIn logInT = new LogInTwitter();
        logInT.signIn();

        LogIn logInG = new LogInGoogle();
        logInG.signIn();
    }
}