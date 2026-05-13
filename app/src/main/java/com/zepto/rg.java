package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rg {
    public final LinearLayout a;
    public final TextView b;
    public final EditText c;
    public final TextView d;
    public final TextView e;
    public final vy3 f;
    public final ImageButton g;
    public final LinearLayout h;
    public final ProgressBar i;
    public final TextView j;
    public final TextView k;
    public final TextView l;

    public rg(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2, TextView textView3, vy3 vy3Var, ImageButton imageButton, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView4, TextView textView5, TextView textView6) {
        this.a = linearLayout;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
        this.e = textView3;
        this.f = vy3Var;
        this.g = imageButton;
        this.h = linearLayout2;
        this.i = progressBar;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
    }

    public static rg a(View view) {
        int i = R.id.btn_feedback;
        TextView textView = (TextView) zp7.a(view, R.id.btn_feedback);
        if (textView != null) {
            i = R.id.editTextTextMultiLine;
            EditText editText = (EditText) zp7.a(view, R.id.editTextTextMultiLine);
            if (editText != null) {
                i = R.id.ev_email_id;
                TextView textView2 = (TextView) zp7.a(view, R.id.ev_email_id);
                if (textView2 != null) {
                    i = R.id.ev_name;
                    TextView textView3 = (TextView) zp7.a(view, R.id.ev_name);
                    if (textView3 != null) {
                        i = R.id.header_acc_feed;
                        View viewA = zp7.a(view, R.id.header_acc_feed);
                        if (viewA != null) {
                            vy3 vy3VarA = vy3.a(viewA);
                            i = R.id.ib_add_image;
                            ImageButton imageButton = (ImageButton) zp7.a(view, R.id.ib_add_image);
                            if (imageButton != null) {
                                i = R.id.ll_image;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.ll_image);
                                if (linearLayout != null) {
                                    i = R.id.traffic_feedback_progress;
                                    ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.traffic_feedback_progress);
                                    if (progressBar != null) {
                                        i = R.id.tv_description;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.tv_description);
                                        if (textView4 != null) {
                                            i = R.id.tv_email_id;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_email_id);
                                            if (textView5 != null) {
                                                i = R.id.tv_name;
                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_name);
                                                if (textView6 != null) {
                                                    return new rg((LinearLayout) view, textView, editText, textView2, textView3, vy3VarA, imageButton, linearLayout, progressBar, textView4, textView5, textView6);
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

    public static rg c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static rg d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_traffic_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
