package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class zc {
    public final ScrollView a;
    public final RadioButton b;
    public final MyTextView c;
    public final TextView d;
    public final CheckBox e;
    public final FrameLayout f;
    public final EditText g;
    public final iy3 h;
    public final vy3 i;
    public final RadioGroup j;
    public final ImageView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final RadioButton o;

    public zc(ScrollView scrollView, RadioButton radioButton, MyTextView myTextView, TextView textView, CheckBox checkBox, FrameLayout frameLayout, EditText editText, iy3 iy3Var, vy3 vy3Var, RadioGroup radioGroup, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, RadioButton radioButton2) {
        this.a = scrollView;
        this.b = radioButton;
        this.c = myTextView;
        this.d = textView;
        this.e = checkBox;
        this.f = frameLayout;
        this.g = editText;
        this.h = iy3Var;
        this.i = vy3Var;
        this.j = radioGroup;
        this.k = imageView;
        this.l = textView2;
        this.m = textView3;
        this.n = textView4;
        this.o = radioButton2;
    }

    public static zc a(View view) {
        int i = R.id.adharRadio;
        RadioButton radioButton = (RadioButton) zp7.a(view, R.id.adharRadio);
        if (radioButton != null) {
            i = R.id.adhar_term;
            MyTextView myTextView = (MyTextView) zp7.a(view, R.id.adhar_term);
            if (myTextView != null) {
                i = R.id.adhr_vid_txt;
                TextView textView = (TextView) zp7.a(view, R.id.adhr_vid_txt);
                if (textView != null) {
                    i = R.id.decKyc;
                    CheckBox checkBox = (CheckBox) zp7.a(view, R.id.decKyc);
                    if (checkBox != null) {
                        i = R.id.entermpin_layout;
                        FrameLayout frameLayout = (FrameLayout) zp7.a(view, R.id.entermpin_layout);
                        if (frameLayout != null) {
                            i = R.id.et_otp;
                            EditText editText = (EditText) zp7.a(view, R.id.et_otp);
                            if (editText != null) {
                                i = R.id.multi_head;
                                View viewA = zp7.a(view, R.id.multi_head);
                                if (viewA != null) {
                                    iy3 iy3VarA = iy3.a(viewA);
                                    i = R.id.mvvmId;
                                    View viewA2 = zp7.a(view, R.id.mvvmId);
                                    if (viewA2 != null) {
                                        vy3 vy3VarA = vy3.a(viewA2);
                                        i = R.id.radioGroup_id;
                                        RadioGroup radioGroup = (RadioGroup) zp7.a(view, R.id.radioGroup_id);
                                        if (radioGroup != null) {
                                            i = R.id.showmpin;
                                            ImageView imageView = (ImageView) zp7.a(view, R.id.showmpin);
                                            if (imageView != null) {
                                                i = R.id.txt_dl_number;
                                                TextView textView2 = (TextView) zp7.a(view, R.id.txt_dl_number);
                                                if (textView2 != null) {
                                                    i = R.id.txt_reset;
                                                    TextView textView3 = (TextView) zp7.a(view, R.id.txt_reset);
                                                    if (textView3 != null) {
                                                        i = R.id.txt_service_submit;
                                                        TextView textView4 = (TextView) zp7.a(view, R.id.txt_service_submit);
                                                        if (textView4 != null) {
                                                            i = R.id.vidRadio;
                                                            RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vidRadio);
                                                            if (radioButton2 != null) {
                                                                return new zc((ScrollView) view, radioButton, myTextView, textView, checkBox, frameLayout, editText, iy3VarA, vy3VarA, radioGroup, imageView, textView2, textView3, textView4, radioButton2);
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

    public static zc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static zc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ll_mob_update_adhar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
