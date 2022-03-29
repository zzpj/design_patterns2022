package pl.p.lodz.zzpj.prototype;

import java.util.Date;

public abstract class AgreementPrototype implements Cloneable{
    protected Date date;
    protected String title;

    public AgreementPrototype(){}

    public AgreementPrototype(AgreementPrototype target) {
        if ( target != null) {
            this.date = target.getDate();
            this.title = target.getTitle();
        }
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
