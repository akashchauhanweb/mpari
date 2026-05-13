package com.zepto;

import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVSaveToDraftService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public final AOVSaveToDraftService a;

    public r(AOVSaveToDraftService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.savetoDraftAOV(requestBody, currentTime);
    }
}
