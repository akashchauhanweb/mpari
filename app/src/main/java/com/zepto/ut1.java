package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ut1 {
    public final NestedScrollView a;
    public final TextView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;
    public final NestedScrollView i;
    public final TextView j;
    public final d47 k;
    public final TextView l;
    public final LinearLayout m;
    public final TextView n;

    public ut1(NestedScrollView nestedScrollView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, NestedScrollView nestedScrollView2, TextView textView6, d47 d47Var, TextView textView7, LinearLayout linearLayout2, TextView textView8) {
        this.a = nestedScrollView;
        this.b = textView;
        this.c = linearLayout;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = imageView;
        this.h = textView5;
        this.i = nestedScrollView2;
        this.j = textView6;
        this.k = d47Var;
        this.l = textView7;
        this.m = linearLayout2;
        this.n = textView8;
    }

    public static ut1 a(View view) {
        int i = R.id.address;
        TextView textView = (TextView) zp7.a(view, R.id.address);
        if (textView != null) {
            i = R.id.dlHolder;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.dlHolder);
            if (linearLayout != null) {
                i = R.id.dlNo;
                TextView textView2 = (TextView) zp7.a(view, R.id.dlNo);
                if (textView2 != null) {
                    i = R.id.issue_date;
                    TextView textView3 = (TextView) zp7.a(view, R.id.issue_date);
                    if (textView3 != null) {
                        i = R.id.ntValidUpTodate;
                        TextView textView4 = (TextView) zp7.a(view, R.id.ntValidUpTodate);
                        if (textView4 != null) {
                            i = R.id.option_menu;
                            ImageView imageView = (ImageView) zp7.a(view, R.id.option_menu);
                            if (imageView != null) {
                                i = R.id.owner_name;
                                TextView textView5 = (TextView) zp7.a(view, R.id.owner_name);
                                if (textView5 != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                                    i = R.id.status_txt;
                                    TextView textView6 = (TextView) zp7.a(view, R.id.status_txt);
                                    if (textView6 != null) {
                                        i = R.id.topHolder;
                                        View viewA = zp7.a(view, R.id.topHolder);
                                        if (viewA != null) {
                                            d47 d47VarA = d47.a(viewA);
                                            i = R.id.trValidUpto;
                                            TextView textView7 = (TextView) zp7.a(view, R.id.trValidUpto);
                                            if (textView7 != null) {
                                                i = R.id.transport_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.transport_layout);
                                                if (linearLayout2 != null) {
                                                    i = R.id.virtualRcTv;
                                                    TextView textView8 = (TextView) zp7.a(view, R.id.virtualRcTv);
                                                    if (textView8 != null) {
                                                        return new ut1(nestedScrollView, textView, linearLayout, textView2, textView3, textView4, imageView, textView5, nestedScrollView, textView6, d47VarA, textView7, linearLayout2, textView8);
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

    public static ut1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ut1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.doc_virtual_dl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public NestedScrollView b() {
        return this.a;
    }
}
