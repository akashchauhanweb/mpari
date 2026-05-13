package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: classes3.dex */
public class fn3 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(fn3.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(fn3.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(fn3.class, Object.class, "_removedRef");

    @Volatile
    private volatile Object _next = this;

    @Volatile
    private volatile Object _prev = this;

    @Volatile
    private volatile Object _removedRef;

    public static abstract class a extends my {
        public final fn3 b;
        public fn3 c;

        public a(fn3 fn3Var) {
            this.b = fn3Var;
        }

        @Override // com.zepto.my
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(fn3 fn3Var, Object obj) {
            boolean z = obj == null;
            fn3 fn3Var2 = z ? this.b : this.c;
            if (fn3Var2 != null && o2.a(fn3.c, fn3Var, this, fn3Var2) && z) {
                fn3 fn3Var3 = this.b;
                fn3 fn3Var4 = this.c;
                Intrinsics.checkNotNull(fn3Var4);
                fn3Var3.i(fn3Var4);
            }
        }
    }

    public final boolean f(fn3 fn3Var) {
        e.lazySet(fn3Var, this);
        c.lazySet(fn3Var, this);
        while (j() == this) {
            if (o2.a(c, this, this, fn3Var)) {
                fn3Var.i(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (com.zepto.o2.a(r4, r3, r2, ((com.zepto.h85) r5).a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.zepto.fn3 g(com.zepto.jh4 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.zepto.fn3.e
            java.lang.Object r0 = r0.get(r8)
            com.zepto.fn3 r0 = (com.zepto.fn3) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.zepto.fn3.c
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = com.zepto.fn3.e
            boolean r0 = com.zepto.o2.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof com.zepto.jh4
            if (r6 == 0) goto L34
            com.zepto.jh4 r5 = (com.zepto.jh4) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof com.zepto.h85
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            com.zepto.h85 r5 = (com.zepto.h85) r5
            com.zepto.fn3 r5 = r5.a
            boolean r2 = com.zepto.o2.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.zepto.fn3.e
            java.lang.Object r2 = r4.get(r2)
            com.zepto.fn3 r2 = (com.zepto.fn3) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r3 = r5
            com.zepto.fn3 r3 = (com.zepto.fn3) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.fn3.g(com.zepto.jh4):com.zepto.fn3");
    }

    public final fn3 h(fn3 fn3Var) {
        while (fn3Var.m()) {
            fn3Var = (fn3) e.get(fn3Var);
        }
        return fn3Var;
    }

    public final void i(fn3 fn3Var) {
        fn3 fn3Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        do {
            fn3Var2 = (fn3) atomicReferenceFieldUpdater.get(fn3Var);
            if (j() != fn3Var) {
                return;
            }
        } while (!o2.a(e, fn3Var, fn3Var2, this));
        if (m()) {
            fn3Var.g(null);
        }
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof jh4)) {
                return obj;
            }
            ((jh4) obj).a(this);
        }
    }

    public final fn3 k() {
        return en3.b(j());
    }

    public final fn3 l() {
        fn3 fn3VarG = g(null);
        return fn3VarG == null ? h((fn3) e.get(this)) : fn3VarG;
    }

    public boolean m() {
        return j() instanceof h85;
    }

    public boolean n() {
        return o() == null;
    }

    public final fn3 o() {
        Object objJ;
        fn3 fn3Var;
        do {
            objJ = j();
            if (objJ instanceof h85) {
                return ((h85) objJ).a;
            }
            if (objJ == this) {
                return (fn3) objJ;
            }
            Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            fn3Var = (fn3) objJ;
        } while (!o2.a(c, this, objJ, fn3Var.p()));
        fn3Var.g(null);
        return null;
    }

    public final h85 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        h85 h85Var = (h85) atomicReferenceFieldUpdater.get(this);
        if (h85Var != null) {
            return h85Var;
        }
        h85 h85Var2 = new h85(this);
        atomicReferenceFieldUpdater.lazySet(this, h85Var2);
        return h85Var2;
    }

    public final int q(fn3 fn3Var, fn3 fn3Var2, a aVar) {
        e.lazySet(fn3Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        atomicReferenceFieldUpdater.lazySet(fn3Var, fn3Var2);
        aVar.c = fn3Var2;
        if (o2.a(atomicReferenceFieldUpdater, this, fn3Var2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: com.zepto.fn3.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return me1.a(this.receiver);
            }
        } + '@' + me1.b(this);
    }
}
