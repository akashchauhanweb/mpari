package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mc8 {
    public final Map a = new HashMap();

    public final synchronized double a(String str) {
        Double d = (Double) this.a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public final synchronized double b(String str, fe8 fe8Var) {
        double d;
        d = (((double) ((ob8) fe8Var).h) + 1.0d) / ((double) ((ob8) fe8Var).i);
        this.a.put(str, Double.valueOf(d));
        return d;
    }

    public final synchronized void c(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }
}
