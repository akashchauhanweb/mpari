package com.zepto;

import com.nic.mparivahan.VahanServices.VahanService.VahanXmlService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class cm7 {
    public final VahanXmlService a;

    public cm7(VahanXmlService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(String state_code, String appl_no, String rc_no, String purpose_code) {
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(rc_no, "rc_no");
        Intrinsics.checkNotNullParameter(purpose_code, "purpose_code");
        return this.a.getDmsUrl(state_code, appl_no, rc_no, purpose_code);
    }
}
