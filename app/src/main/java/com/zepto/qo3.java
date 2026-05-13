package com.zepto;

import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPService.MFPService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class qo3 {
    public final MFPService a;

    public qo3(MFPService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.savetoDraftMFP(requestBody, currentTime);
    }
}
