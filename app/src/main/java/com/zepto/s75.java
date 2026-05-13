package com.zepto;

import com.zepto.yf3;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public abstract class s75 {
    public final yf3 a;
    public final w82[] b;
    public final boolean c;
    public final int d;

    public s75(yf3 yf3Var, w82[] w82VarArr, boolean z, int i) {
        this.a = yf3Var;
        this.b = w82VarArr;
        this.c = z;
        this.d = i;
    }

    public void a() {
        this.a.a();
    }

    public yf3.a b() {
        return this.a.b();
    }

    public w82[] c() {
        return this.b;
    }

    public abstract void d(yp.b bVar, rc6 rc6Var);

    public final int e() {
        return this.d;
    }

    public final boolean f() {
        return this.c;
    }
}
