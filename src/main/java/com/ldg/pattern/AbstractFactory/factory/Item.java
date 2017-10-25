package com.ldg.pattern.AbstractFactory.factory;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 1 抽象的零件
 */
public abstract class Item {
    protected String caption;//标题

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
