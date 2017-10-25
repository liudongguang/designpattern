package com.ldg.pattern.AbstractFactory.listfactory;

import com.ldg.pattern.AbstractFactory.factory.Item;
import com.ldg.pattern.AbstractFactory.factory.Tray;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder=new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n").append("<ul>\n");
        tray.forEach(item->{
            //item为Object，需要强转
            builder.append(((Item) item).makeHTML());
        });
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
