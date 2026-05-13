package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nic.mparivahan.Citizen.Models.Vhclass;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycRequest;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadNocHomeScreen;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanModel.ApFacelessCheckModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.EgblityStatus;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.FormDetailsSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NocDownload;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SaveSlotBookingModel;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanModel.ValidateChassiRes;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.AadhaarMobModle;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentByDateResponse;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentRequest;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotCounterResponseDetails;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotPaymaentStatusResponse;
import com.nic.mparivahan.VahanServices.eSign.ModelEsign.esignModel;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.tu5;
import com.zepto.ze1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ld7 extends zq7 {
    public final oy3 A;
    public oy3 A0;
    public final oy3 B;
    public oy3 B0;
    public final oy3 C;
    public oy3 C0;
    public final oy3 D;
    public oy3 D0;
    public final oy3 E;
    public final oy3 E0;
    public final oy3 F;
    public final oy3 F0;
    public final oy3 G;
    public final oy3 G0;
    public final oy3 H;
    public final oy3 H0;
    public final oy3 I;
    public final oy3 I0;
    public final oy3 J;
    public final oy3 J0;
    public final oy3 K;
    public oy3 K0;
    public final oy3 L;
    public oy3 L0;
    public final oy3 M;
    public final oy3 M0;
    public final oy3 N;
    public final oy3 N0;
    public final oy3 O;
    public final oy3 P;
    public final oy3 Q;
    public final oy3 R;
    public oy3 S;
    public oy3 T;
    public oy3 U;
    public oy3 V;
    public oy3 W;
    public oy3 X;
    public final oy3 Y;
    public final oy3 Z;
    public final oy3 a0;
    public final oy3 b0;
    public final oy3 c0;
    public final jd7 d;
    public final oy3 d0;
    public final oy3 e;
    public final oy3 e0;
    public final oy3 f;
    public final oy3 f0;
    public final oy3 g;
    public final oy3 g0;
    public final oy3 h;
    public final oy3 h0;
    public final oy3 i;
    public final oy3 i0;
    public final oy3 j;
    public final oy3 j0;
    public final oy3 k;
    public final oy3 k0;
    public final oy3 l;
    public final oy3 l0;
    public final oy3 m;
    public oy3 m0;
    public final oy3 n;
    public oy3 n0;
    public final oy3 o;
    public oy3 o0;
    public final oy3 p;
    public oy3 p0;
    public final oy3 q;
    public oy3 q0;
    public final oy3 r;
    public oy3 r0;
    public final oy3 s;
    public final oy3 s0;
    public final oy3 t;
    public final oy3 t0;
    public final oy3 u;
    public oy3 u0;
    public final oy3 v;
    public oy3 v0;
    public final oy3 w;
    public oy3 w0;
    public final oy3 x;
    public oy3 x0;
    public final oy3 y;
    public oy3 y0;
    public final oy3 z;
    public oy3 z0;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public a(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "coadraft", aVar.C(), aVar.D());
            this.c.B().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "coadraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ChaangeOfAddressStatus.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.A().k((ChaangeOfAddressStatus) objFromJson);
            } catch (Exception unused) {
                this.c.B().k("error");
            }
        }
    }

    public static final class a0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public a0(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.I().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.I().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            new Gson();
            this.b.i0().k(VContant.INSTANCE.h(strValueOf));
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public b(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineservicechecksdata", aVar.C(), aVar.D());
            this.c.d1().k("Internet Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "fillvmonlineservicechecksdata", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) vahanOnlineCheck.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.c1().k((vahanOnlineCheck) objFromJson);
            } catch (Exception e) {
                this.c.d1().k("error");
                e.printStackTrace();
            }
        }
    }

    public static final class b0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public b0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getavailabledataforbookappt", aVar.C(), aVar.D());
            this.c.R0().k("Network Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getavailabledataforbookappt", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SlotAppointmentByDateResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.Q0().k((SlotAppointmentByDateResponse) objFromJson);
            } catch (Exception e) {
                this.c.R0().k("Error");
                Log.d("SlotAppointmentError", e.getLocalizedMessage());
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public c(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineservicechecksdata", aVar.C(), aVar.D());
            this.b.s().k("Internet Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) AadhaarMobModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.r().k((AadhaarMobModle) objFromJson);
            } catch (Exception e) {
                this.b.s().k("error");
                e.printStackTrace();
            }
        }
    }

    public static final class c0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public c0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getstates", aVar.C(), aVar.D());
            this.c.b1().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getstates", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanStateModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.Z0().k((VahanStateModle) objFromJson);
            } catch (Exception e) {
                Log.d("StateMaster_error+", e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ld7 b;

        public d(Context context, ld7 ld7Var) {
            this.a = context;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "checkhold", aVar.C(), aVar.D());
            this.b.D().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "checkhold", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                this.b.C().k("Success");
            } catch (Exception e) {
                e.printStackTrace();
                this.b.D().k("error");
            }
        }
    }

    public static final class d0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public d0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "validateaadhaardatabyregno", aVar.C(), aVar.D());
            this.c.l1().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "validateaadhaardatabyregno", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                if (StringsKt__StringsJVMKt.equals(strValueOf, "true", true)) {
                    this.c.k1().k(Boolean.TRUE);
                } else {
                    this.c.l1().k(strValueOf);
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.c.l1().k("Error");
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public e(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "checkSucessfulPaymentorNot", aVar.C(), aVar.D());
            this.c.Q().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "checkSucessfulPaymentorNot", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SlotPaymaentStatusResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.E().k((SlotPaymaentStatusResponse) objFromJson);
            } catch (Exception e) {
                Log.d("saveSlotBookingError", e.getLocalizedMessage());
            }
        }
    }

    public static final class e0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public e0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineconfigurationdata", aVar.C(), aVar.D());
            this.c.m0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "fillvmonlineconfigurationdata", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("FinalRequest", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) StateCostForDms.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.l0().k((StateCostForDms) objFromJson);
            } catch (Exception e) {
                this.c.m0().k("error");
                Log.d("FinalRequest-ERROR", e.getLocalizedMessage());
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public f(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getuserdetailsdobjdata", aVar.C(), aVar.D());
            this.c.X0().k("Internet Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                try {
                    ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getuserdetailsdobjdata", String.valueOf(response.code()), response.message().toString());
                    SecurityModle securityModle = (SecurityModle) response.body();
                    tu5.a aVar = tu5.a;
                    String str = (String) this.b.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                    if (gd1.a.m(strValueOf)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    if (jSONObject.has("errorDesc")) {
                        this.c.X0().k(jSONObject.getString("errorDesc"));
                        return;
                    }
                    Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SlotUserDataModel.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.Y0().k((SlotUserDataModel) objFromJson);
                } catch (Exception unused) {
                    this.c.X0().k("error");
                }
            } catch (Exception unused2) {
                if (gd1.a.m(" ")) {
                    this.c.X0().k("error");
                } else {
                    JSONObject jSONObject2 = new JSONObject(" ");
                    if (jSONObject2.has("errorDesc")) {
                        this.c.X0().k(jSONObject2.getString("errorDesc"));
                    }
                }
            }
        }
    }

    public static final class f0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public f0(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineconfigurationdata", aVar.C(), aVar.D());
            this.b.m0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.m0().k("error");
                    Log.d("FinalRequest-ERROR", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) StateCostForDms.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l0().k((StateCostForDms) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public g(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmauthenticationdata", aVar.C(), aVar.D());
            this.c.v().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "fillvmauthenticationdata", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("checkSlotEligility", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ApFacelessCheckModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.u().k((ApFacelessCheckModel) objFromJson);
            } catch (Exception unused) {
                this.c.v().k("error");
            }
        }
    }

    public static final class g0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public g0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getdistrictlistbyStateCode", aVar.C(), aVar.D());
            this.c.I().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getdistrictlistbyStateCode", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DistictModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.H().k((DistictModle) objFromJson);
            } catch (Exception e) {
                Log.d("OtpVerify_error+", e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public h(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.c.k0().k("Error");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getstate_cdOffcd", aVar.C(), aVar.D());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getstate_cdOffcd", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Gson gsonCreate = new GsonBuilder().create();
                try {
                    if (response.isSuccessful() && response.code() == 200) {
                        JSONObject jSONObject = new JSONObject(strValueOf);
                        if (jSONObject.has("errorDesc")) {
                            this.c.k0().k(jSONObject.getString("errorDesc"));
                        } else {
                            this.c.j0().k((GetStateCode) gsonCreate.fromJson(strValueOf, GetStateCode.class));
                        }
                    } else if (response.code() == 400) {
                        this.c.k0().k(String.valueOf(((GetStateCode) gsonCreate.fromJson(strValueOf, GetStateCode.class)).getErrorDesc()));
                    }
                } catch (Exception unused) {
                    Log.e("Print ---", "22");
                    this.c.k0().k("Error");
                }
            } catch (Exception unused2) {
                this.c.k0().k("Error");
            }
        }
    }

    public static final class h0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public h0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getdistrictlistbyStateCode", aVar.C(), aVar.D());
            this.c.K().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getdistrictlistbyStateCode", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DistictModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.J().k((DistictModle) objFromJson);
            } catch (Exception e) {
                Log.d("vhn_disLiveData+", e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ld7 d;
        public final /* synthetic */ DownloadNocHomeScreen e;

        public i(Context context, Ref.ObjectRef objectRef, String str, ld7 ld7Var, DownloadNocHomeScreen downloadNocHomeScreen) {
            this.a = context;
            this.b = objectRef;
            this.c = str;
            this.d = ld7Var;
            this.e = downloadNocHomeScreen;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getNOCCertificate", aVar.C(), aVar.D());
            this.d.t0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getNOCCertificate", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
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
                    oy3 oy3VarT0 = this.d.t0();
                    ApiMessage apiMessage2 = nocDownload.getApiMessage();
                    oy3VarT0.k(String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                } else {
                    byte[] bArrDecode2 = Base64.getDecoder().decode(nocDownload.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                    String str2 = this.c;
                    if (this.d.E1(bArrDecode2, str2, this.e)) {
                        this.d.s0().k(str2.toString());
                    }
                }
            } catch (Exception unused) {
                this.d.t0().k("Error");
            }
        }
    }

    public static final class i0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public i0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getfeedetails", aVar.C(), aVar.D());
            this.c.U().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getfeedetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) FeesModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.T().k((FeesModle) objFromJson);
            } catch (Exception e) {
                this.c.U().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public j(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.S().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.S().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) esignModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.R().k((esignModel) objFromJson);
        }
    }

    public static final class j0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public j0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "savebookapptdetails", aVar.C(), aVar.D());
            this.c.T0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "savebookapptdetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SaveSlotBookingModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.U0().k((SaveSlotBookingModel) objFromJson);
            } catch (Exception e) {
                Log.d("saveSlotBookingError", e.getLocalizedMessage());
            }
        }
    }

    public static final class k implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public k(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "afterpayment", aVar.C(), aVar.D());
            this.c.C0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "afterpayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (jSONObject.has("errorcode")) {
                    this.c.C0().k(jSONObject.getString("errorDesc").toString());
                    return;
                }
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) AfterPaymentResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.B0().k((AfterPaymentResponse) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.C0().k("Error");
            }
        }
    }

    public static final class k0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public k0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "duprcappl", aVar.C(), aVar.D());
            this.c.O().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "duprcappl", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) dulicateRcResponseModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.N().k((dulicateRcResponseModle) objFromJson);
            } catch (Exception e) {
                this.c.O().k("Error");
                Log.d("duplicateRcSubmiterror", e.getLocalizedMessage());
            }
        }
    }

    public static final class l implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public l(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getdatafrofinlsubmit", aVar.C(), aVar.D());
            this.c.b0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.isSuccessful() || response.code() != 200) {
                this.c.b0().k("Error");
                return;
            }
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getdatafrofinlsubmit", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                try {
                    Object objFromJson = new GsonBuilder().create().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RequireDataForBePaymet.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.Y().k((RequireDataForBePaymet) objFromJson);
                } catch (Exception unused) {
                    this.c.b0().k("Error");
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static final class l0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public l0(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.w0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.w0().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("ForNocDraft", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) NocDraftResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.v0().k((NocDraftResponse) objFromJson);
        }
    }

    public static final class m implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public m(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getdatafrofinlsubmit", aVar.C(), aVar.D());
            this.c.b0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getdatafrofinlsubmit", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
            if (!response.isSuccessful() || response.code() != 200) {
                this.c.b0().k("Error");
                return;
            }
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                try {
                    Object objFromJson = new GsonBuilder().create().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RequireDataForBePaymet.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.Z().k((RequireDataForBePaymet) objFromJson);
                } catch (Exception unused) {
                    this.c.a0().k("Error");
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static final class m0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public m0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "hptdraft", aVar.C(), aVar.D());
            this.c.r0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "hptdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) HptTerResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.q0().k((HptTerResponse) objFromJson);
            } catch (Exception unused) {
                this.c.r0().k("Error");
            }
        }
    }

    public static final class n implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public n(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "beforepayment", aVar.C(), aVar.D());
            this.c.E0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "beforepayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("BeforePayment", strValueOf);
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (jSONObject.has("returnUrl")) {
                    Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PaymentBeforeUrlResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.D0().k((PaymentBeforeUrlResponse) objFromJson);
                } else if (jSONObject.has("errorDesc")) {
                    this.c.E0().k(jSONObject.getString("errorDesc"));
                } else {
                    this.c.E0().k("Error");
                }
            } catch (Exception e) {
                this.c.E0().k("Error");
                Log.e("BeforePayment_ERROR", e.getStackTrace().toString());
            }
        }
    }

    public static final class n0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public n0(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.W().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.W().k("error");
                    Log.d("FinalRequest-ERROR", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.e("FinalRequest", strValueOf);
            JSONObject jSONObject = new JSONObject(strValueOf);
            if (jSONObject.has("errorcode")) {
                if (jSONObject.getInt("errorcode") == 400) {
                    this.b.W().k(jSONObject.getString("errorDesc"));
                }
            } else {
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) FinalRequestSubmitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.V().k((FinalRequestSubmitResponse) objFromJson);
            }
        }
    }

    public static final class o implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public o(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "beforepayment", aVar.C(), aVar.D());
            this.c.E0().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "beforepayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (jSONObject.has("returnUrl")) {
                    Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) PaymentBeforeUrlResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.D0().k((PaymentBeforeUrlResponse) objFromJson);
                } else if (jSONObject.has("errorDesc")) {
                    this.c.E0().k(jSONObject.getString("errorDesc"));
                } else {
                    this.c.E0().k("Error");
                }
            } catch (Exception unused) {
                this.c.E0().k("Error");
            }
        }
    }

    public static final class o0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;

        public o0(Ref.ObjectRef objectRef) {
            this.a = objectRef;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("FinalRequest-ERROR", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) FinalRequestSubmitResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        }
    }

    public static final class p implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public p(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "ownerinformationforinsurancepuccpermit", aVar.C(), "Connection time out");
            this.c.M0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                if (response == null || response.code() != 200) {
                    if (response == null || response.code() != 400) {
                        Log.e("test", "test2");
                        try {
                            Object objFromJson = new GsonBuilder().create().fromJson(strValueOf, (Class<Object>) Vhclass.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                            this.c.L0().k((Vhclass) objFromJson);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    Log.e("test", "test1");
                    if (jSONObject.has("errorDesc")) {
                        this.c.M0().k(jSONObject.getString("errorDesc").toString());
                        return;
                    } else {
                        this.c.M0().k("error");
                        return;
                    }
                }
                JSONObject jSONObject2 = new JSONObject(strValueOf);
                if (jSONObject2.has("errorDesc")) {
                    this.c.M0().k(jSONObject2.getString("errorDesc").toString());
                    return;
                }
                Log.e("test", "test21");
                try {
                    Object objFromJson2 = new GsonBuilder().create().fromJson(strValueOf, (Class<Object>) Vhclass.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson2, "fromJson(...)");
                    this.c.L0().k((Vhclass) objFromJson2);
                } catch (u53 unused2) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("apiMessage");
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
                    if (jSONObject3.has("developerMessage")) {
                        this.c.M0().k(jSONObject3.getString("developerMessage").toString());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.c.M0().k("error");
            }
        }
    }

    public static final class p0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public p0(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineservicechecksdata", aVar.C(), aVar.D());
            this.b.h1().k("Internet Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Generate Otp", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) Vahangenotp.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.g1().k((Vahangenotp) objFromJson);
            } catch (Exception e) {
                this.b.h1().k("error");
                e.printStackTrace();
            }
        }
    }

    public static final class q implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public q(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getcounterbyservicesalloted", aVar.C(), aVar.D());
            this.c.W0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getcounterbyservicesalloted", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SlotCounterResponseDetails.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.V0().k((SlotCounterResponseDetails) objFromJson);
            } catch (Exception e) {
                Log.d("checkSlotError", e.getLocalizedMessage());
                this.c.W0().k("Error");
            }
        }
    }

    public static final class q0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public q0(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "fillvmonlineservicechecksdata", aVar.C(), aVar.D());
            this.b.d1().k("Internet Issue");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("Generate Otp", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) Vahangenotp.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i1().k((Vahangenotp) objFromJson);
            } catch (Exception e) {
                this.b.j1().k("error");
                e.printStackTrace();
            }
        }
    }

    public static final class r implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public r(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getallowedservicesbyregnno", aVar.C(), aVar.D());
            this.c.I().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getallowedservicesbyregnno", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) EgblityStatus.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.c0().k((EgblityStatus) objFromJson);
            } catch (Exception e) {
                Log.d("getEgblity-ERROR", e.getLocalizedMessage());
                this.c.d0().k("ERROR");
            }
        }
    }

    public static final class r0 implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public r0(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "verifyOtp", aVar.C(), aVar.D());
            this.b.f1().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.f1().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            JSONObject jSONObject = new JSONObject(aVar.a(str, data));
            if (jSONObject.has("apiMessage")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                if (jSONObject2.getInt("statusCode") == 200) {
                    String string = jSONObject2.getString("developerMessage");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    this.b.e1().k(string);
                } else {
                    String string2 = jSONObject2.getString("developerMessage");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    this.b.f1().k(string2);
                }
            }
        }
    }

    public static final class s implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public s(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getprefilledforms", aVar.C(), aVar.D());
            this.c.e0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getprefilledforms", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                try {
                    FormDetailsSuccessModel formDetailsSuccessModel = (FormDetailsSuccessModel) new GsonBuilder().create().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), FormDetailsSuccessModel.class);
                    if (response.isSuccessful() && response.code() == 200) {
                        this.c.f0().k(formDetailsSuccessModel);
                    } else if (StringsKt__StringsJVMKt.equals$default(formDetailsSuccessModel.getErrorcode(), "400", false, 2, null)) {
                        this.c.e0().k(String.valueOf(formDetailsSuccessModel.getErrorDesc()));
                    } else {
                        this.c.e0().k("Service temporarily unavailable, Please try again later.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.c.e0().k("Service temporarily unavailable, Please try again later.");
                }
            } catch (Exception e2) {
                Log.d("validateRcNumber++", e2.getLocalizedMessage());
                this.c.e0().k("Service temporarily unavailable, Please try again later.");
            }
        }
    }

    public static final class s0 implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public s0(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "validateregandchasino", aVar.C(), aVar.D());
            this.c.o1().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "validateregandchasino", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                try {
                    ValidateChassiRes validateChassiRes = (ValidateChassiRes) new GsonBuilder().create().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), ValidateChassiRes.class);
                    if (validateChassiRes.getApiMessage().getStatusCode() == 200) {
                        this.c.n1().k("200");
                    } else {
                        String message = validateChassiRes.getApiMessage().getMessage();
                        if (message == null || StringsKt__StringsJVMKt.isBlank(message)) {
                            this.c.o1().k("Service temporarily unavailable, Please try again later.");
                        } else {
                            this.c.o1().k(String.valueOf(validateChassiRes.getApiMessage().getDeveloperMessage()));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.c.o1().k("Service temporarily unavailable, Please try again later.");
                }
            } catch (Exception e2) {
                Log.d("validateRcNumber++", e2.getLocalizedMessage());
                this.c.o1().k("Service temporarily unavailable, Please try again later.");
            }
        }
    }

    public static final class t implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public t(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "gethptdetails", aVar.C(), aVar.D());
            this.c.p0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "gethptdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) HptDetailsModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.o0().k((HptDetailsModle) objFromJson);
            } catch (Exception e) {
                Log.d("gethptdet-err", e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    public static final class u implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public u(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.h0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) NocReasonModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.g0().k((NocReasonModle) objFromJson);
        }
    }

    public static final class v implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;
        public final /* synthetic */ Context c;

        public v(Ref.ObjectRef objectRef, ld7 ld7Var, Context context) {
            this.a = objectRef;
            this.b = ld7Var;
            this.c = context;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.c;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "ownerinformation", aVar.C(), aVar.D());
            this.b.y0().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.y0().k("Error");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            JSONObject jSONObject = new JSONObject(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
            JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
            if (jSONObject2.getInt("statusCode") == 200) {
                this.b.x0().k(jSONObject.getJSONObject("data").getString("mobileNo"));
            } else {
                this.b.y0().k(jSONObject2.getString("developerMessage"));
            }
        }
    }

    public static final class w implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public w(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "ownerinformationforinsurancepuccpermit", aVar.C(), "Connection time out");
            this.c.H0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                if (response != null && response.code() == 200) {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                    if (jSONObject2.getInt("statusCode") == 400) {
                        this.c.H0().k(jSONObject2.getString("developerMessage").toString());
                        return;
                    }
                    Object objFromJson = new GsonBuilder().create().fromJson(jSONObject.getJSONObject("data").toString(), (Class<Object>) OwnerDetailPuccPermit.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.c.I0().k((OwnerDetailPuccPermit) objFromJson);
                    return;
                }
                if (response == null || response.code() != 400) {
                    Object objFromJson2 = new GsonBuilder().create().fromJson(strValueOf, (Class<Object>) OwnerDetailPuccPermit.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson2, "fromJson(...)");
                    this.c.I0().k((OwnerDetailPuccPermit) objFromJson2);
                } else {
                    JSONObject jSONObject3 = new JSONObject(strValueOf).getJSONObject("apiMessage");
                    if (jSONObject3.has("developerMessage")) {
                        this.c.H0().k(jSONObject3.getString("developerMessage").toString());
                    } else {
                        this.c.H0().k("error");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.c.H0().k("error");
            }
        }
    }

    public static final class x implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public x(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "ownerinformationforinsurancepuccpermit", aVar.C(), aVar.D());
            this.c.K0().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new GsonBuilder().create().fromJson(new JSONObject(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)))).getJSONObject("data").toString(), (Class<Object>) OwnerDetailPuccPermit.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.J0().k((OwnerDetailPuccPermit) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.c.K0().k("error");
            }
        }
    }

    public static final class y implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ld7 c;

        public y(Context context, Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = context;
            this.b = objectRef;
            this.c = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getdupreason", aVar.C(), aVar.D());
            this.c.M().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getdupreason", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.b.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DReasonResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.L().k((DReasonResponse) objFromJson);
            } catch (Exception e) {
                Log.d("getReson_error+", e.getLocalizedMessage());
                e.printStackTrace();
                this.c.M().k("Error");
            }
        }
    }

    public static final class z implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ld7 b;

        public z(Ref.ObjectRef objectRef, ld7 ld7Var) {
            this.a = objectRef;
            this.b = ld7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.I().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            this.b.i0().k(VContant.INSTANCE.j(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)))));
        }
    }

    public ld7(jd7 repository) {
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
        this.x = new oy3();
        this.y = new oy3();
        this.z = new oy3();
        this.A = new oy3();
        this.B = new oy3();
        this.C = new oy3();
        this.D = new oy3();
        this.E = new oy3();
        this.F = new oy3();
        this.G = new oy3();
        this.H = new oy3();
        this.I = new oy3();
        this.J = new oy3();
        this.K = new oy3();
        this.L = new oy3();
        this.M = new oy3();
        this.N = new oy3();
        this.O = new oy3();
        this.P = new oy3();
        this.Q = new oy3();
        this.R = new oy3();
        this.S = new oy3();
        this.T = new oy3();
        this.U = new oy3();
        this.V = new oy3();
        this.W = new oy3();
        this.X = new oy3();
        this.Y = new oy3();
        this.Z = new oy3();
        this.a0 = new oy3();
        this.b0 = new oy3();
        this.c0 = new oy3();
        this.d0 = new oy3();
        this.e0 = new oy3();
        this.f0 = new oy3();
        this.g0 = new oy3();
        this.h0 = new oy3();
        this.i0 = new oy3();
        this.j0 = new oy3();
        this.k0 = new oy3();
        this.l0 = new oy3();
        this.m0 = new oy3();
        this.n0 = new oy3();
        this.o0 = new oy3();
        this.p0 = new oy3();
        this.q0 = new oy3();
        this.r0 = new oy3();
        this.s0 = new oy3();
        this.t0 = new oy3();
        this.u0 = new oy3();
        this.v0 = new oy3();
        this.w0 = new oy3();
        this.x0 = new oy3();
        this.y0 = new oy3();
        this.z0 = new oy3();
        this.A0 = new oy3();
        this.B0 = new oy3();
        this.C0 = new oy3();
        this.D0 = new oy3();
        this.E0 = new oy3();
        this.F0 = new oy3();
        this.G0 = new oy3();
        this.H0 = new oy3();
        this.I0 = new oy3();
        this.J0 = new oy3();
        this.K0 = new oy3();
        this.L0 = new oy3();
        this.M0 = new oy3();
        this.N0 = new oy3();
    }

    private final void F1(byte[] bArr, File file) throws Throwable {
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

    public final oy3 A() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void A0(Context context, String rc, String state_code, String chassi_no, String offCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
        Intrinsics.checkNotNullParameter(offCd, "offCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.o0(rc, state_code, chassi_no, offCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.q(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new v(objectRef, this, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void A1(Context context, GenerateUserVerify generateOtp) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(generateOtp, "generateOtp");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.J(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(generateOtp).toString()), (String) objectRef.element).enqueue(new p0(objectRef, this, context));
    }

    public final oy3 B() {
        return this.n;
    }

    public final oy3 B0() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void B1(Context context, GenerateUserVerify generateOtp) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(generateOtp, "generateOtp");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.J(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(generateOtp).toString()), (String) objectRef.element).enqueue(new q0(objectRef, this, context));
    }

    public final oy3 C() {
        return this.q0;
    }

    public final oy3 C0() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    public final void C1(Context context, String mobile_no, String rc_number, String state, String type, String purposeCode, String otp, String tran_no, String userId, String chassiNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(tran_no, "tran_no");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chassiNo, "chassiNo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purposeCode);
        eKycRequest ekycrequest = new eKycRequest("", type, chassiNo, "no", "", mobile_no, otp, true, arrayList, rc_number, state, tran_no, userId, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.K(lc5.Companion.d(ls3.g.b("application/json"), mt6.a.f(ekycrequest).toString()), (String) objectRef.element).enqueue(new r0(objectRef, this, context));
    }

    public final oy3 D() {
        return this.r0;
    }

    public final oy3 D0() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void D1(Context context, String reg_number, String chassi_no, String state_code, String purpose_code, String offCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reg_number, "reg_number");
        Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(purpose_code, "purpose_code");
        Intrinsics.checkNotNullParameter(offCd, "offCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.z0(reg_number, chassi_no, state_code, purpose_code, offCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.x(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new s0(context, objectRef, this));
    }

    public final oy3 E() {
        return this.F;
    }

    public final oy3 E0() {
        return this.r;
    }

    public final boolean E1(byte[] bArr, String str, DownloadNocHomeScreen downloadNocHomeScreen) throws Throwable {
        try {
            System.currentTimeMillis();
            File file = new File(downloadNocHomeScreen.getFilesDir(), "fitness_pdf_file.pdf");
            if (file.exists()) {
                file.delete();
            }
            F1(bArr, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
    public final void F(Context context, String rc, String state_code) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("regnNo", rc);
        jSONObject.put("stateCode", state_code);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.z(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new p(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    public final void F0(Context context, String rc, String state_code, String pcode, String chassi_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(pcode, "pcode");
        Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        VUtility.Companion companion = VUtility.INSTANCE;
        String strK = ws6Var.k();
        Intrinsics.checkNotNull(string);
        String string2 = companion.Y(rc, state_code, strK, string, ws6Var.l(), ws6Var.e(), chassi_no, pcode).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.r(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new w(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void G(Context context, String stateCode, String offCd, String purCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(offCd, "offCd");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.s(stateCode, offCd, purCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.m(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new q(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    public final void G0(Context context, String rc, String state_code, String chassi_no, String pur_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(chassi_no, "chassi_no");
        Intrinsics.checkNotNullParameter(pur_code, "pur_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        VUtility.Companion companion = VUtility.INSTANCE;
        String strK = ws6Var.k();
        Intrinsics.checkNotNull(string);
        String string2 = companion.X(rc, state_code, strK, string, ws6Var.l(), ws6Var.e(), chassi_no, pur_code).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.r(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new x(context, objectRef, this));
    }

    public final oy3 H() {
        return this.i;
    }

    public final oy3 H0() {
        return this.n0;
    }

    public final oy3 I() {
        return this.j;
    }

    public final oy3 I0() {
        return this.m0;
    }

    public final oy3 J() {
        return this.k;
    }

    public final oy3 J0() {
        return this.u0;
    }

    public final oy3 K() {
        return this.l;
    }

    public final oy3 K0() {
        return this.v0;
    }

    public final oy3 L() {
        return this.y;
    }

    public final oy3 L0() {
        return this.o0;
    }

    public final oy3 M() {
        return this.z;
    }

    public final oy3 M0() {
        return this.p0;
    }

    public final oy3 N() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void N0(Context context, String getResonForDuplicate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getResonForDuplicate, "getResonForDuplicate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.k0(getResonForDuplicate).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.s(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new y(context, objectRef, this));
    }

    public final oy3 O() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void O0(String state_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.h0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.t(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new z(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void P(Context context, String regNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.k(regNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.y(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new r(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void P0(String state_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.h0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.t(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a0(objectRef, this));
    }

    public final oy3 Q() {
        return this.G;
    }

    public final oy3 Q0() {
        return this.C;
    }

    public final oy3 R() {
        return this.A0;
    }

    public final oy3 R0() {
        return this.H;
    }

    public final oy3 S() {
        return this.B0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void S0(Context context, SlotAppointmentRequest requestBody) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        String json = new Gson().toJson(requestBody);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        Intrinsics.checkNotNull(json);
        this.d.u(aVar.d(ls3VarB, json), (String) objectRef.element).enqueue(new b0(context, objectRef, this));
    }

    public final oy3 T() {
        return this.o;
    }

    public final oy3 T0() {
        return this.T;
    }

    public final oy3 U() {
        return this.p;
    }

    public final oy3 U0() {
        return this.S;
    }

    public final oy3 V() {
        return this.W;
    }

    public final oy3 V0() {
        return this.D;
    }

    public final oy3 W() {
        return this.X;
    }

    public final oy3 W0() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void X(Context context, String state_code, String offCd, String applnNo, String regn_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(offCd, "offCd");
        Intrinsics.checkNotNullParameter(applnNo, "applnNo");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.u0(regn_no, state_code, offCd, applnNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.o(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new s(context, objectRef, this));
    }

    public final oy3 X0() {
        return this.Z;
    }

    public final oy3 Y() {
        return this.i0;
    }

    public final oy3 Y0() {
        return this.Y;
    }

    public final oy3 Z() {
        return this.s0;
    }

    public final oy3 Z0() {
        return this.g;
    }

    public final oy3 a0() {
        return this.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void a1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.c0().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.w(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c0(context, objectRef, this));
    }

    public final oy3 b0() {
        return this.j0;
    }

    public final oy3 b1() {
        return this.h;
    }

    public final oy3 c0() {
        return this.e;
    }

    public final oy3 c1() {
        return this.a0;
    }

    public final oy3 d0() {
        return this.f;
    }

    public final oy3 d1() {
        return this.b0;
    }

    public final oy3 e0() {
        return this.h0;
    }

    public final oy3 e1() {
        return this.K0;
    }

    public final oy3 f0() {
        return this.g0;
    }

    public final oy3 f1() {
        return this.L0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(Context context, String c_add1, String c_add2, String c_add3, String c_dist, String c_pincode, String c_state, String from_dt, String p_add1, String p_add2, String p_add3, String p_district, String p_pincode, String p_state, String regn_no, String state_code, String off_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(c_add1, "c_add1");
        Intrinsics.checkNotNullParameter(c_add2, "c_add2");
        Intrinsics.checkNotNullParameter(c_add3, "c_add3");
        Intrinsics.checkNotNullParameter(c_dist, "c_dist");
        Intrinsics.checkNotNullParameter(c_pincode, "c_pincode");
        Intrinsics.checkNotNullParameter(c_state, "c_state");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(p_add1, "p_add1");
        Intrinsics.checkNotNullParameter(p_add2, "p_add2");
        Intrinsics.checkNotNullParameter(p_add3, "p_add3");
        Intrinsics.checkNotNullParameter(p_district, "p_district");
        Intrinsics.checkNotNullParameter(p_pincode, "p_pincode");
        Intrinsics.checkNotNullParameter(p_state, "p_state");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(off_code, "off_code");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = bj7.a.a(c_add1, c_add2, c_add3, c_dist, c_pincode, c_state, from_dt, p_add1, p_add2, p_add3, p_district, p_pincode, p_state, regn_no, state_code, off_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.G(lc5VarD, ValueOf).enqueue(new a(context, objectRef, this));
    }

    public final oy3 g0() {
        return this.M;
    }

    public final oy3 g1() {
        return this.I0;
    }

    public final oy3 h0() {
        return this.N;
    }

    public final oy3 h1() {
        return this.J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(Context context, String statecode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.v0(statecode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(context, objectRef, this));
    }

    public final oy3 i0() {
        return this.O;
    }

    public final oy3 i1() {
        return this.G0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(Context context, String statecode, String purposeCode, String offCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(offCode, "offCode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.j(statecode, purposeCode, offCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.j(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this, context));
    }

    public final oy3 j0() {
        return this.k0;
    }

    public final oy3 j1() {
        return this.H0;
    }

    public final void k(Context context, String application, String state_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.K(application, state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new d(context, this));
    }

    public final oy3 k0() {
        return this.l0;
    }

    public final oy3 k1() {
        return this.w0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void l(Context context, String applNo, String purCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.o(applNo, purCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(context, objectRef, this));
    }

    public final oy3 l0() {
        return this.U;
    }

    public final oy3 l1() {
        return this.x0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void m(Context context, String applNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.n(applNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new f(context, objectRef, this));
    }

    public final oy3 m0() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void m1(Context context, String request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.L(lc5.Companion.d(ls3.g.b("application/json"), request), (String) objectRef.element).enqueue(new d0(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void n(Context context, String statecode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.F(statecode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.k(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new g(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void n0(Context context, String rc_number) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.l0(rc_number).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.B(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new t(context, objectRef, this));
    }

    public final oy3 n1() {
        return this.e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void o(Context context, String rc) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.b0(rc).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.v(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new h(context, objectRef, this));
    }

    public final oy3 o0() {
        return this.u;
    }

    public final oy3 o1() {
        return this.f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void p(Context context, String application_no, DownloadNocHomeScreen noc) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application_no, "application_no");
        Intrinsics.checkNotNullParameter(noc, "noc");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNo", application_no);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new i(context, objectRef, application_no, this, noc));
    }

    public final oy3 p0() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void p1(Context context, String state_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.v0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e0(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void q(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.h(lc5.Companion.d(ls3.g.b("application/json"), param), (String) objectRef.element).enqueue(new j(objectRef, this));
    }

    public final oy3 q0() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void q1(Context context, String state_code, String regn_no, String purCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(purCd, "purCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.w0(state_code, regn_no, purCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new f0(objectRef, this, context));
    }

    public final oy3 r() {
        return this.M0;
    }

    public final oy3 r0() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void r1(Context context, String state_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.h0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.A(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new g0(context, objectRef, this));
    }

    public final oy3 s() {
        return this.N0;
    }

    public final oy3 s0() {
        return this.C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void s1(Context context, String state_code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.h0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.A(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new h0(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(Context context, String enc_string) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(enc_string, "enc_string");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.H(enc_string).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new k(context, objectRef, this));
    }

    public final oy3 t0() {
        return this.D0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t1(Context context, String regn_no, String state_code, String purCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.E(regn_no, state_code, purCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.n(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new i0(context, objectRef, this));
    }

    public final oy3 u() {
        return this.c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u0() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.P().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.p(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new u(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u1(Context context, JSONArray request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = request.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.F(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new j0(context, objectRef, this));
    }

    public final oy3 v() {
        return this.d0;
    }

    public final oy3 v0() {
        return this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void v1(Context context, duprcDtoRequestModle duplicate_Rc_request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duplicate_Rc_request, "duplicate_Rc_request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.D(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.t0(duplicate_Rc_request).toString()), (String) objectRef.element).enqueue(new k0(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void w(Context context, String applnNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applnNo, "applnNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.I(applnNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.C(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new l(context, objectRef, this));
    }

    public final oy3 w0() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void w1(NocDraftRequestParam noc) {
        Intrinsics.checkNotNullParameter(noc, "noc");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.I(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.r0(noc).toString()), (String) objectRef.element).enqueue(new l0(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void x(Context context, String applnNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applnNo, "applnNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.I(applnNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.C(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new m(context, objectRef, this));
    }

    public final oy3 x0() {
        return this.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void x1(Context context, HPTRequestParamModle hpt_request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hpt_request, "hpt_request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.E(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.q0(hpt_request).toString()), (String) objectRef.element).enqueue(new m0(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void y(Context context, String param) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(param, "param");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.l(lc5.Companion.d(ls3.g.b("application/json"), param), (String) objectRef.element).enqueue(new n(context, objectRef, this));
    }

    public final oy3 y0() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void y1(BeforePaymentRequestfinal finalSubmit) {
        Intrinsics.checkNotNullParameter(finalSubmit, "finalSubmit");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.H(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.s0(finalSubmit).toString()), (String) objectRef.element).enqueue(new n0(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void z(Context context, BeforePaymentRequest param) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(param, "param");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.l(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.n0(param)), (String) objectRef.element).enqueue(new o(context, objectRef, this));
    }

    public final oy3 z0() {
        return this.E0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void z1(BeforePaymentRequestfinal finalSubmit) {
        Intrinsics.checkNotNullParameter(finalSubmit, "finalSubmit");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.H(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.s0(finalSubmit).toString()), (String) objectRef.element).enqueue(new o0(objectRef));
    }
}
