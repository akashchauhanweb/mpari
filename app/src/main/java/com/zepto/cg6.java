package com.zepto;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class cg6 {
    public boolean a;
    public long b;
    public long c;
    public static final b e = new b(null);
    public static final cg6 d = new a();

    public static final class a extends cg6 {
        @Override // com.zepto.cg6
        public cg6 d(long j) {
            return this;
        }

        @Override // com.zepto.cg6
        public void f() {
        }

        @Override // com.zepto.cg6
        public cg6 g(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cg6 a() {
        this.a = false;
        return this;
    }

    public cg6 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public cg6 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public cg6 g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j >= 0) {
            this.c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long h() {
        return this.c;
    }
}
