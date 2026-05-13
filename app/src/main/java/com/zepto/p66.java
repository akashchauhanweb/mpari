package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p66 {
    public final Object a = new Object();
    public final Map b = new LinkedHashMap();

    public final boolean a(ay7 id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            zContainsKey = this.b.containsKey(id);
        }
        return zContainsKey;
    }

    public final o66 b(ay7 id) {
        o66 o66Var;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            o66Var = (o66) this.b.remove(id);
        }
        return o66Var;
    }

    public final List c(String workSpecId) {
        List list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.a) {
            try {
                Map map = this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Intrinsics.areEqual(((ay7) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.b.remove((ay7) it.next());
                }
                list = CollectionsKt___CollectionsKt.toList(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final o66 d(ay7 id) {
        o66 o66Var;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            try {
                Map map = this.b;
                Object o66Var2 = map.get(id);
                if (o66Var2 == null) {
                    o66Var2 = new o66(id);
                    map.put(id, o66Var2);
                }
                o66Var = (o66) o66Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o66Var;
    }

    public final o66 e(yy7 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return d(bz7.a(spec));
    }
}
