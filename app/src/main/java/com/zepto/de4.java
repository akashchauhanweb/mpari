package com.zepto;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class de4 {
    public static final Object c = new Object();
    public static Set d = new HashSet();
    public static final Object e = new Object();
    public final Context a;
    public final NotificationManager b;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public de4(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static de4 b(Context context) {
        return new de4(context);
    }

    public boolean a() {
        return a.a(this.b);
    }
}
