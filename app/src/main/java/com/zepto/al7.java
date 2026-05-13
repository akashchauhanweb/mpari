package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class al7 extends zq7 {
    public final bg7 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public oy3 i;
    public oy3 j;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ al7 c;

        public a(Context context, Ref.ObjectRef objectRef, al7 al7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = al7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "ownerinformationforinsurancepuccpermit", aVar.C(), "Connection time out");
            this.c.k().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                if (response != null && response.code() == 200) {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    if (jSONObject.has("errorDesc")) {
                        this.c.k().k(jSONObject.getString("errorDesc").toString());
                        return;
                    }
                    Object objFromJson = new GsonBuilder().create().fromJson(jSONObject.getJSONObject("data").toString(), (Class<Object>) OwnerDetailPuccPermit.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.l().k((OwnerDetailPuccPermit) objFromJson);
                    return;
                }
                if (response == null || response.code() != 400) {
                    Object objFromJson2 = new GsonBuilder().create().fromJson(strValueOf, (Class<Object>) OwnerDetailPuccPermit.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson2, "fromJson(...)");
                    this.c.l().k((OwnerDetailPuccPermit) objFromJson2);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strValueOf);
                    if (jSONObject2.has("errorDesc")) {
                        this.c.k().k(jSONObject2.getString("errorDesc").toString());
                    } else {
                        this.c.k().k("error");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.c.k().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ al7 c;

        public b(Context context, Ref.ObjectRef objectRef, al7 al7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = al7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "sendSMSAlerts", aVar.C(), aVar.D());
            this.c.g().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.y(), "sendSMSAlerts", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.i().k((SendOtpResult) objFromJson);
            } catch (Exception e) {
                Log.d("SendOtp-", e.getLocalizedMessage());
                this.c.g().k("Error");
            }
        }
    }

    public al7(bg7 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.g;
    }

    public final oy3 i() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    public final void j(Context context, String rc, String state_code, String pcode, String chassi_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(pcode, "pcode");
        Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        VUtility.Companion companion = VUtility.INSTANCE;
        String strK = ws6Var.k();
        Intrinsics.checkNotNull(string);
        String string2 = companion.X(rc, state_code, strK, string, ws6Var.l(), ws6Var.e(), chassi_no, pcode).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new a(context, objectRef, this));
    }

    public final oy3 k() {
        return this.j;
    }

    public final oy3 l() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void m(Context context, String mobile_no, String record_id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(record_id, "record_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.Z(mobile_no, record_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(context, objectRef, this));
    }
}
