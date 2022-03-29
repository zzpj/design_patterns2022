package pl.p.lodz.zzpj.observer;

import lombok.Getter;
import lombok.Setter;

public class NewsTelevision implements NewsObserver{
    @Getter @Setter private String newsBar;

    @Override
    public void observe(String freshNews) {
        this.setNewsBar(freshNews);
    }
}
