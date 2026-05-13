package com.zepto;

import com.nic.mparivahan.APIController;
import com.zepto.lc5;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class br4 extends zq7 {
    public final xq4 d;
    public oy3 e;
    public oy3 f;

    public static final class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            br4.this.i().k("Error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.isSuccessful() && response.code() == 200) {
                    try {
                        Object objBody = response.body();
                        Intrinsics.checkNotNull(objBody);
                        JSONObject jSONObject = new JSONObject(((nd5) objBody).string());
                        if (jSONObject.has("errorCode") && jSONObject.getString("errorCode").equals(hz0.a.z())) {
                            JSONObject jSONObject2 = new JSONObject(k22.a(jSONObject.getString("data"), APIController.a().PermitKey()));
                            if (jSONObject2.has("permitNo") && jSONObject2.has("permitUpto")) {
                                HashMap map = new HashMap();
                                map.clear();
                                map.put("permitNo", jSONObject2.getString("permitNo"));
                                map.put("permitUpto", jSONObject2.getString("permitUpto"));
                                br4.this.h().k(map);
                            } else {
                                br4.this.i().k("Error");
                            }
                        } else {
                            br4.this.i().k("Error");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        br4.this.i().k("Error");
                    }
                } else {
                    br4.this.i().k("Error");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                br4.this.i().k("Error");
            }
        }
    }

    public br4(xq4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final void g(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new a());
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }
}
