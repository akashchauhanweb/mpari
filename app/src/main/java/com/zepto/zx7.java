package com.zepto;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class zx7 implements se2 {
    public static final String d = rn3.i("WMFgUpdater");
    public final uc6 a;
    public final re2 b;
    public final zy7 c;

    public class a implements Runnable {
        public final /* synthetic */ nz5 c;
        public final /* synthetic */ UUID e;
        public final /* synthetic */ pe2 f;
        public final /* synthetic */ Context g;

        public a(nz5 nz5Var, UUID uuid, pe2 pe2Var, Context context) {
            this.c = nz5Var;
            this.e = uuid;
            this.f = pe2Var;
            this.g = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.c.isCancelled()) {
                    String string = this.e.toString();
                    yy7 yy7VarM = zx7.this.c.m(string);
                    if (yy7VarM == null || yy7VarM.b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    zx7.this.b.a(string, this.f);
                    this.g.startService(androidx.work.impl.foreground.a.e(this.g, bz7.a(yy7VarM), this.f));
                }
                this.c.p(null);
            } catch (Throwable th) {
                this.c.q(th);
            }
        }
    }

    public zx7(WorkDatabase workDatabase, re2 re2Var, uc6 uc6Var) {
        this.b = re2Var;
        this.a = uc6Var;
        this.c = workDatabase.H();
    }

    @Override // com.zepto.se2
    public xf3 a(Context context, UUID uuid, pe2 pe2Var) {
        nz5 nz5VarT = nz5.t();
        this.a.c(new a(nz5VarT, uuid, pe2Var, context));
        return nz5VarT;
    }
}
