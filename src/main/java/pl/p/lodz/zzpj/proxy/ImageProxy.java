package pl.p.lodz.zzpj.proxy;

import java.util.Map;

public class ImageProxy implements Imageable{

    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    @Override
    public Map<String, Object> getImageInfo() {
        if (image.getInfo() == null) {
            try {
                image.initInfo();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return image.getImageInfo();
    }
}
