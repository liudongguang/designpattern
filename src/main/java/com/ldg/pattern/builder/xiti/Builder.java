package com.ldg.pattern.builder.xiti;

/**
 * 完成在不修改Director的前提下，在调用makeString,makeItems,close前必须调用makeTitle一次且只能一次
 */
public abstract class Builder {
    private boolean initialized = false;

    public void makeTitle(String title) {
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    public void close() {
        if (initialized) {
            buildDone();
        }
    }

    protected abstract void buildTitle(String title);

    protected abstract void buildString(String str);

    protected abstract void buildItems(String[] items);

    protected abstract void buildDone();

}
