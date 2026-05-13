package com.zepto;

import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class x23 {
    public final CoordinatorLayout a;
    public final CoordinatorLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public x23(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.a = coordinatorLayout;
        this.b = coordinatorLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static x23 a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.cancle;
        TextView textView = (TextView) zp7.a(view, R.id.cancle);
        if (textView != null) {
            i = R.id.modify;
            TextView textView2 = (TextView) zp7.a(view, R.id.modify);
            if (textView2 != null) {
                i = R.id.view;
                TextView textView3 = (TextView) zp7.a(view, R.id.view);
                if (textView3 != null) {
                    return new x23(coordinatorLayout, coordinatorLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
