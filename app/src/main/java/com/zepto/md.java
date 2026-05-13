package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class md {
    public final LinearLayout a;
    public final FragmentContainerView b;
    public final ImageView c;

    public md(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, ImageView imageView) {
        this.a = linearLayout;
        this.b = fragmentContainerView;
        this.c = imageView;
    }

    public static md a(View view) {
        int i = R.id.main_activity_fragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) zp7.a(view, R.id.main_activity_fragmentContainer);
        if (fragmentContainerView != null) {
            i = R.id.mvvm_back;
            ImageView imageView = (ImageView) zp7.a(view, R.id.mvvm_back);
            if (imageView != null) {
                return new md((LinearLayout) view, fragmentContainerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static md c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static md d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
