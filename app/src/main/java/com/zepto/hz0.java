package com.zepto;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Welcome.SplashScreen;
import com.zepto.ds4;
import com.zepto.hz0;
import com.zepto.vb0;
import com.zepto.yf4;
import com.zepto.zr2;
import java.io.File;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class hz0 {
    public static final a a = new a(null);
    public static final String b = "english";
    public static final String c = "Unauthorized";
    public static final String d = "401";
    public static final String e = "eChallan(MORTH)";
    public static final String f = "IntentFlag";
    public static final int g = 1;
    public static final int h = 2;
    public static final String i = "E";
    public static final String j = "V";
    public static final String k = "Vahan";
    public static final String l = "NextGen";
    public static final String m = "Sarathi";
    public static final String n = "504";
    public static final String o = "Connection Time Out";
    public static final String p = "CTZ_MPN";
    public static final String q = "CTZ_SIG";
    public static final String r = "CTZ_ECH";
    public static final String s = "bypass";
    public static final String t = "User already registered, Please Sign In";
    public static final String u = "202";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean P(String str, SSLSession sSLSession) {
            return true;
        }

        public static final void R(Dialog d, int i, Context context, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
            if (i == 1) {
                context.startActivity(new Intent(context, (Class<?>) SignInScreen.class));
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                l8.p((Activity) context);
                return;
            }
            ws6 ws6Var = new ws6(context);
            if (ws6Var.u()) {
                ws6Var.v();
                DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(context);
                Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                databaseHelperD0.m0();
                databaseHelperD0.close();
                new cq(context).e();
                NaxpToKenService.INSTANCE.a(context);
                context.startActivity(new Intent(context, (Class<?>) SplashScreen.class));
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                l8.p((Activity) context);
            }
        }

        public static final void g(Context context, DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            if (context != null) {
                context.startActivity(intent);
            }
        }

        public static final void j(Context context, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            l8.p((Activity) context);
        }

        public final String A() {
            return hz0.m;
        }

        public final String B() {
            return hz0.d;
        }

        public final String C() {
            return hz0.n;
        }

        public final String D() {
            return hz0.o;
        }

        public final String E(String stateName) {
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            try {
                HashMap map = new HashMap();
                map.put("Andaman and Nicobar Islands", "AN");
                map.put("Andhra Pradesh", "AP");
                map.put("Arunachal Pradesh", "AR");
                map.put("Assam", "AS");
                map.put("Bihar", "BR");
                map.put("Chandigarh", "CH");
                map.put("Chhattisgarh", "CG");
                map.put("CHHATTISGARH", "CG");
                map.put("Dadra and Nagar Haveli", "DH");
                map.put("Daman and Diu", "DD");
                map.put("Delhi", "DL");
                map.put("DELHI", "DL");
                map.put("New Delhi", "DL");
                map.put("Goa", "GA");
                map.put("Gujarat", "GJ");
                map.put("Haryana", "HR");
                map.put("Himachal Pradesh", "HP");
                map.put("Jammu and Kashmir", "JK");
                map.put("Jharkhand", "JH");
                map.put("Karnataka", "KA");
                map.put("Kerala", "KL");
                map.put("KERALA", "KL");
                map.put("Lakshadweep", "LD");
                map.put("Madhya Pradesh", "MP");
                map.put("Maharashtra", "MH");
                map.put("Manipur", "MN");
                map.put("Meghalaya", "ML");
                map.put("Mizoram", "MZ");
                map.put("Nagaland", "NL");
                map.put("Odisha", "OR");
                map.put("odisha", "OR");
                map.put("ODISHA", "OR");
                map.put("Puducherry", "PY");
                map.put("Punjab", "PB");
                map.put("Rajasthan", "RJ");
                map.put("Sikkim", "SK");
                map.put("SIKKIM", "SK");
                map.put("sikkim", "SK");
                map.put("Tamil Nadu", "TN");
                map.put("Telangana", "TS");
                map.put("Tripura", "TR");
                map.put("TRIPURA", "TR");
                map.put("Uttarakhand", "UK");
                map.put("Uttar Pradesh", "UP");
                map.put("West Bengal", "WB");
                return String.valueOf(map.get(stateName));
            } catch (Exception unused) {
                return "NA";
            }
        }

        public final String F() {
            return hz0.t;
        }

        public final String G() {
            return hz0.c;
        }

        public final String H() {
            return hz0.k;
        }

        public final boolean I(Context context) {
            Intrinsics.checkNotNull(context);
            return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) > 0;
        }

        public final boolean J(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory || memoryInfo.availMem < memoryInfo.threshold;
        }

        public final boolean K(String mPin) {
            Intrinsics.checkNotNullParameter(mPin, "mPin");
            return new Regex("(\\d)\\1{2,}").containsMatchIn(mPin);
        }

        public final boolean L(String mPin) {
            Intrinsics.checkNotNullParameter(mPin, "mPin");
            return StringsKt__StringsKt.contains$default((CharSequence) "012345", (CharSequence) mPin, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) "543210", (CharSequence) mPin, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) "123456", (CharSequence) mPin, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) "654321", (CharSequence) mPin, false, 2, (Object) null);
        }

        public final boolean M(String mPin, String oldMin) {
            Intrinsics.checkNotNullParameter(mPin, "mPin");
            Intrinsics.checkNotNullParameter(oldMin, "oldMin");
            return Integer.parseInt(mPin) == Integer.parseInt(oldMin);
        }

        public final boolean N(String mPin) {
            Intrinsics.checkNotNullParameter(mPin, "mPin");
            StringBuilder sb = new StringBuilder(mPin);
            sb.reverse();
            int i = Integer.parseInt(mPin);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return i == Integer.parseInt(string);
        }

        public final ds4 O(Context context) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            SSLContext.getInstance("TLS").init(null, trustManagerFactory.getTrustManagers(), null);
            f90 f90Var = new f90(new File(context != null ? context.getCacheDir() : null, "picasso-cache"), 10485760L);
            yf4.a aVar = new yf4.a();
            Object obj = hq6.a().get("sslSocketFactory");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
            Object obj2 = hq6.a().get("trustAllCerts");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            xf4 xf4Var = new xf4(aVar.N((SSLSocketFactory) obj, (X509TrustManager) obj2).K(new HostnameVerifier() { // from class: com.zepto.gz0
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return hz0.a.P(str, sSLSession);
                }
            }).d(f90Var).c());
            Intrinsics.checkNotNull(context);
            ds4 ds4VarA = new ds4.b(context).b(xf4Var).a();
            Intrinsics.checkNotNull(ds4VarA);
            return ds4VarA;
        }

        public final void Q(final Context context, String str, final int i) {
            Intrinsics.checkNotNull(context);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.msg_dialog);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(str);
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hz0.a.R(dialog, i, context, view);
                }
            });
            dialog.show();
        }

        public final String S() {
            return "vahancapi/bookappointment/service/getappointmentreceipt/";
        }

        public final v03 e() {
            return new zr2(null, 1, 0 == true ? 1 : 0).d(zr2.a.NONE);
        }

        public final void f(final Context context, String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(str).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.zepto.ez0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    hz0.a.g(context, dialogInterface, i);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setTitle("NextGen mParivahan\n");
            alertDialogCreate.show();
        }

        public final String h(String timeStampValue) {
            Intrinsics.checkNotNullParameter(timeStampValue, "timeStampValue");
            try {
                long j = Long.parseLong(timeStampValue);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = simpleDateFormat2.parse(simpleDateFormat.format(new Date(j)));
                Intrinsics.checkNotNull(date, "null cannot be cast to non-null type java.util.Date");
                String str = simpleDateFormat2.format(date);
                Intrinsics.checkNotNull(str);
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return timeStampValue.toString();
            }
        }

        public final void i(final Context context) {
            String str = Build.MODEL;
            String str2 = Build.PRODUCT;
            if (str2 == null || !(Intrinsics.areEqual(str2, "sdk") || StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "_sdk", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "sdk_", false, 2, (Object) null))) {
                if (I(context)) {
                    f(context, context != null ? context.getString(R.string.usbdebug) : null);
                }
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.zepto.fz0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        hz0.a.j(context, dialogInterface, i);
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setTitle("Information");
                alertDialogCreate.show();
            }
        }

        public final void k(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
            activity.getWindow().addFlags(128);
        }

        public final String l() {
            return hz0.s;
        }

        public final String m() {
            return hz0.b;
        }

        public final String n() {
            return hz0.i;
        }

        public final String o() {
            return hz0.p;
        }

        public final String p() {
            return hz0.q;
        }

        public final String q() {
            return hz0.e;
        }

        public final String r() {
            try {
                String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return " ";
            }
        }

        public final vb0 s() {
            vb0.a aVar = new vb0.a();
            String strNPU = APIController.a().NPU();
            Intrinsics.checkNotNullExpressionValue(strNPU, "NPU(...)");
            String strNPK = APIController.a().NPK();
            Intrinsics.checkNotNullExpressionValue(strNPK, "NPK(...)");
            return aVar.a(strNPU, strNPK).b();
        }

        public final int t() {
            return hz0.g;
        }

        public final String u() {
            return hz0.f;
        }

        public final int v() {
            return hz0.h;
        }

        public final String w(Context context) {
            return String.valueOf(new wa3(context).d());
        }

        public final String x() {
            return hz0.j;
        }

        public final String y() {
            return hz0.l;
        }

        public final String z() {
            return hz0.u;
        }
    }
}
