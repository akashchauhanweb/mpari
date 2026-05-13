package com.zepto;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class w30 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final w30 e = new w30();
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();
    public final ArrayList c = new ArrayList();
    public boolean d = false;

    public interface a {
        void a(boolean z);
    }

    public static w30 b() {
        return e;
    }

    public static void c(Application application) {
        w30 w30Var = e;
        synchronized (w30Var) {
            try {
                if (!w30Var.d) {
                    application.registerActivityLifecycleCallbacks(w30Var);
                    application.registerComponentCallbacks(w30Var);
                    w30Var.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (e) {
            this.c.add(aVar);
        }
    }

    public boolean d() {
        return this.a.get();
    }

    public boolean e(boolean z) {
        if (!this.b.get()) {
            if (!ls4.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z) {
        synchronized (e) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            f(true);
        }
    }
}
