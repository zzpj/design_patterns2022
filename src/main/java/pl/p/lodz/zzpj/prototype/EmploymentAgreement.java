package pl.p.lodz.zzpj.prototype;

public class EmploymentAgreement extends Agreement {

    public EmploymentAgreement(Agreement agreement) {
        super(agreement);
    }

    public EmploymentAgreement() {
    }

    @Override
    public Agreement clone() {
        return new EmploymentAgreement(this);
    }

}
