package com.zepto;

import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionRepository.RunningAuctionRetrofitServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class wf5 {
    public final RunningAuctionRetrofitServices a;

    public wf5(RunningAuctionRetrofitServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String timestamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return this.a.auctionStatus(requestBody, timestamp);
    }
}
