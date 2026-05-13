package com.zepto;

import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.h14;
import com.zepto.jt;
import com.zepto.s06;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 {
    public static fj1 k;
    public static String l;
    public Context a;
    public final String b;
    public WifiManager c;
    public String d;
    public String e;
    public ConnectivityManager f;
    public ActivityManager g;
    public String h;
    public WindowManager i;
    public static final a j = new a(null);
    public static String m = "";
    public static String n = "";
    public static String o = "-";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return fj1.m;
        }

        public final fj1 b() {
            return fj1.k;
        }

        public final String c() {
            return fj1.n;
        }

        public final void d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            f(new fj1(context));
        }

        public final void e(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            fj1.o = str;
        }

        public final void f(fj1 fj1Var) {
            fj1.k = fj1Var;
        }
    }

    public fj1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = "DeviceDetailsSingleton";
        this.h = "";
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
        this.c = (WifiManager) systemService;
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n            c…cure.ANDROID_ID\n        )");
        this.d = string;
        this.e = this.a.getPackageName();
        Object systemService2 = this.a.getSystemService("window");
        if (systemService2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.i = (WindowManager) systemService2;
        Object systemService3 = this.a.getSystemService("activity");
        if (systemService3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        this.g = (ActivityManager) systemService3;
        Object systemService4 = this.a.getSystemService("connectivity");
        if (systemService4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.f = (ConnectivityManager) systemService4;
        String string2 = this.a.getString(d15.a);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.density)");
        this.h = string2;
    }

    public final String f() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "uId.toString()");
        String upperCase = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null).toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        String strSubstring = Intrinsics.stringPlus("REAL", upperCase).substring(0, 30);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final Long g() {
        PackageInfo packageInfo;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                contex…lags.of(0))\n            }");
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                contex…ageName, 0)\n            }");
            }
            return Long.valueOf(i >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final zi1 h(boolean z) {
        zi1 zi1Var = new zi1();
        try {
            zi1Var.setGeoCode("19.0911 ,72.9208");
            zi1Var.setDeviceType("MOB");
            eg5 eg5Var = eg5.a;
            zi1Var.setOs(eg5Var.i());
            zi1Var.setOsVersion(eg5Var.i());
            zi1Var.setOsCategory("A");
            zi1Var.setWifiMac("02:00:00:00:00:00");
            zi1Var.setAppGenId(VContant.MAINSCREEN);
            s06.a aVar = s06.m;
            s06 s06VarA = aVar.a();
            Integer numValueOf = null;
            zi1Var.setAppVersionCode(s06VarA == null ? null : Integer.valueOf(s06VarA.e()));
            zi1Var.setBuildDateTime(new Date(1740735416543L).toString());
            zi1Var.setConnectedNetWork(ScanUtils.a.q0(this.a));
            s06 s06VarA2 = aVar.a();
            if (s06VarA2 != null) {
                numValueOf = Integer.valueOf(s06VarA2.e());
            }
            zi1Var.setSdkVersionCode(String.valueOf(numValueOf));
            zi1Var.setDeviceModel(eg5Var.b());
            zi1Var.setDeviceId(this.d);
            uu uuVar = new uu();
            jt.a aVar2 = jt.c;
            PackageManager packageManager = aVar2.C().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "mAppContext.packageManager");
            String packageName = aVar2.C().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "mAppContext.packageName");
            List listB = uuVar.b(packageManager, packageName);
            Intrinsics.checkNotNull(listB);
            zi1Var.setTrust((String) listB.get(0));
            zi1Var.setCheckSum(co3.a.u(new File(aVar2.C().getApplicationInfo().sourceDir), "SHA-512"));
            zi1Var.setRootStatus(aVar2.u() ? "rooted" : "safe");
        } catch (Exception e) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Error: ", e), e);
        }
        return zi1Var;
    }

    public final String i() {
        try {
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT >= 30 ? this.a.getPackageManager().getInstallSourceInfo(this.a.getPackageName()).getInstallingPackageName() : this.a.getPackageManager().getInstallerPackageName(this.a.getPackageName()));
            boolean zC0 = jt.c.c0();
            boolean zD1 = ScanCore.a.d1();
            String strValueOf2 = String.valueOf(g());
            String str = this.a.getApplicationInfo().sourceDir;
            Intrinsics.checkNotNullExpressionValue(str, "context.applicationInfo.sourceDir");
            File[] fileArrListFiles = new File(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "base.apk")).listFiles();
            Boolean boolValueOf = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file = fileArrListFiles[i];
                    i++;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt__StringsJVMKt.startsWith$default(name, "split", false, 2, null)) {
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                        if (StringsKt__StringsJVMKt.endsWith$default(name2, ".apk", false, 2, null)) {
                            z = true;
                            break;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return "IS:-" + strValueOf + "#Debug:-" + zC0 + "#Architecture:-" + ((boolValueOf == null || !boolValueOf.booleanValue()) ? "apk" : "aab") + "#VDevice:-" + zD1 + "#BATime:-" + o + "#AppC:" + strValueOf2;
        } catch (Exception e) {
            nn3.a.f(this.b, e.toString());
            return "";
        }
    }

    public final qc5 j() {
        qc5 qc5Var = new qc5();
        qc5Var.pspId = VContant.MAINSCREEN;
        String strF = f();
        l = strF;
        Intrinsics.checkNotNull(strF);
        qc5Var.pspRefNo = strF;
        return qc5Var;
    }

    public final void k() {
        try {
            h14.a aVar = h14.b;
            aVar.a();
            h14 h14VarB = aVar.b();
            Intrinsics.checkNotNull(h14VarB);
            String strJ = h14VarB.j("", jt.c.C(), true);
            m = (String) StringsKt__StringsKt.split$default((CharSequence) strJ, new String[]{"|"}, false, 0, 6, (Object) null).get(0);
            n = (String) StringsKt__StringsKt.split$default((CharSequence) strJ, new String[]{"|"}, false, 0, 6, (Object) null).get(1);
        } catch (Exception e) {
            nn3.a.b(this.b, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
        }
    }

    public final k33 l() {
        k33 k33Var = new k33();
        jt.a aVar = jt.c;
        qq0 qq0VarP = aVar.p();
        Integer numValueOf = qq0VarP == null ? null : Integer.valueOf(qq0VarP.getChannelId());
        Intrinsics.checkNotNull(numValueOf);
        k33Var.setUsername(String.valueOf(numValueOf.intValue()));
        qq0 qq0VarP2 = aVar.p();
        String password = qq0VarP2 == null ? null : qq0VarP2.getPassword();
        Intrinsics.checkNotNull(password);
        k33Var.setPassword(password.toString());
        StringBuilder sb = new StringBuilder();
        qq0 qq0VarP3 = aVar.p();
        Integer numValueOf2 = qq0VarP3 == null ? null : Integer.valueOf(qq0VarP3.getChannelId());
        Intrinsics.checkNotNull(numValueOf2);
        sb.append(numValueOf2.intValue());
        sb.append('#');
        fj1 fj1Var = k;
        String str = fj1Var == null ? null : fj1Var.d;
        Intrinsics.checkNotNull(str);
        sb.append(str);
        k33Var.setClient_id(sb.toString());
        s06 s06VarA = s06.m.a();
        String strI = s06VarA != null ? s06VarA.i() : null;
        Intrinsics.checkNotNull(strI);
        k33Var.setClient_secret(strI);
        return k33Var;
    }
}
