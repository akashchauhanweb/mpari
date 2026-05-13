package com.zepto;

import android.content.Context;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class lr1 {
    public final DlServiceInt a;
    public final Context b;
    public ws6 c;

    public lr1(DlServiceInt dlServiceInt, Context context) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "dlServiceInt");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = dlServiceInt;
        this.b = context;
        this.c = new ws6(context);
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getCustomState(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getCurrentRTO(requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getCurrentState(s14.a.j() + "sarathi/sarathiWS/getSeStatesList/stateMast", requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getEligibleServices(requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDlDetails_new(s14.a.u() + APIController.a().GetLicenceDetails(), requestBody, currentTime);
    }

    public final Call f(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getLastEndorsedRTO(requestBody, currentTime);
    }

    public final Call g(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getResendOtp(s14.a.p() + APIController.a().ReSendSMSAlerts(), requestBody, currentTime);
    }

    public final Call h(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getSendOtpRes(s14.a.p() + APIController.a().SendSmsAlert(), requestBody, currentTime);
    }

    public final Call i(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.verifyOtpDetails(s14.a.p() + APIController.a().VerifySMSOtp(), requestBody, currentTime);
    }
}
