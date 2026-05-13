package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.DB.DatabaseHelper;
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
public final class tu7 extends zq7 {
    public final kp7 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ tu7 b;

        public a(Ref.ObjectRef objectRef, tu7 tu7Var) {
            this.a = objectRef;
            this.b = tu7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.m().k(t.getMessage());
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
                Log.d("en_state-", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) GetEnableStateModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.l().k((GetEnableStateModel) objFromJson);
            } catch (Exception e) {
                Log.d("en_state-", e.getLocalizedMessage());
                this.b.m().k("Error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ tu7 b;

        public b(Ref.ObjectRef objectRef, tu7 tu7Var) {
            this.a = objectRef;
            this.b = tu7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.k().k(t.getMessage());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.isSuccessful()) {
                this.b.k().k("Error");
                return;
            }
            SecurityModle securityModle = (SecurityModle) response.body();
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    this.b.r().k(ut6.a.b(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)))));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("DecRes-", e.getLocalizedMessage());
                }
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ tu7 b;

        public c(Ref.ObjectRef objectRef, tu7 tu7Var) {
            this.a = objectRef;
            this.b = tu7Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.q().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (NullPointerException unused) {
                    this.b.q().k("Error");
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.q().k("401");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) StateMaster.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.o().k((StateMaster) objFromJson);
        }
    }

    public tu7(kp7 repository) {
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
    }

    public final void g(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(context);
        if (databaseHelperD0.D() == null) {
            this.l.k("error");
            return;
        }
        if (databaseHelperD0.D().size() <= 0) {
            this.l.k("error");
            return;
        }
        try {
            this.k.k(databaseHelperD0.D());
        } catch (Exception unused) {
            this.l.k("error");
        }
    }

    public final oy3 h() {
        return this.k;
    }

    public final oy3 i() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String requestParam) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), requestParam), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 k() {
        return this.f;
    }

    public final oy3 l() {
        return this.g;
    }

    public final oy3 m() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void n() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = ut6.a.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 o() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void p() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.o().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    public final oy3 q() {
        return this.j;
    }

    public final oy3 r() {
        return this.e;
    }
}
