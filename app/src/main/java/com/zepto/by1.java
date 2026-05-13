package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.DuplicateDlCoaList;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.DuplicateDlCoaReq;
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
public final class by1 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final oy3 J;
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
            return by1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                by1 by1Var = by1.this;
                this.c = 1;
                if (by1Var.a(this) == coroutine_suspended) {
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
            return by1.this.a(this);
        }
    }

    public by1(Application app, String dlNo, String dob, String lastEndorseRTOCode, String dlHolderAltMobMum, String willingToRelocate, String dupDlReasonCode, String dupDlReasonName, String applcatgDLserReq, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(lastEndorseRTOCode, "lastEndorseRTOCode");
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
        this.d = lastEndorseRTOCode;
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:31)|(1:(2:11|12)(2:14|15))(4:16|(3:18|19|(1:21)(1:22))|28|29)|23|32|24|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zepto.by1.b
            if (r0 == 0) goto L13
            r0 = r7
            com.zepto.by1$b r0 = (com.zepto.by1.b) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.zepto.by1$b r0 = new com.zepto.by1$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.c
            com.zepto.by1 r0 = (com.zepto.by1) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> Lbb
            goto L72
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r7)
            com.zepto.r44$a r7 = com.zepto.r44.a
            android.app.Application r2 = r6.a
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto Lbb
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            com.zepto.hq$a r2 = com.zepto.hq.a
            android.app.Application r4 = r6.a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.DuplicateDlCoaReq r4 = r6.c()     // Catch: java.lang.Exception -> Lbb
            r0.c = r6     // Catch: java.lang.Exception -> Lbb
            r0.e = r7     // Catch: java.lang.Exception -> Lbb
            r0.h = r3     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberRenewal(r4, r7, r0)     // Catch: java.lang.Exception -> Lbb
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r1 = r7
            r7 = r0
            r0 = r6
        L72:
            com.nic.mparivahan.Security.SecModle.SecurityModle r7 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r7     // Catch: java.lang.Exception -> Lbb
            java.lang.String r2 = "_update"
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> Lbb
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> Lbb
            com.zepto.tu5$a r2 = com.zepto.tu5.a     // Catch: java.lang.Exception -> Lb7
            java.util.Base64$Decoder r3 = java.util.Base64.getDecoder()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r7 = r7.getData()     // Catch: java.lang.Exception -> Lb7
            byte[] r7 = r3.decode(r7)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r3 = "decode(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> Lb7
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> Lb7
            r3.<init>(r7, r4)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r7 = r2.a(r1, r3)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "Duplicate_dl_resp"
            android.util.Log.d(r1, r7)     // Catch: java.lang.Exception -> Lb7
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Lb7
            r1.<init>()     // Catch: java.lang.Exception -> Lb7
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r7 = r1.fromJson(r7, r2)     // Catch: java.lang.Exception -> Lb7
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r7 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r7     // Catch: java.lang.Exception -> Lb7
            com.zepto.oy3 r0 = r0.J     // Catch: java.lang.Exception -> Lb7
            r0.k(r7)     // Catch: java.lang.Exception -> Lb7
            goto Lbb
        Lb7:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Exception -> Lbb
        Lbb:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.by1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.J;
    }

    public final DuplicateDlCoaReq c() {
        DuplicateDlCoaList duplicateDlCoaList = new DuplicateDlCoaList(null, null, 3, null);
        duplicateDlCoaList.setJsonMember513("ISSUE OF DUPLICATE DL");
        duplicateDlCoaList.setJsonMember515("CHANGE OF ADDRESS IN DL");
        DuplicateDlCoaReq duplicateDlCoaReq = new DuplicateDlCoaReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
        duplicateDlCoaReq.setDlno(this.b);
        duplicateDlCoaReq.setDob(this.c);
        duplicateDlCoaReq.setRtoCodeDLTr(this.d);
        duplicateDlCoaReq.setDlHolderAltMobMum(this.e);
        duplicateDlCoaReq.setWilltoDonateOrgans(this.f);
        duplicateDlCoaReq.setApplcatgDLserReq("G");
        duplicateDlCoaReq.setChangeOfAddReq(this.j);
        duplicateDlCoaReq.setDupDlReasonCode(this.g);
        duplicateDlCoaReq.setDupDlReasonName(this.h);
        duplicateDlCoaReq.setPerHouseNo(this.k);
        duplicateDlCoaReq.setPerStreet(this.l);
        duplicateDlCoaReq.setPerLocation(this.m);
        duplicateDlCoaReq.setPermVillageOrTown(this.n);
        duplicateDlCoaReq.setPerDistrict(this.o);
        duplicateDlCoaReq.setPerSubDistrict(this.p);
        duplicateDlCoaReq.setPerState(this.q);
        duplicateDlCoaReq.setPerPinCode(this.r);
        duplicateDlCoaReq.setPresHouseNo(this.s);
        duplicateDlCoaReq.setPresStreet(this.t);
        duplicateDlCoaReq.setPresLocation(this.u);
        duplicateDlCoaReq.setPresVillageOrTown(this.v);
        duplicateDlCoaReq.setPresSubDistrict(this.w);
        duplicateDlCoaReq.setPresDistrict(this.x);
        duplicateDlCoaReq.setPresState(this.y);
        duplicateDlCoaReq.setPresPincode(this.z);
        duplicateDlCoaReq.setMobileNumber(this.A);
        duplicateDlCoaReq.setAgentId(this.E);
        duplicateDlCoaReq.setAgentPwd(this.D);
        duplicateDlCoaReq.setAgentServiceName(this.B);
        duplicateDlCoaReq.setAgentIpAddress(this.C);
        duplicateDlCoaReq.setSelectedDLSerList(duplicateDlCoaList);
        if (Intrinsics.areEqual(this.G, "N")) {
            duplicateDlCoaReq.setEKYCId("NA");
            duplicateDlCoaReq.setEKYCGender("NA");
            duplicateDlCoaReq.setEKYCOpted("N");
            duplicateDlCoaReq.setEKYCapplicantPhoto("NA");
        } else {
            duplicateDlCoaReq.setEKYCId(this.F);
            duplicateDlCoaReq.setEKYCGender(this.H);
            duplicateDlCoaReq.setEKYCOpted(this.G);
            duplicateDlCoaReq.setEKYCapplicantPhoto(this.I);
        }
        Log.d("request : ", duplicateDlCoaReq.toString());
        return duplicateDlCoaReq;
    }
}
