package com.zepto;

import com.nic.mparivahan.FetchVahanLog.FetchVahanLog.VahanInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class h67 {
    public final VahanInterface a;

    public h67(VahanInterface mVahanInterface) {
        Intrinsics.checkNotNullParameter(mVahanInterface, "mVahanInterface");
        this.a = mVahanInterface;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.dltVahanTransaction(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.fetchVahanLogDetails(requestBody, currentTime);
    }
}
