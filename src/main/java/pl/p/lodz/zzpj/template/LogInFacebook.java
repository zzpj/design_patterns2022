package pl.p.lodz.zzpj.template;

public class LogInFacebook extends LogIn{

    @Override
    boolean authorize(String login, String password) {
        boolean loginFound = true;
        boolean passwordCorrect = false; // mocks

        if(loginFound && passwordCorrect) {
            System.out.println("Authentication with Facebook accepted! :) ");
            return true;
        }
        else {
            System.out.println("Authentication with Facebook denied! :( ");
            return false;
        }
    }
}
