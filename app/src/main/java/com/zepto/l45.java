package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class l45 implements ys3 {
    public final at3 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public l45(at3 at3Var, String str, Object[] objArr) {
        this.a = at3Var;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.zepto.ys3
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // com.zepto.ys3
    public bx4 b() {
        return (this.d & 1) == 1 ? bx4.PROTO2 : bx4.PROTO3;
    }

    @Override // com.zepto.ys3
    public at3 c() {
        return this.a;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }
}
