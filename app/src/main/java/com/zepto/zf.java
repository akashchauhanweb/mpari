package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zf {
    public final CoordinatorLayout a;
    public final TextView b;
    public final LinearLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final TextView i;
    public final LinearLayout j;
    public final RecyclerView k;
    public final RecyclerView l;
    public final RelativeLayout m;
    public final TextView n;
    public final View o;

    public zf(CoordinatorLayout coordinatorLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView4, LinearLayout linearLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, RelativeLayout relativeLayout, TextView textView5, View view) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = linearLayout;
        this.d = imageView;
        this.e = textView2;
        this.f = textView3;
        this.g = linearLayout2;
        this.h = linearLayout3;
        this.i = textView4;
        this.j = linearLayout4;
        this.k = recyclerView;
        this.l = recyclerView2;
        this.m = relativeLayout;
        this.n = textView5;
        this.o = view;
    }

    public static zf a(View view) {
        int i = R.id.clear_all;
        TextView textView = (TextView) zp7.a(view, R.id.clear_all);
        if (textView != null) {
            i = R.id.dl_rec_search;
            LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.dl_rec_search);
            if (linearLayout != null) {
                i = R.id.iv_image;
                ImageView imageView = (ImageView) zp7.a(view, R.id.iv_image);
                if (imageView != null) {
                    i = R.id.lableService;
                    TextView textView2 = (TextView) zp7.a(view, R.id.lableService);
                    if (textView2 != null) {
                        i = R.id.my_transations;
                        TextView textView3 = (TextView) zp7.a(view, R.id.my_transations);
                        if (textView3 != null) {
                            i = R.id.nexgenarrow;
                            LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                            if (linearLayout2 != null) {
                                i = R.id.nexgenlogo;
                                LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                if (linearLayout3 != null) {
                                    i = R.id.nofounf;
                                    TextView textView4 = (TextView) zp7.a(view, R.id.nofounf);
                                    if (textView4 != null) {
                                        i = R.id.rc_rec_search;
                                        LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.rc_rec_search);
                                        if (linearLayout4 != null) {
                                            i = R.id.rec_dl_recycler;
                                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.rec_dl_recycler);
                                            if (recyclerView != null) {
                                                i = R.id.rec_rc_recycler;
                                                RecyclerView recyclerView2 = (RecyclerView) zp7.a(view, R.id.rec_rc_recycler);
                                                if (recyclerView2 != null) {
                                                    i = R.id.rl_notransaction;
                                                    RelativeLayout relativeLayout = (RelativeLayout) zp7.a(view, R.id.rl_notransaction);
                                                    if (relativeLayout != null) {
                                                        i = R.id.title_name;
                                                        TextView textView5 = (TextView) zp7.a(view, R.id.title_name);
                                                        if (textView5 != null) {
                                                            i = R.id.view;
                                                            View viewA = zp7.a(view, R.id.view);
                                                            if (viewA != null) {
                                                                return new zf((CoordinatorLayout) view, textView, linearLayout, imageView, textView2, textView3, linearLayout2, linearLayout3, textView4, linearLayout4, recyclerView, recyclerView2, relativeLayout, textView5, viewA);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static zf c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static zf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
