package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class jt6 {
    public static Object[][] a(Object[][] objArr, Object[] objArr2) {
        if (objArr == null) {
            return new Object[][]{objArr2};
        }
        Object[][] objArr3 = new Object[objArr.length + 1][];
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        objArr3[objArr.length] = objArr2;
        return objArr3;
    }

    public static int b(char c, char c2) {
        return ((c - 55296) * 1024) + c2 + 9216;
    }

    public static int c(String str, int i) {
        return ((str.charAt(i) - 55296) * 1024) + str.charAt(i + 1) + 9216;
    }

    public static int d(char[] cArr, int i) {
        return ((cArr[i] - 55296) * 1024) + cArr[i + 1] + 9216;
    }

    public static boolean e(char c) {
        return c >= 55296 && c <= 56319;
    }

    public static boolean f(char c) {
        return c >= 56320 && c <= 57343;
    }

    public static boolean g(String str, int i) {
        return i >= 0 && i <= str.length() + (-2) && e(str.charAt(i)) && f(str.charAt(i + 1));
    }

    public static boolean h(char[] cArr, int i) {
        return i >= 0 && i <= cArr.length + (-2) && e(cArr[i]) && f(cArr[i + 1]);
    }
}
