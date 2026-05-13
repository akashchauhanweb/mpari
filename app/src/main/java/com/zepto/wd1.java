package com.zepto;

import java.lang.reflect.Constructor;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class wd1 {
    public final Constructor a;

    public wd1(Class cls) {
        this(cls, Long.TYPE);
    }

    public Date a(Object... objArr) {
        return (Date) this.a.newInstance(objArr);
    }

    public wd1(Class cls, Class... clsArr) {
        this.a = cls.getDeclaredConstructor(clsArr);
    }
}
