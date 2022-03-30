package pl.p.lodz.zzpj.prototype;

public class B2BAgreement extends Agreement {
    public B2BAgreement() {
    }

    public B2BAgreement(Agreement agreement) {
        super(agreement);
    }

    @Override
    public Agreement clone() {
        return new B2BAgreement(this);
    }
}
