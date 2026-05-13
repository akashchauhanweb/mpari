package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Model.VerifyPaymentModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanDetailsModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends zq7 {
    public final dz1 d;
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
    public final oy3 o;
    public final oy3 p;
    public final oy3 q;
    public final oy3 r;
    public final oy3 s;
    public final oy3 t;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public a(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("error");
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
                Log.e("app", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SearchChallanModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.j().k((SearchChallanModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public b(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.h().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ChallanListModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i().k((ChallanListModal) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.h().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public c(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.r().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ChallanPdfDataModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.m().k((ChallanPdfDataModal) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.r().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public d(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.B().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) VirtualChallanDetailsModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.C().k((VirtualChallanDetailsModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.B().k("error");
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public e(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.r().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PaymentEtransPgi.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.u().k((PaymentEtransPgi) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.r().k("error");
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public f(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.w().k(t.getMessage());
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.x().k((ResendOtp) objFromJson);
            } catch (Exception unused) {
                this.b.s().k("error");
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public g(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.s().k(t.getMessage());
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.v().k((SendOtpResult) objFromJson);
            } catch (Exception unused) {
                this.b.s().k("error");
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public h(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.s().k(t.getMessage());
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) OtpVerifyResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.z().k((OtpVerifyResult) objFromJson);
            } catch (Error unused) {
                this.b.s().k("Error");
            }
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public i(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.r().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PaymentEtransPgi.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.u().k((PaymentEtransPgi) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.r().k("error");
            }
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ fz1 b;

        public j(String str, fz1 fz1Var) {
            this.a = str;
            this.b = fz1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.o().k("error");
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
                Log.d("Disposed", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) VerifyPaymentModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.p().k((VerifyPaymentModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.o().k("error");
            }
        }
    }

    public fz1(dz1 repository) {
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
    }

    public final void A(Context context, String mobile_no, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = E(mobile_no, smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), strValueOf).enqueue(new g(strValueOf, this));
    }

    public final oy3 B() {
        return this.j;
    }

    public final oy3 C() {
        return this.i;
    }

    public final void D(Context context, String otp, String otpid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.i(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string), strValueOf).enqueue(new h(strValueOf, this));
    }

    public final JSONObject E(String mobile_number, String smsId) throws JSONException {
        Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("smsCtzId", Long.parseLong(smsId));
        jSONObject.put("smsEvent", "CTZ_ECH");
        jSONObject.put("smsMobile", mobile_number);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("smsAlert", jSONObject);
        Log.d("sendOtp", jSONObject2.toString());
        return jSONObject2;
    }

    public final void F(Context context, String challanNo, String vehicleNo, String challanAmt, String status, String stateCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
        Intrinsics.checkNotNullParameter(challanAmt, "challanAmt");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vehicle_number", vehicleNo);
            jSONObject.put("challan_number", challanNo);
            jSONObject.put("challan_amt", challanAmt);
            jSONObject.put("status", status);
            jSONObject.put("state_code", stateCd);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.d.h(aVar.d(ls3VarB, string2), strValueOf).enqueue(new i(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void G(Context context, String challanNo, String stateCd, String vehicleNo, String challanAmt, String challanStatus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
        Intrinsics.checkNotNullParameter(challanAmt, "challanAmt");
        Intrinsics.checkNotNullParameter(challanStatus, "challanStatus");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", challanStatus);
            jSONObject.put("challan_number", challanNo);
            jSONObject.put("state_code", stateCd);
            jSONObject.put("vehicle_number", vehicleNo);
            jSONObject.put("challan_amt", challanAmt);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.d.j(aVar.d(ls3VarB, string2), strValueOf).enqueue(new j(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.n;
    }

    public final oy3 i() {
        return this.m;
    }

    public final oy3 j() {
        return this.e;
    }

    public final void k(Context context, String inputValue, String otp, String otpid, String stateCd, String vehicleRcNo, String purCd, String chassisNoValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vehicleRcNo, "vehicleRcNo");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(chassisNoValue, "chassisNoValue");
        try {
            JSONObject jSONObject = new JSONObject();
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            jSONObject.put("entity_type", "Challan");
            jSONObject.put("entity_value", inputValue);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            jSONObject.put("regnNo", vehicleRcNo);
            jSONObject.put("purCd", purCd);
            jSONObject.put("chasiNo", chassisNoValue);
            jSONObject.put("stateCode", stateCd);
            Log.d("Challan Details Req", jSONObject.toString());
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.d.g(aVar.d(ls3VarB, string2), strValueOf).enqueue(new a(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void l(Context context, String inputType, String inputValue, int i2, String engineNoValue, String chassisNoValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(engineNoValue, "engineNoValue");
        Intrinsics.checkNotNullParameter(chassisNoValue, "chassisNoValue");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", inputType);
            jSONObject.put("entity_value", inputValue);
            jSONObject.put("offset", i2);
            if (StringsKt__StringsJVMKt.equals(inputType, "RC", true)) {
                jSONObject.put("engine5_no", engineNoValue);
                jSONObject.put("chassis5_no", chassisNoValue);
            }
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.d.c(aVar.d(ls3VarB, string2), strValueOf).enqueue(new b(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 m() {
        return this.l;
    }

    public final void n(Context context, String challanNo, String otp, String otpid, String stateCd, String vehicleRcNo, String purCd, String chassisNoValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(vehicleRcNo, "vehicleRcNo");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Intrinsics.checkNotNullParameter(chassisNoValue, "chassisNoValue");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", challanNo);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            jSONObject.put("regnNo", vehicleRcNo);
            jSONObject.put("purCd", purCd);
            jSONObject.put("stateCode", stateCd);
            jSONObject.put("chasiNo", chassisNoValue);
            Log.d("Challan Pdf Req", jSONObject.toString());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            lc5 lc5VarD = aVar.d(ls3VarB, string2);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            this.d.a(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 o() {
        return this.h;
    }

    public final oy3 p() {
        return this.g;
    }

    public final void q(Context context, String challanNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", challanNo);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.d.f(aVar.d(ls3VarB, string2), strValueOf).enqueue(new d(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 r() {
        return this.t;
    }

    public final oy3 s() {
        return this.o;
    }

    public final void t(Context context, String challanNo, String mobileNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", challanNo);
            jSONObject.put("mobile_no", mobileNo);
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            lc5 lc5VarD = aVar.d(ls3VarB, string2);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            this.d.b(lc5VarD, strValueOf).enqueue(new e(strValueOf, this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final oy3 u() {
        return this.k;
    }

    public final oy3 v() {
        return this.p;
    }

    public final oy3 w() {
        return this.r;
    }

    public final oy3 x() {
        return this.q;
    }

    public final void y(Context context, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.h(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), strValueOf).enqueue(new f(strValueOf, this));
    }

    public final oy3 z() {
        return this.s;
    }
}
