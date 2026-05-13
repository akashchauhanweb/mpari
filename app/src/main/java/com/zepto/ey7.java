package com.zepto;

import com.zepto.w96;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ey7 {
    public final Executor a;
    public final d52 b;
    public final vy7 c;
    public final w96 d;

    public ey7(Executor executor, d52 d52Var, vy7 vy7Var, w96 w96Var) {
        this.a = executor;
        this.b = d52Var;
        this.c = vy7Var;
        this.d = w96Var;
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: com.zepto.cy7
            @Override // java.lang.Runnable
            public final void run() {
                this.c.e();
            }
        });
    }

    public final /* synthetic */ Object d() {
        Iterator it = this.b.N().iterator();
        while (it.hasNext()) {
            this.c.a((qn6) it.next(), 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.d.m(new w96.a() { // from class: com.zepto.dy7
            @Override // com.zepto.w96.a
            public final Object execute() {
                return this.a.d();
            }
        });
    }
}
