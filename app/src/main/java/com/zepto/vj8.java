package com.zepto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vj8 implements ServiceConnection {
    public pk8 c;
    public final /* synthetic */ em8 f;
    public int a = 0;
    public final Messenger b = new Messenger(new qg8(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zepto.ri8
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            vj8 vj8Var = this.a;
            synchronized (vj8Var) {
                try {
                    hl8 hl8Var = (hl8) vj8Var.e.get(i);
                    if (hl8Var == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    vj8Var.e.remove(i);
                    vj8Var.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        hl8Var.c(new pl8(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    hl8Var.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final Queue d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public /* synthetic */ vj8(em8 em8Var, lj8 lj8Var) {
        this.f = em8Var;
    }

    public final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    public final synchronized void b(int i, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            rw0.b().c(this.f.a, this);
            pl8 pl8Var = new pl8(i, str, th);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((hl8) it.next()).c(pl8Var);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ((hl8) this.e.valueAt(i3)).c(pl8Var);
            }
            this.e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        this.f.b.execute(new Runnable() { // from class: com.zepto.qh8
            @Override // java.lang.Runnable
            public final void run() {
                final hl8 hl8Var;
                while (true) {
                    final vj8 vj8Var = this.c;
                    synchronized (vj8Var) {
                        try {
                            if (vj8Var.a != 2) {
                                return;
                            }
                            if (vj8Var.d.isEmpty()) {
                                vj8Var.f();
                                return;
                            } else {
                                hl8Var = (hl8) vj8Var.d.poll();
                                vj8Var.e.put(hl8Var.a, hl8Var);
                                vj8Var.f.b.schedule(new Runnable() { // from class: com.zepto.bj8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vj8Var.e(hl8Var.a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(hl8Var)));
                    }
                    em8 em8Var = vj8Var.f;
                    Messenger messenger = vj8Var.b;
                    int i = hl8Var.c;
                    Context context = em8Var.a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = hl8Var.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", hl8Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", hl8Var.d);
                    messageObtain.setData(bundle);
                    try {
                        vj8Var.c.a(messageObtain);
                    } catch (RemoteException e) {
                        vj8Var.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i) {
        hl8 hl8Var = (hl8) this.e.get(i);
        if (hl8Var != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.e.remove(i);
            hl8Var.c(new pl8(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                rw0.b().c(this.f.a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(hl8 hl8Var) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(hl8Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(hl8Var);
            c();
            return true;
        }
        this.d.add(hl8Var);
        iu4.k(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (rw0.b().a(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable() { // from class: com.zepto.bi8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.c.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.b.execute(new Runnable() { // from class: com.zepto.ih8
            @Override // java.lang.Runnable
            public final void run() {
                vj8 vj8Var = this.c;
                IBinder iBinder2 = iBinder;
                synchronized (vj8Var) {
                    if (iBinder2 == null) {
                        vj8Var.a(0, "Null service connection");
                        return;
                    }
                    try {
                        vj8Var.c = new pk8(iBinder2);
                        vj8Var.a = 2;
                        vj8Var.c();
                    } catch (RemoteException e) {
                        vj8Var.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.b.execute(new Runnable() { // from class: com.zepto.ji8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.a(2, "Service disconnected");
            }
        });
    }
}
