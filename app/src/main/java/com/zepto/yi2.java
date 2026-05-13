package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementSelectedDLSerList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yi2 {
    public final Application a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public final oy3 r;

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
            return yi2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                yi2 yi2Var = yi2.this;
                this.c = 1;
                if (yi2Var.a(this) == coroutine_suspended) {
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
            return yi2.this.a(this);
        }
    }

    public yi2(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        this.a = app;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = eKYCId;
        this.k = eKYCOpted;
        this.l = eKYCGender;
        this.m = eKYCPhoto;
        this.n = agentId;
        this.o = agentPwd;
        this.p = agentIpAddress;
        this.q = agentServiceName;
        this.r = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|41|21|(1:23)(1:24))|37|38)|25|39|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        r8.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r8 = com.zepto.hz0.a;
        r1.a(r2, r8.A(), "getAckDetForGivenDLNumber", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.yi2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.r;
    }

    public final ReplacementDlRequest c() {
        ReplacementSelectedDLSerList replacementSelectedDLSerList = new ReplacementSelectedDLSerList(null, 1, null);
        replacementSelectedDLSerList.setJsonMember516("Replacement of DL");
        ReplacementDlRequest replacementDlRequest = new ReplacementDlRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        replacementDlRequest.setDlno(this.b);
        replacementDlRequest.setDob(this.c);
        replacementDlRequest.setRtoCodeDLTr(this.d);
        replacementDlRequest.setWilltoDonateOrgans(this.g);
        replacementDlRequest.setSelectedDLSerList(replacementSelectedDLSerList);
        String str = this.e;
        replacementDlRequest.setDupDlReasonCode(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
        replacementDlRequest.setDupDlReasonName(this.f);
        replacementDlRequest.setDlHolderAltMobMum(this.h);
        replacementDlRequest.setMobileNumber(this.i);
        if (Intrinsics.areEqual(this.k, "N")) {
            replacementDlRequest.setEKYCId("NA");
            replacementDlRequest.setEKYCGender("NA");
            replacementDlRequest.setEKYCOpted("N");
            replacementDlRequest.setEKYCapplicantPhoto("NA");
        } else {
            replacementDlRequest.setEKYCId(this.j);
            replacementDlRequest.setEKYCGender(this.l);
            replacementDlRequest.setEKYCOpted(this.k);
            replacementDlRequest.setEKYCapplicantPhoto(this.m);
        }
        replacementDlRequest.setAgentId(this.n);
        replacementDlRequest.setAgentPwd(this.o);
        replacementDlRequest.setAgentIpAddress(this.p);
        replacementDlRequest.setAgentServiceName(this.q);
        Log.e("dl_renewal_loggingpar", replacementDlRequest.toString());
        return replacementDlRequest;
    }

    public /* synthetic */ yi2(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "sakalaHR" : str13, (i & 16384) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str14, (32768 & i) != 0 ? "10.248.213.244" : str15, (i & 65536) != 0 ? "SarathiMobileService" : str16);
    }
}
