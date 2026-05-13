package com.zepto;

import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class r86 {
    public final SubmitInterface a;

    public r86(SubmitInterface retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.SubmitFunction(requestBody, currentTime);
    }
}
