package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.RPDataModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class q35 extends zq7 {
    public final p35 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ q35 b;

        public a(Ref.ObjectRef objectRef, q35 q35Var) {
            this.a = objectRef;
            this.b = q35Var;
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
                    this.b.h().k("Error");
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) RPDataModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.i().k((RPDataModel) objFromJson);
        }
    }

    public q35(p35 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String regNo, String stateCd, String offCode) {
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(offCode, "offCode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.a0(regNo, stateCd, offCode)), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.e;
    }
}
