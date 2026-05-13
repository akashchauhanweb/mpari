package com.zepto;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v70 {
    public static final byte[] a = f.a("0123456789abcdef");

    public static final byte[] a() {
        return a;
    }

    public static final String b(u70 readUtf8Line, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(readUtf8Line, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (readUtf8Line.x0(j2) == ((byte) 13)) {
                String strI0 = readUtf8Line.I0(j2);
                readUtf8Line.skip(2L);
                return strI0;
            }
        }
        String strI02 = readUtf8Line.I0(j);
        readUtf8Line.skip(1L);
        return strI02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(com.zepto.u70 r17, com.zepto.th4 r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "$this$selectPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.zepto.vu5 r0 = r0.c
            r1 = -2
            r3 = -1
            if (r0 == 0) goto La9
            byte[] r4 = r0.a
            int r5 = r0.b
            int r6 = r0.c
            int[] r2 = r18.r()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L22:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L2d
            r10 = r11
        L2d:
            if (r9 != 0) goto L30
            goto L5d
        L30:
            r11 = 0
            if (r12 >= 0) goto L7a
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L37:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L44
            return r10
        L44:
            if (r14 != r13) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = r7
        L49:
            if (r12 != r6) goto L6a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            com.zepto.vu5 r4 = r9.f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r4.b
            byte[] r8 = r4.a
            int r9 = r4.c
            if (r4 != r0) goto L64
            if (r5 != 0) goto L61
        L5d:
            if (r19 == 0) goto L60
            return r1
        L60:
            return r10
        L61:
            r4 = r8
            r8 = r11
            goto L6d
        L64:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L6d
        L6a:
            r8 = r9
            r9 = r6
            r6 = r12
        L6d:
            if (r5 == 0) goto L75
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto L9f
        L75:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L37
        L7a:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L82:
            if (r8 != r14) goto L85
            return r10
        L85:
            r15 = r2[r8]
            if (r5 != r15) goto La6
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto L9f
            com.zepto.vu5 r9 = r9.f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r4 = r9.b
            byte[] r6 = r9.a
            int r8 = r9.c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto L9f
            r9 = r11
        L9f:
            if (r5 < 0) goto La2
            return r5
        La2:
            int r8 = -r5
            r5 = r13
            goto L22
        La6:
            int r8 = r8 + 1
            goto L82
        La9:
            if (r19 == 0) goto Lac
            goto Lad
        Lac:
            r1 = r3
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.v70.c(com.zepto.u70, com.zepto.th4, boolean):int");
    }

    public static /* synthetic */ int d(u70 u70Var, th4 th4Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c(u70Var, th4Var, z);
    }
}
