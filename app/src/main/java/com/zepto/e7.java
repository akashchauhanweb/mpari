package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e7 {
    public final CoordinatorLayout a;
    public final TextView b;
    public final TextView c;
    public final d47 d;

    public e7(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, d47 d47Var) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textView2;
        this.d = d47Var;
    }

    public static e7 a(View view) {
        int i = R.id.confirm_txt;
        TextView textView = (TextView) zp7.a(view, R.id.confirm_txt);
        if (textView != null) {
            i = R.id.ok_button;
            TextView textView2 = (TextView) zp7.a(view, R.id.ok_button);
            if (textView2 != null) {
                i = R.id.topHolder;
                View viewA = zp7.a(view, R.id.topHolder);
                if (viewA != null) {
                    return new e7((CoordinatorLayout) view, textView, textView2, d47.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static e7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static e7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_of_address_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
