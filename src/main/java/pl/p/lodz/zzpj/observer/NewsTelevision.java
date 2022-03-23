package pl.p.lodz.zzpj.observer;

import lombok.Getter;
import lombok.Setter;

public class NewsTelevision {
    @Getter @Setter private String newsBar;

    public void observe(String freshNews) {
        this.setNewsBar(freshNews);
    }
}
