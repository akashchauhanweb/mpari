package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class pw {
    public final ApplicationServiceOtp a;

    public pw(ApplicationServiceOtp retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.downloadAppoinment(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getApplicationDetails(s14.a.n() + "knowappl/fetchyourApplDetails", requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getApplicationDetailsUsingRc(s14.a.n() + "knowappl/fetchyourRegnDetails", requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getResendOtp(s14.a.p() + APIController.a().ReSendSMSAlerts(), requestBody, timeStamp);
    }

    public final Call e(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.verifyOtpDetails(s14.a.p() + APIController.a().VerifySMSOtp(), requestBody, timeStamp);
    }
}
