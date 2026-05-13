package com.zepto;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class zs0 implements se1 {
    public final Class a;
    public final Bitmap.Config b;

    public zs0(Class cls) {
        this(cls, null);
    }

    @Override // com.zepto.se1
    public Object a() {
        return this.b == null ? this.a.newInstance() : this.a.getConstructor(Bitmap.Config.class).newInstance(this.b);
    }

    public zs0(Class cls, Bitmap.Config config) {
        this.a = cls;
        this.b = config;
    }
}
