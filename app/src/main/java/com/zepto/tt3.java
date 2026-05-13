package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class tt3 {
    public final Annotation[] a;
    public final Method b;
    public final String c;

    public tt3(Method method) {
        this.a = method.getDeclaredAnnotations();
        this.c = method.getName();
        this.b = method;
    }

    public Annotation[] a() {
        return this.a;
    }

    public Method b() {
        return this.b;
    }
}
