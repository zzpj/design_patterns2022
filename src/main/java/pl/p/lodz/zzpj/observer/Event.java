package pl.p.lodz.zzpj.observer;

public class Event {
    private String subject;

    public Event(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
