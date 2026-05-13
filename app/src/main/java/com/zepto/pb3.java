package com.zepto;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class pb3 implements nx4 {
    public volatile Set b = null;
    public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public pb3(Collection collection) {
        this.a.addAll(collection);
    }

    public static pb3 b(Collection collection) {
        return new pb3((Set) collection);
    }

    public synchronized void a(nx4 nx4Var) {
        try {
            if (this.b == null) {
                this.a.add(nx4Var);
            } else {
                this.b.add(nx4Var.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zepto.nx4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((nx4) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
