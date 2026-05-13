package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.PermitDetailModal;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferPermitModal.SurrenderPurposeModal;
import com.zepto.lc5;
import com.zepto.ze1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ar4 extends zq7 {
    public final zq4 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ar4 b;

        public a(String str, ar4 ar4Var) {
            this.a = str;
            this.b = ar4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k(th != null ? th.toString() : null);
            Log.e("Error3", "Error " + th);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        ze1.a aVar = ze1.a;
                        String str = this.a;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) PermitDetailModal.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.i().k((PermitDetailModal) objFromJson);
                        return;
                    }
                } catch (Exception e) {
                    this.b.g().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            }
            this.b.g().k("Error");
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ar4 b;

        public b(String str, ar4 ar4Var) {
            this.a = str;
            this.b = ar4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k(th != null ? th.toString() : null);
            Log.e("Error3", "Error " + th);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        ze1.a aVar = ze1.a;
                        String str = this.a;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) SurrenderPurposeModal.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.k().k((SurrenderPurposeModal) objFromJson);
                        return;
                    }
                } catch (Exception e) {
                    this.b.g().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            }
            this.b.g().k("Error");
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ar4 b;

        public c(String str, ar4 ar4Var) {
            this.a = str;
            this.b = ar4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k(th != null ? th.toString() : null);
            Log.e("Error3", "Error " + th);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        ze1.a aVar = ze1.a;
                        String str = this.a;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        aVar.a(str, data);
                        new Gson();
                        return;
                    }
                } catch (Exception e) {
                    this.b.g().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            }
            this.b.g().k("Error");
        }
    }

    public ar4(zq4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
    }

    public final oy3 g() {
        return this.g;
    }

    public final void h(String regNo) throws JSONException {
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("regNo", regNo);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 i() {
        return this.f;
    }

    public final void j(String stateCd) throws JSONException {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCd", stateCd);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 k() {
        return this.e;
    }

    public final void l(JSONObject jsonObj) {
        Intrinsics.checkNotNullParameter(jsonObj, "jsonObj");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jsonObj.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new c(strValueOf, this));
    }
}
