package com.zepto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class pr extends PopupWindow {
    public static final boolean b = false;
    public boolean a;

    public pr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        lg6 lg6VarV = lg6.v(context, attributeSet, c25.g2, i, i2);
        int i3 = c25.i2;
        if (lg6VarV.s(i3)) {
            b(lg6VarV.a(i3, false));
        }
        setBackgroundDrawable(lg6VarV.g(c25.h2));
        lg6VarV.w();
    }

    public final void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            ft4.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
