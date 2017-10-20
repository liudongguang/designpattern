package com.ldg.pattern;

import com.ldg.pattern.adapter.classadapter.Print;
import com.ldg.pattern.adapter.classadapter.PrintBanner;
import com.ldg.pattern.adapter.lianxi.FileIO;
import com.ldg.pattern.adapter.lianxi.FileProperties;
import com.ldg.pattern.iterator.api.Iterator;
import com.ldg.pattern.iterator.impl.Book;
import com.ldg.pattern.iterator.impl.BookShelf;
import org.junit.Test;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class PatternTest {
    /**
     * Iterator迭代器模式
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

}
