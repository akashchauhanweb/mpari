package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.MovableFloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class le {
    public final ConstraintLayout a;
    public final TextView b;
    public final FloatingActionButton c;
    public final FloatingActionButton d;
    public final TextView e;
    public final MovableFloatingActionButton f;
    public final RecyclerView g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final TextView k;
    public final ImageView l;
    public final TextView m;

    public le(ConstraintLayout constraintLayout, TextView textView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, TextView textView2, MovableFloatingActionButton movableFloatingActionButton, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView3, ImageView imageView, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = floatingActionButton;
        this.d = floatingActionButton2;
        this.e = textView2;
        this.f = movableFloatingActionButton;
        this.g = recyclerView;
        this.h = linearLayout;
        this.i = linearLayout2;
        this.j = linearLayout3;
        this.k = textView3;
        this.l = imageView;
        this.m = textView4;
    }

    public static le a(View view) {
        int i = R.id.add_alarm_action_text;
        TextView textView = (TextView) zp7.a(view, R.id.add_alarm_action_text);
        if (textView != null) {
            i = R.id.add_alarm_fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) zp7.a(view, R.id.add_alarm_fab);
            if (floatingActionButton != null) {
                i = R.id.add_fab;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) zp7.a(view, R.id.add_fab);
                if (floatingActionButton2 != null) {
                    i = R.id.add_person_action_text;
                    TextView textView2 = (TextView) zp7.a(view, R.id.add_person_action_text);
                    if (textView2 != null) {
                        i = R.id.add_person_fab;
                        MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton) zp7.a(view, R.id.add_person_fab);
                        if (movableFloatingActionButton != null) {
                            i = R.id.contactRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) zp7.a(view, R.id.contactRecyclerView);
                            if (recyclerView != null) {
                                i = R.id.nexgenarrow;
                                LinearLayout linearLayout = (LinearLayout) zp7.a(view, R.id.nexgenarrow);
                                if (linearLayout != null) {
                                    i = R.id.nexgenlogo;
                                    LinearLayout linearLayout2 = (LinearLayout) zp7.a(view, R.id.nexgenlogo);
                                    if (linearLayout2 != null) {
                                        i = R.id.recycle_linear;
                                        LinearLayout linearLayout3 = (LinearLayout) zp7.a(view, R.id.recycle_linear);
                                        if (linearLayout3 != null) {
                                            i = R.id.service_label;
                                            TextView textView3 = (TextView) zp7.a(view, R.id.service_label);
                                            if (textView3 != null) {
                                                i = R.id.shared_rc;
                                                ImageView imageView = (ImageView) zp7.a(view, R.id.shared_rc);
                                                if (imageView != null) {
                                                    i = R.id.tv_manage_emerg_contact;
                                                    TextView textView4 = (TextView) zp7.a(view, R.id.tv_manage_emerg_contact);
                                                    if (textView4 != null) {
                                                        return new le((ConstraintLayout) view, textView, floatingActionButton, floatingActionButton2, textView2, movableFloatingActionButton, recyclerView, linearLayout, linearLayout2, linearLayout3, textView3, imageView, textView4);
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

    public static le c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static le d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_passanger_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
