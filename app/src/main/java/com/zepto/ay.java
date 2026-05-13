package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class ay extends ii8 {
    public final int c;

    public ay(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), m58.a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.c = i;
    }
}
