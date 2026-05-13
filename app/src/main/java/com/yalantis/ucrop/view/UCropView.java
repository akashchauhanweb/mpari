package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zepto.a05;
import com.zepto.l31;
import com.zepto.q05;
import com.zepto.q15;
import com.zepto.vj4;

/* JADX INFO: loaded from: classes2.dex */
public class UCropView extends FrameLayout {
    public GestureCropImageView a;
    public final OverlayView b;

    public class a implements l31 {
        public a() {
        }

        @Override // com.zepto.l31
        public void a(float f) {
            UCropView.this.b.setTargetAspectRatio(f);
        }
    }

    public class b implements vj4 {
        public b() {
        }

        @Override // com.zepto.vj4
        public void a(RectF rectF) {
            UCropView.this.a.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c() {
        this.a.setCropBoundsChangeListener(new a());
        this.b.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.a;
    }

    public OverlayView getOverlayView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(q05.d, (ViewGroup) this, true);
        this.a = (GestureCropImageView) findViewById(a05.b);
        OverlayView overlayView = (OverlayView) findViewById(a05.y);
        this.b = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q15.U);
        overlayView.g(typedArrayObtainStyledAttributes);
        this.a.y(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }
}
