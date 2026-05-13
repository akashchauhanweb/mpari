package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.AvailableFancyModel;
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
public final class b20 extends zq7 {
    public final a20 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ b20 b;

        public a(Ref.ObjectRef objectRef, b20 b20Var) {
            this.a = objectRef;
            this.b = b20Var;
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
                Object objFromJson = new Gson().fromJson(aVar.a(str, data).toString(), (Class<Object>) AvailableFancyModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                AvailableFancyModel availableFancyModel = (AvailableFancyModel) objFromJson;
                if (availableFancyModel.getStatus().equals("SUCCESS")) {
                    this.b.g().k(availableFancyModel);
                    this.b.h().k(availableFancyModel.getStatus());
                } else {
                    this.b.h().k(availableFancyModel.getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.b.h().k("error");
            }
        }
    }

    public b20(a20 repository) {
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
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    public final void i(String stateCode, String rtoCode, String pageSize, String page) throws JSONException {
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(page, "page");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCode", stateCode);
        jSONObject.put("rtoCode", rtoCode);
        jSONObject.put("pageSize", pageSize);
        jSONObject.put("pageNumber", page);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }
}
