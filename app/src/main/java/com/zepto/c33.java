package com.zepto;

import com.nic.mparivahan.Citizen.Interfaces.ItmsDistictMaster;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class c33 {
    public final ItmsDistictMaster a;

    public c33(ItmsDistictMaster retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return this.a.itmsDisMaster(s14.a.f() + "itmschallan/api/sentinel/users", requestBody);
    }
}
