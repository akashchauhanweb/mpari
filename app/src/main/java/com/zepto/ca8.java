package com.zepto;

import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public final class ca8 implements d85, xc8 {
    public final aa8 a;
    public yf3 b;
    public boolean c = true;
    public final /* synthetic */ ea8 d;

    public ca8(ea8 ea8Var, yf3 yf3Var, aa8 aa8Var) {
        this.d = ea8Var;
        this.b = yf3Var;
        this.a = aa8Var;
    }

    @Override // com.zepto.xc8
    public final synchronized yf3 a() {
        return this.b;
    }

    @Override // com.zepto.xc8
    public final synchronized void b(yf3 yf3Var) {
        yf3 yf3Var2 = this.b;
        if (yf3Var2 != yf3Var) {
            yf3Var2.a();
            this.b = yf3Var;
        }
    }

    @Override // com.zepto.d85
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        yf3.a aVarB;
        boolean z;
        ud8 ud8Var = (ud8) obj;
        rc6 rc6Var = (rc6) obj2;
        synchronized (this) {
            aVarB = this.b.b();
            z = this.c;
            this.b.a();
        }
        if (aVarB == null) {
            rc6Var.c(Boolean.FALSE);
        } else {
            this.a.a(ud8Var, aVarB, z, rc6Var);
        }
    }

    @Override // com.zepto.xc8
    public final void h() {
        yf3.a aVarB;
        synchronized (this) {
            this.c = false;
            aVarB = this.b.b();
        }
        if (aVarB != null) {
            this.d.j(aVarB, 2441);
        }
    }
}
