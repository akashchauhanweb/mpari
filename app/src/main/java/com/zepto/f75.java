package com.zepto;

import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public final class f75 {
    public final gi2 a;
    public final Vector b;

    public f75(gi2 gi2Var) {
        if (!gi2.e.equals(gi2Var)) {
            throw new IllegalArgumentException("Only QR Code is supported at this time");
        }
        this.a = gi2Var;
        Vector vector = new Vector();
        this.b = vector;
        vector.addElement(new hi2(gi2Var, new int[]{1}));
    }

    public final hi2 a(int i) {
        if (i >= this.b.size()) {
            Vector vector = this.b;
            hi2 hi2VarG = (hi2) vector.elementAt(vector.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                gi2 gi2Var = this.a;
                hi2VarG = hi2VarG.g(new hi2(gi2Var, new int[]{1, gi2Var.c(size - 1)}));
                this.b.addElement(hi2VarG);
            }
        }
        return (hi2) this.b.elementAt(i);
    }

    public void b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        hi2 hi2VarA = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrD = new hi2(this.a, iArr2).h(i, 1).b(hi2VarA)[1].d();
        int length2 = i - iArrD.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrD, 0, iArr, length + length2, iArrD.length);
    }
}
