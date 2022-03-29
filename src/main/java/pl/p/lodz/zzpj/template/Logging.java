package pl.p.lodz.zzpj.template;

public abstract class Logging {
    abstract protected boolean validate(String login, String password);
    abstract protected String loggingFeedback(boolean validation);

    public String logIn(String login, String password) {
        return loggingFeedback(validate(login, password));
    }
}
