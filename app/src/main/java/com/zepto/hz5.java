package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceListModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.CheckApplicationEligibilityModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ValidateWithDrawanServiceModal;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class hz5 extends zq7 {
    public final gz5 d;
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

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public a(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CheckApplicationEligibilityModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.k().k((CheckApplicationEligibilityModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public b(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) AppliedServiceListModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i().k((AppliedServiceListModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public c(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.o().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.p().k((ResendOtp) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public d(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ReasonModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.s().k((ReasonModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public e(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.n().k((SendOtpResult) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public f(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Error unused) {
                    this.b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) OtpVerifyResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.r().k((OtpVerifyResult) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public g(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ValidateWithDrawanServiceModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.v().k((ValidateWithDrawanServiceModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ hz5 b;

        public h(String str, hz5 hz5Var) {
            this.a = str;
            this.b = hz5Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ValidateWithDrawanServiceModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.w().k((ValidateWithDrawanServiceModal) objFromJson);
            } catch (Exception unused) {
                this.b.m().k("error");
            }
        }
    }

    public hz5(gz5 repository) {
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
    }

    public final void g(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = l(applNo, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final void h(String applNo) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = j(applNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.d(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 i() {
        return this.j;
    }

    public final JSONObject j(String applNo) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", applNo);
            jSONObject.put("agentId", "mparivahanDL");
            jSONObject.put("agentIpAddress", "10.26.61.108");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 k() {
        return this.e;
    }

    public final JSONObject l(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", applNo);
            jSONObject.put("dateOfBirth", dob);
            jSONObject.put("agentId", "mparivahanDL");
            jSONObject.put("agentIpAddress", "10.26.61.108");
            jSONObject.put("agentServiceName", "sarathiservice");
            jSONObject.put("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public final oy3 m() {
        return this.n;
    }

    public final oy3 n() {
        return this.f;
    }

    public final oy3 o() {
        return this.h;
    }

    public final oy3 p() {
        return this.g;
    }

    public final void q(String smsId) {
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.h(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string), strValueOf).enqueue(new c(strValueOf, this));
    }

    public final oy3 r() {
        return this.i;
    }

    public final oy3 s() {
        return this.m;
    }

    public final void t() {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.e(new m53(), strValueOf).enqueue(new d(strValueOf, this));
    }

    public final void u(String mobile_no, String smsId) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.j(mobile_no, smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), strValueOf).enqueue(new e(strValueOf, this));
    }

    public final oy3 v() {
        return this.l;
    }

    public final oy3 w() {
        return this.k;
    }

    public final void x(String otp, String otpid) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.i(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.h(aVar.d(ls3VarB, string), strValueOf).enqueue(new f(strValueOf, this));
    }

    public final void y(String validateService, String applNo, f53 selectedList) {
        Intrinsics.checkNotNullParameter(validateService, "validateService");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        m53 m53Var = new m53();
        m53Var.O("applicationNumber", applNo);
        m53Var.O("agentId", "mparivahanDL");
        m53Var.O("agentIpAddress", "10.26.61.108");
        m53Var.O("agentServiceName", "sarathiservice");
        m53Var.O("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
        m53Var.D("selectedListOfServices", selectedList);
        m53Var.O("validateService", validateService);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.c(m53Var, strValueOf).enqueue(new g(strValueOf, this));
    }

    public final void z(String validateService, String applNo, f53 selectedList) {
        Intrinsics.checkNotNullParameter(validateService, "validateService");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        m53 m53Var = new m53();
        m53Var.O("applicationNumber", applNo);
        m53Var.O("agentId", "mparivahanDL");
        m53Var.O("agentIpAddress", "10.26.61.108");
        m53Var.O("agentServiceName", "sarathiservice");
        m53Var.O("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
        m53Var.O("validateService", validateService);
        m53Var.D("selectedListOfServices", selectedList);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(m53Var, strValueOf).enqueue(new h(strValueOf, this));
    }
}
