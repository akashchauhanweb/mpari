package com.zepto;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum kx4 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a l = new a(null);
    public final String c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kx4 a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            kx4 kx4Var = kx4.HTTP_1_0;
            if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                kx4Var = kx4.HTTP_1_1;
                if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                    kx4Var = kx4.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                        kx4Var = kx4.HTTP_2;
                        if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                            kx4Var = kx4.SPDY_3;
                            if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                                kx4Var = kx4.QUIC;
                                if (!Intrinsics.areEqual(protocol, kx4Var.c)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return kx4Var;
        }
    }

    kx4(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.c;
    }
}
