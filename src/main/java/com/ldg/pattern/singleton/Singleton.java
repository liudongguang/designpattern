package com.ldg.pattern.singleton;

/**
 * Created by LiuDongguang on 2017/10/23.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
