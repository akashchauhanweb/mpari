package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class qw {
    public final ApplicationService a;

    public qw(ApplicationService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.disposeApplication(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDetailsDisposeApp(requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDetailsByRegNo(requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDetailsByTransNo(requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getPendingTransTaxBreak(requestBody, currentTime);
    }

    public final Call f(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.getSendOtpRes(s14.a.p() + APIController.a().SendSmsAlert(), requestBody, timeStamp);
    }

    public final Call g(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.verifyOtp(requestBody, currentTime);
    }

    public final Call h(lc5 requestBody, String timeStamp) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return this.a.verifyOtpDetails(s14.a.p() + APIController.a().VerifySMSOtp(), requestBody, timeStamp);
    }

    public final Call i(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.verifyPendingPayment(requestBody, currentTime);
    }
}
