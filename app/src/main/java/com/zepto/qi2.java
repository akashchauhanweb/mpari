package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class qi2 implements zs3 {
    public static final qi2 a = new qi2();

    public static qi2 c() {
        return a;
    }

    @Override // com.zepto.zs3
    public ys3 a(Class cls) {
        if (!ri2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (ys3) ri2.u(cls.asSubclass(ri2.class)).j();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // com.zepto.zs3
    public boolean b(Class cls) {
        return ri2.class.isAssignableFrom(cls);
    }
}
