package com.zepto;

import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class vy1 {
    public final ESInterface a;

    public vy1(ESInterface mESInterface) {
        Intrinsics.checkNotNullParameter(mESInterface, "mESInterface");
        this.a = mESInterface;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getEnableService(requestBody, currentTime);
    }
}
