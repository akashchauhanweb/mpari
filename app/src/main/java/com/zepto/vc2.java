package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class vc2 extends mc2 {
    public final a c;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public vc2(a aVar) {
        this.c = aVar;
    }

    public vc2(String str, a aVar) {
        super(str);
        this.c = aVar;
    }
}
