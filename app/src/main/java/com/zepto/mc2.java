package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc2 extends Exception {
    public mc2() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc2(String str) {
        super(str);
        iu4.f(str, "Detail message must not be empty");
    }
}
