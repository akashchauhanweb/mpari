package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class wk1 implements od2 {
    public final od2 a;
    public final Function1 b;
    public final Function2 c;

    public static final class a implements pd2 {
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ pd2 c;

        /* JADX INFO: renamed from: com.zepto.wk1$a$a, reason: collision with other inner class name */
        public static final class C0129a extends ContinuationImpl {
            public /* synthetic */ Object c;
            public int f;

            public C0129a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.f |= IntCompanionObject.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        public a(Ref.ObjectRef objectRef, pd2 pd2Var) {
            this.b = objectRef;
            this.c = pd2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        @Override // com.zepto.pd2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.zepto.wk1.a.C0129a
                if (r0 == 0) goto L13
                r0 = r7
                com.zepto.wk1$a$a r0 = (com.zepto.wk1.a.C0129a) r0
                int r1 = r0.f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f = r1
                goto L18
            L13:
                com.zepto.wk1$a$a r0 = new com.zepto.wk1$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.ResultKt.throwOnFailure(r7)
                com.zepto.wk1 r7 = com.zepto.wk1.this
                kotlin.jvm.functions.Function1 r7 = r7.b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.b
                T r2 = r2.element
                com.zepto.s96 r4 = com.zepto.ie4.a
                if (r2 == r4) goto L58
                com.zepto.wk1 r4 = com.zepto.wk1.this
                kotlin.jvm.functions.Function2 r4 = r4.c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.b
                r2.element = r7
                com.zepto.pd2 r7 = r5.c
                r0.f = r3
                java.lang.Object r6 = r7.c(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.wk1.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public wk1(od2 od2Var, Function1 function1, Function2 function2) {
        this.a = od2Var;
        this.b = function1;
        this.c = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.zepto.s96] */
    @Override // com.zepto.od2
    public Object a(pd2 pd2Var, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = ie4.a;
        Object objA = this.a.a(new a(objectRef, pd2Var), continuation);
        return objA == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
