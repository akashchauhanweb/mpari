package com.zepto;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ff5 {
    public static int h;
    public static PendingIntent i;
    public static final Executor j = new Executor() { // from class: com.zepto.bn8
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final km8 c;
    public final ScheduledExecutorService d;
    public Messenger f;
    public tf8 g;
    public final w26 a = new w26();
    public final Messenger e = new Messenger(new t68(this, Looper.getMainLooper()));

    public ff5(Context context) {
        this.b = context;
        this.c = new km8(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task c(Bundle bundle) {
        return k(bundle) ? gd6.e(null) : gd6.e(bundle);
    }

    public static /* bridge */ /* synthetic */ void e(ff5 ff5Var, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new sd8());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof tf8) {
                        ff5Var.g = (tf8) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ff5Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!qm8.a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        ff5Var.j(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (ff5Var.a) {
                        for (int i2 = 0; i2 < ff5Var.a.size(); i2++) {
                            try {
                                ff5Var.j((String) ff5Var.a.i(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !qm8.a(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                ff5Var.j(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String h() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    public static synchronized void i(Context context, Intent intent) {
        try {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, x58.a);
            }
            intent.putExtra("app", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean k(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a(br0 br0Var) {
        if (this.c.a() < 233700000) {
            return gd6.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", br0Var.d());
        Integer numE = br0Var.e();
        if (numE != null) {
            bundle.putInt("google.product_id", numE.intValue());
        }
        return em8.b(this.b).c(3, bundle);
    }

    public Task b(final Bundle bundle) {
        return this.c.a() < 12000000 ? this.c.b() != 0 ? g(bundle).i(j, new cz0() { // from class: com.zepto.in8
            @Override // com.zepto.cz0
            public final Object a(Task task) {
                return this.a.d(bundle, task);
            }
        }) : gd6.d(new IOException("MISSING_INSTANCEID_SERVICE")) : em8.b(this.b).d(1, bundle).h(j, new cz0() { // from class: com.zepto.e68
            @Override // com.zepto.cz0
            public final Object a(Task task) throws IOException {
                if (task.o()) {
                    return (Bundle) task.k();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.j())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.j());
            }
        });
    }

    public final /* synthetic */ Task d(Bundle bundle, Task task) {
        return (task.o() && k((Bundle) task.k())) ? g(bundle).p(j, new x86() { // from class: com.zepto.vm8
            @Override // com.zepto.x86
            public final Task a(Object obj) {
                return ff5.c((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void f(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task g(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ff5.g(android.os.Bundle):com.google.android.gms.tasks.Task");
    }

    public final void j(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                rc6 rc6Var = (rc6) this.a.remove(str);
                if (rc6Var != null) {
                    rc6Var.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
