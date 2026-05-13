package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum ng6 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a k = new a(null);
    public final String c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ng6 a(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return ng6.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return ng6.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return ng6.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return ng6.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return ng6.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }
    }

    ng6(String str) {
        this.c = str;
    }

    public final String a() {
        return this.c;
    }
}
