package com.ldg.pattern.AbstractFactory.tablefactory;

import com.ldg.pattern.AbstractFactory.factory.Item;
import com.ldg.pattern.AbstractFactory.factory.Tray;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder=new StringBuilder();
        builder.append("<td>");
        builder.append("<table width=\"100%\" border=\"1\"><tr>");
        builder.append("<td bgcolor=\"#cccccc\" align=\"center\" ").append("caospan=\"").append(tray.size()).append("\">");
        builder.append("<b>").append(caption).append("</b></td></tr>");
        builder.append("<tr>");
        tray.forEach(item->{
            //item为Object，需要强转
            builder.append(((Item) item).makeHTML());
        });
        builder.append("</tr></table>\n");
        builder.append("</td>\n");
        return builder.toString();
    }
}
