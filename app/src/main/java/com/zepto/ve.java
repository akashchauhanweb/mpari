package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ve {
    public final CoordinatorLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final ImageView g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final ImageView j;
    public final TextView k;
    public final RecyclerView l;
    public final LinearLayout m;
    public final TextView n;
    public final TextView o;
    public final MyTextView p;

    public ve(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView2, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView3, TextView textView2, RecyclerView recyclerView, LinearLayout linearLayout6, TextView textView3, TextView textView4, MyTextView myTextView) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
        this.e = linearLayout2;
        this.f = linearLayout3;
        this.g = imageView2;
        this.h = linearLayout4;
        this.i = linearLayout5;
        this.j = imageView3;
        this.k = textView2;
        this.l = recyclerView;
        this.m = linearLayout6;
        this.n = textView3;
        this.o = textView4;
        this.p = myTextView;
    }

    public static ve a(View view) {
        int i = R.id.Recived_rc_menu;
        LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.Recived_rc_menu);
        if (linearLayout != null) {
            i = R.id.black_shareicon;
            ImageView imageView = (ImageView) zp7.a(view, R.id.black_shareicon);
            if (imageView != null) {
                i = R.id.dash_board;
                TextView textView = (TextView) zp7.a(view, R.id.dash_board);
                if (textView != null) {
                    i = R.id.dash_board_menu;
                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.dash_board_menu);
                    if (linearLayout2 != null) {
                        i = R.id.linear_menu_bar;
                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.linear_menu_bar);
                        if (linearLayout3 != null) {
                            i = R.id.my_rc_icon;
                            ImageView imageView2 = (ImageView) zp7.a(view, R.id.my_rc_icon);
                            if (imageView2 != null) {
                                i = R.id.nexgenarrow;
                                LinearLayout linearLayout4 = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                if (linearLayout4 != null) {
                                    i = R.id.nexgenlogo;
                                    LinearLayout linearLayout5 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                    if (linearLayout5 != null) {
                                        i = R.id.recived_icon;
                                        ImageView imageView3 = (ImageView) zp7.a(view, R.id.recived_icon);
                                        if (imageView3 != null) {
                                            i = R.id.recived_rc_text;
                                            TextView textView2 = (TextView) zp7.a(view, R.id.recived_rc_text);
                                            if (textView2 != null) {
                                                i = R.id.recyclerview;
                                                RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.recyclerview);
                                                if (recyclerView != null) {
                                                    i = R.id.shared_rc_menu;
                                                    LinearLayout linearLayout6 = (LinearLayout) zp7.a(view, R.id.shared_rc_menu);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.shared_rc_text;
                                                        TextView textView3 = (TextView) zp7.a(view, R.id.shared_rc_text);
                                                        if (textView3 != null) {
                                                            i = R.id.status_txt;
                                                            TextView textView4 = (TextView) zp7.a(view, R.id.status_txt);
                                                            if (textView4 != null) {
                                                                i = R.id.tv_virt_regt_cert;
                                                                MyTextView myTextView = (MyTextView) zp7.a(view, R.id.tv_virt_regt_cert);
                                                                if (myTextView != null) {
                                                                    return new ve((CoordinatorLayout) view, linearLayout, imageView, textView, linearLayout2, linearLayout3, imageView2, linearLayout4, linearLayout5, imageView3, textView2, recyclerView, linearLayout6, textView3, textView4, myTextView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ve c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ve d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_rc_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.a;
    }
}
