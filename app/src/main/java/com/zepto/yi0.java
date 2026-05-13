package com.zepto;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class yi0 implements xm6 {
    public final Class a;

    public yi0(Class cls) {
        this.a = cls;
    }

    private String d(Object obj, int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = Array.get(obj, i2);
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    @Override // com.zepto.xm6
    public String a(Object obj) {
        return this.a == Character.TYPE ? new String((char[]) obj) : d(obj, Array.getLength(obj));
    }

    @Override // com.zepto.xm6
    public Object b(String str) {
        char[] charArray = str.toCharArray();
        return this.a == Character.TYPE ? charArray : c(charArray, charArray.length);
    }

    public final Object c(char[] cArr, int i) {
        Object objNewInstance = Array.newInstance((Class<?>) this.a, i);
        for (int i2 = 0; i2 < i; i2++) {
            Array.set(objNewInstance, i2, Character.valueOf(cArr[i2]));
        }
        return objNewInstance;
    }
}
