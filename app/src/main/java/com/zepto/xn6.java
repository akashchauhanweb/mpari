package com.zepto;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class xn6 implements vn6 {
    public static volatile yn6 e;
    public final uq0 a;
    public final uq0 b;
    public final qo5 c;
    public final or6 d;

    public xn6(uq0 uq0Var, uq0 uq0Var2, qo5 qo5Var, or6 or6Var, ey7 ey7Var) {
        this.a = uq0Var;
        this.b = uq0Var2;
        this.c = qo5Var;
        this.d = or6Var;
        ey7Var.c();
    }

    public static xn6 c() {
        yn6 yn6Var = e;
        if (yn6Var != null) {
            return yn6Var.e();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(ri1 ri1Var) {
        return ri1Var instanceof w12 ? Collections.unmodifiableSet(((w12) ri1Var).a()) : Collections.singleton(c22.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (xn6.class) {
                try {
                    if (e == null) {
                        e = nc1.j().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.zepto.vn6
    public void a(oy5 oy5Var, ao6 ao6Var) {
        this.c.a(oy5Var.f().f(oy5Var.c().c()), b(oy5Var), ao6Var);
    }

    public final u42 b(oy5 oy5Var) {
        return u42.a().i(this.a.a()).k(this.b.a()).j(oy5Var.g()).h(new x12(oy5Var.b(), oy5Var.d())).g(oy5Var.c().a()).d();
    }

    public or6 e() {
        return this.d;
    }

    public rn6 g(ri1 ri1Var) {
        return new sn6(d(ri1Var), qn6.a().b(ri1Var.getName()).c(ri1Var.getExtras()).a(), this);
    }
}
