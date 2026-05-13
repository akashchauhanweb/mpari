package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class kg5 extends fo3 {
    @Override // com.zepto.wj1
    public int a(byte[] bArr, int i) {
        n();
        vk4.i(this.e, bArr, i);
        vk4.i(this.f, bArr, i + 8);
        vk4.i(this.g, bArr, i + 16);
        vk4.i(this.h, bArr, i + 24);
        vk4.i(this.i, bArr, i + 32);
        vk4.i(this.j, bArr, i + 40);
        vk4.i(this.k, bArr, i + 48);
        vk4.i(this.l, bArr, i + 56);
        r();
        return 64;
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHA-512";
    }

    @Override // com.zepto.wj1
    public int c() {
        return 64;
    }

    @Override // com.zepto.fo3
    public void r() {
        super.r();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }
}
