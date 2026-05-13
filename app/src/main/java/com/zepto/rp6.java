package com.zepto;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rp6 extends RuntimeException {
    public final List c;

    public rp6(at3 at3Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.c = null;
    }

    public b13 a() {
        return new b13(getMessage());
    }
}
