package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.zepto.hs1;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class nr1 extends zq7 {
    public final lr1 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;
    public final oy3 o;
    public final oy3 p;
    public final oy3 q;
    public final oy3 r;
    public final oy3 s;
    public final oy3 t;
    public final oy3 u;
    public final oy3 v;
    public final oy3 w;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public a(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.s().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getDLdetForGivenDLNumber", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Error unused) {
                    this.b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (String.valueOf(securityModle).length() > 0) {
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLEligibleMasterData.DlservicesValidationdto.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.r().k((DLEligibleMasterData.DlservicesValidationdto) objFromJson);
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public b(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.A().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "rtos", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.A().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) CurrentRTO.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.y().k((CurrentRTO) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public c(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.B().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "stateMast", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.B().k("Error");
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
            Log.d("mCurrentStateSarathi", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SarathiStatePojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.z().k((SarathiStatePojo) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public d(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.m().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getS4customstDet", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    try {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        tu5.a aVar = tu5.a;
                        String str = this.a;
                        byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                        Log.d("customStateResp", strValueOf);
                        Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) CustomState.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.C().k((CustomState) objFromJson);
                    } catch (Exception unused) {
                        SecurityModle securityModle2 = (SecurityModle) response.body();
                        tu5.a aVar2 = tu5.a;
                        String str2 = this.a;
                        byte[] bArrDecode2 = Base64.getDecoder().decode(securityModle2 != null ? securityModle2.getData() : null);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                        String strValueOf2 = String.valueOf(aVar2.a(str2, new String(bArrDecode2, Charsets.UTF_8)));
                        Log.d("ResponseDec", strValueOf2);
                        this.b.m().k(strValueOf2);
                    }
                } catch (Error unused2) {
                    this.b.m().k("Error");
                }
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public e(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.p().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getDLLicence", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.p().k("Error");
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
            int length = strValueOf.length() / 1000;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i * 1000;
                    int i3 = i + 1;
                    int length2 = i3 * 1000;
                    if (length2 > strValueOf.length()) {
                        length2 = strValueOf.length();
                    }
                    String strSubstring = strValueOf.substring(i2, length2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.v("TAG_ADD", strSubstring);
                    if (i == length) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.o().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public f(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.m().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "getDLLastEndRTODetForGivenDLNumber", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    try {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        tu5.a aVar = tu5.a;
                        String str = this.a;
                        byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DlLastRtoDetailsDto.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.l().k((DlLastRtoDetailsDto) objFromJson);
                    } catch (Exception unused) {
                        this.b.m().k("error");
                    }
                } catch (Error unused2) {
                    this.b.m().k("Error");
                }
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public g(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "reSendSMSAlerts", aVar.C(), aVar.D());
            this.b.v().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.t().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.w().k((ResendOtp) objFromJson);
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public h(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.t().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "sendSMSAlerts", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.t().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.u().k((SendOtpResult) objFromJson);
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ nr1 b;
        public final /* synthetic */ Context c;

        public i(String str, nr1 nr1Var, Context context) {
            this.a = str;
            this.b = nr1Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            this.b.t().k(th != null ? th.getMessage() : null);
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.A(), "verifySMSOtp", aVar.C(), aVar.D());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Error unused) {
                    this.b.t().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) OtpVerifyResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.E().k((OtpVerifyResult) objFromJson);
        }
    }

    public nr1(lr1 repository) {
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
        this.m = new oy3();
        this.n = new oy3();
        this.o = new oy3();
        this.p = new oy3();
        this.q = new oy3();
        this.r = new oy3();
        this.s = new oy3();
        this.t = new oy3();
        this.u = new oy3();
        this.v = new oy3();
        this.w = new oy3();
    }

    public final oy3 A() {
        return this.u;
    }

    public final oy3 B() {
        return this.s;
    }

    public final oy3 C() {
        return this.v;
    }

    public final void D(Context context, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.h(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), strValueOf).enqueue(new g(strValueOf, this, context));
    }

    public final oy3 E() {
        return this.i;
    }

    public final void F(Context context, String mobile_no, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.j(mobile_no, smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.h(aVar.d(ls3VarB, string), strValueOf).enqueue(new h(strValueOf, this, context));
    }

    public final void G(Context context, String otp, String otpid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.i(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string), strValueOf).enqueue(new i(strValueOf, this, context));
    }

    public final void g(Context context, String dlnumber, String dob, String rto, String random_key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dlnumber, "dlnumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rto, "rto");
        Intrinsics.checkNotNullParameter(random_key, "random_key");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.a(dlnumber, dob, rto, random_key).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, StringsKt__StringsKt.trim((CharSequence) string).toString()), strValueOf).enqueue(new a(strValueOf, this, context));
    }

    public final void h(Context context, String rto) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rto, "rto");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.c(rto).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this, context));
    }

    public final void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.d().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), strValueOf).enqueue(new c(strValueOf, this, context));
    }

    public final void j(Context context, String stateCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.e(stateCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new d(strValueOf, this, context));
    }

    public final void k(Context context, String str, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dob, "dob");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(str, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string2), strValueOf).enqueue(new e(strValueOf, this, context));
    }

    public final oy3 l() {
        return this.k;
    }

    public final oy3 m() {
        return this.l;
    }

    public final oy3 n() {
        return this.p;
    }

    public final oy3 o() {
        return this.m;
    }

    public final oy3 p() {
        return this.n;
    }

    public final oy3 q() {
        return this.q;
    }

    public final oy3 r() {
        return this.j;
    }

    public final oy3 s() {
        return this.o;
    }

    public final oy3 t() {
        return this.e;
    }

    public final oy3 u() {
        return this.f;
    }

    public final oy3 v() {
        return this.h;
    }

    public final oy3 w() {
        return this.g;
    }

    public final void x(Context context, String dlNumber, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mr1.a.f(dlNumber, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string), strValueOf).enqueue(new f(strValueOf, this, context));
    }

    public final oy3 y() {
        return this.t;
    }

    public final oy3 z() {
        return this.r;
    }
}
