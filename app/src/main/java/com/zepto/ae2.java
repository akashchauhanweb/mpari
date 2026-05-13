package com.zepto;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public class ae2 {
    public gp4 a;
    public lp4 b;
    public s40 c;
    public go6 d;
    public d90 e;
    public byte[] f;
    public HashMap g;
    public k03 h;
    public int i;
    public boolean j;
    public boolean k = true;

    public ae2(lp4 lp4Var, gp4 gp4Var, s40 s40Var) {
        this.b = lp4Var;
        this.a = gp4Var;
        this.c = s40Var;
        int iM = s40Var.m();
        this.i = iM;
        if (iM == 0 || iM == 1) {
            this.f = new byte[256];
            return;
        }
        if (iM == 2) {
            this.h = new k03();
            this.e = (d90) s40Var;
        } else {
            if (iM != 3) {
                return;
            }
            this.g = new HashMap();
            this.d = (go6) s40Var;
            this.j = s40Var.z();
        }
    }

    public byte[] a(String str) {
        int i;
        int iCharAt;
        int i2 = this.i;
        if (i2 == 0 || i2 == 1) {
            byte[] bArrB = this.c.b(str);
            for (byte b : bArrB) {
                this.f[b & UByte.MAX_VALUE] = 1;
            }
            return bArrB;
        }
        if (i2 == 2) {
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                this.h.d(this.e.H(str.charAt(i3)), 0);
            }
            return this.c.b(str);
        }
        if (i2 != 3) {
            if (i2 == 4 || i2 == 5) {
                return this.c.b(str);
            }
            return null;
        }
        try {
            int length2 = str.length();
            char[] cArr = new char[length2];
            if (this.j) {
                byte[] bArrC = xo4.c(str, "symboltt");
                int length3 = bArrC.length;
                i = 0;
                for (int i4 = 0; i4 < length3; i4++) {
                    int[] iArrN = this.d.N(bArrC[i4] & UByte.MAX_VALUE);
                    if (iArrN != null) {
                        this.g.put(Integer.valueOf(iArrN[0]), new int[]{iArrN[0], iArrN[1], this.d.s(bArrC[i4] & UByte.MAX_VALUE)});
                        cArr[i] = (char) iArrN[0];
                        i++;
                    }
                }
            } else {
                int i5 = 0;
                i = 0;
                while (i5 < length2) {
                    if (jt6.g(str, i5)) {
                        iCharAt = jt6.c(str, i5);
                        i5++;
                    } else {
                        iCharAt = str.charAt(i5);
                    }
                    int[] iArrN2 = this.d.N(iCharAt);
                    if (iArrN2 != null) {
                        int i6 = iArrN2[0];
                        Integer numValueOf = Integer.valueOf(i6);
                        if (!this.g.containsKey(numValueOf)) {
                            this.g.put(numValueOf, new int[]{i6, iArrN2[1], iCharAt});
                        }
                        cArr[i] = (char) i6;
                        i++;
                    }
                    i5++;
                }
            }
            return new String(cArr, 0, i).getBytes("UnicodeBigUnmarked");
        } catch (UnsupportedEncodingException e) {
            throw new p52(e);
        }
    }

    public lp4 b() {
        return this.b;
    }

    public gp4 c() {
        return this.a;
    }

    public void d(boolean z) {
        this.k = z;
    }

    public void e(pq4 pq4Var) {
        try {
            int i = this.i;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    this.c.B(pq4Var, this.a, new Object[]{this.h});
                    return;
                } else if (i == 3) {
                    this.c.B(pq4Var, this.a, new Object[]{this.g, Boolean.valueOf(this.k)});
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    this.c.B(pq4Var, this.a, null);
                    return;
                }
            }
            int i2 = 0;
            while (i2 < 256 && this.f[i2] == 0) {
                i2++;
            }
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            int i4 = 255;
            while (i4 >= i2 && this.f[i4] == 0) {
                i4--;
            }
            if (i2 > 255) {
                i2 = 255;
            } else {
                i3 = i4;
            }
            this.c.B(pq4Var, this.a, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), this.f, Boolean.valueOf(this.k)});
        } catch (Exception e) {
            throw new p52(e);
        }
    }
}
