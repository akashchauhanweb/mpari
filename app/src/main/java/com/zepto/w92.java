package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.FetchChallanLog.PojoChallan.FetchChallanResponse;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class w92 extends zq7 {
    public final bb2 d;
    public oy3 e;
    public oy3 f;
    public final oy3 g;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ w92 b;

        public a(String str, w92 w92Var) {
            this.a = str;
            this.b = w92Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.i().k("Error");
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
            Log.d("dlt_trn", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DltVhnTransaction.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((DltVhnTransaction) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ w92 b;

        public b(String str, w92 w92Var) {
            this.a = str;
            this.b = w92Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.e("Error-->0012->", e.toString());
                    this.b.i().k("Error");
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
            Log.e("Response0012-->", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) FetchChallanResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((FetchChallanResponse) objFromJson);
        }
    }

    public w92(bb2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
    }

    public final void g(long j, boolean z) {
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = v92.a.a(j, z).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final void h(long j, boolean z) {
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = v92.a.b(j, z).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 i() {
        return this.g;
    }

    public final oy3 j() {
        return this.f;
    }

    public final oy3 k() {
        return this.e;
    }
}
