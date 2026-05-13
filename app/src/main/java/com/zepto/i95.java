package com.zepto;

import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPAPermitService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class i95 {
    public final RenewalOfNPAPermitService a;

    public i95(RenewalOfNPAPermitService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getNPAPermitResponse(requestBody, currentTime);
    }
}
