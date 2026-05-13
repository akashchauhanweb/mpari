package com.zepto;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cc8 {
    public static final z68 k = new z68("ExtractorLooper");
    public final be8 a;
    public final rb8 b;
    public final lg8 c;
    public final df8 d;
    public final kf8 e;
    public final ag8 f;
    public final eg8 g;
    public final lc8 h;
    public final he8 i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    public cc8(be8 be8Var, lc8 lc8Var, rb8 rb8Var, lg8 lg8Var, df8 df8Var, kf8 kf8Var, ag8 ag8Var, eg8 eg8Var, he8 he8Var) {
        this.a = be8Var;
        this.h = lc8Var;
        this.b = rb8Var;
        this.c = lg8Var;
        this.d = df8Var;
        this.e = kf8Var;
        this.f = ag8Var;
        this.g = eg8Var;
        this.i = he8Var;
    }

    public final void a() {
        fe8 fe8VarA;
        z68 z68Var = k;
        z68Var.a("Run extractor loop", new Object[0]);
        if (!this.j.compareAndSet(false, true)) {
            z68Var.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                fe8VarA = this.i.a();
            } catch (bc8 e) {
                k.b("Error while getting next extraction task: %s", e.getMessage());
                if (e.c >= 0) {
                    ((zm8) this.h.a()).b(e.c);
                    b(e.c, e);
                }
                fe8VarA = null;
            }
            if (fe8VarA == null) {
                this.j.set(false);
                return;
            }
            try {
                if (fe8VarA instanceof ob8) {
                    this.b.a((ob8) fe8VarA);
                } else if (fe8VarA instanceof kg8) {
                    this.c.a((kg8) fe8VarA);
                } else if (fe8VarA instanceof bf8) {
                    this.d.a((bf8) fe8VarA);
                } else if (fe8VarA instanceof hf8) {
                    this.e.a((hf8) fe8VarA);
                } else if (fe8VarA instanceof zf8) {
                    this.f.a((zf8) fe8VarA);
                } else if (fe8VarA instanceof cg8) {
                    this.g.a((cg8) fe8VarA);
                } else {
                    k.b("Unknown task type: %s", fe8VarA.getClass().getName());
                }
            } catch (Exception e2) {
                k.b("Error during extraction task: %s", e2.getMessage());
                ((zm8) this.h.a()).b(fe8VarA.a);
                b(fe8VarA.a, e2);
            }
        }
    }

    public final void b(int i, Exception exc) {
        try {
            this.a.k(i, 5);
            this.a.l(i);
        } catch (bc8 unused) {
            k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
