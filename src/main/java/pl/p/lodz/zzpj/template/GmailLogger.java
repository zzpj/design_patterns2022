package pl.p.lodz.zzpj.template;

public class GmailLogger extends Logging{
    @Override
    protected boolean validate(String login, String password) {
        if (password.length() > 9) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected String loggingFeedback(boolean validation) {
        if (validation) {
            return "Logowanie w systemie Gmail przebiegło pomyślnie";
        } else {
            return "Błędne dane do konta Gmail";
        }
    }
}
