package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.RenewalCOAGeReqList;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.RenewalCOAGenReq;
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
public final class k85 {
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
            return k85.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                k85 k85Var = k85.this;
                this.c = 1;
                if (k85Var.a(this) == coroutine_suspended) {
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
            return k85.this.a(this);
        }
    }

    public k85(Application app, String dlno, String dob, String rtoCodeDLTr, String dlHolderAltMobMum, String willtoDonateOrgans, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String applcatgDLserReq, String eKYCId, String eKYCGender, String eKYCOpted, String eKYCapplicantPhoto) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.k85.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.G;
    }

    public final RenewalCOAGenReq c() {
        RenewalCOAGeReqList renewalCOAGeReqList = new RenewalCOAGeReqList(null, 1, null);
        renewalCOAGeReqList.setJsonMember514("RENEWAL OF DL");
        RenewalCOAGenReq renewalCOAGenReq = new RenewalCOAGenReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
        renewalCOAGenReq.setDlno(this.b);
        renewalCOAGenReq.setDob(this.c);
        renewalCOAGenReq.setRtoCodeDLTr(this.d);
        renewalCOAGenReq.setDlHolderAltMobMum(this.e);
        renewalCOAGenReq.setWilltoDonateOrgans(this.f);
        renewalCOAGenReq.setPerHouseNo(this.g);
        renewalCOAGenReq.setPerStreet(this.h);
        renewalCOAGenReq.setPerLocation(this.i);
        renewalCOAGenReq.setPermVillageOrTown(this.j);
        renewalCOAGenReq.setPerDistrict(this.k);
        renewalCOAGenReq.setPerSubDistrict(this.l);
        renewalCOAGenReq.setPerState(this.m);
        renewalCOAGenReq.setPerPinCode(this.n);
        renewalCOAGenReq.setPresHouseNo(this.o);
        renewalCOAGenReq.setPresStreet(this.p);
        renewalCOAGenReq.setPresLocation(this.q);
        renewalCOAGenReq.setPresVillageOrTown(this.r);
        renewalCOAGenReq.setPresSubDistrict(this.s);
        renewalCOAGenReq.setPresDistrict(this.t);
        renewalCOAGenReq.setPresState(this.u);
        renewalCOAGenReq.setPresPincode(this.v);
        renewalCOAGenReq.setMobileNumber(this.w);
        renewalCOAGenReq.setAgentServiceName(this.x);
        renewalCOAGenReq.setApplcatgDLserReq(this.B);
        renewalCOAGenReq.setSelectedDLSerList(renewalCOAGeReqList);
        renewalCOAGenReq.setAgentId(this.A);
        renewalCOAGenReq.setAgentIpAddress(this.y);
        renewalCOAGenReq.setAgentPwd(this.z);
        renewalCOAGenReq.setAgentServiceName(this.x);
        if (Intrinsics.areEqual(this.E, "N")) {
            renewalCOAGenReq.setEKYCId("NA");
            renewalCOAGenReq.setEKYCGender("NA");
            renewalCOAGenReq.setEKYCOpted("N");
            renewalCOAGenReq.setEKYCapplicantPhoto("NA");
        } else {
            renewalCOAGenReq.setEKYCId(this.C);
            renewalCOAGenReq.setEKYCGender(this.D);
            renewalCOAGenReq.setEKYCOpted(this.E);
            renewalCOAGenReq.setEKYCapplicantPhoto(this.F);
        }
        Log.d("request : ", renewalCOAGenReq.toString());
        return renewalCOAGenReq;
    }
}
