package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownload;
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
public final class vj0 extends zq7 {
    public final uj0 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vj0 b;

        public a(Ref.ObjectRef objectRef, vj0 vj0Var) {
            this.a = objectRef;
            this.b = vj0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.h().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                ze1.a aVar = ze1.a;
                String str = (String) this.a.element;
                Intrinsics.checkNotNull(securityModle);
                String data = securityModle.getData();
                Intrinsics.checkNotNull(data);
                Object objFromJson = new Gson().fromJson(aVar.a(str, data).toString(), (Class<Object>) CheckpostTaxReceiptDownload.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                CheckpostTaxReceiptDownload checkpostTaxReceiptDownload = (CheckpostTaxReceiptDownload) objFromJson;
                if (checkpostTaxReceiptDownload.isEmpty()) {
                    this.b.h().k("error");
                } else {
                    this.b.h().k("SUCCESS");
                    this.b.g().k(checkpostTaxReceiptDownload);
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.b.h().k("error");
            }
        }
    }

    public vj0(uj0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final oy3 g() {
        return this.e;
    }

    public final oy3 h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void i(String stateCode, String regnNo) throws JSONException {
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCd", stateCode);
        jSONObject.put("regnNo", regnNo);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }
}
