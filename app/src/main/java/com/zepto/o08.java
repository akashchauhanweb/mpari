package com.zepto;

import com.zepto.b08;
import com.zepto.hl2;
import com.zepto.la3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o08 {
    public static n08 a(fu7 fu7Var, iu7 iu7Var, la3 la3Var) {
        double d;
        if (iu7Var == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (la3Var == null) {
            throw new NullPointerException("address == null");
        }
        int iA = fu7Var.d().a();
        byte[][] bArrA = iu7Var.a();
        n08[] n08VarArr = new n08[bArrA.length];
        for (int i = 0; i < bArrA.length; i++) {
            n08VarArr[i] = new n08(0, bArrA[i]);
        }
        b08.a aVarF = ((la3.b) ((la3.b) new la3.b().g(la3Var.b())).h(la3Var.c())).n(la3Var.e()).o(0).p(la3Var.g()).f(la3Var.a());
        while (true) {
            la3 la3Var2 = (la3) ((la3.b) aVarF).l();
            if (iA <= 1) {
                return n08VarArr[0];
            }
            int i2 = 0;
            while (true) {
                d = iA / 2;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                la3Var2 = (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var2.b())).h(la3Var2.c())).n(la3Var2.e()).o(la3Var2.f()).p(i2).f(la3Var2.a())).l();
                int i3 = i2 * 2;
                n08VarArr[i2] = b(fu7Var, n08VarArr[i3], n08VarArr[i3 + 1], la3Var2);
                i2++;
            }
            if (iA % 2 == 1) {
                n08VarArr[(int) Math.floor(d)] = n08VarArr[iA - 1];
            }
            iA = (int) Math.ceil(((double) iA) / 2.0d);
            aVarF = ((la3.b) ((la3.b) new la3.b().g(la3Var2.b())).h(la3Var2.c())).n(la3Var2.e()).o(la3Var2.f() + 1).p(la3Var2.g()).f(la3Var2.a());
        }
    }

    public static n08 b(fu7 fu7Var, n08 n08Var, n08 n08Var2, b08 b08Var) {
        if (n08Var == null) {
            throw new NullPointerException("left == null");
        }
        if (n08Var2 == null) {
            throw new NullPointerException("right == null");
        }
        if (n08Var.a() != n08Var2.a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (b08Var == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrF = fu7Var.f();
        if (b08Var instanceof la3) {
            la3 la3Var = (la3) b08Var;
            b08Var = (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var.b())).h(la3Var.c())).n(la3Var.e()).o(la3Var.f()).p(la3Var.g()).f(0)).l();
        } else if (b08Var instanceof hl2) {
            hl2 hl2Var = (hl2) b08Var;
            b08Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var.b())).h(hl2Var.c())).m(hl2Var.e()).n(hl2Var.f()).f(0)).k();
        }
        byte[] bArrC = fu7Var.c().c(bArrF, b08Var.d());
        if (b08Var instanceof la3) {
            la3 la3Var2 = (la3) b08Var;
            b08Var = (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var2.b())).h(la3Var2.c())).n(la3Var2.e()).o(la3Var2.f()).p(la3Var2.g()).f(1)).l();
        } else if (b08Var instanceof hl2) {
            hl2 hl2Var2 = (hl2) b08Var;
            b08Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var2.b())).h(hl2Var2.c())).m(hl2Var2.e()).n(hl2Var2.f()).f(1)).k();
        }
        byte[] bArrC2 = fu7Var.c().c(bArrF, b08Var.d());
        if (b08Var instanceof la3) {
            la3 la3Var3 = (la3) b08Var;
            b08Var = (la3) ((la3.b) ((la3.b) ((la3.b) new la3.b().g(la3Var3.b())).h(la3Var3.c())).n(la3Var3.e()).o(la3Var3.f()).p(la3Var3.g()).f(2)).l();
        } else if (b08Var instanceof hl2) {
            hl2 hl2Var3 = (hl2) b08Var;
            b08Var = (hl2) ((hl2.b) ((hl2.b) ((hl2.b) new hl2.b().g(hl2Var3.b())).h(hl2Var3.c())).m(hl2Var3.e()).n(hl2Var3.f()).f(2)).k();
        }
        byte[] bArrC3 = fu7Var.c().c(bArrF, b08Var.d());
        int iC = fu7Var.d().c();
        byte[] bArr = new byte[iC * 2];
        for (int i = 0; i < iC; i++) {
            bArr[i] = (byte) (n08Var.b()[i] ^ bArrC2[i]);
        }
        for (int i2 = 0; i2 < iC; i2++) {
            bArr[i2 + iC] = (byte) (n08Var2.b()[i2] ^ bArrC3[i2]);
        }
        return new n08(n08Var.a(), fu7Var.c().b(bArrC, bArr));
    }
}
