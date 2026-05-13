package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.it3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ht3 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return VContant.MAINSCREEN.equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            hc2.k();
            Context contextJ = hc2.k().j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static it3 b(it3.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        it3.a aVarH = it3.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(it3.d.ANDROID).h(k(extras));
        String strH = h(extras);
        if (strH != null) {
            aVarH.g(strH);
        }
        String strO = o(extras);
        if (strO != null) {
            aVarH.l(strO);
        }
        String strC = c(extras);
        if (strC != null) {
            aVarH.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            aVarH.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            aVarH.d(strE);
        }
        long jN = n(extras);
        if (jN > 0) {
            aVarH.j(jN);
        }
        return aVarH.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) gd6.a(tc2.q(hc2.k()).c());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static it3.c k(Bundle bundle) {
        return (bundle == null || !ee4.t(bundle)) ? it3.c.DATA_MESSAGE : it3.c.DISPLAY_NOTIFICATION;
    }

    public static String l(Bundle bundle) {
        return (bundle == null || !ee4.t(bundle)) ? "data" : "display";
    }

    public static String m() {
        return hc2.k().j().getPackageName();
    }

    public static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        hc2 hc2VarK = hc2.k();
        String strD = hc2VarK.m().d();
        if (strD != null) {
            try {
                return Long.parseLong(strD);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String strC = hc2VarK.m().c();
        if (strC.startsWith("1:")) {
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            try {
                return Long.parseLong(strC);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    public static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(it3.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.n());
        }
    }

    public static void w(it3.b bVar, Intent intent, rn6 rn6Var) {
        if (rn6Var == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        it3 it3VarB = b(bVar, intent);
        if (it3VarB == null) {
            return;
        }
        try {
            rn6Var.a("FCM_CLIENT_EVENT_LOGGING", jt3.class, c22.b("proto"), new dn6() { // from class: com.zepto.gt3
                @Override // com.zepto.dn6
                public final Object a(Object obj) {
                    return ((jt3) obj).c();
                }
            }).a(o42.e(jt3.b().b(it3VarB).a(), fw4.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    public static void x(String str, Bundle bundle) {
        try {
            hc2.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strO = o(bundle);
            if (strO != null) {
                bundle2.putString("_nt", strO);
            }
            String strJ = j(bundle);
            if (strJ != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strJ));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String strQ = q(bundle);
            if (strQ != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strQ));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String strL = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strL);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            wb0.a(hc2.k().i(so.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!VContant.MAINSCREEN.equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        } else {
            wb0.a(hc2.k().i(so.class));
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
