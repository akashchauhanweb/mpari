package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes3.dex */
public abstract class my extends jh4 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(my.class, Object.class, "_consensus");

    @Volatile
    private volatile Object _consensus = ky.a;

    @Override // com.zepto.jh4
    public final Object a(Object obj) {
        Object objC = a.get(this);
        if (objC == ky.a) {
            objC = c(d(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = ky.a;
        return obj2 != obj3 ? obj2 : o2.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
