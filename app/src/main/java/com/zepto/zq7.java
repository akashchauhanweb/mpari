package com.zepto;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq7 {
    public final Map a = new HashMap();
    public final Set b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void b() {
        this.c = true;
        Map map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.a.values().iterator();
                    while (it.hasNext()) {
                        c(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        c((Closeable) it2.next());
                    }
                } finally {
                }
            }
            this.b.clear();
        }
        e();
    }

    public Object d(String str) {
        Object obj;
        Map map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.a.get(str);
        }
        return obj;
    }

    public void e() {
    }

    public Object f(String str, Object obj) {
        Object obj2;
        synchronized (this.a) {
            try {
                obj2 = this.a.get(str);
                if (obj2 == null) {
                    this.a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            c(obj);
        }
        return obj;
    }
}
