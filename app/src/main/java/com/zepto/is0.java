package com.zepto;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.zepto.ae4;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class is0 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {
        public final ae4.e a;
        public final String b;
        public final int c;

        public a(ae4.e eVar, String str, int i) {
            this.a = eVar;
            this.b = str;
            this.c = i;
        }
    }

    public static PendingIntent a(Context context, ee4 ee4Var, String str, PackageManager packageManager) {
        Intent intentF = f(str, ee4Var, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(ee4Var.y());
        if (q(ee4Var)) {
            intentF.putExtra("gcm.n.analytics_data", ee4Var.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, ee4 ee4Var) {
        if (q(ee4Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(ee4Var.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, ee4 ee4Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        ae4.e eVar = new ae4.e(context2, str);
        String strN = ee4Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.l(strN);
        }
        String strN2 = ee4Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.k(strN2);
            eVar.y(new ae4.c().h(strN2));
        }
        eVar.w(m(packageManager, resources, packageName, ee4Var.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, ee4Var, resources);
        if (uriN != null) {
            eVar.x(uriN);
        }
        eVar.j(a(context, ee4Var, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, ee4Var);
        if (pendingIntentB != null) {
            eVar.n(pendingIntentB);
        }
        Integer numH = h(context2, ee4Var.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.h(numH.intValue());
        }
        eVar.f(!ee4Var.a("gcm.n.sticky"));
        eVar.r(ee4Var.a("gcm.n.local_only"));
        String strP = ee4Var.p("gcm.n.ticker");
        if (strP != null) {
            eVar.z(strP);
        }
        Integer numM = ee4Var.m();
        if (numM != null) {
            eVar.u(numM.intValue());
        }
        Integer numR = ee4Var.r();
        if (numR != null) {
            eVar.B(numR.intValue());
        }
        Integer numL = ee4Var.l();
        if (numL != null) {
            eVar.s(numL.intValue());
        }
        Long lJ = ee4Var.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.v(true);
            eVar.C(lJ.longValue());
        }
        long[] jArrQ = ee4Var.q();
        if (jArrQ != null) {
            eVar.A(jArrQ);
        }
        int[] iArrE = ee4Var.e();
        if (iArrE != null) {
            eVar.q(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.m(i(ee4Var));
        return new a(eVar, o(ee4Var), 0);
    }

    public static a e(Context context, ee4 ee4Var) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, ee4Var, k(context, ee4Var.k(), bundleJ), bundleJ);
    }

    public static Intent f(String str, ee4 ee4Var, PackageManager packageManager) {
        String strP = ee4Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = ee4Var.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(yy0.c(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int i(ee4 ee4Var) {
        boolean zA = ee4Var.a("gcm.n.default_sound");
        ?? r0 = zA;
        if (ee4Var.a("gcm.n.default_vibrate_timings")) {
            r0 = (zA ? 1 : 0) | 2;
        }
        return ee4Var.a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i) {
        return i | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !p(resources, i)) ? R.drawable.sym_def_app_icon : i;
    }

    public static Uri n(String str, ee4 ee4Var, Resources resources) {
        String strO = ee4Var.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    public static String o(ee4 ee4Var) {
        String strP = ee4Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static boolean p(Resources resources, int i) {
        return true;
    }

    public static boolean q(ee4 ee4Var) {
        return ee4Var.a("google.c.a.e");
    }
}
