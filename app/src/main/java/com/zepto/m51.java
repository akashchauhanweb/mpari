package com.zepto;

import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class m51 {
    public final DFCServices a;

    public m51(DFCServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(String applNo) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        return this.a.validateDownloadReceipt(applNo);
    }
}
