package pl.p.lodz.zzpj.template;

public abstract class Login {

    public void login() {
        if(!checkIfSessionValid("")) {
            String token = getAuthToken();
            if (!HelperMethods.userExists(token)) {
                HelperMethods.saveUser(token);
            }
            saveLoginSession();
            }
        }
    public boolean checkIfSessionValid(String user) {
        return true;
    }
    public abstract String getAuthToken();

    public void saveLoginSession() {

    }
}
