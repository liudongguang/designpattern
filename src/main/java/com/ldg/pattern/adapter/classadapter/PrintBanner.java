package com.ldg.pattern.adapter.classadapter;

import com.ldg.pattern.adapter.Banner;

/**
 * Created by LiuDongguang on 2017/10/20.
 *
 * 适配器
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String prString) {
        super(prString);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
