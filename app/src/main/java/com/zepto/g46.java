package com.zepto;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g46 extends hy {
    public final Socket m;

    public g46(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.m = socket;
    }

    @Override // com.zepto.hy
    public IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.zepto.hy
    public void x() {
        try {
            this.m.close();
        } catch (AssertionError e) {
            if (!zf4.e(e)) {
                throw e;
            }
            ag4.a.log(Level.WARNING, "Failed to close timed out socket " + this.m, (Throwable) e);
        } catch (Exception e2) {
            ag4.a.log(Level.WARNING, "Failed to close timed out socket " + this.m, (Throwable) e2);
        }
    }
}
