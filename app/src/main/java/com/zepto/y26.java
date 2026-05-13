package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y26 implements q96 {
    public static final a f = new a(null);
    public final String c;
    public final Object[] e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(p96 p96Var, int i, Object obj) {
            if (obj == null) {
                p96Var.C(i);
                return;
            }
            if (obj instanceof byte[]) {
                p96Var.f0(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                p96Var.F(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                p96Var.F(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                p96Var.X(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                p96Var.X(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                p96Var.X(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                p96Var.X(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                p96Var.s(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                p96Var.X(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(p96 statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(statement, i, obj);
            }
        }
    }

    public y26(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.c = query;
        this.e = objArr;
    }

    @Override // com.zepto.q96
    public String d() {
        return this.c;
    }

    @Override // com.zepto.q96
    public void e(p96 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f.b(statement, this.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y26(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
