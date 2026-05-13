package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateSelectedDLSerList;
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
public final class vi2 {
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
    public String r;
    public final oy3 s;

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
            return vi2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                vi2 vi2Var = vi2.this;
                this.c = 1;
                if (vi2Var.a(this) == coroutine_suspended) {
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
            return vi2.this.a(this);
        }
    }

    public vi2(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        Intrinsics.checkNotNullParameter(app, "app");
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
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = agentId;
        this.o = agentPwd;
        this.p = agentIpAddress;
        this.q = agentServiceName;
        this.s = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|36|12)(2:14|15))(4:16|(4:18|38|19|(1:21)(1:22))|31|32)|23|34|24|31|32|(1:(1:37))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
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
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.vi2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b() {
        String str = this.r;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decryptedString");
        return null;
    }

    public final oy3 c() {
        return this.s;
    }

    public final DuplicateDlRequest d() {
        DuplicateSelectedDLSerList duplicateSelectedDLSerList = new DuplicateSelectedDLSerList(null, 1, null);
        duplicateSelectedDLSerList.setJsonMember513("Issue of Duplicate DL");
        DuplicateDlRequest duplicateDlRequest = new DuplicateDlRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        duplicateDlRequest.setDlno(this.b);
        duplicateDlRequest.setDob(this.c);
        duplicateDlRequest.setRtoCodeDLTr(this.d);
        duplicateDlRequest.setWilltoDonateOrgans(this.g);
        duplicateDlRequest.setSelectedDLSerList(duplicateSelectedDLSerList);
        String str = this.e;
        duplicateDlRequest.setDupDlReasonCode(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
        duplicateDlRequest.setDupDlReasonName(this.f);
        duplicateDlRequest.setDlHolderAltMobMum(this.h);
        duplicateDlRequest.setMobileNumber(this.i);
        duplicateDlRequest.setAgentId(this.n);
        duplicateDlRequest.setAgentPwd(this.o);
        duplicateDlRequest.setAgentServiceName(this.q);
        duplicateDlRequest.setAgentIpAddress(this.p);
        if (Intrinsics.areEqual(this.k, "N")) {
            duplicateDlRequest.setEKYCId("NA");
            duplicateDlRequest.setEKYCGender("NA");
            duplicateDlRequest.setEKYCOpted("N");
            duplicateDlRequest.setEKYCapplicantPhoto("NA");
        } else {
            duplicateDlRequest.setEKYCId(this.j);
            duplicateDlRequest.setEKYCGender(this.l);
            duplicateDlRequest.setEKYCOpted(this.k);
            duplicateDlRequest.setEKYCapplicantPhoto(this.m);
        }
        Log.e("dl_renewal_loggingpar", duplicateDlRequest.toString());
        return duplicateDlRequest;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.r = str;
    }

    public /* synthetic */ vi2(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "sakalaHR" : str13, (i & 16384) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str14, (32768 & i) != 0 ? "10.248.213.244" : str15, (i & 65536) != 0 ? "SarathiMobileService" : str16);
    }
}
