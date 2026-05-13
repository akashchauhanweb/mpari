package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ou7 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static mu7 c;

    public static void b(Context context) {
        if (c == null) {
            mu7 mu7Var = new mu7(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = mu7Var;
            mu7Var.d(true);
        }
    }

    public static void c(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && d(intent)) {
                    g(intent, false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void f(Context context, ix7 ix7Var, final Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                if (!zD) {
                    c.a(a);
                }
                ix7Var.c(intent).b(new jg4() { // from class: com.zepto.nu7
                    @Override // com.zepto.jg4
                    public final void a(Task task) {
                        ou7.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName h(Context context, Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    c.a(a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
