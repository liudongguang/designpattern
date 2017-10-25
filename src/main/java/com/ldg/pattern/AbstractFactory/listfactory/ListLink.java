package com.ldg.pattern.AbstractFactory.listfactory;

import com.ldg.pattern.AbstractFactory.factory.Link;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 7
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        StringBuilder rt=new StringBuilder();
        return rt.append("<li><a href=\"").append(url).append("\">").append(caption).append("</a></li>\n").toString();
    }
}
