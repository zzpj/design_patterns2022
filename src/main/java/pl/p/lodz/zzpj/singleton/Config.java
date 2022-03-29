package pl.p.lodz.zzpj.singleton;

public class Config {
    private static Config config;

    private Config() {
    }

    public static synchronized Config getInstance() {

        if (config == null){
            config = new Config();
        }


        return config;
    }


}