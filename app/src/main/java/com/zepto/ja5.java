package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.ReplaceDlGenReqList;
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
public final class ja5 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final oy3 I;
    public final Application a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

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
            return ja5.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ja5 ja5Var = ja5.this;
                this.c = 1;
                if (ja5Var.a(this) == coroutine_suspended) {
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
            return ja5.this.a(this);
        }
    }

    public ja5(Application app, String dlNo, String dob, String lastEndorseRTOCode, String alterMob, String willingToRelocate, String dupDlReasonCode, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String applcatgDLserReq, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(lastEndorseRTOCode, "lastEndorseRTOCode");
        Intrinsics.checkNotNullParameter(alterMob, "alterMob");
        Intrinsics.checkNotNullParameter(willingToRelocate, "willingToRelocate");
        Intrinsics.checkNotNullParameter(dupDlReasonCode, "dupDlReasonCode");
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
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
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
        this.d = lastEndorseRTOCode;
        this.e = alterMob;
        this.f = willingToRelocate;
        this.g = dupDlReasonCode;
        this.h = changeOfAddReq;
        this.i = perHouseNo;
        this.j = perStreet;
        this.k = perLocation;
        this.l = permVillageOrTown;
        this.m = perDistrict;
        this.n = perSubDistrict;
        this.o = perState;
        this.p = perPinCode;
        this.q = presHouseNo;
        this.r = presStreet;
        this.s = presLocation;
        this.t = presVillageOrTown;
        this.u = presSubDistrict;
        this.v = presDistrict;
        this.w = presState;
        this.x = presPincode;
        this.y = mobileNumber;
        this.z = applcatgDLserReq;
        this.A = agentServiceName;
        this.B = agentIpAddress;
        this.C = agentPwd;
        this.D = agentId;
        this.E = eKYCId;
        this.F = eKYCOpted;
        this.G = eKYCGender;
        this.H = eKYCapplicantPhoto;
        this.I = new oy3();
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
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ja5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.I;
    }

    public final ia5 c() {
        ReplaceDlGenReqList replaceDlGenReqList = new ReplaceDlGenReqList(null, 1, null);
        replaceDlGenReqList.setJsonMember516("REPLACEMENT OF DL");
        ia5 ia5Var = new ia5(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
        ia5Var.h(this.b);
        ia5Var.i(this.c);
        ia5Var.F(this.d);
        ia5Var.g(this.e);
        ia5Var.H(this.f);
        ia5Var.j(this.g);
        ia5Var.f(this.h);
        ia5Var.q(this.i);
        ia5Var.u(this.j);
        ia5Var.r(this.k);
        ia5Var.w(this.l);
        ia5Var.p(this.m);
        ia5Var.v(this.n);
        ia5Var.t(this.o);
        ia5Var.s(this.p);
        ia5Var.y(this.q);
        ia5Var.C(this.r);
        ia5Var.z(this.s);
        ia5Var.E(this.t);
        ia5Var.D(this.u);
        ia5Var.x(this.v);
        ia5Var.B(this.w);
        ia5Var.A(this.x);
        ia5Var.o(this.y);
        ia5Var.d(this.A);
        ia5Var.e(this.z);
        ia5Var.G(replaceDlGenReqList);
        ia5Var.c(this.C);
        ia5Var.b(this.B);
        ia5Var.a(this.D);
        ia5Var.b(this.B);
        if (Intrinsics.areEqual(this.F, "N")) {
            ia5Var.l("NA");
            ia5Var.k("NA");
            ia5Var.m("N");
            ia5Var.n("NA");
        } else {
            ia5Var.l(this.E);
            ia5Var.k(this.G);
            ia5Var.m(this.F);
            ia5Var.n(this.H);
        }
        Log.d("request : ", ia5Var.toString());
        return ia5Var;
    }
}
