package com.zepto;

import com.zepto.h31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class br7 {
    public static final h31 a(dr7 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) owner).L() : h31.a.b;
    }
}
