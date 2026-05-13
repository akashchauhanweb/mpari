package com.zepto;

import com.nic.mparivahan.APIController;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bf4 {
    public sd1 a;

    public bf4(sd1 dataOpertaion) {
        Intrinsics.checkNotNullParameter(dataOpertaion, "dataOpertaion");
        this.a = dataOpertaion;
    }

    public final HashMap a(String dataString) {
        Intrinsics.checkNotNullParameter(dataString, "dataString");
        HashMap map = new HashMap();
        try {
            this.a.a(dataString);
            map.put(APIController.a().getConst(), String.valueOf(this.a.getStoredData()));
        } catch (Exception unused) {
        }
        return map;
    }
}
