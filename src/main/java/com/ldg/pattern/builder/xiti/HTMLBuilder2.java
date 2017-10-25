package com.ldg.pattern.builder.xiti;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class HTMLBuilder2 extends Builder {
    private String filename;
    private PrintWriter writer;
    @Override
    protected void buildTitle(String title) {
        filename=title+".html";
        try {
            writer=new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><tilte>"+title+"</title></head><body>");
        //输出标题
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    protected void buildString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    protected void buildItems(String[] items) {
        writer.println("<ul>");
        Arrays.stream(items).forEach(item->{
            writer.println("<li>"+item+"</li>");
        });
        writer.println("</ul>");
    }

    @Override
    protected void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }
    public String getResult(){
        return filename;
    }
}
