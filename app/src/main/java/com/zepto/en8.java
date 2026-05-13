package com.zepto;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class en8 implements Runnable {
    public final /* synthetic */ mm8 c;
    public final /* synthetic */ Callable e;

    public en8(mm8 mm8Var, Callable callable) {
        this.c = mm8Var;
        this.e = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.r(this.e.call());
        } catch (Exception e) {
            this.c.q(e);
        } catch (Throwable th) {
            this.c.q(new RuntimeException(th));
        }
    }
}
