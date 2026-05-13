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
public final class d6 {
    public final LinearLayout a;
    public final ProgressBar b;
    public final TextView c;
    public final EditText d;
    public final TextView e;
    public final TextView f;
    public final vy3 g;
    public final ImageButton h;
    public final LinearLayout i;
    public final TextView j;
    public final TextView k;
    public final TextView l;

    public d6(LinearLayout linearLayout, ProgressBar progressBar, TextView textView, EditText editText, TextView textView2, TextView textView3, vy3 vy3Var, ImageButton imageButton, LinearLayout linearLayout2, TextView textView4, TextView textView5, TextView textView6) {
        this.a = linearLayout;
        this.b = progressBar;
        this.c = textView;
        this.d = editText;
        this.e = textView2;
        this.f = textView3;
        this.g = vy3Var;
        this.h = imageButton;
        this.i = linearLayout2;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
    }

    public static d6 a(View view) {
        int i = R.id.acc_feed_progress;
        ProgressBar progressBar = (ProgressBar) zp7.a(view, R.id.acc_feed_progress);
        if (progressBar != null) {
            i = R.id.btn_feedback;
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
                                        i = R.id.tv_description;
                                        TextView textView4 = (TextView) zp7.a(view, R.id.tv_description);
                                        if (textView4 != null) {
                                            i = R.id.tv_email_id;
                                            TextView textView5 = (TextView) zp7.a(view, R.id.tv_email_id);
                                            if (textView5 != null) {
                                                i = R.id.tv_name;
                                                TextView textView6 = (TextView) zp7.a(view, R.id.tv_name);
                                                if (textView6 != null) {
                                                    return new d6((LinearLayout) view, progressBar, textView, editText, textView2, textView3, vy3VarA, imageButton, linearLayout, textView4, textView5, textView6);
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

    public static d6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_accident_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
