package com.zepto;

import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class dm7 extends zq7 {
    public final cm7 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            dm7.this.h().k(th != null ? th.getMessage() : null);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            oy3 oy3VarI = dm7.this.i();
            DmsUrlModle dmsUrlModle = response != null ? (DmsUrlModle) response.body() : null;
            Intrinsics.checkNotNull(dmsUrlModle);
            oy3VarI.k(dmsUrlModle);
        }
    }

    public dm7(cm7 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final void g(String state_code, String appl_no, String rc_no, String purpose_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(rc_no, "rc_no");
        Intrinsics.checkNotNullParameter(purpose_code, "purpose_code");
        this.d.a(state_code, appl_no, rc_no, purpose_code).enqueue(new a());
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.e;
    }
}
