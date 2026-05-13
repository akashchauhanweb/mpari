package com.zepto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class pw1 {
    public static pw1 c;
    public final Map a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger();

    public static pw1 c() {
        if (c == null) {
            synchronized (pw1.class) {
                try {
                    if (c == null) {
                        c = new pw1();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static void e() {
        c();
    }

    public void a(nw1 nw1Var) {
        this.a.put(Integer.valueOf(nw1Var.n()), nw1Var);
        nw1Var.D(h76.QUEUED);
        nw1Var.C(d());
        nw1Var.B(nz0.b().a().c().submit(new qw1(nw1Var)));
    }

    public void b(nw1 nw1Var) {
        this.a.remove(Integer.valueOf(nw1Var.n()));
    }

    public final int d() {
        return this.b.incrementAndGet();
    }
}
