package com.zepto;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class hi5 implements Iterable {
    public c c;
    public c e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;

    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.zepto.hi5.e
        public c b(c cVar) {
            return cVar.g;
        }

        @Override // com.zepto.hi5.e
        public c c(c cVar) {
            return cVar.f;
        }
    }

    public static class b extends e {
        public b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.zepto.hi5.e
        public c b(c cVar) {
            return cVar.f;
        }

        @Override // com.zepto.hi5.e
        public c c(c cVar) {
            return cVar.g;
        }
    }

    public static class c implements Map.Entry {
        public final Object c;
        public final Object e;
        public c f;
        public c g;

        public c(Object obj, Object obj2) {
            this.c = obj;
            this.e = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.c.equals(cVar.c) && this.e.equals(cVar.e);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.c.hashCode() ^ this.e.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.c + "=" + this.e;
        }
    }

    public class d extends f implements Iterator {
        public c c;
        public boolean e = true;

        public d() {
        }

        @Override // com.zepto.hi5.f
        public void a(c cVar) {
            c cVar2 = this.c;
            if (cVar == cVar2) {
                c cVar3 = cVar2.g;
                this.c = cVar3;
                this.e = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.e) {
                this.e = false;
                this.c = hi5.this.c;
            } else {
                c cVar = this.c;
                this.c = cVar != null ? cVar.f : null;
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.e) {
                return hi5.this.c != null;
            }
            c cVar = this.c;
            return (cVar == null || cVar.f == null) ? false : true;
        }
    }

    public static abstract class e extends f implements Iterator {
        public c c;
        public c e;

        public e(c cVar, c cVar2) {
            this.c = cVar2;
            this.e = cVar;
        }

        @Override // com.zepto.hi5.f
        public void a(c cVar) {
            if (this.c == cVar && cVar == this.e) {
                this.e = null;
                this.c = null;
            }
            c cVar2 = this.c;
            if (cVar2 == cVar) {
                this.c = b(cVar2);
            }
            if (this.e == cVar) {
                this.e = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.e;
            this.e = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.e;
            c cVar2 = this.c;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e != null;
        }
    }

    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.e, this.c);
        this.f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hi5)) {
            return false;
        }
        hi5 hi5Var = (hi5) obj;
        if (size() != hi5Var.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = hi5Var.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.c, this.e);
        this.f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry j() {
        return this.c;
    }

    public c m(Object obj) {
        c cVar = this.c;
        while (cVar != null && !cVar.c.equals(obj)) {
            cVar = cVar.f;
        }
        return cVar;
    }

    public d n() {
        d dVar = new d();
        this.f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry r() {
        return this.e;
    }

    public int size() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public c u(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.g++;
        c cVar2 = this.e;
        if (cVar2 == null) {
            this.c = cVar;
            this.e = cVar;
            return cVar;
        }
        cVar2.f = cVar;
        cVar.g = cVar2;
        this.e = cVar;
        return cVar;
    }

    public Object w(Object obj, Object obj2) {
        c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.e;
        }
        u(obj, obj2);
        return null;
    }

    public Object z(Object obj) {
        c cVarM = m(obj);
        if (cVarM == null) {
            return null;
        }
        this.g--;
        if (!this.f.isEmpty()) {
            Iterator it = this.f.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarM);
            }
        }
        c cVar = cVarM.g;
        if (cVar != null) {
            cVar.f = cVarM.f;
        } else {
            this.c = cVarM.f;
        }
        c cVar2 = cVarM.f;
        if (cVar2 != null) {
            cVar2.g = cVar;
        } else {
            this.e = cVar;
        }
        cVarM.f = null;
        cVarM.g = null;
        return cVarM.e;
    }
}
