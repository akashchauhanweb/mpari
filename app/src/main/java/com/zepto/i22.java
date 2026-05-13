package com.zepto;

import android.content.Context;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Welcome.Model.DataParam;
import com.zepto.v03;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i22 implements v03 {
    public i22(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Gson gson = new Gson();
        kc5 kc5VarRequest = chain.request();
        lc5 lc5VarA = kc5VarRequest.a();
        String h = APIController.a().getH();
        Intrinsics.checkNotNullExpressionValue(h, "getH(...)");
        String strD = kc5VarRequest.d(h);
        u70 u70Var = new u70();
        if (lc5VarA != null) {
            lc5VarA.writeTo(u70Var);
        }
        String strH0 = u70Var.H0();
        ls3 ls3VarB = ls3.g.b("application/json; charset=utf-8");
        String json = gson.toJson(new DataParam(String.valueOf(tu5.a.b(strH0.toString(), String.valueOf(strD)))));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        lc5 lc5VarD = lc5.Companion.d(ls3VarB, json);
        return chain.a(kc5VarRequest.i().d(xr2.HEADER_CONTENT_TYPE, "application/json").d("Content-Length", String.valueOf(lc5VarD.contentLength())).f(kc5VarRequest.h(), lc5VarD).b());
    }
}
