package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class nz0 {
    public static nz0 b;
    public final f62 a = new jf1();

    public static nz0 b() {
        if (b == null) {
            synchronized (nz0.class) {
                try {
                    if (b == null) {
                        b = new nz0();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public f62 a() {
        return this.a;
    }
}
