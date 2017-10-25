package com.ldg.pattern.builder;

import java.util.Arrays;

/**
 * Created by LiuDongguang on 2017/10/25.
 */
public class TextBuilder extends Builder {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("====================\n");
        stringBuilder.append("[").append(title).append("]\n\n");

    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("Φ").append(str).append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        Arrays.stream(items).forEach(item -> {
            stringBuilder.append("  .").append(item).append("\n");
        });
        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("===================\n");
    }

    public String getResult() {
        return stringBuilder.toString();
    }
}
