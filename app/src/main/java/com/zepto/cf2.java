package com.zepto;

import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class cf2 {
    public final FromEligCheck a;

    public cf2(FromEligCheck retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.FormOneInter(requestBody, currentTime);
    }

    public final Call b(lc5 request, String currentTime) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.ServiceCheck(request, currentTime);
    }
}
