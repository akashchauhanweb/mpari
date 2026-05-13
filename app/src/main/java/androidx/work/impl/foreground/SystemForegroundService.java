package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.a;
import com.zepto.ff3;
import com.zepto.rn3;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ff3 implements a.b {
    public static final String f = rn3.i("SystemFgService");
    public static SystemForegroundService g = null;
    public Handler b;
    public boolean c;
    public androidx.work.impl.foreground.a d;
    public NotificationManager e;

    public class a implements Runnable {
        public final /* synthetic */ int c;
        public final /* synthetic */ Notification e;
        public final /* synthetic */ int f;

        public a(int i, Notification notification, int i2) {
            this.c = i;
            this.e = notification;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                e.a(SystemForegroundService.this, this.c, this.e, this.f);
            } else if (i >= 29) {
                d.a(SystemForegroundService.this, this.c, this.e, this.f);
            } else {
                SystemForegroundService.this.startForeground(this.c, this.e);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int c;
        public final /* synthetic */ Notification e;

        public b(int i, Notification notification) {
            this.c = i;
            this.e = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.notify(this.c, this.e);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int c;

        public c(int i) {
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.cancel(this.c);
        }
    }

    public static class d {
        public static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    public static class e {
        public static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                rn3.e().l(SystemForegroundService.f, "Unable to start foreground service", e);
            }
        }
    }

    private void f() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.d = aVar;
        aVar.n(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i) {
        this.b.post(new c(i));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i, int i2, Notification notification) {
        this.b.post(new a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i, Notification notification) {
        this.b.post(new b(i, notification));
    }

    @Override // com.zepto.ff3, android.app.Service
    public void onCreate() {
        super.onCreate();
        g = this;
        f();
    }

    @Override // com.zepto.ff3, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.d.l();
    }

    @Override // com.zepto.ff3, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            rn3.e().f(f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.l();
            f();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.c = true;
        rn3.e().a(f, "All commands completed.");
        stopForeground(true);
        g = null;
        stopSelf();
    }
}
