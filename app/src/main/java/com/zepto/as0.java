package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.CompResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeDraftResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRelationModle;
import com.zepto.lc5;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class as0 extends zq7 {
    public final zr0 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ as0 b;

        public a(Ref.ObjectRef objectRef, as0 as0Var) {
            this.a = objectRef;
            this.b = as0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.m().k("Error");
                    e.printStackTrace();
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) NomineeDraftResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l().k((NomineeDraftResponse) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ as0 b;

        public b(Ref.ObjectRef objectRef, as0 as0Var) {
            this.a = objectRef;
            this.b = as0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.k().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CompResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((CompResponse) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ as0 b;

        public c(Ref.ObjectRef objectRef, as0 as0Var) {
            this.a = objectRef;
            this.b = as0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.k().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.k().k("Error");
                    e.printStackTrace();
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
            String strA = aVar.a(str, data);
            Log.e("decryptedString--> ", strA);
            Object objFromJson = new Gson().fromJson(strA, (Class<Object>) CompResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((CompResponse) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ as0 b;

        public d(Ref.ObjectRef objectRef, as0 as0Var) {
            this.a = objectRef;
            this.b = as0Var;
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
                } catch (Exception e) {
                    this.b.o().k("Error");
                    e.printStackTrace();
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) NomineeRelationModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.n().k((NomineeRelationModle) objFromJson);
        }
    }

    public as0(zr0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String requestParam) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(String requestParam) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(String requestParam) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    public final oy3 j() {
        return this.e;
    }

    public final oy3 k() {
        return this.f;
    }

    public final oy3 l() {
        return this.i;
    }

    public final oy3 m() {
        return this.j;
    }

    public final oy3 n() {
        return this.g;
    }

    public final oy3 o() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void p() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(objectRef, this));
    }
}
