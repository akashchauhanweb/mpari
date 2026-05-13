package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicateList;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.RcSurrenderResModel;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.CancellationModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCCancellationResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCSurrenderModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.PermitFee;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.TempSubmitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.SpecialPermit.SaveDraftSpPermitResponse;
import com.nic.mparivahan.VahanServices.SpecialPermit.SpecialPermitDetail;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class o47 extends zq7 {
    public final oy3 A;
    public final oy3 B;
    public final oy3 C;
    public final oy3 D;
    public final j37 d;
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
    public final oy3 x;
    public final oy3 y;
    public final oy3 z;

    public static final class a implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public a(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "calculatevalidupto", aVar.C(), aVar.D());
            this.c.l().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "calculatevalidupto", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CalValidity.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.k().k((CalValidity) objFromJson);
            } catch (Exception e) {
                this.c.l().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ o47 b;

        public b(String str, o47 o47Var) {
            this.a = str;
            this.b = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.l().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.l().k("Error");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = this.a;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CalValidity.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((CalValidity) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public c(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "searchgoodstype", aVar.C(), aVar.D());
            this.c.t().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "searchgoodstype", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CalValidity.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.s().k((CalValidity) objFromJson);
            } catch (Exception e) {
                this.c.t().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public d(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "savetempdraftappl", aVar.C(), aVar.D());
            this.c.M().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "savetempdraftappl", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) TempSubmitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.L().k((TempSubmitResponse) objFromJson);
            } catch (Exception e) {
                this.c.M().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public e(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getPermitDocumentList", aVar.C(), aVar.D());
            this.c.r().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getPermitDocumentList", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) DuplicateList.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.q().k((DuplicateList) objFromJson);
            } catch (Exception e) {
                this.c.r().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public f(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "getPermitFeeDetails", aVar.C(), aVar.D());
            this.c.x().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "getPermitFeeDetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) PermitFee.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.w().k((PermitFee) objFromJson);
            } catch (Exception e) {
                this.c.x().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ o47 b;

        public g(String str, o47 o47Var) {
            this.a = str;
            this.b = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.H().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.H().k("Error");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = this.a;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) SpecialPermitDetail.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.I().k((SpecialPermitDetail) objFromJson);
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public h(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "temppermitdetails", aVar.C(), aVar.D());
            this.c.K().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "temppermitdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) TempDetailsModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.J().k((TempDetailsModel) objFromJson);
            } catch (Exception e) {
                this.c.K().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ o47 b;

        public i(String str, o47 o47Var) {
            this.a = str;
            this.b = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.E().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.E().k("Error");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = this.a;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) SaveDraftSpPermitResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.F().k((SaveDraftSpPermitResponse) objFromJson);
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public j(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "saveduplicatefitnessdraft", aVar.C(), aVar.D());
            this.c.n().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "saveduplicatefitnessdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) DuplicateFitessDraft.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.m().k((DuplicateFitessDraft) objFromJson);
            } catch (Exception e) {
                this.c.n().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class k implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public k(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "duppermitdraft", aVar.C(), aVar.D());
            this.c.p().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "duppermitdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) DuplicatePermitResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.o().k((DuplicatePermitResponse) objFromJson);
            } catch (Exception e) {
                this.c.p().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class l implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public l(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "rccanceldraft", aVar.C(), aVar.D());
            this.c.z().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "rccanceldraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) RCCancellationResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.y().k((RCCancellationResponse) objFromJson);
            } catch (Exception e) {
                this.c.z().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class m implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public m(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "rcreleasedraft", aVar.C(), aVar.D());
            this.c.B().k(th != null ? th.getMessage() : null);
            Log.e("myrequest", "something went wrong working");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "rcreleasedraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) RCReleaseResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.A().k((RCReleaseResponse) objFromJson);
            } catch (Exception e) {
                this.c.B().k("Error");
                e.printStackTrace();
            }
        }
    }

    public static final class n implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ o47 c;

        public n(Context context, Ref.ObjectRef objectRef, o47 o47Var) {
            this.a = context;
            this.b = objectRef;
            this.c = o47Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) throws Throwable {
            ApiMonitorLog.Companion companion = ApiMonitorLog.INSTANCE;
            Context context = this.a;
            hz0.a aVar = hz0.a;
            companion.a(context, aVar.H(), "rcsurrenderdraft", aVar.C(), aVar.D());
            this.c.D().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                ApiMonitorLog.INSTANCE.a(this.a, hz0.a.H(), "rcsurrenderdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                ze1.a aVar = ze1.a;
                String str = (String) this.b.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) RcSurrenderResModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.c.C().k((RcSurrenderResModel) objFromJson);
            } catch (Exception e) {
                this.c.D().k("Error");
                e.printStackTrace();
            }
        }
    }

    public o47(j37 repository) {
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
    }

    public final oy3 A() {
        return this.o;
    }

    public final oy3 B() {
        return this.p;
    }

    public final oy3 C() {
        return this.i;
    }

    public final oy3 D() {
        return this.j;
    }

    public final oy3 E() {
        return this.D;
    }

    public final oy3 F() {
        return this.C;
    }

    public final void G(Context context, String rc, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.e0(rc, String.valueOf(str), String.valueOf(str2)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), strValueOf).enqueue(new g(strValueOf, this));
    }

    public final oy3 H() {
        return this.B;
    }

    public final oy3 I() {
        return this.A;
    }

    public final oy3 J() {
        return this.q;
    }

    public final oy3 K() {
        return this.r;
    }

    public final oy3 L() {
        return this.w;
    }

    public final oy3 M() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void N(Context context, String rc, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.e0(rc, String.valueOf(str), String.valueOf(str2)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.m(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new h(context, objectRef, this));
    }

    public final void O(Context context, String requestParam) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.d(lc5.Companion.d(ls3.g.b("application/json"), requestParam), strValueOf).enqueue(new i(strValueOf, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void P(Context context, DuplicateFitessDraft dfcObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dfcObject, "dfcObject");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.g(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.R(dfcObject)), (String) objectRef.element).enqueue(new j(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void Q(Context context, DuplicatePermitRe dfcObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dfcObject, "dfcObject");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.h(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.S(dfcObject)), (String) objectRef.element).enqueue(new k(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void R(Context context, CancellationModle canObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(canObject, "canObject");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.i(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(canObject).toString()), (String) objectRef.element).enqueue(new l(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void S(Context context, RCReleaseModle canObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(canObject, "canObject");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.j(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(canObject).toString()), (String) objectRef.element).enqueue(new m(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void T(Context context, RCSurrenderModle rcSurrenderObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rcSurrenderObject, "rcSurrenderObject");
        Gson gson = new Gson();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.k(lc5.Companion.d(ls3.g.b("application/json"), gson.toJson(rcSurrenderObject).toString()), (String) objectRef.element).enqueue(new n(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(Context context, String statecd, String validFrom, String perMode, String period) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(perMode, "perMode");
        Intrinsics.checkNotNullParameter(period, "period");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.J(statecd, validFrom, perMode, period).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(context, objectRef, this));
    }

    public final void h(Context context, String statecd, String validFrom, String perMode, String period) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        Intrinsics.checkNotNullParameter(validFrom, "validFrom");
        Intrinsics.checkNotNullParameter(perMode, "perMode");
        Intrinsics.checkNotNullParameter(period, "period");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.J(statecd, validFrom, perMode, period).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.n(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(Context context, String googdsNature, String statecd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googdsNature, "googdsNature");
        Intrinsics.checkNotNullParameter(statecd, "statecd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.N(googdsNature, statecd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(Context context, String requestParam) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.l(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new d(context, objectRef, this));
    }

    public final oy3 k() {
        return this.s;
    }

    public final oy3 l() {
        return this.t;
    }

    public final oy3 m() {
        return this.e;
    }

    public final oy3 n() {
        return this.f;
    }

    public final oy3 o() {
        return this.k;
    }

    public final oy3 p() {
        return this.l;
    }

    public final oy3 q() {
        return this.m;
    }

    public final oy3 r() {
        return this.n;
    }

    public final oy3 s() {
        return this.u;
    }

    public final oy3 t() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u(Context context, String rc, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.j0(rc, String.valueOf(str)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(context, objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void v(Context context, String requestParam) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new f(context, objectRef, this));
    }

    public final oy3 w() {
        return this.y;
    }

    public final oy3 x() {
        return this.z;
    }

    public final oy3 y() {
        return this.g;
    }

    public final oy3 z() {
        return this.h;
    }
}
