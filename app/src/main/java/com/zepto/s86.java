package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitRequest;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class s86 extends zq7 {
    public final r86 d;
    public oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ s86 b;

        public a(String str, s86 s86Var) {
            this.a = str;
            this.b = s86Var;
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
                Log.d("service_check", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i().k((SubmitResponse) objFromJson);
                Log.v("service_response", String.valueOf(response.body()));
            } catch (Exception unused) {
                this.b.h().k("error");
            }
        }
    }

    public s86(r86 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final void g(SubmitRequest mSubmitRequest) {
        Intrinsics.checkNotNullParameter(mSubmitRequest, "mSubmitRequest");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), j(mSubmitRequest));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.e;
    }

    public final String j(SubmitRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String json = new Gson().toJson(req);
        Log.d("request_submit", req.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }
}
