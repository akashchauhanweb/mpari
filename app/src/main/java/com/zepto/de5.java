package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class de5 {
    public boolean a = true;

    public boolean a(Object obj, Object obj2) {
        if (obj2 != null) {
            this.a = obj2.equals(obj);
        } else if (obj != null) {
            this.a = obj.equals(Double.valueOf(1.0d));
        }
        return this.a;
    }

    public double b() {
        return 1.0d;
    }

    public boolean c() {
        return this.a;
    }
}
