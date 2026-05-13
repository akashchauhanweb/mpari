package com.zepto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny {
    public static final int a = a(new byte[]{102, 114, 101, 101});
    public static final int b = a(new byte[]{106, 117, 110, 107});
    public static final int c = a(new byte[]{109, 100, 97, 116});
    public static final int d = a(new byte[]{109, 111, 111, 118});
    public static final int e = a(new byte[]{112, 110, 111, 116});
    public static final int f = a(new byte[]{115, 107, 105, 112});
    public static final int g = a(new byte[]{119, 105, 100, 101});
    public static final int h = a(new byte[]{80, 73, 67, 84});
    public static final int i = a(new byte[]{102, 116, 121, 112});
    public static final int j = a(new byte[]{117, 117, 105, 100});
    public static final int k = a(new byte[]{99, 109, 111, 118});
    public static final int l = a(new byte[]{115, 116, 99, 111});
    public static final int m = a(new byte[]{99, 111, 54, 52});

    public static final int a(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int b() {
        return k;
    }

    public static final int c() {
        return m;
    }

    public static final int d() {
        return a;
    }

    public static final int e() {
        return i;
    }

    public static final int f() {
        return b;
    }

    public static final int g() {
        return c;
    }

    public static final int h() {
        return d;
    }

    public static final int i() {
        return h;
    }

    public static final int j() {
        return e;
    }

    public static final int k() {
        return f;
    }

    public static final int l() {
        return l;
    }

    public static final int m() {
        return j;
    }

    public static final int n() {
        return g;
    }
}
