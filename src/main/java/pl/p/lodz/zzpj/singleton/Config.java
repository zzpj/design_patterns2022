package pl.p.lodz.zzpj.singleton;

public class Config {

    private static volatile Config config;

    private Config() {
    }

    public static synchronized Config getInstance() {
        if (config != null) {
            return config;
        }
        synchronized (Config.class) {
            if (config == null) {
                config = new Config();
            }
        }
        return config;
    }

}