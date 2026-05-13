package com.zepto;

import com.zepto.my5;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bs0 {

    public static final class a extends SuspendLambda implements Function2 {
        public Object c;
        public Object e;
        public int f;
        public int g;
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ od2[] j;
        public final /* synthetic */ Function0 k;
        public final /* synthetic */ Function3 l;
        public final /* synthetic */ pd2 m;

        /* JADX INFO: renamed from: com.zepto.bs0$a$a, reason: collision with other inner class name */
        public static final class C0070a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ od2[] e;
            public final /* synthetic */ int f;
            public final /* synthetic */ AtomicInteger g;
            public final /* synthetic */ li0 h;

            /* JADX INFO: renamed from: com.zepto.bs0$a$a$a, reason: collision with other inner class name */
            public static final class C0071a implements pd2 {
                public final /* synthetic */ li0 a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: com.zepto.bs0$a$a$a$a, reason: collision with other inner class name */
                public static final class C0072a extends ContinuationImpl {
                    public /* synthetic */ Object c;
                    public int f;

                    public C0072a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.c = obj;
                        this.f |= IntCompanionObject.MIN_VALUE;
                        return C0071a.this.c(null, this);
                    }
                }

                public C0071a(li0 li0Var, int i) {
                    this.a = li0Var;
                    this.b = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // com.zepto.pd2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object c(java.lang.Object r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zepto.bs0.a.C0070a.C0071a.C0072a
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zepto.bs0$a$a$a$a r0 = (com.zepto.bs0.a.C0070a.C0071a.C0072a) r0
                        int r1 = r0.f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f = r1
                        goto L18
                    L13:
                        com.zepto.bs0$a$a$a$a r0 = new com.zepto.bs0$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.c
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L4d
                    L38:
                        kotlin.ResultKt.throwOnFailure(r8)
                        com.zepto.li0 r8 = r6.a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.f = r4
                        java.lang.Object r7 = r8.i(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f = r3
                        java.lang.Object r7 = com.zepto.z08.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zepto.bs0.a.C0070a.C0071a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0070a(od2[] od2VarArr, int i, AtomicInteger atomicInteger, li0 li0Var, Continuation continuation) {
                super(2, continuation);
                this.e = od2VarArr;
                this.f = i;
                this.g = atomicInteger;
                this.h = li0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0070a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0070a(this.e, this.f, this.g, this.h, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        od2[] od2VarArr = this.e;
                        int i2 = this.f;
                        od2 od2Var = od2VarArr[i2];
                        C0071a c0071a = new C0071a(this.h, i2);
                        this.c = 1;
                        if (od2Var.a(c0071a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        my5.a.a(this.h, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.g.decrementAndGet() == 0) {
                        my5.a.a(this.h, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(od2[] od2VarArr, Function0 function0, Function3 function3, pd2 pd2Var, Continuation continuation) {
            super(2, continuation);
            this.j = od2VarArr;
            this.k = function0;
            this.l = function3;
            this.m = pd2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.j, this.k, this.l, this.m, continuation);
            aVar.i = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[LOOP:0: B:28:0x00e6->B:51:?, LOOP_START, PHI: r6 r10
          0x00e6: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00e1, B:51:?] A[DONT_GENERATE, DONT_INLINE]
          0x00e6: PHI (r10v8 kotlin.collections.IndexedValue) = (r10v7 kotlin.collections.IndexedValue), (r10v21 kotlin.collections.IndexedValue) binds: [B:25:0x00e1, B:51:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012e -> B:20:0x00c3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.bs0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(pd2 pd2Var, od2[] od2VarArr, Function0 function0, Function3 function3, Continuation continuation) {
        Object objA = rd2.a(new a(od2VarArr, function0, function3, pd2Var, null), continuation);
        return objA == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
