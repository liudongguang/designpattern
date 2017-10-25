package com.ldg.pattern.prototype;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 3
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
       int length=s.getBytes().length;
       for(int i=0;i<length+4;i++){
           System.out.print(decochar);
       }
        System.out.println("");
        System.out.println(decochar+" "+s+" "+decochar);
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p= (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
