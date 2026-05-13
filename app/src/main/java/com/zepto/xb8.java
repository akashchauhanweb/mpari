package com.zepto;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xb8 implements ServiceConnection {
    public final z68 a = new z68("ExtractionForegroundServiceConnection");
    public final List b = new ArrayList();
    public final Context c;
    public ExtractionForegroundService d;
    public Notification e;

    public xb8(Context context) {
        this.c = context;
    }

    public final void a(Notification notification) {
        this.e = notification;
    }

    public final void b() {
        this.a.a("Stopping foreground installation service.", new Object[0]);
        this.c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.d;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    public final void c(hn8 hn8Var) {
        synchronized (this.b) {
            this.b.add(hn8Var);
        }
    }

    public final void d() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
            this.b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((hn8) arrayList.get(i)).l(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((vb8) iBinder).a;
        this.d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.e);
        d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
