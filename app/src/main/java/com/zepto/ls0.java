package com.zepto;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ls0 extends kl2 {
    public final URI j;
    public final URI k;
    public final h40 l;
    public final h40 m;
    public final List n;
    public final String o;

    public ls0(Cdo cdo, h33 h33Var, String str, Set set, URI uri, t33 t33Var, URI uri2, h40 h40Var, h40 h40Var2, List list, String str2, Map map, h40 h40Var3) {
        super(cdo, h33Var, str, set, map, h40Var3);
        this.j = uri;
        this.k = uri2;
        this.l = h40Var;
        this.m = h40Var2;
        if (list != null) {
            this.n = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.n = null;
        }
        this.o = str2;
    }

    @Override // com.zepto.kl2
    public Map d() {
        Map mapD = super.d();
        URI uri = this.j;
        if (uri != null) {
            mapD.put("jku", uri.toString());
        }
        URI uri2 = this.k;
        if (uri2 != null) {
            mapD.put("x5u", uri2.toString());
        }
        h40 h40Var = this.l;
        if (h40Var != null) {
            mapD.put("x5t", h40Var.toString());
        }
        h40 h40Var2 = this.m;
        if (h40Var2 != null) {
            mapD.put("x5t#S256", h40Var2.toString());
        }
        List list = this.n;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.n.size());
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                arrayList.add(((c40) it.next()).toString());
            }
            mapD.put("x5c", arrayList);
        }
        String str = this.o;
        if (str != null) {
            mapD.put("kid", str);
        }
        return mapD;
    }
}
