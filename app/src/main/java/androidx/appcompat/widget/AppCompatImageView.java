package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.zepto.ig6;
import com.zepto.jf6;
import com.zepto.nr;
import com.zepto.rq;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final rq a;
    public final nr b;
    public boolean c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.b();
        }
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        nr nrVar = this.b;
        if (nrVar != null) {
            return nrVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        nr nrVar = this.b;
        if (nrVar != null) {
            return nrVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        nr nrVar = this.b;
        if (nrVar != null && drawable != null && !this.c) {
            nrVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        nr nrVar2 = this.b;
        if (nrVar2 != null) {
            nrVar2.c();
            if (this.c) {
                return;
            }
            this.b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        nr nrVar = this.b;
        if (nrVar != null) {
            nrVar.k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        this.c = false;
        jf6.a(this, getContext());
        rq rqVar = new rq(this);
        this.a = rqVar;
        rqVar.e(attributeSet, i);
        nr nrVar = new nr(this);
        this.b = nrVar;
        nrVar.g(attributeSet, i);
    }
}
