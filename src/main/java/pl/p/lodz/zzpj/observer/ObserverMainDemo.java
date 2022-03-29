package pl.p.lodz.zzpj.observer;

import pl.p.lodz.zzpj.observer.listeners.PolsatNews;
import pl.p.lodz.zzpj.observer.listeners.Tvn24;
import pl.p.lodz.zzpj.observer.listeners.TvpInfo;
import pl.p.lodz.zzpj.observer.publisher.Newspaper;

public class ObserverMainDemo {
    public static void main(String[] args) {
        Newspaper editor = new Newspaper();
        editor.events.subscribe(new Tvn24());
        editor.events.subscribe(new PolsatNews());

        try {
            editor.publishNews("Polska zagra ze Szwecja w finale barazy!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        editor.events.subscribe(new TvpInfo());
        System.out.println();
        try {
            editor.publishNews("Polska zakwalifikowala sie na mundial!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
