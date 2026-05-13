package com.zepto;

import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class uj0 {
    public final CheckpostTaxReceiptServices a;

    public uj0(CheckpostTaxReceiptServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.searchavailableReceipt(requestBody, currentTime);
    }
}
