package com.ldg.pattern.AbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 3.抽象的零件
 */
public abstract class Tray extends Item {
    protected List<? super Item> tray=new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
