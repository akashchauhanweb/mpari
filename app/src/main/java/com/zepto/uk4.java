package com.zepto;

import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices.PUCCertifiateServices;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class uk4 {
    public final PUCCertifiateServices a;

    public uk4(PUCCertifiateServices retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.validateDownloadReceipt(requestBody, currentTime);
    }
}
