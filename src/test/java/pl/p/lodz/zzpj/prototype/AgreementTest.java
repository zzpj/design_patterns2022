package pl.p.lodz.zzpj.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgreementTest {

    @Test
    public void shouldCopyAgreement() {
        Agreement baseAgreement = new Agreement();
        baseAgreement.setTypeOfAgreement("Umowa kupna sprzedaży");
        baseAgreement.setAgreementContent("Sprzedaje samochód. Jeździ.");
        Agreement agreement1 = baseAgreement.copy();
        agreement1.setFirstName("Andrzej");
        agreement1.setLastName("Duda");
        agreement1.setDate("29.03.2022");
        Agreement agreement2 = baseAgreement.copy();
        agreement2.setFirstName("Karol");
        agreement2.setLastName("Wojtyła");
        agreement2.setDate("28.03.2022");
        assertEquals(agreement1.getAgreementContent(), "Sprzedaje samochód. Jeździ.");
        assertEquals(agreement1.getFirstName(), "Andrzej");
        assertEquals(agreement2.getAgreementContent(), "Sprzedaje samochód. Jeździ.");
        assertEquals(agreement2.getFirstName(), "Karol");
    }
}
