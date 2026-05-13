package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import android.content.Context;
import com.zepto.e41;
import com.zepto.jt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wt4 {
    public static wt4 c;
    public static Context e;
    public final String a = "PreScanUtils";
    public static final a b = new a(null);
    public static List d = new ArrayList();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wt4 a() {
            return wt4.c;
        }

        public final List b() {
            return wt4.d;
        }

        public final wt4 c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            wt4.e = context;
            if (a() == null) {
                d(new wt4());
            }
            wt4 wt4VarA = a();
            Intrinsics.checkNotNull(wt4VarA);
            return wt4VarA;
        }

        public final void d(wt4 wt4Var) {
            wt4.c = wt4Var;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ wt4 f;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ if5 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(if5 if5Var, Continuation continuation) {
                super(2, continuation);
                this.e = if5Var;
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
                NativeInteractor.a.G0();
                ScanCore.a.Q(this.e);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if5 if5Var, wt4 wt4Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = wt4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                wt4.b.b().add(this.e);
                int ruleid = this.e.getRuleid();
                if (ruleid == 10) {
                    ScanUtils scanUtils = ScanUtils.a;
                    Context context = wt4.e;
                    Intrinsics.checkNotNull(context);
                    if (scanUtils.s0(context)) {
                        scanUtils.b0(this.e, "Proxy Server Detected");
                    }
                } else if (ruleid == 11) {
                    ScanUtils scanUtils2 = ScanUtils.a;
                    Context context2 = wt4.e;
                    Intrinsics.checkNotNull(context2);
                    String strC0 = scanUtils2.c0(context2);
                    if (strC0.length() > 0) {
                        scanUtils2.b0(this.e, strC0);
                    }
                } else if (ruleid == 24) {
                    ScanUtils scanUtils3 = ScanUtils.a;
                    Context context3 = wt4.e;
                    Intrinsics.checkNotNull(context3);
                    if (scanUtils3.B0(context3)) {
                        scanUtils3.b0(this.e, "");
                    }
                } else if (ruleid == 47) {
                    oj1 oj1Var = oj1.a;
                    if (oj1Var.f() == null) {
                        Context context4 = wt4.e;
                        Intrinsics.checkNotNull(context4);
                        oj1Var.j(context4);
                    }
                    ScanCore scanCore = ScanCore.a;
                    scanCore.d0();
                    scanCore.C(this.e);
                } else if (ruleid == 207) {
                    ScanCore.a.E(this.e);
                } else if (ruleid == 219) {
                    ScanCore.a.H();
                } else if (ruleid == 235) {
                    ScanCore.a.j1(this.e);
                } else if (ruleid == 250) {
                    ScanCore.a.r0(this.e);
                    ScanUtils.a.l0(this.e);
                } else if (ruleid == 1003) {
                    ScanCore.a.D1(this.e);
                } else if (ruleid == 1036) {
                    ScanCore.a.M0(this.e);
                } else if (ruleid == 239) {
                    ScanCore.a.f1(this.e);
                } else if (ruleid == 240) {
                    f80.d(qj2.c, null, null, new a(this.e, null), 3, null);
                }
            } catch (Exception e) {
                nn3.a.b(this.f.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void A(if5 ids) {
        Intrinsics.checkNotNullParameter(ids, "$ids");
        if (ids.getRuleid() == 215) {
            tm5 tm5VarD = tm5.f.d();
            Intrinsics.checkNotNull(tm5VarD);
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            if5 if5VarQ = scanAlertsL.Q(215);
            Intrinsics.checkNotNull(if5VarQ);
            tm5VarD.J(if5VarQ, "SecondScreen");
            return;
        }
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        if (aVar.j() != null) {
            com.google.android.material.bottomsheet.a aVarJ = aVar.j();
            Intrinsics.checkNotNull(aVarJ);
            if (aVarJ.isShowing()) {
                jt.c.c(ids.getRuleid());
                return;
            }
        }
        jt.a aVar2 = jt.c;
        aVar2.c(ids.getRuleid());
        j70 j70VarK = aVar.k();
        Intrinsics.checkNotNull(j70VarK);
        ScanAlerts scanAlertsL2 = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        j70VarK.k(scanAlertsL2.e0(ids));
    }

    public static final void B(if5 ids) {
        Intrinsics.checkNotNullParameter(ids, "$ids");
        if (ids.getRuleid() != 215) {
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            j70VarK.d(scanAlertsL.e0(ids));
            return;
        }
        tm5 tm5VarD = tm5.f.d();
        Intrinsics.checkNotNull(tm5VarD);
        ScanAlerts scanAlertsL2 = jt.c.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        if5 if5VarQ = scanAlertsL2.Q(215);
        Intrinsics.checkNotNull(if5VarQ);
        tm5VarD.J(if5VarQ, "SecondScreen");
    }

    public static final void C(md5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        if (aVar.j() != null) {
            com.google.android.material.bottomsheet.a aVarJ = aVar.j();
            Intrinsics.checkNotNull(aVarJ);
            if (aVarJ.isShowing()) {
                com.google.android.material.bottomsheet.a aVarJ2 = aVar.j();
                Intrinsics.checkNotNull(aVarJ2);
                aVarJ2.dismiss();
                Integer vulnerabilityCode = rule.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode);
                aVar.y(vulnerabilityCode.intValue());
            }
        }
    }

    public static final void D() {
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.g();
    }

    public static final void E(if5 ids) {
        Intrinsics.checkNotNullParameter(ids, "$ids");
        if (ids.getRuleid() != 215) {
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            j70VarK.d(scanAlertsL.e0(ids));
            return;
        }
        tm5 tm5VarD = tm5.f.d();
        Intrinsics.checkNotNull(tm5VarD);
        ScanAlerts scanAlertsL2 = jt.c.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        if5 if5VarQ = scanAlertsL2.Q(215);
        Intrinsics.checkNotNull(if5VarQ);
        tm5VarD.J(if5VarQ, "SecondScreen");
    }

    public static final void G(md5 response) {
        Intrinsics.checkNotNullParameter(response, "$response");
        ScanAlerts scanAlertsL = jt.c.L();
        if (scanAlertsL == null) {
            return;
        }
        scanAlertsL.B(response);
    }

    public static final void t(HashMap shownRules, final if5 newRule, List scanedRules) {
        Intrinsics.checkNotNullParameter(shownRules, "$shownRules");
        Intrinsics.checkNotNullParameter(newRule, "$newRule");
        Intrinsics.checkNotNullParameter(scanedRules, "$scanedRules");
        if (!ScanCore.a.U0()) {
            if (shownRules.containsKey(Integer.valueOf(newRule.getRuleid())) || !scanedRules.contains(Integer.valueOf(newRule.getRuleid())) || Intrinsics.areEqual(newRule.getRuleaction(), eg5.a.m())) {
                return;
            }
            nn3.a.f("AlertReFresh", "This is AlertDialog:-Log .. come into warn" + newRule.getRuleid() + ((Object) newRule.getRuleaction()));
            jt.a aVar = jt.c;
            ScanAlerts scanAlertsL = aVar.L();
            Intrinsics.checkNotNull(scanAlertsL);
            final md5 md5VarE0 = scanAlertsL.e0(newRule);
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.lt4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.u(md5VarE0);
                }
            });
            return;
        }
        if (shownRules.containsKey(Integer.valueOf(newRule.getRuleid())) || !scanedRules.contains(Integer.valueOf(newRule.getRuleid()))) {
            return;
        }
        nn3 nn3Var = nn3.a;
        nn3Var.f("AlertReFresh", "Log .. come into warn" + newRule.getRuleid() + ((Object) newRule.getRuleaction()));
        String ruleaction = newRule.getRuleaction();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (Intrinsics.areEqual(ruleaction, nativeInteractor.e1())) {
            nn3Var.f("AlertReFresh", "Log .. come into warn");
            Activity activityR2 = jt.c.r();
            Intrinsics.checkNotNull(activityR2);
            activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.tt4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.v(newRule);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(ruleaction, nativeInteractor.d1())) {
            nn3Var.f("AlertReFresh", "Log .. come into block");
            Activity activityR3 = jt.c.r();
            Intrinsics.checkNotNull(activityR3);
            activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.ut4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.w(newRule);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(ruleaction, nativeInteractor.a1())) {
            nn3Var.f("AlertReFresh", "Log .. come into close");
            Activity activityR4 = jt.c.r();
            Intrinsics.checkNotNull(activityR4);
            activityR4.runOnUiThread(new Runnable() { // from class: com.zepto.vt4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.x(newRule);
                }
            });
        }
    }

    public static final void u(md5 response) {
        Intrinsics.checkNotNullParameter(response, "$response");
        ScanAlerts scanAlertsL = jt.c.L();
        if (scanAlertsL == null) {
            return;
        }
        scanAlertsL.B(response);
    }

    public static final void v(if5 newRule) {
        Intrinsics.checkNotNullParameter(newRule, "$newRule");
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        j70 j70VarK = aVar.k();
        Intrinsics.checkNotNull(j70VarK);
        ScanAlerts scanAlertsL = jt.c.L();
        Intrinsics.checkNotNull(scanAlertsL);
        j70VarK.h(scanAlertsL.e0(newRule));
        j70 j70VarK2 = aVar.k();
        Intrinsics.checkNotNull(j70VarK2);
        j70VarK2.b();
    }

    public static final void w(if5 newRule) {
        Intrinsics.checkNotNullParameter(newRule, "$newRule");
        jt.c.c(newRule.getRuleid());
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.b();
    }

    public static final void x(if5 newRule) {
        Intrinsics.checkNotNullParameter(newRule, "$newRule");
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        ScanAlerts scanAlertsL = jt.c.L();
        Intrinsics.checkNotNull(scanAlertsL);
        j70VarK.d(scanAlertsL.e0(newRule));
    }

    public static final void y(wt4 this$0, HashMap shownRules, if5 newRule) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shownRules, "$shownRules");
        Intrinsics.checkNotNullParameter(newRule, "$newRule");
        if (ScanCore.a.U0()) {
            nn3.a.f("AlertReFresh", "This is BottomSheet Alert");
            Object obj = shownRules.get(Integer.valueOf(newRule.getRuleid()));
            Intrinsics.checkNotNull(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "shownRules[newRule.ruleid]!!");
            this$0.z((md5) obj, newRule);
            return;
        }
        nn3.a.f("AlertReFresh", "This is AlertDialog");
        Object obj2 = shownRules.get(Integer.valueOf(newRule.getRuleid()));
        Intrinsics.checkNotNull(obj2);
        Intrinsics.checkNotNullExpressionValue(obj2, "shownRules[newRule.ruleid]!!");
        this$0.F((md5) obj2, newRule);
    }

    public final void F(md5 md5Var, if5 if5Var) {
        jt.a aVar = jt.c;
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        scanAlertsL.F(vulnerabilityCode.intValue());
        if (Intrinsics.areEqual(if5Var.getRuleaction(), eg5.a.m())) {
            return;
        }
        nn3.a.f("AlertReFresh", "This is AlertDialog:-come into this" + ((Object) md5Var.getVulnerabilityActionRequired()) + ' ' + ((Object) if5Var.getRuleaction()));
        ScanAlerts scanAlertsL2 = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        final md5 md5VarE0 = scanAlertsL2.e0(if5Var);
        Activity activityR = aVar.r();
        Intrinsics.checkNotNull(activityR);
        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.mt4
            @Override // java.lang.Runnable
            public final void run() {
                wt4.G(md5VarE0);
            }
        });
    }

    public final void H(if5 rule, String from) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(from, "from");
        nn3.a.f(this.a, "from:-" + from + "Rule id:-" + rule.getRuleid());
        f80.d(qj2.c, null, null, new b(rule, this, null), 3, null);
    }

    public final void s(List response) {
        Intrinsics.checkNotNullParameter(response, "response");
        jt.a aVar = jt.c;
        final List listK = aVar.K();
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        final HashMap mapM = scanAlertsL.M();
        Iterator it = response.iterator();
        while (it.hasNext()) {
            final if5 if5Var = (if5) it.next();
            if (listK.contains(Integer.valueOf(if5Var.getRuleid())) && mapM.containsKey(Integer.valueOf(if5Var.getRuleid()))) {
                Object obj = mapM.get(Integer.valueOf(if5Var.getRuleid()));
                Intrinsics.checkNotNull(obj);
                if (!Intrinsics.areEqual(((md5) obj).getVulnerabilityActionRequired(), NativeInteractor.a.a1())) {
                    Object obj2 = mapM.get(Integer.valueOf(if5Var.getRuleid()));
                    Intrinsics.checkNotNull(obj2);
                    if (!Intrinsics.areEqual(((md5) obj2).getVulnerabilityActionRequired(), if5Var.getRuleaction())) {
                        Activity activityR = jt.c.r();
                        Intrinsics.checkNotNull(activityR);
                        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.kt4
                            @Override // java.lang.Runnable
                            public final void run() {
                                wt4.y(this.c, mapM, if5Var);
                            }
                        });
                    }
                }
            } else {
                Activity activityR2 = jt.c.r();
                Intrinsics.checkNotNull(activityR2);
                activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.nt4
                    @Override // java.lang.Runnable
                    public final void run() {
                        wt4.t(mapM, if5Var, listK);
                    }
                });
            }
        }
    }

    public final void z(final md5 md5Var, final if5 if5Var) {
        nn3 nn3Var = nn3.a;
        nn3Var.f("567teups", "older" + ((Object) md5Var.getVulnerabilityActionRequired()) + "new " + ((Object) if5Var.getRuleaction()) + ' ' + if5Var.getRuleid());
        String vulnerabilityActionRequired = md5Var.getVulnerabilityActionRequired();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.e1())) {
            e41.a aVar = e41.m;
            RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
            aVar.c(md5Var, aVar2.p());
            if (CollectionsKt___CollectionsKt.contains(aVar2.f(), md5Var.getVulnerabilityCode())) {
                aVar2.f().remove(md5Var.getVulnerabilityCode());
            }
            String ruleaction = if5Var.getRuleaction();
            if (Intrinsics.areEqual(ruleaction, nativeInteractor.d1())) {
                nn3Var.f("AlertReFresh", "come into block");
                Activity activityR = jt.c.r();
                Intrinsics.checkNotNull(activityR);
                activityR.runOnUiThread(new Runnable() { // from class: com.zepto.ot4
                    @Override // java.lang.Runnable
                    public final void run() {
                        wt4.A(if5Var);
                    }
                });
                return;
            }
            if (Intrinsics.areEqual(ruleaction, nativeInteractor.a1())) {
                nn3Var.f("AlertReFresh", "come into Close");
                Activity activityR2 = jt.c.r();
                Intrinsics.checkNotNull(activityR2);
                activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.pt4
                    @Override // java.lang.Runnable
                    public final void run() {
                        wt4.B(if5Var);
                    }
                });
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.d1())) {
            jt.a aVar3 = jt.c;
            aVar3.n0(false);
            if (CollectionsKt___CollectionsKt.contains(aVar3.A(), md5Var.getVulnerabilityCode())) {
                aVar3.A().remove(md5Var.getVulnerabilityCode());
            }
            Activity activityR3 = aVar3.r();
            Intrinsics.checkNotNull(activityR3);
            activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.qt4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.C(md5Var);
                }
            });
            String ruleaction2 = if5Var.getRuleaction();
            if (!Intrinsics.areEqual(ruleaction2, nativeInteractor.e1())) {
                if (Intrinsics.areEqual(ruleaction2, nativeInteractor.a1())) {
                    nn3Var.f("AlertReFresh", "come into Close");
                    Activity activityR4 = aVar3.r();
                    Intrinsics.checkNotNull(activityR4);
                    activityR4.runOnUiThread(new Runnable() { // from class: com.zepto.st4
                        @Override // java.lang.Runnable
                        public final void run() {
                            wt4.E(if5Var);
                        }
                    });
                    return;
                }
                return;
            }
            nn3Var.f("AlertReFresh", "come into Warn");
            if (if5Var.getRuleid() == 215) {
                tm5 tm5VarD = tm5.f.d();
                Intrinsics.checkNotNull(tm5VarD);
                ScanAlerts scanAlertsL = aVar3.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(215);
                Intrinsics.checkNotNull(if5VarQ);
                tm5VarD.J(if5VarQ, "SecondScreen");
                return;
            }
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            ScanAlerts scanAlertsL2 = aVar3.L();
            Intrinsics.checkNotNull(scanAlertsL2);
            j70VarK.h(scanAlertsL2.e0(if5Var));
            Activity activityR5 = aVar3.r();
            Intrinsics.checkNotNull(activityR5);
            activityR5.runOnUiThread(new Runnable() { // from class: com.zepto.rt4
                @Override // java.lang.Runnable
                public final void run() {
                    wt4.D();
                }
            });
        }
    }
}
