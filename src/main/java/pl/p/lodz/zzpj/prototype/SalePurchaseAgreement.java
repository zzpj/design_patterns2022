package pl.p.lodz.zzpj.prototype;

import java.util.Date;

public class SalePurchaseAgreement extends AgreementPrototype{
    private String nameSalePurchaseItem;


    public SalePurchaseAgreement() {
    }

    public SalePurchaseAgreement(SalePurchaseAgreement target) {
        super(target);
        if(target != null) {
            this.nameSalePurchaseItem = target.getNameSalePurchaseItem();
        }
    }

    @Override
    public AgreementPrototype clone() {
        return  new SalePurchaseAgreement(this);
    }

    public String getNameSalePurchaseItem() {
        return nameSalePurchaseItem;
    }

    public void setNameSalePurchaseItem(String nameSalePurchaseItem) {
        this.nameSalePurchaseItem = nameSalePurchaseItem;
    }
}
