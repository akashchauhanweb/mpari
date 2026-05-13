package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.zepto.bs7;
import com.zepto.ef6;
import com.zepto.ig6;
import com.zepto.jf6;
import com.zepto.kr;
import com.zepto.rq;
import com.zepto.xr;
import com.zepto.zy4;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {
    public final rq a;
    public final xr b;
    public kr c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.n);
    }

    private kr getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new kr(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.b();
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (bs7.b) {
            return super.getAutoSizeMaxTextSize();
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            return xrVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (bs7.b) {
            return super.getAutoSizeMinTextSize();
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            return xrVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (bs7.b) {
            return super.getAutoSizeStepGranularity();
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            return xrVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (bs7.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        xr xrVar = this.b;
        return xrVar != null ? xrVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (bs7.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            return xrVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ef6.p(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        xr xrVar = this.b;
        if (xrVar == null || bs7.b || !xrVar.l()) {
            return;
        }
        this.b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (bs7.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (bs7.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (bs7.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.v(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ef6.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.s(z);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (bs7.b) {
            super.setTextSize(i, f);
            return;
        }
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        jf6.a(this, getContext());
        rq rqVar = new rq(this);
        this.a = rqVar;
        rqVar.e(attributeSet, i);
        xr xrVar = new xr(this);
        this.b = xrVar;
        xrVar.m(attributeSet, i);
        xrVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
