package pl.p.lodz.zzpj.observer;

import pl.p.lodz.zzpj.observer.listeners.PolsatNews;
import pl.p.lodz.zzpj.observer.listeners.Tvn24;
import pl.p.lodz.zzpj.observer.listeners.TvpInfo;
import pl.p.lodz.zzpj.observer.publisher.Newspaper;

public class ObserverMainDemo {
    public static void main(String[] args) {
        Newspaper editor = new Newspaper();
        TvpInfo tvp = new TvpInfo();
        Tvn24 tvn24 = new Tvn24();
        PolsatNews polsatNews = new PolsatNews();

        editor.events.subscribe(tvn24);
        editor.events.subscribe(polsatNews);

        try {
            editor.publishNews("Polska zagra ze Szwecja w finale barazy!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        editor.events.subscribe(tvp);
        System.out.println();

        try {
            editor.publishNews("Polska zakwalifikowala sie na mundial!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        editor.events.unsubscribe(tvp);
        editor.events.unsubscribe(polsatNews);
        System.out.println();

        try {
            editor.publishNews("Z kim zagramy na mundialu?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
