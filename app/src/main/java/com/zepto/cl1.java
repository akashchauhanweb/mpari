package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.ui.coa.NewService.COASerList;
import com.nic.mparivahan.dlservices.ui.coa.NewService.COAUtils;
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
public final class cl1 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public final oy3 F;
    public Application a;
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
            return cl1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cl1 cl1Var = cl1.this;
                this.c = 1;
                if (cl1Var.c(this) == coroutine_suspended) {
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
            return cl1.this.c(this);
        }
    }

    public cl1(Application mApp, String dlno, String dob, String rtoCodeDLTr, String applcatgDLserReq, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String agentId, String agentIpAddress, String agentPwd, String agentServiceName, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(mApp, "mApp");
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
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
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        this.a = mApp;
        this.b = dlno;
        this.c = dob;
        this.d = rtoCodeDLTr;
        this.e = applcatgDLserReq;
        this.f = changeOfAddReq;
        this.g = perHouseNo;
        this.h = perStreet;
        this.i = perLocation;
        this.j = permVillageOrTown;
        this.k = perSubDistrict;
        this.l = perDistrict;
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
        this.w = agentId;
        this.x = agentIpAddress;
        this.y = agentPwd;
        this.z = agentServiceName;
        this.A = mobileNumber;
        this.B = eKYCId;
        this.C = eKYCOpted;
        this.D = eKYCGender;
        this.E = eKYCPhoto;
        this.F = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    public final oy3 a() {
        return this.F;
    }

    public final COAUtils b() {
        COASerList cOASerList = new COASerList(null, 1, null);
        cOASerList.setJsonMember515("Change of Address in DL");
        COAUtils cOAUtils = new COAUtils(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, IntCompanionObject.MAX_VALUE, null);
        cOAUtils.setDlno(this.b);
        cOAUtils.setDob(this.c);
        cOAUtils.setRtoCodeDLTr(this.d);
        cOAUtils.setApplcatgDLserReq(this.e);
        cOAUtils.setChangeOfAddReq(this.f);
        cOAUtils.setPerHouseNo(this.g);
        cOAUtils.setPerStreet(this.h);
        cOAUtils.setPerLocation(this.i);
        cOAUtils.setPermVillageOrTown(this.j);
        cOAUtils.setPerSubDistrict(this.k);
        cOAUtils.setPerDistrict(this.l);
        cOAUtils.setPerState(this.m);
        cOAUtils.setPerPinCode(this.n);
        cOAUtils.setPresHouseNo(this.o);
        cOAUtils.setPresStreet(this.p);
        cOAUtils.setPresLocation(this.q);
        cOAUtils.setPresVillageOrTown(this.r);
        cOAUtils.setPresSubDistrict(this.s);
        cOAUtils.setPresDistrict(this.t);
        cOAUtils.setPresState(this.u);
        cOAUtils.setPresPincode(this.v);
        cOAUtils.setAgentId(this.w);
        cOAUtils.setAgentIpAddress(this.x);
        cOAUtils.setAgentPwd(this.y);
        cOAUtils.setAgentServiceName(this.z);
        cOAUtils.setMobileNumber(this.A);
        cOAUtils.setSelectedDLSerList(cOASerList);
        if (Intrinsics.areEqual(this.C, "N")) {
            cOAUtils.setEKYCId("NA");
            cOAUtils.setEKYCGender("NA");
            cOAUtils.setEKYCOpted("N");
            cOAUtils.setEKYCapplicantPhoto("NA");
        } else {
            cOAUtils.setEKYCId(this.B);
            cOAUtils.setEKYCGender(this.D);
            cOAUtils.setEKYCOpted(this.C);
            cOAUtils.setEKYCapplicantPhoto(this.E);
        }
        Log.d("Coa Request", cOAUtils.toString());
        return cOAUtils;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.cl1.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
