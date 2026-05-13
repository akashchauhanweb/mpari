package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux {
    public static boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!if4.a(objArr[i], obj)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }
}
