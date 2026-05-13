package com.zepto;

import com.zepto.o96;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g00 implements o96.c {
    public final o96.c a;
    public final e00 b;

    public g00(o96.c delegate, e00 autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.a = delegate;
        this.b = autoCloser;
    }

    @Override // com.zepto.o96.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f00 a(o96.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new f00(this.a.a(configuration), this.b);
    }
}
