package com.zepto;

import com.zepto.wg1;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class uw0 implements f46 {
    public static final b b = new b(null);
    public static final wg1.a a = new a();

    public static final class a implements wg1.a {
        @Override // com.zepto.wg1.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return tw0.f.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // com.zepto.wg1.a
        public f46 b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new uw0();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wg1.a a() {
            return uw0.a;
        }
    }

    @Override // com.zepto.f46
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // com.zepto.f46
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // com.zepto.f46
    public boolean c() {
        return tw0.f.c();
    }

    @Override // com.zepto.f46
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = is4.c.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
