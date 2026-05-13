package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.AadharrValidateForMobileRes;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.UpdateRegisterResponse;
import com.zepto.lc5;
import com.zepto.tu5;
import com.zepto.ze1;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class wq6 extends zq7 {
    public final vq6 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public oy3 h;
    public oy3 i;
    public final oy3 j;
    public final oy3 k;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ wq6 b;

        public a(String str, wq6 wq6Var) {
            this.a = str;
            this.b = wq6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k("Service temporarily unavailable. Please try again later.");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.g().k("Unable to Update the mobile no.");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = this.a;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            String strA = aVar.a(str, data);
            JSONObject jSONObject = new JSONObject(strA).getJSONObject("apiMessage");
            if (jSONObject.getInt("statusCode") == 400) {
                this.b.g().k(jSONObject.getString("developerMessage"));
                return;
            }
            Object objFromJson = new Gson().fromJson(strA, (Class<Object>) UpdateModelVehDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.h().k((UpdateModelVehDetails) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ wq6 b;

        public b(String str, wq6 wq6Var) {
            this.a = str;
            this.b = wq6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.j().k("Error");
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
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (jSONObject.has("apiMessage")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                    if (jSONObject2.has("statusCode")) {
                        if (jSONObject2.getInt("statusCode") != 200) {
                            this.b.j().k(jSONObject2.getString("developerMessage"));
                            return;
                        }
                        Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) UpdateRegisterResponse.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.k().k((UpdateRegisterResponse) objFromJson);
                    }
                }
            } catch (Exception unused) {
                this.b.j().k("Error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ wq6 b;

        public c(String str, wq6 wq6Var) {
            this.a = str;
            this.b = wq6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k("Unable to update the mobile no, Please try after some time!");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    ze1.a aVar = ze1.a;
                    String str = this.a;
                    Intrinsics.checkNotNull(securityModle);
                    String data = securityModle.getData();
                    Intrinsics.checkNotNull(data);
                    String strA = aVar.a(str, data);
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has("apiMessage")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                        if (jSONObject2.has("statusCode")) {
                            if (jSONObject2.getInt("statusCode") == 200) {
                                Object objFromJson = new Gson().fromJson(strA, (Class<Object>) AadharrValidateForMobileRes.class);
                                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                                this.b.n().k((AadharrValidateForMobileRes) objFromJson);
                            } else if (jSONObject2.getInt("statusCode") == 201) {
                                this.b.i().k(jSONObject2.getString("developerMessage"));
                            } else {
                                this.b.m().k(jSONObject2.getString("developerMessage"));
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                this.b.m().k("Unable to update the mobile no, Please try after some time!");
            }
        }
    }

    public wq6(vq6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
        this.k = new oy3();
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.i;
    }

    public final oy3 j() {
        return this.k;
    }

    public final oy3 k() {
        return this.j;
    }

    public final void l(String regNo, String chasiNo, String engineNo, String regnDate, String regnUpto) {
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(engineNo, "engineNo");
        Intrinsics.checkNotNullParameter(regnDate, "regnDate");
        Intrinsics.checkNotNullParameter(regnUpto, "regnUpto");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.g0(regNo, chasiNo, engineNo, regnDate, regnUpto).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 m() {
        return this.h;
    }

    public final oy3 n() {
        return this.g;
    }

    public final void o(JSONObject requestObj) {
        Intrinsics.checkNotNullParameter(requestObj, "requestObj");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = requestObj.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this));
    }

    public final void p(JSONObject requestObj) {
        Intrinsics.checkNotNullParameter(requestObj, "requestObj");
        Log.d("Validate Aadhar Req", requestObj.toString());
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = requestObj.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), strValueOf).enqueue(new c(strValueOf, this));
    }
}
