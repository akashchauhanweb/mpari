package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d07 {
    public final CoordinatorLayout a;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;
    public final TextView f;
    public final d47 g;

    public d07(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, d47 d47Var) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textView2;
        this.d = constraintLayout;
        this.e = textView3;
        this.f = textView4;
        this.g = d47Var;
    }

    public static d07 a(View view) {
        int i = R.id.appl_status_link;
        TextView textView = (TextView) zp7.a(view, R.id.appl_status_link);
        if (textView != null) {
            i = R.id.confirm_txt;
            TextView textView2 = (TextView) zp7.a(view, R.id.confirm_txt);
            if (textView2 != null) {
                i = R.id.container_cl;
                ConstraintLayout constraintLayout = (ConstraintLayout) zp7.a(view, R.id.container_cl);
                if (constraintLayout != null) {
                    i = R.id.ok_button;
                    TextView textView3 = (TextView) zp7.a(view, R.id.ok_button);
                    if (textView3 != null) {
                        i = R.id.save_as_image;
                        TextView textView4 = (TextView) zp7.a(view, R.id.save_as_image);
                        if (textView4 != null) {
                            i = R.id.topHolder;
                            View viewA = zp7.a(view, R.id.topHolder);
                            if (viewA != null) {
                                return new d07((CoordinatorLayout) view, textView, textView2, constraintLayout, textView3, textView4, d47.a(viewA));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static d07 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d07 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.vahan_confirmation_faceless, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
