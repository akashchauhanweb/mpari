package com.zepto;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pk8 {
    public final Messenger a;
    public final tf8 b;

    public pk8(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (fk8.a(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else {
            if (!fk8.a(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.b = new tf8(iBinder);
            this.a = null;
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        tf8 tf8Var = this.b;
        if (tf8Var == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        tf8Var.d(message);
    }
}
