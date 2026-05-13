package com.zepto;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt7 extends ImageButton {
    public int a;

    public yt7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getVisibility();
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}
