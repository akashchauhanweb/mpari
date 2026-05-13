package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class dz2 extends LinkedHashMap implements w94 {
    public final cz2 c;

    public dz2(cz2 cz2Var) {
        this.c = cz2Var;
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public cz2 remove(String str) {
        return (cz2) super.remove((Object) str);
    }

    @Override // com.zepto.w94, java.lang.Iterable
    public Iterator iterator() {
        return keySet().iterator();
    }

    public final void r(b52 b52Var) {
        Iterator it = b52Var.iterator();
        while (it.hasNext()) {
            bz bzVar = (bz) it.next();
            uy2 uy2Var = new uy2(this.c, bzVar);
            if (!bzVar.c()) {
                put(uy2Var.getName(), uy2Var);
            }
        }
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public cz2 get(String str) {
        return (cz2) super.get((Object) str);
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public cz2 K(String str, String str2) {
        uy2 uy2Var = new uy2(this.c, str, str2);
        if (str != null) {
            put(str, uy2Var);
        }
        return uy2Var;
    }

    public dz2(cz2 cz2Var, b52 b52Var) {
        this.c = cz2Var;
        r(b52Var);
    }
}
