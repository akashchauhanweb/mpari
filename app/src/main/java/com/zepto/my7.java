package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class my7 {
    public final String a;
    public final String b;

    public my7(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = name;
        this.b = workSpecId;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
