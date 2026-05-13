package com.zepto;

import com.nic.mparivahan.RC.RcInterface.AllIndiaPermit;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class xq4 {
    public final AllIndiaPermit a;

    public xq4(AllIndiaPermit retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAllIndiaPermit(requestBody, currentTime);
    }
}
