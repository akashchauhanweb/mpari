package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.zepto.vb8;

/* JADX INFO: loaded from: classes.dex */
public class ExtractionForegroundService extends Service {
    public final IBinder a = new vb8(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
