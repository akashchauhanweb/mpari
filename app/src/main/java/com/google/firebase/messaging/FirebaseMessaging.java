package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.a;
import com.google.firebase.messaging.b;
import com.zepto.eh4;
import com.zepto.gd6;
import com.zepto.hc2;
import com.zepto.iu4;
import com.zepto.lt3;
import com.zepto.m14;
import com.zepto.md1;
import com.zepto.n42;
import com.zepto.nx4;
import com.zepto.rn6;
import com.zepto.s82;
import com.zepto.t42;
import com.zepto.t82;
import com.zepto.u82;
import com.zepto.u86;
import com.zepto.u96;
import com.zepto.uc2;
import com.zepto.ui6;
import com.zepto.ux4;
import com.zepto.vj2;
import com.zepto.x86;
import com.zepto.xc2;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long n = TimeUnit.HOURS.toSeconds(8);
    public static b o;
    public static rn6 p;
    public static ScheduledExecutorService q;
    public final hc2 a;
    public final uc2 b;
    public final Context c;
    public final vj2 d;
    public final com.google.firebase.messaging.a e;
    public final a f;
    public final Executor g;
    public final Executor h;
    public final Executor i;
    public final Task j;
    public final lt3 k;
    public boolean l;
    public final Application.ActivityLifecycleCallbacks m;

    public class a {
        public final u86 a;
        public boolean b;
        public t42 c;
        public Boolean d;

        public a(u86 u86Var) {
            this.a = u86Var;
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean boolE = e();
                this.d = boolE;
                if (boolE == null) {
                    t42 t42Var = new t42() { // from class: com.zepto.ed2
                        @Override // com.zepto.t42
                        public final void a(n42 n42Var) {
                            this.a.d(n42Var);
                        }
                    };
                    this.c = t42Var;
                    this.a.a(md1.class, t42Var);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.s();
        }

        public final /* synthetic */ void d(n42 n42Var) {
            if (c()) {
                FirebaseMessaging.this.y();
            }
        }

        public final Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(hc2 hc2Var, xc2 xc2Var, nx4 nx4Var, nx4 nx4Var2, uc2 uc2Var, rn6 rn6Var, u86 u86Var) {
        this(hc2Var, xc2Var, nx4Var, nx4Var2, uc2Var, rn6Var, u86Var, new lt3(hc2Var.j()));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(hc2 hc2Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) hc2Var.i(FirebaseMessaging.class);
        iu4.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized b k(Context context) {
        try {
            if (o == null) {
                o = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return o;
    }

    public static rn6 n() {
        return p;
    }

    public boolean A(b.a aVar) {
        return aVar == null || aVar.b(this.k.a());
    }

    public String h() throws IOException {
        final b.a aVarM = m();
        if (!A(aVarM)) {
            return aVarM.a;
        }
        final String strC = lt3.c(this.a);
        try {
            return (String) gd6.a(this.e.b(strC, new a.InterfaceC0042a() { // from class: com.zepto.cd2
                @Override // com.google.firebase.messaging.a.InterfaceC0042a
                public final Task start() {
                    return this.a.r(strC, aVarM);
                }
            }));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public void i(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (q == null) {
                    q = new ScheduledThreadPoolExecutor(1, new m14("TAG"));
                }
                q.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context j() {
        return this.c;
    }

    public final String l() {
        return "[DEFAULT]".equals(this.a.l()) ? "" : this.a.n();
    }

    public b.a m() {
        return k(this.c).d(l(), lt3.c(this.a));
    }

    public final void o(String str) {
        if ("[DEFAULT]".equals(this.a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new s82(this.c).k(intent);
        }
    }

    public boolean p() {
        return this.f.c();
    }

    public boolean q() {
        return this.k.g();
    }

    public final /* synthetic */ Task r(final String str, final b.a aVar) {
        return this.d.e().p(this.i, new x86() { // from class: com.zepto.dd2
            @Override // com.zepto.x86
            public final Task a(Object obj) {
                return this.a.s(str, aVar, (String) obj);
            }
        });
    }

    public final /* synthetic */ Task s(String str, b.a aVar, String str2) {
        k(this.c).f(l(), str, str2, this.k.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            o(str2);
        }
        return gd6.e(str2);
    }

    public final /* synthetic */ void t() {
        if (p()) {
            y();
        }
    }

    public final /* synthetic */ void u(ui6 ui6Var) {
        if (p()) {
            ui6Var.o();
        }
    }

    public final /* synthetic */ void v() {
        ux4.c(this.c);
    }

    public synchronized void w(boolean z) {
        this.l = z;
    }

    public final synchronized void x() {
        if (!this.l) {
            z(0L);
        }
    }

    public final void y() {
        if (A(m())) {
            x();
        }
    }

    public synchronized void z(long j) {
        i(new u96(this, Math.min(Math.max(30L, 2 * j), n)), j);
        this.l = true;
    }

    public FirebaseMessaging(hc2 hc2Var, xc2 xc2Var, nx4 nx4Var, nx4 nx4Var2, uc2 uc2Var, rn6 rn6Var, u86 u86Var, lt3 lt3Var) {
        this(hc2Var, xc2Var, uc2Var, rn6Var, u86Var, lt3Var, new vj2(hc2Var, lt3Var, nx4Var, nx4Var2, uc2Var), t82.f(), t82.c(), t82.b());
    }

    public FirebaseMessaging(hc2 hc2Var, xc2 xc2Var, uc2 uc2Var, rn6 rn6Var, u86 u86Var, lt3 lt3Var, vj2 vj2Var, Executor executor, Executor executor2, Executor executor3) {
        this.l = false;
        p = rn6Var;
        this.a = hc2Var;
        this.b = uc2Var;
        this.f = new a(u86Var);
        Context contextJ = hc2Var.j();
        this.c = contextJ;
        u82 u82Var = new u82();
        this.m = u82Var;
        this.k = lt3Var;
        this.h = executor;
        this.d = vj2Var;
        this.e = new com.google.firebase.messaging.a(executor);
        this.g = executor2;
        this.i = executor3;
        Context contextJ2 = hc2Var.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(u82Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (xc2Var != null) {
            xc2Var.a(new xc2.a() { // from class: com.zepto.yc2
            });
        }
        executor2.execute(new Runnable() { // from class: com.zepto.zc2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.t();
            }
        });
        Task taskE = ui6.e(this, lt3Var, vj2Var, contextJ, t82.g());
        this.j = taskE;
        taskE.g(executor2, new eh4() { // from class: com.zepto.ad2
            @Override // com.zepto.eh4
            public final void b(Object obj) {
                this.a.u((ui6) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.zepto.bd2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.v();
            }
        });
    }
}
