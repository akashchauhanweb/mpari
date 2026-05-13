package ai.protectt.app.security.main.scan;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore$handleAppBasedAlertResponse$1;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.eg5;
import com.zepto.if5;
import com.zepto.jt;
import com.zepto.kt;
import com.zepto.md5;
import com.zepto.nn3;
import com.zepto.nq;
import com.zepto.pd1;
import com.zepto.s06;
import com.zepto.yz0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
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
public final class ScanCore$handleAppBasedAlertResponse$1 extends SuspendLambda implements Function2 {
    public int c;
    public final /* synthetic */ if5 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanCore$handleAppBasedAlertResponse$1(if5 if5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.e = if5Var;
        this.f = str;
    }

    public static final void e(String str, md5 md5Var) {
        ScanCore scanCore = ScanCore.a;
        if (scanCore.U0()) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            if (aVar.e() == null) {
                scanCore.G0().add(str);
                return;
            }
            nq nqVarE = aVar.e();
            Intrinsics.checkNotNull(nqVarE);
            ArrayList arrayListC = nqVarE.C();
            arrayListC.clear();
            Type type = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanCore$handleAppBasedAlertResponse$1$1$type$1
            }.getType();
            Gson gson = new Gson();
            String blockListApp = md5Var.getBlockListApp();
            Intrinsics.checkNotNull(blockListApp);
            for (String str2 : ((HashMap) gson.fromJson(blockListApp, type)).keySet()) {
                if (!arrayListC.contains(str2)) {
                    RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
                    nq nqVarE2 = aVar2.e();
                    Intrinsics.checkNotNull(nqVarE2);
                    nqVarE2.C().add(str2);
                    nq nqVarE3 = aVar2.e();
                    Intrinsics.checkNotNull(nqVarE3);
                    nqVarE3.j();
                }
            }
            return;
        }
        jt.a aVar3 = jt.c;
        ScanAlerts scanAlertsL = aVar3.L();
        Intrinsics.checkNotNull(scanAlertsL);
        if (scanAlertsL.G() == null) {
            return;
        }
        ScanAlerts scanAlertsL2 = aVar3.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        nq nqVarG = scanAlertsL2.G();
        Intrinsics.checkNotNull(nqVarG);
        ArrayList arrayListC2 = nqVarG.C();
        arrayListC2.clear();
        Type type2 = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanCore$handleAppBasedAlertResponse$1$1$type$2
        }.getType();
        Gson gson2 = new Gson();
        String blockListApp2 = md5Var.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp2);
        for (String str3 : ((HashMap) gson2.fromJson(blockListApp2, type2)).keySet()) {
            if (!arrayListC2.contains(str3)) {
                jt.a aVar4 = jt.c;
                ScanAlerts scanAlertsL3 = aVar4.L();
                Intrinsics.checkNotNull(scanAlertsL3);
                nq nqVarG2 = scanAlertsL3.G();
                Intrinsics.checkNotNull(nqVarG2);
                nqVarG2.C().add(str3);
                ScanAlerts scanAlertsL4 = aVar4.L();
                Intrinsics.checkNotNull(scanAlertsL4);
                nq nqVarG3 = scanAlertsL4.G();
                Intrinsics.checkNotNull(nqVarG3);
                nqVarG3.j();
            }
        }
    }

    public static final void g(String str, md5 md5Var) {
        ScanCore scanCore = ScanCore.a;
        if (scanCore.U0()) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            if (aVar.g() == null) {
                scanCore.H0().add(str);
                return;
            }
            nq nqVarG = aVar.g();
            Intrinsics.checkNotNull(nqVarG);
            ArrayList arrayListC = nqVarG.C();
            arrayListC.clear();
            Type type = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanCore$handleAppBasedAlertResponse$1$2$type$1
            }.getType();
            Gson gson = new Gson();
            String blockListApp = md5Var.getBlockListApp();
            Intrinsics.checkNotNull(blockListApp);
            for (String str2 : ((HashMap) gson.fromJson(blockListApp, type)).keySet()) {
                if (!arrayListC.contains(str2)) {
                    RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
                    nq nqVarG2 = aVar2.g();
                    Intrinsics.checkNotNull(nqVarG2);
                    nqVarG2.C().add(str2);
                    nq nqVarG3 = aVar2.g();
                    Intrinsics.checkNotNull(nqVarG3);
                    nqVarG3.j();
                }
            }
            return;
        }
        jt.a aVar3 = jt.c;
        ScanAlerts scanAlertsL = aVar3.L();
        Intrinsics.checkNotNull(scanAlertsL);
        if (scanAlertsL.H() == null) {
            return;
        }
        ScanAlerts scanAlertsL2 = aVar3.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        nq nqVarH = scanAlertsL2.H();
        Intrinsics.checkNotNull(nqVarH);
        ArrayList arrayListC2 = nqVarH.C();
        arrayListC2.clear();
        Type type2 = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanCore$handleAppBasedAlertResponse$1$2$type$2
        }.getType();
        Gson gson2 = new Gson();
        String blockListApp2 = md5Var.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp2);
        for (String str3 : ((HashMap) gson2.fromJson(blockListApp2, type2)).keySet()) {
            if (!arrayListC2.contains(str3)) {
                jt.a aVar4 = jt.c;
                ScanAlerts scanAlertsL3 = aVar4.L();
                Intrinsics.checkNotNull(scanAlertsL3);
                nq nqVarH2 = scanAlertsL3.H();
                Intrinsics.checkNotNull(nqVarH2);
                nqVarH2.C().add(str3);
                ScanAlerts scanAlertsL4 = aVar4.L();
                Intrinsics.checkNotNull(scanAlertsL4);
                nq nqVarH3 = scanAlertsL4.H();
                Intrinsics.checkNotNull(nqVarH3);
                nqVarH3.j();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScanCore$handleAppBasedAlertResponse$1(this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yz0 yz0Var, Continuation continuation) {
        return ((ScanCore$handleAppBasedAlertResponse$1) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            if5 if5Var = this.e;
            s06.a aVar = s06.m;
            s06 s06VarA = aVar.a();
            Intrinsics.checkNotNull(s06VarA);
            if5Var.setMobileSessionID(s06VarA.x());
            if5 if5Var2 = this.e;
            ScanUtils scanUtils = ScanUtils.a;
            if5Var2.setThreatDateAndTime(scanUtils.m1());
            if5 if5Var3 = this.e;
            s06 s06VarA2 = aVar.a();
            Intrinsics.checkNotNull(s06VarA2);
            if5Var3.setThreatDetectedFlag(s06VarA2.v());
            this.e.setResult(this.f);
            Integer numBoxInt = Boxing.boxInt(this.e.getRuleid());
            String title = this.e.getTitle();
            jt.a aVar2 = jt.c;
            String strS = scanUtils.S(aVar2.C(), NativeInteractor.a.u1());
            String msg = this.e.getMsg();
            String ruleaction = this.e.getRuleaction();
            String str = this.f;
            String shortdescription = this.e.getShortdescription();
            String recommendation = this.e.getRecommendation();
            String redirecturl = this.e.getRedirecturl();
            Intrinsics.checkNotNull(redirecturl);
            final md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, str, shortdescription, recommendation, redirecturl, this.e.getForceCloseTime(), this.e.getClearDataFlag());
            String ruleaction2 = this.e.getRuleaction();
            eg5 eg5Var = eg5.a;
            if (!Intrinsics.areEqual(ruleaction2, eg5Var.m()) && !CollectionsKt___CollectionsKt.contains(aVar2.O(), md5Var.getVulnerabilityCode()) && !CollectionsKt___CollectionsKt.contains(aVar2.K(), md5Var.getVulnerabilityCode())) {
                pd1.c.a().j(this.e);
                kt ktVarV = aVar2.v();
                if (ktVarV != null) {
                    ktVarV.d(md5Var);
                }
            } else if (Intrinsics.areEqual(this.e.getRuleaction(), eg5Var.m())) {
                Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode);
                aVar2.l0(vulnerabilityCode.intValue());
                pd1.c.a().j(this.e);
            } else if (!CollectionsKt___CollectionsKt.contains(aVar2.O(), md5Var.getVulnerabilityCode()) && CollectionsKt___CollectionsKt.contains(aVar2.K(), md5Var.getVulnerabilityCode())) {
                Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
                if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 44) {
                    Activity activityR = aVar2.r();
                    Intrinsics.checkNotNull(activityR);
                    final String str2 = this.f;
                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.qn5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanCore$handleAppBasedAlertResponse$1.e(str2, md5Var);
                        }
                    });
                } else if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 35) {
                    Activity activityR2 = aVar2.r();
                    Intrinsics.checkNotNull(activityR2);
                    final String str3 = this.f;
                    activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.rn5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanCore$handleAppBasedAlertResponse$1.g(str3, md5Var);
                        }
                    });
                }
            }
        } catch (Exception e) {
            nn3.a.b(ScanCore.b, Intrinsics.stringPlus(">>>>>>>>>>>> isFridaServerRunning: Error: ", e), e);
        }
        return Unit.INSTANCE;
    }
}
