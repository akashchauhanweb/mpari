package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class ys4 implements ws4 {
    public final Object[] a;
    public int b;

    public ys4(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // com.zepto.ws4
    public boolean a(Object obj) {
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    @Override // com.zepto.ws4
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    public final boolean c(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == obj) {
                return true;
            }
        }
        return false;
    }
}
