package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wy3 {
    public final LinearLayout a;
    public final ImageView b;
    public final EditText c;
    public final ImageView d;
    public final EditText e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final ImageView h;
    public final LinearLayout i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public wy3(LinearLayout linearLayout, ImageView imageView, EditText editText, ImageView imageView2, EditText editText2, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = editText;
        this.d = imageView2;
        this.e = editText2;
        this.f = linearLayout2;
        this.g = linearLayout3;
        this.h = imageView3;
        this.i = linearLayout4;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = textView4;
    }

    public static wy3 a(View view) {
        int i = R.id.backButton;
        ImageView imageView = (ImageView) zp7.a(view, R.id.backButton);
        if (imageView != null) {
            i = R.id.confirmMpinEt;
            EditText editText = (EditText) zp7.a(view, R.id.confirmMpinEt);
            if (editText != null) {
                i = R.id.confirmShowmpin;
                ImageView imageView2 = (ImageView) zp7.a(view, R.id.confirmShowmpin);
                if (imageView2 != null) {
                    i = R.id.mpinEditText;
                    EditText editText2 = (EditText) zp7.a(view, R.id.mpinEditText);
                    if (editText2 != null) {
                        i = R.id.nexgenarrow;
                        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                        if (linearLayout != null) {
                            i = R.id.nexgenlogo;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                            if (linearLayout2 != null) {
                                i = R.id.showmpin;
                                ImageView imageView3 = (ImageView) zp7.a(view, R.id.showmpin);
                                if (imageView3 != null) {
                                    i = R.id.submit;
                                    LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.submit);
                                    if (linearLayout3 != null) {
                                        i = R.id.tv_create_new;
                                        TextView textView = (TextView) zp7.a(view, R.id.tv_create_new);
                                        if (textView != null) {
                                            i = R.id.tv_enter_mpin;
                                            TextView textView2 = (TextView) zp7.a(view, R.id.tv_enter_mpin);
                                            if (textView2 != null) {
                                                i = R.id.tv_sec_mpin;
                                                TextView textView3 = (TextView) zp7.a(view, R.id.tv_sec_mpin);
                                                if (textView3 != null) {
                                                    i = R.id.tv_submit;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.tv_submit);
                                                    if (textView4 != null) {
                                                        return new wy3((LinearLayout) view, imageView, editText, imageView2, editText2, linearLayout, linearLayout2, imageView3, linearLayout3, textView, textView2, textView3, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static wy3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static wy3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.mvvm_new_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
