package pl.p.lodz.zzpj.observer.listeners;

public class PolsatNews implements EventListener {
    public PolsatNews() {
    }

    @Override
    public void update(String newInfo) {
        System.out.println("Pasek Polsata: " + newInfo);
    }
}
