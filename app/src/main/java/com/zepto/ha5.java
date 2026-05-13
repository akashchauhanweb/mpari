package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.ReplaceDlCoaList;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.ReplaceDlCoaReq;
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
public final class ha5 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public final oy3 J;
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
            return ha5.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ha5 ha5Var = ha5.this;
                this.c = 1;
                if (ha5Var.a(this) == coroutine_suspended) {
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
            return ha5.this.a(this);
        }
    }

    public ha5(Application app, String dlNo, String dob, String rtoCodeDLTr, String dlHolderAltMobMum, String willingToRelocate, String dupDlReasonCode, String dupDlReasonName, String applcatgDLserReq, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willingToRelocate, "willingToRelocate");
        Intrinsics.checkNotNullParameter(dupDlReasonCode, "dupDlReasonCode");
        Intrinsics.checkNotNullParameter(dupDlReasonName, "dupDlReasonName");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        this.a = app;
        this.b = dlNo;
        this.c = dob;
        this.d = rtoCodeDLTr;
        this.e = dlHolderAltMobMum;
        this.f = willingToRelocate;
        this.g = dupDlReasonCode;
        this.h = dupDlReasonName;
        this.i = applcatgDLserReq;
        this.j = changeOfAddReq;
        this.k = perHouseNo;
        this.l = perStreet;
        this.m = perLocation;
        this.n = permVillageOrTown;
        this.o = perDistrict;
        this.p = perSubDistrict;
        this.q = perState;
        this.r = perPinCode;
        this.s = presHouseNo;
        this.t = presStreet;
        this.u = presLocation;
        this.v = presVillageOrTown;
        this.w = presSubDistrict;
        this.x = presDistrict;
        this.y = presState;
        this.z = presPincode;
        this.A = mobileNumber;
        this.B = agentServiceName;
        this.C = agentIpAddress;
        this.D = agentPwd;
        this.E = agentId;
        this.F = eKYCId;
        this.G = eKYCOpted;
        this.H = eKYCGender;
        this.I = eKYCapplicantPhoto;
        this.J = new oy3();
        f80.d(zz0.a(qk1.c()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|34|12)(2:14|15))(4:16|(4:18|35|19|(1:21)(1:22))|31|32)|23|37|24|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r8.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ha5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.J;
    }

    public final ReplaceDlCoaReq c() {
        ReplaceDlCoaList replaceDlCoaList = new ReplaceDlCoaList(null, null, 3, null);
        replaceDlCoaList.setJsonMember516("REPLACEMENT OF DL");
        replaceDlCoaList.setJsonMember515("CHANGE OF ADDRESS IN DL");
        ReplaceDlCoaReq replaceDlCoaReq = new ReplaceDlCoaReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
        replaceDlCoaReq.setDlno(this.b);
        replaceDlCoaReq.setDob(this.c);
        replaceDlCoaReq.setRtoCodeDLTr(this.d);
        replaceDlCoaReq.setDlHolderAltMobMum(this.e);
        replaceDlCoaReq.setWilltoDonateOrgans(this.f);
        replaceDlCoaReq.setDupDlReasonCode(this.g);
        replaceDlCoaReq.setDupDlReasonName(this.h);
        replaceDlCoaReq.setChangeOfAddReq(this.j);
        replaceDlCoaReq.setPerHouseNo(this.k);
        replaceDlCoaReq.setPerStreet(this.l);
        replaceDlCoaReq.setPerLocation(this.m);
        replaceDlCoaReq.setPermVillageOrTown(this.n);
        replaceDlCoaReq.setPerDistrict(this.o);
        replaceDlCoaReq.setPerSubDistrict(this.p);
        replaceDlCoaReq.setPerState(this.q);
        replaceDlCoaReq.setPerPinCode(this.r);
        replaceDlCoaReq.setPresHouseNo(this.s);
        replaceDlCoaReq.setPresStreet(this.t);
        replaceDlCoaReq.setPresLocation(this.u);
        replaceDlCoaReq.setPresVillageOrTown(this.v);
        replaceDlCoaReq.setPresSubDistrict(this.w);
        replaceDlCoaReq.setPresDistrict(this.x);
        replaceDlCoaReq.setPresState(this.y);
        replaceDlCoaReq.setPresPincode(this.z);
        replaceDlCoaReq.setMobileNumber(this.A);
        replaceDlCoaReq.setAgentServiceName(this.B);
        replaceDlCoaReq.setApplcatgDLserReq(this.i);
        replaceDlCoaReq.setSelectedDLSerList(replaceDlCoaList);
        replaceDlCoaReq.setAgentPwd(this.D);
        replaceDlCoaReq.setAgentIpAddress(this.C);
        replaceDlCoaReq.setAgentId(this.E);
        replaceDlCoaReq.setAgentIpAddress(this.C);
        if (Intrinsics.areEqual(this.G, "N")) {
            replaceDlCoaReq.setEKYCId("NA");
            replaceDlCoaReq.setEKYCGender("NA");
            replaceDlCoaReq.setEKYCOpted("N");
            replaceDlCoaReq.setEKYCapplicantPhoto("NA");
        } else {
            replaceDlCoaReq.setEKYCId(this.F);
            replaceDlCoaReq.setEKYCGender(this.H);
            replaceDlCoaReq.setEKYCOpted(this.G);
            replaceDlCoaReq.setEKYCapplicantPhoto(this.I);
        }
        Log.d("request : ", replaceDlCoaReq.toString());
        return replaceDlCoaReq;
    }
}
