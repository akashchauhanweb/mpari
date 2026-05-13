package com.zepto;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class jp3 {
    public b a;
    public c b;
    public e c;

    public final class a implements Iterator {
        public final int c;
        public int e;
        public int f;
        public boolean g = false;

        public a(int i) {
            this.c = i;
            this.e = jp3.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f < this.e;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = jp3.this.b(this.f, this.c);
            this.f++;
            this.g = true;
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.g) {
                throw new IllegalStateException();
            }
            int i = this.f - 1;
            this.f = i;
            this.e--;
            this.g = false;
            jp3.this.h(i);
        }
    }

    public final class b implements Set {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int iD = jp3.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jp3.this.g(entry.getKey(), entry.getValue());
            }
            return iD != jp3.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            jp3.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = jp3.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return iy0.c(jp3.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return jp3.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = jp3.this.d() - 1; iD >= 0; iD--) {
                Object objB = jp3.this.b(iD, 0);
                Object objB2 = jp3.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return jp3.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return jp3.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return jp3.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            jp3.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return jp3.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return jp3.j(jp3.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return jp3.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = jp3.this.d() - 1; iD >= 0; iD--) {
                Object objB = jp3.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return jp3.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return jp3.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = jp3.this.e(obj);
            if (iE < 0) {
                return false;
            }
            jp3.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return jp3.o(jp3.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return jp3.p(jp3.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return jp3.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return jp3.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return jp3.this.r(objArr, 0);
        }
    }

    public final class d implements Iterator, Map.Entry {
        public int c;
        public boolean f = false;
        public int e = -1;

        public d() {
            this.c = jp3.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.e++;
            this.f = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return iy0.c(entry.getKey(), jp3.this.b(this.e, 0)) && iy0.c(entry.getValue(), jp3.this.b(this.e, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f) {
                return jp3.this.b(this.e, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f) {
                return jp3.this.b(this.e, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e < this.c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = jp3.this.b(this.e, 0);
            Object objB2 = jp3.this.b(this.e, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f) {
                throw new IllegalStateException();
            }
            jp3.this.h(this.e);
            this.e--;
            this.c--;
            this.f = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f) {
                return jp3.this.i(this.e, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            jp3.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return jp3.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return jp3.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return jp3.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = jp3.this.f(obj);
            if (iF < 0) {
                return false;
            }
            jp3.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int iD = jp3.this.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (collection.contains(jp3.this.b(i, 1))) {
                    jp3.this.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int iD = jp3.this.d();
            int i = 0;
            boolean z = false;
            while (i < iD) {
                if (!collection.contains(jp3.this.b(i, 1))) {
                    jp3.this.h(i);
                    i--;
                    iD--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return jp3.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return jp3.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return jp3.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i);

    public abstract Object i(int i, Object obj);

    public Set l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
