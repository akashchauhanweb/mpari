package com.zepto;

import com.nic.mparivahan.fetchSarathiLog.FetchSarathiAssets.SarathiInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class i18 {
    public final SarathiInterface a;

    public i18(SarathiInterface mSarathiInterface) {
        Intrinsics.checkNotNullParameter(mSarathiInterface, "mSarathiInterface");
        this.a = mSarathiInterface;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.dltSarathiTransaction(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.fetchSarathiinterface(requestBody, currentTime);
    }
}
