package com.ldg.pattern.adapter;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class Banner {
    private String prString;

    public Banner(String prString) {
        this.prString = prString;
    }

    public void showWithParen(){
        System.out.println("("+prString+")");
    }
    public void showWithAster(){
        System.out.println("*"+prString+"*");
    }
}
