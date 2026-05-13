package ai.protectt.app.security.main.scan;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.common.helper.SkipAlertSharePref;
import ai.protectt.app.security.main.scan.ScanUtils;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepto.bh1;
import com.zepto.eg5;
import com.zepto.f80;
import com.zepto.fk2;
import com.zepto.gw4;
import com.zepto.if5;
import com.zepto.jt;
import com.zepto.jz5;
import com.zepto.k16;
import com.zepto.kt;
import com.zepto.l06;
import com.zepto.md5;
import com.zepto.ml4;
import com.zepto.mx2;
import com.zepto.ni0;
import com.zepto.nn3;
import com.zepto.nq;
import com.zepto.oj1;
import com.zepto.pd1;
import com.zepto.pp5;
import com.zepto.qj2;
import com.zepto.qk1;
import com.zepto.qq0;
import com.zepto.s06;
import com.zepto.tm5;
import com.zepto.yy0;
import com.zepto.yz0;
import com.zepto.zy;
import com.zepto.zz0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ScanUtils {
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static int i;
    public static final ScanUtils a = new ScanUtils();
    public static final String b = "ScanUtils";
    public static final eg5.a.C0078a g = eg5.a.a;
    public static final pd1 h = pd1.c.a();
    public static final BroadcastReceiver j = new w();
    public static final View.OnTouchListener k = new d();

    public static final class a extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.e = str;
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
                oj1 oj1Var = oj1.a;
                if (oj1Var.f() == null) {
                    oj1Var.j(jt.c.C());
                }
                mx2 mx2Var = mx2.a;
                NativeInteractor nativeInteractor = NativeInteractor.a;
                String strM1 = nativeInteractor.m1();
                jt.a aVar = jt.c;
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                Object[] objArr = {activityR, this.e};
                Activity activityR2 = aVar.r();
                Intrinsics.checkNotNull(activityR2);
                mx2Var.c(strM1, objArr, activityR2);
                nativeInteractor.c(aVar.C(), this.e);
            } catch (Exception e) {
                nn3.a.b("TAG", Intrinsics.stringPlus(">>>>>>>>>>>> isDebugger: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
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
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                Object[] objArr = {activityR, Boxing.boxLong(aVar.s()), ""};
                mx2 mx2Var = mx2.a;
                eg5.a.C0078a unused = ScanUtils.g;
                Object objE = mx2Var.e("isTimeDateManipulated", objArr);
                if (Intrinsics.areEqual(objE, "SAFE")) {
                    ScanUtils.a.Y0(41);
                } else {
                    ScanUtils.a.b0(this.e, String.valueOf(objE));
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> detectTimeManipulation: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Runnable {
        public final /* synthetic */ Activity c;

        public c(Activity activity) {
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    public static final class d implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            try {
                jt.a aVar = jt.c;
                Object systemService = aVar.C().getSystemService("input_method");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                if (((InputMethodManager) systemService).isAcceptingText()) {
                    nn3.a.f(ScanUtils.b, "keyBoard is running");
                    return false;
                }
                nn3 nn3Var = nn3.a;
                nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("keyBoard is Not  running ", Integer.valueOf(event.getFlags())));
                nn3Var.f(ScanUtils.b, "keyBoard is Not  running 2");
                if (event.getFlags() == 2) {
                    if5 if5VarS = aVar.S();
                    if ((if5VarS == null ? null : if5VarS.getResult()) == null) {
                        if (aVar.S() == null) {
                            return true;
                        }
                        if5 if5VarS2 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS2);
                        s06.a aVar2 = s06.m;
                        s06 s06VarA = aVar2.a();
                        Intrinsics.checkNotNull(s06VarA);
                        if5VarS2.setMobileSessionID(s06VarA.x());
                        if5 if5VarS3 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS3);
                        ScanUtils scanUtils = ScanUtils.a;
                        if5VarS3.setThreatDateAndTime(scanUtils.m1());
                        if5 if5VarS4 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS4);
                        s06 s06VarA2 = aVar2.a();
                        Intrinsics.checkNotNull(s06VarA2);
                        if5VarS4.setThreatDetectedFlag(s06VarA2.v());
                        if5 if5VarS5 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS5);
                        Integer numValueOf = Integer.valueOf(if5VarS5.getRuleid());
                        if5 if5VarS6 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS6);
                        String title = if5VarS6.getTitle();
                        String strS = scanUtils.S(aVar.C(), NativeInteractor.a.u1());
                        if5 if5VarS7 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS7);
                        String msg = if5VarS7.getMsg();
                        if5 if5VarS8 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS8);
                        String ruleaction = if5VarS8.getRuleaction();
                        if5 if5VarS9 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS9);
                        String shortdescription = if5VarS9.getShortdescription();
                        Intrinsics.checkNotNull(shortdescription);
                        if5 if5VarS10 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS10);
                        String recommendation = if5VarS10.getRecommendation();
                        Intrinsics.checkNotNull(recommendation);
                        if5 if5VarS11 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS11);
                        String redirecturl = if5VarS11.getRedirecturl();
                        Intrinsics.checkNotNull(redirecturl);
                        if5 if5VarS12 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS12);
                        int forceCloseTime = if5VarS12.getForceCloseTime();
                        if5 if5VarS13 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS13);
                        md5 md5Var = new md5(numValueOf, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, forceCloseTime, if5VarS13.getClearDataFlag());
                        String json = new Gson().toJson(md5Var);
                        if5 if5VarS14 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS14);
                        if5VarS14.setResult(json);
                        if5 if5VarS15 = aVar.S();
                        Intrinsics.checkNotNull(if5VarS15);
                        String ruleaction2 = if5VarS15.getRuleaction();
                        eg5 eg5Var = eg5.a;
                        if (Intrinsics.areEqual(ruleaction2, eg5Var.m()) || CollectionsKt___CollectionsKt.contains(aVar.O(), md5Var.getVulnerabilityCode()) || CollectionsKt___CollectionsKt.contains(aVar.K(), md5Var.getVulnerabilityCode())) {
                            if5 if5VarS16 = aVar.S();
                            Intrinsics.checkNotNull(if5VarS16);
                            if (Intrinsics.areEqual(if5VarS16.getRuleaction(), eg5Var.m())) {
                                Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                                Intrinsics.checkNotNull(vulnerabilityCode);
                                aVar.l0(vulnerabilityCode.intValue());
                                pd1 pd1Var = ScanUtils.h;
                                if5 if5VarS17 = aVar.S();
                                Intrinsics.checkNotNull(if5VarS17);
                                pd1Var.j(if5VarS17);
                            }
                        } else {
                            pd1 pd1Var2 = ScanUtils.h;
                            if5 if5VarS18 = aVar.S();
                            Intrinsics.checkNotNull(if5VarS18);
                            pd1Var2.j(if5VarS18);
                            kt ktVarV = aVar.v();
                            if (ktVarV != null) {
                                ktVarV.d(md5Var);
                            }
                        }
                        nn3Var.f("TAG", "====>>: Overlay detected: inside if block");
                        return true;
                    }
                }
                nn3Var.f("TAG", "====>>: Overlay Not detected");
                return false;
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus("filterTouchListener", e), e);
                return false;
            }
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
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
                ArrayList arrayList = new ArrayList();
                HashMap map = new HashMap();
                fk2 fk2VarA = fk2.d.a(this.e);
                int i = 0;
                ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("ro.debuggable", "ro.secure", "ro.boot.verifiedbootstate", "ro.boot.flash.locked", "ro.boot.vbmeta.device_state");
                String strD = fk2VarA.d("appprotectt_devicegen", "");
                if (strD == null || strD.length() == 0) {
                    ScanUtils.a.e1(arrayListArrayListOf, arrayList, fk2VarA);
                } else {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strD, new String[]{","}, false, 0, 6, (Object) null);
                    for (Object obj2 : arrayListArrayListOf) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        String str = (String) obj2;
                        String strY1 = NativeInteractor.a.y1(str);
                        if (!Intrinsics.areEqual(strY1, listSplit$default.get(i))) {
                            nn3.a.f("getDeviceBehaviour", "Dec:-" + ((String) listSplit$default.get(i)) + ":current" + strY1);
                            StringBuilder sb = new StringBuilder();
                            sb.append(strY1);
                            sb.append('|');
                            sb.append((String) listSplit$default.get(i));
                            map.put(str, sb.toString());
                        }
                        i = i2;
                    }
                    if (!map.isEmpty()) {
                        nn3.a.f("getDeviceBehaviour", Intrinsics.stringPlus("", map));
                        ScanUtils scanUtils = ScanUtils.a;
                        if5 if5Var = this.f;
                        String string = map.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "diffrentRes.toString()");
                        scanUtils.b0(if5Var, string);
                        scanUtils.e1(arrayListArrayListOf, arrayList, fk2VarA);
                    }
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> getTheInstallationSourceOfInstalledApps: Error: ", e), e);
            } catch (NoClassDefFoundError e2) {
                nn3.c(nn3.a, ScanUtils.b, e2.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ Context f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(if5 if5Var, Context context, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = context;
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
            try {
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                List<ml4> addparmsList = this.e.getAddparmsList();
                Intrinsics.checkNotNull(addparmsList);
                boolean z = true;
                if (addparmsList.isEmpty()) {
                    arrayList = new ArrayList(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.android.vending", "com.google.android.feedback", "com.sec.android.app.samsungapps", "com.vivo.appstore", "com.xiaomi.mipicks", "com.coloros.oshare"}));
                } else {
                    Iterator<ml4> it = addparmsList.iterator();
                    while (it.hasNext()) {
                        String addpar1 = it.next().getAddpar1();
                        Intrinsics.checkNotNull(addpar1);
                        arrayList.add(addpar1);
                    }
                }
                int i = Build.VERSION.SDK_INT;
                String installingPackageName = i >= 30 ? this.f.getPackageManager().getInstallSourceInfo(this.f.getPackageName()).getInstallingPackageName() : this.f.getPackageManager().getInstallerPackageName(this.f.getPackageName());
                nn3 nn3Var = nn3.a;
                nn3Var.f("UnKnowSource", Intrinsics.stringPlus("", arrayList));
                if (installingPackageName == null || !arrayList.contains(installingPackageName)) {
                    if (installingPackageName == null || installingPackageName.length() == 0) {
                        String str = ScanUtils.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Application Installed From Unknown Source{");
                        if (installingPackageName != null && installingPackageName.length() != 0) {
                            z = false;
                        }
                        sb.append(z);
                        sb.append('}');
                        nn3Var.f(str, sb.toString());
                        if (installingPackageName == null) {
                            ScanUtils scanUtils = ScanUtils.a;
                            if (scanUtils.B() != null) {
                                nn3Var.f(ScanUtils.b, "Application Installed From Unknown Source");
                                scanUtils.h1(this.e, "ADB Or Others Source", this.f);
                            }
                        }
                    } else {
                        String str2 = ScanUtils.b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Application Installed From Unknown Source{");
                        if (installingPackageName.length() != 0) {
                            z = false;
                        }
                        sb2.append(z);
                        sb2.append('}');
                        nn3Var.f(str2, sb2.toString());
                        if (!StringsKt__StringsKt.contains$default((CharSequence) installingPackageName, (CharSequence) "com.android.vending", false, 2, (Object) null)) {
                            ScanUtils.a.h1(this.e, installingPackageName, this.f);
                        }
                    }
                } else if (i < 30) {
                    nn3Var.f(ScanUtils.b, "Application Installed From Google Play Store");
                } else if (jt.c.C().getPackageManager().getInstallSourceInfo(this.f.getPackageName()).getInitiatingPackageSigningInfo() == null) {
                    ScanUtils.a.h1(this.e, Intrinsics.stringPlus(installingPackageName, "|signatureOfInstaller is null"), this.f);
                } else {
                    nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("Application Installed From valid source:-", installingPackageName));
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> getTheInstallationSourceOfInstalledApps: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(if5 if5Var, String str, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((g) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.e, this.f, continuation);
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
                String shortdescription = this.e.getShortdescription();
                Intrinsics.checkNotNull(shortdescription);
                String recommendation = this.e.getRecommendation();
                Intrinsics.checkNotNull(recommendation);
                String redirecturl = this.e.getRedirecturl();
                Intrinsics.checkNotNull(redirecturl);
                md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, this.e.getForceCloseTime(), this.e.getClearDataFlag());
                String ruleaction2 = this.e.getRuleaction();
                eg5 eg5Var = eg5.a;
                if (!Intrinsics.areEqual(ruleaction2, eg5Var.m()) && !CollectionsKt___CollectionsKt.contains(aVar2.O(), md5Var.getVulnerabilityCode()) && !CollectionsKt___CollectionsKt.contains(aVar2.K(), md5Var.getVulnerabilityCode())) {
                    ScanUtils.h.j(this.e);
                    kt ktVarV = aVar2.v();
                    if (ktVarV != null) {
                        ktVarV.d(md5Var);
                    }
                } else if (Intrinsics.areEqual(this.e.getRuleaction(), eg5Var.m())) {
                    Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                    Intrinsics.checkNotNull(vulnerabilityCode);
                    aVar2.l0(vulnerabilityCode.intValue());
                    ScanUtils.h.j(this.e);
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> isFridaServerRunning: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((h) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if ((this.e.getApplicationInfo().flags & 2) != 0) {
                    nn3.a.f("AppDebug-TestScan", "Yes Debuggable");
                } else {
                    nn3.a.f("AppDebug-TestScan", "No Not a Debuggable");
                }
                nn3 nn3Var = nn3.a;
                jt.a aVar = jt.c;
                nn3Var.f("AppDebug-TestScan", Intrinsics.stringPlus("IsDebuggable : ", Boxing.boxBoolean(aVar.c0())));
                if (aVar.c0()) {
                    ScanUtils.a.b0(this.f, String.valueOf(aVar.b0()));
                } else {
                    String str = ScanUtils.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(">>>>>>>>>>>isApplicationDebuggingModeEnabled=========else::");
                    ApplicationInfo applicationInfo = this.e.getApplicationInfo();
                    sb.append(applicationInfo == null ? null : Boxing.boxInt(applicationInfo.flags));
                    sb.append("&&2");
                    nn3Var.f(str, sb.toString());
                }
            } catch (Exception e) {
                nn3.a.i(e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ if5 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((i) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object systemService;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                systemService = this.e.getSystemService("keyguard");
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> isDeviceLockCheck: Error: ", e), e);
            }
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.KeyguardManager");
            }
            KeyguardManager keyguardManager = (KeyguardManager) systemService;
            nn3 nn3Var = nn3.a;
            nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("isDeviceLockCheck1", Boxing.boxBoolean(keyguardManager.isDeviceSecure())));
            boolean zIsDeviceSecure = keyguardManager.isDeviceSecure();
            nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("isDeviceLockCheck", Boxing.boxBoolean(zIsDeviceSecure)));
            String methodname = this.f.getMethodname();
            eg5.a.C0078a unused = ScanUtils.g;
            if (Intrinsics.areEqual(methodname, "automaticLock")) {
                if (zIsDeviceSecure) {
                    Integer numBoxInt = Boxing.boxInt(this.f.getRuleid());
                    String title = this.f.getTitle();
                    String strS = ScanUtils.a.S(this.e, NativeInteractor.a.U0());
                    String msg = this.f.getMsg();
                    String ruleaction = this.f.getRuleaction();
                    String shortdescription = this.f.getShortdescription();
                    Intrinsics.checkNotNull(shortdescription);
                    String recommendation = this.f.getRecommendation();
                    Intrinsics.checkNotNull(recommendation);
                    String redirecturl = this.f.getRedirecturl();
                    Intrinsics.checkNotNull(redirecturl);
                    md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, this.f.getForceCloseTime(), this.f.getClearDataFlag());
                    kt ktVarV = jt.c.v();
                    if (ktVarV != null) {
                        ktVarV.f(md5Var);
                    }
                } else {
                    ScanUtils.a.b0(this.f, "");
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((j) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                NativeInteractor nativeInteractor = NativeInteractor.a;
                if (!Intrinsics.areEqual(nativeInteractor.w(), nativeInteractor.Z())) {
                    ScanUtils scanUtils = ScanUtils.a;
                    scanUtils.b0(this.e, nativeInteractor.w() + "|-|" + scanUtils.Q());
                }
                if (jt.c.f()) {
                    ScanUtils.a.l0(this.e);
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> loadFridalib: Error: ", e), e);
            } catch (UnsatisfiedLinkError e2) {
                nn3.c(nn3.a, ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> loadFridalib: Error: ", e2), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.e = activity;
        }

        public static final void d(Activity activity) {
            ScanUtils scanUtils = ScanUtils.a;
            if (scanUtils.u0(activity)) {
                nn3.a.f(ScanUtils.b, "SS is applied");
                return;
            }
            ScanUtils.i++;
            if (ScanUtils.i < 10) {
                Log.i(ScanUtils.b, "SS is not applied");
            }
            scanUtils.J(activity);
            scanUtils.t0(activity);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((k) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c = 1;
                if (bh1.a(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final Activity activity = this.e;
            activity.runOnUiThread(new Runnable() { // from class: com.zepto.io5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.k.d(activity);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ List e;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((if5) obj).getRuleid()), Integer.valueOf(((if5) obj2).getRuleid()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list, Continuation continuation) {
            super(2, continuation);
            this.e = list;
        }

        public static final void d(md5 md5Var, if5 if5Var) {
            String vulnerabilityActionRequired = md5Var.getVulnerabilityActionRequired();
            ScanUtils scanUtils = ScanUtils.a;
            jt.a aVar = jt.c;
            if (Intrinsics.areEqual(vulnerabilityActionRequired, scanUtils.S(aVar.C(), NativeInteractor.a.Z0()))) {
                nn3.a.f(ScanUtils.b, "Close And Clear App Data  Scautils:" + md5Var.getVulnerabilityCode() + ':');
                if (!scanUtils.h0()) {
                    scanUtils.d1(true);
                    ScanAlerts scanAlertsL = aVar.L();
                    Intrinsics.checkNotNull(scanAlertsL);
                    scanAlertsL.h0(false);
                    scanUtils.b1(md5Var, if5Var);
                }
            }
            if (scanUtils.h0()) {
                return;
            }
            ScanAlerts scanAlertsL2 = aVar.L();
            Intrinsics.checkNotNull(scanAlertsL2);
            scanAlertsL2.h0(false);
            scanUtils.b1(md5Var, if5Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((l) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus("isShowAlertInNxtActivity::Error ", e), e);
            }
            if (ScanCore.a.U0()) {
                return Unit.INSTANCE;
            }
            jt.a aVar = jt.c;
            List listMinus = CollectionsKt___CollectionsKt.minus((Iterable) aVar.K(), (Iterable) CollectionsKt___CollectionsKt.toSet(aVar.O()));
            if (!this.e.isEmpty()) {
                nn3.a.f("ShownxtActivity", Intrinsics.stringPlus("", this.e));
                listMinus = CollectionsKt___CollectionsKt.minus((Iterable) listMinus, (Iterable) CollectionsKt___CollectionsKt.toSet(this.e));
            }
            nn3 nn3Var = nn3.a;
            nn3Var.f("ShownxtActivity", Intrinsics.stringPlus("=====res", aVar.K()));
            nn3Var.f("ShownxtActivity", Intrinsics.stringPlus("=====", listMinus));
            if (!listMinus.isEmpty()) {
                List listE = l06.e.a().e();
                if (listE.isEmpty()) {
                    return Unit.INSTANCE;
                }
                for (final if5 if5Var : CollectionsKt___CollectionsKt.sortedWith(listE, new a())) {
                    Iterator it = listMinus.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (if5Var.getRuleid() == iIntValue) {
                            Integer numBoxInt = Boxing.boxInt(if5Var.getRuleid());
                            String title = if5Var.getTitle();
                            ScanUtils scanUtils = ScanUtils.a;
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
                            final md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, if5Var.getForceCloseTime(), if5Var.getClearDataFlag());
                            if (Intrinsics.areEqual(if5Var.getRuleaction(), eg5.a.m()) || CollectionsKt___CollectionsKt.contains(aVar2.O(), md5Var.getVulnerabilityCode())) {
                                nn3.a.f("Appprotectt", "Skipping   alert");
                            } else {
                                nn3.a.f("Appprotectt", String.valueOf(md5Var.getVulnerabilityCode()));
                                if (aVar2.r() != null) {
                                    Activity activityR = aVar2.r();
                                    Intrinsics.checkNotNull(activityR);
                                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.jo5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ScanUtils.l.d(md5Var, if5Var);
                                        }
                                    });
                                }
                            }
                            nn3.a.f("FinalAlert", "**Match" + if5Var.getRuleid() + "==" + iIntValue);
                        }
                    }
                }
            } else {
                nn3Var.f("Appprotectt", "No Need To Show Alert");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;
        public final /* synthetic */ Context f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(if5 if5Var, Context context, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((m) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                new ArrayList();
                List<ml4> addparmsList = this.e.getAddparmsList();
                Intrinsics.checkNotNull(addparmsList);
                String strValueOf = "";
                if (!addparmsList.isEmpty()) {
                    Iterator<ml4> it = addparmsList.iterator();
                    while (it.hasNext()) {
                        strValueOf = String.valueOf(it.next().getAddpar1());
                    }
                    PackageInfo packageInfo = this.f.getPackageManager().getPackageInfo(this.f.getPackageName(), 1);
                    ScanUtils scanUtils = ScanUtils.a;
                    String str = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(str, "info.versionName");
                    if (scanUtils.A(str, strValueOf)) {
                        nn3.a.f(ScanUtils.b, Intrinsics.stringPlus("Safe Response version : ", packageInfo.versionName));
                    } else {
                        nn3.a.f(ScanUtils.b, "UnSafe Response: current version" + ((Object) packageInfo.versionName) + "expected Version : " + strValueOf);
                        if5 if5Var = this.e;
                        String str2 = packageInfo.versionName;
                        Intrinsics.checkNotNullExpressionValue(str2, "info.versionName");
                        scanUtils.b0(if5Var, str2);
                    }
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> isThisLowVersionApplication: Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context, Continuation continuation) {
            super(2, continuation);
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((n) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object systemService;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                systemService = this.e.getApplicationContext().getSystemService("wifi");
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus("isWiFiSecured", e), e);
            }
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
            }
            WifiManager wifiManager = (WifiManager) systemService;
            List<ScanResult> scanResults = wifiManager.getScanResults();
            Intrinsics.checkNotNullExpressionValue(scanResults, "wifiManager.scanResults");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            Intrinsics.checkNotNullExpressionValue(connectionInfo, "wifiManager.connectionInfo");
            String ssid = connectionInfo.getSSID();
            if (ssid != null && ssid.length() != 0) {
                String ssid2 = connectionInfo.getSSID();
                Intrinsics.checkNotNullExpressionValue(ssid2, "wifi.ssid");
                String strSubstring = ssid2.substring(1, ssid.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (!Intrinsics.areEqual(strSubstring, "unknown ssid")) {
                    for (ScanResult scanResult : scanResults) {
                        if (Intrinsics.areEqual(strSubstring, scanResult.SSID)) {
                            String capabilities = scanResult.capabilities;
                            Intrinsics.checkNotNullExpressionValue(capabilities, "capabilities");
                            if (StringsKt__StringsKt.contains$default((CharSequence) capabilities, (CharSequence) "WPA2", false, 2, (Object) null)) {
                                ScanUtils.a.Y0(43);
                            } else if (StringsKt__StringsKt.contains$default((CharSequence) capabilities, (CharSequence) "WPA", false, 2, (Object) null)) {
                                ScanUtils.a.Y0(43);
                            } else if (StringsKt__StringsKt.contains$default((CharSequence) capabilities, (CharSequence) "WEP", false, 2, (Object) null)) {
                                ScanUtils.a.Y0(43);
                            } else {
                                Iterator it = jt.c.G().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if5 if5Var = (if5) it.next();
                                        String methodname = if5Var.getMethodname();
                                        eg5.a.C0078a unused = ScanUtils.g;
                                        if (Intrinsics.areEqual(methodname, "wifiSecurity")) {
                                            ScanUtils.a.b0(if5Var, ssid + ':' + ((Object) capabilities));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;

        public static final class a extends ConnectivityManager.NetworkCallback {
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
                if (wifiInfo == null) {
                    nn3.a.f(ScanUtils.b, "wifiINfo is null");
                    return;
                }
                int currentSecurityType = wifiInfo.getCurrentSecurityType();
                String str = currentSecurityType != 0 ? currentSecurityType != 1 ? currentSecurityType != 2 ? currentSecurityType != 3 ? currentSecurityType != 4 ? currentSecurityType != 6 ? currentSecurityType != 9 ? "Unknown" : "WPA3-Enterprise" : "Enhanced Open" : "WPA3-Personal" : "WPA/WPA2-Enterprise" : "WPA/WPA2-Personal" : "WEP" : "Open";
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "WPA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "WEP", false, 2, (Object) null)) {
                    ScanUtils.a.Y0(43);
                    return;
                }
                for (if5 if5Var : jt.c.G()) {
                    String methodname = if5Var.getMethodname();
                    eg5.a.C0078a unused = ScanUtils.g;
                    if (Intrinsics.areEqual(methodname, "wifiSecurity")) {
                        ScanUtils.a.b0(if5Var, Intrinsics.stringPlus("capabilities:", str));
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context, Continuation continuation) {
            super(2, continuation);
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((o) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object systemService;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                systemService = this.e.getSystemService("connectivity");
            } catch (Exception e) {
                nn3.c(nn3.a, ScanUtils.b, e.toString(), null, 4, null);
            }
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 31) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), new a());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ Activity f;
        public final /* synthetic */ if5 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Context context, Activity activity, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = context;
            this.f = activity;
            this.g = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((p) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new p(this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            File[] fileArrListFiles;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                oj1 oj1Var = oj1.a;
                if (oj1Var.f() == null) {
                    oj1Var.j(this.e);
                }
                int i = 0;
                Object[] objArr = {this.f, Boxing.boxBoolean(true), gw4.a.a()};
                mx2 mx2Var = mx2.a;
                NativeInteractor nativeInteractor = NativeInteractor.a;
                Object objE = mx2Var.e(nativeInteractor.r1(), objArr);
                nn3 nn3Var = nn3.a;
                nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("Dex Total tamperingInfo Res:-", objE));
                if (!Intrinsics.areEqual(String.valueOf(objE), ScanCore.a.T("U0FGRQ==")) || Intrinsics.areEqual(nativeInteractor.K0(this.e, this.f), nativeInteractor.M0())) {
                    ArrayList arrayList = new ArrayList();
                    if (Intrinsics.areEqual(nativeInteractor.K0(this.e, this.f), nativeInteractor.M0())) {
                        String str = this.e.getApplicationInfo().sourceDir;
                        Intrinsics.checkNotNullExpressionValue(str, "context.applicationInfo.sourceDir");
                        File file = new File(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "base.apk"));
                        if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                            File[] fileArrListFiles2 = file.listFiles();
                            Intrinsics.checkNotNull(fileArrListFiles2);
                            int length = fileArrListFiles2.length;
                            while (i < length) {
                                File file2 = fileArrListFiles2[i];
                                i++;
                                nn3.a.f(ScanUtils.b, Intrinsics.stringPlus("", file2.getName()));
                                String name = file2.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "i.name");
                                arrayList.add(name);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    boolean zIsEmpty = arrayList.isEmpty();
                    Object obj2 = arrayList;
                    if (zIsEmpty) {
                        obj2 = "G";
                    }
                    sb.append(obj2);
                    sb.append('#');
                    sb.append(objE);
                    String string = sb.toString();
                    if5 if5Var = this.g;
                    if (if5Var == null) {
                        ScanAlerts scanAlertsL = jt.c.L();
                        if5 if5VarQ = scanAlertsL == null ? null : scanAlertsL.Q(225);
                        if (if5VarQ != null) {
                            ScanUtils.a.b0(if5VarQ, string);
                        }
                    } else {
                        ScanUtils.a.b0(if5Var, string);
                    }
                } else {
                    nn3Var.f(ScanUtils.b, Intrinsics.stringPlus("Dex tamperingInfo Res:-", objE));
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class q extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((q) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new q(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                new ArrayList();
                List<ml4> addparmsList = this.e.getAddparmsList();
                Intrinsics.checkNotNull(addparmsList);
                nn3 nn3Var = nn3.a;
                nn3Var.f("VersionCheck", Intrinsics.stringPlus("", new Gson().toJson(addparmsList)));
                if (!addparmsList.isEmpty()) {
                    int i2 = 0;
                    for (ml4 ml4Var : addparmsList) {
                        String addpar1 = ml4Var.getAddpar1();
                        Intrinsics.checkNotNull(addpar1);
                        if (StringsKt__StringsKt.contains$default((CharSequence) addpar1, (CharSequence) ".", false, 2, (Object) null)) {
                            String addpar12 = ml4Var.getAddpar1();
                            Intrinsics.checkNotNull(addpar12);
                            i2 = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) addpar12, new String[]{"."}, false, 0, 6, (Object) null).get(0));
                        } else {
                            String addpar13 = ml4Var.getAddpar1();
                            Intrinsics.checkNotNull(addpar13);
                            i2 = Integer.parseInt(addpar13);
                        }
                        nn3.a.f(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> lowerVersionOfAndroid: Bolcking Version:Android :-", Boxing.boxInt(i2)));
                    }
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    if (StringsKt__StringsKt.contains$default((CharSequence) RELEASE, (CharSequence) ".", false, 2, (Object) null)) {
                        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                        i = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) RELEASE, new String[]{"."}, false, 0, 6, (Object) null).get(0));
                        nn3 nn3Var2 = nn3.a;
                        nn3Var2.f(ScanUtils.b, ">>>>>>>>>>>> lowerVersionOfAndroid: current  Version:Android :- " + ((Object) RELEASE) + ' ');
                        nn3Var2.f(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> lowerVersionOfAndroid: current  Version:Android Final :- ", Boxing.boxInt(i)));
                    } else {
                        Intrinsics.checkNotNull(RELEASE);
                        i = Integer.parseInt(RELEASE);
                        nn3.a.f(ScanUtils.b, Intrinsics.stringPlus(">>>>>>>>>>>> lowerVersionOfAndroid: current  Version:Android Final :- ", Boxing.boxInt(i)));
                    }
                    if (i2 >= i) {
                        nn3.a.f(ScanUtils.b, ">>>>>>>>>>>> lowerVersionOfAndroid: UnSafe Response");
                        ScanUtils.a.b0(this.e, eg5.a.i());
                    } else {
                        nn3.a.f(ScanUtils.b, ">>>>>>>>>>>> lowerVersionOfAndroid: Safe Response");
                    }
                } else {
                    nn3Var.f(ScanUtils.b, ">>>>>>>>>>>> lowerVersionOfAndroid:  is Empty");
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, e.toString(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements Function2 {
        public int c;
        public int e;
        public Object f;
        public Object g;
        public int h;
        public final /* synthetic */ Context i;
        public final /* synthetic */ if5 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.i = context;
            this.j = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((r) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            if5 if5Var;
            int i;
            int i2;
            Context context;
            r rVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.h;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context2 = this.i;
                    if5Var = this.j;
                    i = 3;
                    i2 = 0;
                    context = context2;
                    rVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = this.e;
                    i = this.c;
                    if5 if5Var2 = (if5) this.g;
                    context = (Context) this.f;
                    ResultKt.throwOnFailure(obj);
                    rVar = this;
                    i2 = i4;
                    if5Var = if5Var2;
                }
                while (i2 < i) {
                    i2++;
                    ScanUtils scanUtils = ScanUtils.a;
                    if (scanUtils.s0(context) || scanUtils.A0(context)) {
                        scanUtils.b0(if5Var, scanUtils.V0());
                    } else {
                        scanUtils.Y0(if5Var.getRuleid());
                    }
                    rVar.f = context;
                    rVar.g = if5Var;
                    rVar.c = i;
                    rVar.e = i2;
                    rVar.h = 1;
                    if (bh1.a(2000L, rVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanUtils.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class s extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.e = i;
            this.f = str;
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
                ScanAlerts scanAlertsL = jt.c.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(this.e);
                if (if5VarQ != null) {
                    ScanUtils.a.b0(if5VarQ, this.f);
                } else {
                    nn3.a.f(ScanUtils.b, "Rule Id" + this.e + "Not exists");
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, Intrinsics.stringPlus("Error: ", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i, Continuation continuation) {
            super(2, continuation);
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((t) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new t(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                ScanAlerts scanAlertsL = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(this.e);
                if (if5VarQ != null) {
                    Integer numBoxInt = Boxing.boxInt(if5VarQ.getRuleid());
                    String title = if5VarQ.getTitle();
                    String strS = ScanUtils.a.S(aVar.C(), NativeInteractor.a.U0());
                    String msg = if5VarQ.getMsg();
                    String ruleaction = if5VarQ.getRuleaction();
                    String shortdescription = if5VarQ.getShortdescription();
                    Intrinsics.checkNotNull(shortdescription);
                    String recommendation = if5VarQ.getRecommendation();
                    Intrinsics.checkNotNull(recommendation);
                    String redirecturl = if5VarQ.getRedirecturl();
                    Intrinsics.checkNotNull(redirecturl);
                    md5 md5Var = new md5(numBoxInt, title, strS, msg, ruleaction, shortdescription, recommendation, redirecturl, if5VarQ.getForceCloseTime(), if5VarQ.getClearDataFlag());
                    kt ktVarV = aVar.v();
                    if (ktVarV != null) {
                        ktVarV.f(md5Var);
                    }
                }
            } catch (Exception e) {
                nn3.a.b(ScanUtils.b, String.valueOf(e.getMessage()), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class u extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, Continuation continuation) {
            super(2, continuation);
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((u) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (this.e.length() > 0) {
                    ScanAlerts scanAlertsL = jt.c.L();
                    Intrinsics.checkNotNull(scanAlertsL);
                    if5 if5VarQ = scanAlertsL.Q(214);
                    if (if5VarQ != null) {
                        ScanUtils.a.b0(if5VarQ, this.e);
                    } else {
                        nn3.a.f("TAG", "==============>>Rule Id 214 Not Configured");
                    }
                }
            } catch (Exception e) {
                nn3.a.b("TAG", Intrinsics.stringPlus("==============>>saveDebuggerThread Error::", e), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class v extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ if5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.e = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((v) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new v(this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                if (aVar.j() != null) {
                    zy zyVarJ = aVar.j();
                    Intrinsics.checkNotNull(zyVarJ);
                    String attestationResInfo = zyVarJ.getAttestationResInfo();
                    if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
                        nn3.a.f("NewAtTest", Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                    } else if (ScanCore.a.Y0()) {
                        nn3.a.f("NewAtTest", "Attestation happened.. " + ((Object) attestationResInfo) + " Dev-option enabled");
                        ScanUtils.a.b0(this.e, Intrinsics.stringPlus(attestationResInfo, " |-|RootedVirtualDevice"));
                    }
                } else {
                    nn3.a.f(ScanUtils.b, "Attestation not happened..");
                }
            } catch (Exception e) {
                nn3.c(nn3.a, ScanUtils.b, e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w extends BroadcastReceiver {

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ Context e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, Continuation continuation) {
                super(2, continuation);
                this.e = context;
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
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.c = 1;
                        if (bh1.a(4000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ScanUtils scanUtils = ScanUtils.a;
                    if (!scanUtils.F0(this.e)) {
                        scanUtils.Y0(43);
                        nn3.a.f("wifiStateReceiver", "Wifi Not enabled");
                    } else if (Build.VERSION.SDK_INT >= 31) {
                        scanUtils.E0(jt.c.C());
                    } else {
                        jt.a aVar = jt.c;
                        if (!scanUtils.d0(aVar.C())) {
                            nn3.a.f(ScanUtils.b, "Enable GPS  Settings");
                        } else if (scanUtils.o0()) {
                            scanUtils.D0(aVar.C());
                        } else {
                            nn3.a.f(ScanUtils.b, "Location Permission is Required for wifiSecurity **");
                        }
                    }
                } catch (Exception e) {
                    nn3.c(nn3.a, ScanUtils.b, e.toString(), null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            try {
                nn3.a.f("wifiStateReceiver", Intrinsics.stringPlus("onReceive Called ", intent.getAction()));
                if (StringsKt__StringsJVMKt.equals$default(intent.getAction(), "android.net.wifi.STATE_CHANGE", false, 2, null)) {
                    f80.d(qj2.c, qk1.a(), null, new a(context, null), 2, null);
                }
            } catch (Exception e) {
                nn3.a.i(e);
            }
        }
    }

    public static /* synthetic */ void I0(ScanUtils scanUtils, Context context, Activity activity, if5 if5Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            if5Var = null;
        }
        scanUtils.H0(context, activity, if5Var);
    }

    public static final void K0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.w1());
    }

    public static final void L(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(67108864);
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        if (activityR != null) {
            activityR.startActivity(intent);
        }
        Iterator it = aVar.d().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
        Activity activityR2 = jt.c.r();
        if (activityR2 != null) {
            activityR2.finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void L0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.q1());
    }

    public static final void M0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.h1());
    }

    public static final void N0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.g1());
    }

    public static final void O0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.j1());
    }

    public static final void P0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.s1());
    }

    public static final void Q0() {
        ScanUtils scanUtils = a;
        NativeInteractor nativeInteractor = NativeInteractor.a;
        scanUtils.K(nativeInteractor.G0(), nativeInteractor.t1());
    }

    public static final void Y(nq it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        it.j();
    }

    public static final void Z(nq it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        it.j();
    }

    public static final void a0(if5 ruleItem) {
        Intrinsics.checkNotNullParameter(ruleItem, "$ruleItem");
        if (Intrinsics.areEqual(ruleItem.getRuleaction(), NativeInteractor.a.e1())) {
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            aVar.o().setVisibility(8);
            ConstraintLayout constraintLayoutM = aVar.m();
            if (constraintLayoutM == null) {
                return;
            }
            constraintLayoutM.setVisibility(0);
        }
    }

    public static /* synthetic */ void x0(ScanUtils scanUtils, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        scanUtils.w0(list);
    }

    public final boolean A(String str, String str2) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        int i2 = Integer.parseInt((String) listSplit$default.get(0));
        int i3 = Integer.parseInt((String) listSplit$default2.get(0));
        int i4 = Integer.parseInt((String) listSplit$default.get(1));
        int i5 = Integer.parseInt((String) listSplit$default2.get(1));
        if (str2.equals(str)) {
            return false;
        }
        if (i3 > i2) {
            return true;
        }
        if (((String) listSplit$default2.get(0)).equals(listSplit$default.get(0))) {
            if (i5 > i4) {
                return true;
            }
            if (i5 == i4) {
                if (listSplit$default2.size() == 3 && listSplit$default.size() == 3) {
                    if (Integer.parseInt((String) listSplit$default2.get(2)) > Integer.parseInt((String) listSplit$default.get(2))) {
                        return true;
                    }
                }
                if (listSplit$default2.size() == 3 && listSplit$default.size() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            ProxyInfo httpProxy = null;
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            LinkProperties linkProperties = connectivityManager == null ? null : connectivityManager.getLinkProperties(connectivityManager == null ? null : connectivityManager.getActiveNetwork());
            if (linkProperties != null) {
                httpProxy = linkProperties.getHttpProxy();
            }
            return httpProxy != null;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return false;
        }
    }

    public final ZipEntry B() {
        try {
            jt.a aVar = jt.c;
            ApplicationInfo applicationInfo = aVar.C().getPackageManager().getApplicationInfo(aVar.C().getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "mAppContext.packageManag…ppContext.packageName, 0)");
            return new ZipFile(new File(applicationInfo.sourceDir)).getEntry("META-INF/MANIFEST.MF");
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final boolean B0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasTransport(4);
        } catch (Exception e2) {
            nn3.a.b(b, String.valueOf(e2.getMessage()), e2);
            return false;
        }
    }

    public final void C(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f80.d(qj2.c, null, null, new a(msg, null), 3, null);
    }

    public final void C0(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Object systemService = jt.c.C().getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        if (((AudioManager) systemService).getMode() == 2) {
            nn3.a.f("AUDIO_SERVICE", "You are in voiceCall");
            b0(ruleObject, "Active Voice Call Connected");
        } else {
            nn3.a.f("AUDIO_SERVICE", "You are Not in  Voice Call");
            Y0(223);
        }
    }

    public final void D(AlertDialog alertDialog) {
        alertDialog.dismiss();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(67108864);
        jt.a aVar = jt.c;
        Activity activityR = aVar.r();
        if (activityR != null) {
            activityR.startActivity(intent);
        }
        Iterator it = aVar.d().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
        Activity activityR2 = jt.c.r();
        if (activityR2 != null) {
            activityR2.finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void D0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(zz0.a(qk1.b()), null, null, new n(context, null), 3, null);
    }

    public final ArrayList E(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.trim((CharSequence) str).toString(), (CharSequence) "["), (CharSequence) "]"), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{":"}, false, 0, 6, (Object) null).get(0)).toString());
        }
        return new ArrayList(arrayList);
    }

    public final void E0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(zz0.a(qk1.b()), null, null, new o(context, null), 3, null);
    }

    public final void F(List list, if5 if5Var) {
        if (!list.isEmpty()) {
            HashMap map = (HashMap) new Gson().fromJson((String) CollectionsKt___CollectionsKt.first(list), new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.main.scan.ScanUtils$createResForAppListing$type$1
            }.getType());
            List listS0 = ScanCore.a.s0();
            Set setKeySet = map.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "appInfo.keys");
            if (listS0.contains(CollectionsKt___CollectionsKt.first(setKeySet))) {
                Integer numValueOf = Integer.valueOf(if5Var.getRuleid());
                String title = if5Var.getTitle();
                jt.a aVar = jt.c;
                String strS = S(aVar.C(), NativeInteractor.a.u1());
                String msg = if5Var.getMsg();
                String ruleaction = if5Var.getRuleaction();
                String str = (String) CollectionsKt___CollectionsKt.first(list);
                String shortdescription = if5Var.getShortdescription();
                String recommendation = if5Var.getRecommendation();
                String redirecturl = if5Var.getRedirecturl();
                Intrinsics.checkNotNull(redirecturl);
                md5 md5Var = new md5(numValueOf, title, strS, msg, ruleaction, str, shortdescription, recommendation, redirecturl, if5Var.getForceCloseTime(), if5Var.getClearDataFlag());
                ScanAlerts scanAlertsL = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL);
                scanAlertsL.B(md5Var);
            }
        }
    }

    public final boolean F0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) == null) {
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            Intrinsics.checkNotNull(networkCapabilities);
            return networkCapabilities.hasTransport(1);
        } catch (Exception e2) {
            nn3.a.f(b, Intrinsics.stringPlus("isWifiEnable:Error", e2));
            return false;
        }
    }

    public final String G(String str) {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        Intrinsics.checkNotNull(str);
        return nativeInteractor.m(str);
    }

    public final void G0() {
        try {
            nn3 nn3Var = nn3.a;
            String str = b;
            jt.a aVar = jt.c;
            Set setKeySet = z(aVar.C()).keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "anyNonSystemAppGettingAc…xt\n                ).keys");
            nn3Var.f(str, Intrinsics.stringPlus("keyloggerPrevetionNotSystemApp inside ", CollectionsKt___CollectionsKt.toList(setKeySet)));
            if (aVar.r() != null) {
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                View rootView = activityR.getWindow().getDecorView().getRootView();
                if (Build.VERSION.SDK_INT >= 34) {
                    rootView.setFilterTouchesWhenObscured(true);
                } else if (!z(aVar.C()).isEmpty()) {
                    rootView.setImportantForAccessibility(4);
                }
            }
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("KeyLogger Prevention::Error: ", e2), e2);
        }
    }

    public final void H(if5 mtName) {
        Intrinsics.checkNotNullParameter(mtName, "mtName");
        try {
            jt.a aVar = jt.c;
            if (aVar.r() != null) {
                if (r0()) {
                    Activity activityR = aVar.r();
                    Intrinsics.checkNotNull(activityR);
                    String localClassName = activityR.getLocalClassName();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    if (!Intrinsics.areEqual(localClassName, nativeInteractor.B1())) {
                        Activity activityR2 = aVar.r();
                        Intrinsics.checkNotNull(activityR2);
                        if (!Intrinsics.areEqual(activityR2.getLocalClassName(), nativeInteractor.C1())) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                Activity activityR3 = aVar.r();
                                Intrinsics.checkNotNull(activityR3);
                                activityR3.getWindow().setHideOverlayWindows(true);
                            }
                            aVar.P0(mtName);
                            Activity activityR4 = aVar.r();
                            Intrinsics.checkNotNull(activityR4);
                            View rootView = activityR4.getWindow().getDecorView().getRootView();
                            rootView.setOnTouchListener(k);
                            rootView.setFilterTouchesWhenObscured(true);
                            return;
                        }
                    }
                }
                nn3 nn3Var = nn3.a;
                Activity activityR5 = aVar.r();
                Intrinsics.checkNotNull(activityR5);
                nn3Var.f("detectScreenOverlay", Intrinsics.stringPlus("ignored activity: ", activityR5.getLocalClassName()));
            }
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("detectScreenOverlay::Error: ", e2), e2);
        }
    }

    public final void H0(Context context, Activity activity, if5 if5Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        f80.d(qj2.c, null, null, new p(context, activity, if5Var, null), 3, null);
    }

    public final void I(if5 ruleObject, Context context) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Intrinsics.checkNotNullParameter(context, "context");
        f80.d(qj2.c, null, null, new b(ruleObject, null), 3, null);
    }

    public final void J(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            nn3.a.f(b, Intrinsics.stringPlus("SS Apply method called:-", activity));
            activity.runOnUiThread(new c(activity));
        } catch (Exception e2) {
            nn3.a.f(b, String.valueOf(e2.getMessage()));
            Unit.INSTANCE.toString();
        }
    }

    public final boolean J0() {
        nn3 nn3Var = nn3.a;
        nn3Var.f(b, "============>>>>>>>>>>>::ChannelDetls Validation Called 3");
        jt.a aVar = jt.c;
        if (aVar.e0()) {
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.zn5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.K0();
                }
            });
        }
        s06.a aVar2 = s06.m;
        s06 s06VarA = aVar2.a();
        Intrinsics.checkNotNull(s06VarA);
        ni0 ni0VarH = s06VarA.h();
        Intrinsics.checkNotNull(ni0VarH);
        String apppackage = ni0VarH.getApppackage();
        Intrinsics.checkNotNull(apppackage);
        qq0 qq0VarP = aVar.p();
        Intrinsics.checkNotNull(qq0VarP);
        if (!apppackage.equals(qq0VarP.getPackageName())) {
            Activity activityR2 = aVar.r();
            Intrinsics.checkNotNull(activityR2);
            activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.ao5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.L0();
                }
            });
            return false;
        }
        s06 s06VarA2 = aVar2.a();
        Intrinsics.checkNotNull(s06VarA2);
        ni0 ni0VarH2 = s06VarA2.h();
        Intrinsics.checkNotNull(ni0VarH2);
        int cliid = ni0VarH2.getCliid();
        qq0 qq0VarP2 = aVar.p();
        Intrinsics.checkNotNull(qq0VarP2);
        if (cliid != qq0VarP2.getClientId()) {
            Activity activityR3 = aVar.r();
            Intrinsics.checkNotNull(activityR3);
            activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.bo5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.M0();
                }
            });
            return false;
        }
        s06 s06VarA3 = aVar2.a();
        Intrinsics.checkNotNull(s06VarA3);
        ni0 ni0VarH3 = s06VarA3.h();
        Intrinsics.checkNotNull(ni0VarH3);
        int chnid = ni0VarH3.getChnid();
        qq0 qq0VarP3 = aVar.p();
        Intrinsics.checkNotNull(qq0VarP3);
        if (chnid != qq0VarP3.getChannelId()) {
            Activity activityR4 = aVar.r();
            Intrinsics.checkNotNull(activityR4);
            activityR4.runOnUiThread(new Runnable() { // from class: com.zepto.co5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.N0();
                }
            });
            return false;
        }
        s06 s06VarA4 = aVar2.a();
        Intrinsics.checkNotNull(s06VarA4);
        ni0 ni0VarH4 = s06VarA4.h();
        Intrinsics.checkNotNull(ni0VarH4);
        String appname = ni0VarH4.getAppname();
        Intrinsics.checkNotNull(appname);
        qq0 qq0VarP4 = aVar.p();
        Intrinsics.checkNotNull(qq0VarP4);
        if (!appname.equals(qq0VarP4.getAppName())) {
            Activity activityR5 = aVar.r();
            Intrinsics.checkNotNull(activityR5);
            activityR5.runOnUiThread(new Runnable() { // from class: com.zepto.do5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.O0();
                }
            });
            return false;
        }
        s06 s06VarA5 = aVar2.a();
        Intrinsics.checkNotNull(s06VarA5);
        ni0 ni0VarH5 = s06VarA5.h();
        Intrinsics.checkNotNull(ni0VarH5);
        String licensekey = ni0VarH5.getLicensekey();
        Intrinsics.checkNotNull(licensekey);
        qq0 qq0VarP5 = aVar.p();
        Intrinsics.checkNotNull(qq0VarP5);
        if (!licensekey.equals(qq0VarP5.getChannelLicenseKey())) {
            Activity activityR6 = aVar.r();
            Intrinsics.checkNotNull(activityR6);
            activityR6.runOnUiThread(new Runnable() { // from class: com.zepto.eo5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanUtils.P0();
                }
            });
            return false;
        }
        s06 s06VarA6 = aVar2.a();
        Intrinsics.checkNotNull(s06VarA6);
        ni0 ni0VarH6 = s06VarA6.h();
        Intrinsics.checkNotNull(ni0VarH6);
        String password = ni0VarH6.getPassword();
        Intrinsics.checkNotNull(password);
        qq0 qq0VarP6 = aVar.p();
        Intrinsics.checkNotNull(qq0VarP6);
        if (password.equals(qq0VarP6.getPassword())) {
            nn3Var.f("channeValidation", "inside correct");
            return true;
        }
        Activity activityR7 = aVar.r();
        Intrinsics.checkNotNull(activityR7);
        activityR7.runOnUiThread(new Runnable() { // from class: com.zepto.fo5
            @Override // java.lang.Runnable
            public final void run() {
                ScanUtils.Q0();
            }
        });
        return false;
    }

    public final void K(String dialogTitle, String dialogMessage) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogMessage, "dialogMessage");
        try {
            if (dialogTitle.length() == 0 || dialogMessage.length() == 0) {
                return;
            }
            jt.a aVar = jt.c;
            AlertDialog alertDialogCreate = new AlertDialog.Builder(aVar.r()).create();
            alertDialogCreate.setTitle(dialogTitle);
            alertDialogCreate.setMessage(dialogMessage);
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setButton(-1, NativeInteractor.a.L0(), new DialogInterface.OnClickListener() { // from class: com.zepto.yn5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ScanUtils.L(dialogInterface, i2);
                }
            });
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            if (activityR.isFinishing()) {
                return;
            }
            Intrinsics.checkNotNull(alertDialogCreate);
            alertDialogCreate.show();
            if (alertDialogCreate.isShowing()) {
                return;
            }
            D(alertDialogCreate);
        } catch (Exception e2) {
            nn3.a.b(b, String.valueOf(e2.getMessage()), e2);
        }
    }

    public final List M() {
        try {
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            List listP = s06VarA.p();
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                ((jz5) it.next()).setSessionFlag("offline");
            }
            jz5 jz5Var = new jz5();
            s06.a aVar = s06.m;
            s06 s06VarA2 = aVar.a();
            Intrinsics.checkNotNull(s06VarA2);
            jz5Var.setMobileSessionID(s06VarA2.x());
            jz5Var.setSessionStartTime(m1());
            s06 s06VarA3 = aVar.a();
            Intrinsics.checkNotNull(s06VarA3);
            jz5Var.setSessionFlag(s06VarA3.v());
            s06 s06VarA4 = aVar.a();
            Intrinsics.checkNotNull(s06VarA4);
            jz5Var.setOfflineSessionResponse(s06VarA4.w());
            ScanCore scanCore = ScanCore.a;
            jt.a aVar2 = jt.c;
            jz5Var.setNetworkSpeed(scanCore.y0(aVar2.C()));
            jz5Var.setNetworkType(scanCore.x0(aVar2.C()));
            jz5Var.setApiCallDetails(aVar2.e());
            listP.add(jz5Var);
            return listP;
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Error: ", e2), e2);
            return null;
        }
    }

    public final String N(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…T_META_DATA\n            )");
            return (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (PackageManager.NameNotFoundException e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
            return "";
        }
    }

    public final ApplicationInfo O(String str) {
        try {
            PackageManager packageManager = jt.c.C().getPackageManager();
            Intrinsics.checkNotNull(str);
            return packageManager.getPackageInfo(str, 0).applicationInfo;
        } catch (PackageManager.NameNotFoundException e2) {
            nn3.a.b(b, e2.toString(), e2);
            return null;
        }
    }

    public final String P() {
        String str = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(currentTimestamp)");
        return str;
    }

    public final String Q() {
        try {
            jt.a aVar = jt.c;
            if (aVar.t().isEmpty()) {
                String strB = k16.a.b("getprop | grep sys.oem_unlock_allowed", true);
                NativeInteractor nativeInteractor = NativeInteractor.a;
                String strQ0 = nativeInteractor.q0();
                aVar.t().add(StringsKt__StringsKt.trim((CharSequence) Intrinsics.stringPlus("kotlin:-", strB)).toString());
                aVar.t().add(StringsKt__StringsKt.trim((CharSequence) Intrinsics.stringPlus("NDK:-", strQ0)).toString());
                List listT = aVar.t();
                zy zyVarJ = aVar.j();
                listT.add(Intrinsics.stringPlus("BootStatus:-", zyVarJ == null ? null : zyVarJ.getAttestationResInfo()));
                List listT2 = aVar.t();
                ScanCore scanCore = ScanCore.a;
                listT2.add(Intrinsics.stringPlus("ExtraInfo:-", scanCore.q0()));
                if (scanCore.k1().length() > 0) {
                    aVar.t().add(scanCore.k1());
                }
                if (scanCore.R().length() > 0) {
                    aVar.t().add(scanCore.R());
                }
                if (scanCore.h0().length() > 0) {
                    aVar.t().add(scanCore.h0());
                }
                if (nativeInteractor.c0()) {
                    aVar.t().add(Intrinsics.stringPlus("MountInfo:-", Boolean.valueOf(nativeInteractor.c0())));
                }
                if (scanCore.T0(aVar.C())) {
                    aVar.t().add(Intrinsics.stringPlus("GustProfile:-", Boolean.valueOf(scanCore.T0(aVar.C()))));
                }
                if (scanCore.a1(aVar.C()).length() > 0) {
                    List listT3 = aVar.t();
                    String strA1 = scanCore.a1(aVar.C());
                    if (strA1.length() == 0) {
                        strA1 = "G";
                    }
                    listT3.add(Intrinsics.stringPlus("SanboxEnvironment:-", strA1));
                }
                if (aVar.D().length() > 0) {
                    List listT4 = aVar.t();
                    String strD = aVar.D();
                    if (strD.length() == 0) {
                        strD = "NE";
                    }
                    listT4.add(Intrinsics.stringPlus("M-AppName:-", strD));
                }
                if (scanCore.m1()) {
                    aVar.t().add(Intrinsics.stringPlus("LspossedProp:-", scanCore.A0()));
                }
            }
            nn3.a.f("getDInfo", Intrinsics.stringPlus("", aVar.t()));
            return aVar.t().toString();
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus(">>>>>>>>>>>> getDInfo: Error: ", e2), e2);
            return e2.toString();
        }
    }

    public final void R(Context context, if5 ruleObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        f80.d(qj2.c, null, null, new e(context, ruleObject, null), 3, null);
    }

    public final void R0(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new q(rule, null), 3, null);
    }

    public final String S(Context context, String requiredString) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requiredString, "requiredString");
        oj1 oj1Var = oj1.a;
        if (oj1Var.f() == null) {
            oj1Var.j(context);
        }
        mx2 mx2Var = mx2.a;
        return (mx2Var.d(requiredString).length() == 0 || mx2Var.d(requiredString).equals("null")) ? T(requiredString) : mx2Var.d(requiredString);
    }

    public final void S0() {
        String strL1 = l1();
        s06 s06VarA = s06.m.a();
        Intrinsics.checkNotNull(s06VarA);
        s06VarA.V(strL1);
    }

    public final String T(String str) {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        return Intrinsics.areEqual(str, nativeInteractor.I0()) ? nativeInteractor.d1() : Intrinsics.areEqual(str, nativeInteractor.H0()) ? nativeInteractor.e1() : Intrinsics.areEqual(str, nativeInteractor.S0()) ? nativeInteractor.f1() : Intrinsics.areEqual(str, nativeInteractor.u1()) ? nativeInteractor.i1() : Intrinsics.areEqual(str, nativeInteractor.U0()) ? nativeInteractor.k1() : Intrinsics.areEqual(str, nativeInteractor.Z0()) ? nativeInteractor.a1() : "";
    }

    public final void T0(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            s06.a aVar = s06.m;
            s06 s06VarA = aVar.a();
            Intrinsics.checkNotNull(s06VarA);
            s06VarA.U(info);
            s06 s06VarA2 = aVar.a();
            Intrinsics.checkNotNull(s06VarA2);
            s06VarA2.T("offline");
            s06 s06VarA3 = aVar.a();
            Intrinsics.checkNotNull(s06VarA3);
            s06VarA3.M(M());
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Error: ", e2), e2);
        }
    }

    public final void U(Context context, if5 ruleObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        f80.d(qj2.c, null, null, new f(ruleObject, context, null), 3, null);
    }

    public final boolean U0(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            if (!StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) "L1", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) input, (CharSequence) "L2", false, 2, (Object) null)) {
                NativeInteractor nativeInteractor = NativeInteractor.a;
                if (Intrinsics.areEqual(nativeInteractor.w(), nativeInteractor.Z()) && Intrinsics.areEqual(nativeInteractor.r0(), "failed") && Intrinsics.areEqual(nativeInteractor.a0(), "G")) {
                    if (Intrinsics.areEqual(nativeInteractor.B(), "G")) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return false;
        }
    }

    public final boolean V(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager == null ? null : connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12)) ? false : true;
    }

    public final String V0() {
        String host;
        try {
            ArrayList arrayList = new ArrayList();
            String property = System.getProperty("http.proxyHost");
            if (property != null) {
                arrayList.add(property);
            }
            String property2 = System.getProperty("http.proxyPort");
            if (property2 != null) {
                arrayList.add(property2);
            }
            Object systemService = jt.c.C().getSystemService("connectivity");
            Integer numValueOf = null;
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            LinkProperties linkProperties = connectivityManager == null ? null : connectivityManager.getLinkProperties(connectivityManager == null ? null : connectivityManager.getActiveNetwork());
            ProxyInfo httpProxy = linkProperties == null ? null : linkProperties.getHttpProxy();
            if (httpProxy != null && (host = httpProxy.getHost()) != null) {
                arrayList.add(host);
            }
            if (httpProxy != null) {
                numValueOf = Integer.valueOf(httpProxy.getPort());
            }
            arrayList.add(String.valueOf(numValueOf));
            nn3.a.f("ProxyInfo", Intrinsics.stringPlus("", arrayList));
            return arrayList.toString();
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return "";
        }
    }

    public final BroadcastReceiver W() {
        return j;
    }

    public final void W0(Context context, if5 rule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(zz0.a(qk1.b()), null, null, new r(context, rule, null), 3, null);
    }

    public final void X(final if5 ruleItem, String result) {
        nq nqVarR;
        Intrinsics.checkNotNullParameter(ruleItem, "ruleItem");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            jt.a aVar = jt.c;
            if (aVar.j() != null) {
                zy zyVarJ = aVar.j();
                Intrinsics.checkNotNull(zyVarJ);
                if (Intrinsics.areEqual(zyVarJ.getAttestationResInfo(), NativeInteractor.a.X0())) {
                    return;
                }
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) result, new String[]{"|-|"}, false, 0, 6, (Object) null);
            String str = (String) (4 <= CollectionsKt__CollectionsKt.getLastIndex(listSplit$default) ? listSplit$default.get(4) : "[]");
            if (Intrinsics.areEqual(str, "[]")) {
                ScanCore scanCore = ScanCore.a;
                scanCore.I0().clear();
                if (scanCore.U0() && (nqVarR = RecyclerViewInteractor.c.r()) != null && nqVarR.C().size() != 0) {
                    nqVarR.C().clear();
                    Activity activityR = aVar.r();
                    Intrinsics.checkNotNull(activityR);
                    activityR.runOnUiThread(new Runnable() { // from class: com.zepto.xn5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanUtils.a0(ruleItem);
                        }
                    });
                }
                Y0(ruleItem.getRuleid());
                return;
            }
            ScanCore.a.I0().clear();
            for (String str2 : E(str)) {
                ScanCore scanCore2 = ScanCore.a;
                if (!scanCore2.I0().contains(str2)) {
                    scanCore2.I0().add(str2);
                }
            }
            ScanCore scanCore3 = ScanCore.a;
            if (scanCore3.U0()) {
                final nq nqVarR2 = RecyclerViewInteractor.c.r();
                if (nqVarR2 != null && (true ^ scanCore3.I0().isEmpty())) {
                    nqVarR2.C().clear();
                    for (String str3 : scanCore3.I0()) {
                        if (!nqVarR2.C().contains(str3)) {
                            nqVarR2.C().add(str3);
                        }
                    }
                    Activity activityR2 = jt.c.r();
                    Intrinsics.checkNotNull(activityR2);
                    activityR2.runOnUiThread(new Runnable() { // from class: com.zepto.go5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanUtils.Y(nqVarR2);
                        }
                    });
                }
            } else {
                ScanAlerts scanAlertsL = jt.c.L();
                Intrinsics.checkNotNull(scanAlertsL);
                final nq nqVarO = scanAlertsL.O();
                if (nqVarO != null) {
                    nqVarO.C().clear();
                    for (String str4 : scanCore3.I0()) {
                        if (!nqVarO.C().contains(str4)) {
                            nqVarO.C().add(str4);
                        }
                    }
                    Activity activityR3 = jt.c.r();
                    if (activityR3 != null) {
                        activityR3.runOnUiThread(new Runnable() { // from class: com.zepto.ho5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScanUtils.Z(nqVarO);
                            }
                        });
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            zy zyVarJ2 = jt.c.j();
            sb.append((Object) (zyVarJ2 == null ? null : zyVarJ2.getAttestationResInfo()));
            sb.append('|');
            sb.append(result);
            b0(ruleItem, sb.toString());
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final void X0(int i2, String trust) {
        Intrinsics.checkNotNullParameter(trust, "trust");
        f80.d(qj2.c, null, null, new s(i2, trust, null), 3, null);
    }

    public final void Y0(int i2) {
        f80.d(qj2.c, null, null, new t(i2, null), 3, null);
    }

    public final void Z0(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        f80.d(qj2.c, null, null, new u(result, null), 3, null);
    }

    public final void a1(ArrayList skipAlertResponse) {
        Intrinsics.checkNotNullParameter(skipAlertResponse, "skipAlertResponse");
        SkipAlertSharePref skipAlertSharePrefA = SkipAlertSharePref.g.a();
        Intrinsics.checkNotNull(skipAlertSharePrefA);
        skipAlertSharePrefA.h(skipAlertResponse);
    }

    public final void b0(if5 rule, String resultInfo) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(resultInfo, "resultInfo");
        f80.d(qj2.c, null, null, new g(rule, resultInfo, null), 3, null);
    }

    public final void b1(md5 md5Var, if5 if5Var) {
        Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 215) {
            nn3.a.f(b, "required to show For BlockListing");
            tm5 tm5VarD = tm5.f.d();
            Intrinsics.checkNotNull(tm5VarD);
            tm5VarD.J(if5Var, "SecondScreen");
            return;
        }
        Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 44) {
            List listG0 = ScanCore.a.G0();
            nn3.a.f("AlertAppList", Intrinsics.stringPlus("ACCESSIBILITY_SERVICE_CODE:-", listG0));
            F(listG0, if5Var);
            return;
        }
        Integer vulnerabilityCode3 = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode3 != null && vulnerabilityCode3.intValue() == 35) {
            List listH0 = ScanCore.a.H0();
            nn3.a.f("AlertAppList", Intrinsics.stringPlus("ADMINISTRATOR_PERMISSION_ENABLED_CODE:-", listH0));
            F(listH0, if5Var);
            return;
        }
        Integer vulnerabilityCode4 = md5Var.getVulnerabilityCode();
        if (vulnerabilityCode4 == null || vulnerabilityCode4.intValue() != 12 || Build.VERSION.SDK_INT >= 30) {
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            scanAlertsL.B(md5Var);
            return;
        }
        nn3 nn3Var = nn3.a;
        pp5.a aVar = pp5.c;
        nn3Var.f("AlertAppList", Intrinsics.stringPlus("SCREEN_SHARING_CODE:-", aVar.b()));
        Integer numValueOf = Integer.valueOf(if5Var.getRuleid());
        String title = if5Var.getTitle();
        jt.a aVar2 = jt.c;
        String strS = S(aVar2.C(), NativeInteractor.a.u1());
        String msg = if5Var.getMsg();
        String ruleaction = if5Var.getRuleaction();
        String strB = aVar.b();
        String shortdescription = if5Var.getShortdescription();
        String recommendation = if5Var.getRecommendation();
        String redirecturl = if5Var.getRedirecturl();
        Intrinsics.checkNotNull(redirecturl);
        md5 md5Var2 = new md5(numValueOf, title, strS, msg, ruleaction, strB, shortdescription, recommendation, redirecturl, if5Var.getForceCloseTime(), if5Var.getClearDataFlag());
        ScanAlerts scanAlertsL2 = aVar2.L();
        Intrinsics.checkNotNull(scanAlertsL2);
        scanAlertsL2.B(md5Var2);
    }

    public final String c0(Context context) {
        KeyStore keyStore;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (F0(context) && (keyStore = KeyStore.getInstance("AndroidCAStore")) != null) {
                keyStore.load(null, null);
                Enumeration<String> enumerationAliases = keyStore.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    String strNextElement = enumerationAliases.nextElement();
                    if (strNextElement == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = strNextElement;
                    if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "system", false, 2, (Object) null)) {
                        Certificate certificate = keyStore.getCertificate(str);
                        if (certificate == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        return x509Certificate.getIssuerDN().getName() + "|-|" + x509Certificate.getPublicKey();
                    }
                }
            }
            return "";
        } catch (IOException e2) {
            nn3.a.i(e2);
            return "";
        } catch (KeyStoreException e3) {
            nn3.a.i(e3);
            return "";
        } catch (NoSuchAlgorithmException e4) {
            nn3.a.i(e4);
            return "";
        } catch (CertificateException e5) {
            nn3.a.i(e5);
            return "";
        } catch (Exception e6) {
            nn3.a.i(e6);
            return "";
        }
    }

    public final void c1(boolean z) {
        e = z;
    }

    public final boolean d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("location");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Exception :: ", e2.getMessage()), e2);
            return false;
        }
    }

    public final void d1(boolean z) {
        f = z;
    }

    public final String e0(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            ApplicationInfo applicationInfoO = O(packageName);
            if (applicationInfoO == null) {
                return "SAFE";
            }
            int i2 = Build.VERSION.SDK_INT;
            String installingPackageName = i2 >= 30 ? jt.c.C().getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName() : jt.c.C().getPackageManager().getInstallerPackageName(packageName);
            return (applicationInfoO.flags & 1) == 1 ? "SAFE" : Intrinsics.areEqual(String.valueOf(installingPackageName), "com.android.vending") ? (i2 < 30 || jt.c.C().getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageSigningInfo() != null) ? "SAFE" : Intrinsics.stringPlus(installingPackageName, "|signatureOfInstaller is null") : String.valueOf(installingPackageName);
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
            return "SAFE";
        }
    }

    public final void e1(ArrayList arrayList, List list, fk2 fk2Var) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String i2 = (String) it.next();
                NativeInteractor nativeInteractor = NativeInteractor.a;
                Intrinsics.checkNotNullExpressionValue(i2, "i");
                list.add(nativeInteractor.y1(i2));
            }
            fk2Var.e("appprotectt_devicegen", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
        }
    }

    public final boolean f0() {
        return e;
    }

    public final void f1(boolean z) {
        d = z;
    }

    public final void g0(Context context, if5 ruleObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        f80.d(qj2.c, null, null, new h(context, ruleObject, null), 3, null);
    }

    public final void g1(boolean z) {
        c = z;
    }

    public final boolean h0() {
        return f;
    }

    public final void h1(if5 if5Var, String str, Context context) {
        b0(if5Var, String.valueOf(str));
    }

    public final boolean i0() {
        try {
            return Settings.Secure.getInt(jt.c.C().getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus(">>>>>>>>>>>> isDeveloperOptionEnableds: Error: ", e2), e2);
            return false;
        }
    }

    public final String i1(Signature sig) {
        Intrinsics.checkNotNullParameter(sig, "sig");
        byte[] byteArray = sig.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "sig.toByteArray()");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"SHA-512\")");
            byte[] bArrDigest = messageDigest.digest(byteArray);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest(signature)");
            StringBuilder sb = new StringBuilder();
            int length = bArrDigest.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(":");
                }
                String hexString = Integer.toHexString(bArrDigest[i2] & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
                i2 = i3;
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final void j0(Context context, if5 ruleObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        f80.d(qj2.c, null, null, new i(context, ruleObject, null), 3, null);
    }

    public final void j1(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        try {
            jt.a aVar = jt.c;
            if (aVar.j() != null) {
                zy zyVarJ = aVar.j();
                Intrinsics.checkNotNull(zyVarJ);
                String attestationResInfo = zyVarJ.getAttestationResInfo();
                if (Intrinsics.areEqual(attestationResInfo, NativeInteractor.a.X0())) {
                    nn3.a.f("NewAtTest", Intrinsics.stringPlus("Attestation happened.. ", attestationResInfo));
                } else {
                    b0(ruleObject, ((Object) attestationResInfo) + '#' + ScanCore.a.q0());
                }
            } else {
                nn3.a.f(b, "Attestation not happened..");
            }
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb A[Catch: Exception -> 0x008a, TryCatch #1 {Exception -> 0x008a, blocks: (B:3:0x0013, B:5:0x006a, B:8:0x0071, B:10:0x0079, B:12:0x0081, B:21:0x009e, B:23:0x00b0, B:60:0x016e, B:25:0x00bb, B:27:0x00c5, B:29:0x00d0, B:31:0x00db, B:33:0x00e6, B:35:0x00ef, B:37:0x00fa, B:39:0x0105, B:41:0x0112, B:43:0x011d, B:45:0x0126, B:47:0x0131, B:49:0x013c, B:51:0x0147, B:53:0x0152, B:55:0x015d, B:17:0x008f), top: B:69:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(com.zepto.if5 r23) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.main.scan.ScanUtils.k0(com.zepto.if5):void");
    }

    public final void k1(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        try {
            f80.d(qj2.c, qk1.a(), null, new v(ruleObject, null), 2, null);
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
    }

    public final void l0(if5 fridaRuleObject) {
        Intrinsics.checkNotNullParameter(fridaRuleObject, "fridaRuleObject");
        f80.d(qj2.c, null, null, new j(fridaRuleObject, null), 3, null);
    }

    public final String l1() {
        return Settings.Secure.getString(jt.c.C().getContentResolver(), "android_id") + '_' + ((Object) new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date())) + "_4.0";
    }

    public final boolean m0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(packageManager);
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager!!…      0\n                )");
            int i2 = 0;
            for (PackageInfo packages : installedPackages) {
                if (installedPackages.size() == 1 && packages.packageName.equals(context.getPackageName())) {
                    return true;
                }
                Intrinsics.checkNotNullExpressionValue(packages, "packages");
                if (!y0(packages)) {
                    i2++;
                    String str = packages.packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "packages.packageName");
                    arrayList.add(str);
                }
                if (i2 >= 3) {
                    return false;
                }
            }
            if (arrayList.size() == 1 && !ScanCore.a.T0(context)) {
                nn3.a.f(b, "Hide My AppList Settings Enabled + default apps present..v2");
                return true;
            }
        } catch (Exception e2) {
            nn3.a.b(b, e2.toString(), e2);
        }
        return false;
    }

    public final String m1() {
        String currentDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(currentDate, "currentDate");
        return currentDate;
    }

    public final void n0(if5 ruleObject) {
        Intrinsics.checkNotNullParameter(ruleObject, "ruleObject");
        Object systemService = jt.c.C().getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        if (((AudioManager) systemService).getMode() == 3) {
            nn3.a.f("AUDIO_SERVICE", "You are in InternetCall");
            b0(ruleObject, "");
        } else {
            nn3.a.f("AUDIO_SERVICE", "You are Not in Call");
            Y0(204);
        }
    }

    public final boolean o0() {
        jt.a aVar = jt.c;
        return yy0.a(aVar.C(), "android.permission.ACCESS_FINE_LOCATION") == 0 && yy0.a(aVar.C(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final boolean p0(String expireDateStr) {
        Intrinsics.checkNotNullParameter(expireDateStr, "expireDateStr");
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(expireDateStr);
            if (date == null) {
                return false;
            }
            Date date2 = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, -60);
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
            return date2.compareTo(time) >= 0;
        } catch (Exception e2) {
            nn3.c(nn3.a, b, e2.toString(), null, 4, null);
            return true;
        }
    }

    public final String q0(Context application) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            Object systemService = application.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return null;
            }
            return networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "mobileData" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(2) ? "bluetooth" : networkCapabilities.hasTransport(4) ? "VPN" : String.valueOf(networkCapabilities);
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus("Error: ", e2), e2);
            return null;
        }
    }

    public final boolean r0() {
        ni0 ni0VarM = jt.c.m();
        String apppackage = ni0VarM == null ? null : ni0VarM.getApppackage();
        Intrinsics.checkNotNull(apppackage);
        return StringsKt__StringsKt.contains$default((CharSequence) apppackage, (CharSequence) NativeInteractor.a.k0(), false, 2, (Object) null);
    }

    public final boolean s0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (!F0(context)) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) property);
            sb.append(':');
            sb.append((Object) System.getProperty("http.proxyPort"));
            String string = sb.toString();
            nn3.a.f(b, Intrinsics.stringPlus("QAW=====>>> ", string));
            return !Intrinsics.areEqual(string, "null:null");
        } catch (Exception e2) {
            nn3.a.i(e2);
            return false;
        }
    }

    public final void t0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f80.d(qj2.c, null, null, new k(activity, null), 3, null);
    }

    public final boolean u0(Activity activity) {
        return (activity.getWindow().getAttributes().flags & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0;
    }

    public final boolean v0() {
        return c;
    }

    public final void w0(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        f80.d(qj2.c, qk1.a(), null, new l(list, null), 2, null);
    }

    public final Triple y() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", G("Z2V0cHJvcCB8IGdyZXAgJ2FkYic=")});
            Intrinsics.checkNotNullExpressionValue(processExec, "getRuntime().exec(cmd)");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 128);
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String str4 = b;
                    Log.i(str4, Intrinsics.stringPlus("Output: ", stringBuffer));
                    String string = stringBuffer.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "output.toString()");
                    Log.i(str4, Intrinsics.stringPlus("Response  : ", string));
                    return new Triple(str, str2, str3);
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) line, (CharSequence) G("aW5pdC5zdmMuYWRiZA=="), false, 2, (Object) null)) {
                    str = line;
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) line, (CharSequence) G("cGVyc2lzdC5zeXMudXNiLmNvbmZpZw=="), false, 2, (Object) null)) {
                    str2 = line;
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) line, (CharSequence) G("c2VydmljZS5hZGIudGNwLnBvcnQ="), false, 2, (Object) null)) {
                    str3 = line;
                }
            }
        } catch (IOException e2) {
            Log.i(b, Intrinsics.stringPlus("Exception : ", e2.getLocalizedMessage()));
            return new Triple(null, null, null);
        } catch (Exception e3) {
            Log.i(b, Intrinsics.stringPlus("Exception2: ", e3.getLocalizedMessage()));
            return new Triple(null, null, null);
        }
    }

    public final boolean y0(PackageInfo pkgInfo) {
        Intrinsics.checkNotNullParameter(pkgInfo, "pkgInfo");
        return (pkgInfo.applicationInfo.flags & 1) != 0;
    }

    public final HashMap z(Context context) {
        Object systemService;
        HashMap map = new HashMap();
        try {
            systemService = context.getSystemService("accessibility");
        } catch (Exception e2) {
            nn3.a.b(b, Intrinsics.stringPlus(">>>>>>>>>>>>isAnyAppHaveAccessibilityPermission: Error: ", e2), e2);
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
        List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
        if (list != null && !list.isEmpty()) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                String str = it.next().getResolveInfo().serviceInfo.packageName;
                PackageManager packageManager = jt.c.C().getPackageManager();
                Intrinsics.checkNotNull(str);
                PackageInfo pkgInfo = packageManager.getPackageInfo(str, 0);
                Intrinsics.checkNotNullExpressionValue(pkgInfo, "pkgInfo");
                boolean zY0 = y0(pkgInfo);
                if (!zY0) {
                    map.put(str, String.valueOf(zY0));
                }
            }
        } else if (!map.isEmpty()) {
            map.clear();
        }
        return map;
    }

    public final void z0(Context mcontext, if5 rule) {
        Intrinsics.checkNotNullParameter(mcontext, "mcontext");
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new m(rule, mcontext, null), 3, null);
    }
}
