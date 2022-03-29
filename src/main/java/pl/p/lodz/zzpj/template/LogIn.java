package pl.p.lodz.zzpj.template;

public abstract class LogIn {
    String login;
    String password;

 abstract boolean authorize(String login , String password);

 public void signIn() {
    if (authorize (login , password)){
        System.out.println("Authorized!");
    }
    else System.out.println("Not authorized!");
 }
}
