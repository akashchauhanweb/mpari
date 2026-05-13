package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.zepto.r15;

/* JADX INFO: loaded from: classes2.dex */
public class CircleImageView extends ImageView {
    public static final ImageView.ScaleType u = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config v = Bitmap.Config.ARGB_8888;
    public final RectF a;
    public final RectF b;
    public final Matrix c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public int g;
    public int h;
    public int i;
    public Bitmap j;
    public BitmapShader k;
    public int l;
    public int m;
    public float n;
    public float o;
    public ColorFilter p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.t) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c() {
        Paint paint = this.d;
        if (paint != null) {
            paint.setColorFilter(this.p);
        }
    }

    public final RectF d() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r0 - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((r1 - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    public final Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), v);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean f(float f, float f2) {
        return this.b.isEmpty() || Math.pow((double) (f - this.b.centerX()), 2.0d) + Math.pow((double) (f2 - this.b.centerY()), 2.0d) <= Math.pow((double) this.o, 2.0d);
    }

    public final void g() {
        super.setScaleType(u);
        this.q = true;
        setOutlineProvider(new b());
        if (this.r) {
            i();
            this.r = false;
        }
    }

    public int getBorderColor() {
        return this.g;
    }

    public int getBorderWidth() {
        return this.h;
    }

    public int getCircleBackgroundColor() {
        return this.i;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.p;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return u;
    }

    public final void h() {
        if (this.t) {
            this.j = null;
        } else {
            this.j = e(getDrawable());
        }
        i();
    }

    public final void i() {
        int i;
        if (!this.q) {
            this.r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.j == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.k = new BitmapShader(bitmap, tileMode, tileMode);
        this.d.setAntiAlias(true);
        this.d.setDither(true);
        this.d.setFilterBitmap(true);
        this.d.setShader(this.k);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setAntiAlias(true);
        this.e.setColor(this.g);
        this.e.setStrokeWidth(this.h);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAntiAlias(true);
        this.f.setColor(this.i);
        this.m = this.j.getHeight();
        this.l = this.j.getWidth();
        this.b.set(d());
        this.o = Math.min((this.b.height() - this.h) / 2.0f, (this.b.width() - this.h) / 2.0f);
        this.a.set(this.b);
        if (!this.s && (i = this.h) > 0) {
            this.a.inset(i - 1.0f, i - 1.0f);
        }
        this.n = Math.min(this.a.height() / 2.0f, this.a.width() / 2.0f);
        c();
        j();
        invalidate();
    }

    public final void j() {
        float fWidth;
        float fHeight;
        this.c.set(null);
        float fWidth2 = 0.0f;
        if (this.l * this.a.height() > this.a.width() * this.m) {
            fWidth = this.a.height() / this.m;
            fHeight = 0.0f;
            fWidth2 = (this.a.width() - (this.l * fWidth)) * 0.5f;
        } else {
            fWidth = this.a.width() / this.l;
            fHeight = (this.a.height() - (this.m * fWidth)) * 0.5f;
        }
        this.c.setScale(fWidth, fWidth);
        Matrix matrix = this.c;
        RectF rectF = this.a;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.k.setLocalMatrix(this.c);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.t) {
            super.onDraw(canvas);
            return;
        }
        if (this.j == null) {
            return;
        }
        if (this.i != 0) {
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.n, this.f);
        }
        canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.n, this.d);
        if (this.h > 0) {
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.o, this.e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.t ? super.onTouchEvent(motionEvent) : f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        this.e.setColor(i);
        invalidate();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        i();
    }

    public void setBorderWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        i();
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.f.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.p) {
            return;
        }
        this.p = colorFilter;
        c();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        h();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        i();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        i();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = -16777216;
        this.h = 0;
        this.i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r15.a, i, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(r15.d, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(r15.b, -16777216);
        this.s = typedArrayObtainStyledAttributes.getBoolean(r15.c, false);
        this.i = typedArrayObtainStyledAttributes.getColor(r15.e, 0);
        typedArrayObtainStyledAttributes.recycle();
        g();
    }
}
