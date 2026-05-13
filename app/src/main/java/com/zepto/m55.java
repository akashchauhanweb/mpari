package com.zepto;

import com.zepto.v03;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m55 implements v03.a {
    public int a;
    public final i55 b;
    public final List c;
    public final int d;
    public final r52 e;
    public final kc5 f;
    public final int g;
    public final int h;
    public final int i;

    public m55(i55 call, List interceptors, int i, r52 r52Var, kc5 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.b = call;
        this.c = interceptors;
        this.d = i;
        this.e = r52Var;
        this.f = request;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public static /* synthetic */ m55 d(m55 m55Var, int i, r52 r52Var, kc5 kc5Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m55Var.d;
        }
        if ((i5 & 2) != 0) {
            r52Var = m55Var.e;
        }
        r52 r52Var2 = r52Var;
        if ((i5 & 4) != 0) {
            kc5Var = m55Var.f;
        }
        kc5 kc5Var2 = kc5Var;
        if ((i5 & 8) != 0) {
            i2 = m55Var.g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = m55Var.h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = m55Var.i;
        }
        return m55Var.c(i, r52Var2, kc5Var2, i6, i7, i4);
    }

    @Override // com.zepto.v03.a
    public ld5 a(kc5 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.d < this.c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.a++;
        r52 r52Var = this.e;
        if (r52Var != null) {
            if (!r52Var.j().g(request.k())) {
                throw new IllegalStateException(("network interceptor " + ((v03) this.c.get(this.d - 1)) + " must retain the same host and port").toString());
            }
            if (!(this.a == 1)) {
                throw new IllegalStateException(("network interceptor " + ((v03) this.c.get(this.d - 1)) + " must call proceed() exactly once").toString());
            }
        }
        m55 m55VarD = d(this, this.d + 1, null, request, 0, 0, 0, 58, null);
        v03 v03Var = (v03) this.c.get(this.d);
        ld5 ld5VarA = v03Var.a(m55VarD);
        if (ld5VarA == null) {
            throw new NullPointerException("interceptor " + v03Var + " returned null");
        }
        if (this.e != null) {
            if (!(this.d + 1 >= this.c.size() || m55VarD.a == 1)) {
                throw new IllegalStateException(("network interceptor " + v03Var + " must call proceed() exactly once").toString());
            }
        }
        if (ld5VarA.d() != null) {
            return ld5VarA;
        }
        throw new IllegalStateException(("interceptor " + v03Var + " returned a response with no body").toString());
    }

    @Override // com.zepto.v03.a
    public iw0 b() {
        r52 r52Var = this.e;
        if (r52Var != null) {
            return r52Var.h();
        }
        return null;
    }

    public final m55 c(int i, r52 r52Var, kc5 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new m55(this.b, this.c, i, r52Var, request, i2, i3, i4);
    }

    @Override // com.zepto.v03.a
    public da0 call() {
        return this.b;
    }

    public final i55 e() {
        return this.b;
    }

    public final int f() {
        return this.g;
    }

    public final r52 g() {
        return this.e;
    }

    public final int h() {
        return this.h;
    }

    public final kc5 i() {
        return this.f;
    }

    public final int j() {
        return this.i;
    }

    public int k() {
        return this.h;
    }

    @Override // com.zepto.v03.a
    public kc5 request() {
        return this.f;
    }
}
