package com.zepto;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pf3 extends AbstractMap implements Serializable {
    public static final Comparator l = new c();
    public final Comparator c;
    public final boolean e;
    public e f;
    public int g;
    public int h;
    public final e i;
    public a j;
    public b k;

    public class a extends AbstractSet {

        /* JADX INFO: renamed from: com.zepto.pf3$a$a, reason: collision with other inner class name */
        public class C0113a extends d {
            public C0113a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            pf3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && pf3.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C0113a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = pf3.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            pf3.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return pf3.this.g;
        }
    }

    public final class b extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().i;
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            pf3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return pf3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return pf3.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return pf3.this.g;
        }
    }

    public class c implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public abstract class d implements Iterator {
        public e c;
        public e e = null;
        public int f;

        public d() {
            this.c = pf3.this.i.g;
            this.f = pf3.this.h;
        }

        public final e a() {
            e eVar = this.c;
            pf3 pf3Var = pf3.this;
            if (eVar == pf3Var.i) {
                throw new NoSuchElementException();
            }
            if (pf3Var.h != this.f) {
                throw new ConcurrentModificationException();
            }
            this.c = eVar.g;
            this.e = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != pf3.this.i;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.e;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            pf3.this.f(eVar, true);
            this.e = null;
            this.f = pf3.this.h;
        }
    }

    public static final class e implements Map.Entry {
        public e c;
        public e e;
        public e f;
        public e g;
        public e h;
        public final Object i;
        public final boolean j;
        public Object k;
        public int l;

        public e(boolean z) {
            this.i = null;
            this.j = z;
            this.h = this;
            this.g = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.e; eVar2 != null; eVar2 = eVar2.e) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f; eVar2 != null; eVar2 = eVar2.f) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.i;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.k;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.i;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.k;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.j) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.k;
            this.k = obj;
            return obj2;
        }

        public String toString() {
            return this.i + "=" + this.k;
        }

        public e(boolean z, e eVar, Object obj, e eVar2, e eVar3) {
            this.c = eVar;
            this.i = obj;
            this.j = z;
            this.l = 1;
            this.g = eVar2;
            this.h = eVar3;
            eVar3.g = this;
            eVar2.h = this;
        }
    }

    public pf3() {
        this(l, true);
    }

    public final boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e b(Object obj, boolean z) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.c;
        e eVar2 = this.f;
        if (eVar2 != null) {
            Comparable comparable = comparator == l ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.i) : comparator.compare(obj, eVar2.i);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.e : eVar2.f;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e eVar4 = this.i;
        if (eVar2 != null) {
            eVar = new e(this.e, eVar2, obj, eVar4, eVar4.h);
            if (iCompareTo < 0) {
                eVar2.e = eVar;
            } else {
                eVar2.f = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == l && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.e, eVar2, obj, eVar4, eVar4.h);
            this.f = eVar;
        }
        this.g++;
        this.h++;
        return eVar;
    }

    public e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.k, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f = null;
        this.g = 0;
        this.h++;
        e eVar = this.i;
        eVar.h = eVar;
        eVar.g = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    public e d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void e(e eVar, boolean z) {
        while (eVar != null) {
            e eVar2 = eVar.e;
            e eVar3 = eVar.f;
            int i = eVar2 != null ? eVar2.l : 0;
            int i2 = eVar3 != null ? eVar3.l : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e eVar4 = eVar3.e;
                e eVar5 = eVar3.f;
                int i4 = (eVar4 != null ? eVar4.l : 0) - (eVar5 != null ? eVar5.l : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e eVar6 = eVar2.e;
                e eVar7 = eVar2.f;
                int i5 = (eVar6 != null ? eVar6.l : 0) - (eVar7 != null ? eVar7.l : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.l = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.l = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.c;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.j = aVar2;
        return aVar2;
    }

    public void f(e eVar, boolean z) {
        int i;
        if (z) {
            e eVar2 = eVar.h;
            eVar2.g = eVar.g;
            eVar.g.h = eVar2;
        }
        e eVar3 = eVar.e;
        e eVar4 = eVar.f;
        e eVar5 = eVar.c;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.e = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.g--;
            this.h++;
            return;
        }
        e eVarB = eVar3.l > eVar4.l ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e eVar6 = eVar.e;
        if (eVar6 != null) {
            i = eVar6.l;
            eVarB.e = eVar6;
            eVar6.c = eVarB;
            eVar.e = null;
        } else {
            i = 0;
        }
        e eVar7 = eVar.f;
        if (eVar7 != null) {
            i2 = eVar7.l;
            eVarB.f = eVar7;
            eVar7.c = eVarB;
            eVar.f = null;
        }
        eVarB.l = Math.max(i, i2) + 1;
        h(eVar, eVarB);
    }

    public e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.k;
        }
        return null;
    }

    public final void h(e eVar, e eVar2) {
        e eVar3 = eVar.c;
        eVar.c = null;
        if (eVar2 != null) {
            eVar2.c = eVar3;
        }
        if (eVar3 == null) {
            this.f = eVar2;
        } else if (eVar3.e == eVar) {
            eVar3.e = eVar2;
        } else {
            eVar3.f = eVar2;
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.e;
        e eVar3 = eVar.f;
        e eVar4 = eVar3.e;
        e eVar5 = eVar3.f;
        eVar.f = eVar4;
        if (eVar4 != null) {
            eVar4.c = eVar;
        }
        h(eVar, eVar3);
        eVar3.e = eVar;
        eVar.c = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.l : 0, eVar4 != null ? eVar4.l : 0) + 1;
        eVar.l = iMax;
        eVar3.l = Math.max(iMax, eVar5 != null ? eVar5.l : 0) + 1;
    }

    public final void j(e eVar) {
        e eVar2 = eVar.e;
        e eVar3 = eVar.f;
        e eVar4 = eVar2.e;
        e eVar5 = eVar2.f;
        eVar.e = eVar5;
        if (eVar5 != null) {
            eVar5.c = eVar;
        }
        h(eVar, eVar2);
        eVar2.f = eVar;
        eVar.c = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.l : 0, eVar5 != null ? eVar5.l : 0) + 1;
        eVar.l = iMax;
        eVar2.l = Math.max(iMax, eVar4 != null ? eVar4.l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        b bVar = this.k;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.k = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.e) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.k;
        eVarB.k = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.g;
    }

    public pf3(boolean z) {
        this(l, z);
    }

    public pf3(Comparator comparator, boolean z) {
        this.g = 0;
        this.h = 0;
        this.c = comparator == null ? l : comparator;
        this.e = z;
        this.i = new e(z);
    }
}
