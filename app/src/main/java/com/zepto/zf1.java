package com.zepto;

import com.zepto.w96;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class zf1 implements qo5 {
    public static final Logger f = Logger.getLogger(xn6.class.getName());
    public final vy7 a;
    public final Executor b;
    public final s30 c;
    public final d52 d;
    public final w96 e;

    public zf1(Executor executor, s30 s30Var, vy7 vy7Var, d52 d52Var, w96 w96Var) {
        this.b = executor;
        this.c = s30Var;
        this.a = vy7Var;
        this.d = d52Var;
        this.e = w96Var;
    }

    @Override // com.zepto.qo5
    public void a(final qn6 qn6Var, final u42 u42Var, final ao6 ao6Var) {
        this.b.execute(new Runnable() { // from class: com.zepto.wf1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.e(qn6Var, ao6Var, u42Var);
            }
        });
    }

    public final /* synthetic */ Object d(qn6 qn6Var, u42 u42Var) {
        this.d.v(qn6Var, u42Var);
        this.a.a(qn6Var, 1);
        return null;
    }

    public final /* synthetic */ void e(final qn6 qn6Var, ao6 ao6Var, u42 u42Var) {
        try {
            pn6 pn6Var = this.c.get(qn6Var.b());
            if (pn6Var == null) {
                String str = String.format("Transport backend '%s' is not registered", qn6Var.b());
                f.warning(str);
                ao6Var.a(new IllegalArgumentException(str));
            } else {
                final u42 u42VarA = pn6Var.a(u42Var);
                this.e.m(new w96.a() { // from class: com.zepto.xf1
                    @Override // com.zepto.w96.a
                    public final Object execute() {
                        return this.a.d(qn6Var, u42VarA);
                    }
                });
                ao6Var.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            ao6Var.a(e);
        }
    }
}
