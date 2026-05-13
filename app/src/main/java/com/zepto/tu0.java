package com.zepto;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.zepto.tu0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class tu0 implements cu0, ku0 {
    public static final nx4 i = new nx4() { // from class: com.zepto.qu0
        @Override // com.zepto.nx4
        public final Object get() {
            return Collections.emptySet();
        }
    };
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public Set e;
    public final r42 f;
    public final AtomicReference g;
    public final ou0 h;

    public static final class b {
        public final Executor a;
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public ou0 d = ou0.a;

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(ut0 ut0Var) {
            this.c.add(ut0Var);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new nx4() { // from class: com.zepto.uu0
                @Override // com.zepto.nx4
                public final Object get() {
                    return tu0.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.b.addAll(collection);
            return this;
        }

        public tu0 e() {
            return new tu0(this.a, this.b, this.c, this.d);
        }

        public b g(ou0 ou0Var) {
            this.d = ou0Var;
            return this;
        }
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    public static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.zepto.cu0
    public synchronized nx4 b(ky4 ky4Var) {
        pb3 pb3Var = (pb3) this.c.get(ky4Var);
        if (pb3Var != null) {
            return pb3Var;
        }
        return i;
    }

    @Override // com.zepto.cu0
    public synchronized nx4 e(ky4 ky4Var) {
        ku4.c(ky4Var, "Null interface requested.");
        return (nx4) this.b.get(ky4Var);
    }

    public final void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((nx4) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (c13 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((ut0) it2.next()).j().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.e.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                m41.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                m41.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final ut0 ut0Var = (ut0) it3.next();
                this.a.put(ut0Var, new lb3(new nx4() { // from class: com.zepto.pu0
                    @Override // com.zepto.nx4
                    public final Object get() {
                        return this.a.p(ut0Var);
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        s();
    }

    public final void m(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            ut0 ut0Var = (ut0) entry.getKey();
            nx4 nx4Var = (nx4) entry.getValue();
            if (ut0Var.n() || (ut0Var.o() && z)) {
                nx4Var.get();
            }
        }
        this.f.c();
    }

    public void n(boolean z) {
        HashMap map;
        if (bf3.a(this.g, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.a);
            }
            m(map, z);
        }
    }

    public final /* synthetic */ Object p(ut0 ut0Var) {
        return ut0Var.h().a(new td5(ut0Var, this));
    }

    public final void s() {
        Boolean bool = (Boolean) this.g.get();
        if (bool != null) {
            m(this.a, bool.booleanValue());
        }
    }

    public final void t() {
        for (ut0 ut0Var : this.a.keySet()) {
            for (hi1 hi1Var : ut0Var.g()) {
                if (hi1Var.f() && !this.c.containsKey(hi1Var.b())) {
                    this.c.put(hi1Var.b(), pb3.b(Collections.emptySet()));
                } else if (this.b.containsKey(hi1Var.b())) {
                    continue;
                } else {
                    if (hi1Var.e()) {
                        throw new wu3(String.format("Unsatisfied dependency for component %s: %s", ut0Var, hi1Var.b()));
                    }
                    if (!hi1Var.f()) {
                        this.b.put(hi1Var.b(), sh4.c());
                    }
                }
            }
        }
    }

    public final List u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ut0 ut0Var = (ut0) it.next();
            if (ut0Var.p()) {
                final nx4 nx4Var = (nx4) this.a.get(ut0Var);
                for (ky4 ky4Var : ut0Var.j()) {
                    if (this.b.containsKey(ky4Var)) {
                        final sh4 sh4Var = (sh4) ((nx4) this.b.get(ky4Var));
                        arrayList.add(new Runnable() { // from class: com.zepto.ru0
                            @Override // java.lang.Runnable
                            public final void run() {
                                sh4Var.f(nx4Var);
                            }
                        });
                    } else {
                        this.b.put(ky4Var, nx4Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List v() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            ut0 ut0Var = (ut0) entry.getKey();
            if (!ut0Var.p()) {
                nx4 nx4Var = (nx4) entry.getValue();
                for (ky4 ky4Var : ut0Var.j()) {
                    if (!map.containsKey(ky4Var)) {
                        map.put(ky4Var, new HashSet());
                    }
                    ((Set) map.get(ky4Var)).add(nx4Var);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final pb3 pb3Var = (pb3) this.c.get(entry2.getKey());
                for (final nx4 nx4Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.zepto.su0
                        @Override // java.lang.Runnable
                        public final void run() {
                            pb3Var.a(nx4Var2);
                        }
                    });
                }
            } else {
                this.c.put((ky4) entry2.getKey(), pb3.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public tu0(Executor executor, Iterable iterable, Collection collection, ou0 ou0Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        r42 r42Var = new r42(executor);
        this.f = r42Var;
        this.h = ou0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ut0.s(r42Var, r42.class, u86.class, xx4.class));
        arrayList.add(ut0.s(this, ku0.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ut0 ut0Var = (ut0) it.next();
            if (ut0Var != null) {
                arrayList.add(ut0Var);
            }
        }
        this.d = o(iterable);
        l(arrayList);
    }
}
