package com.zepto;

import com.nic.mparivahan.PushNoti.NotInterface;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class ic4 {
    public final NotInterface a;

    public ic4(NotInterface mNotInterface) {
        Intrinsics.checkNotNullParameter(mNotInterface, "mNotInterface");
        this.a = mNotInterface;
    }

    public final Call a(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.notInterfaceFun(requestBody, currentTime);
    }

    public final Call b(lc5 requestBody, String currentTime) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return this.a.notDelInterface(requestBody, currentTime);
    }
}
