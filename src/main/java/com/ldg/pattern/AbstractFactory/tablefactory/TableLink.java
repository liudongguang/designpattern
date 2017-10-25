package com.ldg.pattern.AbstractFactory.tablefactory;

import com.ldg.pattern.AbstractFactory.factory.Link;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 7
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        StringBuilder rt=new StringBuilder();
        return rt.append("<td><a href=\"").append(url).append("\">").append(caption).append("</a></td>\n").toString();
    }
}
