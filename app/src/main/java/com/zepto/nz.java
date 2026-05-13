package com.zepto;

import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusServices.AuctionStatusRetrofitServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class nz {
    public final AuctionStatusRetrofitServices a;

    public nz(AuctionStatusRetrofitServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.auctionStatus(requestBody, currentTime);
    }
}
