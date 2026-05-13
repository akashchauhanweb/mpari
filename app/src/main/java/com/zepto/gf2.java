package com.zepto;

import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 {
    public final FormsInterface a;

    public gf2(FormsInterface retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(lc5 requestBody, String apl, String db) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        return this.a.getForm1AData(apl, db);
    }

    public final Call b(lc5 requestBody, String apl, String db) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        return this.a.getForm1Data(apl, db);
    }

    public final Call c(lc5 requestBody, String apl, String db) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(apl, "apl");
        Intrinsics.checkNotNullParameter(db, "db");
        return this.a.getForm2Data(apl, db);
    }
}
