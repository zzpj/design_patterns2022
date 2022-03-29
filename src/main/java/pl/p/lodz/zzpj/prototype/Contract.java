package pl.p.lodz.zzpj.prototype;

public class Contract extends Agreement {

    public String getContractObject() {
        return contractObject;
    }

    public void setContractObject(String contractObject) {
        this.contractObject = contractObject;
    }

    private String contractObject;

    public Contract() {
    }

    public Contract(Contract t) {
        super(t);
        this.contractObject = t.contractObject;
    }

    @Override
    public Agreement clone() {
        return new Contract(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", contract object: '" + contractObject + '\'';
    }
}
