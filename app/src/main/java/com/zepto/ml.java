package com.zepto;

import android.util.Log;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.zepto.lc5;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ml extends zq7 {
    public final pl d;
    public Call e;
    public Call f;
    public oy3 g;
    public oy3 h;
    public oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public oy3 n;
    public oy3 o;
    public oy3 p;
    public oy3 q;
    public oy3 r;

    public static final class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            ml.this.h().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            OtpAdharRes otpAdharRes;
            if (response != null) {
                try {
                    otpAdharRes = (OtpAdharRes) response.body();
                } catch (Exception unused) {
                    ml.this.h().k("error");
                    return;
                }
            } else {
                otpAdharRes = null;
            }
            Log.v("otp_response", String.valueOf(otpAdharRes));
            ml.this.g().k(response != null ? (OtpAdharRes) response.body() : null);
        }
    }

    public static final class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            ml.this.l().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            UserFullDetails userFullDetails;
            if (response != null) {
                try {
                    userFullDetails = (UserFullDetails) response.body();
                } catch (Exception unused) {
                    ml.this.h().k("error");
                    return;
                }
            } else {
                userFullDetails = null;
            }
            Log.v("otp_response", String.valueOf(userFullDetails));
            ml.this.n().k(response != null ? (UserFullDetails) response.body() : null);
        }
    }

    public ml(pl repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
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
    }

    public final oy3 g() {
        return this.o;
    }

    public final oy3 h() {
        return this.p;
    }

    public final oy3 i() {
        return this.k;
    }

    public final oy3 j() {
        return this.l;
    }

    public final oy3 k() {
        return this.m;
    }

    public final oy3 l() {
        return this.r;
    }

    public final oy3 m() {
        return this.n;
    }

    public final oy3 n() {
        return this.q;
    }

    public final void o(String aadhaarNo, String serviceId, String nk, String randomNumber) {
        Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(nk, "nk");
        Intrinsics.checkNotNullParameter(randomNumber, "randomNumber");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.i(aadhaarNo, randomNumber).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        HashMap map = new HashMap();
        map.put("Service-Id", serviceId);
        map.put("nk", nk);
        Call callB = this.d.b(map, lc5VarD);
        this.f = callB;
        if (callB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseApi");
            callB = null;
        }
        callB.enqueue(new a());
    }

    public final void p(String aadhaarNo, String serviceId, String otpNo, String txNo, String nk) {
        Intrinsics.checkNotNullParameter(aadhaarNo, "aadhaarNo");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(otpNo, "otpNo");
        Intrinsics.checkNotNullParameter(txNo, "txNo");
        Intrinsics.checkNotNullParameter(nk, "nk");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.j(aadhaarNo, otpNo, txNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        HashMap map = new HashMap();
        map.put("nk", nk);
        map.put("Service-Id", serviceId);
        Call callA = this.d.a(map, lc5VarD);
        this.e = callA;
        if (callA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseApiDetails");
            callA = null;
        }
        callA.enqueue(new b());
    }
}
