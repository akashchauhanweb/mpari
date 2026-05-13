package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.zepto.ay7;
import com.zepto.bw4;
import com.zepto.fz7;
import com.zepto.gy7;
import com.zepto.hy7;
import com.zepto.jy7;
import com.zepto.p66;
import com.zepto.pu7;
import com.zepto.qy5;
import com.zepto.rn3;
import com.zepto.uc6;
import com.zepto.x52;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d implements x52 {
    public static final String l = rn3.i("SystemAlarmDispatcher");
    public final Context a;
    public final uc6 b;
    public final fz7 c;
    public final bw4 d;
    public final jy7 e;
    public final androidx.work.impl.background.systemalarm.a f;
    public final List g;
    public Intent h;
    public c i;
    public p66 j;
    public final gy7 k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            RunnableC0031d runnableC0031d;
            synchronized (d.this.g) {
                d dVar = d.this;
                dVar.h = (Intent) dVar.g.get(0);
            }
            Intent intent = d.this.h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.h.getIntExtra("KEY_START_ID", 0);
                rn3 rn3VarE = rn3.e();
                String str = d.l;
                rn3VarE.a(str, "Processing command " + d.this.h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = pu7.b(d.this.a, action + " (" + intExtra + ")");
                try {
                    rn3.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    d dVar2 = d.this;
                    dVar2.f.o(dVar2.h, intExtra, dVar2);
                    rn3.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = d.this.b.a();
                    runnableC0031d = new RunnableC0031d(d.this);
                } catch (Throwable th) {
                    try {
                        rn3 rn3VarE2 = rn3.e();
                        String str2 = d.l;
                        rn3VarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        rn3.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = d.this.b.a();
                        runnableC0031d = new RunnableC0031d(d.this);
                    } catch (Throwable th2) {
                        rn3.e().a(d.l, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        d.this.b.a().execute(new RunnableC0031d(d.this));
                        throw th2;
                    }
                }
                executorA.execute(runnableC0031d);
            }
        }
    }

    public static class b implements Runnable {
        public final d c;
        public final Intent e;
        public final int f;

        public b(d dVar, Intent intent, int i) {
            this.c = dVar;
            this.e = intent;
            this.f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.e, this.f);
        }
    }

    public interface c {
        void a();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0031d implements Runnable {
        public final d c;

        public RunnableC0031d(d dVar) {
            this.c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.c();
        }
    }

    public d(Context context) {
        this(context, null, null, null);
    }

    public boolean a(Intent intent, int i) {
        rn3 rn3VarE = rn3.e();
        String str = l;
        rn3VarE.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            rn3.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean z = !this.g.isEmpty();
                this.g.add(intent);
                if (!z) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        rn3 rn3VarE = rn3.e();
        String str = l;
        rn3VarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.g) {
            try {
                if (this.h != null) {
                    rn3.e().a(str, "Removing command " + this.h);
                    if (!((Intent) this.g.remove(0)).equals(this.h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.h = null;
                }
                qy5 qy5VarB = this.b.b();
                if (!this.f.n() && this.g.isEmpty() && !qy5VarB.m0()) {
                    rn3.e().a(str, "No more commands & intents.");
                    c cVar = this.i;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.g.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.x52
    public void d(ay7 ay7Var, boolean z) {
        this.b.a().execute(new b(this, androidx.work.impl.background.systemalarm.a.c(this.a, ay7Var, z), 0));
    }

    public bw4 e() {
        return this.d;
    }

    public uc6 f() {
        return this.b;
    }

    public jy7 g() {
        return this.e;
    }

    public fz7 h() {
        return this.c;
    }

    public gy7 i() {
        return this.k;
    }

    public final boolean j(String str) {
        b();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        rn3.e().a(l, "Destroying SystemAlarmDispatcher");
        this.d.p(this);
        this.i = null;
    }

    public final void l() {
        b();
        PowerManager.WakeLock wakeLockB = pu7.b(this.a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.e.o().c(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public void m(c cVar) {
        if (this.i != null) {
            rn3.e().c(l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.i = cVar;
        }
    }

    public d(Context context, bw4 bw4Var, jy7 jy7Var, gy7 gy7Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = new p66();
        jy7Var = jy7Var == null ? jy7.i(context) : jy7Var;
        this.e = jy7Var;
        this.f = new androidx.work.impl.background.systemalarm.a(applicationContext, jy7Var.g().a(), this.j);
        this.c = new fz7(jy7Var.g().k());
        bw4Var = bw4Var == null ? jy7Var.k() : bw4Var;
        this.d = bw4Var;
        uc6 uc6VarO = jy7Var.o();
        this.b = uc6VarO;
        this.k = gy7Var == null ? new hy7(bw4Var, uc6VarO) : gy7Var;
        bw4Var.e(this);
        this.g = new ArrayList();
        this.h = null;
    }
}
