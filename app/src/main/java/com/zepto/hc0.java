package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r8 r16
      0x0033: PHI (r8v39 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r8 r16
      0x0035: PHI (r8v3 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.zepto.nf3] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [com.zepto.h46] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.zepto.jx0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.zepto.kx0 r37, com.zepto.nf3 r38, int r39, int r40, com.zepto.ic0 r41) {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.hc0.a(com.zepto.kx0, com.zepto.nf3, int, int, com.zepto.ic0):void");
    }

    public static void b(kx0 kx0Var, nf3 nf3Var, ArrayList arrayList, int i) {
        int i2;
        ic0[] ic0VarArr;
        int i3;
        if (i == 0) {
            i2 = kx0Var.W0;
            ic0VarArr = kx0Var.Z0;
            i3 = 0;
        } else {
            i2 = kx0Var.X0;
            ic0VarArr = kx0Var.Y0;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ic0 ic0Var = ic0VarArr[i4];
            ic0Var.a();
            if (arrayList == null || arrayList.contains(ic0Var.a)) {
                a(kx0Var, nf3Var, i, i3, ic0Var);
            }
        }
    }
}
