package pl.p.lodz.zzpj.proxy;

public class ProxyTrial {
    public static void main(String[] args) {
        Image image1 = new Image("bad", "Flack", ".jpg", 101, 123, 102L, null, "family", "10.01.2021", "01.02.2022");
        Image image2 = new Image("good", "Flack", ".png", 52, 12, 104L, null, "family", "02.02.2022", "02.02.2022");

        Imageable image1Proxy = new ProxyImage(image1);
        Imageable image2Proxy = new ProxyImage(image2);

        image1Proxy.getImageInfo();
        image2Proxy.getImageInfo();
        image1Proxy.getImageInfo();
        image2Proxy.getImageInfo();
        image1Proxy.getImageInfo();
        image2Proxy.getImageInfo();
    }
}
