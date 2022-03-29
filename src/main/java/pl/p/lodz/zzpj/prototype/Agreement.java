package pl.p.lodz.zzpj.prototype;

import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class Agreement implements Cloneable{
    private String typeOfAgreement;
    private String firstName;
    private String lastName;
    private String date;
    private String agreementContent;

    public Agreement() {
    };

    private Agreement(Agreement agreement) {
        this.typeOfAgreement = agreement.typeOfAgreement;
        this.firstName = agreement.firstName;
        this.lastName = agreement.lastName;
        this.date = agreement.date;
        this.agreementContent = agreement.agreementContent;
    }

    @Override
    public String toString() {
        return typeOfAgreement + '\n' +
                "FirstName: " + firstName + '\n' +
                "LastName: " + lastName + '\n' +
                agreementContent + "\n" +
                firstName + " " + lastName + " " + date + '\n';
    }

    protected Agreement copy() {
        return new Agreement(this);
    }
}
