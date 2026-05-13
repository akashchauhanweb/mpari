package com.zepto;

import android.content.Context;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycRequest;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.zepto.hz0;
import com.zepto.ze1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class f47 extends zq7 {
    public final e47 d;
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
        public final /* synthetic */ f47 c;

        public a(Context context, Ref.ObjectRef objectRef, f47 f47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = f47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "generateOtp", aVar.C(), aVar.D());
            this.c.j().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "generateOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) eKycResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.i().k((eKycResponse) objFromJson);
            } catch (Exception unused) {
                this.c.j().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ f47 c;

        public b(Context context, Ref.ObjectRef objectRef, f47 f47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = f47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "generateOtp", aVar.C(), aVar.D());
            this.c.j().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "generateOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) eKycResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.i().k((eKycResponse) objFromJson);
            } catch (Exception unused) {
                this.c.j().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ f47 c;

        public c(Context context, Ref.ObjectRef objectRef, f47 f47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = f47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "verifyOtp", aVar.C(), aVar.D());
            this.c.h().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "verifyOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) EkycVerifyResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.g().k((EkycVerifyResponse) objFromJson);
            } catch (Exception unused) {
                this.c.h().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ f47 c;

        public d(Context context, Ref.ObjectRef objectRef, f47 f47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = f47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "verifyOtp", aVar.C(), aVar.D());
            this.c.h().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "verifyOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) EkycVerifyResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.g().k((EkycVerifyResponse) objFromJson);
            } catch (Exception unused) {
                this.c.h().k("error");
            }
        }
    }

    public f47(e47 repository) {
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
        return this.g;
    }

    public final oy3 h() {
        return this.h;
    }

    public final oy3 i() {
        return this.e;
    }

    public final oy3 j() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public final void k(Context context, String aadhaar_no, String rc_number, NrvDetails rcdetails, String type, String purposeCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aadhaar_no, "aadhaar_no");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purposeCode);
        eKycRequest ekycrequest = !StringsKt__StringsJVMKt.equals(type, "A", true) ? new eKycRequest("", type, String.valueOf(rcdetails.getRc_chasi_no()), "yes", "", "", "", true, arrayList, rc_number, String.valueOf(rcdetails.getState_cd()), "", "", u31.a.a(aadhaar_no).toString()) : new eKycRequest(u31.a.a(aadhaar_no).toString(), type, String.valueOf(rcdetails.getRc_chasi_no()), "yes", "", "", "", true, arrayList, rc_number, String.valueOf(rcdetails.getState_cd()), "", "", "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), mt6.a.f(ekycrequest)), (String) objectRef.element).enqueue(new a(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public final void l(Context context, String aadhaar_no, String rc_number, String chassiNO, String type, String purposeCode, String stateCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aadhaar_no, "aadhaar_no");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(chassiNO, "chassiNO");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        ws6 ws6Var = new ws6(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(purposeCode);
        eKycRequest ekycrequest = !StringsKt__StringsJVMKt.equals(type, "A", true) ? new eKycRequest("", type, chassiNO, "yes", "", "", "", true, arrayList, rc_number, stateCd, "", ws6Var.k(), u31.a.a(aadhaar_no).toString()) : new eKycRequest(u31.a.a(aadhaar_no).toString(), type, chassiNO, "yes", "", "", "", true, arrayList, rc_number, stateCd, "", ws6Var.k(), "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), mt6.a.f(ekycrequest)), (String) objectRef.element).enqueue(new b(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public final void m(Context context, String aadhaar_no, String rc_number, NrvDetails rcdetails, String type, String purposeCode, String otp, String tran_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aadhaar_no, "aadhaar_no");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(tran_no, "tran_no");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purposeCode);
        eKycRequest ekycrequest = !StringsKt__StringsJVMKt.equals(type, "A", true) ? new eKycRequest("", type, String.valueOf(rcdetails.getRc_chasi_no()), "yes", "", "", otp, true, arrayList, rc_number, String.valueOf(rcdetails.getState_cd()), tran_no, "", u31.a.a(aadhaar_no).toString()) : new eKycRequest(u31.a.a(aadhaar_no).toString(), type, String.valueOf(rcdetails.getRc_chasi_no()), "yes", "", "", otp, true, arrayList, rc_number, String.valueOf(rcdetails.getState_cd()), tran_no, "", "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5.Companion.d(ls3.g.b("application/json"), mt6.a.f(ekycrequest).toString()), (String) objectRef.element).enqueue(new c(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public final void n(Context context, String aadhaar_no, String rc_number, String chassiNO, String type, String purposeCode, String otp, String tran_no, String stateCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aadhaar_no, "aadhaar_no");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(chassiNO, "chassiNO");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(tran_no, "tran_no");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purposeCode);
        eKycRequest ekycrequest = !StringsKt__StringsJVMKt.equals(type, "A", true) ? new eKycRequest("", type, chassiNO, "yes", "", "", otp, true, arrayList, rc_number, stateCode, tran_no, "", u31.a.a(aadhaar_no).toString()) : new eKycRequest(u31.a.a(aadhaar_no).toString(), type, chassiNO, "yes", "", "", otp, true, arrayList, rc_number, stateCode, tran_no, "", "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5.Companion.d(ls3.g.b("application/json"), mt6.a.f(ekycrequest).toString()), (String) objectRef.element).enqueue(new d(context, objectRef, this));
    }
}
