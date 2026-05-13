package com.zepto;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class o06 extends r2 implements sy3, od2 {
    public final int d;
    public final int e;
    public final w70 f;
    public Object[] g;
    public long h;
    public long i;
    public int j;
    public int k;

    public static final class a implements uk1 {
        public final o06 c;
        public long e;
        public final Object f;
        public final Continuation g;

        public a(o06 o06Var, long j, Object obj, Continuation continuation) {
            this.c = o06Var;
            this.e = j;
            this.f = obj;
            this.g = continuation;
        }

        @Override // com.zepto.uk1
        public void b() {
            this.c.w(this);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w70.values().length];
            try {
                iArr[w70.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w70.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w70.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class c extends ContinuationImpl {
        public Object c;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= IntCompanionObject.MIN_VALUE;
            return o06.y(o06.this, null, this);
        }
    }

    public o06(int i, int i2, w70 w70Var) {
        this.d = i;
        this.e = i2;
        this.f = w70Var;
    }

    public static /* synthetic */ Object D(o06 o06Var, Object obj, Continuation continuation) {
        Object objE;
        return (!o06Var.b(obj) && (objE = o06Var.E(obj, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objE : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.zepto.pd2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.zepto.r2] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.zepto.o06, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.zepto.pd2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.zepto.t2] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.zepto.q06, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.zepto.q06] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object y(com.zepto.o06 r8, com.zepto.pd2 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.zepto.o06.c
            if (r0 == 0) goto L13
            r0 = r10
            com.zepto.o06$c r0 = (com.zepto.o06.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.zepto.o06$c r0 = new com.zepto.o06$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.j
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.g
            com.zepto.e43 r8 = (com.zepto.e43) r8
            java.lang.Object r9 = r0.f
            com.zepto.q06 r9 = (com.zepto.q06) r9
            java.lang.Object r2 = r0.e
            com.zepto.pd2 r2 = (com.zepto.pd2) r2
            java.lang.Object r5 = r0.c
            com.zepto.o06 r5 = (com.zepto.o06) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.g
            com.zepto.e43 r8 = (com.zepto.e43) r8
            java.lang.Object r9 = r0.f
            com.zepto.q06 r9 = (com.zepto.q06) r9
            java.lang.Object r2 = r0.e
            com.zepto.pd2 r2 = (com.zepto.pd2) r2
            java.lang.Object r5 = r0.c
            com.zepto.o06 r5 = (com.zepto.o06) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.f
            r9 = r8
            com.zepto.q06 r9 = (com.zepto.q06) r9
            java.lang.Object r8 = r0.e
            com.zepto.pd2 r8 = (com.zepto.pd2) r8
            java.lang.Object r2 = r0.c
            com.zepto.o06 r2 = (com.zepto.o06) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            kotlin.ResultKt.throwOnFailure(r10)
            com.zepto.t2 r10 = r8.f()
            com.zepto.q06 r10 = (com.zepto.q06) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            com.zepto.e43$b r5 = com.zepto.e43.d     // Catch: java.lang.Throwable -> Lc1
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc1
            com.zepto.e43 r2 = (com.zepto.e43) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.R(r9)     // Catch: java.lang.Throwable -> L42
            com.zepto.s96 r6 = com.zepto.p06.a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.c = r5     // Catch: java.lang.Throwable -> L42
            r0.e = r2     // Catch: java.lang.Throwable -> L42
            r0.f = r9     // Catch: java.lang.Throwable -> L42
            r0.g = r8     // Catch: java.lang.Throwable -> L42
            r0.j = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.v(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            return r1
        Lab:
            if (r8 == 0) goto Lb0
            com.zepto.k43.f(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.c = r5     // Catch: java.lang.Throwable -> L42
            r0.e = r2     // Catch: java.lang.Throwable -> L42
            r0.f = r9     // Catch: java.lang.Throwable -> L42
            r0.g = r8     // Catch: java.lang.Throwable -> L42
            r0.j = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.c(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.o06.y(com.zepto.o06, com.zepto.pd2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.zepto.r2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public q06 g() {
        return new q06();
    }

    @Override // com.zepto.r2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public q06[] h(int i) {
        return new q06[i];
    }

    public final void C() {
        Object[] objArr = this.g;
        Intrinsics.checkNotNull(objArr);
        p06.f(objArr, I(), null);
        this.j--;
        long jI = I() + 1;
        if (this.h < jI) {
            this.h = jI;
        }
        if (this.i < jI) {
            z(jI);
        }
    }

    public final Object E(Object obj, Continuation continuation) {
        Continuation[] continuationArrG;
        a aVar;
        za0 za0Var = new za0(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        za0Var.z();
        Continuation[] continuationArrG2 = s2.a;
        synchronized (this) {
            try {
                if (O(obj)) {
                    Result.Companion companion = Result.INSTANCE;
                    za0Var.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
                    continuationArrG = G(continuationArrG2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, ((long) M()) + I(), obj, za0Var);
                    F(aVar2);
                    this.k++;
                    if (this.e == 0) {
                        continuationArrG2 = G(continuationArrG2);
                    }
                    continuationArrG = continuationArrG2;
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            bb0.a(za0Var, aVar);
        }
        for (Continuation continuation2 : continuationArrG) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
            }
        }
        Object objW = za0Var.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : Unit.INSTANCE;
    }

    public final void F(Object obj) {
        int iM = M();
        Object[] objArrN = this.g;
        if (objArrN == null) {
            objArrN = N(null, 0, 2);
        } else if (iM >= objArrN.length) {
            objArrN = N(objArrN, iM, objArrN.length * 2);
        }
        p06.f(objArrN, I() + ((long) iM), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] G(Continuation[] continuationArr) {
        t2[] t2VarArr;
        q06 q06Var;
        Continuation continuation;
        int length = continuationArr.length;
        if (this.b != 0 && (t2VarArr = this.a) != null) {
            int length2 = t2VarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                t2 t2Var = t2VarArr[i];
                if (t2Var != null && (continuation = (q06Var = (q06) t2Var).b) != null && Q(q06Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = continuation;
                    q06Var.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    public final long H() {
        return I() + ((long) this.j);
    }

    public final long I() {
        return Math.min(this.i, this.h);
    }

    public final Object J(long j) {
        Object[] objArr = this.g;
        Intrinsics.checkNotNull(objArr);
        Object objE = p06.e(objArr, j);
        return objE instanceof a ? ((a) objE).f : objE;
    }

    public final long K() {
        return I() + ((long) this.j) + ((long) this.k);
    }

    public final int L() {
        return (int) ((I() + ((long) this.j)) - this.h);
    }

    public final int M() {
        return this.j + this.k;
    }

    public final Object[] N(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.g = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jI = I();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jI;
            p06.f(objArr2, j, p06.e(objArr, j));
        }
        return objArr2;
    }

    public final boolean O(Object obj) {
        if (j() == 0) {
            return P(obj);
        }
        if (this.j >= this.e && this.i <= this.h) {
            int i = b.a[this.f.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        F(obj);
        int i2 = this.j + 1;
        this.j = i2;
        if (i2 > this.e) {
            C();
        }
        if (L() > this.d) {
            S(this.h + 1, this.i, H(), K());
        }
        return true;
    }

    public final boolean P(Object obj) {
        if (this.d == 0) {
            return true;
        }
        F(obj);
        int i = this.j + 1;
        this.j = i;
        if (i > this.d) {
            C();
        }
        this.i = I() + ((long) this.j);
        return true;
    }

    public final long Q(q06 q06Var) {
        long j = q06Var.a;
        if (j < H()) {
            return j;
        }
        if (this.e <= 0 && j <= I() && this.k != 0) {
            return j;
        }
        return -1L;
    }

    public final Object R(q06 q06Var) {
        Object obj;
        Continuation[] continuationArrT = s2.a;
        synchronized (this) {
            try {
                long jQ = Q(q06Var);
                if (jQ < 0) {
                    obj = p06.a;
                } else {
                    long j = q06Var.a;
                    Object objJ = J(jQ);
                    q06Var.a = jQ + 1;
                    continuationArrT = T(j);
                    obj = objJ;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrT) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void S(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jI = I(); jI < jMin; jI++) {
            Object[] objArr = this.g;
            Intrinsics.checkNotNull(objArr);
            p06.f(objArr, jI, null);
        }
        this.h = j;
        this.i = j2;
        this.j = (int) (j3 - jMin);
        this.k = (int) (j4 - j3);
    }

    public final Continuation[] T(long j) {
        long j2;
        long j3;
        long j4;
        t2[] t2VarArr;
        if (j > this.i) {
            return s2.a;
        }
        long jI = I();
        long j5 = ((long) this.j) + jI;
        if (this.e == 0 && this.k > 0) {
            j5++;
        }
        if (this.b != 0 && (t2VarArr = this.a) != null) {
            for (t2 t2Var : t2VarArr) {
                if (t2Var != null) {
                    long j6 = ((q06) t2Var).a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.i) {
            return s2.a;
        }
        long jH = H();
        int iMin = j() > 0 ? Math.min(this.k, this.e - ((int) (jH - j5))) : this.k;
        Continuation[] continuationArr = s2.a;
        long j7 = ((long) this.k) + jH;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.g;
            Intrinsics.checkNotNull(objArr);
            long j8 = jH;
            int i = 0;
            while (true) {
                if (jH >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                Object objE = p06.e(objArr, jH);
                j2 = j5;
                s96 s96Var = p06.a;
                if (objE != s96Var) {
                    Intrinsics.checkNotNull(objE, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objE;
                    int i2 = i + 1;
                    j3 = j7;
                    continuationArr[i] = aVar.g;
                    p06.f(objArr, jH, s96Var);
                    p06.f(objArr, j8, aVar.f);
                    j4 = 1;
                    j8++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = j7;
                    j4 = 1;
                }
                jH += j4;
                j5 = j2;
                j7 = j3;
            }
            jH = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (jH - jI);
        long j9 = j() == 0 ? jH : j2;
        long jMax = Math.max(this.h, jH - ((long) Math.min(this.d, i3)));
        if (this.e == 0 && jMax < j3) {
            Object[] objArr2 = this.g;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(p06.e(objArr2, jMax), p06.a)) {
                jH++;
                jMax++;
            }
        }
        S(jMax, j9, jH, j3);
        x();
        return (continuationArr.length == 0) ^ true ? G(continuationArr) : continuationArr;
    }

    public final long U() {
        long j = this.h;
        if (j < this.i) {
            this.i = j;
        }
        return j;
    }

    @Override // com.zepto.n06, com.zepto.od2
    public Object a(pd2 pd2Var, Continuation continuation) {
        return y(this, pd2Var, continuation);
    }

    @Override // com.zepto.sy3
    public boolean b(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArrG = s2.a;
        synchronized (this) {
            if (O(obj)) {
                continuationArrG = G(continuationArrG);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArrG) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    @Override // com.zepto.pd2
    public Object c(Object obj, Continuation continuation) {
        return D(this, obj, continuation);
    }

    public final Object v(q06 q06Var, Continuation continuation) {
        za0 za0Var = new za0(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        za0Var.z();
        synchronized (this) {
            try {
                if (Q(q06Var) < 0) {
                    q06Var.b = za0Var;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    za0Var.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objW = za0Var.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : Unit.INSTANCE;
    }

    public final void w(a aVar) {
        synchronized (this) {
            if (aVar.e < I()) {
                return;
            }
            Object[] objArr = this.g;
            Intrinsics.checkNotNull(objArr);
            if (p06.e(objArr, aVar.e) != aVar) {
                return;
            }
            p06.f(objArr, aVar.e, p06.a);
            x();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void x() {
        if (this.e != 0 || this.k > 1) {
            Object[] objArr = this.g;
            Intrinsics.checkNotNull(objArr);
            while (this.k > 0 && p06.e(objArr, (I() + ((long) M())) - 1) == p06.a) {
                this.k--;
                p06.f(objArr, I() + ((long) M()), null);
            }
        }
    }

    public final void z(long j) {
        t2[] t2VarArr;
        if (this.b != 0 && (t2VarArr = this.a) != null) {
            for (t2 t2Var : t2VarArr) {
                if (t2Var != null) {
                    q06 q06Var = (q06) t2Var;
                    long j2 = q06Var.a;
                    if (j2 >= 0 && j2 < j) {
                        q06Var.a = j;
                    }
                }
            }
        }
        this.i = j;
    }
}
