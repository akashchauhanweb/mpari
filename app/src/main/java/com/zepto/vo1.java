package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSerList;
import com.nic.mparivahan.dlservices.data.model.DlRequestForSaveRequest;
import java.util.Map;
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
public final class vo1 {
    public Application a;
    public String b;
    public String c;
    public String d;
    public Map e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public final oy3 l;

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
            return vo1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                vo1 vo1Var = vo1.this;
                this.c = 1;
                if (vo1Var.a(this) == coroutine_suspended) {
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
            return vo1.this.a(this);
        }
    }

    public vo1(Application mApp, String dlNumber, String dob, String rtoCode, Map map, String applcatgDLserReq, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        this.a = mApp;
        this.b = dlNumber;
        this.c = dob;
        this.d = rtoCode;
        this.e = map;
        this.f = applcatgDLserReq;
        this.g = mobileNumber;
        this.h = eKYCId;
        this.i = eKYCOpted;
        this.j = eKYCGender;
        this.k = eKYCPhoto;
        this.l = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|39|21|(1:23)(1:24))|37|38)|25|41|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r9.printStackTrace();
        android.util.Log.d("DecRes-", r9.getLocalizedMessage());
        r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r3 = r0.a;
        r9 = com.zepto.hz0.a;
        r2.a(r3, r9.A(), "getAckDetForGivenDLNumber", r9.C(), r9.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.vo1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.l;
    }

    public final DlRequestForSaveRequest c() {
        DlRenewalSerList dlRenewalSerList = new DlRenewalSerList(null, 1, null);
        dlRenewalSerList.setJsonMember514("Renewal of DL");
        DlRequestForSaveRequest dlRequestForSaveRequest = new DlRequestForSaveRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        dlRequestForSaveRequest.setRtoCodeDLTr(this.d);
        dlRequestForSaveRequest.setDlno(this.b);
        dlRequestForSaveRequest.setDob(this.c);
        dlRequestForSaveRequest.setApplcatgDLserReq(this.f);
        dlRequestForSaveRequest.setMobileNumber(this.g);
        dlRequestForSaveRequest.setMDlRenewalSerList(dlRenewalSerList);
        dlRequestForSaveRequest.setAgentId("DelhTrans");
        dlRequestForSaveRequest.setAgentPwd("d9fe1613399b0883e4ecf3f710e18317");
        dlRequestForSaveRequest.setAgentServiceName("sarathiservice");
        dlRequestForSaveRequest.setAgentIpAddress("0.0.0.0");
        if (Intrinsics.areEqual(this.i, "N")) {
            dlRequestForSaveRequest.setEKYCId("NA");
            dlRequestForSaveRequest.setEKYCGender("NA");
            dlRequestForSaveRequest.setEKYCOpted("N");
            dlRequestForSaveRequest.setEKYCapplicantPhoto("NA");
        } else {
            dlRequestForSaveRequest.setEKYCId(this.h);
            dlRequestForSaveRequest.setEKYCGender(this.j);
            dlRequestForSaveRequest.setEKYCOpted(this.i);
            dlRequestForSaveRequest.setEKYCapplicantPhoto(this.k);
        }
        Log.e("dl_renewal_loggingpar", dlRequestForSaveRequest.toString());
        return dlRequestForSaveRequest;
    }
}
