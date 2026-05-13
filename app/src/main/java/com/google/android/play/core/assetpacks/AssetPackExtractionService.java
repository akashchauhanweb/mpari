package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.zepto.hd8;
import com.zepto.u88;

/* JADX INFO: loaded from: classes.dex */
public class AssetPackExtractionService extends Service {
    public u88 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        hd8.a(getApplicationContext()).a(this);
    }
}
