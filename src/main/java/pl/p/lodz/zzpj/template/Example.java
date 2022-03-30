package pl.p.lodz.zzpj.template;

public class Example {

    public Example() {

        LogIn logIn = new LogInWithGmail();

        logIn.logIn();

        logIn = new LogInWithFacebook();

        logIn.logIn();
    }
}
