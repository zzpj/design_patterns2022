package pl.p.lodz.zzpj.observer;

public class TVN24 implements EventListener{
    @Override
    public void update(String information) {
        System.out.println("TVN24 ticker: " + information);
    }
}
