package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public class r33 extends g33 {
    public o33 f;
    public h40 g;
    public h40 h;
    public h40 i;
    public h40 j;
    public a k;

    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public r33(o33 o33Var, xm4 xm4Var) {
        if (o33Var == null) {
            throw new IllegalArgumentException("The JWE header must not be null");
        }
        this.f = o33Var;
        if (xm4Var == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        b(xm4Var);
        this.g = null;
        this.i = null;
        this.k = a.UNENCRYPTED;
    }

    public synchronized void c(n33 n33Var) {
        try {
            f();
            e(n33Var);
            try {
                m33 m33VarB = n33Var.b(g(), a().c(), h.b(g()));
                if (m33VarB.d() != null) {
                    this.f = m33VarB.d();
                }
                this.g = m33VarB.c();
                this.h = m33VarB.e();
                this.i = m33VarB.b();
                this.j = m33VarB.a();
                this.k = a.ENCRYPTED;
            } catch (f33 e) {
                throw e;
            } catch (Exception e2) {
                throw new f33(e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        a aVar = this.k;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    public final void e(n33 n33Var) throws f33 {
        if (!n33Var.c().contains(g().e())) {
            throw new f33("The " + g().e() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + n33Var.c());
        }
        if (n33Var.a().contains(g().g())) {
            return;
        }
        throw new f33("The " + g().g() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + n33Var.a());
    }

    public final void f() {
        if (this.k != a.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public o33 g() {
        return this.f;
    }

    public String h() {
        d();
        StringBuilder sb = new StringBuilder(this.f.c().toString());
        sb.append('.');
        h40 h40Var = this.g;
        if (h40Var != null) {
            sb.append(h40Var);
        }
        sb.append('.');
        h40 h40Var2 = this.h;
        if (h40Var2 != null) {
            sb.append(h40Var2);
        }
        sb.append('.');
        sb.append(this.i);
        sb.append('.');
        h40 h40Var3 = this.j;
        if (h40Var3 != null) {
            sb.append(h40Var3);
        }
        return sb.toString();
    }
}
