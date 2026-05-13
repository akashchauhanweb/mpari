package com.zepto;

import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface nt {

    public static final class a {
        public static /* synthetic */ void a(nt ntVar, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callSkipAlertApi");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            ntVar.e(list, z);
        }

        public static /* synthetic */ void b(nt ntVar, X509Certificate[] x509CertificateArr, Runnable runnable, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchServerConfig");
            }
            if ((i & 1) != 0) {
                x509CertificateArr = null;
            }
            if ((i & 2) != 0) {
                runnable = null;
            }
            ntVar.h(x509CertificateArr, runnable);
        }
    }

    void a();

    void b(String str);

    void c();

    void d(String str);

    void e(List list, boolean z);

    void f();

    void g();

    void h(X509Certificate[] x509CertificateArr, Runnable runnable);

    void i();
}
