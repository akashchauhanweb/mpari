package com.zepto;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ow0 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public ow0(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.d = connectionSpecs;
    }

    public final nw0 a(SSLSocket sslSocket) throws UnknownServiceException, CloneNotSupportedException {
        nw0 nw0Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.a;
        int size = this.d.size();
        while (true) {
            if (i >= size) {
                nw0Var = null;
                break;
            }
            nw0Var = (nw0) this.d.get(i);
            if (nw0Var.e(sslSocket)) {
                this.a = i + 1;
                break;
            }
            i++;
        }
        if (nw0Var != null) {
            this.b = c(sslSocket);
            nw0Var.c(sslSocket, this.c);
            return nw0Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.c = true;
        return (!this.b || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.d.size();
        for (int i = this.a; i < size; i++) {
            if (((nw0) this.d.get(i)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
