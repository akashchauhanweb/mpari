package com.zepto;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.zepto.ae4;

/* JADX INFO: loaded from: classes.dex */
public class xj2 extends yj2 {
    public String c;
    public static final Object e = new Object();
    public static final xj2 f = new xj2();
    public static final int d = yj2.a;

    public static xj2 l() {
        return f;
    }

    @Override // com.zepto.yj2
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    @Override // com.zepto.yj2
    public PendingIntent b(Context context, int i, int i2) {
        return super.b(context, i, i2);
    }

    @Override // com.zepto.yj2
    public final String d(int i) {
        return super.d(i);
    }

    @Override // com.zepto.yj2
    public int f(Context context) {
        return super.f(context);
    }

    @Override // com.zepto.yj2
    public int g(Context context, int i) {
        return super.g(context, i);
    }

    @Override // com.zepto.yj2
    public final boolean i(int i) {
        return super.i(i);
    }

    public Dialog j(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return o(activity, i, z38.b(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent k(Context context, lw0 lw0Var) {
        return lw0Var.f() ? lw0Var.e() : b(context, lw0Var.c(), 0);
    }

    public boolean m(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogJ = j(activity, i, i2, onCancelListener);
        if (dialogJ == null) {
            return false;
        }
        r(activity, dialogJ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(Context context, int i) {
        s(context, i, null, c(context, i, 0, "n"));
    }

    public final Dialog o(Context context, int i, z38 z38Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(r28.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = r28.c(context, i);
        if (strC != null) {
            builder.setPositiveButton(strC, z38Var);
        }
        String strG = r28.g(context, i);
        if (strG != null) {
            builder.setTitle(strG);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog p(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(r28.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        r(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final p28 q(Context context, o28 o28Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p28 p28Var = new p28(o28Var);
        v48.o(context, p28Var, intentFilter);
        p28Var.a(context);
        if (h(context, "com.google.android.gms")) {
            return p28Var;
        }
        o28Var.a();
        p28Var.b();
        return null;
    }

    public final void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof yf2) {
                e96.l2(dialog, onCancelListener).k2(((yf2) activity).I0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        a32.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void s(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            t(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = r28.f(context, i);
        String strE = r28.e(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) iu4.i(context.getSystemService("notification"));
        ae4.e eVarY = new ae4.e(context).r(true).f(true).l(strF).y(new ae4.c().h(strE));
        if (hj1.b(context)) {
            iu4.k(ls4.d());
            eVarY.w(context.getApplicationInfo().icon).u(2);
            if (hj1.c(context)) {
                eVarY.a(pz4.a, resources.getString(z05.o), pendingIntent);
            } else {
                eVarY.j(pendingIntent);
            }
        } else {
            eVarY.w(R.drawable.stat_sys_warning).z(resources.getString(z05.h)).C(System.currentTimeMillis()).j(pendingIntent).k(strE);
        }
        if (ls4.g()) {
            iu4.k(ls4.g());
            synchronized (e) {
                str2 = this.c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = r28.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strB, 4));
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarY.g(str2);
        }
        Notification notificationB = eVarY.b();
        if (i == 1 || i == 2 || i == 3) {
            ek2.b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }

    public final void t(Context context) {
        new v28(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean u(Activity activity, af3 af3Var, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogO = o(activity, i, z38.c(af3Var, a(activity, i, "d"), 2), onCancelListener);
        if (dialogO == null) {
            return false;
        }
        r(activity, dialogO, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean v(Context context, lw0 lw0Var, int i) {
        PendingIntent pendingIntentK;
        if (f03.a(context) || (pendingIntentK = k(context, lw0Var)) == null) {
            return false;
        }
        s(context, lw0Var.c(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentK, i, true), y48.a | 134217728));
        return true;
    }
}
