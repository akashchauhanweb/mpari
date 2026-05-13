package com.zepto;

import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.ToSaveToDraftBuyerRepo.TOSaveToDraftServiceBuyerAadhar;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class ih6 {
    public final TOSaveToDraftServiceBuyerAadhar a;

    public ih6(TOSaveToDraftServiceBuyerAadhar retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.savetoDrfatTO(requestBody, currentTime);
    }
}
