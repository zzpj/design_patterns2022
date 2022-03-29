package pl.p.lodz.zzpj.observer.manager;

import pl.p.lodz.zzpj.observer.listeners.EventListener;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<EventListener> listeners = new ArrayList<>();

    public EventManager() {
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String newInfo) {
        for (EventListener listener : listeners) {
            listener.update(newInfo);
        }
    }
}
