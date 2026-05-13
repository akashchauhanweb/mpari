package com.zepto;

import com.zepto.t80;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yr2 {
    public static final t80 a;
    public static final t80 b;

    static {
        t80.a aVar = t80.h;
        a = aVar.d("\"\\");
        b = aVar.d("\t ,=");
    }

    public static final List a(pl2 parseChallenges, String headerName) {
        Intrinsics.checkNotNullParameter(parseChallenges, "$this$parseChallenges");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(headerName, parseChallenges.m(i), true)) {
                try {
                    c(new u70().l0(parseChallenges.u(i)), arrayList);
                } catch (EOFException e) {
                    is4.c.g().k("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(ld5 promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.areEqual(promisesBody.z0().h(), "HEAD")) {
            return false;
        }
        int iN = promisesBody.n();
        return (((iN >= 100 && iN < 200) || iN == 204 || iN == 304) && et6.s(promisesBody) == -1 && !StringsKt__StringsJVMKt.equals("chunked", ld5.P(promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.zepto.u70 r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.I()
            if (r7 != 0) goto L1f
            return
        L1f:
            com.zepto.xc0 r7 = new com.zepto.xc0
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = com.zepto.et6.I(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.I()
            if (r2 == 0) goto L68
        L41:
            com.zepto.xc0 r2 = new com.zepto.xc0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.StringsKt.repeat(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = com.zepto.et6.I(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = com.zepto.et6.I(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            com.zepto.xc0 r4 = new com.zepto.xc0
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = g(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = d(r7)
            goto Lad
        La9:
            java.lang.String r6 = e(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.I()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.yr2.c(com.zepto.u70, java.util.List):void");
    }

    public static final String d(u70 u70Var) throws EOFException {
        byte b2 = (byte) 34;
        if (!(u70Var.readByte() == b2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        u70 u70Var2 = new u70();
        while (true) {
            long jZ0 = u70Var.z0(a);
            if (jZ0 == -1) {
                return null;
            }
            if (u70Var.x0(jZ0) == b2) {
                u70Var2.Q(u70Var, jZ0);
                u70Var.readByte();
                return u70Var2.H0();
            }
            if (u70Var.L0() == jZ0 + 1) {
                return null;
            }
            u70Var2.Q(u70Var, jZ0);
            u70Var.readByte();
            u70Var2.Q(u70Var, 1L);
        }
    }

    public static final String e(u70 u70Var) {
        long jZ0 = u70Var.z0(b);
        if (jZ0 == -1) {
            jZ0 = u70Var.L0();
        }
        if (jZ0 != 0) {
            return u70Var.I0(jZ0);
        }
        return null;
    }

    public static final void f(lz0 receiveHeaders, ds2 url, pl2 headers) {
        Intrinsics.checkNotNullParameter(receiveHeaders, "$this$receiveHeaders");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (receiveHeaders == lz0.a) {
            return;
        }
        List listE = kz0.n.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        receiveHeaders.a(url, listE);
    }

    public static final boolean g(u70 u70Var) throws EOFException {
        boolean z = false;
        while (!u70Var.I()) {
            byte bX0 = u70Var.x0(0L);
            if (bX0 == 9 || bX0 == 32) {
                u70Var.readByte();
            } else {
                if (bX0 != 44) {
                    break;
                }
                u70Var.readByte();
                z = true;
            }
        }
        return z;
    }

    public static final boolean h(u70 u70Var, byte b2) {
        return !u70Var.I() && u70Var.x0(0L) == b2;
    }
}
