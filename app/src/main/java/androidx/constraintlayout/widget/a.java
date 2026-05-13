package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zepto.a40;
import com.zepto.jx0;
import com.zepto.u15;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    public int j;
    public int k;
    public a40 l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.u1();
    }

    public int getMargin() {
        return this.l.w1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.c
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.l = new a40();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u15.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u15.D1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.C1) {
                    this.l.z1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == u15.E1) {
                    this.l.B1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(jx0 jx0Var, boolean z) {
        p(jx0Var, this.j, z);
    }

    public final void p(jx0 jx0Var, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (jx0Var instanceof a40) {
            ((a40) jx0Var).A1(this.k);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.z1(z);
    }

    public void setDpMargin(int i) {
        this.l.B1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.B1(i);
    }

    public void setType(int i) {
        this.j = i;
    }
}
