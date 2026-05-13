package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ix7 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final Queue d;
    public fx7 e;
    public boolean f;

    public static class a {
        public final Intent a;
        public final rc6 b = new rc6();

        public a(Intent intent) {
            this.a = intent;
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.zepto.gx7
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new jg4() { // from class: com.zepto.hx7
                @Override // com.zepto.jg4
                public final void a(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void d() {
            this.b.e(null);
        }

        public Task e() {
            return this.b.a();
        }

        public final /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " finishing.");
            d();
        }
    }

    public ix7(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new m14("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final void a() {
        while (!this.d.isEmpty()) {
            ((a) this.d.poll()).d();
        }
    }

    public final synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                fx7 fx7Var = this.e;
                if (fx7Var == null || !fx7Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.c((a) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Task c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.c);
            this.d.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            if (rw0.b().a(this.a, this.b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof fx7) {
                this.e = (fx7) iBinder;
                b();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    public ix7(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledExecutorService;
    }
}
