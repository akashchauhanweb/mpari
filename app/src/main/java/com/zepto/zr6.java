package com.zepto;

import android.content.Context;
import android.provider.Settings;
import com.google.gson.Gson;
import com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails;
import com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.pw4;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class zr6 extends zq7 {
    public final yr6 d;
    public oy3 e;
    public oy3 f;
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
    public oy3 q;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ zr6 b;

        public a(Ref.ObjectRef objectRef, zr6 zr6Var) {
            this.a = objectRef;
            this.b = zr6Var;
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
                } catch (Exception unused) {
                    this.b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) profiledetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.p().k((profiledetails) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ zr6 b;

        public b(Ref.ObjectRef objectRef, zr6 zr6Var) {
            this.a = objectRef;
            this.b = zr6Var;
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
                } catch (Exception unused) {
                    this.b.l().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) oe5.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            wb0.a(objFromJson);
            this.b.m().k(null);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ zr6 c;

        public c(Ref.ObjectRef objectRef, Context context, zr6 zr6Var) {
            this.a = objectRef;
            this.b = context;
            this.c = zr6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.c.i().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.c.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) StateUpdateResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            StateUpdateResponse stateUpdateResponse = (StateUpdateResponse) objFromJson;
            if (!StringsKt__StringsJVMKt.equals(stateUpdateResponse.getStatusCode(), "CTZN001", true)) {
                this.c.n().k(0);
                return;
            }
            try {
                ws6 ws6Var = new ws6(this.b);
                ws6Var.b(String.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzRecordId()), stateUpdateResponse.getMparCitizenUser().getCtzMobile(), stateUpdateResponse.getMparCitizenUser().getCtzDispName(), stateUpdateResponse.getMparCitizenUser().getCtzEmail(), ws6Var.m().toString(), stateUpdateResponse.getMparCitizenUser().getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzMpinStatus()));
                this.c.n().k(1);
            } catch (Exception unused2) {
                this.c.n().k(0);
            }
        }
    }

    public zr6(yr6 repository) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
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
    public final void g(long j, Context con) {
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        pw4.a aVar2 = pw4.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.b(j, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string2);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.b(lc5VarD, ValueOf).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.o;
    }

    public final oy3 i() {
        return this.j;
    }

    public final oy3 j() {
        return this.m;
    }

    public final oy3 k() {
        return this.n;
    }

    public final oy3 l() {
        return this.f;
    }

    public final oy3 m() {
        return this.e;
    }

    public final oy3 n() {
        return this.k;
    }

    public final oy3 o() {
        return this.h;
    }

    public final oy3 p() {
        return this.g;
    }

    public final oy3 q() {
        return this.i;
    }

    public final oy3 r() {
        return this.q;
    }

    public final oy3 s() {
        return this.p;
    }

    public final oy3 t() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = pw4.a.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
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
    public final void v(String userId, Context con) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(con, "con");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), userId.toString());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.c(lc5VarD, ValueOf).enqueue(new c(objectRef, con, this));
    }
}
