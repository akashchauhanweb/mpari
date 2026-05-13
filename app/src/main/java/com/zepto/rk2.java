package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import com.google.gson.Gson;
import com.zepto.g90;
import com.zepto.id5;
import com.zepto.ru5;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rk2 extends ic5 {
    public static final a l = new a(null);
    public static final String m;
    public final Class c;
    public final id5.b e;
    public final String f;
    public final String g;
    public final Gson h;
    public final String i;
    public mi2 j;
    public final tf1 k;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g90.a b(m44 m44Var) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, String> map = m44Var.headers;
            String str = map == null ? null : map.get("Date");
            long dateAsEpoch = str != null ? xr2.parseDateAsEpoch(str) : 0L;
            String str2 = map != null ? map.get("ETag") : null;
            g90.a aVar = new g90.a();
            aVar.data = m44Var.data;
            aVar.etag = str2;
            aVar.softTtl = 180000 + jCurrentTimeMillis;
            aVar.ttl = jCurrentTimeMillis + 1000;
            aVar.serverDate = dateAsEpoch;
            aVar.responseHeaders = map;
            return aVar;
        }
    }

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("application/json; charset=%s", Arrays.copyOf(new Object[]{"utf-8"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk2(int i, String url, Class myClass, String requestBody, id5.b listener, id5.a errorListener) {
        super(i, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(myClass, "myClass");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.c = myClass;
        this.e = listener;
        String TAG = rk2.class.getSimpleName();
        this.f = TAG;
        this.g = "GsonRequest";
        this.h = new Gson();
        tf1 tf1Var = new tf1(5000, 0, 1.0f);
        this.k = tf1Var;
        setRetryPolicy(tf1Var);
        this.j = new mi2();
        nn3 nn3Var = nn3.a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        nn3Var.f(TAG, "##### Server ->>> Request: Before Encryption Request ---->>>> " + url + " --------> " + requestBody);
        if (requestBody.length() == 0) {
            this.i = requestBody;
        } else {
            this.i = c(requestBody);
        }
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        nn3Var.f(TAG, "##### Server ->>> Request: After Encryption Request ---->>>> " + url + " -------" + ((Object) this.i));
        setShouldCache(false);
        ScanCore.a.Z0(url);
    }

    public final String a() {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (nativeInteractor.V().length() == 0) {
            nativeInteractor.D0(ru5.c.e());
        }
        ru5.a aVar = ru5.c;
        return aVar.b(nativeInteractor.V(), aVar.g(nativeInteractor.F()));
    }

    public final String b() {
        String url = getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "this.url");
        if (!StringsKt__StringsJVMKt.endsWith$default(url, "handshake", false, 2, null)) {
            String url2 = getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "this.url");
            if (!StringsKt__StringsJVMKt.endsWith$default(url2, hs.a.a(), false, 2, null)) {
                String url3 = getUrl();
                Intrinsics.checkNotNullExpressionValue(url3, "this.url");
                if (StringsKt__StringsJVMKt.endsWith$default(url3, "validatedevice", false, 2, null)) {
                    return NativeInteractor.a.K();
                }
                String url4 = getUrl();
                Intrinsics.checkNotNullExpressionValue(url4, "this.url");
                if (!StringsKt__StringsJVMKt.endsWith$default(url4, "fetchserverconfig", false, 2, null)) {
                    return NativeInteractor.a.q();
                }
                a();
                return NativeInteractor.a.V();
            }
        }
        return NativeInteractor.a.C();
    }

    public final String c(String str) {
        String json;
        u uVar = new u(null, null, null, null, null, 31, null);
        try {
            mi2 mi2Var = this.j;
            Intrinsics.checkNotNull(mi2Var);
            String strB = b();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            uVar.setEncryptedRequest(mi2Var.d(str, strB, nativeInteractor.D()));
            qq0 qq0VarP = jt.c.p();
            Integer numValueOf = qq0VarP == null ? null : Integer.valueOf(qq0VarP.getChannelId());
            Intrinsics.checkNotNull(numValueOf);
            uVar.setChannelId(String.valueOf(numValueOf.intValue()));
            String url = getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "this.url");
            if (StringsKt__StringsJVMKt.endsWith$default(url, "validatedevice", false, 2, null)) {
                uVar.setKey(nativeInteractor.L());
            } else {
                String url2 = getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "url");
                if (StringsKt__StringsJVMKt.endsWith$default(url2, "fetchserverconfig", false, 2, null)) {
                    uVar.setKey(a());
                } else {
                    uVar.setKey(nativeInteractor.y());
                }
            }
            uVar.setSessionId(nativeInteractor.getSessionToken());
            uVar.setFlag("4.0");
            json = new Gson().toJson(uVar);
        } catch (Exception e) {
            nn3 nn3Var = nn3.a;
            String TAG = this.f;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            nn3Var.b(TAG, e.toString(), e);
            json = "";
        }
        Intrinsics.checkNotNull(json);
        return json;
    }

    @Override // com.zepto.ic5
    public void deliverResponse(Object obj) {
        try {
            if (Intrinsics.areEqual(obj, "") || obj == null) {
                nn3 nn3Var = nn3.a;
                String TAG = this.f;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.f(TAG, "deliverResponse ========>>>: response is null");
                id5.a errorListener = getErrorListener();
                if (errorListener != null) {
                    errorListener.onErrorResponse(null);
                }
            } else {
                nn3 nn3Var2 = nn3.a;
                String TAG2 = this.f;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3Var2.f(TAG2, "deliverResponse ========>>>: response delivered to presenter");
                this.e.onResponse(obj);
            }
        } catch (Exception e) {
            nn3 nn3Var3 = nn3.a;
            nn3Var3.f(this.g, "Error in GSON Req");
            String TAG3 = this.f;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            nn3Var3.b(TAG3, e.toString(), e);
        }
    }

    @Override // com.zepto.ic5
    public byte[] getBody() {
        try {
            nn3 nn3Var = nn3.a;
            String TAG = this.f;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = this.i;
            Intrinsics.checkNotNull(str);
            nn3Var.f(TAG, Intrinsics.stringPlus("getBody : ", str));
            String str2 = this.i;
            Charset charsetForName = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = str2.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            cu7.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.i, "utf-8");
            return null;
        }
    }

    @Override // com.zepto.ic5
    public String getBodyContentType() {
        return m;
    }

    @Override // com.zepto.ic5
    public Map getHeaders() {
        HashMap map = new HashMap();
        String url = getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "this.url");
        if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "handshake", false, 2, (Object) null)) {
            String url2 = getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "this.url");
            if (!StringsKt__StringsKt.contains$default((CharSequence) url2, (CharSequence) hs.a.a(), false, 2, (Object) null)) {
                String url3 = getUrl();
                Intrinsics.checkNotNullExpressionValue(url3, "this.url");
                if (!StringsKt__StringsKt.contains$default((CharSequence) url3, (CharSequence) "validatedevice", false, 2, (Object) null)) {
                    s06 s06VarA = s06.m.a();
                    Intrinsics.checkNotNull(s06VarA);
                    map.put("Authorization", Intrinsics.stringPlus("Bearer ", s06VarA.o()));
                    nn3.a.f("authorization", Intrinsics.stringPlus("Header : ", map));
                }
            }
        }
        return map;
    }

    @Override // com.zepto.ic5
    public id5 parseNetworkResponse(m44 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            byte[] bArr = response.data;
            Intrinsics.checkNotNullExpressionValue(bArr, "response.data");
            Charset charsetForName = Charset.forName(xr2.parseCharset(response.headers));
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(HttpHeaderParser…harset(response.headers))");
            String str = new String(bArr, charsetForName);
            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "response", false, 2, (Object) null)) {
                nn3.a.f(this.g, "##### Server ->>> Response: Non Encryption Response ---->>>>" + ((Object) str) + " --- " + StringsKt__StringsJVMKt.isBlank(str) + '}');
                id5 id5VarSuccess = id5.success(this.h.fromJson(str, this.c), l.b(response));
                Intrinsics.checkNotNullExpressionValue(id5VarSuccess, "{\n                LogUti…          )\n            }");
                return id5VarSuccess;
            }
            nn3 nn3Var = nn3.a;
            nn3Var.f(this.g, "##### Server ->>> Response: Encrypted ---->>>> " + ((Object) getUrl()) + " --------> " + ((Object) str));
            try {
                m53 m53VarM = new p53().a(str).m();
                String TAG = this.f;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                nn3Var.f(TAG, Intrinsics.stringPlus("Json Res : ", m53VarM.T("response").r()));
                mi2 mi2Var = this.j;
                Intrinsics.checkNotNull(mi2Var);
                str = mi2Var.c(m53VarM.T("response").r(), b(), NativeInteractor.a.D());
            } catch (Exception e) {
                nn3 nn3Var2 = nn3.a;
                String TAG2 = this.f;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                nn3Var2.b(TAG2, "Server ->>> Response decryption - url: " + ((Object) getUrl()) + " & error:  " + e, e);
            }
            nn3.a.f(this.g, "##### Server ->>> Response: Decrypted ---->>>> " + ((Object) getUrl()) + " --------> " + ((Object) str));
            id5 id5VarSuccess2 = id5.success(this.h.fromJson(str, this.c), l.b(response));
            Intrinsics.checkNotNullExpressionValue(id5VarSuccess2, "{\n                LogUti…          )\n            }");
            return id5VarSuccess2;
        } catch (u53 e2) {
            nn3 nn3Var3 = nn3.a;
            String TAG3 = this.f;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            nn3Var3.d(TAG3, e2);
            id5 id5VarError = id5.error(new pl4(e2));
            Intrinsics.checkNotNullExpressionValue(id5VarError, "error(ParseError(e))");
            return id5VarError;
        } catch (UnsupportedEncodingException e3) {
            nn3 nn3Var4 = nn3.a;
            String TAG4 = this.f;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            nn3Var4.d(TAG4, e3);
            id5 id5VarError2 = id5.error(new pl4(e3));
            Intrinsics.checkNotNullExpressionValue(id5VarError2, "error(ParseError(e))");
            return id5VarError2;
        }
    }
}
