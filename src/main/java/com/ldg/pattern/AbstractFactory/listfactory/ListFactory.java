package com.ldg.pattern.AbstractFactory.listfactory;

import com.ldg.pattern.AbstractFactory.factory.Factory;
import com.ldg.pattern.AbstractFactory.factory.Link;
import com.ldg.pattern.AbstractFactory.factory.Page;
import com.ldg.pattern.AbstractFactory.factory.Tray;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 6
 */
public class ListFactory extends Factory{

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
