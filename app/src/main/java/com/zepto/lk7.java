package com.zepto;

import android.content.Context;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class lk7 extends zq7 {
    public final bg7 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ lk7 c;

        public a(Context context, Ref.ObjectRef objectRef, lk7 lk7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = lk7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.c.h().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.y(), "reSendSMSAlerts", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.i().k((ResendOtp) objFromJson);
            } catch (Exception unused) {
                this.c.h().k("ERROR");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ lk7 c;

        public b(Context context, Ref.ObjectRef objectRef, lk7 lk7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = lk7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "verifySMSOtp", aVar.C(), aVar.D());
            this.c.g().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.y(), "verifySMSOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) OtpVerifyResult.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.k().k((OtpVerifyResult) objFromJson);
            } catch (Exception unused) {
                this.c.g().k("error");
            }
        }
    }

    public lk7(bg7 repository) {
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
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.j;
    }

    public final oy3 i() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(Context context, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.r(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(context, objectRef, this));
    }

    public final oy3 k() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void l(Context context, String otp, String otpid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.x(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(context, objectRef, this));
    }
}
