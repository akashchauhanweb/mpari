package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ul8 implements wc8 {
    public final wc8 a;
    public final wc8 b;
    public final wc8 c;

    public ul8(wc8 wc8Var, wc8 wc8Var2, wc8 wc8Var3) {
        this.a = wc8Var;
        this.b = wc8Var2;
        this.c = wc8Var3;
    }

    @Override // com.zepto.wc8
    public final /* bridge */ /* synthetic */ Object a() {
        zm8 zm8Var = mk8.b(((cm8) this.a).b()) == null ? (zm8) rc8.b(this.b).a() : (zm8) rc8.b(this.c).a();
        tc8.a(zm8Var);
        return zm8Var;
    }
}
