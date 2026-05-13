package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ql6 {
    public final CoordinatorLayout a;
    public final TextView b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;
    public final d47 f;

    public ql6(CoordinatorLayout coordinatorLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, d47 d47Var) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = constraintLayout;
        this.d = textView2;
        this.e = textView3;
        this.f = d47Var;
    }

    public static ql6 a(View view) {
        int i = R.id.confirm_txt;
        TextView textView = (TextView) zp7.a(view, R.id.confirm_txt);
        if (textView != null) {
            i = R.id.container_cl;
            ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.container_cl);
            if (constraintLayout != null) {
                i = R.id.home;
                TextView textView2 = (TextView) zp7.a(view, R.id.home);
                if (textView2 != null) {
                    i = R.id.ok_button;
                    TextView textView3 = (TextView) zp7.a(view, R.id.ok_button);
                    if (textView3 != null) {
                        i = R.id.topHolder;
                        View viewA = zp7.a(view, R.id.topHolder);
                        if (viewA != null) {
                            return new ql6((CoordinatorLayout) view, textView, constraintLayout, textView2, textView3, d47.a(viewA));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ql6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ql6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.tranfer_of_owner_ship_confirmation_seller, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
