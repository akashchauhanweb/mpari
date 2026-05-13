package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplDisposeSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplVerifySuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanDisposeAppSuccessModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.io.IOException;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class jv extends zq7 {
    public final qw d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;
    public oy3 o;
    public oy3 p;
    public oy3 q;
    public oy3 r;
    public oy3 s;
    public oy3 t;
    public oy3 u;
    public oy3 v;
    public oy3 w;
    public oy3 x;
    public oy3 y;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public a(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "disposeApplication", aVar.C(), aVar.C());
            this.c.o().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "disposeApplication", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("pendingDetails", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) VahanDisposeAppSuccessModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.p().k((VahanDisposeAppSuccessModel) objFromJson);
            } catch (Exception unused) {
                this.c.o().k("Error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ jv b;
        public final /* synthetic */ Context c;

        public b(Ref.ObjectRef objectRef, jv jvVar, Context context) {
            this.a = objectRef;
            this.b = jvVar;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "detaildisposeapplication", aVar.C(), aVar.C());
            this.b.i().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    try {
                        securityModle = (SecurityModle) response.body();
                    } catch (Exception unused) {
                        this.b.i().k("ERROR");
                        return;
                    }
                } catch (Exception unused2) {
                    JSONObject jSONObject = new JSONObject("");
                    if (jSONObject.has("errorDesc")) {
                        this.b.i().k(jSONObject.getString("errorDesc"));
                    } else {
                        this.b.i().k("ERROR");
                    }
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
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            if (jSONObject2.has("errorDesc")) {
                this.b.i().k(jSONObject2.getString("errorDesc"));
                return;
            }
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) VahanApplDisposeSuccessModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l().k((VahanApplDisposeSuccessModel) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public c(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "sendSMSAlerts", aVar.C(), aVar.C());
            this.c.j().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ApiMonitorLog.INSTANCE.a(this.a, hz0.a.y(), "sendSMSAlerts", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            if (response.isSuccessful() && response.code() == 200) {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("appDispose", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SendOtpResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.k().k((SendOtpResult) objFromJson);
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public d(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "showDetailByReg_No", aVar.C(), aVar.C());
            this.c.v().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            String strValueOf = "";
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "showDetailByReg_No", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("pendingDetails", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PendingTransRegNoModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.x().k((PendingTransRegNoModel) objFromJson);
            } catch (Exception e) {
                Log.d("pendingDetails-err", e.getLocalizedMessage());
                try {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    if (jSONObject.has("errorDesc")) {
                        this.c.v().k(jSONObject.getString("errorDesc").toString());
                    } else {
                        this.c.v().k("ERROR");
                    }
                } catch (Exception unused) {
                    this.c.v().k("ERROR");
                }
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public e(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "showDetailByTrans_No", aVar.C(), aVar.C());
            this.c.v().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            String strValueOf = "";
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "showDetailByTrans_No", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                Intrinsics.checkNotNull(response);
                if (!response.isSuccessful()) {
                    this.c.i().k("ERROR");
                    return;
                }
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PendingTransRegNoModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                PendingTransRegNoModel pendingTransRegNoModel = (PendingTransRegNoModel) objFromJson;
                if (!gd1.a.m(pendingTransRegNoModel.get(0).getTransactionID())) {
                    this.c.x().k(pendingTransRegNoModel);
                    return;
                }
                try {
                    this.c.v().k("ERROR");
                } catch (Exception unused) {
                    this.c.v().k("ERROR");
                }
            } catch (Exception e) {
                Log.d("pendingDetails-err", e.getLocalizedMessage());
                try {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    if (jSONObject.has("errorDesc")) {
                        this.c.v().k(jSONObject.getString("errorDesc").toString());
                    } else {
                        this.c.v().k("ERROR");
                    }
                } catch (Exception unused2) {
                    this.c.v().k("ERROR");
                }
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public f(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getTaxBreakUp", aVar.C(), aVar.C());
            this.c.y().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getTaxBreakUp", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            if (response.isSuccessful() && response.code() == 200) {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (jSONObject.has("errorDesc")) {
                    this.c.y().k(jSONObject.getString("errorDesc"));
                    return;
                }
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PendingTransTaxBreakUpModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.z().k((PendingTransTaxBreakUpModel) objFromJson);
                return;
            }
            if (response.code() != 400) {
                this.c.y().k("Error");
                return;
            }
            try {
                SecurityModle securityModle2 = (SecurityModle) response.body();
                tu5.a aVar2 = tu5.a;
                String str2 = (String) this.b.element;
                byte[] bArrDecode2 = Base64.getDecoder().decode(securityModle2 != null ? securityModle2.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                JSONObject jSONObject2 = new JSONObject(String.valueOf(aVar2.a(str2, new String(bArrDecode2, Charsets.UTF_8))));
                if (jSONObject2.has("errorDesc")) {
                    this.c.y().k(jSONObject2.getString("errorDesc"));
                } else {
                    this.c.y().k("Error");
                }
            } catch (IOException e) {
                e.printStackTrace();
                this.c.y().k("Error");
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public g(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "verifySMSOtp", aVar.C(), aVar.C());
            this.c.r().k(t.getMessage());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.y(), "verifySMSOtp", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("pendingDetails", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) OtpVerifyResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.s().k((OtpVerifyResult) objFromJson);
            } catch (Exception unused) {
                this.c.r().k("error");
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public h(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getListOfDisposeApplication", aVar.C(), aVar.C());
            this.c.m().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getListOfDisposeApplication", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanApplVerifySuccessModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.n().k((VahanApplVerifySuccessModel) objFromJson);
            } catch (Exception unused) {
                this.c.m().k("ERROR");
            }
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ jv c;

        public i(Context context, Ref.ObjectRef objectRef, jv jvVar) {
            this.a = context;
            this.b = objectRef;
            this.c = jvVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "checkToBank", aVar.C(), aVar.C());
            this.c.B().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "checkToBank", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            if (response.isSuccessful() && response.code() == 200) {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanPendingTransBankModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.C().k((VahanPendingTransBankModel) objFromJson);
                return;
            }
            if (response.code() != 400) {
                this.c.B().k("Error");
                return;
            }
            try {
                SecurityModle securityModle2 = (SecurityModle) response.body();
                tu5.a aVar2 = tu5.a;
                String str2 = (String) this.b.element;
                byte[] bArrDecode2 = Base64.getDecoder().decode(securityModle2 != null ? securityModle2.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                JSONObject jSONObject = new JSONObject(String.valueOf(aVar2.a(str2, new String(bArrDecode2, Charsets.UTF_8))));
                if (jSONObject.has("errorDesc")) {
                    this.c.B().k(jSONObject.getString("errorDesc"));
                } else {
                    this.c.B().k("Error");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public jv(qw repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
        this.k = new oy3();
        this.l = new oy3();
        this.m = new oy3();
        this.n = new oy3();
        this.o = new oy3();
        this.p = new oy3();
        this.q = new oy3();
        this.r = new oy3();
        this.s = new oy3();
        this.t = new oy3();
        this.u = new oy3();
        this.v = new oy3();
        this.w = new oy3();
        this.x = new oy3();
        this.y = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void A(Context context, String purCd, String transactionId, String offCd, String stateCd, String regNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(offCd, "offCd");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = VUtility.INSTANCE.x0(purCd, transactionId, offCd, stateCd, regNo).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new f(context, objectRef, this));
        } catch (Exception e2) {
            e2.printStackTrace();
            this.w.k("Error");
        }
    }

    public final oy3 B() {
        return this.y;
    }

    public final oy3 C() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void D(Context context, String otp, String otpid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.x(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.h(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new g(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void E(Context context, String regNo, String applNo, String otp) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.v(regNo, applNo, otp).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new h(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void F(Context context, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new i(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(Context context, JSONArray requestArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestArray, "requestArray");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = requestArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(Context context, String regNo, String applNo, String chasiNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.t(regNo, applNo, chasiNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this, context));
    }

    public final oy3 i() {
        return this.f;
    }

    public final oy3 j() {
        return this.h;
    }

    public final oy3 k() {
        return this.g;
    }

    public final oy3 l() {
        return this.e;
    }

    public final oy3 m() {
        return this.j;
    }

    public final oy3 n() {
        return this.i;
    }

    public final oy3 o() {
        return this.l;
    }

    public final oy3 p() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q(Context context, String mobileNo, String record_id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        Intrinsics.checkNotNullParameter(record_id, "record_id");
        try {
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = VUtility.INSTANCE.Z(mobileNo, record_id).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            lc5 lc5VarD = aVar.d(ls3VarB, string);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? ValueOf = String.valueOf(System.currentTimeMillis());
            objectRef.element = ValueOf;
            this.d.f(lc5VarD, ValueOf).enqueue(new c(context, objectRef, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 r() {
        return this.r;
    }

    public final oy3 s() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(Context context, String regNo, String chasiNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.T(regNo, chasiNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u(Context context, String transaction_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transaction_no, "transaction_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.U(transaction_no).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(context, objectRef, this));
    }

    public final oy3 v() {
        return this.t;
    }

    public final oy3 w() {
        return this.s;
    }

    public final oy3 x() {
        return this.u;
    }

    public final oy3 y() {
        return this.w;
    }

    public final oy3 z() {
        return this.v;
    }
}
