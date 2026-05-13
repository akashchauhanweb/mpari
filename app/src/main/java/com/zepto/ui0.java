package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ui0 extends wu5 {
    public final x70 h;
    public final AtomicReferenceArray i;

    public ui0(long j, ui0 ui0Var, x70 x70Var, int i) {
        super(j, ui0Var, i);
        this.h = x70Var;
        this.i = new AtomicReferenceArray(y70.b * 2);
    }

    public final void A(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }

    public final void B(int i, Object obj) {
        z(i, obj);
    }

    @Override // com.zepto.wu5
    public int n() {
        return y70.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        com.zepto.gh4.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // com.zepto.wu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r3 = this;
            int r5 = com.zepto.y70.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof com.zepto.ju7
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof com.zepto.ku7
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            com.zepto.s96 r2 = com.zepto.y70.j()
            if (r1 == r2) goto L63
            com.zepto.s96 r2 = com.zepto.y70.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            com.zepto.s96 r2 = com.zepto.y70.p()
            if (r1 == r2) goto Le
            com.zepto.s96 r2 = com.zepto.y70.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            com.zepto.s96 r4 = com.zepto.y70.f()
            if (r1 == r4) goto L62
            com.zepto.s96 r4 = com.zepto.y70.d
            if (r1 != r4) goto L40
            goto L62
        L40:
            com.zepto.s96 r4 = com.zepto.y70.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            com.zepto.x70 r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.e
            if (r4 == 0) goto L73
            com.zepto.gh4.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            com.zepto.s96 r2 = com.zepto.y70.j()
            goto L7f
        L7b:
            com.zepto.s96 r2 = com.zepto.y70.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            com.zepto.x70 r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.e
            if (r4 == 0) goto L9a
            com.zepto.gh4.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ui0.o(int, java.lang.Throwable, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean r(int i, Object obj, Object obj2) {
        return ti0.a(this.i, (i * 2) + 1, obj, obj2);
    }

    public final void s(int i) {
        z(i, null);
    }

    public final Object t(int i, Object obj) {
        return this.i.getAndSet((i * 2) + 1, obj);
    }

    public final x70 u() {
        x70 x70Var = this.h;
        Intrinsics.checkNotNull(x70Var);
        return x70Var;
    }

    public final Object v(int i) {
        return this.i.get(i * 2);
    }

    public final Object w(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void x(int i, boolean z) {
        if (z) {
            u().I0((this.f * ((long) y70.b)) + ((long) i));
        }
        p();
    }

    public final Object y(int i) {
        Object objV = v(i);
        s(i);
        return objV;
    }

    public final void z(int i, Object obj) {
        this.i.lazySet(i * 2, obj);
    }
}
