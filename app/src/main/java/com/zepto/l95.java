package com.zepto;

import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPARepositorySaveToDraftService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class l95 {
    public final RenewalOfNPARepositorySaveToDraftService a;

    public l95(RenewalOfNPARepositorySaveToDraftService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.savetoDraftPermit(requestBody, currentTime);
    }
}
