package com.zepto;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ d c;
        public final /* synthetic */ Object e;

        public a(d dVar, Object obj) {
            this.c = dVar;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a = this.e;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Application c;
        public final /* synthetic */ d e;

        public b(Application application, d dVar) {
            this.c = application;
            this.e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.unregisterActivityLifecycleCallbacks(this.e);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object e;

        public c(Object obj, Object obj2) {
            this.c = obj;
            this.e = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = xe.d;
                if (method != null) {
                    method.invoke(this.c, this.e, Boolean.FALSE, "AppCompat recreation");
                } else {
                    xe.e.invoke(this.c, this.e, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object a;
        public Activity b;
        public final int c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;

        public d(Activity activity) {
            this.b = activity;
            this.c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.e || this.f || this.d || !xe.h(this.a, this.c, activity)) {
                return;
            }
            this.f = true;
            this.a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        a = clsA;
        b = b();
        c = f();
        d = d(clsA);
        e = c(clsA);
        f = e(clsA);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT == 27;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
