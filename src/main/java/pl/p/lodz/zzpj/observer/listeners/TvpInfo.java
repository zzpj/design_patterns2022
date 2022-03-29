package pl.p.lodz.zzpj.observer.listeners;

public class TvpInfo implements EventListener {
    public TvpInfo() {
    }

    @Override
    public void update(String newsInfo) {
        System.out.println("Pasek TVP Info: " + newsInfo);
    }
}
