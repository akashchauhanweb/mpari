package com.zepto;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class rv5 extends StateListDrawable {
    public int a;

    public rv5(Drawable drawable, int i) {
        this.a = i;
        addState(new int[]{R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            super.setColorFilter(this.a, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
