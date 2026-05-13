package com.zepto;

import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class xq6 {
    public final UpdateMobileNoService a;

    public xq6(UpdateMobileNoService retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.a = retrofit;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getUserDetails(s14.a.C(), requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitUpdateNo(s14.a.C(), requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.validateAadharDetails(s14.a.C(), requestBody, currentTime);
    }
}
