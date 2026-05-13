package com.zepto;

import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterServices.AllotmentLetterRetrofitServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class qo {
    public final AllotmentLetterRetrofitServices a;

    public qo(AllotmentLetterRetrofitServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.allotmentLetter(requestBody, currentTime);
    }
}
