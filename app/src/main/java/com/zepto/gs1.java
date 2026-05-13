package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobileRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gs1 {
    public final Application a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
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
            return gs1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                gs1 gs1Var = gs1.this;
                this.c = 1;
                if (gs1Var.a(this) == coroutine_suspended) {
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
            return gs1.this.a(this);
        }
    }

    public gs1(Application app, String p2Dob, String p3Type, String p4OldMob, boolean z, String p1DlNumber, String p5NewMob) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(p2Dob, "p2Dob");
        Intrinsics.checkNotNullParameter(p3Type, "p3Type");
        Intrinsics.checkNotNullParameter(p4OldMob, "p4OldMob");
        Intrinsics.checkNotNullParameter(p1DlNumber, "p1DlNumber");
        Intrinsics.checkNotNullParameter(p5NewMob, "p5NewMob");
        this.a = app;
        this.b = p2Dob;
        this.c = p3Type;
        this.d = p4OldMob;
        this.e = z;
        this.f = p1DlNumber;
        this.g = p5NewMob;
        this.h = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|41|21|(1:23)(1:24))|37|38)|25|39|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r8.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r8 = com.zepto.hz0.a;
        r1.a(r2, r8.A(), "updateMobileNumber", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.gs1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.h;
    }

    public final DlUpdateMobileRequest c() {
        return new DlUpdateMobileRequest(this.b, this.c, this.d, Boolean.valueOf(this.e), StringsKt__StringsKt.trim((CharSequence) this.f.toString()).toString(), this.g);
    }
}
