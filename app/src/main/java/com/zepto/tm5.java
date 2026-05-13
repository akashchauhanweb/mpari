package com.zepto;

import ai.protectt.app.security.common.helper.AppBlackListingSharedPreferenceHelper;
import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zepto.jt;
import com.zepto.tm5;
import java.io.File;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tm5 {
    public static tm5 g;
    public static boolean h;
    public static boolean i;
    public final String a;
    public final Context b;
    public final pd1 c;
    public final s06 d;
    public final l06 e;
    public static final a f = new a(null);
    public static String j = "";
    public static final ArrayList k = new ArrayList();
    public static List l = new ArrayList();
    public static List m = new ArrayList();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return tm5.m;
        }

        public final List b() {
            return tm5.l;
        }

        public final boolean c() {
            return tm5.h;
        }

        public final tm5 d() {
            return tm5.g;
        }

        public final void e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            k(new tm5(context));
        }

        public final boolean f() {
            return tm5.i;
        }

        public final void g(boolean z) {
            tm5.i = z;
        }

        public final void h(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            tm5.m = list;
        }

        public final void i(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            tm5.l = list;
        }

        public final void j(boolean z) {
            tm5.h = z;
        }

        public final void k(tm5 tm5Var) {
            tm5.g = tm5Var;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ tm5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if5 if5Var, tm5 tm5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = tm5Var;
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
                List<ml4> addparmsList = this.e.getAddparmsList();
                if (addparmsList != null && !addparmsList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    List<ml4> addparmsList2 = this.e.getAddparmsList();
                    Intrinsics.checkNotNull(addparmsList2);
                    for (ml4 ml4Var : addparmsList2) {
                        if (!CollectionsKt___CollectionsKt.contains(arrayList, ml4Var.getAddpar1())) {
                            String addpar1 = ml4Var.getAddpar1();
                            Intrinsics.checkNotNull(addpar1);
                            arrayList.add(addpar1);
                        }
                        if (!CollectionsKt___CollectionsKt.contains(arrayList2, ml4Var.getAddpar2())) {
                            String addpar2 = ml4Var.getAddpar2();
                            Intrinsics.checkNotNull(addpar2);
                            arrayList2.add(addpar2);
                        }
                    }
                    a aVar = tm5.f;
                    aVar.i(arrayList);
                    aVar.h(arrayList2);
                }
                a aVar2 = tm5.f;
                if (aVar2.b().isEmpty() && aVar2.a().isEmpty()) {
                    nn3.a.f(this.f.a, "No Need to Validate Because AddParams are empty");
                } else {
                    nn3.a.f(this.f.a, "App Black-list Scan Start");
                    this.f.B(aVar2.b(), aVar2.a(), this.e);
                }
            } catch (Exception e) {
                nn3.a.b(this.f.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List e;
        public final /* synthetic */ tm5 f;
        public final /* synthetic */ List g;
        public final /* synthetic */ if5 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, tm5 tm5Var, List list2, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = list;
            this.f = tm5Var;
            this.g = list2;
            this.h = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((c) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String appHashTwo;
            String appHashThree;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                for (PackageInfo packageInfo : this.e) {
                    if (!this.f.F(packageInfo)) {
                        String pKey = packageInfo.packageName;
                        l06 l06Var = this.f.e;
                        Intrinsics.checkNotNullExpressionValue(pKey, "pKey");
                        y60 y60VarH = l06Var.h(pKey);
                        if (y60VarH != null) {
                            String appHashOne = y60VarH.getAppHashOne();
                            if (appHashOne == null || appHashOne.length() == 0 || (appHashTwo = y60VarH.getAppHashTwo()) == null || appHashTwo.length() == 0 || (appHashThree = y60VarH.getAppHashThree()) == null || appHashThree.length() == 0 || !Intrinsics.areEqual(packageInfo.versionName, y60VarH.getAppVersion())) {
                                co3 co3Var = co3.a;
                                File file = new File(packageInfo.applicationInfo.sourceDir);
                                NativeInteractor nativeInteractor = NativeInteractor.a;
                                String strU = co3Var.u(file, nativeInteractor.H());
                                String strU2 = co3Var.u(new File(packageInfo.applicationInfo.sourceDir), nativeInteractor.J());
                                String strU3 = co3Var.u(new File(packageInfo.applicationInfo.sourceDir), nativeInteractor.I());
                                this.f.G(packageInfo, strU, strU2, strU3);
                                String strC = this.f.C(this.g, strU, strU2, strU3);
                                if (strC.length() > 0) {
                                    this.f.x(packageInfo.packageName + '|' + ((Object) packageInfo.versionName) + '(' + strC + ')');
                                    tm5 tm5Var = this.f;
                                    if5 if5Var = this.h;
                                    String str = packageInfo.packageName;
                                    Intrinsics.checkNotNullExpressionValue(str, "appInfo.packageName");
                                    tm5Var.K(if5Var, str, "HashValue empty add");
                                }
                            } else {
                                String strC2 = this.f.C(this.g, y60VarH.getAppHashOne(), y60VarH.getAppHashTwo(), y60VarH.getAppHashThree());
                                if (strC2.length() > 0) {
                                    this.f.x(packageInfo.packageName + '|' + ((Object) packageInfo.versionName) + '(' + strC2 + ')');
                                    tm5 tm5Var2 = this.f;
                                    if5 if5Var2 = this.h;
                                    String str2 = packageInfo.packageName;
                                    Intrinsics.checkNotNullExpressionValue(str2, "appInfo.packageName");
                                    tm5Var2.K(if5Var2, str2, "HashValue already exit");
                                }
                            }
                        } else {
                            co3 co3Var2 = co3.a;
                            File file2 = new File(packageInfo.applicationInfo.sourceDir);
                            NativeInteractor nativeInteractor2 = NativeInteractor.a;
                            String strU4 = co3Var2.u(file2, nativeInteractor2.H());
                            String strU5 = co3Var2.u(new File(packageInfo.applicationInfo.sourceDir), nativeInteractor2.J());
                            String strU6 = co3Var2.u(new File(packageInfo.applicationInfo.sourceDir), nativeInteractor2.I());
                            this.f.G(packageInfo, strU4, strU5, strU6);
                            String strC3 = this.f.C(this.g, strU4, strU5, strU6);
                            if (strC3.length() > 0) {
                                this.f.x(packageInfo.packageName + '|' + ((Object) packageInfo.versionName) + '(' + strC3 + ')');
                                tm5 tm5Var3 = this.f;
                                if5 if5Var3 = this.h;
                                String str3 = packageInfo.packageName;
                                Intrinsics.checkNotNullExpressionValue(str3, "appInfo.packageName");
                                tm5Var3.K(if5Var3, str3, "HashValue new insert ");
                            }
                        }
                    }
                }
                nn3 nn3Var = nn3.a;
                a aVar = tm5.f;
                nn3Var.f("TestBlock", Intrinsics.stringPlus("hash loop completed ", Boxing.boxBoolean(aVar.c())));
                aVar.j(false);
                nn3Var.f("TestBlock", Intrinsics.stringPlus("hash loop completed ", Boxing.boxBoolean(aVar.c())));
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.a, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;
        public final /* synthetic */ if5 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, List list2, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.f = list;
            this.g = list2;
            this.h = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return tm5.this.new d(this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List listD = tm5.this.e.d();
                ArrayList arrayList = new ArrayList();
                for (PackageInfo paInfo : this.f) {
                    tm5 tm5Var = tm5.this;
                    Intrinsics.checkNotNullExpressionValue(paInfo, "paInfo");
                    if (!tm5Var.F(paInfo)) {
                        List list = this.g;
                        Intrinsics.checkNotNull(list);
                        if (list.contains(paInfo.packageName)) {
                            if (!arrayList.contains(paInfo.packageName + '|' + ((Object) paInfo.versionName))) {
                                arrayList.add(paInfo.packageName + '|' + ((Object) paInfo.versionName));
                                tm5 tm5Var2 = tm5.this;
                                if5 if5Var = this.h;
                                String str = paInfo.packageName;
                                Intrinsics.checkNotNullExpressionValue(str, "paInfo.packageName");
                                tm5Var2.K(if5Var, str, "packageName");
                            }
                        }
                        if (listD.isEmpty()) {
                            tm5.this.H(paInfo);
                        } else if (!listD.contains(paInfo.packageName)) {
                            tm5.this.H(paInfo);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    nn3.a.f("AppBlockListing", "Black listing app identify");
                    tm5 tm5Var3 = tm5.this;
                    if5 if5Var2 = this.h;
                    String string = arrayList.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "listOFIdentifyPackage.toString()");
                    tm5Var3.I(if5Var2, string);
                }
            } catch (Exception e) {
                nn3.a.b(tm5.this.a, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ PackageInfo e;
        public final /* synthetic */ tm5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PackageInfo packageInfo, tm5 tm5Var, Continuation continuation) {
            super(2, continuation);
            this.e = packageInfo;
            this.f = tm5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                y60 y60Var = new y60(null, null, null, null, null, null, 63, null);
                ApplicationInfo applicationInfo = this.e.applicationInfo;
                PackageManager packageManager = this.f.b.getPackageManager();
                Intrinsics.checkNotNull(packageManager);
                y60Var.setAppName(applicationInfo.loadLabel(packageManager).toString());
                y60Var.setAppPackage(this.e.applicationInfo.packageName);
                y60Var.setAppVersion(this.e.versionName);
                AppBlackListingSharedPreferenceHelper appBlackListingSharedPreferenceHelperA = AppBlackListingSharedPreferenceHelper.f.a();
                String str = this.e.applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "paInfo.applicationInfo.packageName");
                appBlackListingSharedPreferenceHelperA.n(str, y60Var);
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.a, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ if5 f;
        public final /* synthetic */ String g;
        public final /* synthetic */ tm5 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, if5 if5Var, String str2, tm5 tm5Var, Continuation continuation) {
            super(2, continuation);
            this.e = str;
            this.f = if5Var;
            this.g = str2;
            this.h = tm5Var;
        }

        public static final void k(md5 md5Var) {
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            scanAlertsL.B(md5Var);
        }

        public static final void l(md5 md5Var) {
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            j70VarK.k(md5Var);
        }

        public static final void m(md5 md5Var) {
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            j70VarK.j(md5Var);
        }

        public static final void n(md5 md5Var) {
            j70 j70VarK = RecyclerViewInteractor.c.k();
            Intrinsics.checkNotNull(j70VarK);
            j70VarK.d(md5Var);
        }

        public static final void q() {
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            nq nqVarI = scanAlertsL.I();
            Intrinsics.checkNotNull(nqVarI);
            nqVarI.j();
        }

        public static final void r() {
            nq nqVarI = RecyclerViewInteractor.c.i();
            Intrinsics.checkNotNull(nqVarI);
            nqVarI.j();
        }

        public static final void s(if5 if5Var) {
            if (Intrinsics.areEqual(if5Var.getRuleaction(), NativeInteractor.a.e1())) {
                RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
                aVar.o().setVisibility(8);
                ConstraintLayout constraintLayoutM = aVar.m();
                if (constraintLayoutM == null) {
                    return;
                }
                constraintLayoutM.setVisibility(0);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AlertDialog vulnerabilityAlert;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ScanCore scanCore = ScanCore.a;
                if (scanCore.s0().contains(this.e)) {
                    Integer numBoxInt = Boxing.boxInt(this.f.getRuleid());
                    String title = this.f.getTitle();
                    ScanUtils scanUtils = ScanUtils.a;
                    jt.a aVar = jt.c;
                    Context contextC = aVar.C();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    String strS = scanUtils.S(contextC, nativeInteractor.u1());
                    String msg = this.f.getMsg();
                    String ruleaction = this.f.getRuleaction();
                    String str = this.e;
                    String shortdescription = this.f.getShortdescription();
                    String recommendation = this.f.getRecommendation();
                    String redirecturl = this.f.getRedirecturl();
                    Intrinsics.checkNotNull(redirecturl);
                    final md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, str, shortdescription, recommendation, redirecturl, this.f.getForceCloseTime(), this.f.getClearDataFlag());
                    if (scanCore.U0()) {
                        if (Intrinsics.areEqual(this.g, "SecondScreen") && Intrinsics.areEqual(this.f.getRuleaction(), nativeInteractor.d1())) {
                            Activity activityR = aVar.r();
                            Intrinsics.checkNotNull(activityR);
                            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.vm5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tm5.f.l(md5Var);
                                }
                            });
                        } else if (Intrinsics.areEqual(this.g, "SecondScreen") && Intrinsics.areEqual(this.f.getRuleaction(), nativeInteractor.e1())) {
                            Activity activityR2 = aVar.r();
                            Intrinsics.checkNotNull(activityR2);
                            activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.wm5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tm5.f.m(md5Var);
                                }
                            });
                        } else if (Intrinsics.areEqual(this.g, "SecondScreen") && Intrinsics.areEqual(this.f.getRuleaction(), nativeInteractor.a1())) {
                            Activity activityR3 = aVar.r();
                            Intrinsics.checkNotNull(activityR3);
                            activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.xm5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tm5.f.n(md5Var);
                                }
                            });
                        }
                    } else if (Intrinsics.areEqual(this.g, "SecondScreen")) {
                        a aVar2 = tm5.f;
                        if (!aVar2.f()) {
                            aVar2.g(true);
                            Activity activityR4 = aVar.r();
                            Intrinsics.checkNotNull(activityR4);
                            activityR4.runOnUiThread(new Runnable() { // from class: com.zepto.um5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tm5.f.k(md5Var);
                                }
                            });
                        }
                    }
                    this.h.D(this.f, this.e);
                } else if (scanCore.U0()) {
                    nq nqVarI = RecyclerViewInteractor.c.i();
                    Intrinsics.checkNotNull(nqVarI);
                    ArrayList arrayListC = nqVarI.C();
                    if (arrayListC.contains(this.e)) {
                        arrayListC.remove(this.e);
                        jt.a aVar3 = jt.c;
                        Activity activityR5 = aVar3.r();
                        Intrinsics.checkNotNull(activityR5);
                        activityR5.runOnUiThread(new Runnable() { // from class: com.zepto.zm5
                            @Override // java.lang.Runnable
                            public final void run() {
                                tm5.f.r();
                            }
                        });
                        if (arrayListC.isEmpty()) {
                            Integer numBoxInt2 = Boxing.boxInt(this.f.getRuleid());
                            String title2 = this.f.getTitle();
                            String strS2 = ScanUtils.a.S(aVar3.C(), NativeInteractor.a.u1());
                            String msg2 = this.f.getMsg();
                            String ruleaction2 = this.f.getRuleaction();
                            String str2 = this.e;
                            String shortdescription2 = this.f.getShortdescription();
                            String recommendation2 = this.f.getRecommendation();
                            String redirecturl2 = this.f.getRedirecturl();
                            Intrinsics.checkNotNull(redirecturl2);
                            md5 md5Var2 = new md5(numBoxInt2, title2, strS2, msg2, ruleaction2, str2, shortdescription2, recommendation2, redirecturl2, this.f.getForceCloseTime(), this.f.getClearDataFlag());
                            Activity activityR6 = aVar3.r();
                            Intrinsics.checkNotNull(activityR6);
                            final if5 if5Var = this.f;
                            activityR6.runOnUiThread(new Runnable() { // from class: com.zepto.an5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    tm5.f.s(if5Var);
                                }
                            });
                            ScanAlerts scanAlertsL = aVar3.L();
                            Intrinsics.checkNotNull(scanAlertsL);
                            scanAlertsL.g0(md5Var2);
                        }
                    }
                } else {
                    jt.a aVar4 = jt.c;
                    ScanAlerts scanAlertsL2 = aVar4.L();
                    Intrinsics.checkNotNull(scanAlertsL2);
                    nq nqVarI2 = scanAlertsL2.I();
                    Intrinsics.checkNotNull(nqVarI2);
                    ArrayList arrayListC2 = nqVarI2.C();
                    if (arrayListC2.contains(this.e)) {
                        arrayListC2.remove(this.e);
                        Activity activityR7 = aVar4.r();
                        Intrinsics.checkNotNull(activityR7);
                        activityR7.runOnUiThread(new Runnable() { // from class: com.zepto.ym5
                            @Override // java.lang.Runnable
                            public final void run() {
                                tm5.f.q();
                            }
                        });
                        if (arrayListC2.isEmpty()) {
                            ScanAlerts scanAlertsL3 = aVar4.L();
                            Intrinsics.checkNotNull(scanAlertsL3);
                            if (scanAlertsL3.L() != null) {
                                ScanAlerts scanAlertsL4 = aVar4.L();
                                Intrinsics.checkNotNull(scanAlertsL4);
                                if (scanAlertsL4.L().containsKey(Boxing.boxInt(215))) {
                                    if (aVar4.K().contains(Boxing.boxInt(215))) {
                                        aVar4.K().remove(Boxing.boxInt(215));
                                    }
                                    aVar4.v0(aVar4.n() - 1);
                                    ScanAlerts scanAlertsL5 = aVar4.L();
                                    Intrinsics.checkNotNull(scanAlertsL5);
                                    hk1 hk1Var = (hk1) scanAlertsL5.L().get(Boxing.boxInt(215));
                                    if (hk1Var != null && (vulnerabilityAlert = hk1Var.getVulnerabilityAlert()) != null) {
                                        vulnerabilityAlert.dismiss();
                                    }
                                    ScanAlerts scanAlertsL6 = aVar4.L();
                                    Intrinsics.checkNotNull(scanAlertsL6);
                                    scanAlertsL6.L().remove(Boxing.boxInt(215));
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                nn3.a.f("AppBlackList", Intrinsics.stringPlus("AppBlacklist : ", e));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public tm5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = "AppBlockListing";
        this.b = context;
        this.c = pd1.c.a();
        this.d = s06.m.a();
        this.e = l06.e.a();
    }

    public static final void E(String info) {
        Intrinsics.checkNotNullParameter(info, "$info");
        if (ScanCore.a.U0()) {
            nn3 nn3Var = nn3.a;
            nn3Var.f("NewUiTestApp", Intrinsics.stringPlus(".........", info));
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            if (aVar.i() == null) {
                nn3Var.f("NewUUi", Intrinsics.stringPlus("add local list", aVar.s()));
                if (aVar.s().contains(info)) {
                    return;
                }
                aVar.s().add(info);
                return;
            }
            nq nqVarI = aVar.i();
            Intrinsics.checkNotNull(nqVarI);
            ArrayList arrayListC = nqVarI.C();
            if (arrayListC.contains(info)) {
                return;
            }
            nn3Var.f("NewUUi", Intrinsics.stringPlus("rv Packages ", arrayListC));
            aVar.b(info);
            nq nqVarI2 = aVar.i();
            Intrinsics.checkNotNull(nqVarI2);
            nqVarI2.j();
            return;
        }
        jt.a aVar2 = jt.c;
        ScanAlerts scanAlertsL = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL);
        if (scanAlertsL.I() == null) {
            return;
        }
        ScanAlerts scanAlertsL2 = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        nq nqVarI3 = scanAlertsL2.I();
        Intrinsics.checkNotNull(nqVarI3);
        if (nqVarI3.C().contains(info)) {
            return;
        }
        ScanAlerts scanAlertsL3 = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL3);
        scanAlertsL3.n(info);
        ScanAlerts scanAlertsL4 = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL4);
        nq nqVarI4 = scanAlertsL4.I();
        Intrinsics.checkNotNull(nqVarI4);
        nqVarI4.j();
    }

    public final void A(if5 if5Var, List list, List list2) {
        nn3.a.f(this.a, Intrinsics.stringPlus("hash loop isRunning ", Boolean.valueOf(h)));
        if (h) {
            return;
        }
        h = true;
        List list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        f80.d(qj2.c, qk1.a(), null, new c(list2, this, list, if5Var, null), 2, null);
    }

    public final void B(List list, List list2, if5 if5Var) {
        try {
            nn3.a.f(this.a, Intrinsics.stringPlus("", jt.c.q()));
            J(if5Var, "onResume");
            PackageManager packageManager = this.b.getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "appContext.packageManage…          0\n            )");
            f80.d(qj2.c, qk1.a(), null, new d(installedPackages, list, if5Var, null), 2, null);
            A(if5Var, list2, installedPackages);
        } catch (Exception e2) {
            nn3.a.b(this.a, e2.toString(), e2);
        }
    }

    public final String C(List list, String str, String str2, String str3) {
        return list.contains(str) ? Intrinsics.stringPlus("HOne-", str) : list.contains(str2) ? Intrinsics.stringPlus("HTwo-", str2) : list.contains(str3) ? Intrinsics.stringPlus("HThree-", str3) : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(com.zepto.if5 r19, final java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tm5.D(com.zepto.if5, java.lang.String):void");
    }

    public final boolean F(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & 1) != 0;
    }

    public final void G(PackageInfo packageInfo, String str, String str2, String str3) {
        y60 y60Var = new y60(null, null, null, null, null, null, 63, null);
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        PackageManager packageManager = this.b.getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        y60Var.setAppName(applicationInfo.loadLabel(packageManager).toString());
        y60Var.setAppPackage(packageInfo.applicationInfo.packageName);
        y60Var.setAppVersion(packageInfo.versionName);
        y60Var.setAppHashOne(str);
        y60Var.setAppHashTwo(str2);
        y60Var.setAppHashThree(str3);
        AppBlackListingSharedPreferenceHelper appBlackListingSharedPreferenceHelperA = AppBlackListingSharedPreferenceHelper.f.a();
        String str4 = packageInfo.applicationInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str4, "paInfo.applicationInfo.packageName");
        appBlackListingSharedPreferenceHelperA.n(str4, y60Var);
    }

    public final void H(PackageInfo packageInfo) {
        f80.d(qj2.c, qk1.b(), null, new e(packageInfo, this, null), 2, null);
    }

    public final void I(if5 if5Var, String str) {
        if (str.length() <= 0 || Intrinsics.areEqual(str, "[]")) {
            nn3.a.f("AppBlockListing", "Black listing app is empty in this devices");
            return;
        }
        nn3.a.f("AppBlockListing", Intrinsics.stringPlus("Black listing app is identify:", str));
        s06 s06Var = this.d;
        Intrinsics.checkNotNull(s06Var);
        if5Var.setMobileSessionID(s06Var.x());
        if5Var.setThreatDateAndTime(ScanUtils.a.m1());
        s06 s06Var2 = this.d;
        Intrinsics.checkNotNull(s06Var2);
        if5Var.setThreatDetectedFlag(s06Var2.v());
        if (j.length() > 0) {
            if5Var.setResult(str + "|-|" + j);
        } else {
            if5Var.setResult(str);
        }
        this.c.j(if5Var);
    }

    public final void J(if5 rule, String from) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(from, "from");
        nn3 nn3Var = nn3.a;
        jt.a aVar = jt.c;
        nn3Var.f("AlertReFresh", Intrinsics.stringPlus("come inside", aVar.q()));
        if (!aVar.q().isEmpty()) {
            Iterator it = aVar.q().iterator();
            while (it.hasNext()) {
                K(rule, (String) it.next(), from);
            }
            return;
        }
        nn3Var.f("AlertReFresh", "......come inside....1");
        String ruleaction = rule.getRuleaction();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if ((Intrinsics.areEqual(ruleaction, nativeInteractor.e1()) || Intrinsics.areEqual(rule.getRuleaction(), nativeInteractor.d1()) || Intrinsics.areEqual(rule.getRuleaction(), nativeInteractor.a1())) && Intrinsics.areEqual(from, "SecondScreen")) {
            RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
            nn3Var.f("AlertReFresh", Intrinsics.stringPlus("......come inside", aVar2.s()));
            if (!aVar2.s().isEmpty()) {
                Iterator it2 = aVar2.s().iterator();
                while (it2.hasNext()) {
                    K(rule, (String) it2.next(), from);
                }
            }
        }
    }

    public final void K(if5 if5Var, String str, String str2) {
        nn3.a.f("validateReceiveList", "From::" + str2 + '(' + str + ')');
        f80.d(qj2.c, null, null, new f(str, if5Var, str2, this, null), 3, null);
    }

    public final String x(String str) {
        ArrayList arrayList = k;
        if (!arrayList.contains(str) && str.length() > 0) {
            arrayList.add(str);
            s06 s06Var = this.d;
            Intrinsics.checkNotNull(s06Var);
            this.d.F(s06Var.x() + "||" + arrayList);
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        String string = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(string, "{\n            blockingAp…List.toString()\n        }");
        return string;
    }

    public final void y(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        if (j.length() == 0 && z().length() > 0) {
            j = z();
            s06 s06Var = this.d;
            Intrinsics.checkNotNull(s06Var);
            s06Var.F("");
        }
        jt.a aVar = jt.c;
        if (aVar.O().contains(Integer.valueOf(ruleObject.getRuleid()))) {
            return;
        }
        if (Intrinsics.areEqual(ruleObject.getRuleaction(), eg5.a.m()) && aVar.K().contains(Integer.valueOf(ruleObject.getRuleid()))) {
            return;
        }
        f80.d(qj2.c, null, null, new b(ruleObject, this, null), 3, null);
    }

    public final String z() {
        s06 s06Var = this.d;
        Intrinsics.checkNotNull(s06Var);
        String strG = s06Var.g();
        if (strG.length() <= 0) {
            return "";
        }
        nn3 nn3Var = nn3.a;
        nn3Var.f("validateReceiveList", Intrinsics.stringPlus("------------>Not empty", strG));
        if (Intrinsics.areEqual(StringsKt__StringsKt.split$default((CharSequence) strG, new String[]{"||"}, false, 0, 6, (Object) null).get(0), this.d.x())) {
            return "";
        }
        nn3Var.f("validateReceiveList", "------------> insert old data");
        return Intrinsics.stringPlus("HashValue Results:", strG);
    }
}
