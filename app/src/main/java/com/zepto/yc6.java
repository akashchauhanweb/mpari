package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class yc6 extends nc6 {
    public final Runnable f;

    public yc6(Runnable runnable, long j, sc6 sc6Var) {
        super(j, sc6Var);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f.run();
        } finally {
            this.e.a();
        }
    }

    public String toString() {
        return "Task[" + me1.a(this.f) + '@' + me1.b(this.f) + ", " + this.c + ", " + this.e + ']';
    }
}
