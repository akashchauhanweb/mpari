package com.nic.mparivahan.AbtCntctTerms;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nic.mparivahan.AbtCntctTerms.ComplaintActivity;
import com.nic.mparivahan.R;
import com.zepto.et0;
import com.zepto.m8;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/AbtCntctTerms/ComplaintActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "str", "", "q1", "x1", "s1", "n1", "Landroid/net/Uri;", "uri", "p1", "w1", "m1", "", "value", "o1", "l1", "target", "r1", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nComplaintActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintActivity.kt\ncom/nic/mparivahan/AbtCntctTerms/ComplaintActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,662:1\n260#2:663\n79#3,22:664\n79#3,22:686\n*S KotlinDebug\n*F\n+ 1 ComplaintActivity.kt\ncom/nic/mparivahan/AbtCntctTerms/ComplaintActivity\n*L\n423#1:663\n637#1:664,22\n640#1:686,22\n*E\n"})
public final class ComplaintActivity extends pq {

    public static final class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            et0.f = String.valueOf(charSequence).length();
            int i4 = et0.f;
            m8 m8Var = null;
            if (221 <= i4 && i4 < 271) {
                m8 m8Var2 = et0.e;
                if (m8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var2 = null;
                }
                m8Var2.m.setTextColor(Color.parseColor("#ff931f"));
            } else if (et0.f > 270) {
                m8 m8Var3 = et0.e;
                if (m8Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var3 = null;
                }
                m8Var3.m.setTextColor(Color.parseColor("#ff0000"));
            } else if (et0.f < 30) {
                m8 m8Var4 = et0.e;
                if (m8Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var4 = null;
                }
                m8Var4.m.setTextColor(Color.parseColor("#ff0000"));
            } else if (et0.f <= 220) {
                m8 m8Var5 = et0.e;
                if (m8Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var5 = null;
                }
                m8Var5.m.setTextColor(Color.parseColor("#16cc4d"));
            }
            m8 m8Var6 = et0.e;
            if (m8Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                m8Var = m8Var6;
            }
            m8Var.m.setText(et0.f + "/300");
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            m8 m8Var = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            m8 m8Var2 = et0.e;
            if (m8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var2 = null;
            }
            m8Var2.g.setText((CharSequence) null);
            m8 m8Var3 = et0.e;
            if (m8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var3 = null;
            }
            m8Var3.f.setText((CharSequence) null);
            m8 m8Var4 = et0.e;
            if (m8Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var4 = null;
            }
            m8Var4.e.setText((CharSequence) null);
            if (i == 1) {
                et0.b = "search";
                m8 m8Var5 = et0.e;
                if (m8Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var5 = null;
                }
                m8Var5.j.setVisibility(0);
                ComplaintActivity complaintActivity = ComplaintActivity.this;
                ArrayAdapter arrayAdapter = new ArrayAdapter(complaintActivity, R.layout.custom_spinner_complaints, complaintActivity.getResources().getStringArray(R.array.search_complaint));
                m8 m8Var6 = et0.e;
                if (m8Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    m8Var = m8Var6;
                }
                m8Var.j.setAdapter((SpinnerAdapter) arrayAdapter);
                return;
            }
            if (i == 2) {
                et0.b = "virtual";
                m8 m8Var7 = et0.e;
                if (m8Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var7 = null;
                }
                m8Var7.j.setVisibility(0);
                ComplaintActivity complaintActivity2 = ComplaintActivity.this;
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(complaintActivity2, R.layout.custom_spinner_complaints, complaintActivity2.getResources().getStringArray(R.array.virtual_complaint));
                m8 m8Var8 = et0.e;
                if (m8Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    m8Var = m8Var8;
                }
                m8Var.j.setAdapter((SpinnerAdapter) arrayAdapter2);
                return;
            }
            if (i != 3) {
                et0.b = "Select";
                m8 m8Var9 = et0.e;
                if (m8Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var9 = null;
                }
                m8Var9.j.setVisibility(0);
                ComplaintActivity complaintActivity3 = ComplaintActivity.this;
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(complaintActivity3, R.layout.custom_spinner_complaints, complaintActivity3.getResources().getStringArray(R.array.select));
                m8 m8Var10 = et0.e;
                if (m8Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    m8Var = m8Var10;
                }
                m8Var.j.setAdapter((SpinnerAdapter) arrayAdapter3);
                return;
            }
            et0.b = "transport";
            m8 m8Var11 = et0.e;
            if (m8Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var11 = null;
            }
            m8Var11.j.setVisibility(0);
            ComplaintActivity complaintActivity4 = ComplaintActivity.this;
            ArrayAdapter arrayAdapter4 = new ArrayAdapter(complaintActivity4, R.layout.custom_spinner_complaints, complaintActivity4.getResources().getStringArray(R.array.transport_service_complaint));
            m8 m8Var12 = et0.e;
            if (m8Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                m8Var = m8Var12;
            }
            m8Var.j.setAdapter((SpinnerAdapter) arrayAdapter4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            m8 m8Var = et0.e;
            if (m8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var = null;
            }
            m8Var.g.setText((CharSequence) null);
            m8 m8Var2 = et0.e;
            if (m8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var2 = null;
            }
            m8Var2.f.setText((CharSequence) null);
            m8 m8Var3 = et0.e;
            if (m8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var3 = null;
            }
            m8Var3.e.setText((CharSequence) null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            wa3 wa3Var;
            wa3 wa3Var2;
            wa3 wa3Var3;
            wa3 wa3Var4;
            m8 m8Var;
            m8 m8Var2;
            m8 m8Var3;
            m8 m8Var4;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            m8 m8Var5 = et0.e;
            if (m8Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var5 = null;
            }
            m8Var5.g.setText((CharSequence) null);
            m8 m8Var6 = et0.e;
            if (m8Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var6 = null;
            }
            m8Var6.f.setText((CharSequence) null);
            m8 m8Var7 = et0.e;
            if (m8Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var7 = null;
            }
            m8Var7.e.setText((CharSequence) null);
            if (!StringsKt__StringsJVMKt.equals(et0.b, "transport", true)) {
                m8 m8Var8 = et0.e;
                if (m8Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var8 = null;
                }
                m8Var8.p.setVisibility(0);
                m8 m8Var9 = et0.e;
                if (m8Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var9 = null;
                }
                m8Var9.d.setVisibility(0);
                m8 m8Var10 = et0.e;
                if (m8Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var10 = null;
                }
                m8Var10.b.setVisibility(8);
                m8 m8Var11 = et0.e;
                if (m8Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var11 = null;
                }
                m8Var11.k.setVisibility(8);
                if (StringsKt__StringsJVMKt.equals(et0.b, "Search", true)) {
                    if (i == 2) {
                        m8 m8Var12 = et0.e;
                        if (m8Var12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            m8Var12 = null;
                        }
                        m8Var12.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(18)});
                        et0.q(1);
                        m8 m8Var13 = et0.e;
                        if (m8Var13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            m8Var13 = null;
                        }
                        TextInputLayout textInputLayout = m8Var13.p;
                        wa3 wa3Var5 = et0.i;
                        if (wa3Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                            wa3Var4 = null;
                        } else {
                            wa3Var4 = wa3Var5;
                        }
                        textInputLayout.setHint(wa3Var4.b("label_challan_enter_dl_no", "Enter Driving Licence No."));
                        return;
                    }
                    et0.q(0);
                    m8 m8Var14 = et0.e;
                    if (m8Var14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var14 = null;
                    }
                    m8Var14.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                    m8 m8Var15 = et0.e;
                    if (m8Var15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var15 = null;
                    }
                    TextInputLayout textInputLayout2 = m8Var15.p;
                    wa3 wa3Var6 = et0.i;
                    if (wa3Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var3 = null;
                    } else {
                        wa3Var3 = wa3Var6;
                    }
                    textInputLayout2.setHint(wa3Var3.b("enter_vehicle_no", "Enter Vehicle No."));
                    return;
                }
                if (i == 2) {
                    m8 m8Var16 = et0.e;
                    if (m8Var16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var16 = null;
                    }
                    m8Var16.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(18)});
                    et0.q(1);
                    m8 m8Var17 = et0.e;
                    if (m8Var17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var17 = null;
                    }
                    TextInputLayout textInputLayout3 = m8Var17.p;
                    wa3 wa3Var7 = et0.i;
                    if (wa3Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var2 = null;
                    } else {
                        wa3Var2 = wa3Var7;
                    }
                    textInputLayout3.setHint(wa3Var2.b("label_challan_enter_dl_no", "Enter Driving Licence No."));
                    return;
                }
                m8 m8Var18 = et0.e;
                if (m8Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var18 = null;
                }
                m8Var18.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                et0.q(0);
                m8 m8Var19 = et0.e;
                if (m8Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var19 = null;
                }
                TextInputLayout textInputLayout4 = m8Var19.p;
                wa3 wa3Var8 = et0.i;
                if (wa3Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var = null;
                } else {
                    wa3Var = wa3Var8;
                }
                textInputLayout4.setHint(wa3Var.b("enter_vehicle_no", "Enter Vehicle No."));
                return;
            }
            m8 m8Var20 = et0.e;
            if (m8Var20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var20 = null;
            }
            m8Var20.b.setVisibility(0);
            m8 m8Var21 = et0.e;
            if (m8Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var21 = null;
            }
            m8Var21.p.setVisibility(0);
            m8 m8Var22 = et0.e;
            if (m8Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var22 = null;
            }
            m8Var22.d.setVisibility(0);
            m8 m8Var23 = et0.e;
            if (m8Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var23 = null;
            }
            m8Var23.k.setVisibility(0);
            if (i == 0) {
                m8 m8Var24 = et0.e;
                if (m8Var24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var24 = null;
                }
                m8Var24.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                m8 m8Var25 = et0.e;
                if (m8Var25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var25 = null;
                }
                TextInputLayout textInputLayout5 = m8Var25.p;
                wa3 wa3Var9 = et0.i;
                if (wa3Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var9 = null;
                }
                textInputLayout5.setHint(wa3Var9.b("enter_vehicle_no", "Enter Vehicle No."));
                m8 m8Var26 = et0.e;
                if (m8Var26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var26 = null;
                }
                m8Var26.k.setVisibility(0);
                ComplaintActivity complaintActivity = ComplaintActivity.this;
                ArrayAdapter arrayAdapter = new ArrayAdapter(complaintActivity, R.layout.custom_spinner_complaints, complaintActivity.getResources().getStringArray(R.array.vehicle_related));
                m8 m8Var27 = et0.e;
                if (m8Var27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var27 = null;
                }
                TextInputLayout textInputLayout6 = m8Var27.b;
                wa3 wa3Var10 = et0.i;
                if (wa3Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var10 = null;
                }
                textInputLayout6.setHint(wa3Var10.b(va3.a.E(), "Enter Application No."));
                m8 m8Var28 = et0.e;
                if (m8Var28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var = null;
                } else {
                    m8Var = m8Var28;
                }
                m8Var.k.setAdapter((SpinnerAdapter) arrayAdapter);
                return;
            }
            if (i == 1) {
                et0.q(1);
                m8 m8Var29 = et0.e;
                if (m8Var29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var29 = null;
                }
                m8Var29.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                m8 m8Var30 = et0.e;
                if (m8Var30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var30 = null;
                }
                TextInputLayout textInputLayout7 = m8Var30.p;
                wa3 wa3Var11 = et0.i;
                if (wa3Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var11 = null;
                }
                textInputLayout7.setHint(wa3Var11.b("enter_vehicle_no", "Enter Vehicle No."));
                m8 m8Var31 = et0.e;
                if (m8Var31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var31 = null;
                }
                m8Var31.k.setVisibility(0);
                m8 m8Var32 = et0.e;
                if (m8Var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var32 = null;
                }
                m8Var32.k.setVisibility(0);
                ComplaintActivity complaintActivity2 = ComplaintActivity.this;
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(complaintActivity2, R.layout.custom_spinner_complaints, complaintActivity2.getResources().getStringArray(R.array.vehicle_related));
                m8 m8Var33 = et0.e;
                if (m8Var33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var33 = null;
                }
                TextInputLayout textInputLayout8 = m8Var33.b;
                wa3 wa3Var12 = et0.i;
                if (wa3Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var12 = null;
                }
                textInputLayout8.setHint(wa3Var12.b(va3.a.E(), "Enter Application No."));
                m8 m8Var34 = et0.e;
                if (m8Var34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var2 = null;
                } else {
                    m8Var2 = m8Var34;
                }
                m8Var2.k.setAdapter((SpinnerAdapter) arrayAdapter2);
                return;
            }
            if (i == 2) {
                m8 m8Var35 = et0.e;
                if (m8Var35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var35 = null;
                }
                m8Var35.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(18)});
                m8 m8Var36 = et0.e;
                if (m8Var36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var36 = null;
                }
                TextInputLayout textInputLayout9 = m8Var36.p;
                wa3 wa3Var13 = et0.i;
                if (wa3Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var13 = null;
                }
                textInputLayout9.setHint(wa3Var13.b("label_challan_enter_dl_no", "Enter Driving Licence No."));
                et0.q(2);
                m8 m8Var37 = et0.e;
                if (m8Var37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var37 = null;
                }
                TextInputLayout textInputLayout10 = m8Var37.b;
                wa3 wa3Var14 = et0.i;
                if (wa3Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var14 = null;
                }
                textInputLayout10.setHint(wa3Var14.b(va3.a.E(), "Enter Application No."));
                m8 m8Var38 = et0.e;
                if (m8Var38 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var38 = null;
                }
                m8Var38.k.setVisibility(0);
                ComplaintActivity complaintActivity3 = ComplaintActivity.this;
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(complaintActivity3, R.layout.custom_spinner_complaints, complaintActivity3.getResources().getStringArray(R.array.driving_licences));
                m8 m8Var39 = et0.e;
                if (m8Var39 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var3 = null;
                } else {
                    m8Var3 = m8Var39;
                }
                m8Var3.k.setAdapter((SpinnerAdapter) arrayAdapter3);
                return;
            }
            m8 m8Var40 = et0.e;
            if (m8Var40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var40 = null;
            }
            m8Var40.g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(18)});
            m8 m8Var41 = et0.e;
            if (m8Var41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var41 = null;
            }
            TextInputLayout textInputLayout11 = m8Var41.p;
            wa3 wa3Var15 = et0.i;
            if (wa3Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var15 = null;
            }
            va3.a aVar = va3.a;
            textInputLayout11.setHint(wa3Var15.b(aVar.U0(), "Enter Vehicle No. or Driving Licence No."));
            et0.q(2);
            m8 m8Var42 = et0.e;
            if (m8Var42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var42 = null;
            }
            TextInputLayout textInputLayout12 = m8Var42.b;
            wa3 wa3Var16 = et0.i;
            if (wa3Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var16 = null;
            }
            textInputLayout12.setHint(wa3Var16.b(aVar.o(), "Enter Challan No."));
            m8 m8Var43 = et0.e;
            if (m8Var43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var43 = null;
            }
            m8Var43.k.setVisibility(0);
            ComplaintActivity complaintActivity4 = ComplaintActivity.this;
            ArrayAdapter arrayAdapter4 = new ArrayAdapter(complaintActivity4, R.layout.custom_spinner_complaints, complaintActivity4.getResources().getStringArray(R.array.challan_related));
            m8 m8Var44 = et0.e;
            if (m8Var44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var4 = null;
            } else {
                m8Var4 = m8Var44;
            }
            m8Var4.k.setAdapter((SpinnerAdapter) arrayAdapter4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void t1(ComplaintActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1() && this$0.m1()) {
            this$0.w1();
        }
    }

    public static final void u1(ComplaintActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivityForResult(new Intent().setAction("android.intent.action.GET_CONTENT").setType("image/*"), 1);
    }

    public static final void v1(ComplaintActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final boolean l1(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '-') {
                i++;
            }
        }
        return i <= 4;
    }

    public final boolean m1() {
        m8 m8Var = et0.e;
        wa3 wa3Var = null;
        if (m8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var = null;
        }
        CharSequence hint = m8Var.p.getHint();
        Intrinsics.checkNotNull(hint);
        wa3 wa3Var2 = et0.i;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var2 = null;
        }
        boolean zEquals = hint.equals(wa3Var2.b("enter_vehicle_no", "Enter Vehicle No."));
        boolean z = true;
        if (zEquals) {
            m8 m8Var2 = et0.e;
            if (m8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var2 = null;
            }
            if (!o1(String.valueOf(m8Var2.g.getText()))) {
                m8 m8Var3 = et0.e;
                if (m8Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var3 = null;
                }
                m8Var3.g.setError("Please enter a valid Vehicle No.");
                wa3 wa3Var3 = et0.i;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var3 = null;
                }
                Toast.makeText(this, wa3Var3.b("label_challan_rc_validation", "Please enter Vehicle No. minimum 4 & maximum 10 characters with no special character"), 0).show();
                z = false;
            }
        } else {
            m8 m8Var4 = et0.e;
            if (m8Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var4 = null;
            }
            CharSequence hint2 = m8Var4.p.getHint();
            Intrinsics.checkNotNull(hint2);
            wa3 wa3Var4 = et0.i;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var4 = null;
            }
            if (hint2.equals(wa3Var4.b("label_challan_enter_dl_no", "Enter Driving Licence No."))) {
                m8 m8Var5 = et0.e;
                if (m8Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var5 = null;
                }
                if (!r1(String.valueOf(m8Var5.g.getText()))) {
                    m8 m8Var6 = et0.e;
                    if (m8Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var6 = null;
                    }
                    TextInputEditText textInputEditText = m8Var6.g;
                    wa3 wa3Var5 = et0.i;
                    if (wa3Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var5 = null;
                    }
                    textInputEditText.setError(wa3Var5.b("label_challan_enter_dl_no", "Enter Driving Licence No."));
                    wa3 wa3Var6 = et0.i;
                    if (wa3Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var6 = null;
                    }
                    Toast.makeText(this, wa3Var6.b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"), 0).show();
                    z = false;
                }
            } else {
                m8 m8Var7 = et0.e;
                if (m8Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var7 = null;
                }
                if (!r1(String.valueOf(m8Var7.g.getText()))) {
                    m8 m8Var8 = et0.e;
                    if (m8Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        m8Var8 = null;
                    }
                    if (!o1(String.valueOf(m8Var8.g.getText()))) {
                        m8 m8Var9 = et0.e;
                        if (m8Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            m8Var9 = null;
                        }
                        TextInputEditText textInputEditText2 = m8Var9.g;
                        wa3 wa3Var7 = et0.i;
                        if (wa3Var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                            wa3Var7 = null;
                        }
                        va3.a aVar = va3.a;
                        textInputEditText2.setError(wa3Var7.b(aVar.U0(), "Enter Vehicle No. or Driving Licence No."));
                        wa3 wa3Var8 = et0.i;
                        if (wa3Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                            wa3Var8 = null;
                        }
                        Toast.makeText(this, wa3Var8.b(aVar.U0(), "Enter Vehicle No. or Driving Licence No."), 0).show();
                        z = false;
                    }
                }
            }
        }
        m8 m8Var10 = et0.e;
        if (m8Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var10 = null;
        }
        Editable text = m8Var10.f.getText();
        if (text == null || text.length() == 0) {
            m8 m8Var11 = et0.e;
            if (m8Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var11 = null;
            }
            TextInputEditText textInputEditText3 = m8Var11.f;
            wa3 wa3Var9 = et0.i;
            if (wa3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var9;
            }
            textInputEditText3.setError(wa3Var.b(va3.a.x(), "Please give a description of your complaint"));
            return false;
        }
        m8 m8Var12 = et0.e;
        if (m8Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var12 = null;
        }
        Editable text2 = m8Var12.f.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() >= 30) {
            return z;
        }
        m8 m8Var13 = et0.e;
        if (m8Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var13 = null;
        }
        TextInputEditText textInputEditText4 = m8Var13.f;
        wa3 wa3Var10 = et0.i;
        if (wa3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var = wa3Var10;
        }
        textInputEditText4.setError(wa3Var.b(va3.a.H(), "Please write minimum 30 characters."));
        return false;
    }

    public final boolean n1() {
        m8 m8Var = et0.e;
        wa3 wa3Var = null;
        if (m8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var = null;
        }
        if (m8Var.i.getSelectedItemPosition() == 0) {
            wa3 wa3Var2 = et0.i;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(this, wa3Var.b(va3.a.q0(), "Please select the complaint type."), 0).show();
            return false;
        }
        m8 m8Var2 = et0.e;
        if (m8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var2 = null;
        }
        if (m8Var2.j.getSelectedItemPosition() == 0) {
            wa3 wa3Var3 = et0.i;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this, wa3Var.b(va3.a.t0(), "Please select the sub complaint type."), 0).show();
            return false;
        }
        m8 m8Var3 = et0.e;
        if (m8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var3 = null;
        }
        Spinner spinnerSubSubComplaint = m8Var3.k;
        Intrinsics.checkNotNullExpressionValue(spinnerSubSubComplaint, "spinnerSubSubComplaint");
        if (spinnerSubSubComplaint.getVisibility() != 0) {
            return true;
        }
        m8 m8Var4 = et0.e;
        if (m8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var4 = null;
        }
        if (m8Var4.k.getSelectedItemPosition() != 0) {
            return true;
        }
        wa3 wa3Var4 = et0.i;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var = wa3Var4;
        }
        Toast.makeText(this, wa3Var.b(va3.a.s0(), "Please select the service."), 0).show();
        return false;
    }

    public final boolean o1(CharSequence value) {
        return value.length() != 0 && value.length() >= 4 && new Regex("[a-zA-Z0-9]*").matches(value) && value.length() >= 4 && !new Regex("^[0-9]*$").matches(value) && !new Regex("[a-zA-Z]+").matches(value);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            Uri data2 = data.getData();
            Intrinsics.checkNotNull(data2);
            et0.g = data2;
            Uri uri = et0.g;
            Intrinsics.checkNotNull(uri);
            String strP1 = p1(uri);
            Intrinsics.checkNotNull(strP1);
            et0.d = strP1;
            Log.e("imageGallery Uri", et0.g + "   " + et0.d);
            m8 m8Var = et0.e;
            if (m8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var = null;
            }
            m8Var.n.setText(et0.d);
            Toast.makeText(this, "File uploaded successfully.", 0).show();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m8 m8VarC = m8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m8VarC, "inflate(...)");
        et0.e = m8VarC;
        m8 m8Var = et0.e;
        m8 m8Var2 = null;
        if (m8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var = null;
        }
        setContentView(m8Var.b());
        x1();
        et0.i = new wa3(this);
        ta3.a aVar = ta3.a;
        m8 m8Var3 = et0.e;
        if (m8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var3 = null;
        }
        aVar.h0(this, m8Var3);
        et0.h = new ws6(this);
        m8 m8Var4 = et0.e;
        if (m8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var4 = null;
        }
        m8Var4.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComplaintActivity.t1(this.a, view);
            }
        });
        m8 m8Var5 = et0.e;
        if (m8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var5 = null;
        }
        m8Var5.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ct0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComplaintActivity.u1(this.a, view);
            }
        });
        m8 m8Var6 = et0.e;
        if (m8Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var6 = null;
        }
        m8Var6.h.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComplaintActivity.v1(this.a, view);
            }
        });
        m8 m8Var7 = et0.e;
        if (m8Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m8Var2 = m8Var7;
        }
        m8Var2.f.addTextChangedListener(new a());
    }

    public final String p1(Uri uri) {
        String string = null;
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    }
                } finally {
                    Intrinsics.checkNotNull(cursorQuery);
                    cursorQuery.close();
                }
            }
        }
        if (string != null) {
            return string;
        }
        String path = uri.getPath();
        Intrinsics.checkNotNull(path);
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, '/', 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return path;
        }
        String strSubstring = path.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final boolean q1(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            iArr[cCharAt] = iArr[cCharAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            if (i2 >= 0) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (str.charAt(i2) == cArr[i3]) {
                        i4++;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
                if (i4 > 12) {
                    wa3 wa3Var = et0.i;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    Toast.makeText(this, wa3Var.b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"), 0).show();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r1(CharSequence target) {
        if (target.length() >= 10 && target.toString().length() >= 10) {
            int length = target.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) target.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            CharSequence charSequenceSubSequence = target.subSequence(i, length + 1);
            Intrinsics.checkNotNull(charSequenceSubSequence, "null cannot be cast to non-null type kotlin.String");
            if (l1((String) charSequenceSubSequence)) {
                int length2 = target.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.compare((int) target.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                CharSequence charSequenceSubSequence2 = target.subSequence(i2, length2 + 1);
                Intrinsics.checkNotNull(charSequenceSubSequence2, "null cannot be cast to non-null type kotlin.String");
                if (!q1((String) charSequenceSubSequence2)) {
                    if (!StringsKt__StringsKt.contains$default((CharSequence) target.subSequence(2, 3).toString(), (CharSequence) "-", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) target.subSequence(2, 3).toString(), (CharSequence) " ", false, 2, (Object) null)) {
                        return true;
                    }
                    new Regex(" ").replaceFirst(new Regex("-").replaceFirst(target, ""), "");
                }
            }
        }
        return false;
    }

    public final String s1() {
        String string;
        m8 m8Var = null;
        if (StringsKt__StringsJVMKt.equals(et0.b, "search", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("NextGen- ");
            sb.append(getString(R.string.app_version2));
            sb.append(" | ");
            m8 m8Var2 = et0.e;
            if (m8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var2 = null;
            }
            sb.append(m8Var2.i.getSelectedItem());
            sb.append(" | ");
            m8 m8Var3 = et0.e;
            if (m8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var3 = null;
            }
            sb.append(m8Var3.j.getSelectedItem());
            sb.append(" | ");
            m8 m8Var4 = et0.e;
            if (m8Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                m8Var = m8Var4;
            }
            sb.append((Object) m8Var.g.getText());
            string = sb.toString();
        } else if (StringsKt__StringsJVMKt.equals(et0.b, "virtual", true)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NextGen-");
            sb2.append(getString(R.string.app_version2));
            sb2.append(" | ");
            m8 m8Var5 = et0.e;
            if (m8Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var5 = null;
            }
            sb2.append(m8Var5.j.getSelectedItem());
            sb2.append(" | ");
            m8 m8Var6 = et0.e;
            if (m8Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                m8Var = m8Var6;
            }
            sb2.append((Object) m8Var.g.getText());
            string = sb2.toString();
        } else {
            m8 m8Var7 = et0.e;
            if (m8Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                m8Var7 = null;
            }
            Editable text = m8Var7.e.getText();
            if (text == null || text.length() == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("NextGen-");
                sb3.append(getString(R.string.app_version2));
                sb3.append(" | ");
                m8 m8Var8 = et0.e;
                if (m8Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var8 = null;
                }
                sb3.append(m8Var8.k.getSelectedItem());
                sb3.append(" | ");
                m8 m8Var9 = et0.e;
                if (m8Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    m8Var = m8Var9;
                }
                sb3.append((Object) m8Var.g.getText());
                sb3.append(' ');
                string = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("NextGen-");
                sb4.append(getString(R.string.app_version2));
                sb4.append(" | ");
                m8 m8Var10 = et0.e;
                if (m8Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var10 = null;
                }
                sb4.append(m8Var10.k.getSelectedItem());
                sb4.append(" | ");
                m8 m8Var11 = et0.e;
                if (m8Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    m8Var11 = null;
                }
                sb4.append((Object) m8Var11.g.getText());
                sb4.append(" | ");
                m8 m8Var12 = et0.e;
                if (m8Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    m8Var = m8Var12;
                }
                sb4.append((Object) m8Var.e.getText());
                string = sb4.toString();
            }
        }
        et0.a = string;
        return et0.a;
    }

    public final void w1() {
        String strS1 = s1();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        if (et0.g != null) {
            intent.putExtra("android.intent.extra.STREAM", et0.g);
        }
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"helpdesk-mparivahan@gov.in"});
        intent.putExtra("android.intent.extra.SUBJECT", strS1);
        StringBuilder sb = new StringBuilder();
        sb.append("Dear Team,\n \n \n \n");
        m8 m8Var = et0.e;
        ws6 ws6Var = null;
        if (m8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var = null;
        }
        sb.append((Object) m8Var.f.getText());
        sb.append(" \n \n \n \n Thanks and regards \n");
        ws6 ws6Var2 = et0.h;
        if (ws6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var2 = null;
        }
        sb.append(ws6Var2.n());
        sb.append(" \n");
        ws6 ws6Var3 = et0.h;
        if (ws6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        } else {
            ws6Var = ws6Var3;
        }
        sb.append(ws6Var.l());
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, ""));
    }

    public final void x1() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.custom_spinner_complaints, getResources().getStringArray(R.array.complaints_type));
        m8 m8Var = et0.e;
        m8 m8Var2 = null;
        if (m8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var = null;
        }
        m8Var.i.setAdapter((SpinnerAdapter) arrayAdapter);
        m8 m8Var3 = et0.e;
        if (m8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var3 = null;
        }
        m8Var3.i.setOnItemSelectedListener(new b());
        m8 m8Var4 = et0.e;
        if (m8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8Var4 = null;
        }
        m8Var4.k.setOnItemSelectedListener(new c());
        m8 m8Var5 = et0.e;
        if (m8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m8Var2 = m8Var5;
        }
        m8Var2.j.setOnItemSelectedListener(new d());
    }
}
