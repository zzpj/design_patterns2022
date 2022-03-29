package pl.p.lodz.zzpj.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NationalNewsAgencyTest {

    String news = "Proszem pana mówi Hymel Jadwiga, Lipinki Łużyckie, Łączna 43. Łączna tutaj jak sie wjeżdza, zaraz\n" +
            "koło poczty objazd TUTAJ. ZGŁASZAM. Wybuch, styrte ktoś nam podpalił styrte.";

    @Test
    public void televisionObservingTest() {
        NationalNewsAgency polskaAgencjaPrasowa = new NationalNewsAgency();
        NewsTelevision tvp = new NewsTelevision();
        NewsTelevision tvn24 = new NewsTelevision();

        polskaAgencjaPrasowa.addTelevision(tvp);
        polskaAgencjaPrasowa.addTelevision(tvn24);

        polskaAgencjaPrasowa.setNews(news);
        assertEquals(tvp.getNewsBar(), news);
        assertEquals(tvn24.getNewsBar(), news);
    }
}
