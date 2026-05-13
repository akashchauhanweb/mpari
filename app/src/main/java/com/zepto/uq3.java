package com.zepto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;

/* JADX INFO: loaded from: classes.dex */
public class uq3 extends AppCompatRadioButton {
    public static final int g = g15.r;
    public static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public uq3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.R);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iD = sq3.d(this, xy4.g);
            int iD2 = sq3.d(this, xy4.j);
            int iD3 = sq3.d(this, xy4.m);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = sq3.j(iD3, iD, 1.0f);
            iArr2[1] = sq3.j(iD3, iD2, 0.54f);
            iArr2[2] = sq3.j(iD3, iD2, 0.38f);
            iArr2[3] = sq3.j(iD3, iD2, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && zu0.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            zu0.d(this, getMaterialThemeColorsTintList());
        } else {
            zu0.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uq3(Context context, AttributeSet attributeSet, int i) {
        int i2 = g;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayI = if6.i(context2, attributeSet, m15.V3, i, i2, new int[0]);
        int i3 = m15.W3;
        if (typedArrayI.hasValue(i3)) {
            zu0.d(this, vq3.a(context2, typedArrayI, i3));
        }
        this.f = typedArrayI.getBoolean(m15.X3, false);
        typedArrayI.recycle();
    }
}
