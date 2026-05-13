package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.zepto.lc5;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class pa6 extends zq7 {
    public final oa6 d;
    public oy3 e;
    public oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ pa6 b;

        public a(Ref.ObjectRef objectRef, pa6 pa6Var) {
            this.a = objectRef;
            this.b = pa6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("Error");
            Log.e("applicantDetailError", "something went wrong");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.e("applicantDetailError", e.toString());
                    this.b.i().k("Error");
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
                    this.b.i().k(jSONObject2.getString("developerMessage"));
                    return;
                }
                Object objFromJson = new Gson().fromJson(strA, (Class<Object>) TOFetchApplicationDetails.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.h().k((TOFetchApplicationDetails) objFromJson);
            }
        }
    }

    public pa6(oa6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void g(String applNo, boolean z, String reg, String chassi) throws JSONException {
        Call callA;
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(reg, "reg");
        Intrinsics.checkNotNullParameter(chassi, "chassi");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chassisNo", chassi);
            jSONObject.put("regnNo", reg);
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            callA = this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("applNo", applNo);
            lc5.a aVar2 = lc5.Companion;
            ls3 ls3VarB2 = ls3.g.b("application/json");
            String string2 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            callA = this.d.a(aVar2.d(ls3VarB2, string2), (String) objectRef.element);
        }
        if (callA != null) {
            callA.enqueue(new a(objectRef, this));
        }
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }
}
