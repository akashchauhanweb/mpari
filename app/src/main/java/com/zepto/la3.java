package com.zepto;

import com.zepto.b08;

/* JADX INFO: loaded from: classes3.dex */
public final class la3 extends b08 {
    public final int e;
    public final int f;
    public final int g;

    public static class b extends b08.a {
        public int e;
        public int f;
        public int g;

        public b() {
            super(1);
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }

        public b08 l() {
            return new la3(this);
        }

        @Override // com.zepto.b08.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        public b n(int i) {
            this.e = i;
            return this;
        }

        public b o(int i) {
            this.f = i;
            return this;
        }

        public b p(int i) {
            this.g = i;
            return this;
        }
    }

    public la3(b bVar) {
        super(bVar);
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }

    @Override // com.zepto.b08
    public byte[] d() {
        byte[] bArrD = super.d();
        vk4.d(this.e, bArrD, 16);
        vk4.d(this.f, bArrD, 20);
        vk4.d(this.g, bArrD, 24);
        return bArrD;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }
}
