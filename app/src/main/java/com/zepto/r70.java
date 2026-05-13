package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.zepto.jt;
import com.zepto.s06;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r70 {
    public static md5 c;
    public static final r70 a = new r70();
    public static final String b = "BroReceiver";
    public static final BroadcastReceiver d = new a();

    public static final class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            try {
                String action = intent.getAction();
                if (Intrinsics.areEqual(action, "android.hardware.usb.action.USB_STATE")) {
                    Bundle extras = intent.getExtras();
                    Intrinsics.checkNotNull(extras);
                    if (extras.getBoolean("connected")) {
                        nn3.a.f("USB_DETECTION", "USB_CONNECTED.....");
                        Iterator it = mo5.a.g().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if5 if5Var = (if5) it.next();
                                if (Intrinsics.areEqual(if5Var.getMethodname(), "detectActiveUSBConnection")) {
                                    s06.a aVar = s06.m;
                                    s06 s06VarA = aVar.a();
                                    Intrinsics.checkNotNull(s06VarA);
                                    if5Var.setMobileSessionID(s06VarA.x());
                                    ScanUtils scanUtils = ScanUtils.a;
                                    if5Var.setThreatDateAndTime(scanUtils.m1());
                                    s06 s06VarA2 = aVar.a();
                                    Intrinsics.checkNotNull(s06VarA2);
                                    if5Var.setThreatDetectedFlag(s06VarA2.v());
                                    r70 r70Var = r70.a;
                                    String title = if5Var.getTitle();
                                    jt.a aVar2 = jt.c;
                                    String strS = scanUtils.S(aVar2.C(), NativeInteractor.a.u1());
                                    String msg = if5Var.getMsg();
                                    String ruleaction = if5Var.getRuleaction();
                                    String shortdescription = if5Var.getShortdescription();
                                    Intrinsics.checkNotNull(shortdescription);
                                    String recommendation = if5Var.getRecommendation();
                                    Intrinsics.checkNotNull(recommendation);
                                    String redirecturl = if5Var.getRedirecturl();
                                    Intrinsics.checkNotNull(redirecturl);
                                    r70Var.h(new md5(45, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, if5Var.getForceCloseTime(), if5Var.getClearDataFlag()));
                                    s06 s06VarA3 = aVar.a();
                                    Intrinsics.checkNotNull(s06VarA3);
                                    if5Var.setMobileSessionID(s06VarA3.x());
                                    if5Var.setThreatDateAndTime(scanUtils.m1());
                                    s06 s06VarA4 = aVar.a();
                                    Intrinsics.checkNotNull(s06VarA4);
                                    if5Var.setThreatDetectedFlag(s06VarA4.v());
                                    if5Var.setResult(action);
                                    String ruleaction2 = if5Var.getRuleaction();
                                    eg5 eg5Var = eg5.a;
                                    if (!Intrinsics.areEqual(ruleaction2, eg5Var.m()) && scanUtils.i0()) {
                                        pd1.c.a().j(if5Var);
                                        kt ktVarV = aVar2.v();
                                        if (ktVarV != null) {
                                            md5 md5VarF = r70Var.f();
                                            Intrinsics.checkNotNull(md5VarF);
                                            ktVarV.d(md5VarF);
                                        }
                                    } else if (Intrinsics.areEqual(if5Var.getRuleaction(), eg5Var.m())) {
                                        md5 md5VarF2 = r70Var.f();
                                        Intrinsics.checkNotNull(md5VarF2);
                                        Integer vulnerabilityCode = md5VarF2.getVulnerabilityCode();
                                        Intrinsics.checkNotNull(vulnerabilityCode);
                                        aVar2.l0(vulnerabilityCode.intValue());
                                        pd1.c.a().j(if5Var);
                                    }
                                }
                            }
                        }
                    } else {
                        r70 r70Var2 = r70.a;
                        if (r70Var2.f() != null) {
                            nn3 nn3Var = nn3.a;
                            md5 md5VarF3 = r70Var2.f();
                            Intrinsics.checkNotNull(md5VarF3);
                            nn3Var.f("USB_DETECTION", Intrinsics.stringPlus("USB_DISCONNECTED.....Before ", md5VarF3.getVulnerabilityCode()));
                            nn3Var.f("USB_DETECTION", Intrinsics.stringPlus("USB_DISCONNECTED.....Before ", jt.c.K()));
                            if (ScanCore.a.U0()) {
                                r70Var2.g(r70Var2.f());
                            } else {
                                r70Var2.c();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                nn3.a.b(r70.a.e(), Intrinsics.stringPlus(">>>>>>>>>>>> mUsbReceiver: BroadcastReceiver: Error: ", e), e);
            }
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public int i;
        public final /* synthetic */ if5 j;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ Process e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Process process, Continuation continuation) {
                super(2, continuation);
                this.e = process;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxInt(this.e.waitFor());
            }
        }

        /* JADX INFO: renamed from: com.zepto.r70$b$b, reason: collision with other inner class name */
        public static final class C0117b extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ BufferedReader e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0117b(BufferedReader bufferedReader, Continuation continuation) {
                super(2, continuation);
                this.e = bufferedReader;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((C0117b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0117b(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.e.readLine();
            }
        }

        public static final class c extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ BufferedReader e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(BufferedReader bufferedReader, Continuation continuation) {
                super(2, continuation);
                this.e = bufferedReader;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.e.close();
                return Unit.INSTANCE;
            }
        }

        public static final class d extends SuspendLambda implements Function2 {
            public int c;

            public d(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Runtime.getRuntime().exec("netstat -a");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.j = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.j, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013d A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0161 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017b A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01b1 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01da A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01fb A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001c, B:55:0x015b, B:57:0x0161, B:74:0x01b1, B:77:0x01ba, B:80:0x01c7, B:81:0x01da, B:85:0x01ff, B:88:0x0224, B:84:0x01fb, B:58:0x017b, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:66:0x0194, B:68:0x01a1, B:16:0x003f, B:48:0x0123, B:50:0x012a, B:44:0x0102, B:51:0x013d, B:19:0x004f, B:43:0x00e5, B:22:0x005a, B:39:0x00ca, B:25:0x0062, B:28:0x006a, B:35:0x0099), top: B:93:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011e -> B:48:0x0123). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.r70.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void c() {
        jt.a aVar = jt.c;
        List listK = aVar.K();
        md5 md5Var = c;
        Intrinsics.checkNotNull(md5Var);
        if (CollectionsKt___CollectionsKt.contains(listK, md5Var.getVulnerabilityCode())) {
            List listK2 = aVar.K();
            List listK3 = aVar.K();
            md5 md5Var2 = c;
            Intrinsics.checkNotNull(md5Var2);
            listK2.remove(CollectionsKt___CollectionsKt.lastIndexOf((List<? extends Integer>) ((List<? extends Object>) listK3), md5Var2.getVulnerabilityCode()));
        }
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        scanAlertsL.E(c);
    }

    public final BroadcastReceiver d() {
        return d;
    }

    public final String e() {
        return b;
    }

    public final md5 f() {
        return c;
    }

    public final void g(md5 md5Var) {
        ScanAlerts scanAlertsL = jt.c.L();
        Intrinsics.checkNotNull(scanAlertsL);
        Intrinsics.checkNotNull(md5Var);
        scanAlertsL.g0(md5Var);
    }

    public final void h(md5 md5Var) {
        c = md5Var;
    }

    public final void i(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        try {
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.i0()) {
                f80.d(qj2.c, null, null, new b(ruleObject, null), 3, null);
            } else {
                nn3.a.f(b, "Dev Option not enabled");
                scanUtils.Y0(46);
            }
        } catch (Exception e) {
            nn3.a.f(b, Intrinsics.stringPlus("wirelessADBEnableCheck", e));
        }
    }
}
