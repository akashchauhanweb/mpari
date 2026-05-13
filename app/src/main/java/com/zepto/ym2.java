package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillSelectedList;
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
public final class ym2 {
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
    public final oy3 y;

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
            return ym2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ym2 ym2Var = ym2.this;
                this.c = 1;
                if (ym2Var.a(this) == coroutine_suspended) {
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
            return ym2.this.a(this);
        }
    }

    public ym2(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(app, "app");
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
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = str14;
        this.p = str15;
        this.q = str16;
        this.r = str17;
        this.s = str18;
        this.t = eKYCId;
        this.u = eKYCOpted;
        this.v = eKYCGender;
        this.w = eKYCPhoto;
        this.y = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|41|21|(1:23)(1:24))|37|38)|25|39|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        r8.printStackTrace();
        r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r2 = r0.a;
        r8 = com.zepto.hz0.a;
        r1.a(r2, r8.A(), "getAckDetForGivenDLNumber", r8.C(), r8.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ym2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String b() {
        String str = this.x;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decryptedString");
        return null;
    }

    public final oy3 c() {
        return this.y;
    }

    public final HillRequest d() {
        HillSelectedList hillSelectedList = new HillSelectedList(null, 1, null);
        hillSelectedList.setJsonMember513("ENDORSEMENT TO DRIVE IN HILL REGION");
        HillRequest hillRequest = new HillRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
        hillRequest.setDlno(this.b);
        hillRequest.setDob(this.c);
        hillRequest.setRtoCodeDLTr(this.d);
        hillRequest.setApplcatgDLserReq(this.e);
        hillRequest.setDlHolderAltMobMum(this.f);
        hillRequest.setWilltoDonateOrgans(this.g);
        hillRequest.setMobileNumber(this.h);
        hillRequest.setDeclaringcheck(this.i);
        hillRequest.setHillcertificate(this.j);
        hillRequest.setHillissueDate(this.k);
        hillRequest.setHillvalidFrom(this.l);
        hillRequest.setHillvalidTo(this.m);
        hillRequest.setHilldrivingschool(this.n);
        hillRequest.setHillissby(this.o);
        hillRequest.setAgentId(this.p);
        hillRequest.setAgentIpAddress(this.q);
        hillRequest.setAgentPwd(this.r);
        hillRequest.setAgentServiceName(this.s);
        hillRequest.setSelectedDLSerList(hillSelectedList);
        if (Intrinsics.areEqual(this.u, "N")) {
            hillRequest.setEKYCId("NA");
            hillRequest.setEKYCGender("NA");
            hillRequest.setEKYCOpted("N");
            hillRequest.setEKYCapplicantPhoto("NA");
        } else {
            hillRequest.setEKYCId(this.t);
            hillRequest.setEKYCGender(this.v);
            hillRequest.setEKYCOpted(this.u);
            hillRequest.setEKYCapplicantPhoto(this.w);
        }
        Log.e("dl_renewal_loggingpar", hillRequest.toString());
        return hillRequest;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.x = str;
    }
}
