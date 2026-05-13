package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fz7 {
    public static final String e = rn3.i("WorkTimer");
    public final lf5 a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Object d = new Object();

    public interface a {
        void a(ay7 ay7Var);
    }

    public static class b implements Runnable {
        public final fz7 c;
        public final ay7 e;

        public b(fz7 fz7Var, ay7 ay7Var) {
            this.c = fz7Var;
            this.e = ay7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.c.d) {
                try {
                    if (((b) this.c.b.remove(this.e)) != null) {
                        a aVar = (a) this.c.c.remove(this.e);
                        if (aVar != null) {
                            aVar.a(this.e);
                        }
                    } else {
                        rn3.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.e));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public fz7(lf5 lf5Var) {
        this.a = lf5Var;
    }

    public void a(ay7 ay7Var, long j, a aVar) {
        synchronized (this.d) {
            rn3.e().a(e, "Starting timer for " + ay7Var);
            b(ay7Var);
            b bVar = new b(this, ay7Var);
            this.b.put(ay7Var, bVar);
            this.c.put(ay7Var, aVar);
            this.a.a(j, bVar);
        }
    }

    public void b(ay7 ay7Var) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(ay7Var)) != null) {
                    rn3.e().a(e, "Stopping timer for " + ay7Var);
                    this.c.remove(ay7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
