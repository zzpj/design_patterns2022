package pl.p.lodz.zzpj.proxy;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Image implements Imageable{

    private String filename;
    private String author;
    private Long size;

    private Map<String, Object> info;

    public Image(String filename, String author, Long size) {
        this.filename = filename;
        this.author = author;
        this.size = size;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    void initInfo() throws IllegalAccessException {
        info = new HashMap<>();
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            info.put(declaredField.getName(), declaredField.get(this));
        }
    }

    @Override
    public Map<String, Object> getImageInfo() {

        if(info == null) {
            return Collections.emptyMap();
        }
        return info;
    }
}
