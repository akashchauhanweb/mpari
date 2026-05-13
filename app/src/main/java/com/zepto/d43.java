package com.zepto;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: loaded from: classes3.dex */
public class d43 extends is4 {
    public static final boolean d;
    public static final a e = new a(0 == true ? 1 : 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d43 a() {
            if (b()) {
                return new d43();
            }
            return null;
        }

        public final boolean b() {
            return d43.d;
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(property) : null;
        boolean z = true;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z = false;
            }
        } else if (intOrNull.intValue() < 9) {
            z = false;
        }
        d = z;
    }

    @Override // com.zepto.is4
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List listB = is4.c.b(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = listB.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sslParameters);
    }

    @Override // com.zepto.is4
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
