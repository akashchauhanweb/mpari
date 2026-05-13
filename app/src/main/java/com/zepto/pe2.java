package com.zepto;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class pe2 {
    public final int a;
    public final int b;
    public final Notification c;

    public pe2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pe2.class != obj.getClass()) {
            return false;
        }
        pe2 pe2Var = (pe2) obj;
        if (this.a == pe2Var.a && this.b == pe2Var.b) {
            return this.c.equals(pe2Var.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
