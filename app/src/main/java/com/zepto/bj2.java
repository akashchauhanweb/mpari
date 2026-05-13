package com.zepto;

import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class bj2 {
    public final GetApplStatusService a;

    public bj2(GetApplStatusService getAppInfoService) {
        Intrinsics.checkNotNullParameter(getAppInfoService, "getAppInfoService");
        this.a = getAppInfoService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAppInfoCall(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAppStatus(requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getSlotPdf(requestBody, currentTime);
    }
}
