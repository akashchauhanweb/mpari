package com.zepto;

import com.zepto.wg1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public class lp implements f46 {
    public static final wg1.a f;
    public static final a g;
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Class e;

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.lp$a$a, reason: collision with other inner class name */
        public static final class C0102a implements wg1.a {
            public final /* synthetic */ String a;

            public C0102a(String str) {
                this.a = str;
            }

            @Override // com.zepto.wg1.a
            public boolean a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt__StringsJVMKt.startsWith$default(name, this.a + '.', false, 2, null);
            }

            @Override // com.zepto.wg1.a
            public f46 b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return lp.g.b(sslSocket.getClass());
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lp b(Class cls) {
            Class superclass = cls;
            while (superclass != null && (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new lp(superclass);
        }

        public final wg1.a c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0102a(packageName);
        }

        public final wg1.a d() {
            return lp.f;
        }
    }

    static {
        a aVar = new a(null);
        g = aVar;
        f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public lp(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.a = declaredMethod;
        this.b = sslSocketClass.getMethod("setHostname", String.class);
        this.c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.zepto.f46
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.e.isInstance(sslSocket);
    }

    @Override // com.zepto.f46
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (Intrinsics.areEqual(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // com.zepto.f46
    public boolean c() {
        return jp.g.b();
    }

    @Override // com.zepto.f46
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.b.invoke(sslSocket, str);
                }
                this.d.invoke(sslSocket, is4.c.c(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
