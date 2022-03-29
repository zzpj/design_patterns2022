package pl.p.lodz.zzpj.proxy;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Image implements pl.p.lodz.zzpj.proxy.Imageable {
    private String filename, author, extension;
    private int length, height;
    private Long size;
    private int[] colors;
    private String tag, creationDate, editDate;

    private Map<String, Object> info;

    public Image(String filename, String author, String extension, int length, int height, Long size, int[] colors, String tag, String creationDate, String editDate) {
        this.filename = filename;
        this.author = author;
        this.extension = extension;
        this.length = length;
        this.height = height;
        this.size = size;
        this.colors = colors;
        this.tag = tag;
        this.creationDate = creationDate;
        this.editDate = editDate;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    void initInfo() throws IllegalAccessException {
        System.out.println("preparing info " + this.filename);

        info = new HashMap<>();

        Field[] declaredFields =  this.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            info.put(declaredField.getName(), declaredField.get(this));
        }
    }

    @Override
    public Map<String, Object> getImageInfo() {
        if (info == null)
            return Collections.emptyMap();

        return getInfo();
    }
}
