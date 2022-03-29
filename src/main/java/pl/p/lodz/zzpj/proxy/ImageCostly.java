package pl.p.lodz.zzpj.proxy;

public class ImageCostly implements Image {
    private String name;
    private int length;
    private int height;
    private String author;
    private String extension;
    private int size;
    private String tags;
    private String creationDate;
    private String modificationDate;

    public ImageCostly() {
        calculateValues();
    }

    @Override
    public void calculate() {
        System.out.printf("calculating\n");
    }

    private void calculateValues(){
        this.name = "cos";
        this.length = 10;
        this.height = 20;
        this.author = "ccc";
        this.extension = "png";
        this.size = 500;
        this.tags = "cos, cos, cos";
        this.creationDate = "2200/08/22";
        this.modificationDate = "2220/0/8/22";
        System.out.printf("heavy calculating\n");
    }
}
