package com.zepto;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zepto.jn3;
import com.zepto.u30;
import com.zepto.w96;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class or6 {
    public final Context a;
    public final s30 b;
    public final d52 c;
    public final vy7 d;
    public final Executor e;
    public final w96 f;
    public final uq0 g;
    public final uq0 h;
    public final oq0 i;

    public or6(Context context, s30 s30Var, d52 d52Var, vy7 vy7Var, Executor executor, w96 w96Var, uq0 uq0Var, uq0 uq0Var2, oq0 oq0Var) {
        this.a = context;
        this.b = s30Var;
        this.c = d52Var;
        this.d = vy7Var;
        this.e = executor;
        this.f = w96Var;
        this.g = uq0Var;
        this.h = uq0Var2;
        this.i = oq0Var;
    }

    public u42 j(pn6 pn6Var) {
        w96 w96Var = this.f;
        final oq0 oq0Var = this.i;
        Objects.requireNonNull(oq0Var);
        return pn6Var.a(u42.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new x12(c22.b("proto"), ((sq0) w96Var.m(new w96.a() { // from class: com.zepto.er6
            @Override // com.zepto.w96.a
            public final Object execute() {
                return oq0Var.e();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(qn6 qn6Var) {
        return Boolean.valueOf(this.c.w0(qn6Var));
    }

    public final /* synthetic */ Iterable m(qn6 qn6Var) {
        return this.c.M(qn6Var);
    }

    public final /* synthetic */ Object n(Iterable iterable, qn6 qn6Var, long j) {
        this.c.g0(iterable);
        this.c.A(qn6Var, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.c.i(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.i.j();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.i.d(((Integer) r0.getValue()).intValue(), jn3.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(qn6 qn6Var, long j) {
        this.c.A(qn6Var, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object s(qn6 qn6Var, int i) {
        this.d.a(qn6Var, i + 1);
        return null;
    }

    public final /* synthetic */ void t(final qn6 qn6Var, final int i, Runnable runnable) {
        try {
            try {
                w96 w96Var = this.f;
                final d52 d52Var = this.c;
                Objects.requireNonNull(d52Var);
                w96Var.m(new w96.a() { // from class: com.zepto.fr6
                    @Override // com.zepto.w96.a
                    public final Object execute() {
                        return Integer.valueOf(d52Var.h());
                    }
                });
                if (k()) {
                    u(qn6Var, i);
                } else {
                    this.f.m(new w96.a() { // from class: com.zepto.gr6
                        @Override // com.zepto.w96.a
                        public final Object execute() {
                            return this.a.s(qn6Var, i);
                        }
                    });
                }
            } catch (v96 unused) {
                this.d.a(qn6Var, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public u30 u(final qn6 qn6Var, int i) {
        u30 u30VarB;
        pn6 pn6Var = this.b.get(qn6Var.b());
        long jMax = 0;
        u30 u30VarE = u30.e(0L);
        while (true) {
            final long j = jMax;
            while (((Boolean) this.f.m(new w96.a() { // from class: com.zepto.hr6
                @Override // com.zepto.w96.a
                public final Object execute() {
                    return this.a.l(qn6Var);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f.m(new w96.a() { // from class: com.zepto.ir6
                    @Override // com.zepto.w96.a
                    public final Object execute() {
                        return this.a.m(qn6Var);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return u30VarE;
                }
                if (pn6Var == null) {
                    yn3.a("Uploader", "Unknown backend for %s, deleting event batch for it...", qn6Var);
                    u30VarB = u30.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((fr4) it.next()).b());
                    }
                    if (qn6Var.e()) {
                        arrayList.add(j(pn6Var));
                    }
                    u30VarB = pn6Var.b(t30.a().b(arrayList).c(qn6Var.c()).a());
                }
                u30VarE = u30VarB;
                if (u30VarE.c() == u30.a.TRANSIENT_ERROR) {
                    this.f.m(new w96.a() { // from class: com.zepto.jr6
                        @Override // com.zepto.w96.a
                        public final Object execute() {
                            return this.a.n(iterable, qn6Var, j);
                        }
                    });
                    this.d.b(qn6Var, i + 1, true);
                    return u30VarE;
                }
                this.f.m(new w96.a() { // from class: com.zepto.kr6
                    @Override // com.zepto.w96.a
                    public final Object execute() {
                        return this.a.o(iterable);
                    }
                });
                if (u30VarE.c() == u30.a.OK) {
                    jMax = Math.max(j, u30VarE.b());
                    if (qn6Var.e()) {
                        this.f.m(new w96.a() { // from class: com.zepto.lr6
                            @Override // com.zepto.w96.a
                            public final Object execute() {
                                return this.a.p();
                            }
                        });
                    }
                } else if (u30VarE.c() == u30.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((fr4) it2.next()).b().j();
                        if (map.containsKey(strJ)) {
                            map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                        } else {
                            map.put(strJ, 1);
                        }
                    }
                    this.f.m(new w96.a() { // from class: com.zepto.mr6
                        @Override // com.zepto.w96.a
                        public final Object execute() {
                            return this.a.q(map);
                        }
                    });
                }
            }
            this.f.m(new w96.a() { // from class: com.zepto.nr6
                @Override // com.zepto.w96.a
                public final Object execute() {
                    return this.a.r(qn6Var, j);
                }
            });
            return u30VarE;
        }
    }

    public void v(final qn6 qn6Var, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: com.zepto.dr6
            @Override // java.lang.Runnable
            public final void run() {
                this.c.t(qn6Var, i, runnable);
            }
        });
    }
}
