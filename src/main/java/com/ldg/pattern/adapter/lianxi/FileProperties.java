package com.ldg.pattern.adapter.lianxi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws Exception {
        properties.load(this.getClass().getClassLoader().getResourceAsStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws Exception {
        properties.store(new FileOutputStream(new File(filename)), "写入属性集合");
    }

    @Override
    public void setValue(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.get(key).toString();
    }
}
