package pl.p.lodz.zzpj.template;

public abstract class LogIn {

    public void logIn(){

        if (authenticate()){

            System.out.println("authentication successful");

            authorize();
        }

    }

    public abstract boolean authenticate();
    public abstract void authorize();
}
