package com.zepto;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class u88 extends um8 {
    public final z68 a = new z68("AssetPackExtractionService");
    public final Context b;
    public final s98 c;
    public final yi8 d;
    public final xb8 e;
    public final NotificationManager f;

    public u88(Context context, s98 s98Var, yi8 yi8Var, xb8 xb8Var) {
        this.b = context;
        this.c = s98Var;
        this.d = yi8Var;
        this.e = xb8Var;
        this.f = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.zepto.an8
    public final void A(Bundle bundle, hn8 hn8Var) {
        this.a.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!ub8.b(this.b) || !ub8.a(this.b)) {
            hn8Var.c0(new Bundle());
        } else {
            this.c.J();
            hn8Var.b(new Bundle());
        }
    }

    @Override // com.zepto.an8
    public final void T(Bundle bundle, hn8 hn8Var) {
        j(bundle, hn8Var);
    }

    public final synchronized void d(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        try {
            this.f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(Bundle bundle, hn8 hn8Var) {
        try {
            this.a.a("updateServiceState AIDL call", new Object[0]);
            if (ub8.b(this.b) && ub8.a(this.b)) {
                int i = bundle.getInt("action_type");
                this.e.c(hn8Var);
                if (i != 1) {
                    if (i == 2) {
                        this.d.c(false);
                        this.e.b();
                        return;
                    } else {
                        this.a.b("Unknown action type received: %d", Integer.valueOf(i));
                        hn8Var.c0(new Bundle());
                        return;
                    }
                }
                d(bundle.getString("notification_channel_name"));
                this.d.c(true);
                xb8 xb8Var = this.e;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                Notification.Builder timeoutAfter = new Notification.Builder(this.b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                if (parcelable instanceof PendingIntent) {
                    timeoutAfter.setContentIntent((PendingIntent) parcelable);
                }
                Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                if (string == null) {
                    string = "Downloading additional file";
                }
                Notification.Builder contentTitle = ongoing.setContentTitle(string);
                if (string2 == null) {
                    string2 = "Transferring";
                }
                contentTitle.setSubText(string2);
                int i2 = bundle.getInt("notification_color");
                if (i2 != 0) {
                    timeoutAfter.setColor(i2).setVisibility(-1);
                }
                xb8Var.a(timeoutAfter.build());
                this.b.bindService(new Intent(this.b, (Class<?>) ExtractionForegroundService.class), this.e, 1);
                return;
            }
            hn8Var.c0(new Bundle());
        } catch (Throwable th) {
            throw th;
        }
    }
}
