package com.zepto;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class yx7 implements Runnable {
    public static final String j = rn3.i("WorkForegroundRunnable");
    public final nz5 c = nz5.t();
    public final Context e;
    public final yy7 f;
    public final androidx.work.c g;
    public final se2 h;
    public final uc6 i;

    public class a implements Runnable {
        public final /* synthetic */ nz5 c;

        public a(nz5 nz5Var) {
            this.c = nz5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (yx7.this.c.isCancelled()) {
                return;
            }
            try {
                pe2 pe2Var = (pe2) this.c.get();
                if (pe2Var == null) {
                    throw new IllegalStateException("Worker was marked important (" + yx7.this.f.c + ") but did not provide ForegroundInfo");
                }
                rn3.e().a(yx7.j, "Updating notification for " + yx7.this.f.c);
                yx7 yx7Var = yx7.this;
                yx7Var.c.r(yx7Var.h.a(yx7Var.e, yx7Var.g.e(), pe2Var));
            } catch (Throwable th) {
                yx7.this.c.q(th);
            }
        }
    }

    public yx7(Context context, yy7 yy7Var, androidx.work.c cVar, se2 se2Var, uc6 uc6Var) {
        this.e = context;
        this.f = yy7Var;
        this.g = cVar;
        this.h = se2Var;
        this.i = uc6Var;
    }

    public xf3 b() {
        return this.c;
    }

    public final /* synthetic */ void c(nz5 nz5Var) {
        if (this.c.isCancelled()) {
            nz5Var.cancel(true);
        } else {
            nz5Var.r(this.g.d());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f.q || Build.VERSION.SDK_INT >= 31) {
            this.c.p(null);
            return;
        }
        final nz5 nz5VarT = nz5.t();
        this.i.a().execute(new Runnable() { // from class: com.zepto.xx7
            @Override // java.lang.Runnable
            public final void run() {
                this.c.c(nz5VarT);
            }
        });
        nz5VarT.a(new a(nz5VarT), this.i.a());
    }
}
