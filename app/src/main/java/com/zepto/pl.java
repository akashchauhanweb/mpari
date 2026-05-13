package com.zepto;

import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class pl {
    public final AdrInterface a;

    public pl(AdrInterface retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(Map header, lc5 requestBody) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return this.a.aadhaarResponse(header, requestBody);
    }

    public final Call b(Map header, lc5 requestBody) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return this.a.newSarAadhaarRequest(header, requestBody);
    }
}
