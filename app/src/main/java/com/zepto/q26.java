package com.zepto;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q26 implements Iterable {
    public final il4 c;
    public final Constructor e;
    public final Class f;

    public q26(q26 q26Var) {
        this(q26Var.e, q26Var.f);
    }

    public boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.iterator();
    }

    public void j(gl4 gl4Var) {
        Object key = gl4Var.getKey();
        if (key != null) {
            this.c.put(key, gl4Var);
        }
    }

    public q26 m() {
        q26 q26Var = new q26(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            q26Var.j((gl4) it.next());
        }
        return q26Var;
    }

    public Object n(Object[] objArr) {
        if (!this.e.isAccessible()) {
            this.e.setAccessible(true);
        }
        return this.e.newInstance(objArr);
    }

    public gl4 r(Object obj) {
        return (gl4) this.c.get(obj);
    }

    public int size() {
        return this.c.size();
    }

    public String toString() {
        return this.e.toString();
    }

    public List u() {
        return this.c.r();
    }

    public Class w() {
        return this.f;
    }

    public void z(Object obj, gl4 gl4Var) {
        this.c.put(obj, gl4Var);
    }

    public q26(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    public q26(Constructor constructor, Class cls) {
        this.c = new il4();
        this.e = constructor;
        this.f = cls;
    }
}
