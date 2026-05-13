package com.zepto;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.zepto.ae4;
import com.zepto.is0;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class tk1 {
    public final ExecutorService a;
    public final Context b;
    public final ee4 c;

    public tk1(Context context, ee4 ee4Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = ee4Var;
    }

    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        kx2 kx2VarD = d();
        is0.a aVarE = is0.e(this.b, this.c);
        e(aVarE.a, kx2VarD);
        c(aVarE);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!ls4.e()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    public final void c(is0.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.c, aVar.a.b());
    }

    public final kx2 d() {
        kx2 kx2VarM = kx2.m(this.c.p("gcm.n.image"));
        if (kx2VarM != null) {
            kx2VarM.B(this.a);
        }
        return kx2VarM;
    }

    public final void e(ae4.e eVar, kx2 kx2Var) {
        if (kx2Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) gd6.b(kx2Var.n(), 5L, TimeUnit.SECONDS);
            eVar.p(bitmap);
            eVar.y(new ae4.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            kx2Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            kx2Var.close();
        }
    }
}
