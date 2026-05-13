package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import com.zepto.jt;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class on7 {
    public static boolean a(X509Certificate[] x509CertificateArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        X509Certificate x509Certificate = x509CertificateArr[x509CertificateArr.length - 1];
        m53 m53VarB = xb0.b(jt.e0.getResources().openRawResource(t05.a), "entries");
        int length = x509CertificateArr.length - 1;
        while (length >= 0) {
            X509Certificate x509Certificate2 = x509CertificateArr[length];
            x509Certificate2.checkValidity();
            x509Certificate2.verify(x509Certificate.getPublicKey());
            jt.a aVar = jt.c;
            aVar.F0(aVar.x() + "|" + x509Certificate2.getIssuerDN());
            aVar.G0(aVar.y() + "|" + x509Certificate2.getSubjectDN());
            xb0.a(x509Certificate2.getSerialNumber(), m53VarB);
            length += -1;
            x509Certificate = x509Certificate2;
        }
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] tBSCertificate = x509CertificateArr[x509CertificateArr.length - 1].getTBSCertificate();
        for (String str : NativeInteractor.a.k()) {
            if (Arrays.equals(((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))).getTBSCertificate(), tBSCertificate)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(X509Certificate[] x509CertificateArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        X509Certificate x509Certificate = x509CertificateArr[x509CertificateArr.length - 1];
        m53 m53VarB = xb0.b(jt.e0.getResources().openRawResource(t05.a), "entries-new");
        int length = x509CertificateArr.length - 1;
        while (length >= 0) {
            X509Certificate x509Certificate2 = x509CertificateArr[length];
            x509Certificate2.checkValidity();
            x509Certificate2.verify(x509Certificate.getPublicKey());
            xb0.a(x509Certificate2.getSerialNumber(), m53VarB);
            length--;
            x509Certificate = x509Certificate2;
        }
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] tBSCertificate = x509CertificateArr[x509CertificateArr.length - 1].getTBSCertificate();
        for (String str : NativeInteractor.a.k()) {
            if (Arrays.equals(((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))).getTBSCertificate(), tBSCertificate)) {
                return true;
            }
        }
        return false;
    }
}
