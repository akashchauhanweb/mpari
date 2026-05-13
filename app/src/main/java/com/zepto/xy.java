package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.app.Activity;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.widget.Toast;
import com.zepto.jt;
import com.zepto.s06;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class xy {
    public static xy l;
    public String a = "AttestationHelper";
    public final boolean b;
    public boolean c;
    public final boolean d;
    public boolean e;
    public final boolean f;
    public boolean g;
    public String h;
    public String i;
    public String j;
    public static final a k = new a(null);
    public static final List m = new ArrayList();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return xy.m;
        }

        public final xy b() {
            return xy.l;
        }

        public final void c() {
            if (b() == null) {
                d(new xy());
            }
        }

        public final void d(xy xyVar) {
            xy.l = xyVar;
        }
    }

    public xy() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        this.b = i >= 28 && jt.c.C().getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
        this.c = true;
        this.d = i >= 31 && jt.c.C().getPackageManager().hasSystemFeature("android.hardware.keystore.app_attest_key");
        this.e = true;
        if (i >= 31 && jt.c.C().getPackageManager().hasSystemFeature("android.software.device_id_attestation")) {
            z = true;
        }
        this.f = z;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
    }

    public static final void l() {
        Toast.makeText(jt.c.C(), "AttestationFailed", 0).show();
    }

    public final void e(qy qyVar) {
        try {
            a00 a00VarE = qyVar.e();
            Intrinsics.checkNotNullExpressionValue(a00VarE, "attestation.teeEnforced");
            String[] strArrH = h(a00VarE);
            a00 a00VarD = qyVar.d();
            Intrinsics.checkNotNullExpressionValue(a00VarD, "attestation.softwareEnforced");
            String[] strArrH2 = h(a00VarD);
            int length = strArrH.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                String str = "";
                if (i == 0) {
                    String str2 = strArrH[0];
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = strArrH2[0];
                        if (str2 != null) {
                            Intrinsics.checkNotNull(str2);
                        }
                        this.h = str;
                    }
                    str = str2;
                    this.h = str;
                } else if (i == 1) {
                    String str3 = strArrH[1];
                    if (str3 != null) {
                        Intrinsics.checkNotNull(str3);
                    } else {
                        str3 = strArrH2[1];
                        if (str3 != null) {
                            Intrinsics.checkNotNull(str3);
                        }
                        this.i = str;
                    }
                    str = str3;
                    this.i = str;
                } else if (i != 2) {
                    continue;
                } else {
                    String str4 = strArrH[2];
                    if (str4 != null) {
                        Intrinsics.checkNotNull(str4);
                    } else {
                        str4 = strArrH2[2];
                        if (str4 != null) {
                            Intrinsics.checkNotNull(str4);
                        }
                        this.j = str;
                    }
                    str = str4;
                    this.j = str;
                }
                i = i2;
            }
        } catch (Exception e) {
            nn3.c(nn3.a, this.a, String.valueOf(e.getMessage()), null, 4, null);
        }
    }

    public final void f(az azVar) {
        s06 s06VarA;
        Log.i("Validation", "flag validation one inside");
        try {
            qy qyVarA = azVar.a();
            e(qyVarA);
            if (!azVar.b()) {
                zy zyVar = new zy("ATTEST_SUCCESS", NativeInteractor.a.V0(), this.h, this.i, this.j);
                jt.a aVar = jt.c;
                aVar.r0(zyVar);
                aVar.s0("L5");
                s06.a aVar2 = s06.m;
                if (aVar2.a() != null) {
                    s06 s06VarA2 = aVar2.a();
                    Intrinsics.checkNotNull(s06VarA2);
                    s06VarA2.J("L5");
                }
            }
            a00 a00VarE = qyVarA.e();
            Boolean boolValueOf = null;
            re5 re5VarJ = a00VarE == null ? null : a00VarE.j();
            if (re5VarJ != null) {
                boolValueOf = Boolean.valueOf(re5VarJ.b());
            }
            boolean z = false;
            if (re5VarJ != null && re5VarJ.a() == 0) {
                z = true;
            }
            boolean z2 = !z;
            if (boolValueOf == null) {
                jt.a aVar3 = jt.c;
                if (aVar3.j() == null) {
                    aVar3.r0(new zy("ATTEST_SUCCESS", NativeInteractor.a.W0(), this.h, this.i, this.j));
                } else {
                    zy zyVarJ = aVar3.j();
                    Intrinsics.checkNotNull(zyVarJ);
                    zyVarJ.setAttestationResInfo(((Object) zyVarJ.getAttestationResInfo()) + "|-|" + NativeInteractor.a.W0());
                    aVar3.r0(zyVarJ);
                }
                aVar3.s0("L4");
                s06.a aVar4 = s06.m;
                if (aVar4.a() != null) {
                    s06 s06VarA3 = aVar4.a();
                    Intrinsics.checkNotNull(s06VarA3);
                    s06VarA3.J("L4");
                }
            } else if (!boolValueOf.booleanValue()) {
                zy zyVar2 = new zy("ATTEST_SUCCESS", NativeInteractor.a.Y0(), this.h, this.i, this.j);
                jt.a aVar5 = jt.c;
                aVar5.r0(zyVar2);
                aVar5.s0("L3");
                s06.a aVar6 = s06.m;
                if (aVar6.a() != null) {
                    s06 s06VarA4 = aVar6.a();
                    Intrinsics.checkNotNull(s06VarA4);
                    s06VarA4.J("L3");
                }
            } else if (z2) {
                zy zyVar3 = new zy("ATTEST_SUCCESS", NativeInteractor.a.X0(), this.h, this.i, this.j);
                jt.a aVar7 = jt.c;
                aVar7.r0(zyVar3);
                aVar7.s0("L2");
                s06.a aVar8 = s06.m;
                if (aVar8.a() != null) {
                    s06 s06VarA5 = aVar8.a();
                    Intrinsics.checkNotNull(s06VarA5);
                    s06VarA5.J("L2");
                }
            } else {
                zy zyVar4 = new zy("ATTEST_SUCCESS", NativeInteractor.a.X0(), this.h, this.i, this.j);
                jt.a aVar9 = jt.c;
                aVar9.r0(zyVar4);
                aVar9.s0("L1");
                s06.a aVar10 = s06.m;
                if (aVar10.a() != null) {
                    s06 s06VarA6 = aVar10.a();
                    Intrinsics.checkNotNull(s06VarA6);
                    s06VarA6.J("L1");
                }
            }
            s06.a aVar11 = s06.m;
            s06 s06VarA7 = aVar11.a();
            Intrinsics.checkNotNull(s06VarA7);
            zy zyVarF = s06VarA7.f();
            if (zyVarF == null) {
                s06 s06VarA8 = aVar11.a();
                if (s06VarA8 == null) {
                    return;
                }
                s06VarA8.D(jt.c.j());
                return;
            }
            if (Intrinsics.areEqual(zyVarF.getAttestationResInfo(), NativeInteractor.a.X0()) && (s06VarA = aVar11.a()) != null) {
                s06VarA.D(jt.c.j());
            }
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus("Error: ", e), e);
        }
    }

    public final void g(X509Certificate[] x509CertificateArr) {
        try {
            int length = x509CertificateArr.length;
            int i = 0;
            while (i < length) {
                X509Certificate x509Certificate = x509CertificateArr[i];
                i++;
                if (x509Certificate != null) {
                    String string = x509Certificate.getIssuerDN().toString();
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = string.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) nativeInteractor.m("Y2FsaWZvcm5pYQ=="), false, 2, (Object) null)) {
                        String string2 = x509Certificate.getIssuerDN().toString();
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        String lowerCase2 = string2.toLowerCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) nativeInteractor.m("Y2hpdGVyb21hbg=="), false, 2, (Object) null)) {
                        }
                    }
                    m.add(x509Certificate.getIssuerDN().toString());
                    break;
                }
            }
            if (on7.b(x509CertificateArr)) {
                return;
            }
            m.add(NativeInteractor.a.V0());
        } catch (GeneralSecurityException e) {
            m.add(e.toString());
            nn3.c(nn3.a, this.a, Intrinsics.stringPlus("Certificate is not trusted \n", e), null, 4, null);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final String[] h(a00 a00Var) {
        String string;
        String[] strArr = new String[3];
        Set setI = a00Var.i();
        String string2 = null;
        strArr[0] = setI == null ? null : a00.s(setI);
        Set setH = a00Var.h();
        strArr[1] = setH == null ? null : a00.c(setH);
        ry ryVarF = a00Var.f();
        if (ryVarF != null && (string = ryVarF.toString()) != null) {
            string2 = StringsKt__StringsKt.trim((CharSequence) string).toString();
        }
        strArr[2] = string2;
        return strArr;
    }

    public final az i(String str, boolean z, boolean z2) {
        String message;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            j(str, z, z2);
            Certificate[] certificateChain = keyStore.getCertificateChain(str);
            int length = certificateChain.length;
            X509Certificate[] x509CertificateArr = new X509Certificate[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                Certificate certificate = certificateChain[i];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                x509CertificateArr[i] = (X509Certificate) certificate;
                i = i2;
            }
            try {
                boolean zA = on7.a(x509CertificateArr);
                try {
                    qy qyVar = new qy(x509CertificateArr[0]);
                    g(x509CertificateArr);
                    return new az(z, qyVar, zA);
                } catch (CertificateParsingException e) {
                    throw new sy(2, e);
                }
            } catch (GeneralSecurityException e2) {
                throw new sy(1, e2);
            }
        } catch (ProviderException e3) {
            if (Build.VERSION.SDK_INT >= 28 && ty.a(e3)) {
                throw new sy(3, e3);
            }
            Throwable cause = e3.getCause();
            if (cause == null || (message = cause.getMessage()) == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "device ids", false, 2, (Object) null)) {
                throw new sy(0, e3);
            }
            throw new sy(4, e3);
        } catch (Exception e4) {
            throw new sy(0, e4);
        }
    }

    public final void j(String str, boolean z, boolean z2) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        Date date = new Date();
        Date date2 = new Date(date.getTime() + ((long) DurationKt.NANOS_IN_MILLIS));
        KeyGenParameterSpec.Builder keyValidityForConsumptionEnd = new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(new Date(date.getTime() + ((long) 2000000)));
        String string = date.toString();
        Intrinsics.checkNotNullExpressionValue(string, "now.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        KeyGenParameterSpec.Builder attestationChallenge = keyValidityForConsumptionEnd.setAttestationChallenge(bytes);
        Intrinsics.checkNotNullExpressionValue(attestationChallenge, "Builder(alias, KeyProper…toString().toByteArray())");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && z2) {
            attestationChallenge.setDevicePropertiesAttestationIncluded(true);
        }
        if (i >= 28 && z) {
            attestationChallenge.setIsStrongBoxBacked(true);
        }
        attestationChallenge.setDigests("NONE", "SHA-256");
        keyPairGenerator.initialize(attestationChallenge.build());
        keyPairGenerator.generateKeyPair();
    }

    public final void k() {
        Throwable cause;
        Activity activityR;
        s06 s06VarA;
        boolean z = false;
        boolean z2 = this.b && this.c;
        if (this.f && this.g) {
            z = true;
        }
        try {
            f(i("Key_" + z2 + '_' + z, z2, z));
        } catch (Throwable th) {
            jt.a aVar = jt.c;
            aVar.q0(String.valueOf(th.getMessage()));
            boolean z3 = th instanceof sy;
            if (z3) {
                cause = th.getCause();
                Intrinsics.checkNotNull(cause);
            } else {
                cause = th;
            }
            nn3 nn3Var = nn3.a;
            nn3Var.f(this.a, Intrinsics.stringPlus("Do attestation error.", cause));
            if (z3) {
                nn3Var.f(this.a, String.valueOf(th));
            } else {
                nn3Var.f(this.a, String.valueOf(th));
            }
            Log.i("Validation", "flag validation two inside");
            aVar.r0(new zy("ATTEST_FAILED", th.getMessage(), this.h, this.i, this.j));
            s06.a aVar2 = s06.m;
            s06 s06VarA2 = aVar2.a();
            Intrinsics.checkNotNull(s06VarA2);
            if (s06VarA2.f() == null && (s06VarA = aVar2.a()) != null) {
                s06VarA.D(aVar.j());
            }
            if (!gw4.a.b() || (activityR = aVar.r()) == null) {
                return;
            }
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.wy
                @Override // java.lang.Runnable
                public final void run() {
                    xy.l();
                }
            });
        }
    }
}
