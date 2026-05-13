package com.zepto;

import com.zepto.n22;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m22 {
    public static final m22 b = new m22(new n22.a());
    public static final m22 c = new m22(new n22.e());
    public static final m22 d = new m22(new n22.g());
    public static final m22 e = new m22(new n22.f());
    public static final m22 f = new m22(new n22.b());
    public static final m22 g = new m22(new n22.d());
    public static final m22 h = new m22(new n22.c());
    public final e a;

    public static class b implements e {
        public final n22 a;

        @Override // com.zepto.m22.e
        public Object a(String str) {
            Iterator it = m22.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            return this.a.a(str, null);
        }

        public b(n22 n22Var) {
            this.a = n22Var;
        }
    }

    public static class c implements e {
        public final n22 a;

        @Override // com.zepto.m22.e
        public Object a(String str) {
            return this.a.a(str, null);
        }

        public c(n22 n22Var) {
            this.a = n22Var;
        }
    }

    public static class d implements e {
        public final n22 a;

        @Override // com.zepto.m22.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = m22.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(n22 n22Var) {
            this.a = n22Var;
        }
    }

    public interface e {
        Object a(String str);
    }

    public m22(n22 n22Var) {
        if (hg6.c()) {
            this.a = new d(n22Var);
        } else if (w86.b()) {
            this.a = new b(n22Var);
        } else {
            this.a = new c(n22Var);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.a.a(str);
    }
}
