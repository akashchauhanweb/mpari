package com.zepto;

import com.nic.mparivahan.FetchChallanLog.FetchChallanAssets.FetchChallaInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class bb2 {
    public final FetchChallaInterface a;

    public bb2(FetchChallaInterface mFetchChallaInterface) {
        Intrinsics.checkNotNullParameter(mFetchChallaInterface, "mFetchChallaInterface");
        this.a = mFetchChallaInterface;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.dltChallanTransaction(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.fetchChallanInter(requestBody, currentTime);
    }
}
