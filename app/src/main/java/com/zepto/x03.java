package com.zepto;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class x03 {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");
    public static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final fr0 f;

    public interface a {
    }

    public interface b {
    }

    public interface c {
        boolean a(int i);
    }

    public interface d extends List, RandomAccess {
        boolean X();

        void q();

        d t(int i);
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = fr0.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i, int i2) {
        int iH = h(i2, bArr, i, i2);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return zs6.m(bArr);
    }

    public static int h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, b);
    }
}
