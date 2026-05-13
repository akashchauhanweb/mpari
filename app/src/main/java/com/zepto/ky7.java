package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ky7 implements uc6 {
    public final ry5 a;
    public final sz0 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ky7.this.c.post(runnable);
        }
    }

    public ky7(Executor executor) {
        ry5 ry5Var = new ry5(executor);
        this.a = ry5Var;
        this.b = g62.a(ry5Var);
    }

    @Override // com.zepto.uc6
    public Executor a() {
        return this.d;
    }

    @Override // com.zepto.uc6
    public sz0 d() {
        return this.b;
    }

    @Override // com.zepto.uc6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ry5 b() {
        return this.a;
    }
}
