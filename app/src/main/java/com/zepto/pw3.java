package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class pw3 extends ArrayList {
    public nw3 O() {
        while (!isEmpty()) {
            nw3 nw3Var = (nw3) remove(0);
            if (!nw3Var.isEmpty()) {
                return nw3Var;
            }
        }
        return null;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            nw3 nw3Var = (nw3) it.next();
            if (nw3Var != null && !nw3Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public pw3 r() {
        pw3 pw3Var = new pw3();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            pw3Var.z((nw3) it.next());
        }
        return pw3Var;
    }

    public nw3 u(int i) {
        if (i <= size()) {
            return (nw3) get(i - 1);
        }
        return null;
    }

    public void z(nw3 nw3Var) {
        int index = nw3Var.getIndex();
        int size = size();
        for (int i = 0; i < index; i++) {
            if (i >= size) {
                add(null);
            }
            int i2 = index - 1;
            if (i == i2) {
                set(i2, nw3Var);
            }
        }
    }
}
