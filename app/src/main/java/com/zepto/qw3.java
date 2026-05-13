package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qw3 extends LinkedHashMap implements Iterable {
    public final si1 c;

    public qw3(si1 si1Var) {
        this.c = si1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qw3 Q() throws bm4 {
        qw3 qw3Var = new qw3(this.c);
        for (K k : keySet()) {
            pw3 pw3VarR = (pw3) get(k);
            if (pw3VarR != null) {
                pw3VarR = pw3VarR.r();
            }
            if (qw3Var.containsKey(k)) {
                throw new bm4("Path with name '%s' is a duplicate in %s ", k, this.c);
            }
            qw3Var.put(k, pw3VarR);
        }
        return qw3Var;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(String str, nw3 nw3Var) {
        pw3 pw3Var = (pw3) get(str);
        if (pw3Var == null) {
            pw3Var = new pw3();
            put(str, pw3Var);
        }
        pw3Var.z(nw3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nw3 y(String str, int i) {
        pw3 pw3Var = (pw3) get(str);
        if (pw3Var != null) {
            return pw3Var.u(i);
        }
        return null;
    }
}
