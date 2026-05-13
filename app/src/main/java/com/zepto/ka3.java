package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ka3 {
    public static byte[] a(ca3 ca3Var, byte[] bArr, int i, byte[] bArr2) {
        wj1 wj1VarA = ak1.a(ca3Var.b());
        byte[] bArrB = vu0.f().d(bArr).i(i).h(-32640).g(0, 22).b();
        wj1VarA.d(bArrB, 0, bArrB.length);
        wj1 wj1VarA2 = ak1.a(ca3Var.b());
        byte[] bArrB2 = vu0.f().d(bArr).i(i).g(0, wj1VarA2.c() + 23).b();
        uu5 uu5Var = new uu5(bArr, bArr2, ak1.a(ca3Var.b()));
        uu5Var.d(i);
        uu5Var.c(0);
        int iD = ca3Var.d();
        int iC = ca3Var.c();
        int iG = (1 << ca3Var.g()) - 1;
        int i2 = 0;
        while (i2 < iD) {
            uu5Var.a(bArrB2, i2 < iD + (-1), 23);
            vk4.m((short) i2, bArrB2, 20);
            for (int i3 = 0; i3 < iG; i3++) {
                bArrB2[22] = (byte) i3;
                wj1VarA2.d(bArrB2, 0, bArrB2.length);
                wj1VarA2.a(bArrB2, 23);
            }
            wj1VarA.d(bArrB2, 23, iC);
            i2++;
        }
        byte[] bArr3 = new byte[wj1VarA.c()];
        wj1VarA.a(bArr3, 0);
        return bArr3;
    }
}
