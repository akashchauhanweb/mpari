package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w66 extends r2 implements ty3, od2 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(w66.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;
    public int d;

    public static final class a extends ContinuationImpl {
        public Object c;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= IntCompanionObject.MIN_VALUE;
            return w66.this.a(null, this);
        }
    }

    public w66(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Path cross not found for [B:33:0x009c, B:35:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:33:0x009c], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // com.zepto.n06, com.zepto.od2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.zepto.pd2 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.w66.a(com.zepto.pd2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.zepto.sy3
    public boolean b(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // com.zepto.pd2
    public Object c(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override // com.zepto.ty3, com.zepto.v66
    public Object getValue() {
        s96 s96Var = ie4.a;
        Object obj = e.get(this);
        if (obj == s96Var) {
            return null;
        }
        return obj;
    }

    @Override // com.zepto.r2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public y66 g() {
        return new y66();
    }

    @Override // com.zepto.r2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public y66[] h(int i) {
        return new y66[i];
    }

    public final boolean n(Object obj, Object obj2) {
        int i;
        t2[] t2VarArrK;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            t2[] t2VarArrK2 = k();
            Unit unit = Unit.INSTANCE;
            while (true) {
                y66[] y66VarArr = (y66[]) t2VarArrK2;
                if (y66VarArr != null) {
                    for (y66 y66Var : y66VarArr) {
                        if (y66Var != null) {
                            y66Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    t2VarArrK = k();
                    Unit unit2 = Unit.INSTANCE;
                }
                t2VarArrK2 = t2VarArrK;
                i3 = i;
            }
        }
    }

    @Override // com.zepto.ty3
    public void setValue(Object obj) {
        if (obj == null) {
            obj = ie4.a;
        }
        n(null, obj);
    }
}
