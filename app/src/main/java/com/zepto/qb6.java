package com.zepto;

import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class qb6 {
    public final TOCommonService a;

    public qb6(TOCommonService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getTOCommonServices(requestBody, currentTime);
    }
}
