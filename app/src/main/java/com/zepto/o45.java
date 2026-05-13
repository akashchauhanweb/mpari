package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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
public final class o45 extends zq7 {
    public final p45 d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public oy3 h;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ o45 b;

        public a(String str, o45 o45Var) {
            this.a = str;
            this.b = o45Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("Error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ImpoundDlSuccessModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.h().k((ImpoundDlSuccessModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("Error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ o45 b;

        public b(String str, o45 o45Var) {
            this.a = str;
            this.b = o45Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.k().k("Error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ImpoundRcSuccessModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.l().k((ImpoundRcSuccessModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.k().k("Error");
            }
        }
    }

    public o45(p45 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
    }

    public final oy3 g() {
        return this.h;
    }

    public final oy3 h() {
        return this.g;
    }

    public final void i(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new a(strValueOf, this));
    }

    public final void j(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 k() {
        return this.f;
    }

    public final oy3 l() {
        return this.e;
    }
}
