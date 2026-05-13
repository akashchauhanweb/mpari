package com.zepto;

import android.app.Application;
import android.util.Log;
import com.nic.mparivahan.dlservices.ui.dlextract.DlExRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.SelectedDLList;
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
public final class zi2 {
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
    public final oy3 n;

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
            return zi2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zi2 zi2Var = zi2.this;
                this.c = 1;
                if (zi2Var.a(this) == coroutine_suspended) {
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
            return zi2.this.a(this);
        }
    }

    public zi2(Application app, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
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
        this.j = eKYCId;
        this.k = eKYCOpted;
        this.l = eKYCGender;
        this.m = eKYCPhoto;
        this.n = new oy3();
        f80.d(zz0.a(qk1.b()), null, null, new a(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|43|12)(2:16|17))(4:18|(4:20|39|21|(1:23)(1:24))|37|38)|25|41|26|37|38|(1:(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r9.printStackTrace();
        android.util.Log.d("DlExtractErr", r9.getLocalizedMessage());
        r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.INSTANCE;
        r3 = r0.a;
        r9 = com.zepto.hz0.a;
        r2.a(r3, r9.A(), "applStatus", r9.C(), r9.D());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zi2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oy3 b() {
        return this.n;
    }

    public final DlExRequest c() {
        SelectedDLList selectedDLList = new SelectedDLList(null, 1, null);
        selectedDLList.setJsonMember523("DL Extract");
        DlExRequest dlExRequest = new DlExRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        dlExRequest.setDlno(this.b);
        dlExRequest.setDob(this.c);
        dlExRequest.setRtoCodeDLTr(this.d);
        dlExRequest.setWilltoDonateOrgans(this.g);
        dlExRequest.setSelectedDLSerList(selectedDLList);
        String str = this.e;
        dlExRequest.setDupDlReasonCode(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
        dlExRequest.setDupDlReasonName(this.f);
        dlExRequest.setDlHolderAltMobMum(this.h);
        dlExRequest.setMobileNumber(this.i);
        if (Intrinsics.areEqual(this.k, "N")) {
            dlExRequest.setEKYCId("NA");
            dlExRequest.setEKYCGender("NA");
            dlExRequest.setEKYCOpted("N");
            dlExRequest.setEKYCapplicantPhoto("NA");
        } else {
            dlExRequest.setEKYCId(this.j);
            dlExRequest.setEKYCGender(this.l);
            dlExRequest.setEKYCOpted(this.k);
            dlExRequest.setEKYCapplicantPhoto(this.m);
        }
        dlExRequest.setAgentId("sakalaHR");
        dlExRequest.setAgentPwd("975867c068a4e3e043058b5aaeebbeb5");
        dlExRequest.setAgentIpAddress("10.248.213.244");
        dlExRequest.setAgentServiceName("SarathiMobileService");
        Log.d("extract_req", dlExRequest.toString());
        return dlExRequest;
    }
}
