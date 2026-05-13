package com.zepto;

import android.content.Context;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class v14 extends zq7 {
    public final t14 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            v14.this.k().k(t.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                oy3 oy3VarG = v14.this.g();
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                Intrinsics.checkNotNull(napixTokenModel);
                oy3VarG.k(napixTokenModel);
            } catch (Exception unused) {
                v14.this.k().k("ERROR");
            }
        }
    }

    public static final class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            v14.this.k().k(t.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                oy3 oy3VarG = v14.this.g();
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                Intrinsics.checkNotNull(napixTokenModel);
                oy3VarG.k(napixTokenModel);
            } catch (Exception unused) {
                v14.this.k().k("ERROR");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ v14 b;

        public c(Context context, v14 v14Var) {
            this.a = context;
            this.b = v14Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.k().k(t.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ws6 ws6Var = new ws6(this.a);
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                Intrinsics.checkNotNull(napixTokenModel);
                ws6Var.y(napixTokenModel.getAccess_token());
                oy3 oy3VarG = this.b.g();
                NapixTokenModel napixTokenModel2 = (NapixTokenModel) response.body();
                Intrinsics.checkNotNull(napixTokenModel2);
                oy3VarG.k(napixTokenModel2);
            } catch (Exception unused) {
                this.b.k().k("ERROR");
            }
        }
    }

    public v14(t14 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final oy3 g() {
        return this.e;
    }

    public final void h() {
        this.d.b("client_credentials", "napix").enqueue(new a());
    }

    public final void i() {
        this.d.c("client_credentials", "napix").enqueue(new b());
    }

    public final void j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a("client_credentials", "napix").enqueue(new c(context, this));
    }

    public final oy3 k() {
        return this.f;
    }
}
