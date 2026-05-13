package com.zepto;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class qf2 extends cg6 {
    public cg6 f;

    public qf2(cg6 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f = delegate;
    }

    @Override // com.zepto.cg6
    public cg6 a() {
        return this.f.a();
    }

    @Override // com.zepto.cg6
    public cg6 b() {
        return this.f.b();
    }

    @Override // com.zepto.cg6
    public long c() {
        return this.f.c();
    }

    @Override // com.zepto.cg6
    public cg6 d(long j) {
        return this.f.d(j);
    }

    @Override // com.zepto.cg6
    public boolean e() {
        return this.f.e();
    }

    @Override // com.zepto.cg6
    public void f() throws InterruptedIOException {
        this.f.f();
    }

    @Override // com.zepto.cg6
    public cg6 g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f.g(j, unit);
    }

    public final cg6 i() {
        return this.f;
    }

    public final qf2 j(cg6 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f = delegate;
        return this;
    }
}
