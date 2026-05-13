package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yi8 {
    public static final z68 l = new z68("AssetPackManager");
    public final s98 a;
    public final lc8 b;
    public final k98 c;
    public final ol8 d;
    public final be8 e;
    public final mc8 f;
    public final la8 g;
    public final lc8 h;
    public final n58 i;
    public final vf8 j;
    public final Handler k = new Handler(Looper.getMainLooper());

    public yi8(s98 s98Var, lc8 lc8Var, k98 k98Var, ol8 ol8Var, be8 be8Var, mc8 mc8Var, la8 la8Var, lc8 lc8Var2, n58 n58Var, vf8 vf8Var) {
        this.a = s98Var;
        this.b = lc8Var;
        this.c = k98Var;
        this.d = ol8Var;
        this.e = be8Var;
        this.f = mc8Var;
        this.g = la8Var;
        this.h = lc8Var2;
        this.i = n58Var;
        this.j = vf8Var;
    }

    public final /* synthetic */ void b() {
        pc6 pc6VarD = ((zm8) this.b.a()).d(this.a.G());
        Executor executor = (Executor) this.h.a();
        final s98 s98Var = this.a;
        s98Var.getClass();
        pc6VarD.d(executor, new dh4() { // from class: com.zepto.hh8
            @Override // com.zepto.dh4
            public final void b(Object obj) {
                s98Var.c((List) obj);
            }
        });
        pc6VarD.b((Executor) this.h.a(), new qg4() { // from class: com.zepto.vg8
            @Override // com.zepto.qg4
            public final void a(Exception exc) {
                yi8.l.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    public final void c(boolean z) {
        boolean zG = this.c.g();
        this.c.d(z);
        if (!z || zG) {
            return;
        }
        d();
    }

    public final void d() {
        ((Executor) this.h.a()).execute(new Runnable() { // from class: com.zepto.ai8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.b();
            }
        });
    }
}
