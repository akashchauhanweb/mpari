package com.zepto;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i34 {
    public final ReentrantLock a = new ReentrantLock(true);
    public final ty3 b;
    public final ty3 c;
    public boolean d;
    public final v66 e;
    public final v66 f;

    public i34() {
        ty3 ty3VarA = x66.a(CollectionsKt__CollectionsKt.emptyList());
        this.b = ty3VarA;
        ty3 ty3VarA2 = x66.a(SetsKt__SetsKt.emptySet());
        this.c = ty3VarA2;
        this.e = sd2.b(ty3VarA);
        this.f = sd2.b(ty3VarA2);
    }

    public abstract a24 a(j24 j24Var, Bundle bundle);

    public final v66 b() {
        return this.e;
    }

    public final v66 c() {
        return this.f;
    }

    public final boolean d() {
        return this.d;
    }

    public void e(a24 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.c.setValue(SetsKt___SetsKt.minus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), entry));
    }

    public void f(a24 backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.e.getValue());
            ListIterator listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.areEqual(((a24) listIterator.previous()).f(), backStackEntry.f())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            mutableList.set(iNextIndex, backStackEntry);
            this.b.setValue(mutableList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void g(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) this.e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            a24 a24Var = (a24) listIterator.previous();
            if (Intrinsics.areEqual(a24Var.f(), backStackEntry.f())) {
                this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), a24Var)), backStackEntry));
                f(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(a24 popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ty3 ty3Var = this.b;
            Iterable iterable = (Iterable) ty3Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!Intrinsics.areEqual((a24) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            ty3Var.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void i(a24 popUpTo, boolean z) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this.c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((a24) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.e.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((a24) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), popUpTo));
        List list = (List) this.e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            a24 a24Var = (a24) objPrevious;
            if (!Intrinsics.areEqual(a24Var, popUpTo) && ((List) this.e.getValue()).lastIndexOf(a24Var) < ((List) this.e.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        a24 a24Var2 = (a24) objPrevious;
        if (a24Var2 != null) {
            this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), a24Var2));
        }
        h(popUpTo, z);
    }

    public void j(a24 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), entry));
    }

    public void k(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ty3 ty3Var = this.b;
            ty3Var.setValue(CollectionsKt___CollectionsKt.plus((Collection<? extends a24>) ty3Var.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(a24 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((a24) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((a24) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        a24 a24Var = (a24) CollectionsKt___CollectionsKt.lastOrNull((List) this.e.getValue());
        if (a24Var != null) {
            this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r1.getValue()), a24Var));
        }
        this.c.setValue(SetsKt___SetsKt.plus((Set<? extends a24>) ((Set<? extends Object>) r0.getValue()), backStackEntry));
        k(backStackEntry);
    }

    public final void m(boolean z) {
        this.d = z;
    }
}
