package pl.p.lodz.zzpj.observer;

import java.util.List;
import java.util.Vector;

public class NationalNewsAgency {
    private String news;
    private List<NewsObserver> televisions = new Vector<NewsObserver>();

    public void addTelevision(NewsTelevision television) {
        this.televisions.add(television);
    }

    public void setNews(String freshNews) {
        news = freshNews;
        for (int i = 0; i < televisions.size(); i++) {
            televisions.get(i).observe(news);
        }
    }
}
