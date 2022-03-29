package pl.p.lodz.zzpj;

import pl.p.lodz.zzpj.builder.Value;
import pl.p.lodz.zzpj.observer.StationCompany;
import pl.p.lodz.zzpj.observer.StationNews;
import pl.p.lodz.zzpj.proxy.Image;
import pl.p.lodz.zzpj.proxy.ImageProxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class App {
    public static void main(String args[]) {
        Value value = new Value.ValueBuilder("cd","xd").value3(3).value4("cos").build();
        Value value2 = new Value.ValueBuilder("cd1","xd1").value3(4).build();
        System.out.printf(value.getValue() + value.getValue2() + value.getValue3() + value.getValue4()+"\n");
        System.out.printf(value2.getValue()+ value2.getValue2()+ value2.getValue3()+ value2.getValue4()+"\n");
        Image image = new ImageProxy();
        image.calculate();
        image.calculate();
        StationCompany observable = new StationCompany();
        StationNews observer = new StationNews();
        observable.addObserver(observer);
        observable.setInfo("info");
        assertEquals(observer.getNews(), "info");

    }
}

