package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ig5 extends fo3 {
    @Override // com.zepto.wj1
    public int a(byte[] bArr, int i) {
        n();
        vk4.i(this.e, bArr, i);
        vk4.i(this.f, bArr, i + 8);
        vk4.i(this.g, bArr, i + 16);
        vk4.i(this.h, bArr, i + 24);
        vk4.i(this.i, bArr, i + 32);
        vk4.i(this.j, bArr, i + 40);
        r();
        return 48;
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHA-384";
    }

    @Override // com.zepto.wj1
    public int c() {
        return 48;
    }

    @Override // com.zepto.fo3
    public void r() {
        super.r();
        this.e = -3766243637369397544L;
        this.f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.j = -8163818279084223215L;
        this.k = -2662702644619276377L;
        this.l = 5167115440072839076L;
    }
}
