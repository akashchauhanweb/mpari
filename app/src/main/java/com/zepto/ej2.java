package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatus;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ej2 {
    public Application a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public final oy3 f;
    public final int g;

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
            return ej2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (ej2.this.e) {
                    ej2 ej2Var = ej2.this;
                    String str = ej2Var.c;
                    String str2 = ej2.this.d;
                    this.c = 1;
                    if (ej2Var.d(str, str2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ej2 ej2Var2 = ej2.this;
                    this.c = 2;
                    if (ej2Var2.e(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
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
            return ej2.this.d(null, null, this);
        }
    }

    public static final class c extends ContinuationImpl {
        public Object c;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return ej2.this.e(this);
        }
    }

    public ej2(Application mApp, String mApplNo) {
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(mApplNo, "mApplNo");
        this.a = mApp;
        this.b = mApplNo;
        this.c = "";
        this.d = "";
        this.f = new oy3();
        this.g = st6.p(9999.0d, 99999.0d);
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|36|12)(2:14|15))(4:16|(4:18|34|19|(1:21)(1:22))|31|32)|23|37|24|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r8.printStackTrace();
        r0 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r1 = r9.a;
        r8 = com.zepto.hz0.a;
        r0.a(r1, r8.A(), "getDetails", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ej2.d(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|38|12)(2:14|15))(4:16|(4:18|34|19|(1:21)(1:22))|31|32)|23|36|24|31|32|(1:(1:39))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r10.printStackTrace();
        r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r3 = r1.a;
        r10 = com.zepto.hz0.a;
        r2.a(r3, r10.A(), "getImage", r10.C(), r10.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ej2.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 f() {
        return this.f;
    }

    public final DlPhotoStatusFinalReqeust g(String mApplDob, String mApplRtoCd) {
        Intrinsics.checkNotNullParameter(mApplDob, "mApplDob");
        Intrinsics.checkNotNullParameter(mApplRtoCd, "mApplRtoCd");
        String strH = st6.h((this.e ? new DlPhotoStatus(this.b, mApplDob, mApplRtoCd) : new DlPhotoStatus(this.b)).toString(), h());
        String strI = st6.i(this.g);
        if (strH == null) {
            strH = "";
        }
        if (strI == null) {
            strI = "";
        }
        return new DlPhotoStatusFinalReqeust(strH, strI);
    }

    public final String h() {
        return st6.l(this.g);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ej2(Application mApp, String mApplNo, String mApplDob, String mApplRtoCd) {
        this(mApp, mApplNo);
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(mApplNo, "mApplNo");
        Intrinsics.checkNotNullParameter(mApplDob, "mApplDob");
        Intrinsics.checkNotNullParameter(mApplRtoCd, "mApplRtoCd");
        this.c = mApplDob;
        this.d = mApplRtoCd;
        this.e = true;
    }
}
