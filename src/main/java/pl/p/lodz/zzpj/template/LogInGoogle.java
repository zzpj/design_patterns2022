package pl.p.lodz.zzpj.template;

public class LogInGoogle extends LogIn{
    @Override
    boolean authorize(String login, String password) {
        boolean loginFound = true;
        boolean passwordCorrect = true; // mocks

        if(loginFound && passwordCorrect) {
            System.out.println("Authentication with Google accepted! :) ");
            return true;
        }
        else {
            System.out.println("Authentication with Google denied! :( ");
            return false;
        }
    }
}
