package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zepto.c25;
import com.zepto.nf2;
import com.zepto.qi6;
import com.zepto.s16;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.a {
    public g h;
    public CharSequence i;
    public Drawable j;
    public e.b k;
    public nf2 l;
    public b m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;

    public class a extends nf2 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // com.zepto.nf2
        public s16 b() {
            b bVar = ActionMenuItemView.this.m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // com.zepto.nf2
        public boolean c() {
            s16 s16VarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.k;
            return bVar != null && bVar.a(actionMenuItemView.h) && (s16VarB = b()) != null && s16VarB.d();
        }
    }

    public static abstract class b {
        public abstract s16 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.l == null) {
            this.l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.k;
        if (bVar != null) {
            bVar.a(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = s();
        t();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zR = r();
        if (zR && (i3 = this.q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.p) : this.p;
        if (mode != 1073741824 && this.p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zR || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        nf2 nf2Var;
        if (this.h.hasSubMenu() && (nf2Var = this.l) != null && nf2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.o != z) {
            this.o = z;
            g gVar = this.h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(e.b bVar) {
        this.k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        t();
    }

    public final void t() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.i);
        if (this.j != null && (!this.h.B() || (!this.n && !this.o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.i : null);
        CharSequence contentDescription = this.h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            qi6.a(this, z3 ? null : this.h.getTitle());
        } else {
            qi6.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.n = s();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c25.v, i, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(c25.w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }
}
