package com.zepto;

import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataServices.RPDataService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class p35 {
    public final RPDataService a;

    public p35(RPDataService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.sendReqDupList(requestBody, currentTime);
    }
}
