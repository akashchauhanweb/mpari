package com.zepto;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u82 implements Application.ActivityLifecycleCallbacks {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (ht3.B(bundle)) {
            ht3.u(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.a.add(intent)) {
            return;
        }
        a(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
