package com.zepto;

import com.zepto.hi5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k82 extends hi5 {
    public final HashMap h = new HashMap();

    public Map.Entry B(Object obj) {
        if (contains(obj)) {
            return ((hi5.c) this.h.get(obj)).g;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // com.zepto.hi5
    public hi5.c m(Object obj) {
        return (hi5.c) this.h.get(obj);
    }

    @Override // com.zepto.hi5
    public Object w(Object obj, Object obj2) {
        hi5.c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.e;
        }
        this.h.put(obj, u(obj, obj2));
        return null;
    }

    @Override // com.zepto.hi5
    public Object z(Object obj) {
        Object objZ = super.z(obj);
        this.h.remove(obj);
        return objZ;
    }
}
