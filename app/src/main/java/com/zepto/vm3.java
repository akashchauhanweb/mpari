package com.zepto;

import com.nic.mparivahan.Notifications.LocationNotiication;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class vm3 {
    public final LocationNotiication a;

    public vm3(LocationNotiication retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getNotificationLocation(requestBody, timeStamp);
    }
}
