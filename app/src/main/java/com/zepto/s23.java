package com.zepto;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s23 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public s23(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    public static s23 a(View view) {
        int i = R.id.availableTv;
        TextView textView = (TextView) zp7.a(view, R.id.availableTv);
        if (textView != null) {
            i = R.id.bookedTv;
            TextView textView2 = (TextView) zp7.a(view, R.id.bookedTv);
            if (textView2 != null) {
                i = R.id.holidayTv;
                TextView textView3 = (TextView) zp7.a(view, R.id.holidayTv);
                if (textView3 != null) {
                    return new s23((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
