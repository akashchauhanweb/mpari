package com.zepto;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class nb0 {
    public final int a;

    public class a extends nb0 {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // com.zepto.nb0
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.zepto.nb0
        public int e() {
            return this.b.b0();
        }

        @Override // com.zepto.nb0
        public int f() {
            return e();
        }

        @Override // com.zepto.nb0
        public int g() {
            return this.b.j0();
        }

        @Override // com.zepto.nb0
        public int h() {
            return this.b.u0() - this.b.k0();
        }

        @Override // com.zepto.nb0
        public int i() {
            return j();
        }

        @Override // com.zepto.nb0
        public int j() {
            return 0;
        }

        @Override // com.zepto.nb0
        public void k(View view, int i, int i2) {
            this.b.F0(view, g(), i, h(), i2);
        }

        @Override // com.zepto.nb0
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }
    }

    public class b extends nb0 {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // com.zepto.nb0
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.zepto.nb0
        public int e() {
            return this.b.b0() - this.b.h0();
        }

        @Override // com.zepto.nb0
        public int f() {
            return this.b.E2() ? g() : h();
        }

        @Override // com.zepto.nb0
        public int g() {
            return 0;
        }

        @Override // com.zepto.nb0
        public int h() {
            return this.b.u0();
        }

        @Override // com.zepto.nb0
        public int i() {
            return this.b.E2() ? h() : g();
        }

        @Override // com.zepto.nb0
        public int j() {
            return this.b.m0();
        }

        @Override // com.zepto.nb0
        public void k(View view, int i, int i2) {
            this.b.F0(view, i, j(), i2, e());
        }

        @Override // com.zepto.nb0
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }
    }

    public /* synthetic */ nb0(int i, a aVar) {
        this(i);
    }

    public static nb0 a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static nb0 b(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return a(carouselLayoutManager);
        }
        if (i == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static nb0 c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract float d(RecyclerView.q qVar);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract void k(View view, int i, int i2);

    public abstract void l(View view, Rect rect, float f, float f2);

    public nb0(int i) {
        this.a = i;
    }
}
