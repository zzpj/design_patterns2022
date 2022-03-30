package pl.p.lodz.zzpj.observer;

import java.util.ArrayList;
import java.util.List;

public class PolishPressAgency {
    private List<Event> events = new ArrayList<>();
    private List<EventListener> eventListeners = new ArrayList<>();

    public PolishPressAgency() {
    }

    public void addEvent(String subject) {
        Event event = new Event(subject);
        events.add(event);
        notify(event.getSubject());
    }

    private void notify(String event) {
        eventListeners.forEach(eventListener -> eventListener.update(event));
    }

    public void addObserver(EventListener listener) {
        eventListeners.add(listener);
    }

}
