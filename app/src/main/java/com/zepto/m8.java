package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m8 {
    public final LinearLayout a;
    public final TextInputLayout b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final TextInputEditText e;
    public final TextInputEditText f;
    public final TextInputEditText g;
    public final vy3 h;
    public final Spinner i;
    public final Spinner j;
    public final Spinner k;
    public final TextInputLayout l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextInputLayout p;

    public m8(LinearLayout linearLayout, TextInputLayout textInputLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, vy3 vy3Var, Spinner spinner, Spinner spinner2, Spinner spinner3, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextInputLayout textInputLayout3) {
        this.a = linearLayout;
        this.b = textInputLayout;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = textInputEditText;
        this.f = textInputEditText2;
        this.g = textInputEditText3;
        this.h = vy3Var;
        this.i = spinner;
        this.j = spinner2;
        this.k = spinner3;
        this.l = textInputLayout2;
        this.m = textView;
        this.n = textView2;
        this.o = textView3;
        this.p = textInputLayout3;
    }

    public static m8 a(View view) {
        int i = R.id.applicationNumberLayout;
        TextInputLayout textInputLayout = (TextInputLayout) zp7.a(view, R.id.applicationNumberLayout);
        if (textInputLayout != null) {
            i = R.id.btn_attach;
            MaterialButton materialButton = (MaterialButton) zp7.a(view, R.id.btn_attach);
            if (materialButton != null) {
                i = R.id.btn_raise_complaint;
                MaterialButton materialButton2 = (MaterialButton) zp7.a(view, R.id.btn_raise_complaint);
                if (materialButton2 != null) {
                    i = R.id.et_application_number;
                    TextInputEditText textInputEditText = (TextInputEditText) zp7.a(view, R.id.et_application_number);
                    if (textInputEditText != null) {
                        i = R.id.et_remarks;
                        TextInputEditText textInputEditText2 = (TextInputEditText) zp7.a(view, R.id.et_remarks);
                        if (textInputEditText2 != null) {
                            i = R.id.et_vehicle_number;
                            TextInputEditText textInputEditText3 = (TextInputEditText) zp7.a(view, R.id.et_vehicle_number);
                            if (textInputEditText3 != null) {
                                i = R.id.mvvHeader;
                                View viewA = zp7.a(view, R.id.mvvHeader);
                                if (viewA != null) {
                                    vy3 vy3VarA = vy3.a(viewA);
                                    i = R.id.spinner_complaint_type;
                                    Spinner spinner = (Spinner) zp7.a(view, R.id.spinner_complaint_type);
                                    if (spinner != null) {
                                        i = R.id.spinner_sub_complaint;
                                        Spinner spinner2 = (Spinner) zp7.a(view, R.id.spinner_sub_complaint);
                                        if (spinner2 != null) {
                                            i = R.id.spinner_sub_sub_complaint;
                                            Spinner spinner3 = (Spinner) zp7.a(view, R.id.spinner_sub_sub_complaint);
                                            if (spinner3 != null) {
                                                i = R.id.textInputLayoutDescription;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) zp7.a(view, R.id.textInputLayoutDescription);
                                                if (textInputLayout2 != null) {
                                                    i = R.id.tvDescriptionLetterCounter;
                                                    TextView textView = (TextView) zp7.a(view, R.id.tvDescriptionLetterCounter);
                                                    if (textView != null) {
                                                        i = R.id.tv_file_name;
                                                        TextView textView2 = (TextView) zp7.a(view, R.id.tv_file_name);
                                                        if (textView2 != null) {
                                                            i = R.id.txtRasieComp;
                                                            TextView textView3 = (TextView) zp7.a(view, R.id.txtRasieComp);
                                                            if (textView3 != null) {
                                                                i = R.id.vehicleNumberLayout;
                                                                TextInputLayout textInputLayout3 = (TextInputLayout) zp7.a(view, R.id.vehicleNumberLayout);
                                                                if (textInputLayout3 != null) {
                                                                    return new m8((LinearLayout) view, textInputLayout, materialButton, materialButton2, textInputEditText, textInputEditText2, textInputEditText3, vy3VarA, spinner, spinner2, spinner3, textInputLayout2, textView, textView2, textView3, textInputLayout3);
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

    public static m8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static m8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_complaint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.a;
    }
}
