package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class ju4 {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return h86.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h86.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return h86.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h86.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? b(i, i3, "start index") : (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : h86.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(h86.a(str, Character.valueOf(c)));
        }
    }

    public static void g(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(h86.a(str, obj));
        }
    }

    public static int h(int i, int i2) {
        return i(i, i2, "index");
    }

    public static int i(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a(i, i2, str));
        }
        return i;
    }

    public static Object j(Object obj) {
        obj.getClass();
        return obj;
    }

    public static int k(int i, int i2) {
        return l(i, i2, "index");
    }

    public static int l(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, str));
        }
        return i;
    }

    public static void m(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(c(i, i2, i3));
        }
    }
}
