package com.zepto;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v18 {
    public final Map a = Collections.synchronizedMap(new WeakHashMap());
    public final Map b = Collections.synchronizedMap(new WeakHashMap());

    public final void b(rc6 rc6Var, boolean z) {
        this.b.put(rc6Var, Boolean.valueOf(z));
        rc6Var.a().b(new t18(this, rc6Var));
    }

    public final void c(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, ak2.r);
    }

    public final boolean e() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final void f(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                wb0.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((rc6) entry2.getKey()).d(new eq(status));
            }
        }
    }
}
