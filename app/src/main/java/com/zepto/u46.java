package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Sos.SModle.ContactSaveSucess;
import com.nic.mparivahan.Sos.SModle.ContactUpdate;
import com.nic.mparivahan.Sos.SModle.DeletResult;
import com.nic.mparivahan.Sos.SModle.GetRelationMaster;
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
public final class u46 extends zq7 {
    public final s46 d;
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

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ u46 b;

        public a(Ref.ObjectRef objectRef, u46 u46Var) {
            this.a = objectRef;
            this.b = u46Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.l().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("dltResult", e.toString());
                    this.b.l().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DeletResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((DeletResult) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ u46 b;

        public b(Ref.ObjectRef objectRef, u46 u46Var) {
            this.a = objectRef;
            this.b = u46Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.n().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.n().k("error");
                    Log.d("getContact", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            this.b.m().k(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ u46 b;

        public c(Ref.ObjectRef objectRef, u46 u46Var) {
            this.a = objectRef;
            this.b = u46Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.p().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.p().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetRelationMaster.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.o().k((GetRelationMaster) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ u46 b;

        public d(Ref.ObjectRef objectRef, u46 u46Var) {
            this.a = objectRef;
            this.b = u46Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.i().k("error");
                    Log.d("saveContact-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ContactSaveSucess.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((ContactSaveSucess) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ u46 b;

        public e(Ref.ObjectRef objectRef, u46 u46Var) {
            this.a = objectRef;
            this.b = u46Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.s().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.s().k("error");
                    Log.d("updateContact-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ContactUpdate.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.r().k((ContactUpdate) objFromJson);
        }
    }

    public u46(s46 repository) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String soscRecordId) {
        Intrinsics.checkNotNullParameter(soscRecordId, "soscRecordId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t46.a.e(soscRecordId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(long j) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t46.a.c(j).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 i() {
        return this.j;
    }

    public final oy3 j() {
        return this.i;
    }

    public final oy3 k() {
        return this.m;
    }

    public final oy3 l() {
        return this.n;
    }

    public final oy3 m() {
        return this.g;
    }

    public final oy3 n() {
        return this.h;
    }

    public final oy3 o() {
        return this.e;
    }

    public final oy3 p() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void q() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t46.a.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    public final oy3 r() {
        return this.k;
    }

    public final oy3 s() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(long j, String name, String number, String relation_id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(relation_id, "relation_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t46.a.d(j, number, name, relation_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void u(long j, long j2, String mobile, String name, String sosrelation) {
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sosrelation, "sosrelation");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = t46.a.a(j, j2, mobile, name, sosrelation).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(objectRef, this));
    }
}
