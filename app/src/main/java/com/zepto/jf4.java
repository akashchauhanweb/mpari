package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf4 extends m72 {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
