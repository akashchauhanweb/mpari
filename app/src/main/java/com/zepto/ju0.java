package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ju0 {
    public static final ju0 f = new ju0();
    public int a;
    public int b;
    public String c;
    public wr2 d;
    public ke1 e;

    public static ju0 d() {
        return f;
    }

    public int a() {
        if (this.b == 0) {
            synchronized (ju0.class) {
                try {
                    if (this.b == 0) {
                        this.b = 20000;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public ke1 b() {
        if (this.e == null) {
            synchronized (ju0.class) {
                try {
                    if (this.e == null) {
                        this.e = new q94();
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public wr2 c() {
        if (this.d == null) {
            synchronized (ju0.class) {
                try {
                    if (this.d == null) {
                        this.d = new pf1();
                    }
                } finally {
                }
            }
        }
        return this.d.m0clone();
    }

    public int e() {
        if (this.a == 0) {
            synchronized (ju0.class) {
                try {
                    if (this.a == 0) {
                        this.a = 20000;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public String f() {
        if (this.c == null) {
            synchronized (ju0.class) {
                try {
                    if (this.c == null) {
                        this.c = "PRDownloader";
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public void g(Context context, jk4 jk4Var) {
        this.a = jk4Var.c();
        this.b = jk4Var.a();
        this.c = jk4Var.d();
        this.d = jk4Var.b();
        this.e = jk4Var.e() ? new ds(context) : new q94();
        if (jk4Var.e()) {
            ik4.a(30);
        }
    }
}
