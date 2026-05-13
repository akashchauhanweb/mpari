package com.zepto;

import com.zepto.uy7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ih4 extends uy7 {
    public static final b e = new b(null);

    public static final class a extends uy7.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // com.zepto.uy7.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ih4 b() {
            if (c() && g().j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new ih4(this);
        }

        @Override // com.zepto.uy7.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a f() {
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ih4 a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (ih4) new a(workerClass).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih4(a builder) {
        super(builder.d(), builder.g(), builder.e());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final ih4 e(Class cls) {
        return e.a(cls);
    }
}
