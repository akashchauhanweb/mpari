package com.zepto;

import com.zepto.ef5;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t52 {
    public ef5.b a;
    public ef5 b;
    public int c;
    public int d;
    public int e;
    public bf5 f;
    public final l55 g;
    public final wj h;
    public final i55 i;
    public final v42 j;

    public t52(l55 connectionPool, wj address, i55 call, v42 eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.g = connectionPool;
        this.h = address;
        this.i = call;
        this.j = eventListener;
    }

    public final s52 a(yf4 client, m55 chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return c(chain.f(), chain.h(), chain.j(), client.y(), client.G(), !Intrinsics.areEqual(chain.i().h(), "GET")).x(client, chain);
        } catch (df5 e) {
            h(e.c());
            throw e;
        } catch (IOException e2) {
            h(e2);
            throw new df5(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zepto.j55 b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.t52.b(int, int, int, int, boolean):com.zepto.j55");
    }

    public final j55 c(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        ef5.b bVar;
        ef5 ef5Var;
        while (true) {
            j55 j55VarB = b(i, i2, i3, i4, z);
            if (j55VarB.v(z2)) {
                return j55VarB;
            }
            j55VarB.z();
            if (this.f == null && (bVar = this.a) != null && !bVar.b() && (ef5Var = this.b) != null && !ef5Var.b()) {
                throw new IOException("exhausted all routes");
            }
        }
    }

    public final wj d() {
        return this.h;
    }

    public final boolean e() {
        ef5 ef5Var;
        if (this.c == 0 && this.d == 0 && this.e == 0) {
            return false;
        }
        if (this.f != null) {
            return true;
        }
        bf5 bf5VarF = f();
        if (bf5VarF != null) {
            this.f = bf5VarF;
            return true;
        }
        ef5.b bVar = this.a;
        if ((bVar == null || !bVar.b()) && (ef5Var = this.b) != null) {
            return ef5Var.b();
        }
        return true;
    }

    public final bf5 f() {
        j55 j55VarL;
        if (this.c > 1 || this.d > 1 || this.e > 0 || (j55VarL = this.i.l()) == null) {
            return null;
        }
        synchronized (j55VarL) {
            if (j55VarL.r() != 0) {
                return null;
            }
            if (et6.g(j55VarL.A().a().l(), this.h.l())) {
                return j55VarL.A();
            }
            return null;
        }
    }

    public final boolean g(ds2 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ds2 ds2VarL = this.h.l();
        return url.n() == ds2VarL.n() && Intrinsics.areEqual(url.i(), ds2VarL.i());
    }

    public final void h(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f = null;
        if ((e instanceof t76) && ((t76) e).c == y22.REFUSED_STREAM) {
            this.c++;
        } else if (e instanceof mw0) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
