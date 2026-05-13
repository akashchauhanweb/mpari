package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class gb2 {
    public final Annotation[] a;
    public final Field b;
    public final String c;

    public gb2(Field field) {
        this.a = field.getDeclaredAnnotations();
        this.c = field.getName();
        this.b = field;
    }

    public Annotation[] a() {
        return this.a;
    }

    public Field b() {
        return this.b;
    }
}
