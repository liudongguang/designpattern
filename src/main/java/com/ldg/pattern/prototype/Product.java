package com.ldg.pattern.prototype;

/**
 * Created by LiuDongguang on 2017/10/25.
 * 1.复制功能接口
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
