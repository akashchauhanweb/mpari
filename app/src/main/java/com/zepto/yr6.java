package com.zepto;

import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class yr6 {
    public final UserBloodDetails a;

    public yr6(UserBloodDetails retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getBloodDetails(s14.a.r() + "service/getBloodGroupMast", requestBody, timeStamp);
    }

    public final Call b(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getCitizenProfile(requestBody, timeStamp);
    }

    public final Call c(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.updatestateInterface(requestBody, timeStamp);
    }
}
