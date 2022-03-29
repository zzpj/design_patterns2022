package pl.p.lodz.zzpj.observer.publisher;

import pl.p.lodz.zzpj.observer.manager.EventManager;

public class Newspaper {
    public EventManager events;
    private String newInformation;

    public Newspaper() {
        this.events = new EventManager();
    }

    public void publishNews(String info) {
        this.newInformation = info;
        events.notify(newInformation);
    }
}
