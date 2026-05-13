package com.zepto;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class is3 implements fs3 {
    public final MediaSessionManager.RemoteUserInfo a;

    public is3(String str, int i, int i2) {
        this.a = hs3.a(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof is3) {
            return this.a.equals(((is3) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return lf4.b(this.a);
    }

    public is3(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.a = remoteUserInfo;
    }
}
