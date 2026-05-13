package com.nic.mparivahan.Citizen.ViewModel;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Citizen.Models.DataX;
import com.nic.mparivahan.Citizen.Models.ItmsStateModle;
import com.zepto.c33;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.nd5;
import com.zepto.oy3;
import com.zepto.tf4;
import com.zepto.zq7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ItmsMasterViewModel extends zq7 {
    public final c33 d;
    public oy3 e;
    public final oy3 f;

    public ItmsMasterViewModel(c33 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final void g(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.j(state).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string)).enqueue(new Callback() { // from class: com.nic.mparivahan.Citizen.ViewModel.ItmsMasterViewModel$getItmsDisMaster$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                this.a.i().k("Error");
            }

            @Override // retrofit2.Callback
            public void onResponse(Call call, Response response) {
                ArrayList<DataX> data;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful() || response.code() != 200) {
                    this.a.i().k("Error");
                    return;
                }
                try {
                    Gson gson = new Gson();
                    Type type = new TypeToken<ItmsStateModle>() { // from class: com.nic.mparivahan.Citizen.ViewModel.ItmsMasterViewModel$getItmsDisMaster$1$onResponse$type$1
                    }.getType();
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    ItmsStateModle itmsStateModle = (ItmsStateModle) gson.fromJson(((nd5) objBody).charStream(), type);
                    Log.e("ErrorState--> ", String.valueOf(itmsStateModle));
                    Integer numValueOf = (itmsStateModle == null || (data = itmsStateModle.getData()) == null) ? null : Integer.valueOf(data.size());
                    Intrinsics.checkNotNull(numValueOf);
                    if (numValueOf.intValue() <= 0) {
                        this.a.i().k("Error");
                        return;
                    }
                    oy3 oy3VarH = this.a.h();
                    Intrinsics.checkNotNull(itmsStateModle);
                    oy3VarH.k(itmsStateModle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }
}
