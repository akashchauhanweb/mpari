package com.zepto;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dp3 {
    public static final dp3 a;
    public static final boolean b = false;
    public static final bp3 c;

    static {
        dp3 dp3Var = new dp3();
        a = dp3Var;
        la6.f("kotlinx.coroutines.fast.service.loader", true);
        c = dp3Var.a();
    }

    public final bp3 a() {
        Object next;
        bp3 bp3VarE;
        try {
            List listC = b ? l82.a.c() : SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(ServiceLoader.load(cp3.class, cp3.class.getClassLoader()).iterator()));
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((cp3) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((cp3) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            cp3 cp3Var = (cp3) next;
            return (cp3Var == null || (bp3VarE = ep3.e(cp3Var, listC)) == null) ? ep3.b(null, null, 3, null) : bp3VarE;
        } catch (Throwable th) {
            return ep3.b(th, null, 2, null);
        }
    }
}
