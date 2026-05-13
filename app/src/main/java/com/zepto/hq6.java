package com.zepto;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class hq6 {

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

    public static HashMap a() {
        try {
            HashMap map = new HashMap();
            TrustManager[] trustManagerArr = {new a()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            map.put("sslSocketFactory", sSLContext.getSocketFactory());
            map.put("trustAllCerts", (X509TrustManager) trustManagerArr[0]);
            return map;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
