package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class d06 {
    public static final a b = new a(null);
    public static volatile d06 c;
    public String a = "ShaePrefCrypto";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d06 a() {
            d06 d06Var = d06.c;
            if (d06Var == null) {
                synchronized (this) {
                    d06Var = d06.c;
                    if (d06Var == null) {
                        d06Var = new d06();
                        d06.c = d06Var;
                    }
                }
            }
            return d06Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0002, B:7:0x000b, B:10:0x0012, B:13:0x001e), top: B:18:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L1e
            int r0 = r2.length()     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L9
            goto L1e
        L9:
            if (r3 == 0) goto L1e
            int r0 = r3.length()     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L12
            goto L1e
        L12:
            com.zepto.ru5 r0 = new com.zepto.ru5     // Catch: java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r0.e(r2, r3)     // Catch: java.lang.Exception -> L1c
            goto L2f
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> L1c
            goto L2f
        L22:
            com.zepto.nn3 r3 = com.zepto.nn3.a
            java.lang.String r0 = r1.a
            java.lang.String r2 = r2.toString()
            r3.f(r0, r2)
            java.lang.String r2 = ""
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.d06.c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0002, B:7:0x000b, B:10:0x0012, B:13:0x001e), top: B:18:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L1e
            int r0 = r2.length()     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L9
            goto L1e
        L9:
            if (r3 == 0) goto L1e
            int r0 = r3.length()     // Catch: java.lang.Exception -> L1c
            if (r0 != 0) goto L12
            goto L1e
        L12:
            com.zepto.ru5 r0 = new com.zepto.ru5     // Catch: java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r0.f(r2, r3)     // Catch: java.lang.Exception -> L1c
            goto L2f
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> L1c
            goto L2f
        L22:
            com.zepto.nn3 r3 = com.zepto.nn3.a
            java.lang.String r0 = r1.a
            java.lang.String r2 = r2.toString()
            r3.f(r0, r2)
            java.lang.String r2 = ""
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.d06.d(java.lang.String, java.lang.String):java.lang.String");
    }
}
