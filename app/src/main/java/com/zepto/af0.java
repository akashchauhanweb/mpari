package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeNameDLSerList;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest;
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
public final class af0 {
    public final oy3 A;
    public final Application a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
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
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

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
            return af0.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                af0 af0Var = af0.this;
                this.c = 1;
                if (af0Var.a(this) == coroutine_suspended) {
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
            return af0.this.a(this);
        }
    }

    public af0(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String conEffdate, String str10, String str11, String relFirstName, String relLastName, String mobileNumber, String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(conEffdate, "conEffdate");
        Intrinsics.checkNotNullParameter(relFirstName, "relFirstName");
        Intrinsics.checkNotNullParameter(relLastName, "relLastName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        this.a = app;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i;
        this.j = str8;
        this.k = str9;
        this.l = conEffdate;
        this.m = str10;
        this.n = str11;
        this.o = relFirstName;
        this.p = relLastName;
        this.q = mobileNumber;
        this.r = agentId;
        this.s = agentPwd;
        this.t = agentIpAddress;
        this.u = agentServiceName;
        this.v = eKYCId;
        this.w = eKYCOpted;
        this.x = eKYCGender;
        this.y = eKYCPhoto;
        this.A = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|41|21|(1:23)(1:24))|37|38)|25|39|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        r9.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r9 = com.zepto.hz0.a;
        r1.a(r2, r9.A(), "getAckDetForGivenDLNumber", r9.C(), r9.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.af0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b() {
        String str = this.z;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decryptedString");
        return null;
    }

    public final oy3 c() {
        return this.A;
    }

    public final ChangeOfNameRequest d() {
        ChangeNameDLSerList changeNameDLSerList = new ChangeNameDLSerList(null, 1, null);
        changeNameDLSerList.setJsonMember526("Change Of Name in DL");
        ChangeOfNameRequest changeOfNameRequest = new ChangeOfNameRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        changeOfNameRequest.setApplcatgDLserReq(this.b);
        changeOfNameRequest.setDlHolderAltMobMum(this.c);
        changeOfNameRequest.setDlno(this.d);
        changeOfNameRequest.setDob(this.e);
        changeOfNameRequest.setRtoCodeDLTr(this.f);
        changeOfNameRequest.setWilltoDonateOrgans(this.g);
        changeOfNameRequest.setRelationType(this.h);
        changeOfNameRequest.setConDlReasonCode(Integer.valueOf(this.i));
        changeOfNameRequest.setConDlReasonName(this.j);
        changeOfNameRequest.setDlHolderNaturalName(this.k);
        changeOfNameRequest.setConEffdate(this.l);
        changeOfNameRequest.setApplFirstName(this.m);
        changeOfNameRequest.setApplLastName(this.n);
        changeOfNameRequest.setRelFirstName(this.o);
        changeOfNameRequest.setRelLastName(this.p);
        changeOfNameRequest.setMobileNumber(this.q);
        changeOfNameRequest.setAgentId("mobSARATHI");
        changeOfNameRequest.setAgentIpAddress("657d1c758e2e95af0014e16f5109f933");
        changeOfNameRequest.setAgentPwd("10.248.210.8");
        changeOfNameRequest.setAgentServiceName("sarathiservice");
        if (Intrinsics.areEqual(this.w, "N")) {
            changeOfNameRequest.setEKYCId("NA");
            changeOfNameRequest.setEKYCGender("NA");
            changeOfNameRequest.setEKYCOpted("N");
            changeOfNameRequest.setEKYCapplicantPhoto("NA");
        } else {
            changeOfNameRequest.setEKYCId(this.v);
            changeOfNameRequest.setEKYCGender(this.x);
            changeOfNameRequest.setEKYCOpted(this.w);
            changeOfNameRequest.setEKYCapplicantPhoto(this.y);
        }
        changeOfNameRequest.setSelectedDLSerList(changeNameDLSerList);
        Log.d("_adhr", changeOfNameRequest.toString());
        return changeOfNameRequest;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.z = str;
    }
}
