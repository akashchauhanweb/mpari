package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s82 {
    public static final Object c = new Object();
    public static ix7 d;
    public final Context a;
    public final Executor b = new hw4();

    public s82(Context context) {
        this.a = context;
    }

    public static Task e(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ix7 ix7VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return ix7VarF.c(intent).h(new hw4(), new cz0() { // from class: com.zepto.r82
                @Override // com.zepto.cz0
                public final Object a(Task task) {
                    return s82.g(task);
                }
            });
        }
        if (bz5.b().e(context)) {
            ou7.f(context, ix7VarF, intent);
        } else {
            ix7VarF.c(intent);
        }
        return gd6.e(-1);
    }

    public static ix7 f(Context context, String str) {
        ix7 ix7Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ix7(context, str);
                }
                ix7Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ix7Var;
    }

    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(bz5.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    public static /* synthetic */ Task j(Context context, Intent intent, boolean z, Task task) {
        return (ls4.g() && ((Integer) task.k()).intValue() == 402) ? e(context, intent, z).h(new hw4(), new cz0() { // from class: com.zepto.q82
            @Override // com.zepto.cz0
            public final Object a(Task task2) {
                return s82.i(task2);
            }
        }) : task;
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.a, intent);
    }

    public Task l(final Context context, final Intent intent) {
        boolean z = ls4.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? gd6.c(this.b, new Callable() { // from class: com.zepto.o82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s82.h(context, intent);
            }
        }).i(this.b, new cz0() { // from class: com.zepto.p82
            @Override // com.zepto.cz0
            public final Object a(Task task) {
                return s82.j(context, intent, z2, task);
            }
        }) : e(context, intent, z2);
    }
}
