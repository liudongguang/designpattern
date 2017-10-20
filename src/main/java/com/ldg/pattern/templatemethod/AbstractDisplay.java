package com.ldg.pattern.templatemethod;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();
    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
