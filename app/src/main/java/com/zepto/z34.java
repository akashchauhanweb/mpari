package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.zepto.id5;
import com.zepto.jt;
import com.zepto.nt;
import com.zepto.s06;
import com.zepto.z34;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class z34 {
    public static tc5 b;
    public static final z34 a = new z34();
    public static final String c = "NetworkCallSingleton";

    public interface a {
        void a();

        void b(int i, String str);
    }

    public static final class b extends fs2 {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref.ObjectRef objectRef, Context context) {
            super(null, (SSLSocketFactory) objectRef.element);
            this.a = objectRef;
            this.b = context;
        }

        public static final boolean b(Context context, String hostName, SSLSession sSLSession) {
            Intrinsics.checkNotNullParameter(context, "$context");
            String strY = NativeInteractor.a.Y();
            Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
            if (hostName.length() == 0) {
                z34.a.s(context, Intrinsics.stringPlus("HostName is Empty flag :", Boolean.valueOf(hostName.length() == 0)));
            } else {
                if (Intrinsics.areEqual(hostName, strY)) {
                    return true;
                }
                z34.a.s(context, Intrinsics.stringPlus("HostName is ", hostName));
            }
            return false;
        }

        @Override // com.zepto.fs2
        public HttpURLConnection createConnection(URL url) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpURLConnection httpURLConnectionCreateConnection = super.createConnection(url);
            if (httpURLConnectionCreateConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionCreateConnection;
            final Context context = this.b;
            httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.zepto.a44
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return z34.b.b(context, str, sSLSession);
                }
            });
            return httpsURLConnection;
        }
    }

    public static final class c implements X509TrustManager {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] certs, String str) throws CertificateException {
            Intrinsics.checkNotNullParameter(certs, "certs");
            String strU = NativeInteractor.a.U();
            z34 z34Var = z34.a;
            if (z34Var.j(certs, strU)) {
                return;
            }
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.B0(this.a) || scanUtils.s0(this.a)) {
                mo5.a.r(true);
                throw new CertificateException("checkServerTrusted None of the TrustManagers trust this certificate chain");
            }
            z34Var.u(certs);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] certs, String str) throws CertificateException {
            Intrinsics.checkNotNullParameter(certs, "certs");
            String strU = NativeInteractor.a.U();
            z34 z34Var = z34.a;
            if (z34Var.j(certs, strU)) {
                return;
            }
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.B0(this.a) || scanUtils.s0(this.a)) {
                mo5.a.r(true);
                throw new CertificateException("checkServerTrusted None of the TrustManagers trust this certificate chain");
            }
            z34Var.u(certs);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ int e;
        public final /* synthetic */ a f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, a aVar, Continuation continuation) {
            super(2, continuation);
            this.e = i;
            this.f = aVar;
        }

        public static final void g(a aVar, p75 p75Var) {
            try {
                jt.a aVar2 = jt.c;
                aVar2.o0(aVar2.e() + "|Token-R" + ScanUtils.a.m1());
                nn3 nn3Var = nn3.a;
                Intrinsics.checkNotNull(p75Var);
                nn3Var.f("JWTTest", Intrinsics.stringPlus("JToken ==>>: ", p75Var.getStatus()));
                nn3Var.f("JWTTest", Intrinsics.stringPlus("JToken ==>>: ", p75Var.getToken()));
                NativeInteractor nativeInteractor = NativeInteractor.a;
                nativeInteractor.x0(p75Var.getNetworkAddress());
                nativeInteractor.y0(p75Var.getTrust());
                s06.a aVar3 = s06.m;
                s06 s06VarA = aVar3.a();
                if (s06VarA != null) {
                    s06VarA.Q(p75Var.getTrust());
                }
                s06 s06VarA2 = aVar3.a();
                if (s06VarA2 != null) {
                    s06VarA2.L(p75Var.getToken());
                }
                aVar.a();
            } catch (Exception e) {
                aVar.b(503, Intrinsics.stringPlus("fromToken:-", e));
                nn3.a.b(z34.c, Intrinsics.stringPlus("JWTTest Listener", e), e);
            } catch (UnsatisfiedLinkError e2) {
                nn3.a.f(z34.c, Intrinsics.stringPlus(">>>>>>>>>>>> JWTTest NDK: Error: ", e2));
            }
        }

        public static final void h(final a aVar, bu7 bu7Var) {
            String localizedMessage;
            try {
                nn3 nn3Var = nn3.a;
                String string = null;
                nn3Var.f(z34.c, Intrinsics.stringPlus("error called ", bu7Var == null ? null : bu7Var.toString()));
                ScanCore.a.p1(new Runnable() { // from class: com.zepto.d44
                    @Override // java.lang.Runnable
                    public final void run() {
                        z34.d.i(aVar);
                    }
                }, bu7Var);
                if (bu7Var != null && (localizedMessage = bu7Var.getLocalizedMessage()) != null && !StringsKt__StringsJVMKt.isBlank(localizedMessage) && bu7Var.networkResponse != null) {
                    nn3Var.b(z34.c, Intrinsics.stringPlus("getToken error ==>>: ", bu7Var), bu7Var);
                    m44 m44Var = bu7Var.networkResponse;
                    int i = m44Var.statusCode;
                    if (i != 500 && i != 503) {
                        if (!(bu7Var instanceof n94) && !(bu7Var instanceof dg6) && i != 503 && i != 404) {
                            if (m44Var != null && i == 400) {
                                z34.a.l(1003, aVar);
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("fromToken:-");
                            sb.append((Object) bu7Var.getMessage());
                            sb.append('|');
                            String localizedMessage2 = bu7Var.getLocalizedMessage();
                            if (localizedMessage2 == null) {
                                localizedMessage2 = null;
                            }
                            sb.append((Object) localizedMessage2);
                            sb.append('|');
                            m44 m44Var2 = bu7Var.networkResponse;
                            if (m44Var2 != null) {
                                string = Integer.valueOf(m44Var2.statusCode).toString();
                            }
                            sb.append((Object) string);
                            aVar.b(503, sb.toString());
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fromToken:-");
                        sb2.append((Object) bu7Var.getMessage());
                        sb2.append('|');
                        String localizedMessage3 = bu7Var.getLocalizedMessage();
                        if (localizedMessage3 == null) {
                            localizedMessage3 = null;
                        }
                        sb2.append((Object) localizedMessage3);
                        sb2.append('|');
                        m44 m44Var3 = bu7Var.networkResponse;
                        if (m44Var3 != null) {
                            string = Integer.valueOf(m44Var3.statusCode).toString();
                        }
                        sb2.append((Object) string);
                        aVar.b(503, sb2.toString());
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("fromToken:-");
                    sb3.append((Object) bu7Var.getMessage());
                    sb3.append('|');
                    String localizedMessage4 = bu7Var.getLocalizedMessage();
                    if (localizedMessage4 == null) {
                        localizedMessage4 = null;
                    }
                    sb3.append((Object) localizedMessage4);
                    sb3.append('|');
                    m44 m44Var4 = bu7Var.networkResponse;
                    if (m44Var4 != null) {
                        string = Integer.valueOf(m44Var4.statusCode).toString();
                    }
                    sb3.append((Object) string);
                    aVar.b(503, sb3.toString());
                    return;
                }
                if (bu7Var != null) {
                    string = bu7Var.toString();
                }
                aVar.b(503, Intrinsics.stringPlus("fromToken:-error msg is ", string));
            } catch (Exception e) {
                aVar.b(503, Intrinsics.stringPlus("fromToken:-", e));
                nn3.a.b(z34.c, Intrinsics.stringPlus("GET_JTOKEN ErrorListener", e), e);
            } catch (UnsatisfiedLinkError e2) {
                nn3.a.f(z34.c, Intrinsics.stringPlus(">>>>>>>>>>>> JWTTest NDK: Error: ", e2));
            }
        }

        public static final void i(a aVar) {
            eg5 eg5Var = eg5.a;
            if (eg5Var.e() < 2) {
                eg5Var.p(eg5Var.e() + 1);
                nn3.a.f("RE-TRYLOG", Intrinsics.stringPlus("JTOKEN CALLED:-", Integer.valueOf(eg5Var.e())));
                z34.a.l(1003, aVar);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nn3.a.f("JWTTest", Intrinsics.stringPlus("", Boxing.boxInt(this.e)));
                int i = this.e;
                if (i == -3 || i != 1003) {
                    z34.a.l(1003, this.f);
                } else {
                    try {
                        js0 js0Var = new js0();
                        fj1 fj1VarB = fj1.j.b();
                        js0Var.setJwtRequest(fj1VarB == null ? null : fj1VarB.l());
                        jt.a aVar = jt.c;
                        aVar.o0(aVar.e() + "|Token-C" + ScanUtils.a.m1());
                        ea0 ea0Var = ea0.a;
                        final a aVar2 = this.f;
                        id5.b bVar = new id5.b() { // from class: com.zepto.b44
                            @Override // com.zepto.id5.b
                            public final void onResponse(Object obj2) {
                                z34.d.g(aVar2, (p75) obj2);
                            }
                        };
                        final a aVar3 = this.f;
                        ea0Var.g(js0Var, bVar, new id5.a() { // from class: com.zepto.c44
                            @Override // com.zepto.id5.a
                            public final void onErrorResponse(bu7 bu7Var) {
                                z34.d.h(aVar3, bu7Var);
                            }
                        });
                    } catch (Exception e) {
                        this.f.b(503, Intrinsics.stringPlus("fromToken:-", e));
                        nn3.a.b(z34.c, Intrinsics.stringPlus("GET_JTOKEN", e), e);
                    } catch (UnsatisfiedLinkError e2) {
                        nn3.a.f(z34.c, Intrinsics.stringPlus(">>>>>>>>>>>> JWTTest NDK: Error: ", e2));
                    }
                }
            } catch (Exception e3) {
                this.f.b(503, Intrinsics.stringPlus("fromToken:-", e3));
                nn3.a.b(z34.c, Intrinsics.stringPlus("getToken", e3), e3);
            } catch (UnsatisfiedLinkError e4) {
                nn3.c(nn3.a, z34.c, Intrinsics.stringPlus(">>>>>>>>>>>> JWTTest NDK: Error: ", e4), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Continuation continuation) {
            super(2, continuation);
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                z34.b = z34.a.k(this.e);
            } catch (IOException e) {
                nn3.a.b(z34.c, e.toString(), e);
            } catch (KeyManagementException e2) {
                nn3.a.b(z34.c, e2.toString(), e2);
            } catch (KeyStoreException e3) {
                nn3.a.b(z34.c, e3.toString(), e3);
            } catch (NoSuchAlgorithmException e4) {
                nn3.a.b(z34.c, e4.toString(), e4);
            } catch (CertificateException e5) {
                nn3.a.b(z34.c, e5.toString(), e5);
            }
            if (z34.b != null) {
                ea0 ea0Var = ea0.a;
                Context context = this.e;
                tc5 tc5Var = z34.b;
                Intrinsics.checkNotNull(tc5Var);
                ea0Var.f(context, tc5Var);
            } else {
                nn3.a.f(z34.c, "RequestQueue is Null");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strValueOf;
            String strW0;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uu uuVar = new uu();
                jt.a aVar = jt.c;
                PackageManager packageManager = aVar.C().getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "AppProtecttInteractor.mAppContext.packageManager");
                String packageName = aVar.C().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "AppProtecttInteractor.mAppContext.packageName");
                List listB = uuVar.b(packageManager, packageName);
                Intrinsics.checkNotNull(listB);
                strValueOf = String.valueOf(listB.get(0));
                strW0 = ScanCore.a.w0();
            } catch (Exception e) {
                nn3.c(nn3.a, z34.c, Intrinsics.stringPlus(">>>>>>>>>>>> reverseEngineeringDetection: Error: ", e), null, 4, null);
            }
            if (strW0.length() == 0) {
                nn3.a.f(z34.c, "Exit.....");
                return Unit.INSTANCE;
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) strW0, (CharSequence) strValueOf, false, 2, (Object) null)) {
                ScanUtils.a.b0(this.e, strValueOf);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((g) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                mo5 mo5Var = mo5.a;
                if (mo5Var.i() && z34.a.p(this.e)) {
                    jt.a aVar = jt.c;
                    ScanAlerts scanAlertsL = aVar.L();
                    Intrinsics.checkNotNull(scanAlertsL);
                    if5 if5VarQ = scanAlertsL.Q(39);
                    if (if5VarQ != null) {
                        StringBuilder sb = new StringBuilder();
                        ScanCore scanCore = ScanCore.a;
                        sb.append(scanCore.y0(aVar.C()));
                        sb.append('|');
                        sb.append(scanCore.x0(aVar.C()));
                        pd5.a.c(if5VarQ, this.f + '|' + sb.toString());
                    } else {
                        nn3.a.f(z34.c, Intrinsics.stringPlus("EXit...........SSLFlag", Boxing.boxBoolean(mo5Var.i())));
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, z34.c, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ X509Certificate[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(X509Certificate[] x509CertificateArr, Continuation continuation) {
            super(2, continuation);
            this.e = x509CertificateArr;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((h) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nt ntVarH = jt.c.H();
                if (ntVarH != null) {
                    nt.a.b(ntVarH, this.e, null, 2, null);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, z34.c, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void n(int i, p75 p75Var) {
        NativeInteractor.a.x0(p75Var.getNetworkAddress());
        jt.a aVar = jt.c;
        aVar.A0(p75Var.getServerCurrentTimestamp());
        if (i != 41 || aVar.s() == 0) {
            return;
        }
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        if5 if5VarQ = scanAlertsL.Q(41);
        if (if5VarQ != null) {
            ScanUtils.a.I(if5VarQ, aVar.C());
        }
    }

    public static final void o(bu7 bu7Var) {
        nn3.c(nn3.a, c, bu7Var.toString(), null, 4, null);
    }

    public final boolean j(X509Certificate[] x509CertificateArr, String str) {
        try {
            int length = x509CertificateArr.length;
            int i = 0;
            while (i < length) {
                X509Certificate x509Certificate = x509CertificateArr[i];
                int i2 = i + 1;
                jt.c.w0(true);
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "#", false, 2, (Object) null)) {
                    Iterator it = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) x509Certificate.getPublicKey().toString(), (CharSequence) it.next(), false, 2, (Object) null)) {
                            return true;
                        }
                    }
                } else if (StringsKt__StringsKt.contains$default((CharSequence) x509Certificate.getPublicKey().toString(), (CharSequence) str, false, 2, (Object) null)) {
                    return true;
                }
                i = i2;
            }
            return false;
        } catch (Exception e2) {
            nn3.a.b(c, e2.toString(), e2);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, javax.net.ssl.SSLSocketFactory] */
    public final tc5 k(Context context) {
        try {
            TrustManager[] trustManagerArr = {new c(context)};
            SSLContext sSLContext = SSLContext.getInstance("TLSV1.2");
            sSLContext.init(null, trustManagerArr, null);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = sSLContext.getSocketFactory();
            return au7.newRequestQueue(context, (u40) new b(objectRef, context));
        } catch (Exception e2) {
            nn3.a.b(c, Intrinsics.stringPlus("getPinnedRequestQueue", e2), e2);
            return null;
        }
    }

    public final void l(int i, a authListener) {
        Intrinsics.checkNotNullParameter(authListener, "authListener");
        f80.d(qj2.c, null, null, new d(i, authListener, null), 3, null);
    }

    public final void m(final int i) {
        try {
            js0 js0Var = new js0();
            fj1 fj1VarB = fj1.j.b();
            js0Var.setJwtRequest(fj1VarB == null ? null : fj1VarB.l());
            ea0.a.g(js0Var, new id5.b() { // from class: com.zepto.x34
                @Override // com.zepto.id5.b
                public final void onResponse(Object obj) {
                    z34.n(i, (p75) obj);
                }
            }, new id5.a() { // from class: com.zepto.y34
                @Override // com.zepto.id5.a
                public final void onErrorResponse(bu7 bu7Var) {
                    z34.o(bu7Var);
                }
            });
        } catch (Exception e2) {
            nn3.a.f(c, e2.toString());
        }
    }

    public final boolean p(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager == null ? null : connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public final void q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, qk1.a(), null, new e(context, null), 2, null);
    }

    public final void r(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new f(rule, null), 3, null);
    }

    public final void s(Context context, String info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        f80.d(qj2.c, null, null, new g(context, info, null), 3, null);
    }

    public final void t(X509Certificate[] certs, String sslKey) {
        Intrinsics.checkNotNullParameter(certs, "certs");
        Intrinsics.checkNotNullParameter(sslKey, "sslKey");
        try {
            if (j(certs, sslKey) || !mo5.a.i()) {
                return;
            }
            s(jt.c.C(), "checkServerTrusted None of the TrustManagers trust this certificate chain");
        } catch (Exception e2) {
            nn3.c(nn3.a, c, e2.toString(), null, 4, null);
        }
    }

    public final void u(X509Certificate[] x509CertificateArr) {
        f80.d(qj2.c, null, null, new h(x509CertificateArr, null), 3, null);
    }
}
