package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.DuplicateDlGenRepoList;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.DuplicateDlGenReq;
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
public final class cy1 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public final oy3 I;
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
            return cy1.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cy1 cy1Var = cy1.this;
                this.c = 1;
                if (cy1Var.a(this) == coroutine_suspended) {
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
            return cy1.this.a(this);
        }
    }

    public cy1(Application app, String dlNo, String dob, String lastEndorseRTOCode, String dlHolderAltMobMum, String willingToRelocate, String dupDlReasonCode, String dupDlReasonName, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCapplicantPhoto, String applcatgDLserReq) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(lastEndorseRTOCode, "lastEndorseRTOCode");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willingToRelocate, "willingToRelocate");
        Intrinsics.checkNotNullParameter(dupDlReasonCode, "dupDlReasonCode");
        Intrinsics.checkNotNullParameter(dupDlReasonName, "dupDlReasonName");
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
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        this.a = app;
        this.b = dlNo;
        this.c = dob;
        this.d = lastEndorseRTOCode;
        this.e = dlHolderAltMobMum;
        this.f = willingToRelocate;
        this.g = dupDlReasonCode;
        this.h = dupDlReasonName;
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
        this.z = agentServiceName;
        this.A = agentIpAddress;
        this.B = agentPwd;
        this.C = agentId;
        this.D = eKYCId;
        this.E = eKYCOpted;
        this.F = eKYCGender;
        this.G = eKYCapplicantPhoto;
        this.H = applcatgDLserReq;
        this.I = new oy3();
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
            boolean r0 = r7 instanceof com.zepto.cy1.b
            if (r0 == 0) goto L13
            r0 = r7
            com.zepto.cy1$b r0 = (com.zepto.cy1.b) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.zepto.cy1$b r0 = new com.zepto.cy1$b
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
            com.zepto.cy1 r0 = (com.zepto.cy1) r0
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
            com.nic.mparivahan.dlservices.data.RenewalServicesFiles.DuplicateDlGenReq r4 = r6.c()     // Catch: java.lang.Exception -> Lbb
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
            com.zepto.oy3 r0 = r0.I     // Catch: java.lang.Exception -> Lb7
            r0.k(r7)     // Catch: java.lang.Exception -> Lb7
            goto Lbb
        Lb7:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Exception -> Lbb
        Lbb:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.cy1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.I;
    }

    public final DuplicateDlGenReq c() {
        DuplicateDlGenRepoList duplicateDlGenRepoList = new DuplicateDlGenRepoList(null, 1, null);
        duplicateDlGenRepoList.setJsonMember513("ISSUE OF DUPLICATE DL");
        DuplicateDlGenReq duplicateDlGenReq = new DuplicateDlGenReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
        duplicateDlGenReq.setDlno(this.b);
        duplicateDlGenReq.setDob(this.c);
        duplicateDlGenReq.setRtoCodeDLTr(this.d);
        duplicateDlGenReq.setDlHolderAltMobMum(this.e);
        duplicateDlGenReq.setWilltoDonateOrgans(this.f);
        duplicateDlGenReq.setApplcatgDLserReq("G");
        duplicateDlGenReq.setDupDlReasonName(this.h);
        duplicateDlGenReq.setDupDlReasonCode(this.g);
        duplicateDlGenReq.setPerHouseNo(this.i);
        duplicateDlGenReq.setPerStreet(this.j);
        duplicateDlGenReq.setPerLocation(this.k);
        duplicateDlGenReq.setPermVillageOrTown(this.l);
        duplicateDlGenReq.setPerDistrict(this.m);
        duplicateDlGenReq.setPerSubDistrict(this.n);
        duplicateDlGenReq.setPerState(this.o);
        duplicateDlGenReq.setPerPinCode(this.p);
        duplicateDlGenReq.setPresHouseNo(this.q);
        duplicateDlGenReq.setPresStreet(this.r);
        duplicateDlGenReq.setPresLocation(this.s);
        duplicateDlGenReq.setPresVillageOrTown(this.t);
        duplicateDlGenReq.setPresSubDistrict(this.u);
        duplicateDlGenReq.setPresDistrict(this.v);
        duplicateDlGenReq.setPresState(this.w);
        duplicateDlGenReq.setPresPincode(this.x);
        duplicateDlGenReq.setMobileNumber(this.y);
        duplicateDlGenReq.setAgentPwd(this.B);
        duplicateDlGenReq.setAgentIpAddress(this.A);
        duplicateDlGenReq.setAgentId(this.C);
        duplicateDlGenReq.setAgentServiceName(this.z);
        duplicateDlGenReq.setSelectedDLSerList(duplicateDlGenRepoList);
        if (Intrinsics.areEqual(this.E, "N")) {
            duplicateDlGenReq.setEKYCId("NA");
            duplicateDlGenReq.setEKYCGender("NA");
            duplicateDlGenReq.setEKYCOpted("N");
            duplicateDlGenReq.setEKYCapplicantPhoto("NA");
        } else {
            duplicateDlGenReq.setEKYCId(this.D);
            duplicateDlGenReq.setEKYCGender(this.F);
            duplicateDlGenReq.setEKYCOpted(this.E);
            duplicateDlGenReq.setEKYCapplicantPhoto(this.G);
        }
        Log.d("request : ", duplicateDlGenReq.toString());
        return duplicateDlGenReq;
    }
}
