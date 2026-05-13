package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class re4 {
    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] b(Object[] objArr, int i) {
        return js4.b(objArr, i);
    }
}
