package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public @interface cx4 {

    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
