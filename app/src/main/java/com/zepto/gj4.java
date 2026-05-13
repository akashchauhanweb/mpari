package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.mt6;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class gj4 extends zq7 {
    public final c26 d;
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

    public static final class a extends SuspendLambda implements Function2 {
        public Object c;
        public int e;
        public final /* synthetic */ Ref.BooleanRef f;
        public final /* synthetic */ gj4 g;
        public final /* synthetic */ Context h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.BooleanRef booleanRef, gj4 gj4Var, Context context, Continuation continuation) {
            super(2, continuation);
            this.f = booleanRef;
            this.g = gj4Var;
            this.h = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = this.f;
                gj4 gj4Var = this.g;
                Context context = this.h;
                this.c = booleanRef2;
                this.e = 1;
                Object objH = gj4Var.h(context, this);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                obj = objH;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.c;
                ResultKt.throwOnFailure(obj);
            }
            booleanRef.element = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ gj4 b;

        public b(Ref.ObjectRef objectRef, gj4 gj4Var) {
            this.a = objectRef;
            this.b = gj4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.l().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.l().k("ERROR");
                    Log.d("getOtpResend", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.m().k((ResendOtp) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ gj4 b;
        public final /* synthetic */ Ref.ObjectRef c;

        public c(Ref.ObjectRef objectRef, gj4 gj4Var, Ref.ObjectRef objectRef2) {
            this.a = objectRef;
            this.b = gj4Var;
            this.c = objectRef2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.q().k("Error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UserLoginModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                UserLoginModel userLoginModel = (UserLoginModel) objFromJson;
                this.b.r().k(userLoginModel);
                String token = userLoginModel.getToken();
                if (token != null) {
                    ((ws6) this.c.element).z(token);
                }
            } catch (Exception e) {
                Log.d("VirtualRcDetails-", e.getLocalizedMessage());
                this.b.q().k("error-->");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ gj4 b;

        public d(Ref.ObjectRef objectRef, gj4 gj4Var) {
            this.a = objectRef;
            this.b = gj4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.k().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("VirtualRcDetails-", e.getLocalizedMessage());
                    this.b.k().k("error-->");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetVirtualDocDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((GetVirtualDocDetails) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ gj4 b;

        public e(Ref.ObjectRef objectRef, gj4 gj4Var) {
            this.a = objectRef;
            this.b = gj4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.i().k("Error");
                    Log.d("OtpVerify_error+", e.getLocalizedMessage());
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) OtpVerifyResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.o().k((OtpVerifyResult) objFromJson);
        }
    }

    public gj4(c26 repository) {
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
    }

    public final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        f80.d(qj2.c, null, null, new a(booleanRef, this, context, null), 3, null);
        return booleanRef.element;
    }

    public final Object h(Context context, Continuation continuation) {
        return new DatabaseHelper(context).E0() > 0 ? Boxing.boxBoolean(true) : Boxing.boxBoolean(false);
    }

    public final oy3 i() {
        return this.f;
    }

    public final oy3 j() {
        return this.k;
    }

    public final oy3 k() {
        return this.l;
    }

    public final oy3 l() {
        return this.j;
    }

    public final oy3 m() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void n(String smsId) {
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.r(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 o() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.zepto.ws6] */
    public final void p(Context con, String mpin) {
        lc5 lc5VarD;
        Intrinsics.checkNotNullParameter(con, "con");
        Intrinsics.checkNotNullParameter(mpin, "mpin");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ws6(con);
        if (StringsKt__StringsJVMKt.isBlank(mpin)) {
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            mt6.a aVar2 = mt6.a;
            String strK = ((ws6) objectRef2.element).k();
            String strL = ((ws6) objectRef2.element).l();
            Intrinsics.checkNotNull(string);
            String string2 = aVar2.F(strK, strL, string, ((ws6) objectRef2.element).m(), con).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            lc5VarD = aVar.d(ls3VarB, string2);
        } else {
            lc5.a aVar3 = lc5.Companion;
            ls3 ls3VarB2 = ls3.g.b("application/json");
            mt6.a aVar4 = mt6.a;
            String strK2 = ((ws6) objectRef2.element).k();
            String strL2 = ((ws6) objectRef2.element).l();
            Intrinsics.checkNotNull(string);
            String string3 = aVar4.F(strK2, strL2, string, mpin, con).toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            lc5VarD = aVar3.d(ls3VarB2, string3);
        }
        this.d.d(lc5VarD, (String) objectRef.element).enqueue(new c(objectRef, this, objectRef2));
    }

    public final oy3 q() {
        return this.n;
    }

    public final oy3 r() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void s(String citizenId, Context con) {
        Intrinsics.checkNotNullParameter(citizenId, "citizenId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.j(citizenId, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(String otp, String otpid) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.x(otp, otpid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(objectRef, this));
    }
}
