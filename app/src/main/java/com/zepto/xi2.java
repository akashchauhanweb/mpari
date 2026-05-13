package com.zepto;

import android.app.Application;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
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
public final class xi2 {
    public final Application a;
    public final IdpSubmitRequest b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final oy3 g;

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
            return xi2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                xi2 xi2Var = xi2.this;
                this.c = 1;
                if (xi2Var.a(this) == coroutine_suspended) {
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
            return xi2.this.a(this);
        }
    }

    public xi2(Application app, IdpSubmitRequest reqObj, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        this.a = app;
        this.b = reqObj;
        this.c = agentId;
        this.d = agentPwd;
        this.e = agentIpAddress;
        this.f = agentServiceName;
        this.g = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|36|12)(2:14|15))(4:16|(4:18|38|19|(1:21)(1:22))|31|32)|23|34|24|31|32|(1:(1:37))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r8.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r8 = com.zepto.hz0.a;
        r1.a(r2, r8.A(), "getAckDetForGivenDLNumber", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xi2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.g;
    }

    public final String c() {
        String json = new Gson().toJson(this.b);
        Log.e("dl_renewal_loggingpar", this.b.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }

    public /* synthetic */ xi2(Application application, IdpSubmitRequest idpSubmitRequest, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, idpSubmitRequest, (i & 4) != 0 ? "sakalaHR" : str, (i & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i & 16) != 0 ? "10.248.213.244" : str3, (i & 32) != 0 ? "SarathiMobileService" : str4);
    }
}
