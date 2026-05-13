package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class fn6 implements Cloneable {
    public static final int[] I = {2, 1, 3, 4};
    public static final dm4 J = new a();
    public static ThreadLocal K = new ThreadLocal();
    public e F;
    public nx G;
    public ArrayList w;
    public ArrayList x;
    public String c = getClass().getName();
    public long e = -1;
    public long f = -1;
    public TimeInterpolator g = null;
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public ArrayList j = null;
    public ArrayList k = null;
    public ArrayList l = null;
    public ArrayList m = null;
    public ArrayList n = null;
    public ArrayList o = null;
    public ArrayList p = null;
    public ArrayList q = null;
    public ArrayList r = null;
    public nn6 s = new nn6();
    public nn6 t = new nn6();
    public jn6 u = null;
    public int[] v = I;
    public boolean y = false;
    public ArrayList z = new ArrayList();
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public ArrayList D = null;
    public ArrayList E = new ArrayList();
    public dm4 H = J;

    public class a extends dm4 {
        @Override // com.zepto.dm4
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ nx a;

        public b(nx nxVar) {
            this.a = nxVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            fn6.this.z.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            fn6.this.z.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fn6.this.r();
            animator.removeListener(this);
        }
    }

    public static class d {
        public View a;
        public String b;
        public mn6 c;
        public cv7 d;
        public fn6 e;

        public d(View view, String str, fn6 fn6Var, cv7 cv7Var, mn6 mn6Var) {
            this.a = view;
            this.b = str;
            this.c = mn6Var;
            this.d = cv7Var;
            this.e = fn6Var;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(fn6 fn6Var);

        void b(fn6 fn6Var);

        void c(fn6 fn6Var);

        void d(fn6 fn6Var);

        void e(fn6 fn6Var);
    }

    public static nx A() {
        nx nxVar = (nx) K.get();
        if (nxVar != null) {
            return nxVar;
        }
        nx nxVar2 = new nx();
        K.set(nxVar2);
        return nxVar2;
    }

    public static boolean M(mn6 mn6Var, mn6 mn6Var2, String str) {
        Object obj = mn6Var.a.get(str);
        Object obj2 = mn6Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(nn6 nn6Var, View view, mn6 mn6Var) {
        nn6Var.a.put(view, mn6Var);
        int id = view.getId();
        if (id >= 0) {
            if (nn6Var.b.indexOfKey(id) >= 0) {
                nn6Var.b.put(id, null);
            } else {
                nn6Var.b.put(id, view);
            }
        }
        String strK = dq7.K(view);
        if (strK != null) {
            if (nn6Var.d.containsKey(strK)) {
                nn6Var.d.put(strK, null);
            } else {
                nn6Var.d.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (nn6Var.c.f(itemIdAtPosition) < 0) {
                    dq7.A0(view, true);
                    nn6Var.c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) nn6Var.c.d(itemIdAtPosition);
                if (view2 != null) {
                    dq7.A0(view2, false);
                    nn6Var.c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public long C() {
        return this.e;
    }

    public List E() {
        return this.h;
    }

    public List F() {
        return this.j;
    }

    public List G() {
        return this.k;
    }

    public List H() {
        return this.i;
    }

    public String[] I() {
        return null;
    }

    public mn6 J(View view, boolean z) {
        jn6 jn6Var = this.u;
        if (jn6Var != null) {
            return jn6Var.J(view, z);
        }
        return (mn6) (z ? this.s : this.t).a.get(view);
    }

    public boolean K(mn6 mn6Var, mn6 mn6Var2) {
        if (mn6Var == null || mn6Var2 == null) {
            return false;
        }
        String[] strArrI = I();
        if (strArrI == null) {
            Iterator it = mn6Var.a.keySet().iterator();
            while (it.hasNext()) {
                if (M(mn6Var, mn6Var2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrI) {
            if (!M(mn6Var, mn6Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean L(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.n.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.o != null && dq7.K(view) != null && this.o.contains(dq7.K(view))) {
            return false;
        }
        if ((this.h.size() == 0 && this.i.size() == 0 && (((arrayList = this.k) == null || arrayList.isEmpty()) && ((arrayList2 = this.j) == null || arrayList2.isEmpty()))) || this.h.contains(Integer.valueOf(id)) || this.i.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.j;
        if (arrayList6 != null && arrayList6.contains(dq7.K(view))) {
            return true;
        }
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (((Class) this.k.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(nx nxVar, nx nxVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && L(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && L(view)) {
                mn6 mn6Var = (mn6) nxVar.get(view2);
                mn6 mn6Var2 = (mn6) nxVar2.get(view);
                if (mn6Var != null && mn6Var2 != null) {
                    this.w.add(mn6Var);
                    this.x.add(mn6Var2);
                    nxVar.remove(view2);
                    nxVar2.remove(view);
                }
            }
        }
    }

    public final void O(nx nxVar, nx nxVar2) {
        mn6 mn6Var;
        for (int size = nxVar.size() - 1; size >= 0; size--) {
            View view = (View) nxVar.i(size);
            if (view != null && L(view) && (mn6Var = (mn6) nxVar2.remove(view)) != null && L(mn6Var.b)) {
                this.w.add((mn6) nxVar.k(size));
                this.x.add(mn6Var);
            }
        }
    }

    public final void Q(nx nxVar, nx nxVar2, io3 io3Var, io3 io3Var2) {
        View view;
        int iL = io3Var.l();
        for (int i = 0; i < iL; i++) {
            View view2 = (View) io3Var.o(i);
            if (view2 != null && L(view2) && (view = (View) io3Var2.d(io3Var.g(i))) != null && L(view)) {
                mn6 mn6Var = (mn6) nxVar.get(view2);
                mn6 mn6Var2 = (mn6) nxVar2.get(view);
                if (mn6Var != null && mn6Var2 != null) {
                    this.w.add(mn6Var);
                    this.x.add(mn6Var2);
                    nxVar.remove(view2);
                    nxVar2.remove(view);
                }
            }
        }
    }

    public final void R(nx nxVar, nx nxVar2, nx nxVar3, nx nxVar4) {
        View view;
        int size = nxVar3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) nxVar3.m(i);
            if (view2 != null && L(view2) && (view = (View) nxVar4.get(nxVar3.i(i))) != null && L(view)) {
                mn6 mn6Var = (mn6) nxVar.get(view2);
                mn6 mn6Var2 = (mn6) nxVar2.get(view);
                if (mn6Var != null && mn6Var2 != null) {
                    this.w.add(mn6Var);
                    this.x.add(mn6Var2);
                    nxVar.remove(view2);
                    nxVar2.remove(view);
                }
            }
        }
    }

    public final void S(nn6 nn6Var, nn6 nn6Var2) {
        nx nxVar = new nx(nn6Var.a);
        nx nxVar2 = new nx(nn6Var2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.v;
            if (i >= iArr.length) {
                c(nxVar, nxVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                O(nxVar, nxVar2);
            } else if (i2 == 2) {
                R(nxVar, nxVar2, nn6Var.d, nn6Var2.d);
            } else if (i2 == 3) {
                N(nxVar, nxVar2, nn6Var.b, nn6Var2.b);
            } else if (i2 == 4) {
                Q(nxVar, nxVar2, nn6Var.c, nn6Var2.c);
            }
            i++;
        }
    }

    public void T(View view) {
        if (this.C) {
            return;
        }
        for (int size = this.z.size() - 1; size >= 0; size--) {
            up.b((Animator) this.z.get(size));
        }
        ArrayList arrayList = this.D;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.D.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((f) arrayList2.get(i)).d(this);
            }
        }
        this.B = true;
    }

    public void U(ViewGroup viewGroup) {
        d dVar;
        this.w = new ArrayList();
        this.x = new ArrayList();
        S(this.s, this.t);
        nx nxVarA = A();
        int size = nxVarA.size();
        cv7 cv7VarD = as7.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) nxVarA.i(i);
            if (animator != null && (dVar = (d) nxVarA.get(animator)) != null && dVar.a != null && cv7VarD.equals(dVar.d)) {
                mn6 mn6Var = dVar.c;
                View view = dVar.a;
                mn6 mn6VarJ = J(view, true);
                mn6 mn6VarV = v(view, true);
                if (mn6VarJ == null && mn6VarV == null) {
                    mn6VarV = (mn6) this.t.a.get(view);
                }
                if ((mn6VarJ != null || mn6VarV != null) && dVar.e.K(mn6Var, mn6VarV)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        nxVarA.remove(animator);
                    }
                }
            }
        }
        q(viewGroup, this.s, this.t, this.w, this.x);
        Z();
    }

    public fn6 V(f fVar) {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.D.size() == 0) {
            this.D = null;
        }
        return this;
    }

    public fn6 W(View view) {
        this.i.remove(view);
        return this;
    }

    public void X(View view) {
        if (this.B) {
            if (!this.C) {
                for (int size = this.z.size() - 1; size >= 0; size--) {
                    up.c((Animator) this.z.get(size));
                }
                ArrayList arrayList = this.D;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.D.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((f) arrayList2.get(i)).c(this);
                    }
                }
            }
            this.B = false;
        }
    }

    public final void Y(Animator animator, nx nxVar) {
        if (animator != null) {
            animator.addListener(new b(nxVar));
            e(animator);
        }
    }

    public void Z() {
        i0();
        nx nxVarA = A();
        for (Animator animator : this.E) {
            if (nxVarA.containsKey(animator)) {
                i0();
                Y(animator, nxVarA);
            }
        }
        this.E.clear();
        r();
    }

    public fn6 a(f fVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(fVar);
        return this;
    }

    public fn6 a0(long j) {
        this.f = j;
        return this;
    }

    public fn6 b(View view) {
        this.i.add(view);
        return this;
    }

    public void b0(e eVar) {
        this.F = eVar;
    }

    public final void c(nx nxVar, nx nxVar2) {
        for (int i = 0; i < nxVar.size(); i++) {
            mn6 mn6Var = (mn6) nxVar.m(i);
            if (L(mn6Var.b)) {
                this.w.add(mn6Var);
                this.x.add(null);
            }
        }
        for (int i2 = 0; i2 < nxVar2.size(); i2++) {
            mn6 mn6Var2 = (mn6) nxVar2.m(i2);
            if (L(mn6Var2.b)) {
                this.x.add(mn6Var2);
                this.w.add(null);
            }
        }
    }

    public fn6 c0(TimeInterpolator timeInterpolator) {
        this.g = timeInterpolator;
        return this;
    }

    public void cancel() {
        for (int size = this.z.size() - 1; size >= 0; size--) {
            ((Animator) this.z.get(size)).cancel();
        }
        ArrayList arrayList = this.D;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.D.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).a(this);
        }
    }

    public void e(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(mn6 mn6Var);

    public void f0(dm4 dm4Var) {
        if (dm4Var == null) {
            this.H = J;
        } else {
            this.H = dm4Var;
        }
    }

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.l;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.m;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.n;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.n.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    mn6 mn6Var = new mn6(view);
                    if (z) {
                        i(mn6Var);
                    } else {
                        f(mn6Var);
                    }
                    mn6Var.c.add(this);
                    h(mn6Var);
                    if (z) {
                        d(this.s, view, mn6Var);
                    } else {
                        d(this.t, view, mn6Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.p;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.q;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.r;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.r.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                g(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void g0(in6 in6Var) {
    }

    public void h(mn6 mn6Var) {
    }

    public fn6 h0(long j) {
        this.e = j;
        return this;
    }

    public abstract void i(mn6 mn6Var);

    public void i0() {
        if (this.A == 0) {
            ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).e(this);
                }
            }
            this.C = false;
        }
        this.A++;
    }

    public String j0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f != -1) {
            str2 = str2 + "dur(" + this.f + ") ";
        }
        if (this.e != -1) {
            str2 = str2 + "dly(" + this.e + ") ";
        }
        if (this.g != null) {
            str2 = str2 + "interp(" + this.g + ") ";
        }
        if (this.h.size() <= 0 && this.i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.h.size() > 0) {
            for (int i = 0; i < this.h.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.h.get(i);
            }
        }
        if (this.i.size() > 0) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.i.get(i2);
            }
        }
        return str3 + ")";
    }

    public void k(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        nx nxVar;
        l(z);
        if ((this.h.size() > 0 || this.i.size() > 0) && (((arrayList = this.j) == null || arrayList.isEmpty()) && ((arrayList2 = this.k) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.h.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.h.get(i)).intValue());
                if (viewFindViewById != null) {
                    mn6 mn6Var = new mn6(viewFindViewById);
                    if (z) {
                        i(mn6Var);
                    } else {
                        f(mn6Var);
                    }
                    mn6Var.c.add(this);
                    h(mn6Var);
                    if (z) {
                        d(this.s, viewFindViewById, mn6Var);
                    } else {
                        d(this.t, viewFindViewById, mn6Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                View view = (View) this.i.get(i2);
                mn6 mn6Var2 = new mn6(view);
                if (z) {
                    i(mn6Var2);
                } else {
                    f(mn6Var2);
                }
                mn6Var2.c.add(this);
                h(mn6Var2);
                if (z) {
                    d(this.s, view, mn6Var2);
                } else {
                    d(this.t, view, mn6Var2);
                }
            }
        } else {
            g(viewGroup, z);
        }
        if (z || (nxVar = this.G) == null) {
            return;
        }
        int size = nxVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.s.d.remove((String) this.G.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.s.d.put((String) this.G.m(i4), view2);
            }
        }
    }

    public void l(boolean z) {
        if (z) {
            this.s.a.clear();
            this.s.b.clear();
            this.s.c.a();
        } else {
            this.t.a.clear();
            this.t.b.clear();
            this.t.c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: o */
    public fn6 clone() {
        try {
            fn6 fn6Var = (fn6) super.clone();
            fn6Var.E = new ArrayList();
            fn6Var.s = new nn6();
            fn6Var.t = new nn6();
            fn6Var.w = null;
            fn6Var.x = null;
            return fn6Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, mn6 mn6Var, mn6 mn6Var2) {
        return null;
    }

    public void q(ViewGroup viewGroup, nn6 nn6Var, nn6 nn6Var2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        mn6 mn6Var;
        int i;
        Animator animator2;
        mn6 mn6Var2;
        nx nxVarA = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            mn6 mn6Var3 = (mn6) arrayList.get(i2);
            mn6 mn6Var4 = (mn6) arrayList2.get(i2);
            if (mn6Var3 != null && !mn6Var3.c.contains(this)) {
                mn6Var3 = null;
            }
            if (mn6Var4 != null && !mn6Var4.c.contains(this)) {
                mn6Var4 = null;
            }
            if ((mn6Var3 != null || mn6Var4 != null) && (mn6Var3 == null || mn6Var4 == null || K(mn6Var3, mn6Var4))) {
                Animator animatorP = p(viewGroup, mn6Var3, mn6Var4);
                if (animatorP != null) {
                    if (mn6Var4 != null) {
                        View view2 = mn6Var4.b;
                        String[] strArrI = I();
                        if (strArrI != null && strArrI.length > 0) {
                            mn6Var2 = new mn6(view2);
                            mn6 mn6Var5 = (mn6) nn6Var2.a.get(view2);
                            if (mn6Var5 != null) {
                                int i3 = 0;
                                while (i3 < strArrI.length) {
                                    Map map = mn6Var2.a;
                                    Animator animator3 = animatorP;
                                    String str = strArrI[i3];
                                    map.put(str, mn6Var5.a.get(str));
                                    i3++;
                                    animatorP = animator3;
                                    strArrI = strArrI;
                                }
                            }
                            Animator animator4 = animatorP;
                            int size2 = nxVarA.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) nxVarA.get((Animator) nxVarA.i(i4));
                                if (dVar.c != null && dVar.a == view2 && dVar.b.equals(x()) && dVar.c.equals(mn6Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = animatorP;
                            mn6Var2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        mn6Var = mn6Var2;
                    } else {
                        view = mn6Var3.b;
                        animator = animatorP;
                        mn6Var = null;
                    }
                    if (animator != null) {
                        i = size;
                        nxVarA.put(animator, new d(view, x(), this, as7.d(viewGroup), mn6Var));
                        this.E.add(animator);
                    }
                    i2++;
                    size = i;
                }
                i = size;
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.E.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i5)) - LongCompanionObject.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public void r() {
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < this.s.c.l(); i3++) {
                View view = (View) this.s.c.o(i3);
                if (view != null) {
                    dq7.A0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.t.c.l(); i4++) {
                View view2 = (View) this.t.c.o(i4);
                if (view2 != null) {
                    dq7.A0(view2, false);
                }
            }
            this.C = true;
        }
    }

    public long s() {
        return this.f;
    }

    public e t() {
        return this.F;
    }

    public String toString() {
        return j0("");
    }

    public TimeInterpolator u() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (com.zepto.mn6) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.mn6 v(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            com.zepto.jn6 r0 = r5.u
            if (r0 == 0) goto L9
            com.zepto.mn6 r6 = r0.v(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.w
            goto L10
        Le:
            java.util.ArrayList r0 = r5.x
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            com.zepto.mn6 r4 = (com.zepto.mn6) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.x
            goto L36
        L34:
            java.util.ArrayList r6 = r5.w
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            com.zepto.mn6 r1 = (com.zepto.mn6) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.fn6.v(android.view.View, boolean):com.zepto.mn6");
    }

    public String x() {
        return this.c;
    }

    public dm4 y() {
        return this.H;
    }

    public in6 z() {
        return null;
    }
}
