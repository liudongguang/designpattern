package com.ldg.pattern.AbstractFactory.factory;



import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 4
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected List<? super Item> content=new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public  void add(Item item){
        content.add(item);
    }
    public void output(){
        String filename=title+".html";
        try {
            Writer writer=new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println("filename"+"编写完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public abstract String makeHTML();
}
