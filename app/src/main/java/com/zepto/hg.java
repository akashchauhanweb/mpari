package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hg {
    public final CoordinatorLayout a;
    public final ImageView b;
    public final AppCompatSpinner c;
    public final LinearLayout d;
    public final ImageView e;
    public final EditText f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final TextView i;
    public final TextView j;
    public final LinearLayout k;
    public final TextView l;
    public final TextView m;

    public hg(CoordinatorLayout coordinatorLayout, ImageView imageView, AppCompatSpinner appCompatSpinner, LinearLayout linearLayout, ImageView imageView2, EditText editText, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = appCompatSpinner;
        this.d = linearLayout;
        this.e = imageView2;
        this.f = editText;
        this.g = linearLayout2;
        this.h = linearLayout3;
        this.i = textView;
        this.j = textView2;
        this.k = linearLayout4;
        this.l = textView3;
        this.m = textView4;
    }

    public static hg a(View view) {
        int i = R.id.down_arrow;
        ImageView imageView = (ImageView) zp7.a(view, R.id.down_arrow);
        if (imageView != null) {
            i = R.id.duration_spinner;
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) zp7.a(view, R.id.duration_spinner);
            if (appCompatSpinner != null) {
                i = R.id.edit_text_container;
                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.edit_text_container);
                if (linearLayout != null) {
                    i = R.id.head_img;
                    ImageView imageView2 = (ImageView) zp7.a(view, R.id.head_img);
                    if (imageView2 != null) {
                        i = R.id.mobile_number;
                        EditText editText = (EditText) zp7.a(view, R.id.mobile_number);
                        if (editText != null) {
                            i = R.id.nexgenarrow;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                            if (linearLayout2 != null) {
                                i = R.id.nexgenlogo;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                if (linearLayout3 != null) {
                                    i = R.id.rc_no_txt;
                                    TextView textView = (TextView) zp7.a(view, R.id.rc_no_txt);
                                    if (textView != null) {
                                        i = R.id.shared_button;
                                        TextView textView2 = (TextView) zp7.a(view, R.id.shared_button);
                                        if (textView2 != null) {
                                            i = R.id.spinner_body;
                                            LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.spinner_body);
                                            if (linearLayout4 != null) {
                                                i = R.id.tv_share_rc;
                                                TextView textView3 = (TextView) zp7.a(view, R.id.tv_share_rc);
                                                if (textView3 != null) {
                                                    i = R.id.vahan_service_lable;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.vahan_service_lable);
                                                    if (textView4 != null) {
                                                        return new hg((CoordinatorLayout) view, imageView, appCompatSpinner, linearLayout, imageView2, editText, linearLayout2, linearLayout3, textView, textView2, linearLayout4, textView3, textView4);
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

    public static hg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static hg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_shared_rc_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
