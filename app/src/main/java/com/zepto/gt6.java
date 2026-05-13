package com.zepto;

import com.zepto.a73;
import com.zepto.c73;
import com.zepto.f63;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gt6 {
    public static final Charset a = Charset.forName("UTF-8");

    public static c73.c a(a73.c cVar) {
        return (c73.c) c73.c.a0().x(cVar.Z().a0()).v(cVar.c0()).u(cVar.b0()).t(cVar.a0()).h();
    }

    public static c73 b(a73 a73Var) {
        c73.b bVarU = c73.a0().u(a73Var.c0());
        Iterator it = a73Var.b0().iterator();
        while (it.hasNext()) {
            bVarU.t(a((a73.c) it.next()));
        }
        return (c73) bVarU.h();
    }

    public static void c(a73.c cVar) throws GeneralSecurityException {
        if (!cVar.d0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.a0())));
        }
        if (cVar.b0() == qj4.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.a0())));
        }
        if (cVar.c0() == q63.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.a0())));
        }
    }

    public static void d(a73 a73Var) {
        int iC0 = a73Var.c0();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (a73.c cVar : a73Var.b0()) {
            if (cVar.c0() == q63.ENABLED) {
                c(cVar);
                if (cVar.a0() == iC0) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (cVar.Z().Z() != f63.c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
