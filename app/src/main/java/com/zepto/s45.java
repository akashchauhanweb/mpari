package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.RC.RcInterface.RcService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class s45 {
    public final RcService a;

    public s45(RcService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.deletMyDoc(s14.a.s() + "service/deactivateVirtualDocs", requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.deletSharedDoc(s14.a.s() + "service/deleteSharedDoc", requestBody, currentTime);
    }

    public final Call d(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getRcValues(s14.a.u() + APIController.a().GetSearchDocDetails(), requestBody, currentTime);
    }

    public final Call e(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getSharedDoc(s14.a.s() + "service/getSharedDocList", requestBody, currentTime);
    }

    public final Call f(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getUserDetails(s14.a.D(), requestBody, currentTime);
    }

    public final Call g(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getVirtualDocDetails(s14.a.s() + "service/getVirtualDocs", requestBody, currentTime);
    }

    public final Call h(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.sharedDoc(s14.a.s() + "service/createSharedDoc", requestBody, currentTime);
    }

    public final Call i(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.updateVirtualDoc(s14.a.s() + "service/updateVirtualDocs", requestBody, currentTime);
    }

    public final Call j(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.validateRc(s14.a.u() + APIController.a().ValidateRC(), requestBody, currentTime);
    }
}
