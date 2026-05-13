package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq3 {
    public static int a(p80 p80Var) {
        return b(p80Var, true) + b(p80Var, false);
    }

    public static int b(p80 p80Var, boolean z) {
        int iD = z ? p80Var.d() : p80Var.f();
        int iF = z ? p80Var.f() : p80Var.d();
        byte[][] bArrC = p80Var.c();
        byte b = -1;
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < iF; i4++) {
                byte b2 = z ? bArrC[i2][i4] : bArrC[i4][i2];
                if (b2 == b) {
                    i3++;
                    if (i3 == 5) {
                        i += 3;
                    } else if (i3 > 5) {
                        i++;
                    }
                } else {
                    b = b2;
                    i3 = 1;
                }
            }
        }
        return i;
    }

    public static int c(p80 p80Var) {
        byte[][] bArrC = p80Var.c();
        int iF = p80Var.f();
        int iD = p80Var.d();
        int i = 0;
        for (int i2 = 0; i2 < iD - 1; i2++) {
            int i3 = 0;
            while (i3 < iF - 1) {
                byte[] bArr = bArrC[i2];
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = bArrC[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i += 3;
                    }
                }
                i3 = i4;
            }
        }
        return i;
    }

    public static int d(p80 p80Var) {
        int i;
        int i2;
        int i3;
        int i4;
        byte[][] bArrC = p80Var.c();
        int iF = p80Var.f();
        int iD = p80Var.d();
        int i5 = 0;
        for (int i6 = 0; i6 < iD; i6++) {
            for (int i7 = 0; i7 < iF; i7++) {
                int i8 = i7 + 6;
                if (i8 < iF) {
                    byte[] bArr = bArrC[i6];
                    if (bArr[i7] == 1 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 1 && bArr[i7 + 3] == 1 && bArr[i7 + 4] == 1 && bArr[i7 + 5] == 0 && bArr[i8] == 1 && (((i3 = i7 + 10) < iF && bArr[i7 + 7] == 0 && bArr[i7 + 8] == 0 && bArr[i7 + 9] == 0 && bArr[i3] == 0) || (i7 - 4 >= 0 && bArr[i7 - 1] == 0 && bArr[i7 - 2] == 0 && bArr[i7 - 3] == 0 && bArr[i4] == 0))) {
                        i5 += 40;
                    }
                }
                int i9 = i6 + 6;
                if (i9 < iD && bArrC[i6][i7] == 1 && bArrC[i6 + 1][i7] == 0 && bArrC[i6 + 2][i7] == 1 && bArrC[i6 + 3][i7] == 1 && bArrC[i6 + 4][i7] == 1 && bArrC[i6 + 5][i7] == 0 && bArrC[i9][i7] == 1 && (((i = i6 + 10) < iD && bArrC[i6 + 7][i7] == 0 && bArrC[i6 + 8][i7] == 0 && bArrC[i6 + 9][i7] == 0 && bArrC[i][i7] == 0) || (i6 - 4 >= 0 && bArrC[i6 - 1][i7] == 0 && bArrC[i6 - 2][i7] == 0 && bArrC[i6 - 3][i7] == 0 && bArrC[i2][i7] == 0))) {
                    i5 += 40;
                }
            }
        }
        return i5;
    }

    public static int e(p80 p80Var) {
        byte[][] bArrC = p80Var.c();
        int iF = p80Var.f();
        int iD = p80Var.d();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            for (int i3 = 0; i3 < iF; i3++) {
                if (bArrC[i2][i3] == 1) {
                    i++;
                }
            }
        }
        return (Math.abs((int) (((((double) i) / ((double) (p80Var.d() * p80Var.f()))) * 100.0d) - 50.0d)) / 5) * 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(int r1, int r2, int r3) {
        /*
            boolean r0 = com.zepto.dy4.j(r1)
            if (r0 == 0) goto L4f
            r0 = 1
            switch(r1) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3e;
                case 4: goto L39;
                case 5: goto L32;
                case 6: goto L2b;
                case 7: goto L21;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r0 = "Invalid mask pattern: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L21:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
        L28:
            int r1 = r1 + r2
        L29:
            r1 = r1 & r0
            goto L4a
        L2b:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L29
        L32:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L4a
        L39:
            int r1 = r3 >>> 1
            int r2 = r2 / 3
            goto L28
        L3e:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L4a
        L42:
            int r1 = r2 % 3
            goto L4a
        L45:
            r1 = r3 & 1
            goto L4a
        L48:
            int r3 = r3 + r2
            goto L45
        L4a:
            if (r1 != 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
        L4f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid mask pattern"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.aq3.f(int, int, int):boolean");
    }
}
