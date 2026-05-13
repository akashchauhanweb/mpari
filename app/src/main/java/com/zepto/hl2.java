package com.zepto;

import com.zepto.b08;

/* JADX INFO: loaded from: classes3.dex */
public final class hl2 extends b08 {
    public final int e;
    public final int f;
    public final int g;

    public static class b extends b08.a {
        public int e;
        public int f;

        public b() {
            super(2);
            this.e = 0;
            this.f = 0;
        }

        public b08 k() {
            return new hl2(this);
        }

        @Override // com.zepto.b08.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        public b m(int i) {
            this.e = i;
            return this;
        }

        public b n(int i) {
            this.f = i;
            return this;
        }
    }

    public hl2(b bVar) {
        super(bVar);
        this.e = 0;
        this.f = bVar.e;
        this.g = bVar.f;
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
        return this.f;
    }

    public int f() {
        return this.g;
    }
}
