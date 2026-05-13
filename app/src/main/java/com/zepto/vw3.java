package com.zepto;

import com.zepto.dv4;
import com.zepto.tw3;
import com.zepto.uw3;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class vw3 {
    public static final tw3.a a = new b(null);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q63.values().length];
            a = iArr;
            try {
                iArr[q63.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[q63.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[q63.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements tw3.a {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.zepto.tw3.a
        public void a() {
        }

        @Override // com.zepto.tw3.a
        public void b(int i, long j) {
        }
    }

    public static uw3 a(dv4 dv4Var) {
        uw3.b bVarA = uw3.a();
        bVarA.d(dv4Var.d());
        Iterator it = dv4Var.c().iterator();
        while (it.hasNext()) {
            for (dv4.c cVar : (List) it.next()) {
                bVarA.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (dv4Var.e() != null) {
            bVarA.e(dv4Var.e().d());
        }
        try {
            return bVarA.b();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static p63 c(q63 q63Var) {
        int i = a.a[q63Var.ordinal()];
        if (i == 1) {
            return p63.b;
        }
        if (i == 2) {
            return p63.c;
        }
        if (i == 3) {
            return p63.d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
