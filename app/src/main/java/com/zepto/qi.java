package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.AddCov.PojoClass.CovDataSubmit;
import com.nic.mparivahan.AddCov.PojoClass.DataRequestPojo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class qi extends zq7 {
    public final ri d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public oy3 h;
    public String i;

    public static final class a implements Callback {
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        public a(String str, Context context) {
            this.b = str;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            qi.this.m().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "dataRequest", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    Log.d("grv", qi.this.k());
                    qi.this.n().k(qi.this.k());
                    return;
                }
            } else {
                securityModle = null;
            }
            qi qiVar = qi.this;
            tu5.a aVar = tu5.a;
            String str = this.b;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            qiVar.p(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
            Log.d("response", qi.this.k());
            Object objFromJson = new Gson().fromJson(qi.this.k(), (Class<Object>) DataRequestPojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            qi.this.l().k((DataRequestPojo) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ qi b;
        public final /* synthetic */ Context c;

        public b(String str, qi qiVar, Context context) {
            this.a = str;
            this.b = qiVar;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.m().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "dataSubmit", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.m().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CovDataSubmit.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.o().k((CovDataSubmit) objFromJson);
        }
    }

    public qi(ri repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = "";
    }

    public final void g(Context context, String applNumber, String applDob, String stCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = h(applNumber, applDob, stCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, context));
    }

    public final JSONObject h(String applNumber, String applDob, String stCode) throws JSONException {
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNumber", applNumber);
        jSONObject.put("applDob", applDob);
        jSONObject.put("stCode", stCode);
        return jSONObject;
    }

    public final void i(Context context, String applNumber, String applDob, String stCode, ArrayList selectedServiceClass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(selectedServiceClass, "selectedServiceClass");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = j(applNumber, applDob, stCode, selectedServiceClass).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new b(strValueOf, this, context));
    }

    public final JSONObject j(String applNumber, String applDob, String stCode, ArrayList selectedServiceClass) throws JSONException {
        Intrinsics.checkNotNullParameter(applNumber, "applNumber");
        Intrinsics.checkNotNullParameter(applDob, "applDob");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(selectedServiceClass, "selectedServiceClass");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNumber", applNumber);
        jSONObject.put("applDob", applDob);
        jSONObject.put("stCode", stCode);
        JSONArray jSONArray = new JSONArray();
        int size = selectedServiceClass.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(selectedServiceClass.get(i));
        }
        jSONObject.put("selectedCovsList", jSONArray);
        Log.d("submit_data", jSONObject.toString());
        return jSONObject;
    }

    public final String k() {
        return this.i;
    }

    public final oy3 l() {
        return this.e;
    }

    public final oy3 m() {
        return this.g;
    }

    public final oy3 n() {
        return this.h;
    }

    public final oy3 o() {
        return this.f;
    }

    public final void p(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.i = str;
    }
}
