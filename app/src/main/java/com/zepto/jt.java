package com.zepto;

import ai.protectt.app.security.common.helper.AppBlackListingSharedPreferenceHelper;
import ai.protectt.app.security.common.helper.LoggingService;
import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.common.helper.RuleConfigSharedPreferenceHelper;
import ai.protectt.app.security.common.helper.SkipAlertSharePref;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.zepto.kw3;
import com.zepto.nt;
import com.zepto.ru5;
import com.zepto.s06;
import com.zepto.y03;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class jt implements pt, kt, ot, mt {
    public static long A;
    public static boolean B;
    public static String C;
    public static zy D;
    public static List F;
    public static ni0 G;
    public static long I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean N;
    public static boolean P;
    public static boolean Q;
    public static boolean R;
    public static boolean X;
    public static Activity Y;
    public static String Z;
    public static List a0;
    public static String b0;
    public static String c0;
    public static int d;
    public static ScanAlerts d0;
    public static int e;
    public static Context e0;
    public static boolean f;
    public static nt f0;
    public static int g;
    public static qq0 h;
    public static kt j;
    public static ot k;
    public static boolean k0;
    public static if5 l;
    public static Boolean l0;
    public static Boolean m0;
    public static String t;
    public static boolean u;
    public static boolean v;
    public static boolean x;
    public static boolean z;
    public final Context a;
    public final String b;
    public static final a c = new a(null);
    public static String i = "";
    public static List m = new ArrayList();
    public static List n = new ArrayList();
    public static List o = new ArrayList();
    public static List p = new ArrayList();
    public static List q = new ArrayList();
    public static final List r = new ArrayList();
    public static final List s = new ArrayList();
    public static boolean w = true;
    public static boolean y = true;
    public static List E = new ArrayList();
    public static int H = 1;
    public static List M = new ArrayList();
    public static String O = "";
    public static String S = "";
    public static List T = new ArrayList();
    public static List U = new ArrayList();
    public static ArrayList V = new ArrayList();
    public static List W = new ArrayList();
    public static String g0 = "";
    public static String h0 = "";
    public static String i0 = "";
    public static String j0 = "";
    public static String n0 = "";
    public static String o0 = "";
    public static String p0 = "";

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.jt$a$a, reason: collision with other inner class name */
        public static final class C0097a implements Application.ActivityLifecycleCallbacks {
            public final /* synthetic */ Application a;

            public C0097a(Application application) {
                this.a = application;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                qn3 qn3Var = qn3.a;
                if (qn3Var.f().length() > 0) {
                    String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
                    Intrinsics.checkNotNull(qualifiedName);
                    if (StringsKt__StringsKt.contains$default((CharSequence) qualifiedName, (CharSequence) qn3Var.f(), false, 2, (Object) null)) {
                        nn3.c(nn3.a, "ActivityCallback", Intrinsics.stringPlus("", qn3Var.f()), null, 4, null);
                        return;
                    }
                }
                a aVar = jt.c;
                aVar.z0(activity);
                Context applicationContext = this.a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                aVar.K0(applicationContext);
                try {
                    if (aVar.M() != null) {
                        ot otVarM = aVar.M();
                        Intrinsics.checkNotNull(otVarM);
                        otVarM.g(activity);
                    }
                    if (aVar.d().contains(activity)) {
                        return;
                    }
                    aVar.d().add(activity);
                } catch (Exception e) {
                    nn3.a.b("AppProtectt", e.toString(), e);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                qn3 qn3Var = qn3.a;
                if (qn3Var.f().length() > 0) {
                    String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
                    Intrinsics.checkNotNull(qualifiedName);
                    if (StringsKt__StringsKt.contains$default((CharSequence) qualifiedName, (CharSequence) qn3Var.f(), false, 2, (Object) null)) {
                        nn3.c(nn3.a, "ActivityCallback", Intrinsics.stringPlus("", qn3Var.f()), null, 4, null);
                        return;
                    }
                }
                try {
                    a aVar = jt.c;
                    if (aVar.M() != null) {
                        ot otVarM = aVar.M();
                        Intrinsics.checkNotNull(otVarM);
                        otVarM.onActivityDestroyed(activity);
                    }
                    if (aVar.d().contains(activity)) {
                        aVar.d().remove(activity);
                    }
                } catch (Exception e) {
                    nn3.a.b("AppProtectt", e.toString(), e);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                a aVar = jt.c;
                aVar.p0(false);
                qn3 qn3Var = qn3.a;
                if (qn3Var.f().length() > 0) {
                    String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
                    Intrinsics.checkNotNull(qualifiedName);
                    if (StringsKt__StringsKt.contains$default((CharSequence) qualifiedName, (CharSequence) qn3Var.f(), false, 2, (Object) null)) {
                        nn3.c(nn3.a, "ActivityCallback", Intrinsics.stringPlus("", qn3Var.f()), null, 4, null);
                        return;
                    }
                }
                try {
                    NativeInteractor.a.F0(false);
                    if (aVar.M() != null) {
                        ot otVarM = aVar.M();
                        Intrinsics.checkNotNull(otVarM);
                        otVarM.onActivityPaused(activity);
                    }
                } catch (Exception e) {
                    nn3.a.b("AppProtectt", e.toString(), e);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                a aVar = jt.c;
                aVar.p0(true);
                mo5 mo5Var = mo5.a;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                mo5Var.a(applicationContext);
                qn3 qn3Var = qn3.a;
                if (qn3Var.f().length() > 0) {
                    String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
                    Intrinsics.checkNotNull(qualifiedName);
                    if (StringsKt__StringsKt.contains$default((CharSequence) qualifiedName, (CharSequence) qn3Var.f(), false, 2, (Object) null)) {
                        nn3.c(nn3.a, "ActivityCallback", Intrinsics.stringPlus("", qn3Var.f()), null, 4, null);
                        return;
                    }
                }
                aVar.z0(activity);
                try {
                    NativeInteractor.a.F0(true);
                    if (aVar.M() != null) {
                        ot otVarM = aVar.M();
                        Intrinsics.checkNotNull(otVarM);
                        otVarM.onActivityResumed(activity);
                    }
                    if (aVar.d().contains(activity)) {
                        return;
                    }
                    aVar.d().add(activity);
                } catch (Exception e) {
                    nn3.a.b("AppProtectt", e.toString(), e);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                qn3 qn3Var = qn3.a;
                if (qn3Var.f().length() > 0) {
                    String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
                    Intrinsics.checkNotNull(qualifiedName);
                    if (StringsKt__StringsKt.contains$default((CharSequence) qualifiedName, (CharSequence) qn3Var.f(), false, 2, (Object) null)) {
                        nn3.c(nn3.a, "ActivityCallback", Intrinsics.stringPlus("", qn3Var.f()), null, 4, null);
                        return;
                    }
                }
                try {
                    a aVar = jt.c;
                    if (aVar.M() != null) {
                        ot otVarM = aVar.M();
                        Intrinsics.checkNotNull(otVarM);
                        otVarM.onActivityStarted(activity);
                    }
                } catch (Exception e) {
                    nn3.a.b("AppProtectt", e.toString(), e);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List A() {
            return jt.T;
        }

        public final void A0(long j) {
            jt.I = j;
        }

        public final List B() {
            return jt.p;
        }

        public final void B0(boolean z) {
            jt.z = z;
        }

        public final Context C() {
            Context context = jt.e0;
            if (context != null) {
                return context;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mAppContext");
            return null;
        }

        public final void C0(boolean z) {
            jt.X = z;
        }

        public final String D() {
            return jt.S;
        }

        public final void D0(List list) {
            jt.F = list;
        }

        public final List E() {
            return jt.r;
        }

        public final void E0(boolean z) {
            jt.K = z;
        }

        public final boolean F() {
            return jt.k0;
        }

        public final void F0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.h0 = str;
        }

        public final List G() {
            return jt.s;
        }

        public final void G0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.i0 = str;
        }

        public final nt H() {
            return jt.f0;
        }

        public final void H0(boolean z) {
            jt.y = z;
        }

        public final String I() {
            return jt.g0;
        }

        public final void I0(boolean z) {
            jt.u = z;
        }

        public final List J() {
            return jt.a0;
        }

        public final void J0(String str) {
            jt.i = str;
        }

        public final List K() {
            return jt.o;
        }

        public final void K0(Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            jt.e0 = context;
        }

        public final ScanAlerts L() {
            return jt.d0;
        }

        public final void L0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.S = str;
        }

        public final ot M() {
            return jt.k;
        }

        public final void M0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.g0 = str;
        }

        public final ArrayList N() {
            return jt.V;
        }

        public final void N0(String str) {
            jt.c0 = str;
        }

        public final List O() {
            return jt.m;
        }

        public final void O0(String str) {
            jt.b0 = str;
        }

        public final int P() {
            return jt.d;
        }

        public final void P0(if5 if5Var) {
            jt.l = if5Var;
        }

        public final String Q() {
            return jt.c0;
        }

        public final void Q0(boolean z) {
            jt.w = z;
        }

        public final String R() {
            return jt.b0;
        }

        public final void R0(Boolean bool) {
            jt.l0 = bool;
        }

        public final if5 S() {
            return jt.l;
        }

        public final void S0(Boolean bool) {
            jt.m0 = bool;
        }

        public final Boolean T() {
            return jt.m0;
        }

        public final void T0(long j) {
            jt.A = j;
        }

        public final long U() {
            return jt.A;
        }

        public final void U0(boolean z) {
            jt.N = z;
        }

        public final boolean V() {
            return jt.v;
        }

        public final void V0(int i) {
            if (O().contains(Integer.valueOf(i))) {
                return;
            }
            O().add(Integer.valueOf(i));
            if5 if5Var = new if5();
            if5Var.setRuleid(i);
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            if5Var.setMobileSessionID(s06VarA.x());
            ScanUtils scanUtils = ScanUtils.a;
            if5Var.setSkipTimeStamp(scanUtils.P());
            N().add(if5Var);
            if (!N().isEmpty()) {
                scanUtils.a1(N());
            }
            if (O().containsAll(Y())) {
                ScanAlerts scanAlertsL = L();
                Intrinsics.checkNotNull(scanAlertsL);
                scanAlertsL.u();
            }
        }

        public final int W() {
            return jt.H;
        }

        public final void W0(String cID) {
            Intrinsics.checkNotNullParameter(cID, "cID");
            try {
                s06.a aVar = s06.m;
                s06 s06VarA = aVar.a();
                if (s06VarA != null) {
                    s06VarA.W(cID);
                }
                qq0 qq0VarP = p();
                Intrinsics.checkNotNull(qq0VarP);
                qq0VarP.setCustRefId(cID);
                if (NativeInteractor.a.getSessionToken().length() > 0) {
                    s06 s06VarA2 = aVar.a();
                    String strO = s06VarA2 == null ? null : s06VarA2.o();
                    if (strO != null && strO.length() != 0 && ScanUtils.a.V(C())) {
                        nt ntVarH = H();
                        Intrinsics.checkNotNull(ntVarH);
                        ntVarH.f();
                        return;
                    }
                }
                H0(false);
            } catch (Exception e) {
                nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> updateCustRefIdAPI Error: ", e), e);
            }
        }

        public final qt X() {
            jt.m0();
            return null;
        }

        public final List Y() {
            return jt.W;
        }

        public final boolean Z() {
            return jt.J;
        }

        public final void a(int i) {
            if (B().contains(Integer.valueOf(i))) {
                return;
            }
            B().add(Integer.valueOf(i));
        }

        public final boolean a0() {
            return jt.R;
        }

        public final void b(int i) {
            if (Y().contains(Integer.valueOf(i))) {
                return;
            }
            Y().add(Integer.valueOf(i));
        }

        public final int b0() {
            return jt.g;
        }

        public final void c(int i) {
            if (A().contains(Integer.valueOf(i))) {
                return;
            }
            A().add(Integer.valueOf(i));
        }

        public final boolean c0() {
            return jt.f;
        }

        public final List d() {
            return jt.n;
        }

        public final boolean d0() {
            return jt.X;
        }

        public final String e() {
            return jt.j0;
        }

        public final boolean e0() {
            return jt.L;
        }

        public final boolean f() {
            return jt.Q;
        }

        public final boolean f0() {
            return jt.K;
        }

        public final String g() {
            return jt.O;
        }

        public final boolean g0() {
            return jt.u;
        }

        public final String h() {
            return jt.C;
        }

        public final String h0() {
            return jt.i;
        }

        public final String i() {
            return jt.o0;
        }

        public final String i0() {
            return jt.Z;
        }

        public final zy j() {
            return jt.D;
        }

        public final boolean j0() {
            return jt.w;
        }

        public final String k() {
            return jt.n0;
        }

        public final boolean k0() {
            return jt.N;
        }

        public final List l() {
            return jt.U;
        }

        public final void l0(int i) {
            if (K().contains(Integer.valueOf(i))) {
                return;
            }
            K().add(Integer.valueOf(i));
        }

        public final ni0 m() {
            return jt.G;
        }

        public final void m0(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            application.registerActivityLifecycleCallbacks(new C0097a(application));
        }

        public final int n() {
            return jt.e;
        }

        public final void n0(boolean z) {
            jt.J = z;
        }

        public final boolean o() {
            return jt.P;
        }

        public final void o0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.j0 = str;
        }

        public final qq0 p() {
            return jt.h;
        }

        public final void p0(boolean z) {
            jt.Q = z;
        }

        public final List q() {
            return jt.E;
        }

        public final void q0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.O = str;
        }

        public final Activity r() {
            return jt.Y;
        }

        public final void r0(zy zyVar) {
            jt.D = zyVar;
        }

        public final long s() {
            return jt.I;
        }

        public final void s0(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jt.n0 = str;
        }

        public final List t() {
            return jt.M;
        }

        public final void t0(boolean z) {
            jt.R = z;
        }

        public final boolean u() {
            return jt.z;
        }

        public final void u0(ni0 ni0Var) {
            jt.G = ni0Var;
        }

        public final kt v() {
            return jt.j;
        }

        public final void v0(int i) {
            jt.e = i;
        }

        public final List w() {
            return jt.F;
        }

        public final void w0(boolean z) {
            jt.P = z;
        }

        public final String x() {
            return jt.h0;
        }

        public final void x0(qq0 qq0Var) {
            jt.h = qq0Var;
        }

        public final String y() {
            return jt.i0;
        }

        public final void y0(qq0 clientInfo) {
            Intrinsics.checkNotNullParameter(clientInfo, "clientInfo");
            jt.c.x0(clientInfo);
        }

        public final boolean z() {
            return jt.y;
        }

        public final void z0(Activity activity) {
            jt.Y = activity;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((if5) obj).getRuleid()), Integer.valueOf(((if5) obj2).getRuleid()));
            }
        }

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
            return jt.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List listE;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                listE = l06.e.a().e();
            } catch (Exception e) {
                nn3.a.f(jt.this.b, e.toString());
            }
            if (listE.isEmpty()) {
                return Unit.INSTANCE;
            }
            jt.this.I1(CollectionsKt___CollectionsKt.sortedWith(listE, new a()));
            return Unit.INSTANCE;
        }
    }

    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                nn3 nn3Var = nn3.a;
                String str = jt.this.b;
                StringBuilder sb = new StringBuilder();
                sb.append("checkAppProtecttInitilize >>>>isInitDone:");
                a aVar = jt.c;
                sb.append(aVar.g0());
                sb.append(" CurrentActivity is Null ");
                sb.append(aVar.r() != null);
                nn3Var.f(str, sb.toString());
                if (aVar.r() == null || aVar.g0()) {
                    return;
                }
                nn3Var.f(jt.this.b, "Some Delay Happening");
                jt.this.A1();
            } catch (Exception e) {
                nn3.a.b(jt.this.b, String.valueOf(e), e);
            }
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ jt f;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((if5) obj).getRuleid()), Integer.valueOf(((if5) obj2).getRuleid()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, jt jtVar, Continuation continuation) {
            super(2, continuation);
            this.e = z;
            this.f = jtVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((d) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                a aVar = jt.c;
                if (aVar.f0()) {
                    l06.e.a().g().clear();
                    List<if5> listW = aVar.w();
                    Intrinsics.checkNotNull(listW);
                    for (if5 if5Var : listW) {
                        l06.e.a().g().put(Boxing.boxInt(if5Var.getRuleid()), if5Var);
                        if (Intrinsics.areEqual(if5Var.getAdaptiveFlag(), "Y")) {
                            HashMap mapC = mo5.a.c();
                            Integer numBoxInt = Boxing.boxInt(if5Var.getRuleid());
                            ai adaptiveConfig = if5Var.getAdaptiveConfig();
                            Intrinsics.checkNotNull(adaptiveConfig);
                            mapC.put(numBoxInt, adaptiveConfig);
                        }
                        if (Intrinsics.areEqual(if5Var.getForceAccept(), "Y")) {
                            mo5.a.d().put(Boxing.boxInt(if5Var.getRuleid()), if5Var.getForceAccept());
                        }
                    }
                }
                List listE = l06.e.a().e();
                nn3 nn3Var = nn3.a;
                nn3Var.f("AlertsMiss", Intrinsics.stringPlus("", Boxing.boxInt(listE.size())));
                if (!listE.isEmpty()) {
                    nn3Var.f("AlertsMiss", Intrinsics.stringPlus("ruleSavedData before", Boxing.boxInt(listE.size())));
                    List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(listE, new a());
                    nn3Var.f("AlertsMiss", Intrinsics.stringPlus("ruleSavedDataAfterSort after", Boxing.boxInt(listSortedWith.size())));
                    this.f.I1(listSortedWith);
                } else if (this.e) {
                    nn3Var.b(this.f.b, "Data: ====>>> callJsonDecryption", new Exception("getRuleConfigDataFromLocalDB====>>> Error: ====>>> ruleSavedData is null"));
                    this.f.o1(false);
                } else {
                    nn3Var.b(this.f.b, "Error: ====>>> ruleSavedData is null", new Exception("getRuleConfigDataFromLocalDB ====>>> Error: ====>>> ruleSavedData is null"));
                    nt ntVarH = jt.c.H();
                    Intrinsics.checkNotNull(ntVarH);
                    ntVarH.c();
                }
            } catch (Exception e) {
                nn3.a.b(this.f.b, Intrinsics.stringPlus(">>>>>>>>>>>>getRuleConfigDataFromLocalDB Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((if5) obj).getRuleid()), Integer.valueOf(((if5) obj2).getRuleid()));
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ jt f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.ObjectRef objectRef, jt jtVar, Continuation continuation) {
            super(2, continuation);
            this.e = objectRef;
            this.f = jtVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((f) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mo5 mo5Var = mo5.a;
            if (Intrinsics.areEqual(mo5Var.h(), "NOT_YET_START")) {
                try {
                    mo5Var.q("START");
                    int size = ((List) this.e.element).size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        int callbackFlag = ((if5) ((List) this.e.element).get(i)).getCallbackFlag();
                        if (callbackFlag == 1) {
                            mo5.a.e().add(((List) this.e.element).get(i));
                        } else if (callbackFlag == 2) {
                            mo5.a.g().add(((List) this.e.element).get(i));
                            if (((if5) ((List) this.e.element).get(i)).getRuleid() == 243) {
                                ScanCore.a.v1((if5) ((List) this.e.element).get(i));
                            }
                        } else if (callbackFlag == 3) {
                            mo5.a.f().add(((List) this.e.element).get(i));
                        } else if (callbackFlag == 4) {
                            jt.c.E().add(((List) this.e.element).get(i));
                        } else if (callbackFlag == 5) {
                            jt.c.G().add(((List) this.e.element).get(i));
                        }
                        if (Intrinsics.areEqual(((if5) ((List) this.e.element).get(i)).getAdaptiveFlag(), "Y")) {
                            HashMap mapC = mo5.a.c();
                            Integer numBoxInt = Boxing.boxInt(((if5) ((List) this.e.element).get(i)).getRuleid());
                            ai adaptiveConfig = ((if5) ((List) this.e.element).get(i)).getAdaptiveConfig();
                            Intrinsics.checkNotNull(adaptiveConfig);
                            mapC.put(numBoxInt, adaptiveConfig);
                        }
                        if (Intrinsics.areEqual(((if5) ((List) this.e.element).get(i)).getForceAccept(), "Y")) {
                            mo5.a.d().put(Boxing.boxInt(((if5) ((List) this.e.element).get(i)).getRuleid()), ((if5) ((List) this.e.element).get(i)).getForceAccept());
                        }
                        if (((if5) ((List) this.e.element).get(i)).getRuleid() == 1029) {
                            mo5.a.o(true);
                        }
                        i = i2;
                    }
                    nn3.a.f(this.f.b, "===========>>>>>>>>>>>::Calling startScanPreFilterProcess from handleCallbackAfterRulesConfigDataReceived ");
                    mo5.a.q("DONE");
                    this.f.P1();
                } catch (Exception e) {
                    nn3.a.b(this.f.b, "handleCallbackAfterRulesConfigDataReceivedError: e.getMessage()", e);
                }
            } else {
                nn3.a.f(this.f.b, Intrinsics.stringPlus("Scanning Current stage", mo5Var.h()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((if5) obj).getRuleid()), Integer.valueOf(((if5) obj2).getRuleid()));
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int c;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((h) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                oj1 oj1Var = oj1.a;
                Context applicationContext = jt.this.s1().getApplicationContext();
                Intrinsics.checkNotNull(applicationContext);
                oj1Var.j(applicationContext);
            } catch (Exception e) {
                nn3.a.b(jt.this.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int c;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((i) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                pd1.c.a().e();
                AppBlackListingSharedPreferenceHelper.f.a().g();
            } catch (Exception e) {
                nn3.a.b(jt.this.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int c;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ jt e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jt jtVar, Continuation continuation) {
                super(2, continuation);
                this.e = jtVar;
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
                try {
                    l06.e.a().e();
                } catch (Exception e) {
                    nn3.c(nn3.a, this.e.b, e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ jt e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jt jtVar, Continuation continuation) {
                super(2, continuation);
                this.e = jtVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                try {
                } catch (Exception e) {
                    nn3.a.b(this.e.b, e.toString(), e);
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (gw4.a.b()) {
                        this.c = 1;
                        if (bh1.a(1000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScanUtils scanUtils = ScanUtils.a;
                Context applicationContext = this.e.s1().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                a aVar = jt.c;
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                ScanUtils.I0(scanUtils, applicationContext, activityR, null, 4, null);
                nn3 nn3Var = nn3.a;
                Activity activityR2 = aVar.r();
                Intrinsics.checkNotNull(activityR2);
                nn3Var.g(activityR2, aVar.C());
                qn3 qn3Var = qn3.a;
                Context contextC = aVar.C();
                Activity activityR3 = aVar.r();
                Intrinsics.checkNotNull(activityR3);
                qn3Var.c(contextC, activityR3);
                return Unit.INSTANCE;
            }
        }

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((j) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                nn3 nn3Var = nn3.a;
                String str = jt.this.b;
                a aVar = jt.c;
                nn3Var.f(str, Intrinsics.stringPlus("=======>>> isConstructorCalled: 1: ", Boxing.boxBoolean(aVar.g0())));
                if (!aVar.g0()) {
                    aVar.I0(true);
                    nn3Var.f(jt.this.b, Intrinsics.stringPlus("=======>>> isConstructorCalled: 2: ", Boxing.boxBoolean(aVar.g0())));
                    aVar.K0(jt.this.s1());
                    pd1.c.a().e();
                    z34.a.q(jt.this.s1());
                    fj1.j.d(jt.this.s1());
                    s06 s06VarA = s06.m.a();
                    Intrinsics.checkNotNull(s06VarA);
                    s06VarA.B(jt.this.s1());
                    eu7.d.b(aVar.C());
                    RuleConfigSharedPreferenceHelper.f.b(aVar.C());
                    AppBlackListingSharedPreferenceHelper.f.a();
                    new RecyclerViewInteractor();
                    tm5.f.e(jt.this.s1());
                    pp5.c.c();
                    ScanUtils.a.S0();
                    wt4.b.c(jt.this.s1());
                    kw3.a aVar2 = kw3.a;
                    Context applicationContext = jt.this.s1().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                    aVar2.d(applicationContext);
                    f80.d(qj2.c, qk1.a(), null, new a(jt.this, null), 2, null);
                    ScanCore.a.d0();
                    jt.this.o1(true);
                }
                f80.d(qj2.c, qk1.a(), null, new b(jt.this, null), 2, null);
                nn3Var.f("initMethodEnd", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Exception e) {
                nn3.a.b(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> init Error: ", e), e);
                Log.e(jt.this.b, "initializeAppProtectt: Init Error", e);
                jt.c.I0(false);
                jt.this.A1();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends TimerTask {
        public final /* synthetic */ long e;

        public k(long j) {
            this.e = j;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                nn3 nn3Var = nn3.a;
                nn3Var.f(jt.this.b, "validate isApiCallDone called afetr 5 sec");
                a aVar = jt.c;
                if (aVar.d0() || aVar.F()) {
                    return;
                }
                nn3Var.f("RE-TRYLOG", "Start offline flow");
                jt.this.N1(Intrinsics.stringPlus("DoAffirmation Not happen in ", Long.valueOf(this.e)));
            } catch (Exception e) {
                nn3.a.b(jt.this.b, String.valueOf(e), e);
            }
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ jt f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(if5 if5Var, jt jtVar, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = jtVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((l) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                oj1 oj1Var = oj1.a;
                if5 if5Var = this.e;
                Context applicationContext = this.f.s1().getApplicationContext();
                Intrinsics.checkNotNull(applicationContext);
                oj1Var.g(if5Var, applicationContext);
            } catch (Exception e) {
                nn3.a.b(this.f.b, Intrinsics.stringPlus(">>>>>>>>>>>> loadMethodFromDex Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int c;

        public m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((m) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                s06 s06VarA = s06.m.a();
                Boolean boolBoxBoolean = s06VarA == null ? null : Boxing.boxBoolean(s06VarA.n());
                Intrinsics.checkNotNull(boolBoxBoolean);
                if (boolBoxBoolean.booleanValue()) {
                    nt ntVarH = jt.c.H();
                    Intrinsics.checkNotNull(ntVarH);
                    ntVarH.b(NativeInteractor.a.F());
                } else {
                    nt ntVarH2 = jt.c.H();
                    Intrinsics.checkNotNull(ntVarH2);
                    ntVarH2.a();
                }
            } catch (Exception e) {
                nn3.a.b(jt.this.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        public int c;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((n) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (!jt.c.j0()) {
                    jt.this.H1();
                }
            } catch (Exception e) {
                nn3.a.b(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityResumed onResumeExecution Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ md5 e;
        public final /* synthetic */ jt f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(md5 md5Var, jt jtVar, Continuation continuation) {
            super(2, continuation);
            this.e = md5Var;
            this.f = jtVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((o) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                boolean z = true;
                if (CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(47), Boxing.boxInt(49), Boxing.boxInt(235), Boxing.boxInt(219), Boxing.boxInt(207)}), this.e.getVulnerabilityCode())) {
                    nn3.a.f(this.f.b, Intrinsics.stringPlus("find id", this.e.getVulnerabilityCode()));
                    jt.c.B0(true);
                }
                nn3 nn3Var = nn3.a;
                nn3Var.f(this.f.b, "ScanAlerts::onEventNotified ===>> code: " + this.e.getVulnerabilityCode() + " --- " + ((Object) this.e.getVulnerabilityMessage()) + ' ');
                String str = this.f.b;
                StringBuilder sb = new StringBuilder();
                sb.append("currentActivity: ");
                a aVar = jt.c;
                sb.append(aVar.r());
                sb.append(" ---- isNull: ");
                if (aVar.r() != null) {
                    z = false;
                }
                sb.append(z);
                nn3Var.f(str, sb.toString());
                s06.a aVar2 = s06.m;
                s06 s06VarA = aVar2.a();
                Intrinsics.checkNotNull(s06VarA);
                if (s06VarA.z(String.valueOf(this.e.getVulnerabilityCode())).length() > 0) {
                    Integer vulnerabilityCode = this.e.getVulnerabilityCode();
                    Integer timeperiod = null;
                    if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 215) {
                        s06 s06VarA2 = aVar2.a();
                        Intrinsics.checkNotNull(s06VarA2);
                        String strZ = s06VarA2.z("harmful_app_list");
                        String blockListApp = this.e.getBlockListApp();
                        Intrinsics.checkNotNull(blockListApp);
                        if (!StringsKt__StringsKt.contains$default((CharSequence) strZ, (CharSequence) blockListApp, false, 2, (Object) null)) {
                            nn3Var.f(this.f.b, "Shared pref BlockList" + strZ + " current app BlockList" + ((Object) this.e.getBlockListApp()));
                            this.f.v1(this.e);
                        }
                    }
                    s06 s06VarA3 = aVar2.a();
                    Intrinsics.checkNotNull(s06VarA3);
                    long j = Long.parseLong(s06VarA3.z(String.valueOf(this.e.getVulnerabilityCode())));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    ai aiVar = (ai) mo5.a.c().get(this.e.getVulnerabilityCode());
                    if (aiVar != null) {
                        timeperiod = aiVar.getTimeperiod();
                    }
                    Intrinsics.checkNotNull(timeperiod);
                    if (jCurrentTimeMillis - j >= timeUnit.toMillis(timeperiod.intValue())) {
                        this.f.v1(this.e);
                    }
                } else {
                    this.f.v1(this.e);
                }
            } catch (Exception e) {
                nn3.a.b(this.f.b, Intrinsics.stringPlus("Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements Function2 {
        public int c;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ if5 e;
            public final /* synthetic */ jt f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(if5 if5Var, jt jtVar, Continuation continuation) {
                super(2, continuation);
                this.e = if5Var;
                this.f = jtVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    kw3 kw3VarA = kw3.a.a();
                    if (kw3VarA != null) {
                        if5 if5Var = this.e;
                        a aVar = jt.c;
                        Context contextC = aVar.C();
                        Activity activityR = aVar.r();
                        Intrinsics.checkNotNull(activityR);
                        kw3VarA.g(if5Var, contextC, activityR);
                    }
                } catch (Exception e) {
                    nn3.a.b(this.f.b, Intrinsics.stringPlus(">>>>>>>>>>>> isMockLocationEnabled: Error: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ int e;
            public final /* synthetic */ jt f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, jt jtVar, Continuation continuation) {
                super(2, continuation);
                this.e = i;
                this.f = jtVar;
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
                    oj1 oj1Var = oj1.a;
                    if5 if5Var = (if5) mo5.a.g().get(this.e);
                    Context applicationContext = this.f.s1().getApplicationContext();
                    Intrinsics.checkNotNull(applicationContext);
                    oj1Var.g(if5Var, applicationContext);
                } catch (Exception e) {
                    nn3.a.b(this.f.b, Intrinsics.stringPlus(">>>>>>>>>>>> onResumeExecuteFunctionList: Error: ", e), e);
                }
                return Unit.INSTANCE;
            }
        }

        public p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((p) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (jt.c.k0()) {
                    Iterator it = mo5.a.g().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((if5) next).getRuleid() == 24) {
                            break;
                        }
                    }
                    if5 if5Var = (if5) next;
                    if (if5Var != null) {
                        ScanUtils.a.b0(if5Var, "");
                    }
                }
                for (if5 if5Var2 : jt.c.G()) {
                    String methodname = if5Var2.getMethodname();
                    if (methodname != null) {
                        int iHashCode = methodname.hashCode();
                        if (iHashCode != 119711093) {
                            if (iHashCode != 643308888) {
                                if (iHashCode == 1813752861 && methodname.equals("sslPinning")) {
                                    jt.this.M1(jt.c.C());
                                }
                            } else if (methodname.equals("isMockLocationEnabled")) {
                                ScanUtils scanUtils = ScanUtils.a;
                                if (scanUtils.i0()) {
                                    if (scanUtils.d0(jt.c.C())) {
                                        f80.d(qj2.c, qk1.a(), null, new a(if5Var2, jt.this, null), 2, null);
                                    } else {
                                        nn3.a.f(jt.this.b, "Enable GPS  Settings");
                                    }
                                }
                            }
                        } else if (methodname.equals("wifiSecurity")) {
                            jt.c.C().registerReceiver(ScanUtils.a.W(), new IntentFilter("android.net.wifi.STATE_CHANGE"));
                        }
                    }
                }
                for (if5 if5Var3 : jt.c.E()) {
                    String methodname2 = if5Var3.getMethodname();
                    if (Intrinsics.areEqual(methodname2, "disableScreenShotAndRecoding")) {
                        Log.i(jt.this.b, "SS Method Called");
                        ScanUtils scanUtils2 = ScanUtils.a;
                        a aVar = jt.c;
                        Activity activityR = aVar.r();
                        Intrinsics.checkNotNull(activityR);
                        scanUtils2.J(activityR);
                        Activity activityR2 = aVar.r();
                        Intrinsics.checkNotNull(activityR2);
                        scanUtils2.t0(activityR2);
                    } else if (Intrinsics.areEqual(methodname2, "isAdminPermissionEnable")) {
                        ScanCore.a.P0(jt.c.C(), if5Var3);
                    }
                }
                int size = mo5.a.g().size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    mo5 mo5Var = mo5.a;
                    if (Intrinsics.areEqual(((if5) mo5Var.g().get(i)).getMethodname(), "automaticLock")) {
                        ScanUtils.a.j0(jt.c.C(), (if5) mo5Var.g().get(i));
                    } else if (Intrinsics.areEqual(((if5) mo5Var.g().get(i)).getMethodname(), "wirelessADBEnableCheck")) {
                        r70.a.i((if5) mo5Var.g().get(i));
                    } else {
                        f80.d(qj2.c, qk1.a(), null, new b(i, jt.this, null), 2, null);
                    }
                    i = i2;
                }
            } catch (Exception e) {
                nn3.a.b(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onResumeExecution: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class q extends SuspendLambda implements Function2 {
        public int c;

        public q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((q) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(200L, this) == coroutine_suspended) {
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

    public static final class r extends SuspendLambda implements Function2 {
        public int c;

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((r) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new r(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = jt.c;
                    aVar.T0(aVar.U() + ((long) 10000));
                    nn3.a.f(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> Before calling callcallRulesResult ", Boxing.boxLong(aVar.U())));
                    long jU = aVar.U();
                    this.c = 1;
                    if (bh1.a(jU, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                nn3 nn3Var = nn3.a;
                nn3Var.f(jt.this.b, ">>>>>>>>>>>> About to call callcallRulesResult");
                a aVar2 = jt.c;
                aVar2.X();
                if (NativeInteractor.a.getSessionToken().length() > 0) {
                    s06 s06VarA = s06.m.a();
                    String strO = s06VarA == null ? null : s06VarA.o();
                    if (strO != null && strO.length() != 0 && ScanUtils.a.V(aVar2.C())) {
                        nt ntVarH = aVar2.H();
                        Intrinsics.checkNotNull(ntVarH);
                        ntVarH.i();
                        nn3Var.f(jt.this.b, ">>>>>>>>>>>> After calling callcallRulesResult");
                    }
                }
                aVar2.T0(aVar2.U() - ((long) 10000));
            } catch (Exception e) {
                nn3.a.b(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> foundVulnerabilityList: Error: ", e), e);
            } catch (UnsatisfiedLinkError e2) {
                nn3.a.f(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> foundVulnerabilityList NDK : Error: ", e2));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class s extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List e;
        public final /* synthetic */ jt f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List list, jt jtVar, Continuation continuation) {
            super(2, continuation);
            this.e = list;
            this.f = jtVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((s) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                int size = this.e.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    int callbackFlag = ((if5) this.e.get(i)).getCallbackFlag();
                    if (callbackFlag == 1) {
                        mo5.a.e().add(this.e.get(i));
                    } else if (callbackFlag == 2) {
                        mo5.a.g().add(this.e.get(i));
                        if (((if5) this.e.get(i)).getRuleid() == 243) {
                            ScanCore.a.v1((if5) this.e.get(i));
                        }
                    } else if (callbackFlag == 3) {
                        mo5.a.f().add(this.e.get(i));
                    } else if (callbackFlag == 4) {
                        jt.c.E().add(this.e.get(i));
                    } else if (callbackFlag == 5) {
                        jt.c.G().add(this.e.get(i));
                    }
                    if (Intrinsics.areEqual(((if5) this.e.get(i)).getAdaptiveFlag(), "Y")) {
                        HashMap mapC = mo5.a.c();
                        Integer numBoxInt = Boxing.boxInt(((if5) this.e.get(i)).getRuleid());
                        ai adaptiveConfig = ((if5) this.e.get(i)).getAdaptiveConfig();
                        Intrinsics.checkNotNull(adaptiveConfig);
                        mapC.put(numBoxInt, adaptiveConfig);
                    }
                    if (Intrinsics.areEqual(((if5) this.e.get(i)).getForceAccept(), "Y")) {
                        mo5.a.d().put(Boxing.boxInt(((if5) this.e.get(i)).getRuleid()), ((if5) this.e.get(i)).getForceAccept());
                    }
                    if (((if5) this.e.get(i)).getRuleid() == 1029) {
                        mo5.a.o(true);
                    }
                    i = i2;
                }
                mo5.a.q("DONE");
                this.f.P1();
                nn3.a.f(this.f.b, "===========>>>>>>>>>>>::Calling startScanPreFilterProcess from passForLifecycleBasedCategoryFilter");
            } catch (Exception e) {
                nn3.a.b(this.f.b, Intrinsics.stringPlus(">>>>>>>>>>>> passForLifecycleBasedCategoryFilter Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int c;

        public static final class a implements Runnable {
            public final /* synthetic */ jt c;

            public a(jt jtVar) {
                this.c = jtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.c.x1();
            }
        }

        public t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((t) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new t(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ScanUtils scanUtils = ScanUtils.a;
                s06 s06VarA = s06.m.a();
                Intrinsics.checkNotNull(s06VarA);
                if (scanUtils.p0(s06VarA.r())) {
                    nt ntVarH = jt.c.H();
                    if (ntVarH != null) {
                        nt.a.b(ntVarH, null, new a(jt.this), 1, null);
                    }
                } else {
                    jt.this.x1();
                }
            } catch (Exception e) {
                nn3.a.b(jt.this.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class u extends SuspendLambda implements Function2 {
        public int c;

        public u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((u) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return jt.this.new u(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.this.F1();
                jt.this.H1();
                jt.c.Q0(false);
                mo5 mo5Var = mo5.a;
                mo5Var.p(Boxing.boxInt(mo5Var.e().size() + mo5Var.g().size() + mo5Var.f().size()));
                if (!mo5Var.g().isEmpty()) {
                    nn3.a.f(jt.this.b, "============>>>>>>>>>>>::Adding");
                    Iterator it = mo5Var.g().iterator();
                    while (it.hasNext()) {
                        mo5.a.e().add((if5) it.next());
                    }
                }
                jt.this.r1(mo5.a.e());
            } catch (Exception e) {
                nn3.a.b(jt.this.b, Intrinsics.stringPlus(">>>>>>>>>>>> startScanPreFilterProcess: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public jt(Context application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = application;
        this.b = "AppProtecttInteractor";
    }

    public static final void E1() {
        ScanUtils scanUtils = ScanUtils.a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.T0());
    }

    public static final void G1(md5 response) {
        Intrinsics.checkNotNullParameter(response, "$response");
        ScanAlerts scanAlerts = d0;
        if (scanAlerts == null) {
            return;
        }
        scanAlerts.X(response);
    }

    public static final void K1(md5 response) {
        Intrinsics.checkNotNullParameter(response, "$response");
        ScanAlerts scanAlerts = d0;
        if (scanAlerts == null) {
            return;
        }
        scanAlerts.X(response);
    }

    public static final /* synthetic */ qt m0() {
        return null;
    }

    public static final void p1() {
        ScanUtils scanUtils = ScanUtils.a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.T0());
    }

    public static final void w1(md5 response) {
        Intrinsics.checkNotNullParameter(response, "$response");
        ScanAlerts scanAlerts = d0;
        if (scanAlerts == null) {
            return;
        }
        scanAlerts.X(response);
    }

    public final void A1() {
        try {
            y03.e.a(this).m();
        } catch (Exception e2) {
            nn3.a.b(this.b, String.valueOf(e2.getMessage()), e2);
        }
        f80.d(qj2.c, qk1.a(), null, new j(null), 2, null);
    }

    public final void B1() {
        ScanUtils scanUtils = ScanUtils.a;
        if (scanUtils.f0()) {
            return;
        }
        try {
            j0 += "|Activity-C" + scanUtils.m1();
            scanUtils.c1(true);
            long jT1 = t1();
            new Timer().schedule(new k(jT1), jT1);
        } catch (Exception e2) {
            nn3.a.b(this.b, String.valueOf(e2), e2);
        }
    }

    public final void C1(String str, int i2, int i3, int i4) {
        Log.i(this.b, "Version ---> " + o0 + " :- release : V4.0(5)");
        Log.i(this.b, "SDK_BUILD_ID ---> 86b403b18b386bcf76e2dec5f660d80450653fac");
        Log.i(this.b, "SDK_BUILD_TIME ---> 2025-02-28 15:06:56");
        if (v) {
            return;
        }
        v = true;
        k = this;
        t = str;
        d = i4;
        j = this;
        d0 = new ScanAlerts(i2, i3);
        if ((this.a.getApplicationInfo().flags & 2) != 0) {
            g = this.a.getApplicationInfo().flags & 2;
            f = true;
            nn3.a.f(this.b, "Yes Debuggable");
        } else {
            f = false;
            nn3.a.f(this.b, "No Not a Debuggable");
        }
        q1();
    }

    public final void D1(if5 if5Var) {
        try {
            f80.d(qj2.c, qk1.a(), null, new l(if5Var, this, null), 2, null);
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> loadMethodFromDex Error: ", e2), e2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void F1() {
        try {
            for (if5 if5Var : mo5.a.e()) {
                String methodname = if5Var.getMethodname();
                if (methodname != null) {
                    switch (methodname.hashCode()) {
                        case -1873906647:
                            if (methodname.equals("unSecureDeviceWithFeatures")) {
                                ScanUtils.a.k1(if5Var);
                            }
                            break;
                        case -229703430:
                            if (methodname.equals("detectRootedDevice")) {
                                ScanCore.a.C(if5Var);
                            }
                            break;
                        case 735299110:
                            if (methodname.equals("checkRootV2")) {
                                ScanCore.a.E(if5Var);
                            }
                            break;
                        case 735299111:
                            if (methodname.equals("checkRootV3")) {
                                ScanCore.a.H();
                            }
                            break;
                        case 1891728816:
                            if (methodname.equals("isUnSecureDevice")) {
                                ScanUtils.a.j1(if5Var);
                            }
                            break;
                    }
                }
            }
            for (if5 if5Var2 : s) {
                if (Intrinsics.areEqual(if5Var2.getMethodname(), "reverseEngineeringDetection")) {
                    z34.a.r(if5Var2);
                }
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
    }

    public final void H1() {
        qj2 qj2Var = qj2.c;
        f80.d(qj2Var, qk1.a(), null, new p(null), 2, null);
        nn3 nn3Var = nn3.a;
        String str = this.b;
        ScanUtils scanUtils = ScanUtils.a;
        nn3Var.f(str, Intrinsics.stringPlus("dataHaveToSend >>>>>>>>>>>>>: ScanUtils.isServerUnavailable: ", Boolean.valueOf(scanUtils.v0())));
        if (scanUtils.v0() || !y03.e.b(c.C())) {
            return;
        }
        f80.d(qj2Var, qk1.a(), null, new q(null), 2, null);
        f80.d(qj2Var, qk1.a(), null, new r(null), 2, null);
    }

    public final void I1(List list) {
        nn3 nn3Var = nn3.a;
        nn3Var.f("AlertsMiss", Intrinsics.stringPlus("", Integer.valueOf(list.size())));
        mo5 mo5Var = mo5.a;
        if (!Intrinsics.areEqual(mo5Var.h(), "NOT_YET_START")) {
            nn3Var.f(this.b, Intrinsics.stringPlus("Scanning Current stage", mo5Var.h()));
        } else {
            mo5Var.q("START");
            f80.d(qj2.c, null, null, new s(list, this, null), 3, null);
        }
    }

    public final void J1() {
        if (ScanCore.a.U0()) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            if (aVar.i() == null) {
                return;
            }
            nq nqVarI = aVar.i();
            Intrinsics.checkNotNull(nqVarI);
            ArrayList arrayListC = nqVarI.C();
            if (!arrayListC.isEmpty()) {
                E = arrayListC;
                return;
            }
            return;
        }
        ScanAlerts scanAlerts = d0;
        Intrinsics.checkNotNull(scanAlerts);
        if (scanAlerts.I() == null) {
            return;
        }
        ScanAlerts scanAlerts2 = d0;
        Intrinsics.checkNotNull(scanAlerts2);
        nq nqVarI2 = scanAlerts2.I();
        Intrinsics.checkNotNull(nqVarI2);
        ArrayList arrayListC2 = nqVarI2.C();
        if (!arrayListC2.isEmpty()) {
            E = arrayListC2;
        }
    }

    public final void L1() {
        p.clear();
        f0 = new vt(this);
        s06.a aVar = s06.m;
        s06 s06VarA = aVar.a();
        Intrinsics.checkNotNull(s06VarA);
        if (s06VarA.y().length() > 0) {
            qq0 qq0Var = h;
            Intrinsics.checkNotNull(qq0Var);
            s06 s06VarA2 = aVar.a();
            Intrinsics.checkNotNull(s06VarA2);
            qq0Var.setCustRefId(s06VarA2.y());
        }
    }

    public final void M1(Context context) {
        try {
            ScanUtils scanUtils = ScanUtils.a;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
            if (!scanUtils.s0(applicationContext)) {
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "activity.applicationContext");
                if (!scanUtils.B0(applicationContext2) || f0 == null) {
                    return;
                }
            }
            nt ntVar = f0;
            Intrinsics.checkNotNull(ntVar);
            ntVar.g();
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> sslValidation Error: ", e2), e2);
        }
    }

    public void N1(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (StringsKt__StringsKt.contains$default((CharSequence) info, (CharSequence) "No Internet", false, 2, (Object) null)) {
            k0 = true;
        }
        ScanUtils.a.T0(info);
        nn3.a.f(this.b, info);
        h();
        u1(true);
    }

    public final void O1() {
        try {
            L1();
            y03.a aVar = y03.e;
            a aVar2 = c;
            if (aVar.b(aVar2.C()) && ScanUtils.a.V(aVar2.C())) {
                nn3.a.f(this.b, ">>>>>>>>>>>>: Internet: Connected");
                f80.d(qj2.c, null, null, new t(null), 3, null);
            } else {
                N1("No Internet or Internet Disconnected");
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("ERROR", e2), e2);
        }
    }

    public final void P1() {
        f80.d(qj2.c, qk1.a(), null, new u(null), 2, null);
    }

    @Override // com.zepto.mt
    public void a() {
        nn3.a.f(this.b, Intrinsics.stringPlus("network Connected... call Api.", Boolean.valueOf(X)));
        if (X || !ScanUtils.a.V(this.a)) {
            return;
        }
        f80.d(qj2.c, null, null, new m(null), 3, null);
    }

    @Override // com.zepto.kt
    public void b(ni0 channelDetails) {
        s06 s06VarA;
        s06 s06VarA2;
        Intrinsics.checkNotNullParameter(channelDetails, "channelDetails");
        nn3.a.f(this.b, Intrinsics.stringPlus("BaseUrl:-", channelDetails.getBaseurl()));
        URL url = new URL(channelDetails.getBaseurl());
        NativeInteractor nativeInteractor = NativeInteractor.a;
        String baseurl = channelDetails.getBaseurl();
        Intrinsics.checkNotNull(baseurl);
        nativeInteractor.t0(baseurl);
        String enckey = channelDetails.getEnckey();
        Intrinsics.checkNotNull(enckey);
        nativeInteractor.v0(enckey);
        String iv = channelDetails.getIv();
        Intrinsics.checkNotNull(iv);
        nativeInteractor.w0(iv);
        String host = url.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "myURL.host");
        nativeInteractor.E0(host);
        String publickey = channelDetails.getPublickey();
        Intrinsics.checkNotNull(publickey);
        nativeInteractor.A0(publickey);
        String exttrustpublickey = channelDetails.getExttrustpublickey();
        Intrinsics.checkNotNull(exttrustpublickey);
        nativeInteractor.z0(exttrustpublickey);
        String sslpublickey = channelDetails.getSslpublickey();
        String sslexpirydate = channelDetails.getSslexpirydate();
        if (sslpublickey == null || sslpublickey.length() == 0) {
            L = true;
            return;
        }
        s06.a aVar = s06.m;
        s06 s06VarA3 = aVar.a();
        Intrinsics.checkNotNull(s06VarA3);
        if (s06VarA3.s().length() == 0 && (s06VarA2 = aVar.a()) != null) {
            s06VarA2.P(sslpublickey);
        }
        s06 s06VarA4 = aVar.a();
        Intrinsics.checkNotNull(s06VarA4);
        if (s06VarA4.r().length() != 0 || (s06VarA = aVar.a()) == null) {
            return;
        }
        Intrinsics.checkNotNull(sslexpirydate);
        s06VarA.O(sslexpirydate);
    }

    @Override // com.zepto.pt
    public void c() {
        try {
            h();
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            s06VarA.T("online");
            u1(false);
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
    }

    @Override // com.zepto.kt
    public void d(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f80.d(qj2.c, qk1.a(), null, new o(response, this, null), 2, null);
    }

    @Override // com.zepto.pt
    public void e(List list) {
        Object next;
        List<if5> listSortedWith = list == null ? null : CollectionsKt___CollectionsKt.sortedWith(list, new g());
        try {
            List list2 = F;
            if (list2 != null) {
                Intrinsics.checkNotNull(list2);
                if (!list2.isEmpty()) {
                    Log.d("FeatureList", new Gson().toJson(F));
                    if (listSortedWith != null) {
                        for (if5 if5Var : listSortedWith) {
                            List list3 = F;
                            Intrinsics.checkNotNull(list3);
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((if5) next).getRuleid() == if5Var.getRuleid()) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            if5 if5Var2 = (if5) next;
                            if (if5Var2 != null) {
                                nn3.a.f(this.b, "Feature_List " + ((Object) if5Var.getTitle()) + " ----> " + if5Var.getRuleid() + " : " + if5Var2.getRuleid());
                                if5Var.setMsg(if5Var2.getMsg());
                                if5Var.setTitle(if5Var2.getTitle());
                            } else {
                                nn3.a.f(this.b, "Feature_List " + ((Object) if5Var.getTitle()) + " ----> " + if5Var.getRuleid());
                                StringBuilder sb = new StringBuilder();
                                sb.append("Identified a threat with threat ID - ");
                                sb.append(if5Var.getRuleid());
                                sb.append(", Please contact the support team to know more details.");
                                if5Var.setMsg(sb.toString());
                                if5Var.setTitle("Threat Identified");
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
        i(listSortedWith);
    }

    @Override // com.zepto.kt
    public void f(final md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            nn3.a.f(this.b, Intrinsics.stringPlus("ScanAlerts::safeResponse ===>> code: ", response.getVulnerabilityCode()));
            Activity activity = Y;
            if (activity == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.zepto.et
                @Override // java.lang.Runnable
                public final void run() {
                    jt.K1(response);
                }
            });
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
    }

    @Override // com.zepto.ot
    public void g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Y = activity;
            nn3 nn3Var = nn3.a;
            nn3Var.f(this.b, ">>>>>>>>>>>> onActivityCreated: " + ((Object) Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) + " -- currentActivity: " + Y);
            Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
            Intrinsics.checkNotNull(launchIntentForPackage);
            ComponentName component = launchIntentForPackage.getComponent();
            Intrinsics.checkNotNull(component);
            String className = component.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "application.packageManag…)!!.component!!.className");
            nn3Var.f(this.b, ">>>>>>>>>>>> onActivityCreated: " + ((Object) Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) + ' ');
            if (B) {
                Activity activity2 = Y;
                Intrinsics.checkNotNull(activity2);
                activity2.runOnUiThread(new Runnable() { // from class: com.zepto.dt
                    @Override // java.lang.Runnable
                    public final void run() {
                        jt.E1();
                    }
                });
            }
            String qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
            Intrinsics.checkNotNull(qualifiedName);
            if (qualifiedName.equals(className)) {
                A1();
            } else {
                nn3Var.f(this.b, ">>>>>>>>>>>> Not a launcher Activity: " + ((Object) Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) + ' ');
            }
            ScanUtils scanUtils = ScanUtils.a;
            ScanUtils.x0(scanUtils, null, 1, null);
            s06.a aVar = s06.m;
            if (aVar.a() != null) {
                s06 s06VarA = aVar.a();
                Intrinsics.checkNotNull(s06VarA);
                if (s06VarA.h() != null && h != null) {
                    scanUtils.J0();
                }
            }
            RecyclerViewInteractor.a aVar2 = RecyclerViewInteractor.c;
            if (aVar2.k() != null) {
                j70 j70VarK = aVar2.k();
                Intrinsics.checkNotNull(j70VarK);
                j70VarK.b();
            }
            B1();
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityCreated Error: ", e2), e2);
        }
    }

    @Override // com.zepto.pt
    public void h() {
        try {
            oj1 oj1Var = oj1.a;
            if (oj1Var.f() == null) {
                Context applicationContext = this.a.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext);
                oj1Var.j(applicationContext);
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.util.List] */
    @Override // com.zepto.pt
    public void i(List list) {
        try {
            Z = "online";
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            s06VarA.T("online");
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = list;
                ?? SortedWith = CollectionsKt___CollectionsKt.sortedWith(pd1.c.a().i((List) objectRef.element), new e());
                objectRef.element = SortedWith;
                a0 = (List) SortedWith;
                for (if5 if5Var : (List) SortedWith) {
                    l06.e.a().g().put(Integer.valueOf(if5Var.getRuleid()), if5Var);
                }
                wt4 wt4VarA = wt4.b.a();
                if (wt4VarA != null) {
                    wt4VarA.s((List) objectRef.element);
                }
                f80.d(qj2.c, qk1.a(), null, new f(objectRef, this, null), 2, null);
                return;
            }
            nn3.c(nn3.a, this.b, "Server rule is empty", null, 4, null);
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e2.getMessage()), e2);
        }
    }

    @Override // com.zepto.mt
    public void j() {
        try {
            ScanAlerts scanAlerts = d0;
            if5 if5VarQ = scanAlerts == null ? null : scanAlerts.Q(233);
            if (if5VarQ != null) {
                ScanUtils.a.b0(if5VarQ, "");
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.b, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.pt
    public void k(final md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String statusDesc = response.getStatusDesc();
            Intrinsics.checkNotNull(statusDesc);
            if (StringsKt__StringsKt.contains((CharSequence) statusDesc, (CharSequence) "503", true)) {
                nn3.c(nn3.a, this.b, Intrinsics.stringPlus("Api failure happen set serverUnavailable", new Gson().toJson(response)), null, 4, null);
                ScanUtils scanUtils = ScanUtils.a;
                scanUtils.g1(true);
                h();
                scanUtils.T0(Intrinsics.stringPlus("onError::", new Gson().toJson(response)));
                u1(true);
            } else {
                Activity activity = Y;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: com.zepto.ht
                        @Override // java.lang.Runnable
                        public final void run() {
                            jt.G1(response);
                        }
                    });
                }
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus("onError: Error: ", e2), e2);
        }
    }

    public final void o1(boolean z2) {
        int identifier;
        try {
            nn3 nn3Var = nn3.a;
            String str = this.b;
            File fileF = oj1.a.f();
            nn3Var.f(str, Intrinsics.stringPlus("============>>>>>>>>>>>::Jsonlocal", fileF == null ? null : Boolean.valueOf(fileF.exists())));
            gw4 gw4Var = gw4.a;
            if (gw4Var.b()) {
                a aVar = c;
                Resources resources = aVar.C().getResources();
                NativeInteractor nativeInteractor = NativeInteractor.a;
                identifier = resources.getIdentifier(nativeInteractor.N0(), nativeInteractor.R0(), aVar.C().getPackageName());
            } else if (gw4Var.c()) {
                a aVar2 = c;
                Resources resources2 = aVar2.C().getResources();
                NativeInteractor nativeInteractor2 = NativeInteractor.a;
                identifier = resources2.getIdentifier(nativeInteractor2.Q0(), nativeInteractor2.R0(), aVar2.C().getPackageName());
            } else {
                identifier = 0;
            }
            a aVar3 = c;
            InputStream inputStreamOpenRawResource = aVar3.C().getResources().openRawResource(identifier);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "mAppContext.resources.openRawResource(feature)");
            g53.a.a(inputStreamOpenRawResource);
            if (!z2) {
                nn3Var.f(this.b, "RuleDb is notEmpty,Now we start Scaning..");
                f80.d(qj2.c, null, null, new b(null), 3, null);
                return;
            }
            ScanUtils scanUtils = ScanUtils.a;
            if (!scanUtils.J0()) {
                nn3Var.f(this.b, "You need to fix ChannelDetails... ");
                return;
            }
            nn3Var.f(this.b, "============>>>>>>>>>>>::ChannelDetls flag true 4");
            if (!x) {
                x = true;
                nn3Var.f(this.b, "============>>>>>>>>>>>::init StartScan");
                O1();
            }
            nn3Var.f(this.b, "Temp.Png Build Time is " + scanUtils.S(aVar3.C(), "BUILD_DATE") + " Git Commit id is " + scanUtils.S(aVar3.C(), "BUILD_HASH"));
        } catch (Exception e2) {
            if (StringsKt__StringsKt.contains((CharSequence) e2.toString(), (CharSequence) "NotFoundException: File res/raw/feature", true) || StringsKt__StringsKt.contains((CharSequence) e2.toString(), (CharSequence) "NotFoundException: Resource ID #0x0", true)) {
                B = true;
                Activity activity = Y;
                Intrinsics.checkNotNull(activity);
                activity.runOnUiThread(new Runnable() { // from class: com.zepto.gt
                    @Override // java.lang.Runnable
                    public final void run() {
                        jt.p1();
                    }
                });
            }
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>> Error:callJsonDecryption() ", e2), e2);
        }
    }

    @Override // com.zepto.ot
    public void onActivityDestroyed(Activity activity) {
        ScanAlerts scanAlerts;
        AlertDialog alertDialogJ;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            nn3.a.f(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityDestroyed: ", Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()));
            AlertDialog alertDialogJ2 = null;
            if (ScanCore.a.U0()) {
                for (Map.Entry entry : RecyclerViewInteractor.c.q().entrySet()) {
                    CharSequence charSequence = (CharSequence) entry.getKey();
                    String name = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
                    if (StringsKt__StringsKt.contains$default(charSequence, (CharSequence) name, false, 2, (Object) null) && ((com.google.android.material.bottomsheet.a) entry.getValue()).isShowing()) {
                        ((com.google.android.material.bottomsheet.a) entry.getValue()).dismiss();
                    }
                }
            } else {
                ScanAlerts scanAlerts2 = d0;
                Intrinsics.checkNotNull(scanAlerts2);
                ArrayList<hk1> arrayList = (ArrayList) scanAlerts2.N().get(String.valueOf(Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName()));
                if (arrayList != null) {
                    for (hk1 hk1Var : arrayList) {
                        AlertDialog vulnerabilityAlert = hk1Var.getVulnerabilityAlert();
                        if (vulnerabilityAlert != null && vulnerabilityAlert.isShowing()) {
                            Log.i("AlertDialog", "All Dialog dismissed");
                            AlertDialog vulnerabilityAlert2 = hk1Var.getVulnerabilityAlert();
                            if (vulnerabilityAlert2 != null) {
                                vulnerabilityAlert2.dismiss();
                            }
                        }
                    }
                }
            }
            ScanAlerts scanAlerts3 = d0;
            if (scanAlerts3 != null) {
                alertDialogJ2 = scanAlerts3.J();
            }
            if (alertDialogJ2 != null && (scanAlerts = d0) != null && (alertDialogJ = scanAlerts.J()) != null) {
                alertDialogJ.dismiss();
            }
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.W().isOrderedBroadcast()) {
                c.C().unregisterReceiver(scanUtils.W());
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityDestroyed: Error: ", e2), e2);
        }
    }

    @Override // com.zepto.ot
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        nn3.a.f(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityPaused: ", Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()));
        ScanCore.a.N0(activity, "PAUSE");
        a aVar = c;
        aVar.C().stopService(new Intent(aVar.C(), (Class<?>) LoggingService.class));
        J1();
    }

    @Override // com.zepto.ot
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Y = activity;
            nn3 nn3Var = nn3.a;
            nn3Var.f(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityResumed: ", Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()));
            ScanCore.a.N0(activity, "RESUME");
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("OnResume  currentActivity is ");
            Activity activity2 = Y;
            Intrinsics.checkNotNull(activity2);
            sb.append((Object) Reflection.getOrCreateKotlinClass(activity2.getClass()).getQualifiedName());
            sb.append(" launcherActivityName:");
            sb.append((Object) t);
            sb.append(" isInitDone:");
            sb.append(u);
            nn3Var.f(str, sb.toString());
            if (!u) {
                A1();
            }
            f80.d(qj2.c, qk1.a(), null, new n(null), 2, null);
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityResumed Error: ", e2), e2);
        }
    }

    @Override // com.zepto.ot
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        nn3.a.f(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> onActivityStarted: ", Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()));
    }

    public final void q1() {
        nn3.a.f(this.b, "checkAppProtecttInitilize Called");
        try {
            new Timer().schedule(new c(), 3000L);
        } catch (Exception e2) {
            nn3.a.b(this.b, String.valueOf(e2), e2);
        }
    }

    public final void r1(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                D1((if5) it.next());
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, Intrinsics.stringPlus(">>>>>>>>>>>> filterMethodBeforeCallingDexLoader: Error: ", e2), e2);
        }
    }

    public final Context s1() {
        return this.a;
    }

    public final long t1() {
        s06 s06VarA = s06.m.a();
        Boolean boolValueOf = s06VarA == null ? null : Boolean.valueOf(s06VarA.n());
        Intrinsics.checkNotNull(boolValueOf);
        return !boolValueOf.booleanValue() ? 8000L : 5000L;
    }

    public final void u1(boolean z2) {
        Z = "offline";
        nn3.a.f("AlertsMiss", "getRuleConfigDataFromLocalPreference called");
        f80.d(qj2.c, qk1.a(), null, new d(z2, this, null), 2, null);
    }

    public final void v1(final md5 md5Var) {
        Activity activity = Y;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.zepto.ft
            @Override // java.lang.Runnable
            public final void run() {
                jt.w1(md5Var);
            }
        });
    }

    public final void x1() {
        try {
            s06 s06VarA = s06.m.a();
            Boolean boolValueOf = s06VarA == null ? null : Boolean.valueOf(s06VarA.n());
            Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue()) {
                nt ntVar = f0;
                Intrinsics.checkNotNull(ntVar);
                ntVar.b(NativeInteractor.a.F());
            } else {
                nt ntVar2 = f0;
                Intrinsics.checkNotNull(ntVar2);
                ntVar2.a();
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.b, e2.toString(), null, 4, null);
        }
    }

    public final void y1(String launcherActivityName, int i2, int i3, int i4, String buildType, int i5, String buildFlavour, String buildTime) {
        Intrinsics.checkNotNullParameter(launcherActivityName, "launcherActivityName");
        Intrinsics.checkNotNullParameter(buildType, "buildType");
        Intrinsics.checkNotNullParameter(buildFlavour, "buildFlavour");
        Intrinsics.checkNotNullParameter(buildTime, "buildTime");
        c.K0(this.a);
        C = buildType;
        H = i5;
        o0 = buildFlavour;
        fj1.j.e(buildTime);
        C1(launcherActivityName, i2, i3, i4);
        z1();
    }

    public final void z1() {
        qj2 qj2Var = qj2.c;
        f80.d(qj2Var, qk1.a(), null, new h(null), 2, null);
        try {
            s06.a aVar = s06.m;
            aVar.b(this.a);
            SkipAlertSharePref.g.b();
            if (new ru5().j().length() == 0) {
                f80.d(qj2Var, null, null, new i(null), 3, null);
                ru5.a aVar2 = ru5.c;
                String strD = aVar2.d(aVar2.h(), aVar2.g(NativeInteractor.a.S()));
                s06 s06VarA = aVar.a();
                Intrinsics.checkNotNull(s06VarA);
                s06VarA.S(new ru5().h(), strD);
            }
        } catch (Exception e2) {
            nn3.a.b(this.b, e2.toString(), e2);
        }
    }
}
