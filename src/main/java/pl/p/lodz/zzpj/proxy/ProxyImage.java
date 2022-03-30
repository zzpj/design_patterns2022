package pl.p.lodz.zzpj.proxy;

import java.util.Map;

public class ProxyImage implements Imageable{

    private Image image;

    public ProxyImage(Image image) {
        this.image = image;
    }

    @Override
    public Map<String, Object> getImageInfo() {
        if (image.getInfo() == null) {
            try {
                System.out.println("init");
                image.initInfo();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println("" + image.getImageInfo().toString());
        return image.getImageInfo();
    }
}
