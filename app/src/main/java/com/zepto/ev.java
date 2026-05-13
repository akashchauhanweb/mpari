package com.zepto;

import android.content.Context;
import android.os.Environment;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.NocDownload;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ev extends zq7 {
    public final pw d;
    public final oy3 e;
    public final oy3 f;
    public oy3 g;
    public oy3 h;
    public oy3 i;
    public oy3 j;
    public oy3 k;
    public oy3 l;
    public oy3 m;
    public oy3 n;
    public oy3 o;
    public oy3 p;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ev d;

        public a(Context context, Ref.ObjectRef objectRef, String str, ev evVar) {
            this.a = context;
            this.b = objectRef;
            this.c = str;
            this.d = evVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getreprintreceiptdetails", aVar.C(), aVar.D());
            this.d.j().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getreprintreceiptdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) NocDownload.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                NocDownload nocDownload = (NocDownload) objFromJson;
                ApiMessage apiMessage = nocDownload.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200 || gd1.a.m(nocDownload.getData())) {
                    oy3 oy3VarJ = this.d.j();
                    ApiMessage apiMessage2 = nocDownload.getApiMessage();
                    oy3VarJ.k(String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                    return;
                }
                byte[] bArrDecode2 = Base64.getDecoder().decode(nocDownload.getData());
                Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                String str2 = this.c + '_' + System.currentTimeMillis();
                if (this.d.w(bArrDecode2, str2)) {
                    this.d.i().k(str2.toString());
                }
            } catch (Exception unused) {
                this.d.i().k("Error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ev c;

        public b(Context context, Ref.ObjectRef objectRef, ev evVar) {
            this.a = context;
            this.b = objectRef;
            this.c = evVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fetchyourApplDetails", aVar.C(), aVar.D());
            this.c.k().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "fetchyourApplDetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ApplicationStatusSuccessModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.n().k((ApplicationStatusSuccessModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.k().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ev c;

        public c(Context context, Ref.ObjectRef objectRef, ev evVar) {
            this.a = context;
            this.b = objectRef;
            this.c = evVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fetchyourRegnDetails", aVar.C(), aVar.D());
            this.c.l().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "fetchyourRegnDetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) AppliByRcModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.m().k((AppliByRcModle) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.l().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ev c;

        public d(Context context, Ref.ObjectRef objectRef, ev evVar) {
            this.a = context;
            this.b = objectRef;
            this.c = evVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "reSendSMSAlerts", aVar.C(), aVar.D());
            this.c.q().k(th != null ? th.getMessage() : null);
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
                this.c.r().k((ResendOtp) objFromJson);
            } catch (Exception unused) {
                this.c.q().k("ERROR");
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ev c;

        public e(Context context, Ref.ObjectRef objectRef, ev evVar) {
            this.a = context;
            this.b = objectRef;
            this.c = evVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.y(), "verifySMSOtp", aVar.C(), aVar.D());
            this.c.t().k(th != null ? th.getMessage() : null);
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
                this.c.u().k((OtpVerifyResult) objFromJson);
            } catch (Exception unused) {
                this.c.t().k("error");
            }
        }
    }

    public ev(pw repository) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(byte[] bArr, String str) throws Throwable {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + (str + ".pdf"));
            if (file.exists()) {
                file.delete();
            }
            x(bArr, file);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private final void x(byte[] bArr, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            try {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.flush();
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void h(Context context, String application_no) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application_no, "application_no");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNo", application_no);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(context, objectRef, application_no, this));
    }

    public final oy3 i() {
        return this.o;
    }

    public final oy3 j() {
        return this.p;
    }

    public final oy3 k() {
        return this.l;
    }

    public final oy3 l() {
        return this.n;
    }

    public final oy3 m() {
        return this.m;
    }

    public final oy3 n() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void o(Context context, String applNo, String appStateCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(appStateCd, "appStateCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("applNumber", applNo);
            jSONObject.put("stateCode", appStateCd);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
    public final void p(Context context, String rcNo, String chassisNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rcNo, "rcNo");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("regNo", rcNo);
            jSONObject.put("chasiNo", chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(context, objectRef, this));
    }

    public final oy3 q() {
        return this.h;
    }

    public final oy3 r() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void s(Context context, String smsId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.r(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(context, objectRef, this));
    }

    public final oy3 t() {
        return this.j;
    }

    public final oy3 u() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void v(Context context, String otp, String otpid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.x(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(context, objectRef, this));
    }
}
