package com.zepto;

import com.zepto.yf4;
import com.zepto.zr2;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gq6 {

    public class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static yf4 a() {
        try {
            zr2 zr2VarD = new zr2().d(zr2.a.BODY);
            TrustManager[] trustManagerArr = {new a()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4.a aVarO = aVar.f(15L, timeUnit).L(15L, timeUnit).O(15L, timeUnit);
            aVarO.N(socketFactory, (X509TrustManager) trustManagerArr[0]);
            aVarO.a(zr2VarD);
            aVarO.K(new b());
            return aVarO.c();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
