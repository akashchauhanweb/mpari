package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.zepto.b02;
import com.zepto.b15;
import com.zepto.br3;
import com.zepto.dq7;
import com.zepto.dz4;
import com.zepto.e06;
import com.zepto.ef6;
import com.zepto.g15;
import com.zepto.gq3;
import com.zepto.gx3;
import com.zepto.hn6;
import com.zepto.if6;
import com.zepto.ir;
import com.zepto.jz4;
import com.zepto.kr0;
import com.zepto.l41;
import com.zepto.lg6;
import com.zepto.m15;
import com.zepto.n66;
import com.zepto.ny2;
import com.zepto.o50;
import com.zepto.pi1;
import com.zepto.r3;
import com.zepto.rp;
import com.zepto.sq3;
import com.zepto.tr;
import com.zepto.tw1;
import com.zepto.v72;
import com.zepto.vq3;
import com.zepto.wp3;
import com.zepto.wq3;
import com.zepto.x2;
import com.zepto.xy4;
import com.zepto.yy0;
import com.zepto.z1;
import com.zepto.zr7;
import com.zepto.zw1;
import com.zepto.zz4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int B0 = g15.k;
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public wq3 F;
    public wq3 G;
    public StateListDrawable H;
    public boolean I;
    public wq3 J;
    public wq3 K;
    public e06 L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;
    public final FrameLayout a;
    public final RectF a0;
    public final n66 b;
    public Typeface b0;
    public final com.google.android.material.textfield.a c;
    public Drawable c0;
    public EditText d;
    public int d0;
    public CharSequence e;
    public final LinkedHashSet e0;
    public int f;
    public Drawable f0;
    public int g;
    public int g0;
    public int h;
    public Drawable h0;
    public int i;
    public ColorStateList i0;
    public final ny2 j;
    public ColorStateList j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public boolean m;
    public int m0;
    public e n;
    public ColorStateList n0;
    public TextView o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public CharSequence r;
    public int r0;
    public boolean s;
    public int s0;
    public TextView t;
    public boolean t0;
    public ColorStateList u;
    public final kr0 u0;
    public int v;
    public boolean v0;
    public v72 w;
    public boolean w0;
    public v72 x;
    public ValueAnimator x0;
    public ColorStateList y;
    public boolean y0;
    public ColorStateList z;
    public boolean z0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.z0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.k) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.s) {
                TextInputLayout.this.y0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.c.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.u0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends x2 {
        public final TextInputLayout d;

        public d(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = !zIsEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.d.P();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            String string = z3 ? hint.toString() : "";
            this.d.b.A(r3Var);
            if (z) {
                r3Var.t0(text);
            } else if (!TextUtils.isEmpty(string)) {
                r3Var.t0(string);
                if (z4 && placeholderText != null) {
                    r3Var.t0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                r3Var.t0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                r3Var.f0(string);
                r3Var.p0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            r3Var.h0(counterMaxLength);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                r3Var.b0(error);
            }
            View viewT = this.d.j.t();
            if (viewT != null) {
                r3Var.g0(viewT);
            }
            this.d.c.m().o(view, r3Var);
        }

        @Override // com.zepto.x2
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.d.c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public static class g extends z1 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public CharSequence f;
        public boolean g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f) + "}";
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.d0);
    }

    public static Drawable H(wq3 wq3Var, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{sq3.j(i2, i, 0.1f), i}), wq3Var, wq3Var);
    }

    public static Drawable K(Context context, wq3 wq3Var, int i, int[][] iArr) {
        int iC = sq3.c(context, xy4.m, "TextInputLayout");
        wq3 wq3Var2 = new wq3(wq3Var.D());
        int iJ = sq3.j(i, iC, 0.1f);
        wq3Var2.W(new ColorStateList(iArr, new int[]{iJ, 0}));
        wq3Var2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        wq3 wq3Var3 = new wq3(wq3Var.D());
        wq3Var3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, wq3Var2, wq3Var3), wq3Var});
    }

    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public static void Y(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || b02.a(editText)) {
            return this.F;
        }
        int iD = sq3.d(this.d, xy4.h);
        int i = this.O;
        if (i == 2) {
            return K(getContext(), this.F, iD, C0);
        }
        if (i == 1) {
            return H(this.F, this.U, iD, C0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], G(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = G(true);
        }
        return this.G;
    }

    public static void l0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? b15.c : b15.b, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.I = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.u0.i0(this.d.getTypeface());
        this.u0.a0(this.d.getTextSize());
        int i3 = Build.VERSION.SDK_INT;
        this.u0.X(this.d.getLetterSpacing());
        int gravity = this.d.getGravity();
        this.u0.S((gravity & (-113)) | 48);
        this.u0.Z(gravity);
        this.d.addTextChangedListener(new a());
        if (this.i0 == null) {
            this.i0 = this.d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.d.getHint();
                this.e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i3 >= 29) {
            n0();
        }
        if (this.o != null) {
            k0(this.d.getText());
        }
        p0();
        this.j.f();
        this.b.bringToFront();
        this.c.bringToFront();
        C();
        this.c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.u0.g0(charSequence);
        if (this.t0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            j();
        } else {
            a0();
            this.t = null;
        }
        this.s = z;
    }

    public final v72 A() {
        v72 v72Var = new v72();
        v72Var.a0(gx3.f(getContext(), xy4.G, 87));
        v72Var.c0(gx3.g(getContext(), xy4.M, rp.a));
        return v72Var;
    }

    public void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.T = this.s0;
        } else if (d0()) {
            if (this.n0 != null) {
                z0(z2, z);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.m || (textView = this.o) == null) {
            if (z2) {
                this.T = this.m0;
            } else if (z) {
                this.T = this.l0;
            } else {
                this.T = this.k0;
            }
        } else if (this.n0 != null) {
            z0(z2, z);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.c.I();
        Z();
        if (this.O == 2) {
            int i = this.Q;
            if (z2 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i) {
                X();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.p0;
            } else if (z && !z2) {
                this.U = this.r0;
            } else if (z2) {
                this.U = this.q0;
            } else {
                this.U = this.o0;
            }
        }
        m();
    }

    public final boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof l41);
    }

    public final void C() {
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    public final void D(Canvas canvas) {
        wq3 wq3Var;
        if (this.K == null || (wq3Var = this.J) == null) {
            return;
        }
        wq3Var.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float fX = this.u0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = rp.c(iCenterX, bounds2.left, fX);
            bounds.right = rp.c(iCenterX, bounds2.right, fX);
            this.K.draw(canvas);
        }
    }

    public final void E(Canvas canvas) {
        if (this.C) {
            this.u0.l(canvas);
        }
    }

    public final void F(boolean z) {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.x0.cancel();
        }
        if (z && this.w0) {
            l(0.0f);
        } else {
            this.u0.c0(0.0f);
        }
        if (B() && ((l41) this.F).m0()) {
            y();
        }
        this.t0 = true;
        L();
        this.b.l(true);
        this.c.H(true);
    }

    public final wq3 G(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(jz4.Y);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof gq3 ? ((gq3) editText).getPopupElevation() : getResources().getDimensionPixelOffset(jz4.s);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(jz4.V);
        e06 e06VarM = e06.a().A(f2).E(f2).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.d;
        wq3 wq3VarM = wq3.m(getContext(), popupElevation, editText2 instanceof gq3 ? ((gq3) editText2).getDropDownBackgroundTintList() : null);
        wq3VarM.setShapeAppearanceModel(e06VarM);
        wq3VarM.Y(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return wq3VarM;
    }

    public final int I(int i, boolean z) {
        return i + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.c.y() : this.b.c());
    }

    public final int J(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.b.c() : this.c.y());
    }

    public final void L() {
        TextView textView = this.t;
        if (textView == null || !this.s) {
            return;
        }
        textView.setText((CharSequence) null);
        hn6.a(this.a, this.x);
        this.t.setVisibility(4);
    }

    public boolean M() {
        return this.c.F();
    }

    public boolean N() {
        return this.j.A();
    }

    public boolean O() {
        return this.j.B();
    }

    public final boolean P() {
        return this.t0;
    }

    public final boolean Q() {
        return d0() || (this.o != null && this.m);
    }

    public boolean R() {
        return this.E;
    }

    public final boolean S() {
        return this.O == 1 && this.d.getMinLines() <= 1;
    }

    public final /* synthetic */ void U() {
        this.d.requestLayout();
    }

    public final void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.O != 0) {
            t0();
        }
        b0();
    }

    public final void W() {
        if (B()) {
            RectF rectF = this.a0;
            this.u0.o(rectF, this.d.getWidth(), this.d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((l41) this.F).p0(rectF);
        }
    }

    public final void X() {
        if (!B() || this.t0) {
            return;
        }
        y();
        W();
    }

    public void Z() {
        this.b.m();
    }

    public final void a0() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.a.addView(view, layoutParams2);
        this.a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.O;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void c0(TextView textView, int i) {
        try {
            ef6.n(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        ef6.n(textView, g15.b);
        textView.setTextColor(yy0.c(getContext(), dz4.a));
    }

    public boolean d0() {
        return this.j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.a.getChildCount());
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.z0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        kr0 kr0Var = this.u0;
        boolean zF0 = kr0Var != null ? kr0Var.f0(drawableState) : false;
        if (this.d != null) {
            u0(dq7.U(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.y0 = false;
    }

    public final boolean e0() {
        return (this.c.G() || ((this.c.A() && M()) || this.c.w() != null)) && this.c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.t == null || !this.s || TextUtils.isEmpty(this.r)) {
            return;
        }
        this.t.setText(this.r);
        hn6.a(this.a, this.w);
        this.t.setVisibility(0);
        this.t.bringToFront();
        announceForAccessibility(this.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    public wq3 getBoxBackground() {
        int i = this.O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return zr7.g(this) ? this.L.j().a(this.a0) : this.L.l().a(this.a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return zr7.g(this) ? this.L.l().a(this.a0) : this.L.j().a(this.a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return zr7.g(this) ? this.L.r().a(this.a0) : this.L.t().a(this.a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return zr7.g(this) ? this.L.t().a(this.a0) : this.L.r().a(this.a0);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.k && this.m && (textView = this.o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.z;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.c.n();
    }

    public int getEndIconMinSize() {
        return this.c.o();
    }

    public int getEndIconMode() {
        return this.c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.q();
    }

    public CheckableImageButton getEndIconView() {
        return this.c.r();
    }

    public CharSequence getError() {
        if (this.j.A()) {
            return this.j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.c.s();
    }

    public CharSequence getHelperText() {
        if (this.j.B()) {
            return this.j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.u0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.u0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public e getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    public TextView getPrefixTextView() {
        return this.b.d();
    }

    public e06 getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    public CharSequence getSuffixText() {
        return this.c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.x();
    }

    public TextView getSuffixTextView() {
        return this.c.z();
    }

    public Typeface getTypeface() {
        return this.b0;
    }

    public final void h0() {
        if (this.O == 1) {
            if (vq3.h(getContext())) {
                this.P = getResources().getDimensionPixelSize(jz4.C);
            } else if (vq3.g(getContext())) {
                this.P = getResources().getDimensionPixelSize(jz4.B);
            }
        }
    }

    public void i(f fVar) {
        this.e0.add(fVar);
        if (this.d != null) {
            fVar.a(this);
        }
    }

    public final void i0(Rect rect) {
        wq3 wq3Var = this.J;
        if (wq3Var != null) {
            int i = rect.bottom;
            wq3Var.setBounds(rect.left, i - this.R, rect.right, i);
        }
        wq3 wq3Var2 = this.K;
        if (wq3Var2 != null) {
            int i2 = rect.bottom;
            wq3Var2.setBounds(rect.left, i2 - this.S, rect.right, i2);
        }
    }

    public final void j() {
        TextView textView = this.t;
        if (textView != null) {
            this.a.addView(textView);
            this.t.setVisibility(0);
        }
    }

    public final void j0() {
        if (this.o != null) {
            EditText editText = this.d;
            k0(editText == null ? null : editText.getText());
        }
    }

    public final void k() {
        if (this.d == null || this.O != 1) {
            return;
        }
        if (vq3.h(getContext())) {
            EditText editText = this.d;
            dq7.F0(editText, dq7.G(editText), getResources().getDimensionPixelSize(jz4.A), dq7.F(this.d), getResources().getDimensionPixelSize(jz4.z));
        } else if (vq3.g(getContext())) {
            EditText editText2 = this.d;
            dq7.F0(editText2, dq7.G(editText2), getResources().getDimensionPixelSize(jz4.y), dq7.F(this.d), getResources().getDimensionPixelSize(jz4.x));
        }
    }

    public void k0(Editable editable) {
        int iA = this.n.a(editable);
        boolean z = this.m;
        int i = this.l;
        if (i == -1) {
            this.o.setText(String.valueOf(iA));
            this.o.setContentDescription(null);
            this.m = false;
        } else {
            this.m = iA > i;
            l0(getContext(), this.o, iA, this.l, this.m);
            if (z != this.m) {
                m0();
            }
            this.o.setText(o50.c().j(getContext().getString(b15.d, Integer.valueOf(iA), Integer.valueOf(this.l))));
        }
        if (this.d == null || z == this.m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    public void l(float f2) {
        if (this.u0.x() == f2) {
            return;
        }
        if (this.x0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.x0 = valueAnimator;
            valueAnimator.setInterpolator(gx3.g(getContext(), xy4.L, rp.b));
            this.x0.setDuration(gx3.f(getContext(), xy4.E, 167));
            this.x0.addUpdateListener(new c());
        }
        this.x0.setFloatValues(this.u0.x(), f2);
        this.x0.start();
    }

    public final void m() {
        wq3 wq3Var = this.F;
        if (wq3Var == null) {
            return;
        }
        e06 e06VarD = wq3Var.D();
        e06 e06Var = this.L;
        if (e06VarD != e06Var) {
            this.F.setShapeAppearanceModel(e06Var);
        }
        if (w()) {
            this.F.c0(this.Q, this.T);
        }
        int iQ = q();
        this.U = iQ;
        this.F.W(ColorStateList.valueOf(iQ));
        n();
        r0();
    }

    public final void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            c0(textView, this.m ? this.p : this.q);
            if (!this.m && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.z) == null) {
                return;
            }
            this.o.setTextColor(colorStateList);
        }
    }

    public final void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.W(this.d.isFocused() ? ColorStateList.valueOf(this.k0) : ColorStateList.valueOf(this.T));
            this.K.W(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.A;
        if (colorStateListG == null) {
            colorStateListG = sq3.g(getContext(), xy4.g);
        }
        EditText editText = this.d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = tw1.r(this.d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.B) != null) {
            colorStateListG = colorStateList;
        }
        tw1.o(drawableMutate, colorStateListG);
    }

    public final void o(RectF rectF) {
        float f2 = rectF.left;
        int i = this.N;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    public boolean o0() {
        boolean z;
        if (this.d == null) {
            return false;
        }
        boolean z2 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.d.getPaddingLeft();
            if (this.c0 == null || this.d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.c0 = colorDrawable;
                this.d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = ef6.a(this.d);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.c0;
            if (drawable != drawable2) {
                ef6.i(this.d, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.c0 != null) {
                Drawable[] drawableArrA2 = ef6.a(this.d);
                ef6.i(this.d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.c0 = null;
                z = true;
            }
            z = false;
        }
        if (e0()) {
            int measuredWidth2 = this.c.z().getMeasuredWidth() - this.d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + wp3.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = ef6.a(this.d);
            Drawable drawable3 = this.f0;
            if (drawable3 == null || this.g0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f0 = colorDrawable2;
                    this.g0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.f0;
                if (drawable4 != drawable5) {
                    this.h0 = drawable4;
                    ef6.i(this.d, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                ef6.i(this.d, drawableArrA3[0], drawableArrA3[1], this.f0, drawableArrA3[3]);
            }
        } else {
            if (this.f0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = ef6.a(this.d);
            if (drawableArrA4[2] == this.f0) {
                ef6.i(this.d, drawableArrA4[0], drawableArrA4[1], this.h0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.f0 = null;
        }
        return z2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.u0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.A0 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.d.post(new Runnable() { // from class: com.zepto.ye6
                @Override // java.lang.Runnable
                public final void run() {
                    this.c.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            Rect rect = this.V;
            pi1.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.u0.a0(this.d.getTextSize());
                int gravity = this.d.getGravity();
                this.u0.S((gravity & (-113)) | 48);
                this.u0.Z(gravity);
                this.u0.O(r(rect));
                this.u0.W(u(rect));
                this.u0.J();
                if (!B() || this.t0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0) {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.A0 = true;
        }
        w0();
        this.c.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        setError(gVar.f);
        if (gVar.g) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.M) {
            float fA = this.L.r().a(this.a0);
            float fA2 = this.L.t().a(this.a0);
            e06 e06VarM = e06.a().z(this.L.s()).D(this.L.q()).r(this.L.k()).v(this.L.i()).A(fA2).E(fA).s(this.L.l().a(this.a0)).w(this.L.j().a(this.a0)).m();
            this.M = z;
            setShapeAppearanceModel(e06VarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f = getError();
        }
        gVar.g = this.c.E();
        return gVar;
    }

    public final void p() {
        int i = this.O;
        if (i == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
            return;
        }
        if (i == 1) {
            this.F = new wq3(this.L);
            this.J = new wq3();
            this.K = new wq3();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof l41)) {
                this.F = new wq3(this.L);
            } else {
                this.F = l41.l0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (zw1.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(ir.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.m && (textView = this.o) != null) {
            background.setColorFilter(ir.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            tw1.c(background);
            this.d.refreshDrawableState();
        }
    }

    public final int q() {
        return this.O == 1 ? sq3.i(sq3.e(this, xy4.m, 0), this.U) : this.U;
    }

    public final void q0() {
        dq7.u0(this.d, getEditTextBoxBackground());
    }

    public final Rect r(Rect rect) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        boolean zG = zr7.g(this);
        rect2.bottom = rect.bottom;
        int i = this.O;
        if (i == 1) {
            rect2.left = I(rect.left, zG);
            rect2.top = rect.top + this.P;
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        if (i != 2) {
            rect2.left = I(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.d.getPaddingRight();
        return rect2;
    }

    public void r0() {
        EditText editText = this.d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            q0();
            this.I = true;
        }
    }

    public final int s(Rect rect, Rect rect2, float f2) {
        return S() ? (int) (rect2.top + f2) : rect.bottom - this.d.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int iMax;
        if (this.d == null || this.d.getMeasuredHeight() >= (iMax = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.d.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.U != i) {
            this.U = i;
            this.o0 = i;
            this.q0 = i;
            this.r0 = i;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(yy0.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.U = defaultColor;
        this.p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.O) {
            return;
        }
        this.O = i;
        if (this.d != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.P = i;
    }

    public void setBoxCornerFamily(int i) {
        this.L = this.L.v().y(i, this.L.r()).C(i, this.L.t()).q(i, this.L.j()).u(i, this.L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i) {
        if (this.m0 != i) {
            this.m0 = i;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.k0 = colorStateList.getDefaultColor();
            this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.m0 != colorStateList.getDefaultColor()) {
            this.m0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.R = i;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.S = i;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.o = appCompatTextView;
                appCompatTextView.setId(zz4.O);
                Typeface typeface = this.b0;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.j.e(this.o, 2);
                wp3.d((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(jz4.d0));
                m0();
                j0();
            } else {
                this.j.C(this.o, 2);
                this.o = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (this.k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.i0 = colorStateList;
        this.j0 = colorStateList;
        if (this.d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Y(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.N(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.O(z);
    }

    public void setEndIconContentDescription(int i) {
        this.c.P(i);
    }

    public void setEndIconDrawable(int i) {
        this.c.R(i);
    }

    public void setEndIconMinSize(int i) {
        this.c.T(i);
    }

    public void setEndIconMode(int i) {
        this.c.U(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.c.Z(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.c.a0(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.j.w();
        } else {
            this.j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.j.E(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.j.F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.j.G(z);
    }

    public void setErrorIconDrawable(int i) {
        this.c.b0(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.c.g0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.j.H(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.j.K(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.j.J(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.w0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.u0.P(i);
        this.j0 = this.u0.p();
        if (this.d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.i0 == null) {
                this.u0.R(colorStateList);
            }
            this.j0 = colorStateList;
            if (this.d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.n = eVar;
    }

    public void setMaxEms(int i) {
        this.g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.c.i0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.c.k0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.c.m0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.t = appCompatTextView;
            appCompatTextView.setId(zz4.R);
            dq7.B0(this.t, 2);
            v72 v72VarA = A();
            this.w = v72VarA;
            v72VarA.h0(67L);
            this.x = A();
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            ef6.n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.b.o(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(e06 e06Var) {
        wq3 wq3Var = this.F;
        if (wq3Var == null || wq3Var.D() == e06Var) {
            return;
        }
        this.L = e06Var;
        m();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.q(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? tr.b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.b.t(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.y(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.b.z(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.d;
        if (editText != null) {
            dq7.q0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.b0) {
            this.b0 = typeface;
            this.u0.i0(typeface);
            this.j.N(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f2) {
        return S() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.d.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.a.requestLayout();
            }
        }
    }

    public final Rect u(Rect rect) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float fW = this.u0.w();
        rect2.left = rect.left + this.d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    public void u0(boolean z) {
        v0(z, false);
    }

    public final int v() {
        float fQ;
        if (!this.C) {
            return 0;
        }
        int i = this.O;
        if (i == 0) {
            fQ = this.u0.q();
        } else {
            if (i != 2) {
                return 0;
            }
            fQ = this.u0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.i0;
        if (colorStateList2 != null) {
            this.u0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.i0;
            this.u0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.s0) : this.s0));
        } else if (d0()) {
            this.u0.M(this.j.r());
        } else if (this.m && (textView = this.o) != null) {
            this.u0.M(textView.getTextColors());
        } else if (z3 && (colorStateList = this.j0) != null) {
            this.u0.R(colorStateList);
        }
        if (z4 || !this.v0 || (isEnabled() && z3)) {
            if (z2 || this.t0) {
                z(z);
                return;
            }
            return;
        }
        if (z2 || !this.t0) {
            F(z);
        }
    }

    public final boolean w() {
        return this.O == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.t == null || (editText = this.d) == null) {
            return;
        }
        this.t.setGravity(editText.getGravity());
        this.t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    public final void x0() {
        EditText editText = this.d;
        y0(editText == null ? null : editText.getText());
    }

    public final void y() {
        if (B()) {
            ((l41) this.F).n0();
        }
    }

    public final void y0(Editable editable) {
        if (this.n.a(editable) != 0 || this.t0) {
            L();
        } else {
            g0();
        }
    }

    public final void z(boolean z) {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.x0.cancel();
        }
        if (z && this.w0) {
            l(1.0f);
        } else {
            this.u0.c0(1.0f);
        }
        this.t0 = false;
        if (B()) {
            W();
        }
        x0();
        this.b.l(false);
        this.c.H(false);
    }

    public final void z0(boolean z, boolean z2) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.T = colorForState2;
        } else if (z2) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = B0;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new ny2(this);
        this.n = new e() { // from class: com.zepto.ze6
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.T(editable);
            }
        };
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new RectF();
        this.e0 = new LinkedHashSet();
        kr0 kr0Var = new kr0(this);
        this.u0 = kr0Var;
        this.A0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = rp.a;
        kr0Var.h0(timeInterpolator);
        kr0Var.e0(timeInterpolator);
        kr0Var.S(8388659);
        int[] iArr = m15.G6;
        int i3 = m15.d7;
        int i4 = m15.b7;
        int i5 = m15.v7;
        int i6 = m15.A7;
        int i7 = m15.E7;
        lg6 lg6VarJ = if6.j(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        n66 n66Var = new n66(this, lg6VarJ);
        this.b = n66Var;
        this.C = lg6VarJ.a(m15.D7, true);
        setHint(lg6VarJ.p(m15.L6));
        this.w0 = lg6VarJ.a(m15.C7, true);
        this.v0 = lg6VarJ.a(m15.x7, true);
        int i8 = m15.N6;
        if (lg6VarJ.s(i8)) {
            setMinEms(lg6VarJ.k(i8, -1));
        } else {
            int i9 = m15.K6;
            if (lg6VarJ.s(i9)) {
                setMinWidth(lg6VarJ.f(i9, -1));
            }
        }
        int i10 = m15.M6;
        if (lg6VarJ.s(i10)) {
            setMaxEms(lg6VarJ.k(i10, -1));
        } else {
            int i11 = m15.J6;
            if (lg6VarJ.s(i11)) {
                setMaxWidth(lg6VarJ.f(i11, -1));
            }
        }
        this.L = e06.e(context2, attributeSet, i, i2).m();
        this.N = context2.getResources().getDimensionPixelOffset(jz4.a0);
        this.P = lg6VarJ.e(m15.Q6, 0);
        this.R = lg6VarJ.f(m15.X6, context2.getResources().getDimensionPixelSize(jz4.b0));
        this.S = lg6VarJ.f(m15.Y6, context2.getResources().getDimensionPixelSize(jz4.c0));
        this.Q = this.R;
        float fD = lg6VarJ.d(m15.U6, -1.0f);
        float fD2 = lg6VarJ.d(m15.T6, -1.0f);
        float fD3 = lg6VarJ.d(m15.R6, -1.0f);
        float fD4 = lg6VarJ.d(m15.S6, -1.0f);
        e06.b bVarV = this.L.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.L = bVarV.m();
        ColorStateList colorStateListB = vq3.b(context2, lg6VarJ, m15.O6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.q0 = this.o0;
                ColorStateList colorStateListA = tr.a(context2, dz4.g);
                this.p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
        }
        int i12 = m15.I6;
        if (lg6VarJ.s(i12)) {
            ColorStateList colorStateListC = lg6VarJ.c(i12);
            this.j0 = colorStateListC;
            this.i0 = colorStateListC;
        }
        int i13 = m15.V6;
        ColorStateList colorStateListB2 = vq3.b(context2, lg6VarJ, i13);
        this.m0 = lg6VarJ.b(i13, 0);
        this.k0 = yy0.c(context2, dz4.h);
        this.s0 = yy0.c(context2, dz4.i);
        this.l0 = yy0.c(context2, dz4.j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i14 = m15.W6;
        if (lg6VarJ.s(i14)) {
            setBoxStrokeErrorColor(vq3.b(context2, lg6VarJ, i14));
        }
        if (lg6VarJ.n(i7, -1) != -1) {
            setHintTextAppearance(lg6VarJ.n(i7, 0));
        }
        this.A = lg6VarJ.c(m15.f7);
        this.B = lg6VarJ.c(m15.g7);
        int iN = lg6VarJ.n(i5, 0);
        CharSequence charSequenceP = lg6VarJ.p(m15.q7);
        int iK = lg6VarJ.k(m15.p7, 1);
        boolean zA = lg6VarJ.a(m15.r7, false);
        int iN2 = lg6VarJ.n(i6, 0);
        boolean zA2 = lg6VarJ.a(m15.z7, false);
        CharSequence charSequenceP2 = lg6VarJ.p(m15.y7);
        int iN3 = lg6VarJ.n(m15.M7, 0);
        CharSequence charSequenceP3 = lg6VarJ.p(m15.L7);
        boolean zA3 = lg6VarJ.a(m15.Z6, false);
        setCounterMaxLength(lg6VarJ.k(m15.a7, -1));
        this.q = lg6VarJ.n(i3, 0);
        this.p = lg6VarJ.n(i4, 0);
        setBoxBackgroundMode(lg6VarJ.k(m15.P6, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i15 = m15.w7;
        if (lg6VarJ.s(i15)) {
            setErrorTextColor(lg6VarJ.c(i15));
        }
        int i16 = m15.B7;
        if (lg6VarJ.s(i16)) {
            setHelperTextColor(lg6VarJ.c(i16));
        }
        int i17 = m15.F7;
        if (lg6VarJ.s(i17)) {
            setHintTextColor(lg6VarJ.c(i17));
        }
        int i18 = m15.e7;
        if (lg6VarJ.s(i18)) {
            setCounterTextColor(lg6VarJ.c(i18));
        }
        int i19 = m15.c7;
        if (lg6VarJ.s(i19)) {
            setCounterOverflowTextColor(lg6VarJ.c(i19));
        }
        int i20 = m15.N7;
        if (lg6VarJ.s(i20)) {
            setPlaceholderTextColor(lg6VarJ.c(i20));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, lg6VarJ);
        this.c = aVar;
        boolean zA4 = lg6VarJ.a(m15.H6, true);
        lg6VarJ.w();
        dq7.B0(this, 2);
        dq7.C0(this, 1);
        frameLayout.addView(n66Var);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
