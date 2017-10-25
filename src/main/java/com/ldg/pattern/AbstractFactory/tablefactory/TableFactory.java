package com.ldg.pattern.AbstractFactory.tablefactory;

import com.ldg.pattern.AbstractFactory.factory.Factory;
import com.ldg.pattern.AbstractFactory.factory.Link;
import com.ldg.pattern.AbstractFactory.factory.Page;
import com.ldg.pattern.AbstractFactory.factory.Tray;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 6
 */
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
