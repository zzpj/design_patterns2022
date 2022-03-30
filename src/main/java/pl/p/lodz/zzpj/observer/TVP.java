package pl.p.lodz.zzpj.observer;

public class TVP implements EventListener{
    @Override
    public void update(String information) {
        System.out.println("TVP ticker: " + information);
    }
}
