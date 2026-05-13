package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.zepto.rn3;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class jy7 extends iy7 {
    public static final String k = rn3.i("WorkManagerImpl");
    public static jy7 l = null;
    public static jy7 m = null;
    public static final Object n = new Object();
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public uc6 d;
    public List e;
    public bw4 f;
    public pu4 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final ej6 j;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public jy7(Context context, androidx.work.a aVar, uc6 uc6Var, WorkDatabase workDatabase, List list, bw4 bw4Var, ej6 ej6Var) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        rn3.h(new rn3.a(aVar.j()));
        this.a = applicationContext;
        this.d = uc6Var;
        this.c = workDatabase;
        this.f = bw4Var;
        this.j = ej6Var;
        this.b = aVar;
        this.e = list;
        this.g = new pu4(workDatabase);
        xo5.g(list, this.f, uc6Var.b(), this.c, aVar);
        this.d.c(new ForceStopRunnable(applicationContext, this));
    }

    public static void d(Context context, androidx.work.a aVar) {
        synchronized (n) {
            try {
                jy7 jy7Var = l;
                if (jy7Var != null && m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (jy7Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (m == null) {
                        m = androidx.work.impl.a.c(applicationContext, aVar);
                    }
                    l = m;
                }
            } finally {
            }
        }
    }

    public static jy7 h() {
        synchronized (n) {
            try {
                jy7 jy7Var = l;
                if (jy7Var != null) {
                    return jy7Var;
                }
                return m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static jy7 i(Context context) {
        jy7 jy7VarH;
        synchronized (n) {
            try {
                jy7VarH = h();
                if (jy7VarH == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jy7VarH;
    }

    @Override // com.zepto.iy7
    public nh4 b(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new mx7(this, list).a();
    }

    public nh4 e(UUID uuid) {
        va0 va0VarB = va0.b(uuid, this);
        this.d.c(va0VarB);
        return va0VarB.d();
    }

    public Context f() {
        return this.a;
    }

    public androidx.work.a g() {
        return this.b;
    }

    public pu4 j() {
        return this.g;
    }

    public bw4 k() {
        return this.f;
    }

    public List l() {
        return this.e;
    }

    public ej6 m() {
        return this.j;
    }

    public WorkDatabase n() {
        return this.c;
    }

    public uc6 o() {
        return this.d;
    }

    public void p() {
        synchronized (n) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q() {
        ka6.b(f());
        n().H().x();
        xo5.h(g(), n(), l());
    }

    public void r(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(ay7 ay7Var) {
        this.d.c(new l76(this.f, new o66(ay7Var), true));
    }
}
