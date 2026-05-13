package com.zepto;

import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v33 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
    }
}
