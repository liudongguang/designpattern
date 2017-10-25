package com.ldg.pattern.AbstractFactory.listfactory;

import com.ldg.pattern.AbstractFactory.factory.Item;
import com.ldg.pattern.AbstractFactory.factory.Page;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class ListPage extends Page{
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("<html><head><title>").append(title).append("</title></head>\n<body>\n");
        stringBuilder.append("<h1>").append(title).append("</h1>\n");
        stringBuilder.append("<ul>\n");
        content.forEach(item->{
            stringBuilder.append(((Item)item).makeHTML());
        });
        stringBuilder.append("</ul>\n");
        stringBuilder.append("<hr><address>").append(author).append("</address>");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
