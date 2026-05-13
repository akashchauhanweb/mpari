package com.zepto;

import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class yy7 {
    public static final a x = new a(null);
    public static final String y;
    public static final yh2 z;
    public final String a;
    public by7 b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public lx0 j;
    public int k;
    public x30 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public ij4 r;
    public int s;
    public final int t;
    public long u;
    public int v;
    public final int w;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z, int i, x30 backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j6 != LongCompanionObject.MAX_VALUE && z2) {
                return i2 == 0 ? j6 : RangesKt___RangesKt.coerceAtLeast(j6, 900000 + j2);
            }
            if (z) {
                return j2 + RangesKt___RangesKt.coerceAtMost(backoffPolicy == x30.LINEAR ? ((long) i) * j : (long) Math.scalb(j, i - 1), 18000000L);
            }
            if (!z2) {
                return j2 == -1 ? LongCompanionObject.MAX_VALUE : j2 + j3;
            }
            long j7 = i2 == 0 ? j2 + j3 : j2 + j5;
            if (j4 != j5 && i2 == 0) {
                j7 += j5 - j4;
            }
            return j7;
        }
    }

    public static final class b {
        public String a;
        public by7 b;

        public b(String id, by7 state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.a = id;
            this.b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    static {
        String strI = rn3.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkSpec\")");
        y = strI;
        z = new yh2() { // from class: com.zepto.xy7
            @Override // com.zepto.yh2
            public final Object a(Object obj) {
                return yy7.b((List) obj);
            }
        };
    }

    public yy7(String id, by7 state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j, long j2, long j3, lx0 constraints, int i, x30 backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, ij4 outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.a = id;
        this.b = state;
        this.c = workerClassName;
        this.d = inputMergerClassName;
        this.e = input;
        this.f = output;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = constraints;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
    }

    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        wb0.a(it.next());
        throw null;
    }

    public final long c() {
        return x.a(j(), this.k, this.l, this.m, this.n, this.s, k(), this.g, this.i, this.h, this.u);
    }

    public final int d() {
        return this.t;
    }

    public final long e() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy7)) {
            return false;
        }
        yy7 yy7Var = (yy7) obj;
        return Intrinsics.areEqual(this.a, yy7Var.a) && this.b == yy7Var.b && Intrinsics.areEqual(this.c, yy7Var.c) && Intrinsics.areEqual(this.d, yy7Var.d) && Intrinsics.areEqual(this.e, yy7Var.e) && Intrinsics.areEqual(this.f, yy7Var.f) && this.g == yy7Var.g && this.h == yy7Var.h && this.i == yy7Var.i && Intrinsics.areEqual(this.j, yy7Var.j) && this.k == yy7Var.k && this.l == yy7Var.l && this.m == yy7Var.m && this.n == yy7Var.n && this.o == yy7Var.o && this.p == yy7Var.p && this.q == yy7Var.q && this.r == yy7Var.r && this.s == yy7Var.s && this.t == yy7Var.t && this.u == yy7Var.u && this.v == yy7Var.v && this.w == yy7Var.w;
    }

    public final int f() {
        return this.v;
    }

    public final int g() {
        return this.s;
    }

    public final int h() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + Integer.hashCode(this.k)) * 31) + this.l.hashCode()) * 31) + Long.hashCode(this.m)) * 31) + Long.hashCode(this.n)) * 31) + Long.hashCode(this.o)) * 31) + Long.hashCode(this.p)) * 31;
        boolean z2 = this.q;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + this.r.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + Integer.hashCode(this.t)) * 31) + Long.hashCode(this.u)) * 31) + Integer.hashCode(this.v)) * 31) + Integer.hashCode(this.w);
    }

    public final boolean i() {
        return !Intrinsics.areEqual(lx0.j, this.j);
    }

    public final boolean j() {
        return this.b == by7.ENQUEUED && this.k > 0;
    }

    public final boolean k() {
        return this.h != 0;
    }

    public String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yy7(String str, by7 by7Var, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j, long j2, long j3, lx0 lx0Var, int i, x30 x30Var, long j4, long j5, long j6, long j7, boolean z2, ij4 ij4Var, int i2, int i3, long j8, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        by7 by7Var2 = (i6 & 2) != 0 ? by7.ENQUEUED : by7Var;
        if ((i6 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i6 & 16) != 0) {
            androidx.work.b EMPTY = androidx.work.b.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            bVar3 = EMPTY;
        } else {
            bVar3 = bVar;
        }
        if ((i6 & 32) != 0) {
            androidx.work.b EMPTY2 = androidx.work.b.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            bVar4 = EMPTY2;
        } else {
            bVar4 = bVar2;
        }
        this(str, by7Var2, str2, str4, bVar3, bVar4, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? lx0.j : lx0Var, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? x30.EXPONENTIAL : x30Var, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? 30000L : j4, (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? -1L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z2, (131072 & i6) != 0 ? ij4.RUN_AS_NON_EXPEDITED_WORK_REQUEST : ij4Var, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (i6 & 4194304) != 0 ? -256 : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yy7(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yy7(String newId, yy7 other) {
        this(newId, other.b, other.c, other.d, new androidx.work.b(other.e), new androidx.work.b(other.f), other.g, other.h, other.i, new lx0(other.j), other.k, other.l, other.m, other.n, other.o, other.p, other.q, other.r, other.s, 0, other.u, other.v, other.w, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
