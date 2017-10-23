package com.ldg.pattern.factorymethod.impl;

import com.ldg.pattern.factorymethod.api.Product;

/**
 * Created by LiuDongguang on 2017/10/23.
 */
public class IDCard extends Product {
    private String owner;

    //使之只能本包调用
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用：" + owner + "的ID卡。");
    }

    @Override
    public String getOwner() {
        return owner;
    }
}
