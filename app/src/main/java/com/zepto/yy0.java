package com.zepto;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class yy0 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static class a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class d {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static class f {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, yy0.k(context), handler);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static class g {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        lf4.d(str, "permission must be non-null");
        return (c80.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : de4.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return e.a(context);
    }

    public static int c(Context context, int i) {
        return d.a(context, i);
    }

    public static ColorStateList d(Context context, int i) {
        return ed5.d(context.getResources(), i, context.getTheme());
    }

    public static Drawable e(Context context, int i) {
        return c.b(context, i);
    }

    public static File[] f(Context context) {
        return b.a(context);
    }

    public static File[] g(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : a62.a(new Handler(context.getMainLooper()));
    }

    public static File i(Context context) {
        return c.c(context);
    }

    public static Object j(Context context, Class cls) {
        return d.b(context, cls);
    }

    public static String k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (vq4.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static boolean l(Context context, Intent[] intentArr, Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void m(Context context, Intent intent, Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void n(Context context, Intent intent) {
        f.b(context, intent);
    }
}
