package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class bc8 extends RuntimeException {
    public final int c;

    public bc8(String str) {
        super(str);
        this.c = -1;
    }

    public bc8(String str, int i) {
        super(str);
        this.c = i;
    }

    public bc8(String str, Exception exc) {
        super(str, exc);
        this.c = -1;
    }

    public bc8(String str, Exception exc, int i) {
        super(str, exc);
        this.c = i;
    }
}
