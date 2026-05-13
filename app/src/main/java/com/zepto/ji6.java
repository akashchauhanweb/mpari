package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ji6 extends zq7 {
    public final ih6 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ji6 b;

        public a(Ref.ObjectRef objectRef, ji6 ji6Var) {
            this.a = objectRef;
            this.b = ji6Var;
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
            if (response == null || response.code() != 200) {
                return;
            }
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            String strA = aVar.a(str, data);
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has("apiMessage")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                if (jSONObject2.getInt("statusCode") != 200) {
                    this.b.g().k(jSONObject2.getString("developerMessage"));
                    return;
                }
                Object objFromJson = new Gson().fromJson(strA, (Class<Object>) SellerResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.h().k((SellerResponse) objFromJson);
            }
        }
    }

    public ji6(ih6 repository) {
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
    public final void i(String request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), request), (String) objectRef.element).enqueue(new a(objectRef, this));
    }
}
