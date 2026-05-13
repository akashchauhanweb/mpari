package com.zepto;

import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class k03 implements Cloneable {
    public transient a[] c;
    public transient int e;
    public int f;
    public float g;

    public static class a {
        public int a;
        public int b;
        public int c;
        public a d;

        public a(int i, int i2, int i3, a aVar) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = aVar;
        }

        public Object clone() {
            int i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            a aVar = this.d;
            return new a(i, i2, i3, aVar != null ? (a) aVar.clone() : null);
        }
    }

    public k03() {
        this(150, 0.75f);
    }

    public boolean a(int i) {
        a[] aVarArr = this.c;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i && aVar.b == i) {
                return true;
            }
        }
        return false;
    }

    public int b(int i) {
        a[] aVarArr = this.c;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i && aVar.b == i) {
                return aVar.c;
            }
        }
        return 0;
    }

    public int[] c() {
        int i;
        int[] iArr = new int[this.e];
        int length = this.c.length;
        int i2 = 0;
        a aVar = null;
        while (true) {
            if (aVar == null) {
                while (true) {
                    i = length - 1;
                    if (length <= 0 || (aVar = this.c[i]) != null) {
                        break;
                    }
                    length = i;
                }
                length = i;
            }
            if (aVar == null) {
                return iArr;
            }
            a aVar2 = aVar.d;
            iArr[i2] = aVar.b;
            aVar = aVar2;
            i2++;
        }
    }

    public Object clone() {
        try {
            k03 k03Var = (k03) super.clone();
            k03Var.c = new a[this.c.length];
            int length = this.c.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return k03Var;
                }
                a[] aVarArr = k03Var.c;
                a aVar = this.c[i];
                aVarArr[i] = aVar != null ? (a) aVar.clone() : null;
                length = i;
            }
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int d(int i, int i2) {
        a[] aVarArr = this.c;
        int i3 = Integer.MAX_VALUE & i;
        int length = i3 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i && aVar.b == i) {
                int i4 = aVar.c;
                aVar.c = i2;
                return i4;
            }
        }
        if (this.e >= this.f) {
            e();
            aVarArr = this.c;
            length = i3 % aVarArr.length;
        }
        aVarArr[length] = new a(i, i, i2, aVarArr[length]);
        this.e++;
        return 0;
    }

    public void e() {
        a[] aVarArr = this.c;
        int length = aVarArr.length;
        int i = (length * 2) + 1;
        a[] aVarArr2 = new a[i];
        this.f = (int) (i * this.g);
        this.c = aVarArr2;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            a aVar = aVarArr[i2];
            while (aVar != null) {
                a aVar2 = aVar.d;
                int i3 = (aVar.a & IntCompanionObject.MAX_VALUE) % i;
                aVar.d = aVarArr2[i3];
                aVarArr2[i3] = aVar;
                aVar = aVar2;
            }
            length = i2;
        }
    }

    public int[] f() {
        int[] iArrC = c();
        Arrays.sort(iArrC);
        return iArrC;
    }

    public k03(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException(dt3.a("illegal.capacity.1", i));
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException(dt3.b("illegal.load.1", String.valueOf(f)));
        }
        i = i == 0 ? 1 : i;
        this.g = f;
        this.c = new a[i];
        this.f = (int) (i * f);
    }
}
