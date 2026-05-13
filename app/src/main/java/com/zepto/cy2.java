package com.zepto;

import com.zepto.zx2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy2 extends zx2 implements Set {
    public transient ay2 e;

    public static class a extends zx2.a {
        public Object[] d;
        public int e;

        public a() {
            super(4);
        }

        public a d(Object obj) {
            ju4.j(obj);
            if (this.d != null && cy2.D(this.b) <= this.d.length) {
                f(obj);
                return this;
            }
            this.d = null;
            super.b(obj);
            return this;
        }

        public a e(Iterator it) {
            ju4.j(it);
            while (it.hasNext()) {
                d(it.next());
            }
            return this;
        }

        public final void f(Object obj) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int iHashCode = obj.hashCode();
            int iA = jl2.a(iHashCode);
            while (true) {
                int i = iA & length;
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.e += iHashCode;
                    super.b(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iA = i + 1;
                }
            }
        }

        public cy2 g() {
            cy2 cy2VarO;
            int i = this.b;
            if (i == 0) {
                return cy2.a0();
            }
            if (i == 1) {
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                return cy2.d0(obj);
            }
            if (this.d == null || cy2.D(i) != this.d.length) {
                cy2VarO = cy2.O(this.b, this.a);
                this.b = cy2VarO.size();
            } else {
                Object[] objArrCopyOf = cy2.e0(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                cy2VarO = new y75(objArrCopyOf, this.e, this.d, r5.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return cy2VarO;
        }
    }

    public static a B() {
        return new a();
    }

    public static int D(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            ju4.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static cy2 O(int i, Object... objArr) {
        if (i == 0) {
            return a0();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return d0(obj);
        }
        int iD = D(i);
        Object[] objArr2 = new Object[iD];
        int i2 = iD - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objA = re4.a(objArr[i5], i5);
            int iHashCode = objA.hashCode();
            int iA = jl2.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = objA;
                    objArr2[i6] = objA;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new c36(obj3);
        }
        if (D(i4) < iD / 2) {
            return O(i4, objArr);
        }
        if (e0(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new y75(objArr, i3, objArr2, i2, i4);
    }

    public static cy2 a0() {
        return y75.l;
    }

    public static cy2 d0(Object obj) {
        return new c36(obj);
    }

    public static boolean e0(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public ay2 P() {
        return ay2.u(toArray());
    }

    public boolean T() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cy2) && T() && ((cy2) obj).T() && hashCode() != obj.hashCode()) {
            return false;
        }
        return mz5.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mz5.b(this);
    }

    public ay2 z() {
        ay2 ay2Var = this.e;
        if (ay2Var != null) {
            return ay2Var;
        }
        ay2 ay2VarP = P();
        this.e = ay2VarP;
        return ay2VarP;
    }
}
