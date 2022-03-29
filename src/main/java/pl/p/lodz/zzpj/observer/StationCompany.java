package pl.p.lodz.zzpj.observer;

import java.util.Observable;

public class StationCompany extends Observable {
    private String info;


    public void setInfo(String info){
        this.info = info;
        setChanged();
        notifyObservers(info);

    }
}
