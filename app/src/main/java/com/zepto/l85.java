package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.RenewalCOAReq;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.RenewalCOAReqList;
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
public final class l85 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public final oy3 G;
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
            return l85.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                l85 l85Var = l85.this;
                this.c = 1;
                if (l85Var.a(this) == coroutine_suspended) {
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
            return l85.this.a(this);
        }
    }

    public l85(Application app, String dlno, String dob, String rtoCodeDLTr, String dlHolderAltMobMum, String willtoDonateOrgans, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String applcatgDLserReq, String eKYCId, String eKYCGender, String eKYCOpted, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
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
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        this.a = app;
        this.b = dlno;
        this.c = dob;
        this.d = rtoCodeDLTr;
        this.e = dlHolderAltMobMum;
        this.f = willtoDonateOrgans;
        this.g = perHouseNo;
        this.h = perStreet;
        this.i = perLocation;
        this.j = permVillageOrTown;
        this.k = perDistrict;
        this.l = perSubDistrict;
        this.m = perState;
        this.n = perPinCode;
        this.o = presHouseNo;
        this.p = presStreet;
        this.q = presLocation;
        this.r = presVillageOrTown;
        this.s = presSubDistrict;
        this.t = presDistrict;
        this.u = presState;
        this.v = presPincode;
        this.w = mobileNumber;
        this.x = agentServiceName;
        this.y = agentIpAddress;
        this.z = agentPwd;
        this.A = agentId;
        this.B = applcatgDLserReq;
        this.C = eKYCId;
        this.D = eKYCGender;
        this.E = eKYCOpted;
        this.F = eKYCapplicantPhoto;
        this.G = new oy3();
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
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.l85.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.G;
    }

    public final RenewalCOAReq c() {
        RenewalCOAReqList renewalCOAReqList = new RenewalCOAReqList(null, null, 3, null);
        renewalCOAReqList.setJsonMember514("RENEWAL OF DL");
        renewalCOAReqList.setJsonMember515("CHANGE OF ADDRESS IN DL");
        RenewalCOAReq renewalCOAReq = new RenewalCOAReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
        renewalCOAReq.setDlno(this.b);
        renewalCOAReq.setDob(this.c);
        renewalCOAReq.setRtoCodeDLTr(this.d);
        renewalCOAReq.setDlHolderAltMobMum(this.e);
        renewalCOAReq.setWilltoDonateOrgans(this.f);
        renewalCOAReq.setPerHouseNo(this.g);
        renewalCOAReq.setPerStreet(this.h);
        renewalCOAReq.setPerLocation(this.i);
        renewalCOAReq.setPermVillageOrTown(this.j);
        renewalCOAReq.setPerDistrict(this.k);
        renewalCOAReq.setPerSubDistrict(this.l);
        renewalCOAReq.setPerState(this.m);
        renewalCOAReq.setPerPinCode(this.n);
        renewalCOAReq.setPresHouseNo(this.o);
        renewalCOAReq.setPresStreet(this.p);
        renewalCOAReq.setPresLocation(this.q);
        renewalCOAReq.setPresVillageOrTown(this.r);
        renewalCOAReq.setPresSubDistrict(this.s);
        renewalCOAReq.setPresDistrict(this.t);
        renewalCOAReq.setPresState(this.u);
        renewalCOAReq.setPresPincode(this.v);
        renewalCOAReq.setMobileNumber(this.w);
        renewalCOAReq.setAgentServiceName(this.x);
        renewalCOAReq.setAgentIpAddress(this.y);
        renewalCOAReq.setSelectedDLSerList(renewalCOAReqList);
        renewalCOAReq.setAgentPwd(this.z);
        renewalCOAReq.setAgentIpAddress(this.y);
        renewalCOAReq.setAgentId(this.A);
        renewalCOAReq.setApplcatgDLserReq(this.B);
        if (Intrinsics.areEqual(this.E, "N")) {
            renewalCOAReq.setEKYCId("NA");
            renewalCOAReq.setEKYCGender("NA");
            renewalCOAReq.setEKYCOpted("N");
            renewalCOAReq.setEKYCapplicantPhoto("NA");
        } else {
            renewalCOAReq.setEKYCId(this.C);
            renewalCOAReq.setEKYCGender(this.D);
            renewalCOAReq.setEKYCOpted(this.E);
            renewalCOAReq.setEKYCapplicantPhoto(this.F);
        }
        Log.d("request : ", renewalCOAReq.toString());
        return renewalCOAReq;
    }
}
