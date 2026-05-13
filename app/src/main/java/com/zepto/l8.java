package com.zepto;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l8 extends yy0 {

    public static class a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public static class b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class c {
        public static <T> T a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    public static class d {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    public static class e {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface f {
        void l(int i);
    }

    public static void p(Activity activity) {
        a.a(activity);
    }

    public static /* synthetic */ void q(Activity activity) {
        if (activity.isFinishing() || xe.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void r(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.zepto.k8
                @Override // java.lang.Runnable
                public final void run() {
                    l8.q(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (!c80.c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof f) {
            ((f) activity).l(i);
        }
        b.b(activity, strArr, i);
    }

    public static View t(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) c.a(activity, i);
        }
        View viewFindViewById = activity.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static boolean u(Activity activity, String str) {
        if (!c80.c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return i >= 32 ? e.a(activity, str) : i == 31 ? d.b(activity, str) : b.c(activity, str);
    }

    public static void v(Activity activity, Intent intent, int i, Bundle bundle) {
        a.b(activity, intent, i, bundle);
    }

    public static void w(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        a.c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }
}
