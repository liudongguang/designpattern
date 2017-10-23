package com.ldg.pattern.factorymethod.api;

/**
 * Created by LiuDongguang on 2017/10/23.
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p=createProduct(owner);
        registProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registProduct(Product product);
}
