package pl.p.lodz.zzpj.prototype;

public class Warranty extends Agreement {

    private String warrantedObject;

    public String getWarrantedObject() {
        return warrantedObject;
    }

    public void setWarrantedObject(String warrantedObject) {
        this.warrantedObject = warrantedObject;
    }

    public Warranty() {
    }

    public Warranty(Warranty t) {
        super(t);
        this.warrantedObject = t.warrantedObject;
    }

    @Override
    public Agreement clone() {
        return new Warranty(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", warranted object: '" + warrantedObject + '\'';
    }
}
