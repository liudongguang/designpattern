package com.ldg.pattern;

import com.ldg.pattern.adapter.classadapter.Print;
import com.ldg.pattern.adapter.classadapter.PrintBanner;
import com.ldg.pattern.adapter.lianxi.FileIO;
import com.ldg.pattern.adapter.lianxi.FileProperties;
import com.ldg.pattern.builder.Builder;
import com.ldg.pattern.builder.Director;
import com.ldg.pattern.builder.HTMLBuilder;
import com.ldg.pattern.builder.TextBuilder;
import com.ldg.pattern.factorymethod.api.Factory;
import com.ldg.pattern.factorymethod.api.Product;
import com.ldg.pattern.factorymethod.impl.IDCardFactory;
import com.ldg.pattern.iterator.api.Iterator;
import com.ldg.pattern.iterator.impl.Book;
import com.ldg.pattern.iterator.impl.BookShelf;
import com.ldg.pattern.prototype.Manager;
import com.ldg.pattern.prototype.MessageBox;
import com.ldg.pattern.prototype.UnderlinePen;
import com.ldg.pattern.singleton.Singleton;
import com.ldg.pattern.templatemethod.AbstractDisplay;
import com.ldg.pattern.templatemethod.CharDisplay;
import com.ldg.pattern.templatemethod.StringDisplay;
import org.junit.Test;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class PatternTest {
    /**
     * 1.Iterator迭代器模式
     */
    @Test
    public void testIterator() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("计算机科学与技术"));
        bookShelf.appendBook(new Book("C#"));
        bookShelf.appendBook(new Book("C++"));
        Iterator itr = bookShelf.iterator();
        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book);
        }
    }

    /**
     * 2.适配器模式
     */
    @Test
    public void testAdapter() {
        //继承的方式
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
        //////
        com.ldg.pattern.adapter.objadapter.Print p2 = new com.ldg.pattern.adapter.objadapter.PrintBanner("Hello");
        p2.printWeak();
        p2.printStrong();
    }

    @Test
    public void testAdapterLianxi() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            System.out.println(fileIO.getValue("year"));
            fileIO.setValue("year", "2017");
            fileIO.setValue("month", "10");
            fileIO.setValue("day", "20");
            fileIO.setValue("time", "12");
            fileIO.writeToFile("newfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 3.模版方法模式
     */
    @Test
    public void testTemplateMethod() {
        AbstractDisplay abstractDisplay1 = new CharDisplay('H');
        AbstractDisplay abstractDisplay2 = new StringDisplay("Hello,world");
        AbstractDisplay abstractDisplay3 = new StringDisplay("你好世界！");
        abstractDisplay1.display();
        abstractDisplay2.display();
        abstractDisplay3.display();
    }
    /**
     * 4.工厂方法模式
     */
    @Test
    public void testFactoryMethod() {
        Factory factory=new IDCardFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小红");
        Product card3=factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory)factory).getOwners());
    }
    /**
     * 5.Singleton 模式
     */
    @Test
    public void testSingleton() {
       Singleton s1=Singleton.getInstance();
       Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
    /**
     * 6.prototype 模式
     */
    @Test
    public void testPrototype() {
        //准备
        Manager manager=new Manager();
        UnderlinePen upen=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("下划线",upen);
        manager.register("星号线",mbox);
        manager.register("斜线",sbox);
        ///生成
        com.ldg.pattern.prototype.Product p1=manager.create("下划线");
        com.ldg.pattern.prototype.Product p2=manager.create("星号线");
        com.ldg.pattern.prototype.Product p3=manager.create("斜线");
        p1.use("你好世界！");
        p2.use("你好世界！");
        p3.use("你好世界！");
    }
    /**
     * 7.builder 模式
     *
     */
    @Test
    public void testBuilder() {
        TextBuilder textBuilder=new TextBuilder();
        Director director=new Director(textBuilder);
        director.construct();
        String result=textBuilder.getResult();
        System.out.println(result);
        /////
        HTMLBuilder htmlBuilder=new HTMLBuilder();
        Director director2=new Director(htmlBuilder);
        director2.construct();
        String result2=htmlBuilder.getResult();
        System.out.println(result2);
    }
}
