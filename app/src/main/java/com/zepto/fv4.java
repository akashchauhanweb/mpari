package com.zepto;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fv4 {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
