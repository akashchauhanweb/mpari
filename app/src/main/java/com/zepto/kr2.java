package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
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
public final class kr2 extends zq7 {
    public final ir2 d;
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

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ kr2 b;

        public a(Ref.ObjectRef objectRef, kr2 kr2Var) {
            this.a = objectRef;
            this.b = kr2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.j().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.j().k("Error");
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
            Log.d("RequestForHpa", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) HtpTypeModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.i().k((HtpTypeModle) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ kr2 b;

        public b(Ref.ObjectRef objectRef, kr2 kr2Var) {
            this.a = objectRef;
            this.b = kr2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.p().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("getdist_error+", e.getLocalizedMessage());
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
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("getdist", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) VahanStateModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.n().k((VahanStateModle) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ kr2 b;

        public c(Ref.ObjectRef objectRef, kr2 kr2Var) {
            this.a = objectRef;
            this.b = kr2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.h().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("getdist_error+", e.getLocalizedMessage());
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
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("getdist", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) DistictModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.g().k((DistictModle) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ kr2 b;

        public d(Ref.ObjectRef objectRef, kr2 kr2Var) {
            this.a = objectRef;
            this.b = kr2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.l().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.l().k("error");
                    Log.d("RequestForHpa-", e.getLocalizedMessage());
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
            Log.d("RequestForHpa", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) HPAResModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((HPAResModle) objFromJson);
        }
    }

    public kr2(ir2 repository) {
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
    }

    public final oy3 g() {
        return this.g;
    }

    public final oy3 h() {
        return this.h;
    }

    public final oy3 i() {
        return this.q;
    }

    public final oy3 j() {
        return this.r;
    }

    public final oy3 k() {
        return this.o;
    }

    public final oy3 l() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void m() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.m0().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 n() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void o() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.c0().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 p() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void q(String state_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.h0(state_code).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
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
    public final void r(String fncr_add1, String fncr_add2, String fncr_add3, String dis_code, String fncr_name, String fncr_pincode, String fncr_state, String from_dt, String op_dt, String state_cd, String regn_no, String off_code, String htpCode) {
        Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
        Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
        Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
        Intrinsics.checkNotNullParameter(dis_code, "dis_code");
        Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
        Intrinsics.checkNotNullParameter(fncr_pincode, "fncr_pincode");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(off_code, "off_code");
        Intrinsics.checkNotNullParameter(htpCode, "htpCode");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jr2.a.a(fncr_add1, fncr_add2, fncr_add3, dis_code, fncr_name, fncr_pincode, fncr_state, from_dt, op_dt, state_cd, regn_no, off_code, htpCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.a(lc5VarD, ValueOf).enqueue(new d(objectRef, this));
    }
}
