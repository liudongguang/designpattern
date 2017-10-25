package com.ldg.pattern.builder;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 1.
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
