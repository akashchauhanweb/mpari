package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class xz2 extends ii8 {
    public final int c;

    public xz2(int i) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i), q58.a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.c = i;
    }
}
