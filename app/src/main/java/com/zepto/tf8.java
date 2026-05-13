package com.zepto;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class tf8 implements Parcelable {
    public static final Parcelable.Creator<tf8> CREATOR = new eb8();
    public Messenger c;

    public tf8(IBinder iBinder) {
        this.c = new Messenger(iBinder);
    }

    public final IBinder c() {
        Messenger messenger = this.c;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void d(Message message) throws RemoteException {
        Messenger messenger = this.c;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return c().equals(((tf8) obj).c());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return c().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.c;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
