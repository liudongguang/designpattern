package com.ldg.pattern.adapter.lianxi;

import java.io.FileNotFoundException;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public interface FileIO {
    void readFromFile(String filename) throws Exception;

    void writeToFile(String filename) throws Exception;

    void setValue(String key, String value);

    String getValue(String key);
}
