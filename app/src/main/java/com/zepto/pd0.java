package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest;
import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeOfDobSelectedServiceList;
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
public final class pd0 {
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
    public String s;
    public String t;
    public final oy3 u;

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
            return pd0.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                pd0 pd0Var = pd0.this;
                this.c = 1;
                if (pd0Var.a(this) == coroutine_suspended) {
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
            return pd0.this.a(this);
        }
    }

    public pd0(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
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
        this.n = str13;
        this.o = str14;
        this.p = agentId;
        this.q = agentPwd;
        this.r = agentIpAddress;
        this.s = agentServiceName;
        this.u = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|41|12)(2:16|17))(4:18|(4:20|39|21|(1:23)(1:24))|37|38)|25|42|26|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r11.printStackTrace();
        android.util.Log.d("DuplicateDlRespErr", r0.b());
        r4 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r5 = r0.a;
        r11 = com.zepto.hz0.a;
        r4.a(r5, r11.A(), "getAckDetForGivenDLNumber", r11.C(), r11.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.pd0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b() {
        String str = this.t;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decryptedString");
        return null;
    }

    public final oy3 c() {
        return this.u;
    }

    public final ChangeDobRequest d() {
        ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList = new ChangeOfDobSelectedServiceList(null, 1, null);
        changeOfDobSelectedServiceList.setJsonMember513("CHANGE OF DATE OF BIRTH IN DL");
        ChangeDobRequest changeDobRequest = new ChangeDobRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        changeDobRequest.setDlno(this.b);
        changeDobRequest.setDob(this.c);
        changeDobRequest.setRtoCodeDLTr(this.d);
        changeDobRequest.setWilltoDonateOrgans(this.e);
        changeDobRequest.setSelectedDLSerList(changeOfDobSelectedServiceList);
        changeDobRequest.setApplcatgDLserReq(this.h);
        changeDobRequest.setApplDateOfBirth(this.i);
        changeDobRequest.setCodobDlReasonName(this.j);
        changeDobRequest.setCodobDlReasonCode(this.k);
        changeDobRequest.setDlHolderAltMobMum(this.f);
        changeDobRequest.setMobileNumber(this.g);
        changeDobRequest.setAgentId(this.p);
        changeDobRequest.setAgentPwd(this.q);
        changeDobRequest.setAgentServiceName(this.s);
        changeDobRequest.setAgentIpAddress(this.r);
        if (Intrinsics.areEqual(this.m, "N")) {
            changeDobRequest.setEKYCId("NA");
            changeDobRequest.setEKYCGender("NA");
            changeDobRequest.setEKYCOpted("N");
            changeDobRequest.setEKYCapplicantPhoto("NA");
        } else {
            changeDobRequest.setEKYCId(this.l);
            changeDobRequest.setEKYCGender(this.n);
            changeDobRequest.setEKYCOpted(this.m);
            changeDobRequest.setEKYCapplicantPhoto(this.o);
        }
        Log.e("dl_renewal_loggingpar", changeDobRequest.toString());
        return changeDobRequest;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.t = str;
    }

    public /* synthetic */ pd0(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, (i & 32768) != 0 ? "sakalaHR" : str15, (i & 65536) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str16, (i & 131072) != 0 ? "10.248.213.244" : str17, (i & 262144) != 0 ? "SarathiMobileService" : str18);
    }
}
