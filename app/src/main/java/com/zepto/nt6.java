package com.zepto;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nt6 {
    public static final StringBuilder a = new StringBuilder();
    public static final t80 b = t80.d("RIFF");
    public static final t80 c = t80.d("WEBP");

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    public static class b extends Thread {
        public b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    public static long a(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    public static void c() {
        if (!q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String f(jc5 jc5Var) {
        StringBuilder sb = a;
        String strG = g(jc5Var, sb);
        sb.setLength(0);
        return strG;
    }

    public static String g(jc5 jc5Var, StringBuilder sb) {
        String str = jc5Var.f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(jc5Var.f);
        } else {
            Uri uri = jc5Var.d;
            if (uri != null) {
                String string = uri.toString();
                sb.ensureCapacity(string.length() + 50);
                sb.append(string);
            } else {
                sb.ensureCapacity(50);
                sb.append(jc5Var.e);
            }
        }
        sb.append('\n');
        if (jc5Var.n != 0.0f) {
            sb.append("rotation:");
            sb.append(jc5Var.n);
            if (jc5Var.q) {
                sb.append('@');
                sb.append(jc5Var.o);
                sb.append('x');
                sb.append(jc5Var.p);
            }
            sb.append('\n');
        }
        if (jc5Var.c()) {
            sb.append("resize:");
            sb.append(jc5Var.h);
            sb.append('x');
            sb.append(jc5Var.i);
            sb.append('\n');
        }
        if (jc5Var.j) {
            sb.append("centerCrop:");
            sb.append(jc5Var.k);
            sb.append('\n');
        } else if (jc5Var.l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List list = jc5Var.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((an6) jc5Var.g.get(i)).b());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String j(t60 t60Var) {
        return k(t60Var, "");
    }

    public static String k(t60 t60Var, String str) {
        StringBuilder sb = new StringBuilder(str);
        s5 s5VarH = t60Var.h();
        if (s5VarH != null) {
            sb.append(s5VarH.b.d());
        }
        List listI = t60Var.i();
        if (listI != null) {
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || s5VarH != null) {
                    sb.append(", ");
                }
                sb.append(((s5) listI.get(i)).b.d());
            }
        }
        return sb.toString();
    }

    public static int l(Resources resources, jc5 jc5Var) throws FileNotFoundException {
        Uri uri;
        int i = jc5Var.e;
        if (i != 0 || (uri = jc5Var.d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + jc5Var.d);
        }
        List<String> pathSegments = jc5Var.d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + jc5Var.d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + jc5Var.d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + jc5Var.d);
    }

    public static Resources m(Context context, jc5 jc5Var) throws FileNotFoundException {
        Uri uri;
        if (jc5Var.e != 0 || (uri = jc5Var.d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + jc5Var.d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + jc5Var.d);
        }
    }

    public static Object n(Context context, String str) {
        return context.getSystemService(str);
    }

    public static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean p(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    public static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean r(a80 a80Var) {
        return a80Var.Z(0L, b) && a80Var.Z(8L, c);
    }

    public static void s(String str, String str2, String str3) {
        t(str, str2, str3, "");
    }

    public static void t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
