package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.zepto.bs7;
import com.zepto.ef6;
import com.zepto.gu4;
import com.zepto.ig6;
import com.zepto.jf6;
import com.zepto.kr;
import com.zepto.lr;
import com.zepto.rq;
import com.zepto.tr;
import com.zepto.wb0;
import com.zepto.wo6;
import com.zepto.wr;
import com.zepto.xr;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    public final rq a;
    public final xr b;
    public final wr c;
    public kr d;
    public boolean e;
    public a f;
    public Future g;

    public interface a {
        void a(int[] iArr, int i);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i);

        TextClassifier e();

        int f();

        void g(int i, int i2, int i3, int i4);

        int h();

        int i();

        void j(int i);

        int k();

        void l(int i);
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] c() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier e() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int f() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void g(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int h() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int i() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void l(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private kr getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new kr(this);
        }
        return this.d;
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
            return getSuperCaller().f();
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
            return getSuperCaller().i();
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
            return getSuperCaller().k();
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
            return getSuperCaller().c();
        }
        xr xrVar = this.b;
        return xrVar != null ? xrVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (bs7.b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return ef6.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return ef6.c(this);
    }

    public a getSuperCaller() {
        if (this.f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f = new c();
            } else {
                this.f = new b();
            }
        }
        return this.f;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        wr wrVar;
        return (Build.VERSION.SDK_INT >= 28 || (wrVar = this.c) == null) ? getSuperCaller().e() : wrVar.a();
    }

    public gu4.a getTextMetricsParamsCompat() {
        return ef6.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return lr.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        q();
        super.onMeasure(i, i2);
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

    public final void q() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                wb0.a(future.get());
                ef6.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (bs7.b) {
            getSuperCaller().g(i, i2, i3, i4);
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
            getSuperCaller().a(iArr, i);
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
            getSuperCaller().l(i);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            ef6.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            ef6.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ef6.l(this, i);
    }

    public void setPrecomputedText(gu4 gu4Var) {
        ef6.m(this, gu4Var);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        wr wrVar;
        if (Build.VERSION.SDK_INT >= 28 || (wrVar = this.c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            wrVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<gu4> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(gu4.a aVar) {
        ef6.o(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i <= 0) ? null : wo6.a(getContext(), typeface, i);
        this.e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(ig6.b(context), attributeSet, i);
        this.e = false;
        this.f = null;
        jf6.a(this, getContext());
        rq rqVar = new rq(this);
        this.a = rqVar;
        rqVar.e(attributeSet, i);
        xr xrVar = new xr(this);
        this.b = xrVar;
        xrVar.m(attributeSet, i);
        xrVar.b();
        this.c = new wr(this);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? tr.b(context, i) : null, i2 != 0 ? tr.b(context, i2) : null, i3 != 0 ? tr.b(context, i3) : null, i4 != 0 ? tr.b(context, i4) : null);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? tr.b(context, i) : null, i2 != 0 ? tr.b(context, i2) : null, i3 != 0 ? tr.b(context, i3) : null, i4 != 0 ? tr.b(context, i4) : null);
        xr xrVar = this.b;
        if (xrVar != null) {
            xrVar.p();
        }
    }
}
