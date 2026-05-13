package com.zepto;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class f16 {
    public final je5 a;
    public final AtomicBoolean b;
    public final Lazy c;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r96 invoke() {
            return f16.this.d();
        }
    }

    public f16(je5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.a = database;
        this.b = new AtomicBoolean(false);
        this.c = LazyKt__LazyJVMKt.lazy(new a());
    }

    public r96 b() {
        c();
        return g(this.b.compareAndSet(false, true));
    }

    public void c() {
        this.a.c();
    }

    public final r96 d() {
        return this.a.f(e());
    }

    public abstract String e();

    public final r96 f() {
        return (r96) this.c.getValue();
    }

    public final r96 g(boolean z) {
        return z ? f() : d();
    }

    public void h(r96 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == f()) {
            this.b.set(false);
        }
    }
}
