package com.zepto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class u96 implements Runnable {
    public final long c;
    public final PowerManager.WakeLock e;
    public final FirebaseMessaging f;
    public ExecutorService g = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new m14("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {
        public u96 a;

        public a(u96 u96Var) {
            this.a = u96Var;
        }

        public void a() {
            if (u96.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            u96 u96Var = this.a;
            if (u96Var != null && u96Var.d()) {
                if (u96.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.f.i(this.a, 0L);
                this.a.b().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public u96(FirebaseMessaging firebaseMessaging, long j) {
        this.f = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f.j();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        try {
            if (this.f.h() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            if (!vj2.g(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (bz5.b().e(b())) {
            this.e.acquire();
        }
        try {
            try {
                this.f.w(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.f.w(false);
                if (!bz5.b().e(b())) {
                    return;
                }
            }
            if (!this.f.q()) {
                this.f.w(false);
                if (bz5.b().e(b())) {
                    this.e.release();
                    return;
                }
                return;
            }
            if (bz5.b().d(b()) && !d()) {
                new a(this).a();
                if (bz5.b().e(b())) {
                    this.e.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f.w(false);
            } else {
                this.f.z(this.c);
            }
            if (!bz5.b().e(b())) {
                return;
            }
            this.e.release();
        } catch (Throwable th) {
            if (bz5.b().e(b())) {
                this.e.release();
            }
            throw th;
        }
    }
}
