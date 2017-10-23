package com.ldg.pattern.factorymethod.impl;

import com.ldg.pattern.factorymethod.api.Factory;
import com.ldg.pattern.factorymethod.api.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/23.
 */
public class IDCardFactory extends Factory{
    private List<String> owners=new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registProduct(Product product) {
        owners.add(product.getOwner());
    }
    public List<String> getOwners(){
        return owners;
    }
}
