package com.ldg.pattern;

import com.ldg.pattern.AbstractFactory.factory.Item;
import com.ldg.pattern.AbstractFactory.factory.Link;
import com.ldg.pattern.AbstractFactory.listfactory.ListLink;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class ListTest {
    @Test
    public void testList(){
        List<? super Item> list=new ArrayList<>();
        Link link=new ListLink("a","b");
        list.add(link);

        list.forEach(item->{
            System.out.println(item);
        });
        Link link2= (Link) list.get(0);
    }
}
