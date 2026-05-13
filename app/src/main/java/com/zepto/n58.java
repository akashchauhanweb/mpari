package com.zepto;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class n58 {
    public final Map a = new HashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final synchronized boolean a(String str) {
        try {
            if (!this.b.get()) {
                b();
            }
            Object obj = this.a.get("assetOnlyUpdates");
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
