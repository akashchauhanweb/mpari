package com.zepto;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class rx implements xm6 {
    public final z76 a = new z76();
    public final xm6 b;
    public final Class c;

    public rx(xm6 xm6Var, Class cls) {
        this.b = xm6Var;
        this.c = cls;
    }

    @Override // com.zepto.xm6
    public String a(Object obj) {
        return d(obj, Array.getLength(obj));
    }

    @Override // com.zepto.xm6
    public Object b(String str) {
        String[] strArrB = this.a.b(str);
        return c(strArrB, strArrB.length);
    }

    public final Object c(String[] strArr, int i) {
        Object objNewInstance = Array.newInstance((Class<?>) this.c, i);
        for (int i2 = 0; i2 < i; i2++) {
            Object objB = this.b.b(strArr[i2]);
            if (objB != null) {
                Array.set(objNewInstance, i2, objB);
            }
        }
        return objNewInstance;
    }

    public final String d(Object obj, int i) {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = Array.get(obj, i2);
            if (obj2 != null) {
                strArr[i2] = this.b.a(obj2);
            }
        }
        return this.a.a(strArr);
    }
}
