package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 {
    public final String a;
    public final String b;

    public gi1(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.a = workSpecId;
        this.b = prerequisiteId;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
