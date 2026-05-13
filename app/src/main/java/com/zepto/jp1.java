package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class jp1 {
    public final DlService a;

    public jp1(DlService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.dldetailWithOutDob(s14.a.u() + APIController.a().GetLicenceDetails(), requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.getDlDetails_new(s14.a.u() + APIController.a().GetLicenceDetails(), requestBody, currentTime);
    }

    public final Call c(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.updateVirtualDl(s14.a.s() + "service/updateVirtualDocs", requestBody, currentTime);
    }
}
