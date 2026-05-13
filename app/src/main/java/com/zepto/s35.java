package com.zepto;

import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftService.RPSaveToDraftService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class s35 {
    public final RPSaveToDraftService a;

    public s35(RPSaveToDraftService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.savetoDrfatRP(requestBody, currentTime);
    }
}
