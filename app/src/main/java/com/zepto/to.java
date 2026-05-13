package com.zepto;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class to extends is4 {
    public static final boolean e;
    public static final a f = new a(null);
    public final List d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final is4 a() {
            if (b()) {
                return new to();
            }
            return null;
        }

        public final boolean b() {
            return to.e;
        }
    }

    static {
        e = is4.c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public to() {
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new f46[]{wo.a.a(), new wg1(lp.g.d()), new wg1(uw0.b.a()), new wg1(o70.b.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((f46) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // com.zepto.is4
    public ub0 c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        yo yoVarA = yo.d.a(trustManager);
        return yoVarA != null ? yoVarA : super.c(trustManager);
    }

    @Override // com.zepto.is4
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((f46) next).a(sslSocket)) {
                    break;
                }
            }
        }
        f46 f46Var = (f46) next;
        if (f46Var != null) {
            f46Var.d(sslSocket, str, protocols);
        }
    }

    @Override // com.zepto.is4
    public String h(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f46) next).a(sslSocket)) {
                break;
            }
        }
        f46 f46Var = (f46) next;
        if (f46Var != null) {
            return f46Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.zepto.is4
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
