package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
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

/* JADX INFO: loaded from: classes.dex */
public final class xy1 extends zq7 {
    public final vy1 d;
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

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ xy1 b;

        public a(Ref.ObjectRef objectRef, xy1 xy1Var) {
            this.a = objectRef;
            this.b = xy1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.r().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.r().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) EnableServiceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.q().k((EnableServiceResponse) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ xy1 b;

        public b(Ref.ObjectRef objectRef, xy1 xy1Var) {
            this.a = objectRef;
            this.b = xy1Var;
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
                } catch (Exception unused) {
                    this.b.p().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) EnableServiceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.m().k((EnableServiceResponse) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ xy1 b;

        public c(Ref.ObjectRef objectRef, xy1 xy1Var) {
            this.a = objectRef;
            this.b = xy1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.v().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    if (response != null && response.code() == 401 && response.message().toString().equals(hz0.a.G())) {
                        this.b.v().k("401");
                        return;
                    } else {
                        this.b.v().k("Error");
                        return;
                    }
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) EnableServiceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.s().k((EnableServiceResponse) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ xy1 b;

        public d(Ref.ObjectRef objectRef, xy1 xy1Var) {
            this.a = objectRef;
            this.b = xy1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.o().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.o().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) EnableServiceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.n().k((EnableServiceResponse) objFromJson);
        }
    }

    public xy1(vy1 repository) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String servStateCd) {
        Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = wy1.a.c(servStateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(String servStateCd) {
        Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = wy1.a.a(servStateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(String servStateCd) {
        Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = wy1.a.d(servStateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String servStateCd) {
        Intrinsics.checkNotNullParameter(servStateCd, "servStateCd");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = wy1.a.b(servStateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    public final oy3 k() {
        return this.g;
    }

    public final oy3 l() {
        return this.h;
    }

    public final oy3 m() {
        return this.e;
    }

    public final oy3 n() {
        return this.k;
    }

    public final oy3 o() {
        return this.l;
    }

    public final oy3 p() {
        return this.f;
    }

    public final oy3 q() {
        return this.m;
    }

    public final oy3 r() {
        return this.n;
    }

    public final oy3 s() {
        return this.i;
    }

    public final oy3 t() {
        return this.o;
    }

    public final oy3 u() {
        return this.p;
    }

    public final oy3 v() {
        return this.j;
    }
}
