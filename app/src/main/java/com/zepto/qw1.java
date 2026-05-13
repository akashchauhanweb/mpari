package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class qw1 implements Runnable {
    public final nv4 c;
    public final int e;
    public final nw1 f;

    public qw1(nw1 nw1Var) {
        this.f = nw1Var;
        this.c = nw1Var.s();
        this.e = nw1Var.v();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f.D(h76.RUNNING);
        jd5 jd5VarK = rw1.d(this.f).k();
        if (jd5VarK.d()) {
            this.f.h();
            return;
        }
        if (jd5VarK.c()) {
            this.f.f();
        } else if (jd5VarK.a() != null) {
            this.f.e(jd5VarK.a());
        } else {
            if (jd5VarK.b()) {
                return;
            }
            this.f.e(new x22());
        }
    }
}
