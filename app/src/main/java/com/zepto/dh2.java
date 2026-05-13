package com.zepto;

import android.view.ViewGroup;
import androidx.lifecycle.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class dh2 {
    public final dg2 a;
    public final ClassLoader b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;

    public static final class a {
        public int a;
        public sf2 b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public h.b h;
        public h.b i;

        public a() {
        }

        public a(int i, sf2 sf2Var) {
            this.a = i;
            this.b = sf2Var;
            this.c = false;
            h.b bVar = h.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, sf2 sf2Var, boolean z) {
            this.a = i;
            this.b = sf2Var;
            this.c = z;
            h.b bVar = h.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
        }
    }

    public dh2(dg2 dg2Var, ClassLoader classLoader) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = dg2Var;
        this.b = classLoader;
    }

    public dh2 b(int i, sf2 sf2Var) {
        m(i, sf2Var, null, 1);
        return this;
    }

    public dh2 c(int i, sf2 sf2Var, String str) {
        m(i, sf2Var, str, 1);
        return this;
    }

    public dh2 d(ViewGroup viewGroup, sf2 sf2Var, String str) {
        sf2Var.H = viewGroup;
        return c(viewGroup.getId(), sf2Var, str);
    }

    public dh2 e(sf2 sf2Var, String str) {
        m(0, sf2Var, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public dh2 g(String str) {
        if (!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = str;
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public dh2 l() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    public void m(int i, sf2 sf2Var, String str, int i2) {
        String str2 = sf2Var.R;
        if (str2 != null) {
            bh2.f(sf2Var, str2);
        }
        Class<?> cls = sf2Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = sf2Var.z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + sf2Var + ": was " + sf2Var.z + " now " + str);
            }
            sf2Var.z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + sf2Var + " with tag " + str + " to container view with no id");
            }
            int i3 = sf2Var.x;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + sf2Var + ": was " + sf2Var.x + " now " + i);
            }
            sf2Var.x = i;
            sf2Var.y = i;
        }
        f(new a(i2, sf2Var));
    }

    public dh2 n(sf2 sf2Var) {
        f(new a(3, sf2Var));
        return this;
    }

    public dh2 o(int i, sf2 sf2Var) {
        return p(i, sf2Var, null);
    }

    public dh2 p(int i, sf2 sf2Var, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i, sf2Var, str, 2);
        return this;
    }

    public dh2 q(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this;
    }

    public dh2 r(sf2 sf2Var) {
        f(new a(8, sf2Var));
        return this;
    }

    public dh2 s(boolean z) {
        this.r = z;
        return this;
    }

    public dh2(dg2 dg2Var, ClassLoader classLoader, dh2 dh2Var) {
        this(dg2Var, classLoader);
        Iterator it = dh2Var.c.iterator();
        while (it.hasNext()) {
            this.c.add(new a((a) it.next()));
        }
        this.d = dh2Var.d;
        this.e = dh2Var.e;
        this.f = dh2Var.f;
        this.g = dh2Var.g;
        this.h = dh2Var.h;
        this.i = dh2Var.i;
        this.j = dh2Var.j;
        this.k = dh2Var.k;
        this.n = dh2Var.n;
        this.o = dh2Var.o;
        this.l = dh2Var.l;
        this.m = dh2Var.m;
        if (dh2Var.p != null) {
            ArrayList arrayList = new ArrayList();
            this.p = arrayList;
            arrayList.addAll(dh2Var.p);
        }
        if (dh2Var.q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.q = arrayList2;
            arrayList2.addAll(dh2Var.q);
        }
        this.r = dh2Var.r;
    }
}
