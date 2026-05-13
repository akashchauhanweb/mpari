package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cz7 {
    public final String a;
    public final String b;

    public cz7(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = tag;
        this.b = workSpecId;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
