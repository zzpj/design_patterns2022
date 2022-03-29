package pl.p.lodz.zzpj.prototype;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgreementTest {

    @Test
    public void prototypeSalePurchaseTest() {
        SalePurchaseAgreement  prototype = new SalePurchaseAgreement();
        prototype.setTitle("Umowa sprzedaży");
        prototype.setDate(new Date(1999, 12, 29));
        prototype.setNameSalePurchaseItem("Rower");

        SalePurchaseAgreement newAgreement = (SalePurchaseAgreement) prototype.clone();


        assertEquals(newAgreement.getTitle(), prototype.getTitle());
        assertEquals(newAgreement.getDate(), prototype.getDate());
        assertEquals(newAgreement.getNameSalePurchaseItem(), prototype.getNameSalePurchaseItem());
    }

    @Test
    public void prototypeEmploymentAgreement() {
        EmploymentAgreement  prototype = new EmploymentAgreement();
        prototype.setTitle("Umowa o prace");
        prototype.setDate(new Date(1999, 12, 29));
        prototype.setEmployee("Arnold Hirosz");
        prototype.setEmployer("SAMATAKA");

        EmploymentAgreement newAgreement = (EmploymentAgreement) prototype.clone();


        assertEquals(newAgreement.getTitle(), prototype.getTitle());
        assertEquals(newAgreement.getDate(), prototype.getDate());
        assertEquals(newAgreement.getEmployee(), prototype.getEmployee());
        assertEquals(newAgreement.getEmployer(), prototype.getEmployer());
    }
}
