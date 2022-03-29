package pl.p.lodz.zzpj.template;

public class TwitterLogger extends Logging{
    @Override
    protected boolean validate(String login, String password) {
        if (password.length() > 8) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected String loggingFeedback(boolean validation) {
        if (validation) {
            return "Logowanie w systemie Twitter przebiegło pomyślnie";
        } else {
            return "Błędne dane do konta Twitter";
        }
    }
}
