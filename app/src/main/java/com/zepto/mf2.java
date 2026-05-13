package com.zepto;

import android.util.Log;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.zepto.lc5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class mf2 extends zq7 {
    public final gf2 d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public final oy3 h;

    public static final class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            mf2.this.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                mf2.this.l().k(response != null ? (FormsPojo) response.body() : null);
                Log.v("dl_response", String.valueOf(response != null ? (FormsPojo) response.body() : null));
            } catch (Exception unused) {
                mf2.this.j().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            mf2.this.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                mf2.this.k().k(response != null ? (FormsPojo) response.body() : null);
                Log.v("dl_response", String.valueOf(response != null ? (FormsPojo) response.body() : null));
            } catch (Exception unused) {
                mf2.this.j().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            mf2.this.j().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                mf2.this.m().k(response != null ? (FormsPojo) response.body() : null);
                Log.v("dl_response", String.valueOf(response != null ? (FormsPojo) response.body() : null));
            } catch (Exception unused) {
                mf2.this.j().k("error");
            }
        }
    }

    public mf2(gf2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
    }

    public final void g(String apl, String db) {
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = new JSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), apl, db).enqueue(new a());
    }

    public final void h(String apl, String db) {
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = new JSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), apl, db).enqueue(new b());
    }

    public final void i(String apl, String db) {
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = new JSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), apl, db).enqueue(new c());
    }

    public final oy3 j() {
        return this.h;
    }

    public final oy3 k() {
        return this.g;
    }

    public final oy3 l() {
        return this.f;
    }

    public final oy3 m() {
        return this.e;
    }
}
