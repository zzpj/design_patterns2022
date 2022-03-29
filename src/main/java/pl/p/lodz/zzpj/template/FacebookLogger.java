package pl.p.lodz.zzpj.template;

public class FacebookLogger extends Logging{
    @Override
    protected boolean validate(String login, String password) {
        if (password.length() > 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected String loggingFeedback(boolean validation) {
        if (validation) {
            return "Logowanie w systemie Facebook przebiegło pomyślnie";
        } else {
            return "Błędne dane do konta Facebook";
        }
    }
}
