package com.zepto;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ub0 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ub0 a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return is4.c.g().c(trustManager);
        }
    }

    public abstract List a(List list, String str);
}
