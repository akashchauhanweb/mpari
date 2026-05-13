package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Account.CreateAccountServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class f11 {
    public final CreateAccountServices a;

    public f11(CreateAccountServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getResendOtp(s14.a.p() + APIController.a().ReSendSMSAlerts(), requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getSendOtpRes(s14.a.p() + APIController.a().SendSmsAlert(), requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getStateMasterList(s14.a.r() + "service/getStateMaster", requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getUserDetails(s14.a.D(), requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.verifyOtpDetails(s14.a.p() + APIController.a().VerifySMSOtp(), requestBody, currentTime);
    }
}
