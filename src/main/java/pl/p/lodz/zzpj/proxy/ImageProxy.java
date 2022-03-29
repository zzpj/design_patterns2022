package pl.p.lodz.zzpj.proxy;

public class ImageProxy implements Image{
    private static Image image;
    @Override
    public void calculate() {
        if (image == null){
            image = new ImageCostly();
        }
        image.calculate();
    }
}
