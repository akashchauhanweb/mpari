package ai.protectt.app.security.main.scan;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.common.helper.SkipAlertSharePref;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.dq7;
import com.zepto.e41;
import com.zepto.eg5;
import com.zepto.f80;
import com.zepto.hk1;
import com.zepto.if5;
import com.zepto.j70;
import com.zepto.jt;
import com.zepto.k16;
import com.zepto.l06;
import com.zepto.md5;
import com.zepto.mo5;
import com.zepto.nn3;
import com.zepto.nq;
import com.zepto.nt;
import com.zepto.qj2;
import com.zepto.qk1;
import com.zepto.s06;
import com.zepto.tm5;
import com.zepto.wt4;
import com.zepto.y03;
import com.zepto.y60;
import com.zepto.yz0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ScanAlerts {
    public Integer b;
    public Integer c;
    public AlertDialog d;
    public boolean i;
    public nq j;
    public nq k;
    public nq l;
    public nq m;
    public nq n;
    public nq o;
    public final String a = "ScanAlerts";
    public List e = new ArrayList();
    public HashMap f = new HashMap();
    public HashMap g = new HashMap();
    public HashMap h = new HashMap();

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
            return ScanAlerts.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nt ntVarH = jt.c.H();
                Intrinsics.checkNotNull(ntVarH);
                ntVarH.i();
            } catch (Exception e) {
                nn3.c(nn3.a, ScanAlerts.this.a, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ScanAlerts.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                SkipAlertSharePref skipAlertSharePrefA = SkipAlertSharePref.g.a();
                Intrinsics.checkNotNull(skipAlertSharePrefA);
                List listG = skipAlertSharePrefA.g();
                if (!listG.isEmpty()) {
                    nt ntVarH = jt.c.H();
                    Intrinsics.checkNotNull(ntVarH);
                    nt.a.a(ntVarH, listG, false, 2, null);
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanAlerts.this.a, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends CountDownTimer {
        public final /* synthetic */ Button a;
        public final /* synthetic */ CharSequence b;
        public final /* synthetic */ md5 c;
        public final /* synthetic */ ScanAlerts d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Button button, CharSequence charSequence, md5 md5Var, ScanAlerts scanAlerts, long j) {
            super(j, 100L);
            this.a = button;
            this.b = charSequence;
            this.c = md5Var;
            this.d = scanAlerts;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (this.c.getClearDataFlag()) {
                this.d.p(this.c, 1);
            } else {
                ScanAlerts.w(this.d, null, 1, null);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setEnabled(false);
            this.a.setText(String.format(Locale.getDefault(), "%s (%d)", this.b, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) + 1)));
        }
    }

    public ScanAlerts(int i, int i2) {
        this.b = Integer.valueOf(i);
        this.c = Integer.valueOf(i2);
    }

    public static final void D() {
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        if (aVar.l() != null) {
            com.google.android.material.bottomsheet.a aVarL = aVar.l();
            Intrinsics.checkNotNull(aVarL);
            if (aVarL.isShowing()) {
                com.google.android.material.bottomsheet.a aVarL2 = aVar.l();
                Intrinsics.checkNotNull(aVarL2);
                aVarL2.cancel();
            }
        }
    }

    public static final void S(ScanAlerts this$0, AlertDialog mBuilder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mBuilder, "$mBuilder");
        this$0.v(mBuilder);
    }

    public static final void T(CheckBox checkBoxForceAccept, md5 response, AlertDialog mBuilder, View view) {
        Intrinsics.checkNotNullParameter(checkBoxForceAccept, "$checkBoxForceAccept");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(mBuilder, "$mBuilder");
        if (checkBoxForceAccept.getVisibility() != 0 || checkBoxForceAccept.isChecked()) {
            jt.a aVar = jt.c;
            aVar.v0(aVar.n() - 1);
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            aVar.V0(vulnerabilityCode.intValue());
            mBuilder.dismiss();
            return;
        }
        jt.a aVar2 = jt.c;
        if (aVar2.r() != null) {
            Activity activityR = aVar2.r();
            Intrinsics.checkNotNull(activityR);
            final String str = "Please accept the risk to continue";
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.im5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanAlerts.U(str);
                }
            });
        }
    }

    public static final void U(String msg) {
        Intrinsics.checkNotNullParameter(msg, "$msg");
        Toast.makeText(jt.c.r(), msg, 0).show();
    }

    public static final void V(md5 response, ScanAlerts this$0, View view) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NativeInteractor.a.n(jt.c.C(), Intrinsics.stringPlus(ScanCore.a.T("cmlkOg=="), response.getVulnerabilityCode()));
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        this$0.Z(vulnerabilityCode.intValue());
    }

    public static final void W(Button btnIgnore, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(btnIgnore, "$btnIgnore");
        if (z) {
            dq7.v0(btnIgnore, ColorStateList.valueOf(Color.parseColor("#074cab")));
        } else {
            dq7.v0(btnIgnore, ColorStateList.valueOf(Color.parseColor("#e8f6ff")));
        }
    }

    public static final void Y(md5 response, ScanAlerts this$0) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!ScanCore.a.U0()) {
            jt.a aVar = jt.c;
            ScanAlerts scanAlertsL = aVar.L();
            Intrinsics.checkNotNull(scanAlertsL);
            if (scanAlertsL.j == null) {
                return;
            }
            ScanAlerts scanAlertsL2 = aVar.L();
            Intrinsics.checkNotNull(scanAlertsL2);
            nq nqVar = scanAlertsL2.j;
            Intrinsics.checkNotNull(nqVar);
            if (CollectionsKt___CollectionsKt.contains(nqVar.C(), response.getBlockListApp())) {
                return;
            }
            String blockListApp = response.getBlockListApp();
            Intrinsics.checkNotNull(blockListApp);
            this$0.n(blockListApp);
            ScanAlerts scanAlertsL3 = aVar.L();
            Intrinsics.checkNotNull(scanAlertsL3);
            nq nqVar2 = scanAlertsL3.j;
            Intrinsics.checkNotNull(nqVar2);
            nqVar2.j();
            return;
        }
        nn3 nn3Var = nn3.a;
        nn3Var.f("NewUiTestApp", Intrinsics.stringPlus(".........ScanAlerts", response.getBlockListApp()));
        RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
        if (aVar2.i() == null) {
            nn3Var.f("NewUUi", Intrinsics.stringPlus("add local list", aVar2.s()));
            if (CollectionsKt___CollectionsKt.contains(aVar2.s(), response.getBlockListApp())) {
                return;
            }
            List listS = aVar2.s();
            String blockListApp2 = response.getBlockListApp();
            Intrinsics.checkNotNull(blockListApp2);
            listS.add(blockListApp2);
            return;
        }
        nq nqVarI = aVar2.i();
        Intrinsics.checkNotNull(nqVarI);
        ArrayList arrayListC = nqVarI.C();
        if (CollectionsKt___CollectionsKt.contains(arrayListC, response.getBlockListApp())) {
            return;
        }
        nn3Var.f("NewUUi", Intrinsics.stringPlus("rv Packages ", arrayListC));
        String blockListApp3 = response.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp3);
        aVar2.b(blockListApp3);
        nq nqVarI2 = aVar2.i();
        Intrinsics.checkNotNull(nqVarI2);
        nqVarI2.j();
    }

    public static final void b0(md5 response, ScanAlerts this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intent intent = new Intent();
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 30) {
            intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 44) {
            intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 41) {
            intent = new Intent("android.settings.DATE_SETTINGS");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 31) {
            intent = new Intent("android.app.action.SET_NEW_PASSWORD");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 24) {
            intent = new Intent("android.settings.VPN_SETTINGS");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 35) {
            intent = new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.DeviceAdminSettings"));
            Intrinsics.checkNotNullExpressionValue(intent, "Intent().setComponent(\n …                        )");
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 217) {
            intent = this$0.K();
        } else if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 5) {
            intent = this$0.K();
        }
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        Intrinsics.checkNotNull(activityR);
        if (intent.resolveActivity(activityR.getPackageManager()) == null) {
            nn3.a.f("Application_Developer", "No Activity to handle Intent action");
            view.setVisibility(8);
        } else {
            Activity activityR2 = aVar.r();
            Intrinsics.checkNotNull(activityR2);
            activityR2.startActivity(intent);
        }
    }

    public static final void s() {
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.b();
    }

    public static /* synthetic */ void w(ScanAlerts scanAlerts, AlertDialog alertDialog, int i, Object obj) {
        if ((i & 1) != 0) {
            alertDialog = null;
        }
        scanAlerts.v(alertDialog);
    }

    public static final void y(ScanAlerts this$0, md5 response, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        NativeInteractor.a.o(jt.c.C(), ScanCore.a.T("ZS0wMjY="));
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        this$0.Z(vulnerabilityCode.intValue());
    }

    public static final void z(Button btnBlock, int i, md5 response, ScanAlerts this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(btnBlock, "$btnBlock");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new c(btnBlock, btnBlock.getText(), response, this$0, i).start();
    }

    public final md5 A(int i) {
        if5 if5VarQ = Q(i);
        Intrinsics.checkNotNull(if5VarQ);
        Integer numValueOf = Integer.valueOf(if5VarQ.getRuleid());
        String title = if5VarQ.getTitle();
        String msg = if5VarQ.getMsg();
        String ruleaction = if5VarQ.getRuleaction();
        String shortdescription = if5VarQ.getShortdescription();
        Intrinsics.checkNotNull(shortdescription);
        String recommendation = if5VarQ.getRecommendation();
        Intrinsics.checkNotNull(recommendation);
        String redirecturl = if5VarQ.getRedirecturl();
        Intrinsics.checkNotNull(redirecturl);
        return new md5(numValueOf, title, "UNSAFE", msg, ruleaction, shortdescription, recommendation, redirecturl, if5VarQ.getForceCloseTime(), if5VarQ.getClearDataFlag());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0253 A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:3:0x000d, B:5:0x0053, B:11:0x0067, B:14:0x006d, B:16:0x009c, B:18:0x00c5, B:22:0x00e8, B:31:0x0113, B:33:0x0204, B:38:0x020f, B:36:0x0209, B:39:0x021b, B:45:0x0236, B:50:0x0245, B:56:0x0258, B:60:0x0274, B:63:0x027e, B:64:0x029b, B:69:0x02a7, B:72:0x02b1, B:73:0x02dd, B:109:0x03f8, B:110:0x040a, B:102:0x03c8, B:104:0x03d0, B:106:0x03d7, B:107:0x03f0, B:94:0x0396, B:96:0x039d, B:98:0x03a4, B:99:0x03be, B:83:0x0328, B:85:0x0330, B:87:0x0336, B:89:0x033d, B:90:0x0364, B:91:0x036b, B:76:0x02e7, B:79:0x02f1, B:80:0x031d, B:53:0x024c, B:55:0x0253, B:48:0x023d, B:42:0x0229, B:44:0x0231, B:30:0x0104, B:21:0x00e0, B:17:0x00b3, B:24:0x00f6, B:27:0x00fd), top: B:116:0x000d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(com.zepto.md5 r18) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.main.scan.ScanAlerts.B(com.zepto.md5):void");
    }

    public final void C(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.runOnUiThread(new Runnable() { // from class: com.zepto.pm5
            @Override // java.lang.Runnable
            public final void run() {
                ScanAlerts.D();
            }
        });
    }

    public final void E(md5 md5Var) {
        AlertDialog vulnerabilityAlert;
        try {
            nn3 nn3Var = nn3.a;
            StringBuilder sb = new StringBuilder();
            sb.append("==============dismissAnAlertByResponseCode response.vulnerabilityCode: ");
            Intrinsics.checkNotNull(md5Var);
            sb.append(md5Var.getVulnerabilityCode());
            sb.append(" -- ");
            sb.append((Object) md5Var.getVulnerabilityTitle());
            nn3Var.f("TAG", sb.toString());
            HashMap map = this.f;
            if (map == null || map.size() <= 0 || !this.f.containsKey(md5Var.getVulnerabilityCode())) {
                return;
            }
            jt.a aVar = jt.c;
            aVar.v0(aVar.n() - 1);
            hk1 hk1Var = (hk1) this.f.get(md5Var.getVulnerabilityCode());
            if (hk1Var != null && (vulnerabilityAlert = hk1Var.getVulnerabilityAlert()) != null) {
                vulnerabilityAlert.dismiss();
            }
            this.f.remove(md5Var.getVulnerabilityCode());
            if (CollectionsKt___CollectionsKt.contains(aVar.K(), md5Var.getVulnerabilityCode())) {
                aVar.K().remove(md5Var.getVulnerabilityCode());
            }
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus(">>>>>>>>>>>> dismissAnAlertByResponseCode: Error: ", e), e);
        }
    }

    public final void F(int i) {
        AlertDialog vulnerabilityAlert;
        HashMap map = this.f;
        if (map == null || map.size() <= 0 || !this.f.containsKey(Integer.valueOf(i))) {
            return;
        }
        jt.c.v0(r0.n() - 1);
        hk1 hk1Var = (hk1) this.f.get(Integer.valueOf(i));
        if (hk1Var != null && (vulnerabilityAlert = hk1Var.getVulnerabilityAlert()) != null) {
            vulnerabilityAlert.dismiss();
        }
        nn3.a.f("AlertReFresh", Intrinsics.stringPlus("This is AlertDialog:-Dismiss", Integer.valueOf(i)));
        this.f.remove(Integer.valueOf(i));
    }

    public final nq G() {
        return this.l;
    }

    public final nq H() {
        return this.m;
    }

    public final nq I() {
        return this.j;
    }

    public final AlertDialog J() {
        return this.d;
    }

    public final Intent K() {
        return new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(NativeInteractor.a.P(), jt.c.C().getPackageName())));
    }

    public final HashMap L() {
        return this.f;
    }

    public final HashMap M() {
        return this.g;
    }

    public final HashMap N() {
        return this.h;
    }

    public final nq O() {
        return this.n;
    }

    public final nq P() {
        return this.o;
    }

    public final if5 Q(int i) {
        try {
            if5 if5VarI = l06.e.a().i(i);
            if (if5VarI != null) {
                return if5VarI;
            }
            nn3.a.f(this.a, ">>>>>>>>>>>>Rule Id " + i + " Not Configured");
            Object obj = null;
            if (i == 39) {
                List listW = jt.c.w();
                if (listW == null) {
                    return null;
                }
                Iterator it = listW.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((if5) next).getRuleid() == i) {
                        obj = next;
                        break;
                    }
                }
                return (if5) obj;
            }
            if (i != 1010) {
                return c0(i);
            }
            List listW2 = jt.c.w();
            if (listW2 == null) {
                return null;
            }
            Iterator it2 = listW2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((if5) next2).getRuleid() == 1010) {
                    obj = next2;
                    break;
                }
            }
            return (if5) obj;
        } catch (Exception e) {
            nn3.a.b(this.a, i + ">>>>>>>>>>>> getSingleRuleFormDB: Error: " + e, e);
            return c0(i);
        }
    }

    public final void R(Button button, final AlertDialog alertDialog, final Button button2, final md5 md5Var, final CheckBox checkBox) {
        button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanAlerts.S(this.a, alertDialog, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanAlerts.T(checkBox, md5Var, alertDialog, view);
            }
        });
        String vulnerabilityActionRequired = md5Var.getVulnerabilityActionRequired();
        ScanUtils scanUtils = ScanUtils.a;
        jt.a aVar = jt.c;
        Context contextC = aVar.C();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (Intrinsics.areEqual(vulnerabilityActionRequired, scanUtils.S(contextC, nativeInteractor.I0()))) {
            button.setVisibility(0);
            button2.setVisibility(8);
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nm5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScanAlerts.V(md5Var, this, view);
                }
            });
        } else if (Intrinsics.areEqual(md5Var.getVulnerabilityActionRequired(), scanUtils.S(aVar.C(), nativeInteractor.H0()))) {
            button.setVisibility(0);
            button2.setVisibility(0);
            nn3 nn3Var = nn3.a;
            StringBuilder sb = new StringBuilder();
            sb.append(md5Var.getVulnerabilityCode());
            sb.append(" lisst  :: ");
            mo5 mo5Var = mo5.a;
            sb.append(mo5Var.d().keySet());
            nn3Var.f("forceAcceptLIst", sb.toString());
            Set setKeySet = mo5Var.d().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "ScanVariables.hashMapCheckBox.keys");
            if (CollectionsKt___CollectionsKt.contains(setKeySet, md5Var.getVulnerabilityCode())) {
                checkBox.setVisibility(0);
                checkBox.setChecked(false);
                dq7.v0(button2, ColorStateList.valueOf(Color.parseColor("#e8f6ff")));
                checkBox.setText("I accept the risk and proceed");
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.om5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        ScanAlerts.W(button2, compoundButton, z);
                    }
                });
            }
        } else if (Intrinsics.areEqual(md5Var.getVulnerabilityActionRequired(), scanUtils.S(aVar.C(), nativeInteractor.Z0()))) {
            this.i = true;
            t();
            nn3 nn3Var2 = nn3.a;
            nn3Var2.f("CustomAlert", "Close And Clear App Data :" + md5Var.getVulnerabilityCode() + ' ' + ((Object) md5Var.getRedirecturl()));
            String strM = nativeInteractor.m("aHR0cHM=");
            String redirecturl = md5Var.getRedirecturl();
            Intrinsics.checkNotNull(redirecturl);
            if (StringsKt__StringsKt.contains$default((CharSequence) redirecturl, (CharSequence) strM, false, 2, (Object) null)) {
                nn3Var2.f("UrlCheck", "Close And Clear App Data :" + md5Var.getVulnerabilityCode() + ' ' + ((Object) md5Var.getRedirecturl()));
                ScanCore scanCore = ScanCore.a;
                Context contextC2 = aVar.C();
                String redirecturl2 = md5Var.getRedirecturl();
                Intrinsics.checkNotNull(redirecturl2);
                scanCore.l1(contextC2, redirecturl2);
                Context applicationContext = aVar.C().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "mAppContext.applicationContext");
                nativeInteractor.o(applicationContext, scanCore.T("ZS0wMjc="));
                return;
            }
            x(button, button2, md5Var, alertDialog);
        }
        HashMap map = this.f;
        Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        map.put(vulnerabilityCode, new hk1(md5Var.getVulnerabilityCode(), alertDialog));
        HashMap map2 = this.g;
        Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode2);
        map2.put(vulnerabilityCode2, md5Var);
        HashMap map3 = this.h;
        Activity activityR = aVar.r();
        if (((ArrayList) map3.get(String.valueOf(activityR == null ? null : activityR.getLocalClassName()))) != null && (!r11.isEmpty())) {
            HashMap map4 = this.h;
            Activity activityR2 = aVar.r();
            ArrayList arrayList = (ArrayList) map4.get(String.valueOf(activityR2 != null ? activityR2.getLocalClassName() : null));
            if (arrayList != null) {
                arrayList.add(new hk1(md5Var.getVulnerabilityCode(), alertDialog));
            }
        } else {
            HashMap map5 = this.h;
            Activity activityR3 = aVar.r();
            String localClassName = activityR3 == null ? null : activityR3.getLocalClassName();
            Intrinsics.checkNotNull(localClassName);
            map5.put(localClassName.toString(), new ArrayList());
            HashMap map6 = this.h;
            Activity activityR4 = aVar.r();
            ArrayList arrayList2 = (ArrayList) map6.get(String.valueOf(activityR4 == null ? null : activityR4.getLocalClassName()));
            if (arrayList2 != null) {
                arrayList2.add(new hk1(md5Var.getVulnerabilityCode(), alertDialog));
            }
            nn3 nn3Var3 = nn3.a;
            HashMap map7 = this.h;
            Activity activityR5 = aVar.r();
            String localClassName2 = activityR5 != null ? activityR5.getLocalClassName() : null;
            Intrinsics.checkNotNull(localClassName2);
            nn3Var3.f("MemoryLeak_Solution", String.valueOf(map7.get(localClassName2.toString())));
        }
        Activity activityR6 = aVar.r();
        Intrinsics.checkNotNull(activityR6);
        if (activityR6.isFinishing()) {
            return;
        }
        Integer vulnerabilityCode3 = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode3 != null && vulnerabilityCode3.intValue() == 215) {
            nn3.a.f("AlertTestCU", Intrinsics.stringPlus("Custom alert showing show ", alertDialog));
        }
        alertDialog.show();
        if (alertDialog.isShowing()) {
            return;
        }
        v(alertDialog);
    }

    public final void X(final md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            nn3 nn3Var = nn3.a;
            nn3Var.f("CustomAlert", "handle call back alert :" + ((Object) response.getVulnerabilityTitle()) + ':' + ((Object) response.getVulnerabilityResponse()));
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 0) {
                return;
            }
            if (response.getVulnerabilityMessage() != null && response.getVulnerabilityTitle() != null && response.getVulnerabilityActionRequired() != null && response.getVulnerabilityResponse() != null) {
                String vulnerabilityResponse = response.getVulnerabilityResponse();
                ScanUtils scanUtils = ScanUtils.a;
                jt.a aVar = jt.c;
                Context contextC = aVar.C();
                NativeInteractor nativeInteractor = NativeInteractor.a;
                if (!Intrinsics.areEqual(vulnerabilityResponse, scanUtils.S(contextC, nativeInteractor.u1()))) {
                    if (Intrinsics.areEqual(response.getVulnerabilityResponse(), scanUtils.S(aVar.C(), nativeInteractor.U0()))) {
                        nn3Var.f(this.a, "======>>>> T: 2: code: " + response.getVulnerabilityCode() + " -- " + ((Object) response.getVulnerabilityTitle()));
                        if (ScanCore.a.U0()) {
                            g0(response);
                            return;
                        } else {
                            f0(response);
                            return;
                        }
                    }
                    return;
                }
                nn3Var.f(this.a, "======>>>> TTT: skipVulnerabilitiesFlagList: ###1 : " + aVar.O() + " --- receivedVulnerabilityCallbackFlagList: " + aVar.K() + " ---- Current code: " + response.getVulnerabilityCode() + "-- " + ((Object) response.getVulnerabilityTitle()));
                if (CollectionsKt___CollectionsKt.contains(aVar.O(), response.getVulnerabilityCode()) || CollectionsKt___CollectionsKt.contains(aVar.K(), response.getVulnerabilityCode())) {
                    Integer vulnerabilityCode2 = response.getVulnerabilityCode();
                    if (vulnerabilityCode2 == null || vulnerabilityCode2.intValue() != 215 || Intrinsics.areEqual(response.getVulnerabilityActionRequired(), eg5.a.m())) {
                        return;
                    }
                    Activity activityR = aVar.r();
                    Intrinsics.checkNotNull(activityR);
                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.hm5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanAlerts.Y(response, this);
                        }
                    });
                    return;
                }
                nn3Var.f(this.a, Intrinsics.stringPlus("======>>>> TTT: skipVulnerabilitiesFlagList: ###2 : ", aVar.O()));
                Integer vulnerabilityCode3 = response.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode3);
                aVar.l0(vulnerabilityCode3.intValue());
                if (ScanCore.a.U0()) {
                    d0(response);
                    if (Intrinsics.areEqual(response.getVulnerabilityActionRequired(), eg5.a.m())) {
                        return;
                    }
                    HashMap map = this.g;
                    Integer vulnerabilityCode4 = response.getVulnerabilityCode();
                    Intrinsics.checkNotNull(vulnerabilityCode4);
                    map.put(vulnerabilityCode4, response);
                    return;
                }
                aVar.v0(aVar.n() + 1);
                B(response);
                if (Intrinsics.areEqual(response.getVulnerabilityActionRequired(), nativeInteractor.e1())) {
                    Integer vulnerabilityCode5 = response.getVulnerabilityCode();
                    Intrinsics.checkNotNull(vulnerabilityCode5);
                    aVar.b(vulnerabilityCode5.intValue());
                }
            }
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus("handleCallbacksAlerts", e), e);
        }
    }

    public final void Z(int i) {
        if (i == 228) {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.finish();
            Process.killProcess(Process.myPid());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:2:0x0000, B:6:0x000b, B:47:0x00a8, B:48:0x00d0, B:8:0x0013, B:13:0x0022, B:18:0x0031, B:23:0x0040, B:28:0x004f, B:33:0x005e, B:38:0x006c, B:44:0x007c, B:41:0x0073, B:36:0x0065, B:31:0x0056, B:26:0x0047, B:21:0x0038, B:16:0x0029, B:11:0x001a), top: B:52:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(final com.zepto.md5 r6, final android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.main.scan.ScanAlerts.a0(com.zepto.md5, android.view.View):void");
    }

    public final if5 c0(int i) {
        if (i != 10 && i != 17 && i != 47 && i != 207 && i != 219 && i != 235 && i != 250) {
            return null;
        }
        wt4.a aVar = wt4.b;
        if (!(!aVar.b().isEmpty())) {
            return null;
        }
        for (if5 if5Var : aVar.b()) {
            if (if5Var.getRuleid() == i) {
                return if5Var;
            }
        }
        return null;
    }

    public final void d0(md5 md5Var) {
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.c(md5Var);
    }

    public final md5 e0(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Integer numValueOf = Integer.valueOf(ruleObject.getRuleid());
        String title = ruleObject.getTitle();
        String strS = ScanUtils.a.S(jt.c.C(), NativeInteractor.a.u1());
        String msg = ruleObject.getMsg();
        String ruleaction = ruleObject.getRuleaction();
        String shortdescription = ruleObject.getShortdescription();
        Intrinsics.checkNotNull(shortdescription);
        String recommendation = ruleObject.getRecommendation();
        Intrinsics.checkNotNull(recommendation);
        String redirecturl = ruleObject.getRedirecturl();
        Intrinsics.checkNotNull(redirecturl);
        return new md5(numValueOf, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, ruleObject.getForceCloseTime(), ruleObject.getClearDataFlag());
    }

    public final void f0(md5 md5Var) {
        Integer vulnerabilityCode;
        Integer vulnerabilityCode2;
        Integer vulnerabilityCode3;
        Integer vulnerabilityCode4;
        Integer vulnerabilityCode5;
        Integer vulnerabilityCode6;
        Integer vulnerabilityCode7;
        Integer vulnerabilityCode8;
        Integer vulnerabilityCode9;
        Integer vulnerabilityCode10;
        Integer vulnerabilityCode11;
        Integer vulnerabilityCode12;
        Integer vulnerabilityCode13;
        Integer vulnerabilityCode14;
        Integer vulnerabilityCode15;
        Integer vulnerabilityCode16 = md5Var.getVulnerabilityCode();
        if ((vulnerabilityCode16 != null && vulnerabilityCode16.intValue() == 30) || (((vulnerabilityCode = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode.intValue() == 25) || (((vulnerabilityCode2 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode2.intValue() == 24) || (((vulnerabilityCode3 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode3.intValue() == 41) || (((vulnerabilityCode4 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode4.intValue() == 44) || (((vulnerabilityCode5 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode5.intValue() == 233) || (((vulnerabilityCode6 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode6.intValue() == 31) || (((vulnerabilityCode7 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode7.intValue() == 35) || (((vulnerabilityCode8 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode8.intValue() == 43) || (((vulnerabilityCode9 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode9.intValue() == 204) || (((vulnerabilityCode10 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode10.intValue() == 223) || (((vulnerabilityCode11 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode11.intValue() == 11) || (((vulnerabilityCode12 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode12.intValue() == 46) || (((vulnerabilityCode13 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode13.intValue() == 6) || (((vulnerabilityCode14 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode14.intValue() == 226) || ((vulnerabilityCode15 = md5Var.getVulnerabilityCode()) != null && vulnerabilityCode15.intValue() == 10)))))))))))))))) {
            E(md5Var);
        }
    }

    public final void g0(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        if (CollectionsKt___CollectionsKt.contains(aVar.u(), response.getVulnerabilityCode())) {
            List listU = aVar.u();
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            listU.remove(vulnerabilityCode);
        }
        jt.a aVar2 = jt.c;
        if (CollectionsKt___CollectionsKt.contains(aVar2.K(), response.getVulnerabilityCode())) {
            aVar2.K().remove(response.getVulnerabilityCode());
            mo5 mo5Var = mo5.a;
            if (!mo5Var.c().containsKey(response.getVulnerabilityCode())) {
                e41.m.c(response, aVar.p());
            }
            if (mo5Var.c().containsKey(response.getVulnerabilityCode()) && Intrinsics.areEqual(response.getVulnerabilityActionRequired(), NativeInteractor.a.e1())) {
                e41.m.c(response, aVar.p());
            }
            if (CollectionsKt___CollectionsKt.contains(aVar.f(), response.getVulnerabilityCode())) {
                aVar.f().remove(response.getVulnerabilityCode());
            }
            if (CollectionsKt___CollectionsKt.contains(aVar2.A(), response.getVulnerabilityCode())) {
                aVar2.A().remove(response.getVulnerabilityCode());
                j70 j70VarK = aVar.k();
                Intrinsics.checkNotNull(j70VarK);
                j70VarK.e(response);
            }
        }
    }

    public final void h0(boolean z) {
        this.i = z;
    }

    public final void m(md5 md5Var) {
        try {
            Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            if5 if5VarQ = Q(vulnerabilityCode.intValue());
            String ruleaction = if5VarQ == null ? null : if5VarQ.getRuleaction();
            if (ruleaction == null || Intrinsics.areEqual(md5Var.getVulnerabilityActionRequired(), ruleaction)) {
                return;
            }
            Log.e("protected", Intrinsics.stringPlus("action miss match:", md5Var.getVulnerabilityCode()));
            k16.a.a(jt.c.C());
        } catch (Exception e) {
            nn3.a.b(this.a, e.toString(), e);
        }
    }

    public final void n(String blockListApp) {
        String appHashOne;
        String appHashTwo;
        String appHashThree;
        Intrinsics.checkNotNullParameter(blockListApp, "blockListApp");
        try {
            tm5.a aVar = tm5.f;
            if (aVar.b().contains(blockListApp)) {
                nq nqVar = this.j;
                Intrinsics.checkNotNull(nqVar);
                if (!nqVar.C().contains(blockListApp)) {
                    nq nqVar2 = this.j;
                    Intrinsics.checkNotNull(nqVar2);
                    nqVar2.C().add(blockListApp);
                }
            } else {
                y60 y60VarH = l06.e.a().h(blockListApp);
                if (y60VarH != null && (appHashOne = y60VarH.getAppHashOne()) != null && appHashOne.length() != 0 && (appHashTwo = y60VarH.getAppHashTwo()) != null && appHashTwo.length() != 0 && (appHashThree = y60VarH.getAppHashThree()) != null && appHashThree.length() != 0 && (CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashOne()) || CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashTwo()) || CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashThree()))) {
                    nq nqVar3 = this.j;
                    Intrinsics.checkNotNull(nqVar3);
                    if (!nqVar3.C().contains(blockListApp)) {
                        nq nqVar4 = this.j;
                        Intrinsics.checkNotNull(nqVar4);
                        nqVar4.C().add(blockListApp);
                    }
                }
            }
        } catch (Exception e) {
            nn3.a.f(this.a, e.toString());
        }
    }

    public final void o() {
        nn3 nn3Var = nn3.a;
        jt.a aVar = jt.c;
        nn3Var.f("45repubmdwfnew", Intrinsics.stringPlus("", aVar.K()));
        Iterator it = aVar.K().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List listJ = jt.c.J();
            if5 if5Var = null;
            Object obj = null;
            if (listJ != null) {
                Iterator it2 = listJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((if5) next).getRuleid() == iIntValue) {
                        obj = next;
                        break;
                    }
                }
                if5Var = (if5) obj;
            }
            if (if5Var != null && Intrinsics.areEqual(if5Var.getRuleaction(), NativeInteractor.a.e1())) {
                RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
                if (!aVar2.u().contains(Integer.valueOf(if5Var.getRuleid()))) {
                    aVar2.u().add(Integer.valueOf(if5Var.getRuleid()));
                }
            }
        }
    }

    public final void p(md5 response, int i) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (CollectionsKt___CollectionsKt.contains(this.e, response.getVulnerabilityCode())) {
            return;
        }
        List list = this.e;
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        list.add(vulnerabilityCode);
        jt.a aVar = jt.c;
        String strI0 = aVar.i0();
        if (strI0 == null || strI0.length() == 0) {
            ScanUtils.a.C(Intrinsics.stringPlus(ScanCore.a.T("cmlkOg=="), response.getVulnerabilityCode()));
            Integer vulnerabilityCode2 = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode2);
            Z(vulnerabilityCode2.intValue());
            return;
        }
        if (!Intrinsics.areEqual(aVar.i0(), "online")) {
            ScanUtils.a.C(Intrinsics.stringPlus(ScanCore.a.T("cmlkOg=="), response.getVulnerabilityCode()));
            Integer vulnerabilityCode3 = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode3);
            Z(vulnerabilityCode3.intValue());
            return;
        }
        List listJ = aVar.J();
        if (listJ == null || listJ.isEmpty()) {
            nn3.a.f(this.a, "" + ((Object) aVar.i0()) + " unable to get Server rules ");
            ScanUtils.a.C(Intrinsics.stringPlus(ScanCore.a.T("cmlkOg=="), response.getVulnerabilityCode()));
            Integer vulnerabilityCode4 = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode4);
            Z(vulnerabilityCode4.intValue());
            return;
        }
        List listJ2 = aVar.J();
        if5 if5Var = null;
        Object obj = null;
        if (listJ2 != null) {
            Iterator it = listJ2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int ruleid = ((if5) next).getRuleid();
                Integer vulnerabilityCode5 = response.getVulnerabilityCode();
                if (vulnerabilityCode5 != null && ruleid == vulnerabilityCode5.intValue()) {
                    obj = next;
                    break;
                }
            }
            if5Var = (if5) obj;
        }
        if (if5Var == null) {
            nn3.a.f(this.a, Intrinsics.stringPlus("may be rule have delete", response.getVulnerabilityCode()));
            return;
        }
        if (Intrinsics.areEqual(if5Var.getRuleaction(), response.getVulnerabilityActionRequired())) {
            nn3.a.f(this.a, "" + ((Object) jt.c.i0()) + " rule action not change so do close");
            ScanUtils.a.C(Intrinsics.stringPlus(ScanCore.a.T("cmlkOg=="), response.getVulnerabilityCode()));
            Integer vulnerabilityCode6 = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode6);
            Z(vulnerabilityCode6.intValue());
            return;
        }
        nn3.a.f(this.a, Intrinsics.stringPlus("final rules", Integer.valueOf(if5Var.getRuleid())));
        if (i != 1) {
            r(i, response, if5Var);
            return;
        }
        this.i = false;
        F(if5Var.getRuleid());
        ScanUtils scanUtils = ScanUtils.a;
        if (scanUtils.h0()) {
            scanUtils.d1(false);
        }
        if (this.g.keySet().contains(Integer.valueOf(if5Var.getRuleid()))) {
            this.g.remove(Integer.valueOf(if5Var.getRuleid()));
        }
        Set setKeySet = this.g.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "hashMapForActionReScan.keys");
        try {
            scanUtils.w0(CollectionsKt___CollectionsKt.toMutableList((Collection) setKeySet));
        } catch (Exception e) {
            nn3.c(nn3.a, this.a, e.toString(), null, 4, null);
        }
    }

    public final void q(RecyclerView recyclerView, md5 md5Var, AlertDialog alertDialog, Button button, Button button2, CheckBox checkBox) {
        Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 215) {
            this.j = new nq(md5Var);
            String blockListApp = md5Var.getBlockListApp();
            Intrinsics.checkNotNull(blockListApp);
            n(blockListApp);
            recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
            recyclerView.setAdapter(this.j);
        } else {
            Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
            if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 12) {
                nq nqVar = new nq(md5Var);
                this.k = nqVar;
                Intrinsics.checkNotNull(nqVar);
                if (!CollectionsKt___CollectionsKt.contains(nqVar.C(), md5Var.getBlockListApp())) {
                    nq nqVar2 = this.k;
                    Intrinsics.checkNotNull(nqVar2);
                    ArrayList arrayListC = nqVar2.C();
                    String blockListApp2 = md5Var.getBlockListApp();
                    Intrinsics.checkNotNull(blockListApp2);
                    arrayListC.add(blockListApp2);
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
                recyclerView.setAdapter(this.k);
            } else {
                Integer vulnerabilityCode3 = md5Var.getVulnerabilityCode();
                if (vulnerabilityCode3 != null && vulnerabilityCode3.intValue() == 44) {
                    this.l = new nq(md5Var);
                    Type type = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanAlerts$appBlockListingViewSetup$type$1
                    }.getType();
                    Gson gson = new Gson();
                    String blockListApp3 = md5Var.getBlockListApp();
                    Intrinsics.checkNotNull(blockListApp3);
                    for (String str : ((HashMap) gson.fromJson(blockListApp3, type)).keySet()) {
                        nq nqVar3 = this.l;
                        Intrinsics.checkNotNull(nqVar3);
                        if (!nqVar3.C().contains(str)) {
                            nq nqVar4 = this.l;
                            Intrinsics.checkNotNull(nqVar4);
                            nqVar4.C().add(str);
                        }
                    }
                    recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
                    recyclerView.setAdapter(this.l);
                } else {
                    Integer vulnerabilityCode4 = md5Var.getVulnerabilityCode();
                    if (vulnerabilityCode4 != null && vulnerabilityCode4.intValue() == 35) {
                        this.m = new nq(md5Var);
                        Type type2 = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanAlerts$appBlockListingViewSetup$type$2
                        }.getType();
                        Gson gson2 = new Gson();
                        String blockListApp4 = md5Var.getBlockListApp();
                        Intrinsics.checkNotNull(blockListApp4);
                        for (String str2 : ((HashMap) gson2.fromJson(blockListApp4, type2)).keySet()) {
                            nq nqVar5 = this.m;
                            Intrinsics.checkNotNull(nqVar5);
                            if (!nqVar5.C().contains(str2)) {
                                nq nqVar6 = this.m;
                                Intrinsics.checkNotNull(nqVar6);
                                nqVar6.C().add(str2);
                            }
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
                        recyclerView.setAdapter(this.m);
                    } else {
                        Integer vulnerabilityCode5 = md5Var.getVulnerabilityCode();
                        if (vulnerabilityCode5 != null && vulnerabilityCode5.intValue() == 6) {
                            this.n = new nq(md5Var);
                            for (String str3 : ScanCore.a.I0()) {
                                nq nqVar7 = this.n;
                                Intrinsics.checkNotNull(nqVar7);
                                if (!nqVar7.C().contains(str3)) {
                                    nq nqVar8 = this.n;
                                    Intrinsics.checkNotNull(nqVar8);
                                    nqVar8.C().add(str3);
                                }
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
                            recyclerView.setAdapter(this.n);
                        } else {
                            Integer vulnerabilityCode6 = md5Var.getVulnerabilityCode();
                            if (vulnerabilityCode6 != null && vulnerabilityCode6.intValue() == 226) {
                                this.o = new nq(md5Var);
                                for (String str4 : ScanCore.a.J0()) {
                                    nq nqVar9 = this.o;
                                    Intrinsics.checkNotNull(nqVar9);
                                    if (!nqVar9.C().contains(str4)) {
                                        nq nqVar10 = this.o;
                                        Intrinsics.checkNotNull(nqVar10);
                                        nqVar10.C().add(str4);
                                    }
                                }
                                recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
                                recyclerView.setAdapter(this.o);
                            }
                        }
                    }
                }
            }
        }
        R(button, alertDialog, button2, md5Var, checkBox);
    }

    public final void r(int i, md5 md5Var, if5 if5Var) {
        nn3.a.f("Type45", "" + i + ' ' + md5Var.getVulnerabilityCode() + " older:- " + ((Object) md5Var.getVulnerabilityActionRequired()) + " New:-" + ((Object) if5Var.getRuleaction()));
        RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
        aVar.z(null);
        if (aVar.n() != null) {
            com.google.android.material.bottomsheet.a aVarN = aVar.n();
            Intrinsics.checkNotNull(aVarN);
            if (aVarN.isShowing()) {
                com.google.android.material.bottomsheet.a aVarN2 = aVar.n();
                Intrinsics.checkNotNull(aVarN2);
                aVarN2.dismiss();
                Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode);
                aVar.y(vulnerabilityCode.intValue());
            }
        }
        if (Intrinsics.areEqual(if5Var.getRuleaction(), NativeInteractor.a.d1())) {
            jt.c.c(if5Var.getRuleid());
        } else {
            o();
        }
        Activity activityR = jt.c.r();
        Intrinsics.checkNotNull(activityR);
        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.jm5
            @Override // java.lang.Runnable
            public final void run() {
                ScanAlerts.s();
            }
        });
    }

    public final void t() {
        ScanUtils scanUtils = ScanUtils.a;
        if (!scanUtils.v0()) {
            y03.a aVar = y03.e;
            jt.a aVar2 = jt.c;
            if (aVar.b(aVar2.C())) {
                s06 s06VarA = s06.m.a();
                String strO = s06VarA == null ? null : s06VarA.o();
                if (strO != null && strO.length() != 0 && NativeInteractor.a.getSessionToken().length() > 0 && scanUtils.V(aVar2.C())) {
                    f80.d(qj2.c, qk1.a(), null, new a(null), 2, null);
                    return;
                }
            }
        }
        nn3 nn3Var = nn3.a;
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("SA");
        sb.append(scanUtils.v0());
        sb.append("Net");
        y03.a aVar3 = y03.e;
        jt.a aVar4 = jt.c;
        sb.append(aVar3.b(aVar4.C()));
        sb.append("Token");
        s06 s06VarA2 = s06.m.a();
        String strO2 = s06VarA2 != null ? s06VarA2.o() : null;
        sb.append(strO2 == null || strO2.length() == 0);
        sb.append("WifiCA");
        sb.append(scanUtils.V(aVar4.C()));
        sb.append("SessionId");
        sb.append(NativeInteractor.a.getSessionToken().length() > 0);
        nn3Var.f(str, sb.toString());
    }

    public final void u() {
        String strQ;
        ScanUtils scanUtils = ScanUtils.a;
        if (!scanUtils.v0()) {
            y03.a aVar = y03.e;
            jt.a aVar2 = jt.c;
            if (aVar.b(aVar2.C())) {
                s06 s06VarA = s06.m.a();
                String strO = s06VarA == null ? null : s06VarA.o();
                if (strO != null && strO.length() != 0) {
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    if (nativeInteractor.getSessionToken().length() > 0 && scanUtils.V(aVar2.C()) && (strQ = nativeInteractor.q()) != null && strQ.length() != 0) {
                        f80.d(qj2.c, qk1.a(), null, new b(null), 2, null);
                        return;
                    }
                }
            }
        }
        nn3 nn3Var = nn3.a;
        String str = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("SA");
        sb.append(scanUtils.v0());
        sb.append("Net");
        y03.a aVar3 = y03.e;
        jt.a aVar4 = jt.c;
        sb.append(aVar3.b(aVar4.C()));
        sb.append("Token");
        s06 s06VarA2 = s06.m.a();
        String strO2 = s06VarA2 != null ? s06VarA2.o() : null;
        sb.append(strO2 == null || strO2.length() == 0);
        sb.append("WifiCA");
        sb.append(scanUtils.V(aVar4.C()));
        sb.append("SessionId");
        sb.append(NativeInteractor.a.getSessionToken().length() > 0);
        nn3Var.f(str, sb.toString());
    }

    public final void v(AlertDialog alertDialog) {
        jt.a aVar = jt.c;
        aVar.v0(aVar.n() - 1);
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(67108864);
        Activity activityR = aVar.r();
        if (activityR != null) {
            activityR.startActivity(intent);
        }
        Iterator it = aVar.d().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void x(final Button button, Button button2, final md5 md5Var, AlertDialog alertDialog) {
        button.setVisibility(0);
        button2.setVisibility(8);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanAlerts.y(this.a, md5Var, view);
            }
        });
        final int forceCloseTime = md5Var.getForceCloseTime();
        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.zepto.rm5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ScanAlerts.z(button, forceCloseTime, md5Var, this, dialogInterface);
            }
        });
    }
}
