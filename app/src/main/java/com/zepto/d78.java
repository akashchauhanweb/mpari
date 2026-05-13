package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class d78 implements Runnable {
    public final rh8 c;

    public d78() {
        this.c = null;
    }

    public abstract void a();

    public final rh8 b() {
        return this.c;
    }

    public final void c(Exception exc) {
        rh8 rh8Var = this.c;
        if (rh8Var != null) {
            rh8Var.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }

    public d78(rh8 rh8Var) {
        this.c = rh8Var;
    }
}
