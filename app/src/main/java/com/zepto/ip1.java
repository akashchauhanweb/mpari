package com.zepto;

import android.app.Application;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ip1 {
    public Application a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public final oy3 h;

    public static final class a extends SuspendLambda implements Function2 {
        public int c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ip1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ip1 ip1Var = ip1.this;
                this.c = 1;
                if (ip1Var.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends ContinuationImpl {
        public Object c;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return ip1.this.a(this);
        }
    }

    public ip1(Application mApp, String applNo, String transCode, String stateCode, String rtoCode, int i, String acStatus) {
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(acStatus, "acStatus");
        this.a = mApp;
        this.b = applNo;
        this.c = transCode;
        this.d = stateCode;
        this.e = rtoCode;
        this.f = i;
        this.g = acStatus;
        this.h = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|36|12)(2:14|15))(4:16|(4:18|38|19|(1:21)(1:22))|31|32)|23|34|24|31|32|(1:(1:37))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        r13.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r13 = com.zepto.hz0.a;
        r1.a(r2, r13.A(), "updateUploadFlow", r13.C(), r13.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ip1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.h;
    }

    public /* synthetic */ ip1(Application application, String str, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, str3, str4, (i2 & 32) != 0 ? 123 : i, (i2 & 64) != 0 ? "C" : str5);
    }
}
