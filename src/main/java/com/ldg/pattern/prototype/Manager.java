package com.ldg.pattern.prototype;

import java.util.HashMap;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 2
 */
public class Manager {
    private HashMap<String,Product> showcase=new HashMap<>();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String protoname){
        Product p=showcase.get(protoname);
        return p.createClone();
    }
}
