package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.ClServices.Pojo.GetClPojo;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.NewClPojo;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillTrResponse;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelAppPojo;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.DLDetailsForCancelApplPojo;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends zq7 {
    public final jl0 d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public oy3 h;
    public oy3 i;
    public oy3 j;
    public final oy3 k;
    public final oy3 l;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public a(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "cancelLLAppMob", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "cancelLLAppMob", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) CancelAppPojo.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.n().k((CancelAppPojo) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ kl0 b;
        public final /* synthetic */ Context c;

        public b(String str, kl0 kl0Var, Context context) {
            this.a = str;
            this.b = kl0Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getCLOnServices", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.l().k("error");
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
            Log.d("submit_response", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ServiceSubmitResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            ServiceSubmitResponse serviceSubmitResponse = (ServiceSubmitResponse) objFromJson;
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.b.s().k(serviceSubmitResponse);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public c(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getCLOnServices", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "getCLOnServices", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ServiceSubmitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.s().k((ServiceSubmitResponse) objFromJson);
            } catch (Exception unused) {
                this.c.l().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public d(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getCLData", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "getCLData", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) GetClPojo.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.p().k((GetClPojo) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public e(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getLLdetails", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "getLLdetails", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DLDetailsForCancelApplPojo.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.o().k((DLDetailsForCancelApplPojo) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public f(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getHZHillDrivingSchoolsForST", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "getHZHillDrivingSchoolsForST", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) HillTrResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.q().k((HillTrResponse) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public g(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "newCL", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "newCL", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) NewClPojo.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.r().k((NewClPojo) objFromJson);
            } catch (Exception unused) {
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kl0 c;

        public h(Context context, String str, kl0 kl0Var) {
            this.a = context;
            this.b = str;
            this.c = kl0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.c.l().k("error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getCLOnServices", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
                Context context = this.a;
                String strA = hz0.a.A();
                Intrinsics.checkNotNull(response);
                companion.a(context, strA, "getCLOnServices", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.b;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("submit_response", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ServiceSubmitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Log.d("response", String.valueOf((SecurityModle) response.body()));
                this.c.s().k((ServiceSubmitResponse) objFromJson);
            } catch (Exception unused) {
                this.c.l().k("error");
            }
        }
    }

    public kl0(jl0 repository) {
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

    public final void g(Context context, String appNumber, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appNumber, "appNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.b(appNumber, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(context, strValueOf, this));
    }

    public final void h(Context context, String clState, String clRto, String permHouseNo, String permStreet, String permLocation, String permPinCode, String presHouseNo, String presStreet, String presLocation, String presPinCode, String permDistrict, String permVillageOrTown, String presDistrict, String presVillageOrTown, String permSubDistrict, String presSubDistrict, String serviceCode, String clNumber, String dateOfBirth) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clState, "clState");
        Intrinsics.checkNotNullParameter(clRto, "clRto");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(clNumber, "clNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.c(clState, clRto, permHouseNo, permStreet, permLocation, permPinCode, presHouseNo, presStreet, presLocation, presPinCode, permDistrict, permVillageOrTown, presDistrict, presVillageOrTown, permSubDistrict, presSubDistrict, serviceCode, clNumber, dateOfBirth).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.f(lc5VarD, strValueOf).enqueue(new b(strValueOf, this, context));
    }

    public final void i(Context context, String stateCode, String rtoCode, String fName, String mName, String lName, String rfName, String rmName, String rlName, String relationTypeEntry, String fullName, String relFullName, String serviceCode, String dlValue, String dobValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(fName, "fName");
        Intrinsics.checkNotNullParameter(mName, "mName");
        Intrinsics.checkNotNullParameter(lName, "lName");
        Intrinsics.checkNotNullParameter(rfName, "rfName");
        Intrinsics.checkNotNullParameter(rmName, "rmName");
        Intrinsics.checkNotNullParameter(rlName, "rlName");
        Intrinsics.checkNotNullParameter(relationTypeEntry, "relationTypeEntry");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(relFullName, "relFullName");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(dlValue, "dlValue");
        Intrinsics.checkNotNullParameter(dobValue, "dobValue");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.d(stateCode, rtoCode, fName, mName, lName, rfName, rmName, rlName, relationTypeEntry, fullName, relFullName, serviceCode, dlValue, dobValue).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.f(lc5VarD, strValueOf).enqueue(new c(context, strValueOf, this));
    }

    public final void j(Context context, String clNumber, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clNumber, "clNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.g(clNumber, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new d(context, strValueOf, this));
    }

    public final void k(Context context, String appNumber, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appNumber, "appNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.f(appNumber, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5VarD, strValueOf).enqueue(new e(context, strValueOf, this));
    }

    public final oy3 l() {
        return this.k;
    }

    public final void m(Context context, String stateCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.a(stateCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.d(lc5VarD, strValueOf).enqueue(new f(context, strValueOf, this));
    }

    public final oy3 n() {
        return this.h;
    }

    public final oy3 o() {
        return this.i;
    }

    public final oy3 p() {
        return this.e;
    }

    public final oy3 q() {
        return this.g;
    }

    public final oy3 r() {
        return this.j;
    }

    public final oy3 s() {
        return this.f;
    }

    public final oy3 t() {
        return this.l;
    }

    public final void u(Context context, String newclState, String newclRto, String newclPresState, String newclPermState, String newclPresDistrict, String newclPermDistrict, String newclPresSubDistrict, String newclPermSubDistrict, String newclPresHouseNo, String newclPermHouseNo, String newclPresStreet, String newclPermStreet, String newclPresPincode, String newclPermPincode, String newclPresVillageOrTownCode, String newclPermVillageOrTownCode, String newclPresVillageOrTown, String newclPermVillageOrTown, String newclFname, String newclMname, String newclLname, String newclRelation, String newclRFname, String newclRMname, String newclRLname, String newclGender, String newclDateofBirth, String newclEduQ, String newclBlood, String newclMobile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newclState, "newclState");
        Intrinsics.checkNotNullParameter(newclRto, "newclRto");
        Intrinsics.checkNotNullParameter(newclPresState, "newclPresState");
        Intrinsics.checkNotNullParameter(newclPermState, "newclPermState");
        Intrinsics.checkNotNullParameter(newclPresDistrict, "newclPresDistrict");
        Intrinsics.checkNotNullParameter(newclPermDistrict, "newclPermDistrict");
        Intrinsics.checkNotNullParameter(newclPresSubDistrict, "newclPresSubDistrict");
        Intrinsics.checkNotNullParameter(newclPermSubDistrict, "newclPermSubDistrict");
        Intrinsics.checkNotNullParameter(newclPresHouseNo, "newclPresHouseNo");
        Intrinsics.checkNotNullParameter(newclPermHouseNo, "newclPermHouseNo");
        Intrinsics.checkNotNullParameter(newclPresStreet, "newclPresStreet");
        Intrinsics.checkNotNullParameter(newclPermStreet, "newclPermStreet");
        Intrinsics.checkNotNullParameter(newclPresPincode, "newclPresPincode");
        Intrinsics.checkNotNullParameter(newclPermPincode, "newclPermPincode");
        Intrinsics.checkNotNullParameter(newclPresVillageOrTownCode, "newclPresVillageOrTownCode");
        Intrinsics.checkNotNullParameter(newclPermVillageOrTownCode, "newclPermVillageOrTownCode");
        Intrinsics.checkNotNullParameter(newclPresVillageOrTown, "newclPresVillageOrTown");
        Intrinsics.checkNotNullParameter(newclPermVillageOrTown, "newclPermVillageOrTown");
        Intrinsics.checkNotNullParameter(newclFname, "newclFname");
        Intrinsics.checkNotNullParameter(newclMname, "newclMname");
        Intrinsics.checkNotNullParameter(newclLname, "newclLname");
        Intrinsics.checkNotNullParameter(newclRelation, "newclRelation");
        Intrinsics.checkNotNullParameter(newclRFname, "newclRFname");
        Intrinsics.checkNotNullParameter(newclRMname, "newclRMname");
        Intrinsics.checkNotNullParameter(newclRLname, "newclRLname");
        Intrinsics.checkNotNullParameter(newclGender, "newclGender");
        Intrinsics.checkNotNullParameter(newclDateofBirth, "newclDateofBirth");
        Intrinsics.checkNotNullParameter(newclEduQ, "newclEduQ");
        Intrinsics.checkNotNullParameter(newclBlood, "newclBlood");
        Intrinsics.checkNotNullParameter(newclMobile, "newclMobile");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.k(newclState, newclRto, newclPresState, newclPermState, newclPresDistrict, newclPermDistrict, newclPresSubDistrict, newclPermSubDistrict, newclPresHouseNo, newclPermHouseNo, newclPermPincode, newclPresStreet, newclPermStreet, newclPresPincode, newclPresVillageOrTownCode, newclPermVillageOrTownCode, newclPresVillageOrTown, newclPermVillageOrTown, newclFname, newclMname, newclLname, newclRelation, newclRFname, newclRMname, newclRLname, newclGender, newclDateofBirth, newclEduQ, newclBlood, newclMobile).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.e(lc5VarD, strValueOf).enqueue(new g(context, strValueOf, this));
    }

    public final void v(Context context, String clState, String clRto, String serviceCode, String clNumber, String dateOfBirth) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clState, "clState");
        Intrinsics.checkNotNullParameter(clRto, "clRto");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(clNumber, "clNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.l(clState, clRto, serviceCode, clNumber, dateOfBirth).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.f(lc5VarD, strValueOf).enqueue(new h(context, strValueOf, this));
    }
}
