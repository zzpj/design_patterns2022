package pl.p.lodz.zzpj.prototype;

public class InternshipContract extends Agreement{
    public InternshipContract(Agreement agreement) {
        super(agreement);
    }

    public InternshipContract() {
    }

    @Override
    public Agreement clone() {
        return new InternshipContract(this);
    }
}
