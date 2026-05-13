package com.zepto;

import com.zepto.dv4;
import com.zepto.tw3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class xo3 implements ev4 {
    public static final Logger a = Logger.getLogger(xo3.class.getName());
    public static final byte[] b = {0};
    public static final xo3 c = new xo3();

    public static class b implements to3 {
        public final dv4 a;
        public final tw3.a b;
        public final tw3.a c;

        @Override // com.zepto.to3
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (dv4.c cVar : this.a.f(bArrCopyOf)) {
                try {
                    ((to3) cVar.g()).a(bArrCopyOfRange, cVar.f().equals(qj4.LEGACY) ? y80.a(bArr2, xo3.b) : bArr2);
                    this.c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e) {
                    xo3.a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            for (dv4.c cVar2 : this.a.h()) {
                try {
                    ((to3) cVar2.g()).a(bArr, bArr2);
                    this.c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // com.zepto.to3
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.a.e().f().equals(qj4.LEGACY)) {
                bArr = y80.a(bArr, xo3.b);
            }
            try {
                byte[] bArrA = y80.a(this.a.e().b(), ((to3) this.a.e().g()).b(bArr));
                this.b.b(this.a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e) {
                this.b.a();
                throw e;
            }
        }

        public b(dv4 dv4Var) {
            this.a = dv4Var;
            if (!dv4Var.i()) {
                tw3.a aVar = vw3.a;
                this.b = aVar;
                this.c = aVar;
            } else {
                tw3 tw3VarA = py3.b().a();
                uw3 uw3VarA = vw3.a(dv4Var);
                this.b = tw3VarA.a(uw3VarA, "mac", "compute");
                this.c = tw3VarA.a(uw3VarA, "mac", "verify");
            }
        }
    }

    public static void f() {
        u75.n(c);
    }

    @Override // com.zepto.ev4
    public Class a() {
        return to3.class;
    }

    @Override // com.zepto.ev4
    public Class c() {
        return to3.class;
    }

    public final void g(dv4 dv4Var) throws GeneralSecurityException {
        Iterator it = dv4Var.c().iterator();
        while (it.hasNext()) {
            for (dv4.c cVar : (List) it.next()) {
                if (cVar.c() instanceof vo3) {
                    vo3 vo3Var = (vo3) cVar.c();
                    x80 x80VarA = x80.a(cVar.b());
                    if (!x80VarA.equals(vo3Var.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + vo3Var.b() + " has wrong output prefix (" + vo3Var.a() + ") instead of (" + x80VarA + ")");
                    }
                }
            }
        }
    }

    @Override // com.zepto.ev4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public to3 b(dv4 dv4Var) throws GeneralSecurityException {
        g(dv4Var);
        return new b(dv4Var);
    }
}
