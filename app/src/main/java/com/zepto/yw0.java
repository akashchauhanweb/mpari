package com.zepto;

import com.zepto.h46;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class yw0 {
    public int b;
    public boolean c;
    public final jx0 d;
    public final b e;
    public yw0 f;
    public h46 i;
    public HashSet a = null;
    public int g = 0;
    public int h = IntCompanionObject.MIN_VALUE;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public yw0(jx0 jx0Var, b bVar) {
        this.d = jx0Var;
        this.e = bVar;
    }

    public boolean a(yw0 yw0Var, int i) {
        return b(yw0Var, i, IntCompanionObject.MIN_VALUE, false);
    }

    public boolean b(yw0 yw0Var, int i, int i2, boolean z) {
        if (yw0Var == null) {
            q();
            return true;
        }
        if (!z && !p(yw0Var)) {
            return false;
        }
        this.f = yw0Var;
        if (yw0Var.a == null) {
            yw0Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public void c(int i, ArrayList arrayList, wu7 wu7Var) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                nk2.a(((yw0) it.next()).d, i, arrayList, wu7Var);
            }
        }
    }

    public HashSet d() {
        return this.a;
    }

    public int e() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public int f() {
        yw0 yw0Var;
        if (this.d.V() == 8) {
            return 0;
        }
        return (this.h == Integer.MIN_VALUE || (yw0Var = this.f) == null || yw0Var.d.V() != 8) ? this.g : this.h;
    }

    public final yw0 g() {
        switch (a.a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.Q;
            case 3:
                return this.d.O;
            case 4:
                return this.d.R;
            case 5:
                return this.d.P;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public jx0 h() {
        return this.d;
    }

    public h46 i() {
        return this.i;
    }

    public yw0 j() {
        return this.f;
    }

    public b k() {
        return this.e;
    }

    public boolean l() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((yw0) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f != null;
    }

    public boolean p(yw0 yw0Var) {
        if (yw0Var == null) {
            return false;
        }
        b bVarK = yw0Var.k();
        b bVar = this.e;
        if (bVarK == bVar) {
            return bVar != b.BASELINE || (yw0Var.h().Z() && h().Z());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (bVarK == b.BASELINE || bVarK == b.CENTER_X || bVarK == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarK == b.LEFT || bVarK == b.RIGHT;
                if (yw0Var.h() instanceof sk2) {
                    return z || bVarK == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarK == b.TOP || bVarK == b.BOTTOM;
                if (yw0Var.h() instanceof sk2) {
                    return z2 || bVarK == b.CENTER_Y;
                }
                return z2;
            case 6:
                return (bVarK == b.LEFT || bVarK == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        yw0 yw0Var = this.f;
        if (yw0Var != null && (hashSet = yw0Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = IntCompanionObject.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void r() {
        this.c = false;
        this.b = 0;
    }

    public void s(j90 j90Var) {
        h46 h46Var = this.i;
        if (h46Var == null) {
            this.i = new h46(h46.a.UNRESTRICTED, null);
        } else {
            h46Var.e();
        }
    }

    public void t(int i) {
        this.b = i;
        this.c = true;
    }

    public String toString() {
        return this.d.t() + ":" + this.e.toString();
    }

    public void u(int i) {
        if (o()) {
            this.h = i;
        }
    }
}
