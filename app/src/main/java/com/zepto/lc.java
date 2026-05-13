package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lc {
    public final ScrollView a;
    public final RadioButton b;
    public final CheckBox c;
    public final EditText d;
    public final vy3 e;
    public final RadioGroup f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final RadioButton j;

    public lc(ScrollView scrollView, RadioButton radioButton, CheckBox checkBox, EditText editText, vy3 vy3Var, RadioGroup radioGroup, TextView textView, TextView textView2, TextView textView3, RadioButton radioButton2) {
        this.a = scrollView;
        this.b = radioButton;
        this.c = checkBox;
        this.d = editText;
        this.e = vy3Var;
        this.f = radioGroup;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = radioButton2;
    }

    public static lc a(View view) {
        int i = R.id.adharRadio;
        RadioButton radioButton = (RadioButton) zp7.a(view, R.id.adharRadio);
        if (radioButton != null) {
            i = R.id.decKyc;
            CheckBox checkBox = (CheckBox) zp7.a(view, R.id.decKyc);
            if (checkBox != null) {
                i = R.id.et_otp;
                EditText editText = (EditText) zp7.a(view, R.id.et_otp);
                if (editText != null) {
                    i = R.id.mvvmId;
                    View viewA = zp7.a(view, R.id.mvvmId);
                    if (viewA != null) {
                        vy3 vy3VarA = vy3.a(viewA);
                        i = R.id.radioGroup_id;
                        RadioGroup radioGroup = (RadioGroup) zp7.a(view, R.id.radioGroup_id);
                        if (radioGroup != null) {
                            i = R.id.txt_dl_number;
                            TextView textView = (TextView) zp7.a(view, R.id.txt_dl_number);
                            if (textView != null) {
                                i = R.id.txt_reset;
                                TextView textView2 = (TextView) zp7.a(view, R.id.txt_reset);
                                if (textView2 != null) {
                                    i = R.id.txt_service_submit;
                                    TextView textView3 = (TextView) zp7.a(view, R.id.txt_service_submit);
                                    if (textView3 != null) {
                                        i = R.id.vidRadio;
                                        RadioButton radioButton2 = (RadioButton) zp7.a(view, R.id.vidRadio);
                                        if (radioButton2 != null) {
                                            return new lc((ScrollView) view, radioButton, checkBox, editText, vy3VarA, radioGroup, textView, textView2, textView3, radioButton2);
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

    public static lc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static lc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ll_adhar_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.a;
    }
}
