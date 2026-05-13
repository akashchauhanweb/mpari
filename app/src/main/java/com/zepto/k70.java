package com.zepto;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k70 extends Provider {
    public static String c = "BouncyCastle Post-Quantum Security Provider v1.70";
    public static String e = "BCPQC";
    public static final Map f = new HashMap();
    public static final String[] g = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            k70.this.d();
            return null;
        }
    }

    public static class b implements PrivilegedAction {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public k70() {
        super(e, 1.7d, c);
        AccessController.doPrivileged(new a());
    }

    private void b(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class clsC = c(k70.class, str + strArr[i] + "$Mappings");
            if (clsC != null) {
                try {
                    wb0.a(clsC.newInstance());
                    throw null;
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e2);
                }
            }
        }
    }

    public static Class c(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        b("org.bouncycastle.pqc.jcajce.provider.", g);
    }
}
