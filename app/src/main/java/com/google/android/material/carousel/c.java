package com.google.android.material.carousel;

import com.google.android.material.carousel.b;
import com.zepto.er3;
import com.zepto.kb0;
import com.zepto.rp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public final b a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public c(b bVar, List list, List list2) {
        this.a = bVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        float f = ((b) list.get(list.size() - 1)).c().a - bVar.c().a;
        this.f = f;
        float f2 = bVar.j().a - ((b) list2.get(list2.size() - 1)).j().a;
        this.g = f2;
        this.d = m(f, list, true);
        this.e = m(f2, list2, false);
    }

    public static int b(b bVar, float f) {
        for (int i = bVar.i(); i < bVar.g().size(); i++) {
            if (f == ((b.c) bVar.g().get(i)).c) {
                return i;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i = 0; i < bVar.g().size(); i++) {
            if (!((b.c) bVar.g().get(i)).e) {
                return i;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f) {
        for (int iB = bVar.b() - 1; iB >= 0; iB--) {
            if (f == ((b.c) bVar.g().get(iB)).c) {
                return iB;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!((b.c) bVar.g().get(size)).e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(kb0 kb0Var, b bVar) {
        return new c(bVar, p(kb0Var, bVar), n(kb0Var, bVar));
    }

    public static float[] m(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            b bVar = (b) list.get(i2);
            b bVar2 = (b) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? bVar2.c().a - bVar.c().a : bVar.j().a - bVar2.j().a) / f);
            i++;
        }
        return fArr;
    }

    public static List n(kb0 kb0Var, b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        int iE = e(bVar);
        if (!r(kb0Var, bVar) && iE != -1) {
            int i = iE - bVar.i();
            float fA = kb0Var.f() ? kb0Var.a() : kb0Var.c();
            float f = bVar.c().b - (bVar.c().d / 2.0f);
            float f2 = 0.0f;
            if (i <= 0 && bVar.h().f > 0.0f) {
                arrayList.add(u(bVar, f - bVar.h().f, fA));
                return arrayList;
            }
            int i2 = 0;
            while (i2 < i) {
                b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                int i3 = iE - i2;
                float f3 = f2 + ((b.c) bVar.g().get(i3)).f;
                int i4 = i3 + 1;
                arrayList.add(t(bVar2, iE, i4 < bVar.g().size() ? d(bVar2, ((b.c) bVar.g().get(i4)).c) + 1 : 0, f - f3, bVar.b() + i2 + 1, bVar.i() + i2 + 1, fA));
                i2++;
                f2 = f3;
            }
        }
        return arrayList;
    }

    public static float[] o(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{rp.b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List p(kb0 kb0Var, b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        int iC = c(bVar);
        if (!q(bVar) && iC != -1) {
            int iB = bVar.b() - iC;
            float fA = kb0Var.f() ? kb0Var.a() : kb0Var.c();
            float f = bVar.c().b - (bVar.c().d / 2.0f);
            float f2 = 0.0f;
            if (iB <= 0 && bVar.a().f > 0.0f) {
                arrayList.add(u(bVar, f + bVar.a().f, fA));
                return arrayList;
            }
            int i = 0;
            while (i < iB) {
                b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                int i2 = iC + i;
                int size = bVar.g().size() - 1;
                float f3 = f2 + ((b.c) bVar.g().get(i2)).f;
                arrayList.add(t(bVar2, iC, i2 - 1 >= 0 ? b(bVar2, ((b.c) bVar.g().get(r3)).c) - 1 : size, f + f3, (bVar.b() - i) - 1, (bVar.i() - i) - 1, fA));
                i++;
                f2 = f3;
            }
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().b - (bVar.a().d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(kb0 kb0Var, b bVar) {
        int iC = kb0Var.c();
        if (kb0Var.f()) {
            iC = kb0Var.a();
        }
        return bVar.h().b + (bVar.h().d / 2.0f) <= ((float) iC) && bVar.h() == bVar.k();
    }

    public static b s(List list, float f, float[] fArr) {
        float[] fArrO = o(list, f, fArr);
        return b.l((b) list.get((int) fArrO[1]), (b) list.get((int) fArrO[2]), fArrO[0]);
    }

    public static b t(b bVar, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i2, (b.c) arrayList.remove(i));
        b.C0035b c0035b = new b.C0035b(bVar.f(), f2);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i5);
            float f3 = cVar.d;
            c0035b.e(f + (f3 / 2.0f), cVar.c, f3, i5 >= i3 && i5 <= i4, cVar.e, cVar.f);
            f += cVar.d;
            i5++;
        }
        return c0035b.h();
    }

    public static b u(b bVar, float f, float f2) {
        return t(bVar, 0, 0, f, bVar.b(), bVar.i(), f2);
    }

    public final b a(List list, float f, float[] fArr) {
        float[] fArrO = o(list, f, fArr);
        return fArrO[0] > 0.5f ? (b) list.get((int) fArrO[2]) : (b) list.get((int) fArrO[1]);
    }

    public b g() {
        return this.a;
    }

    public b h() {
        return (b) this.c.get(r0.size() - 1);
    }

    public Map i(int i, int i2, int i3, boolean z) {
        float f = this.a.f();
        HashMap map = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * f * (z ? -1 : 1) > i3 - this.g || i4 >= i - this.c.size()) {
                Integer numValueOf = Integer.valueOf(i6);
                List list = this.c;
                map.put(numValueOf, (b) list.get(er3.b(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * f * (z ? -1 : 1) < i2 + this.f || i8 < this.b.size()) {
                Integer numValueOf2 = Integer.valueOf(i9);
                List list2 = this.b;
                map.put(numValueOf2, (b) list2.get(er3.b(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return map;
    }

    public b j(float f, float f2, float f3) {
        return k(f, f2, f3, false);
    }

    public b k(float f, float f2, float f3, boolean z) {
        float fB;
        List list;
        float[] fArr;
        float f4 = this.f + f2;
        float f5 = f3 - this.g;
        if (f < f4) {
            fB = rp.b(1.0f, 0.0f, f2, f4, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f5) {
                return this.a;
            }
            fB = rp.b(0.0f, 1.0f, f5, f3, f);
            list = this.c;
            fArr = this.e;
        }
        return z ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    public b l() {
        return (b) this.b.get(r0.size() - 1);
    }
}
