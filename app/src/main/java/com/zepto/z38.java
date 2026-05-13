package com.zepto;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class z38 implements DialogInterface.OnClickListener {
    public static z38 b(Activity activity, Intent intent, int i) {
        return new m38(intent, activity, i);
    }

    public static z38 c(af3 af3Var, Intent intent, int i) {
        return new u38(intent, af3Var, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
