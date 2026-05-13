package com.zepto;

import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class of4 {
    public final OffenceInterface a;

    public of4(OffenceInterface retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAccDashboardRecords(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAccidentList(requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAccidentFeedback(requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAccidentViolationEvidence(requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getOffencesChanged(s14.a.r() + "service/getOffences", requestBody, currentTime);
    }

    public final Call f(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDashboardRecords(s14.a.x() + "service/countByStatus", requestBody, currentTime);
    }

    public final Call g(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getLastAccident(requestBody, currentTime);
    }

    public final Call h(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getLastViolation(s14.a.x() + "service/getLastReportedViolation", requestBody, currentTime);
    }

    public final Call i(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getOffenceList(s14.a.x() + "service/getReportedViolations", requestBody, currentTime);
    }

    public final Call j(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getStates(s14.a.r() + "service/getStateMaster", requestBody, currentTime);
    }

    public final Call k(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getTrafficFeedback(s14.a.x() + "service/getViolationFeedBack", requestBody, currentTime);
    }

    public final Call l(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getViolationEvidence(s14.a.x() + "service/getViolationEvidence", requestBody, currentTime);
    }

    public final Call m(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.saveAccidentFeedback(requestBody, currentTime);
    }

    public final Call n(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitAccidentReport(requestBody, currentTime);
    }

    public final Call o(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitOffenceFeedBack(s14.a.x() + "service/saveViolationFeedback", requestBody, currentTime);
    }

    public final Call p(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitOffenceReport(s14.a.x() + "service/reportCitizenViolation", requestBody, currentTime);
    }

    public final Call q(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getVerifyVehicleNo(s14.a.u() + "service/verifyRC", requestBody, currentTime);
    }
}
