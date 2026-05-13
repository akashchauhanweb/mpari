package com.zepto;

import com.zepto.px;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class ov4 extends px {
    public int g;
    public h46[] h;
    public h46[] i;
    public int j;
    public b k;
    public j90 l;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h46 h46Var, h46 h46Var2) {
            return h46Var.f - h46Var2.f;
        }
    }

    public class b {
        public h46 a;
        public ov4 b;

        public b(ov4 ov4Var) {
            this.b = ov4Var;
        }

        public boolean a(h46 h46Var, float f) {
            boolean z = true;
            if (!this.a.c) {
                for (int i = 0; i < 9; i++) {
                    float f2 = h46Var.l[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.a.l[i] = f3;
                    } else {
                        this.a.l[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.a.l;
                float f4 = fArr[i2] + (h46Var.l[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.a.l[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                ov4.this.G(this.a);
            }
            return false;
        }

        public void b(h46 h46Var) {
            this.a = h46Var;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.l[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(h46 h46Var) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = h46Var.l[i];
                float f2 = this.a.l[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.a.l, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.a.l[i] + " ";
                }
            }
            return str + "] " + this.a;
        }
    }

    public ov4(j90 j90Var) {
        super(j90Var);
        this.g = 128;
        this.h = new h46[128];
        this.i = new h46[128];
        this.j = 0;
        this.k = new b(this);
        this.l = j90Var;
    }

    @Override // com.zepto.px
    public void B(nf3 nf3Var, px pxVar, boolean z) {
        h46 h46Var = pxVar.a;
        if (h46Var == null) {
            return;
        }
        px.a aVar = pxVar.e;
        int iE = aVar.e();
        for (int i = 0; i < iE; i++) {
            h46 h46VarF = aVar.f(i);
            float fA = aVar.a(i);
            this.k.b(h46VarF);
            if (this.k.a(h46Var, fA)) {
                F(h46VarF);
            }
            this.b += pxVar.b * fA;
        }
        G(h46Var);
    }

    public final void F(h46 h46Var) {
        int i;
        int i2 = this.j + 1;
        h46[] h46VarArr = this.h;
        if (i2 > h46VarArr.length) {
            h46[] h46VarArr2 = (h46[]) Arrays.copyOf(h46VarArr, h46VarArr.length * 2);
            this.h = h46VarArr2;
            this.i = (h46[]) Arrays.copyOf(h46VarArr2, h46VarArr2.length * 2);
        }
        h46[] h46VarArr3 = this.h;
        int i3 = this.j;
        h46VarArr3[i3] = h46Var;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && h46VarArr3[i3].f > h46Var.f) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        h46Var.c = true;
        h46Var.a(this);
    }

    public final void G(h46 h46Var) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == h46Var) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        h46Var.c = false;
                        return;
                    } else {
                        h46[] h46VarArr = this.h;
                        int i3 = i + 1;
                        h46VarArr[i] = h46VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.zepto.px, com.zepto.nf3.a
    public void a(h46 h46Var) {
        this.k.b(h46Var);
        this.k.e();
        h46Var.l[h46Var.h] = 1.0f;
        F(h46Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // com.zepto.px, com.zepto.nf3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.h46 b(com.zepto.nf3 r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.j
            if (r0 >= r2) goto L32
            com.zepto.h46[] r2 = r4.h
            r2 = r2[r0]
            int r3 = r2.f
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            com.zepto.ov4$b r3 = r4.k
            r3.b(r2)
            if (r1 != r5) goto L22
            com.zepto.ov4$b r2 = r4.k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            com.zepto.ov4$b r2 = r4.k
            com.zepto.h46[] r3 = r4.h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            com.zepto.h46[] r5 = r4.h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ov4.b(com.zepto.nf3, boolean[]):com.zepto.h46");
    }

    @Override // com.zepto.px, com.zepto.nf3.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // com.zepto.px, com.zepto.nf3.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // com.zepto.px
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
