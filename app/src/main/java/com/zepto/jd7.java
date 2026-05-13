package com.zepto;

import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class jd7 {
    public final VahanProService a;

    public jd7(VahanProService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call A(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getdistict(s14.a.C(), requestBody, currentTime);
    }

    public final Call B(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.gethptDetails(s14.a.C(), requestBody, currentTime);
    }

    public final Call C(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.requestForBefoPayment(s14.a.C(), requestBody, currentTime);
    }

    public final Call D(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.requestForduplicateRc(s14.a.C(), requestBody, currentTime);
    }

    public final Call E(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.requestHptService(s14.a.C(), requestBody, currentTime);
    }

    public final Call F(lc5 request, String currentTime) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.saveSlotAppointmentDetails(s14.a.C(), request, currentTime);
    }

    public final Call G(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.sendChangeOfAddress(s14.a.C(), requestBody, currentTime);
    }

    public final Call H(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitFinalRequest(s14.a.C(), requestBody, currentTime);
    }

    public final Call I(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.submitRequestForNocDraft(s14.a.C(), requestBody, currentTime);
    }

    public final Call J(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.vahanGenerateOtp(s14.a.C(), requestBody, currentTime);
    }

    public final Call K(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.vahanVerifyOtp(s14.a.C(), requestBody, currentTime);
    }

    public final Call L(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.validateAadhaar(s14.a.C(), requestBody, currentTime);
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.afterPayment(s14.a.C(), requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.checkhold(s14.a.C(), requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.checkPaymentStatusForSlot(s14.a.C(), requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.checkSlotEligibility(s14.a.C(), requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.checkStateCoustomPermit(s14.a.C(), requestBody, currentTime);
    }

    public final Call f(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.checkStateCoustomization(s14.a.C(), requestBody, currentTime);
    }

    public final Call g(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.downloadNoc(s14.a.C(), requestBody, currentTime);
    }

    public final Call h(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.eSign(s14.a.C(), requestBody, currentTime);
    }

    public final Call i(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAadMobCheck(s14.a.C(), requestBody, currentTime);
    }

    public final Call j(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAadMobCheckV1(s14.a.C(), requestBody, currentTime);
    }

    public final Call k(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getAadharFacelessAppCheck(s14.a.C(), requestBody, currentTime);
    }

    public final Call l(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getBeforPaymentUrl(s14.a.C(), requestBody, currentTime);
    }

    public final Call m(lc5 request, String currentTime) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getCounterIdForSlot(s14.a.C(), request, currentTime);
    }

    public final Call n(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getFeesDetails(s14.a.C(), requestBody, currentTime);
    }

    public final Call o(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getFormDetails(s14.a.C(), requestBody, currentTime);
    }

    public final Call p(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getNocReasonData(s14.a.C(), requestBody, currentTime);
    }

    public final Call q(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getOwnerDetails(s14.a.C(), requestBody, currentTime);
    }

    public final Call r(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getRcValues(s14.a.C(), requestBody, currentTime);
    }

    public final Call s(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getReson(s14.a.C(), requestBody, currentTime);
    }

    public final Call t(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getRtoNameForNoc(s14.a.C(), requestBody, currentTime);
    }

    public final Call u(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getSlotAppointmentByDate(s14.a.C(), requestBody, currentTime);
    }

    public final Call v(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getStateCode(s14.a.C(), requestBody, currentTime);
    }

    public final Call w(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getStateMasterList(s14.a.C(), requestBody, currentTime);
    }

    public final Call x(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getValidateregandchasino(s14.a.C(), requestBody, currentTime);
    }

    public final Call y(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getallowedservices(s14.a.C(), requestBody, currentTime);
    }

    public final Call z(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getclassDes(s14.a.C(), requestBody, currentTime);
    }
}
