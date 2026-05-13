package com.zepto;

import android.content.Context;
import com.zepto.kc5;
import com.zepto.v03;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tz implements v03 {
    public final ws6 a;

    public tz(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new ws6(context);
    }

    @Override // com.zepto.v03
    public ld5 a(v03.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        kc5.a aVarI = chain.request().i();
        aVarI.a("Authorization", "Bearer " + this.a.r());
        aVarI.a("Param2", "2.0.135");
        if (this.a.u()) {
            aVarI.a("Param1", this.a.e());
        } else {
            aVarI.a("Param1", "");
        }
        return chain.a(aVarI.b());
    }
}
