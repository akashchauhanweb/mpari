package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ro3 extends zq7 {
    public final qo3 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ro3 b;

        public a(Ref.ObjectRef objectRef, ro3 ro3Var) {
            this.a = objectRef;
            this.b = ro3Var;
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
                } catch (Exception e) {
                    this.b.g().k("Error");
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) MFPResponseModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.h().k((MFPResponseModel) objFromJson);
        }
    }

    public ro3(qo3 repository) {
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
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(MFPRequestModel mfp) {
        Intrinsics.checkNotNullParameter(mfp, "mfp");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.O(mfp)), (String) objectRef.element).enqueue(new a(objectRef, this));
    }
}
