package pl.p.lodz.zzpj.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggingTest {

    @Test
    public void FacebookLoggingTest() {
        FacebookLogger facebookLogger = new FacebookLogger();
        assertEquals(facebookLogger.logIn("Bajo", "Jajo"), "Błędne dane do konta Facebook");
        assertEquals(facebookLogger.logIn("Bajo", "JajoJajo"), "Logowanie w systemie Facebook przebiegło pomyślnie");
    }

    @Test
    public void TwitterLoggingTest() {
        TwitterLogger twitterLogger = new TwitterLogger();
        assertEquals(twitterLogger.logIn("Bajo", "Jajo"), "Błędne dane do konta Twitter");
        assertEquals(twitterLogger.logIn("Bajo", "JajoJajoo"), "Logowanie w systemie Twitter przebiegło pomyślnie");
    }

    @Test
    public void GmailLoggingTest() {
        GmailLogger gmailLogger = new GmailLogger();
        assertEquals(gmailLogger.logIn("Bajo", "Jajo"), "Błędne dane do konta Gmail");
        assertEquals(gmailLogger.logIn("Bajo", "JajoJajooo"), "Logowanie w systemie Gmail przebiegło pomyślnie");
    }
}
