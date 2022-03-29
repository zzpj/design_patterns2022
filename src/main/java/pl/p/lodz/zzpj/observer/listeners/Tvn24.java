package pl.p.lodz.zzpj.observer.listeners;

public class Tvn24 implements EventListener {
    public Tvn24() {
    }

    @Override
    public void update(String newInfo) {
        System.out.println("Pasek TVN24: " + newInfo);
    }
}
