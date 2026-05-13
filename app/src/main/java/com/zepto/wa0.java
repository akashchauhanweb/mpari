package com.zepto;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends re6 {
    public final Typeface a;
    public final a b;
    public boolean c;

    public interface a {
        void a(Typeface typeface);
    }

    public wa0(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // com.zepto.re6
    public void a(int i) {
        d(this.a);
    }

    @Override // com.zepto.re6
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
