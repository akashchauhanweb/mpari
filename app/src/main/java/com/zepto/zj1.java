package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zj1 {
    public static p0 a(String str) {
        if (str.equals("SHA-256")) {
            return l14.c;
        }
        if (str.equals("SHA-512")) {
            return l14.e;
        }
        if (str.equals("SHAKE128")) {
            return l14.m;
        }
        if (str.equals("SHAKE256")) {
            return l14.n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
