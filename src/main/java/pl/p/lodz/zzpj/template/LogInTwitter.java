package pl.p.lodz.zzpj.template;

public class LogInTwitter extends LogIn{
    @Override
    boolean authorize(String login, String password) {
        boolean loginFound = false ;
        boolean passwordCorrect = false; // mocks

        if(loginFound && passwordCorrect) {
            System.out.println("Authentication with Twitter accepted! :) ");
            return true;
        }
        else {
            System.out.println("Authentication with Twitter denied! :( ");
            return false;
        }
    }
}
