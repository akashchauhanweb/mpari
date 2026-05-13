package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o55 extends nd5 {
    public final String c;
    public final long e;
    public final a80 f;

    public o55(String str, long j, a80 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.c = str;
        this.e = j;
        this.f = source;
    }

    @Override // com.zepto.nd5
    public long contentLength() {
        return this.e;
    }

    @Override // com.zepto.nd5
    public ls3 contentType() {
        String str = this.c;
        if (str != null) {
            return ls3.g.b(str);
        }
        return null;
    }

    @Override // com.zepto.nd5
    public a80 source() {
        return this.f;
    }
}
