package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DlVillageOrTown;
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
public final class ks1 {
    public final Application a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public final oy3 j;

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
            return ks1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ks1 ks1Var = ks1.this;
                this.c = 1;
                if (ks1Var.a(this) == coroutine_suspended) {
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
            return ks1.this.a(this);
        }
    }

    public ks1(Application app, String stCode, String distCode, String subDistCode, String villageOrTown, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(stCode, "stCode");
        Intrinsics.checkNotNullParameter(distCode, "distCode");
        Intrinsics.checkNotNullParameter(subDistCode, "subDistCode");
        Intrinsics.checkNotNullParameter(villageOrTown, "villageOrTown");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        this.a = app;
        this.b = stCode;
        this.c = distCode;
        this.d = subDistCode;
        this.e = villageOrTown;
        this.f = agentId;
        this.g = agentPwd;
        this.h = agentIpAddress;
        this.i = agentServiceName;
        this.j = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|39|21|(1:23)(1:24))|37|38)|25|41|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r9.printStackTrace();
        android.util.Log.d("DecRes-", r9.getLocalizedMessage());
        r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r3 = r1.a;
        r9 = com.zepto.hz0.a;
        r2.a(r3, r9.A(), "villageOrTownMast", r9.C(), r9.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ks1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.j;
    }

    public final DlVillageOrTown c() {
        return new DlVillageOrTown(this.f, this.g, this.h, this.i, this.b, this.c, this.d, this.e);
    }

    public /* synthetic */ ks1(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, str3, str4, (i & 32) != 0 ? "DelhTrans" : str5, (i & 64) != 0 ? "d9fe1613399b0883e4ecf3f710e18317" : str6, (i & 128) != 0 ? "164.100.161.142" : str7, (i & 256) != 0 ? "sarathiservice" : str8);
    }
}
