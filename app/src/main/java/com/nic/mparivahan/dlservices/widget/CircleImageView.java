package com.nic.mparivahan.dlservices.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zepto.o15;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 }2\u00020\u0001:\u0001~B%\b\u0017\u0012\u0006\u0010w\u001a\u00020v\u0012\b\u0010y\u001a\u0004\u0018\u00010x\u0012\b\b\u0002\u0010z\u001a\u00020\u0018¢\u0006\u0004\b{\u0010|J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0014J(\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0016J(\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0012\u0010&\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0018H\u0007J\u0012\u0010(\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u0018H\u0007J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0007H\u0016J\u0012\u0010+\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010-\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u0018H\u0016J\u0012\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u0010\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u000201H\u0016R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u00107\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0016\u0010B\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010AR\u0016\u0010Q\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010AR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Z\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\\R\u0016\u0010b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R$\u0010c\u001a\u00020\u00182\u0006\u0010c\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010h\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR$\u0010k\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010e\"\u0004\bm\u0010gR$\u0010o\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010t\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010p\"\u0004\bu\u0010r¨\u0006\u007f"}, d2 = {"Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "f", "c", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap;", "e", "g", "h", "Landroid/graphics/RectF;", "d", "i", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "scaleType", "setScaleType", "", "adjustViewBounds", "setAdjustViewBounds", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "w", "oldw", "oldh", "onSizeChanged", "left", "top", "right", "bottom", "setPadding", "start", "end", "setPaddingRelative", "borderColorRes", "setBorderColorResource", "fillColorRes", "setFillColorResource", "bm", "setImageBitmap", "setImageDrawable", "resId", "setImageResource", "Landroid/net/Uri;", "uri", "setImageURI", "Landroid/graphics/ColorFilter;", "cf", "setColorFilter", "getColorFilter", "Landroid/graphics/RectF;", "mDrawableRect", "mBorderRect", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mShaderMatrix", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBitmapPaint", "mBorderPaint", "mFillPaint", "j", "I", "mBorderColor", "k", "mBorderWidth", "l", "mFillColor", "m", "Landroid/graphics/Bitmap;", "mBitmap", "Landroid/graphics/BitmapShader;", "n", "Landroid/graphics/BitmapShader;", "mBitmapShader", "o", "mBitmapWidth", "p", "mBitmapHeight", "", "q", "F", "mDrawableRadius", "r", "mBorderRadius", "s", "Landroid/graphics/ColorFilter;", "mColorFilter", "t", "Z", "mReady", "u", "mSetupPending", "v", "mBorderOverlay", "mDisableCircularTransformation", "borderColor", "getBorderColor", "()I", "setBorderColor", "(I)V", "fillColor", "getFillColor", "setFillColor", "borderWidth", "getBorderWidth", "setBorderWidth", "borderOverlay", "isBorderOverlay", "()Z", "setBorderOverlay", "(Z)V", "disableCircularTransformation", "isDisableCircularTransformation", "setDisableCircularTransformation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "x", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCircleImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleImageView.kt\ncom/nic/mparivahan/dlservices/widget/CircleImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
public final class CircleImageView extends AppCompatImageView {
    public static final ImageView.ScaleType y = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config z = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final RectF mDrawableRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final RectF mBorderRect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Matrix mShaderMatrix;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Paint mBitmapPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Paint mBorderPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Paint mFillPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int mBorderColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mBorderWidth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int mFillColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public Bitmap mBitmap;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public BitmapShader mBitmapShader;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mBitmapWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int mBitmapHeight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float mDrawableRadius;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float mBorderRadius;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public ColorFilter mColorFilter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean mReady;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean mSetupPending;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean mBorderOverlay;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean mDisableCircularTransformation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void f() {
        super.setScaleType(y);
        this.mReady = true;
        if (this.mSetupPending) {
            h();
            this.mSetupPending = false;
        }
    }

    public final void c() {
        Paint paint = this.mBitmapPaint;
        if (paint != null) {
            paint.setColorFilter(this.mColorFilter);
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
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = null;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, z);
                Intrinsics.checkNotNull(bitmapCreateBitmap);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), z);
                Intrinsics.checkNotNull(bitmapCreateBitmap);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public final void g() {
        this.mBitmap = this.mDisableCircularTransformation ? null : e(getDrawable());
        h();
    }

    /* JADX INFO: renamed from: getBorderColor, reason: from getter */
    public final int getMBorderColor() {
        return this.mBorderColor;
    }

    /* JADX INFO: renamed from: getBorderWidth, reason: from getter */
    public final int getMBorderWidth() {
        return this.mBorderWidth;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter = this.mColorFilter;
        Intrinsics.checkNotNull(colorFilter);
        return colorFilter;
    }

    @Deprecated(message = "Fill color support is going to be removed in the future")
    /* JADX INFO: renamed from: getFillColor, reason: from getter */
    public final int getMFillColor() {
        return this.mFillColor;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return y;
    }

    public final void h() {
        int i;
        if (!this.mReady) {
            this.mSetupPending = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.mBitmap == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.mBitmap;
        Intrinsics.checkNotNull(bitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.mBitmapPaint;
        Intrinsics.checkNotNull(paint);
        paint.setAntiAlias(true);
        this.mBitmapPaint.setShader(this.mBitmapShader);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mFillPaint.setStyle(Paint.Style.FILL);
        this.mFillPaint.setAntiAlias(true);
        this.mFillPaint.setColor(this.mFillColor);
        Bitmap bitmap2 = this.mBitmap;
        Intrinsics.checkNotNull(bitmap2);
        this.mBitmapHeight = bitmap2.getHeight();
        Bitmap bitmap3 = this.mBitmap;
        Intrinsics.checkNotNull(bitmap3);
        this.mBitmapWidth = bitmap3.getWidth();
        this.mBorderRect.set(d());
        this.mBorderRadius = Math.min((this.mBorderRect.height() - this.mBorderWidth) / 2.0f, (this.mBorderRect.width() - this.mBorderWidth) / 2.0f);
        this.mDrawableRect.set(this.mBorderRect);
        if (!this.mBorderOverlay && (i = this.mBorderWidth) > 0) {
            this.mDrawableRect.inset(i - 1.0f, i - 1.0f);
        }
        this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
        c();
        i();
        invalidate();
    }

    public final void i() {
        float fWidth;
        float fHeight;
        this.mShaderMatrix.set(null);
        float fWidth2 = 0.0f;
        if (this.mBitmapWidth * this.mDrawableRect.height() > this.mDrawableRect.width() * this.mBitmapHeight) {
            fWidth = this.mDrawableRect.height() / this.mBitmapHeight;
            fHeight = 0.0f;
            fWidth2 = (this.mDrawableRect.width() - (this.mBitmapWidth * fWidth)) * 0.5f;
        } else {
            fWidth = this.mDrawableRect.width() / this.mBitmapWidth;
            fHeight = (this.mDrawableRect.height() - (this.mBitmapHeight * fWidth)) * 0.5f;
        }
        this.mShaderMatrix.setScale(fWidth, fWidth);
        Matrix matrix = this.mShaderMatrix;
        RectF rectF = this.mDrawableRect;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        BitmapShader bitmapShader = this.mBitmapShader;
        Intrinsics.checkNotNull(bitmapShader);
        bitmapShader.setLocalMatrix(this.mShaderMatrix);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.mDisableCircularTransformation) {
            super.onDraw(canvas);
            return;
        }
        if (this.mBitmap == null) {
            return;
        }
        if (this.mFillColor != 0) {
            canvas.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mFillPaint);
        }
        float fCenterX = this.mDrawableRect.centerX();
        float fCenterY = this.mDrawableRect.centerY();
        float f = this.mDrawableRadius;
        Paint paint = this.mBitmapPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(fCenterX, fCenterY, f, paint);
        if (this.mBorderWidth > 0) {
            canvas.drawCircle(this.mBorderRect.centerX(), this.mBorderRect.centerY(), this.mBorderRadius, this.mBorderPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        h();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean adjustViewBounds) {
        if (!(!adjustViewBounds)) {
            throw new IllegalArgumentException("adjustViewBounds not supported.".toString());
        }
    }

    public final void setBorderColor(int i) {
        if (i == this.mBorderColor) {
            return;
        }
        this.mBorderColor = i;
        this.mBorderPaint.setColor(i);
        invalidate();
    }

    @Deprecated(message = "Use {@link #setBorderColor(int)} instead")
    public final void setBorderColorResource(int borderColorRes) {
        setBorderColor(getContext().getResources().getColor(borderColorRes));
    }

    public final void setBorderOverlay(boolean z2) {
        if (z2 == this.mBorderOverlay) {
            return;
        }
        this.mBorderOverlay = z2;
        h();
    }

    public final void setBorderWidth(int i) {
        if (i == this.mBorderWidth) {
            return;
        }
        this.mBorderWidth = i;
        h();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter cf) {
        Intrinsics.checkNotNullParameter(cf, "cf");
        if (cf == this.mColorFilter) {
            return;
        }
        this.mColorFilter = cf;
        c();
        invalidate();
    }

    public final void setDisableCircularTransformation(boolean z2) {
        if (this.mDisableCircularTransformation == z2) {
            return;
        }
        this.mDisableCircularTransformation = z2;
        g();
    }

    @Deprecated(message = "Fill color support is going to be removed in the future")
    public final void setFillColor(int i) {
        if (i == this.mFillColor) {
            return;
        }
        this.mFillColor = i;
        this.mFillPaint.setColor(i);
        invalidate();
    }

    @Deprecated(message = "Fill color support is going to be removed in the future")
    public final void setFillColorResource(int fillColorRes) {
        setFillColor(getContext().getResources().getColor(fillColorRes));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        super.setImageBitmap(bm);
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        g();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        h();
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        super.setPaddingRelative(start, top, end, bottom);
        h();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (scaleType == y) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("ScaleType %s not supported.", Arrays.copyOf(new Object[]{scaleType}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mFillPaint = new Paint();
        this.mBorderColor = -16777216;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o15.K, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.mBorderColor = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        this.mBorderOverlay = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.mFillColor = typedArrayObtainStyledAttributes.getColor(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        f();
    }

    public /* synthetic */ CircleImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
