package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl2 {
    public static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
