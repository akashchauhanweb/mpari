package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class lt7 extends androidx.constraintlayout.widget.c {
    public boolean j;
    public boolean k;

    public lt7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    public void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.c
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u15.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u15.u1) {
                    this.j = true;
                } else if (index == u15.B1) {
                    this.k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View viewL = constraintLayout.l(this.a[i]);
                    if (viewL != null) {
                        if (this.j) {
                            viewL.setVisibility(visibility);
                        }
                        if (this.k && elevation > 0.0f) {
                            viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(mt7 mt7Var, int i, int i2);

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
