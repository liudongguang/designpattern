package com.ldg.pattern.AbstractFactory.factory;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 2抽象零件
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
