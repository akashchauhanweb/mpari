package com.zepto;

import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w23 {
    public final CoordinatorLayout a;
    public final CoordinatorLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public w23(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.a = coordinatorLayout;
        this.b = coordinatorLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static w23 a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.canclevideo;
        TextView textView = (TextView) zp7.a(view, R.id.canclevideo);
        if (textView != null) {
            i = R.id.modifyvideo;
            TextView textView2 = (TextView) zp7.a(view, R.id.modifyvideo);
            if (textView2 != null) {
                i = R.id.viewvideo;
                TextView textView3 = (TextView) zp7.a(view, R.id.viewvideo);
                if (textView3 != null) {
                    return new w23(coordinatorLayout, coordinatorLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
