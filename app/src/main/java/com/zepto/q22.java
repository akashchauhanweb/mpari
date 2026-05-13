package com.zepto;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.zepto.fx7;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class q22 extends Service {
    public Binder b;
    public int d;
    public final ExecutorService a = t82.d();
    public final Object c = new Object();
    public int e = 0;

    public class a implements fx7.a {
        public a() {
        }

        @Override // com.zepto.fx7.a
        public Task a(Intent intent) {
            return q22.this.j(intent);
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            ou7.c(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    k(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    public final /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    public final /* synthetic */ void i(Intent intent, rc6 rc6Var) {
        try {
            f(intent);
        } finally {
            rc6Var.c(null);
        }
    }

    public final Task j(final Intent intent) {
        if (g(intent)) {
            return gd6.e(null);
        }
        final rc6 rc6Var = new rc6();
        this.a.execute(new Runnable() { // from class: com.zepto.p22
            @Override // java.lang.Runnable
            public final void run() {
                this.c.i(intent, rc6Var);
            }
        });
        return rc6Var.a();
    }

    public boolean k(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.b == null) {
                this.b = new fx7(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        Task taskJ = j(intentE);
        if (taskJ.n()) {
            d(intent);
            return 2;
        }
        taskJ.c(new hw4(), new jg4() { // from class: com.zepto.o22
            @Override // com.zepto.jg4
            public final void a(Task task) {
                this.a.h(intent, task);
            }
        });
        return 3;
    }
}
