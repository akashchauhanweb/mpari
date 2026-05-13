package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public interface nh4 {
    public static final b.c a;
    public static final b.C0106b b;

    public static abstract class b {

        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: com.zepto.nh4$b$b, reason: collision with other inner class name */
        public static final class C0106b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0106b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        a = new b.c();
        b = new b.C0106b();
    }
}
