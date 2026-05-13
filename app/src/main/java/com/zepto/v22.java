package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class v22 implements xm6 {
    public final Class a;

    public v22(Class cls) {
        this.a = cls;
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Enum b(String str) {
        return Enum.valueOf(this.a, str);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(Enum r1) {
        return r1.name();
    }
}
