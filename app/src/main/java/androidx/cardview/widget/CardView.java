package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zepto.cz4;
import com.zepto.e15;
import com.zepto.hb0;
import com.zepto.ib0;
import com.zepto.jb0;
import com.zepto.s15;
import com.zepto.sy4;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] h = {R.attr.colorBackground};
    public static final jb0 i;
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    public final ib0 g;

    public class a implements ib0 {
        public Drawable a;

        public a() {
        }

        @Override // com.zepto.ib0
        public void a(int i, int i2, int i3, int i4) {
            CardView.this.f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // com.zepto.ib0
        public View b() {
            return CardView.this;
        }

        @Override // com.zepto.ib0
        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // com.zepto.ib0
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // com.zepto.ib0
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // com.zepto.ib0
        public Drawable f() {
            return this.a;
        }
    }

    static {
        hb0 hb0Var = new hb0();
        i = hb0Var;
        hb0Var.f();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sy4.a);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.e.set(i2, i3, i4, i5);
        i.n(this.g);
    }

    public ColorStateList getCardBackgroundColor() {
        return i.b(this.g);
    }

    public float getCardElevation() {
        return i.m(this.g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return i.g(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return i.h(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (i instanceof hb0) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.g)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.g)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        i.c(this.g, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        i.i(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        i.a(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            i.d(this.g);
        }
    }

    public void setRadius(float f) {
        i.e(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            i.j(this.g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s15.a, i2, e15.a);
        int i3 = s15.d;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(cz4.b) : getResources().getColor(cz4.a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(s15.e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(s15.f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(s15.g, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(s15.i, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(s15.h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.b, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(s15.c, 0);
        typedArrayObtainStyledAttributes.recycle();
        i.o(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.c(this.g, colorStateList);
    }
}
