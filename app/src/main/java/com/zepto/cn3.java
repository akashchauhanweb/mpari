package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Notifications.LocationResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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
public final class cn3 extends zq7 {
    public final vm3 d;
    public oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ cn3 b;

        public a(Ref.ObjectRef objectRef, cn3 cn3Var) {
            this.a = objectRef;
            this.b = cn3Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.g().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) LocationResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.h().k((LocationResponse) objFromJson);
        }
    }

    public cn3(vm3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
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
    public final void i(int i, String disticId) {
        Intrinsics.checkNotNullParameter(disticId, "disticId");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = bn3.a.a(i, disticId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.a(lc5VarD, ValueOf).enqueue(new a(objectRef, this));
    }
}
