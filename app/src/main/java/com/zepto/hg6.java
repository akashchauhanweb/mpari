package com.zepto;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg6 {
    public static final Logger a = Logger.getLogger(hg6.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        public static final b c;
        public static final b e;
        public static final /* synthetic */ b[] f;

        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.zepto.hg6.b
            public boolean a() {
                return !hg6.c();
            }
        }

        /* JADX INFO: renamed from: com.zepto.hg6$b$b, reason: collision with other inner class name */
        public enum C0087b extends b {
            public C0087b(String str, int i) {
                super(str, i);
            }

            @Override // com.zepto.hg6.b
            public boolean a() {
                return !hg6.c() || hg6.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            c = aVar;
            C0087b c0087b = new C0087b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            e = c0087b;
            f = new b[]{aVar, c0087b};
        }

        public b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return gg6.a() || b.get();
    }
}
