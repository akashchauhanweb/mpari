package com.zepto;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pd5 {
    public static final pd5 a = new pd5();
    public static final String b = "ResponseHandle";

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if5 if5Var, String str, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.e, this.f, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00d9 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:5:0x000a, B:7:0x009f, B:9:0x00b1, B:11:0x00c1, B:14:0x00d3, B:17:0x00d9, B:19:0x00e9), top: B:27:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.pd5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final String b() {
        return b;
    }

    public final void c(if5 rule, String resultInfo) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(resultInfo, "resultInfo");
        f80.d(qj2.c, null, null, new a(rule, resultInfo, null), 3, null);
    }

    public final String d() {
        String str = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "sdf.format(Date())");
        return str;
    }
}
