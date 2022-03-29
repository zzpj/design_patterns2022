package pl.p.lodz.zzpj.observer;

import java.util.Observable;
import java.util.Observer;

public class StationNews implements Observer {
    private String news;

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    @Override
    public void update(Observable observable, Object news) {
        this.setNews((String) news);
    }

}
