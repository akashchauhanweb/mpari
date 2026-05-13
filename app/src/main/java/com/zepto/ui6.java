package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class ui6 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public final Context a;
    public final lt3 b;
    public final vj2 c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final si6 h;
    public final Map e = new nx();
    public boolean g = false;

    public ui6(FirebaseMessaging firebaseMessaging, lt3 lt3Var, si6 si6Var, vj2 vj2Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = lt3Var;
        this.h = si6Var;
        this.c = vj2Var;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    public static void b(Task task) throws IOException {
        try {
            gd6.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static Task e(final FirebaseMessaging firebaseMessaging, final lt3 lt3Var, final vj2 vj2Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return gd6.c(scheduledExecutorService, new Callable() { // from class: com.zepto.ti6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ui6.i(context, scheduledExecutorService, firebaseMessaging, lt3Var, vj2Var);
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public static /* synthetic */ ui6 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, lt3 lt3Var, vj2 vj2Var) {
        return new ui6(firebaseMessaging, lt3Var, si6.a(context, scheduledExecutorService), vj2Var, context, scheduledExecutorService);
    }

    public final void c(String str) throws IOException {
        b(this.c.k(this.d.h(), str));
    }

    public final void d(String str) throws IOException {
        b(this.c.l(this.d.h(), str));
    }

    public boolean f() {
        return this.h.b() != null;
    }

    public synchronized boolean h() {
        return this.g;
    }

    public final void j(ri6 ri6Var) {
        synchronized (this.e) {
            try {
                String strE = ri6Var.e();
                if (this.e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(strE);
                    rc6 rc6Var = (rc6) arrayDeque.poll();
                    if (rc6Var != null) {
                        rc6Var.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(com.zepto.ri6 r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ui6.k(com.zepto.ri6):boolean");
    }

    public void l(Runnable runnable, long j) {
        this.f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public synchronized void m(boolean z) {
        this.g = z;
    }

    public final void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.zepto.si6 r0 = r2.h     // Catch: java.lang.Throwable -> L17
            com.zepto.ri6 r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.zepto.si6 r1 = r2.h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ui6.p():boolean");
    }

    public void q(long j) {
        l(new vi6(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), i)), j);
        m(true);
    }
}
