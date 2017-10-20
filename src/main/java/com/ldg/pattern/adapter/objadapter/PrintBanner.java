package com.ldg.pattern.adapter.objadapter;

import com.ldg.pattern.adapter.Banner;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String prString) {
        this.banner = new Banner(prString);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
