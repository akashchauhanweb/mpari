package com.zepto;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class es3 {
    public fs3 a;

    public es3(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new is3(str, i, i2);
        } else {
            this.a = new js3(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof es3) {
            return this.a.equals(((es3) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public es3(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.a = new is3(remoteUserInfo);
    }
}
