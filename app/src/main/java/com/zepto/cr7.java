package com.zepto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class cr7 {
    public final Map a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((zq7) it.next()).b();
        }
        this.a.clear();
    }

    public final zq7 b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (zq7) this.a.get(key);
    }

    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String key, zq7 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        zq7 zq7Var = (zq7) this.a.put(key, viewModel);
        if (zq7Var != null) {
            zq7Var.e();
        }
    }
}
