package com.zepto;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r42 implements u86, xx4 {
    public final Map a = new HashMap();
    public Queue b = new ArrayDeque();
    public final Executor c;

    public r42(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void e(Map.Entry entry, n42 n42Var) {
        ((t42) entry.getKey()).a(n42Var);
    }

    @Override // com.zepto.u86
    public void a(Class cls, t42 t42Var) {
        g(cls, this.c, t42Var);
    }

    public void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                wb0.a(it.next());
                f(null);
            }
        }
    }

    public final synchronized Set d(n42 n42Var) {
        throw null;
    }

    public void f(final n42 n42Var) {
        ku4.b(n42Var);
        synchronized (this) {
            try {
                Queue queue = this.b;
                if (queue != null) {
                    queue.add(n42Var);
                    return;
                }
                for (final Map.Entry entry : d(n42Var)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, n42Var) { // from class: com.zepto.q42
                        public final /* synthetic */ Map.Entry c;

                        @Override // java.lang.Runnable
                        public final void run() {
                            r42.e(this.c, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void g(Class cls, Executor executor, t42 t42Var) {
        try {
            ku4.b(cls);
            ku4.b(t42Var);
            ku4.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(t42Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
