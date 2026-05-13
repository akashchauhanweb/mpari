package com.nic.mparivahan.Tax.ViewModel;

import android.util.Log;
import androidx.lifecycle.n;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Tax.Model.Afterpayment;
import com.nic.mparivahan.Tax.Model.BeforeResponse;
import com.nic.mparivahan.Tax.Model.CalculateTaxResponse;
import com.nic.mparivahan.Tax.Model.Errormodel;
import com.nic.mparivahan.Tax.Model.TaxDataFormat;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.nd5;
import com.zepto.oy3;
import com.zepto.wm4;
import com.zepto.ze1;
import com.zepto.zq7;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class PaytaxViewModel extends zq7 {
    public final wm4 d;
    public final oy3 e;
    public final oy3 f;
    public final n g;
    public final oy3 h;
    public final oy3 i;
    public final n j;
    public final oy3 k;
    public final oy3 l;
    public final n m;
    public final oy3 n;
    public final oy3 o;
    public final n p;
    public final oy3 q;
    public final oy3 r;
    public final n s;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ PaytaxViewModel b;

        public a(Ref.ObjectRef objectRef, PaytaxViewModel paytaxViewModel) {
            this.a = objectRef;
            this.b = paytaxViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.l().k(t.getMessage());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.isSuccessful()) {
                this.b.l().k("Error");
                return;
            }
            if (((SecurityModle) response.body()) == null || ((SecurityModle) response.body()) == null) {
                return;
            }
            SecurityModle securityModle = (SecurityModle) response.body();
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            String data = securityModle != null ? securityModle.getData() : null;
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) Afterpayment.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.r.k((Afterpayment) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ PaytaxViewModel b;

        public b(Ref.ObjectRef objectRef, PaytaxViewModel paytaxViewModel) {
            this.a = objectRef;
            this.b = paytaxViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.k().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (!response.isSuccessful() || ((SecurityModle) response.body()) == null) {
                    return;
                }
                SecurityModle securityModle = (SecurityModle) response.body();
                ze1.a aVar = ze1.a;
                String str = (String) this.a.element;
                String data = securityModle != null ? securityModle.getData() : null;
                Intrinsics.checkNotNull(data);
                String strA = aVar.a(str, data);
                JSONObject jSONObject = new JSONObject(strA);
                if (jSONObject.has("errorDesc")) {
                    if (jSONObject.getString("errorDesc").toString() != null) {
                        this.b.k().k(jSONObject.getString("errorDesc").toString());
                    }
                } else {
                    Object objFromJson = new Gson().fromJson(strA, (Class<Object>) TaxDataFormat.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.l.k((TaxDataFormat) objFromJson);
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.b.k().k("Error");
            }
        }
    }

    public PaytaxViewModel(wm4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        oy3 oy3Var = new oy3();
        this.f = oy3Var;
        this.g = oy3Var;
        this.h = new oy3();
        oy3 oy3Var2 = new oy3();
        this.i = oy3Var2;
        this.j = oy3Var2;
        this.k = new oy3();
        oy3 oy3Var3 = new oy3();
        this.l = oy3Var3;
        this.m = oy3Var3;
        this.n = new oy3();
        oy3 oy3Var4 = new oy3();
        this.o = oy3Var4;
        this.p = oy3Var4;
        this.q = new oy3();
        oy3 oy3Var5 = new oy3();
        this.r = oy3Var5;
        this.s = oy3Var5;
    }

    public final n i() {
        return this.s;
    }

    public final n j() {
        return this.g;
    }

    public final oy3 k() {
        return this.k;
    }

    public final oy3 l() {
        return this.q;
    }

    public final oy3 m() {
        return this.e;
    }

    public final oy3 n() {
        return this.h;
    }

    public final oy3 o() {
        return this.f;
    }

    public final oy3 p() {
        return this.i;
    }

    public final n q() {
        return this.m;
    }

    public final n r() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void s(String encstring) throws JSONException {
        Intrinsics.checkNotNullParameter(encstring, "encstring");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encstring", encstring);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(String state_cd, String regn_no, String tax_mode, String pur_cd, String noofperm) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(noofperm, "noofperm");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.d0(state_cd, regn_no, tax_mode, pur_cd, noofperm)), (String) objectRef.element).enqueue(new Callback() { // from class: com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel$gettaxModeListener$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                this.n().k("Error");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful() && response.code() == 200) {
                    try {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        ze1.a aVar = ze1.a;
                        String str = (String) objectRef.element;
                        String data = securityModle != null ? securityModle.getData() : null;
                        Intrinsics.checkNotNull(data);
                        String strA = aVar.a(str, data);
                        if (!new JSONObject(strA).has("errorcode")) {
                            Object objFromJson = new Gson().fromJson(strA, (Class<Object>) CalculateTaxResponse.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                            this.p().k((CalculateTaxResponse) objFromJson);
                        } else {
                            Errormodel errormodel = (Errormodel) new Gson().fromJson(strA, new TypeToken<Errormodel>() { // from class: com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel$gettaxModeListener$1$onResponse$type$1
                            }.getType());
                            if (errormodel != null) {
                                this.n().k(errormodel.getErrorDesc());
                            }
                        }
                    } catch (Exception unused) {
                        this.n().k("Error");
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u(String state_cd, String regn_no, String chassis_no) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(chassis_no, "chassis_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.d(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.g(state_cd, regn_no, chassis_no)), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final void v(CalculateTaxResponse param) {
        Intrinsics.checkNotNullParameter(param, "param");
        final String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(param).toString()), strValueOf).enqueue(new Callback() { // from class: com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel$postbeforepaymentone$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                this.m().k(t.getMessage());
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, Response response) throws JSONException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    if (response.code() != 400) {
                        this.m().k("Error");
                        return;
                    }
                    Log.e("Test-1", "1test400");
                    Gson gson = new Gson();
                    Type type = new TypeToken<Errormodel>() { // from class: com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel$postbeforepaymentone$1$onResponse$type$1
                    }.getType();
                    nd5 nd5VarErrorBody = response.errorBody();
                    Intrinsics.checkNotNull(nd5VarErrorBody);
                    Errormodel errormodel = (Errormodel) gson.fromJson(nd5VarErrorBody.charStream(), type);
                    if (errormodel != null) {
                        this.m().k(errormodel.getErrorDesc());
                        return;
                    }
                    return;
                }
                if (((SecurityModle) response.body()) != null) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    ze1.a aVar = ze1.a;
                    String str = strValueOf;
                    String data = securityModle != null ? securityModle.getData() : null;
                    Intrinsics.checkNotNull(data);
                    String strA = aVar.a(str, data);
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has("errorcode")) {
                        String string = jSONObject.getString("errorDesc");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        this.m().k(string.toString());
                    } else {
                        Object objFromJson = new Gson().fromJson(strA, (Class<Object>) BeforeResponse.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.o().k((BeforeResponse) objFromJson);
                    }
                }
            }
        });
    }
}
