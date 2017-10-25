package com.ldg.pattern.AbstractFactory.tablefactory;

import com.ldg.pattern.AbstractFactory.factory.Item;
import com.ldg.pattern.AbstractFactory.factory.Page;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class TablePage extends Page{
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("<html><head><title>").append(title).append("</title></head>\n<body>\n");
        stringBuilder.append("<h1>").append(title).append("</h1>\n");
        stringBuilder.append("<table width=\"80%\" border=\"3\">\n");
        content.forEach(item->{
            stringBuilder.append("<tr>").append(((Item)item).makeHTML()).append("</tr>");
        });
        stringBuilder.append("</table>\n");
        stringBuilder.append("<hr><address>").append(author).append("</address>");
        stringBuilder.append("</body></html>\n");
        return stringBuilder.toString();
    }
}
