package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.model.slot_pdf.SlotPdfDownloadResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class cx extends zq7 {
    public final bj2 d;
    public final oy3 e;
    public ms3 f;
    public ms3 g;
    public ms3 h;
    public ms3 i;
    public ms3 j;
    public ms3 k;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ cx b;
        public final /* synthetic */ Context c;

        public a(Ref.ObjectRef objectRef, cx cxVar, Context context) {
            this.a = objectRef;
            this.b = cxVar;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.i().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getApplicationInfo", aVar.C(), aVar.D());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("Response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) GetApplInfoResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((GetApplInfoResponse) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ cx b;
        public final /* synthetic */ Context c;

        public b(Ref.ObjectRef objectRef, cx cxVar, Context context) {
            this.a = objectRef;
            this.b = cxVar;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.i().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "applStatus", aVar.C(), aVar.D());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("Response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) GetAppStatusMain.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((GetAppStatusMain) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ cx b;
        public final /* synthetic */ Context c;

        public c(Ref.ObjectRef objectRef, cx cxVar, Context context) {
            this.a = objectRef;
            this.b = cxVar;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.i().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "dltprovnlreceipt", aVar.C(), aVar.D());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("Response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SlotPdfDownloadResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l().k((SlotPdfDownloadResponse) objFromJson);
        }
    }

    public cx(bj2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new ms3();
        this.g = new ms3();
        this.h = new ms3();
        this.i = new ms3();
        this.j = new ms3();
        this.k = new ms3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(Context context, String appNo, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cj2.a.b(appNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(Context context, String appNo, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cj2.a.a(appNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this, context));
    }

    public final oy3 i() {
        return this.e;
    }

    public final ms3 j() {
        return this.f;
    }

    public final ms3 k() {
        return this.j;
    }

    public final ms3 l() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void m(Context context, String appNo, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cj2.a.c(appNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this, context));
    }
}
