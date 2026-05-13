package com.zepto;

import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 {
    public final NoticeService a;

    public ec1(NoticeService retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.a = retrofit;
    }

    public final Call a(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.verifyPaymentStatus(requestBody, timeStamp);
    }

    public final Call b(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getVirtualCourt(requestBody, timeStamp);
    }

    public final Call c(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getNoticeListUsingNoticeNo(requestBody, timeStamp);
    }

    public final Call d(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getNoticeListUsingVehicleNo(requestBody, timeStamp);
    }
}
