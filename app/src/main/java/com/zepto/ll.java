package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo.ServPojo;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ll extends zq7 {
    public final kl d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public final oy3 h;
    public oy3 i;
    public oy3 j;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ll b;

        public a(String str, ll llVar) {
            this.a = str;
            this.b = llVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
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
            Log.d("checkByState_response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CheckByState.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((CheckByState) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ll b;

        public b(String str, ll llVar) {
            this.a = str;
            this.b = llVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
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
            Log.d("multi_api_request", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ServPojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((ServPojo) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ll b;

        public c(String str, ll llVar) {
            this.a = str;
            this.b = llVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.h().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
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
            Log.d("checkByState_response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitAdharApi.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l().k((SubmitAdharApi) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ll b;

        public d(String str, ll llVar) {
            this.a = str;
            this.b = llVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.h().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
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
            Log.d("checkByState_response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitAdharApi.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.m().k((SubmitAdharApi) objFromJson);
        }
    }

    public ll(kl repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
    }

    public final void g(String state, int i, String adharRtoCode) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(adharRtoCode, "adharRtoCode");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.e(state, i, adharRtoCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 h() {
        return this.g;
    }

    public final oy3 i() {
        return this.h;
    }

    public final oy3 j() {
        return this.e;
    }

    public final oy3 k() {
        return this.j;
    }

    public final oy3 l() {
        return this.f;
    }

    public final oy3 m() {
        return this.i;
    }

    public final void n(String stateCd, String rtoCode) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = o(stateCd, rtoCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final JSONObject o(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCd", str);
        jSONObject.put("rtoCode", str2);
        return jSONObject;
    }

    public final void p(String aadhaarNo, String careOf, String code, String dist, String dobAdhar, String gender, String house, String landMark, String localityIfAny, String name, String phone, String pht, String pincode, String state, String adharStatus, String street, String villageTownCity, String xmlUID, String dlNo, String dlOwnerName, String dob, String dlOwnerRelationFullName, int i, String status, String txNo, String uid, String stateCd) {
        Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
        Intrinsics.checkNotNullParameter(careOf, "careOf");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dist, "dist");
        Intrinsics.checkNotNullParameter(dobAdhar, "dobAdhar");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(house, "house");
        Intrinsics.checkNotNullParameter(landMark, "landMark");
        Intrinsics.checkNotNullParameter(localityIfAny, "localityIfAny");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(pht, "pht");
        Intrinsics.checkNotNullParameter(pincode, "pincode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(adharStatus, "adharStatus");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
        Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dlOwnerName, "dlOwnerName");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(dlOwnerRelationFullName, "dlOwnerRelationFullName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txNo, "txNo");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.m(aadhaarNo, careOf, code, dist, dobAdhar, gender, house, landMark, localityIfAny, name, phone, pht, pincode, state, adharStatus, street, villageTownCity, xmlUID, dlNo, dlOwnerName, dob, dlOwnerRelationFullName, i, status, txNo, uid, stateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
    }

    public final void q(String aadhaarNo, String careOf, String code, String dist, String dobAdhar, String gender, String house, String landMark, String localityIfAny, String name, String phone, String pht, String pincode, String state, String adharStatus, String street, String villageTownCity, String xmlUID, String dlNo, String dlOwnerName, String dob, String dlOwnerRelationFullName, int i, String status, String txNo, String uid, String stateCd) {
        Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
        Intrinsics.checkNotNullParameter(careOf, "careOf");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(dist, "dist");
        Intrinsics.checkNotNullParameter(dobAdhar, "dobAdhar");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(house, "house");
        Intrinsics.checkNotNullParameter(landMark, "landMark");
        Intrinsics.checkNotNullParameter(localityIfAny, "localityIfAny");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(pht, "pht");
        Intrinsics.checkNotNullParameter(pincode, "pincode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(adharStatus, "adharStatus");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(villageTownCity, "villageTownCity");
        Intrinsics.checkNotNullParameter(xmlUID, "xmlUID");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dlOwnerName, "dlOwnerName");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(dlOwnerRelationFullName, "dlOwnerRelationFullName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(txNo, "txNo");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.m(aadhaarNo, careOf, code, dist, dobAdhar, gender, house, landMark, localityIfAny, name, phone, pht, pincode, state, adharStatus, street, villageTownCity, xmlUID, dlNo, dlOwnerName, dob, dlOwnerRelationFullName, i, status, txNo, uid, stateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new d(strValueOf, this));
    }
}
