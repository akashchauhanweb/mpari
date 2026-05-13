package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.zepto.jx0;
import com.zepto.lt7;
import com.zepto.mt7;
import com.zepto.nd2;
import com.zepto.u15;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends lt7 {
    public nd2 l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.zepto.lt7, androidx.constraintlayout.widget.c
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.l = new nd2();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u15.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u15.o1) {
                    this.l.D2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.p1) {
                    this.l.I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.z1) {
                    this.l.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.A1) {
                    this.l.K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.q1) {
                    this.l.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.r1) {
                    this.l.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.s1) {
                    this.l.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.t1) {
                    this.l.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.Z1) {
                    this.l.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.P1) {
                    this.l.x2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.Y1) {
                    this.l.H2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.J1) {
                    this.l.r2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.R1) {
                    this.l.z2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.L1) {
                    this.l.t2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.T1) {
                    this.l.B2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u15.N1) {
                    this.l.v2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.I1) {
                    this.l.q2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.Q1) {
                    this.l.y2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.K1) {
                    this.l.s2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.S1) {
                    this.l.A2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.W1) {
                    this.l.F2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u15.M1) {
                    this.l.u2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == u15.V1) {
                    this.l.E2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == u15.O1) {
                    this.l.w2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.X1) {
                    this.l.G2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u15.U1) {
                    this.l.C2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(jx0 jx0Var, boolean z) {
        this.l.t1(z);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onMeasure(int i, int i2) {
        p(this.l, i, i2);
    }

    @Override // com.zepto.lt7
    public void p(mt7 mt7Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mt7Var == null) {
            setMeasuredDimension(0, 0);
        } else {
            mt7Var.C1(mode, size, mode2, size2);
            setMeasuredDimension(mt7Var.x1(), mt7Var.w1());
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.l.q2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.r2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.s2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.t2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.u2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.v2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.w2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.x2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.y2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.z2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.A2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.C2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.D2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.I1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.J1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.L1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.M1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.O1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.E2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.F2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.G2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.H2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.I2(i);
        requestLayout();
    }
}
