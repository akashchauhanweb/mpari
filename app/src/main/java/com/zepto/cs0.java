package com.zepto;

import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class cs0 {
    public final CombineServiceInterface a;

    public cs0(CombineServiceInterface retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getAckDetForGivenDLNumber(requestBody, timeStamp);
    }
}
