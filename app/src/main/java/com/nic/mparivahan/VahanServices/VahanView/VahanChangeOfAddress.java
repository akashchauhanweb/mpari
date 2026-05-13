package com.nic.mparivahan.VahanServices.VahanView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ChangeOfAddressConfirmation;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanChangeOfAddress;
import com.zepto.dh;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bz\u0010{J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eR\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010O\u001a\n H*\u0004\u0018\u00010G0G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010[\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\u0019\u001a\u0004\bY\u0010\u001b\"\u0004\bZ\u0010\u001dR\"\u0010_\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010\u0019\u001a\u0004\b]\u0010\u001b\"\u0004\b^\u0010\u001dR\"\u0010c\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010\u0019\u001a\u0004\ba\u0010\u001b\"\u0004\bb\u0010\u001dR\"\u0010g\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010\u0019\u001a\u0004\be\u0010\u001b\"\u0004\bf\u0010\u001dR\"\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010\u0019\u001a\u0004\bi\u0010\u001b\"\u0004\bj\u0010\u001dR\"\u0010n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanChangeOfAddress;", "Lcom/zepto/pq;", "", "j2", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "State_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "list", "Q1", "Landroid/content/Context;", "context", "message", "k2", "C1", "C", "Ljava/lang/String;", "N1", "()Ljava/lang/String;", "u2", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/dh;", "E", "Lcom/zepto/dh;", "H1", "()Lcom/zepto/dh;", "o2", "(Lcom/zepto/dh;)V", "binding", "Lcom/zepto/ld7;", "F", "Lcom/zepto/ld7;", "R1", "()Lcom/zepto/ld7;", "x2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "w2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "M1", "()Landroid/app/ProgressDialog;", "t2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "I", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "p2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;)V", "change_ofAddress", "K", "getState_code", "setState_code", "state_code", "L", "J1", "q2", "formated_date", "M", "L1", "s2", "off_code", "N", "G1", "n2", "aadhar_name", "O", "F1", "m2", "aadhar_address", "P", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "K1", "()Lcom/zepto/wa3;", "r2", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanChangeOfAddress extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public dh binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ChaangeOfAddressStatus change_ofAddress;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (VahanChangeOfAddress.this.H1().K.getSelectedItemPosition() != 0) {
                VahanChangeOfAddress.this.M1().show();
                Object selectedItem = VahanChangeOfAddress.this.H1().K.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanChangeOfAddress.this.R1().r1(VahanChangeOfAddress.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (VahanChangeOfAddress.this.H1().E.getSelectedItemPosition() != 0) {
                VahanChangeOfAddress.this.M1().show();
                Object selectedItem = VahanChangeOfAddress.this.H1().E.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanChangeOfAddress.this.R1().s1(VahanChangeOfAddress.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void D1(Dialog d, VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void E1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void S1(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.N1());
        intent.putExtra("RcDetails", this$0.O1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.G1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.F1());
        this$0.startActivity(intent);
    }

    public static final void T1(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1(this$0, this$0.K1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void U1(VahanChangeOfAddress this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.H1().D.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void V1(VahanChangeOfAddress this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    public static final void W1(VahanChangeOfAddress this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.q2(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.H1().Q.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void X1(VahanChangeOfAddress this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void Y1(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.H1().g.getText().toString();
        String string2 = this$0.H1().h.getText().toString();
        String string3 = this$0.H1().j.getText().toString();
        String string4 = this$0.H1().i.getText().toString();
        String string5 = this$0.H1().y.getText().toString();
        String string6 = this$0.H1().z.getText().toString();
        String string7 = this$0.H1().B.getText().toString();
        String string8 = this$0.H1().A.getText().toString();
        if (this$0.H1().Q.getText().length() < 2) {
            Toast.makeText(this$0, "Please select the date", 0).show();
            return;
        }
        if (string.length() < 2) {
            Toast.makeText(this$0, "Please enter the valid house no", 0).show();
            return;
        }
        if (string3.length() < 3) {
            Toast.makeText(this$0, "Please enter the Village/Town/City", 0).show();
            return;
        }
        if (string2.length() < 3) {
            Toast.makeText(this$0, "Please enter the valid landmark", 0).show();
            return;
        }
        if (this$0.H1().K.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, "Please select the new current address state", 0).show();
            return;
        }
        if (this$0.H1().f.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, "Please select the new current address district", 0).show();
            return;
        }
        if (string4.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid PinCode", 0).show();
            return;
        }
        if (string5.length() < 3) {
            Toast.makeText(this$0, "Please enter the valid house no", 0).show();
            return;
        }
        if (string6.length() < 3) {
            Toast.makeText(this$0, "Please enter the valid landmark", 0).show();
            return;
        }
        if (string7.length() < 3) {
            Toast.makeText(this$0, "Please enter the Village/Town/City", 0).show();
            return;
        }
        if (this$0.H1().E.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, "Please select the new permanent address state", 0).show();
            return;
        }
        if (this$0.H1().D.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, "Please select the new permanent address district", 0).show();
            return;
        }
        if (string8.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid PinCode", 0).show();
            return;
        }
        try {
            Object selectedItem = this$0.H1().K.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
            Object selectedItem2 = this$0.H1().E.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
            Object selectedItem3 = this$0.H1().f.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            Object selectedItem4 = this$0.H1().D.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            this$0.M1().show();
            this$0.R1().g(this$0, string, string3, string2, String.valueOf(((DistictModleItem) selectedItem3).getDist_cd()), string4, ((VahanStateModleSubList) selectedItem).get(0).toString(), this$0.J1(), string5, string7, string6, String.valueOf(((DistictModleItem) selectedItem4).getDist_cd()), string4, ((VahanStateModleSubList) selectedItem2).get(0).toString(), this$0.N1(), String.valueOf(this$0.O1().getState_cd()), this$0.L1());
        } catch (Exception unused) {
        }
    }

    public static final void Z1(VahanChangeOfAddress this$0, ChaangeOfAddressStatus chaangeOfAddressStatus) {
        ChaangeOfAddressStatus chaangeOfAddressStatusCopy;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        try {
            Intrinsics.checkNotNull(chaangeOfAddressStatus);
            this$0.p2(chaangeOfAddressStatus);
            vh7 vh7Var = new vh7(this$0);
            if (this$0.isFaceless) {
                ChaangeOfAddressStatus chaangeOfAddressStatusI1 = this$0.I1();
                chaangeOfAddressStatusCopy = chaangeOfAddressStatusI1.copy((33554431 & 1) != 0 ? chaangeOfAddressStatusI1.action_cd : null, (33554431 & 2) != 0 ? chaangeOfAddressStatusI1.action_code : null, (33554431 & 4) != 0 ? chaangeOfAddressStatusI1.appl_no : null, (33554431 & 8) != 0 ? chaangeOfAddressStatusI1.c_add1 : null, (33554431 & 16) != 0 ? chaangeOfAddressStatusI1.c_add2 : null, (33554431 & 32) != 0 ? chaangeOfAddressStatusI1.c_add3 : null, (33554431 & 64) != 0 ? chaangeOfAddressStatusI1.c_district : null, (33554431 & 128) != 0 ? chaangeOfAddressStatusI1.c_pincode : null, (33554431 & 256) != 0 ? chaangeOfAddressStatusI1.c_state : null, (33554431 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? chaangeOfAddressStatusI1.facelessmessge : null, (33554431 & 1024) != 0 ? chaangeOfAddressStatusI1.flow_slno : null, (33554431 & 2048) != 0 ? chaangeOfAddressStatusI1.from_dt : null, (33554431 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? chaangeOfAddressStatusI1.messege : null, (33554431 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? chaangeOfAddressStatusI1.off_cd : null, (33554431 & 16384) != 0 ? chaangeOfAddressStatusI1.op_dt : null, (33554431 & 32768) != 0 ? chaangeOfAddressStatusI1.p_add1 : null, (33554431 & 65536) != 0 ? chaangeOfAddressStatusI1.p_add2 : null, (33554431 & 131072) != 0 ? chaangeOfAddressStatusI1.p_add3 : null, (33554431 & 262144) != 0 ? chaangeOfAddressStatusI1.p_district : null, (33554431 & 524288) != 0 ? chaangeOfAddressStatusI1.p_pincode : null, (33554431 & 1048576) != 0 ? chaangeOfAddressStatusI1.p_state : null, (33554431 & 2097152) != 0 ? chaangeOfAddressStatusI1.pur_cd : null, (33554431 & 4194304) != 0 ? chaangeOfAddressStatusI1.regn_no : null, (33554431 & 8388608) != 0 ? chaangeOfAddressStatusI1.state_cd : null, (33554431 & 16777216) != 0 ? chaangeOfAddressStatusI1.state_header : null, (33554431 & 33554432) != 0 ? chaangeOfAddressStatusI1.aadhaartxno : vh7Var.a());
            } else {
                ChaangeOfAddressStatus chaangeOfAddressStatusI12 = this$0.I1();
                chaangeOfAddressStatusCopy = chaangeOfAddressStatusI12.copy((33554431 & 1) != 0 ? chaangeOfAddressStatusI12.action_cd : null, (33554431 & 2) != 0 ? chaangeOfAddressStatusI12.action_code : null, (33554431 & 4) != 0 ? chaangeOfAddressStatusI12.appl_no : null, (33554431 & 8) != 0 ? chaangeOfAddressStatusI12.c_add1 : null, (33554431 & 16) != 0 ? chaangeOfAddressStatusI12.c_add2 : null, (33554431 & 32) != 0 ? chaangeOfAddressStatusI12.c_add3 : null, (33554431 & 64) != 0 ? chaangeOfAddressStatusI12.c_district : null, (33554431 & 128) != 0 ? chaangeOfAddressStatusI12.c_pincode : null, (33554431 & 256) != 0 ? chaangeOfAddressStatusI12.c_state : null, (33554431 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? chaangeOfAddressStatusI12.facelessmessge : null, (33554431 & 1024) != 0 ? chaangeOfAddressStatusI12.flow_slno : null, (33554431 & 2048) != 0 ? chaangeOfAddressStatusI12.from_dt : null, (33554431 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? chaangeOfAddressStatusI12.messege : null, (33554431 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? chaangeOfAddressStatusI12.off_cd : null, (33554431 & 16384) != 0 ? chaangeOfAddressStatusI12.op_dt : null, (33554431 & 32768) != 0 ? chaangeOfAddressStatusI12.p_add1 : null, (33554431 & 65536) != 0 ? chaangeOfAddressStatusI12.p_add2 : null, (33554431 & 131072) != 0 ? chaangeOfAddressStatusI12.p_add3 : null, (33554431 & 262144) != 0 ? chaangeOfAddressStatusI12.p_district : null, (33554431 & 524288) != 0 ? chaangeOfAddressStatusI12.p_pincode : null, (33554431 & 1048576) != 0 ? chaangeOfAddressStatusI12.p_state : null, (33554431 & 2097152) != 0 ? chaangeOfAddressStatusI12.pur_cd : null, (33554431 & 4194304) != 0 ? chaangeOfAddressStatusI12.regn_no : null, (33554431 & 8388608) != 0 ? chaangeOfAddressStatusI12.state_cd : null, (33554431 & 16777216) != 0 ? chaangeOfAddressStatusI12.state_header : null, (33554431 & 33554432) != 0 ? chaangeOfAddressStatusI12.aadhaartxno : " ");
            }
            String string = chaangeOfAddressStatus.getAppl_no().toString();
            Intent intent = new Intent(this$0, (Class<?>) ChangeOfAddressConfirmation.class);
            intent.putExtra(VContant.APP_NO, string);
            intent.putExtra("COV", chaangeOfAddressStatusCopy);
            intent.putExtra("state_code", this$0.O1().getState_cd());
            intent.putExtra("rc_number", this$0.N1());
            intent.putExtra(VContant.PURPOSE_CODE, "4");
            intent.putExtra("off_code", this$0.L1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra("RC", this$0.N1());
            intent.putExtra("RcDetails", this$0.O1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.G1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.F1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
            this$0.k2(this$0, "Unable to submit your request. please try again later!");
        }
    }

    public static final void a2(VahanChangeOfAddress this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        this$0.k2(this$0, "Unable to submit your request. please try again later!");
    }

    public static final void b2(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2();
    }

    public static final void c2(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().d.getVisibility() == 0) {
            this$0.H1().d.setVisibility(8);
            this$0.H1().m.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.H1().d.setVisibility(0);
            this$0.H1().m.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    public static final void d2(VahanChangeOfAddress this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().v.getVisibility() == 0) {
            this$0.H1().v.setVisibility(8);
            this$0.H1().n.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.H1().v.setVisibility(0);
            this$0.H1().n.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    public static final void e2(VahanChangeOfAddress this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            String string = this$0.H1().g.getText().toString();
            String string2 = this$0.H1().h.getText().toString();
            String string3 = this$0.H1().j.getText().toString();
            String string4 = this$0.H1().i.getText().toString();
            if (string != null && string.length() != 0) {
                this$0.H1().y.setText(string);
            }
            if (string2 != null && string2.length() != 0) {
                this$0.H1().z.setText(string2);
            }
            if (string3 != null && string3.length() != 0) {
                this$0.H1().B.setText(string3);
            }
            if (string4 != null && string4.length() != 0) {
                this$0.H1().A.setText(string4);
            }
            if (this$0.H1().f.getSelectedItemPosition() > 0) {
                this$0.H1().D.setSelection(this$0.H1().f.getSelectedItemPosition());
            }
        }
    }

    public static final void f2(VahanChangeOfAddress this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.H1().K.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            try {
                int iQ1 = this$0.Q1(String.valueOf(this$0.O1().getState_cd()), vahanStateModle);
                this$0.H1().K.setSelection(iQ1);
                this$0.H1().K.setEnabled(false);
                this$0.H1().E.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
                this$0.H1().E.setSelection(iQ1);
                this$0.H1().E.setEnabled(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void g2(VahanChangeOfAddress this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    public static final void h2(VahanChangeOfAddress this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.H1().f.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void i2(VahanChangeOfAddress this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    private final void j2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final void C1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.D1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.E1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String F1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String G1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final dh H1() {
        dh dhVar = this.binding;
        if (dhVar != null) {
            return dhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ChaangeOfAddressStatus I1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.change_ofAddress;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("change_ofAddress");
        return null;
    }

    public final String J1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 K1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String L1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog M1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String N1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails O1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService P1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final int Q1(String State_code, VahanStateModle list) {
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (StringsKt__StringsKt.trim((CharSequence) vahanStateModleSubList.get(0).toString()).toString().equals(State_code)) {
                return list.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final ld7 R1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void k2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.l2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void o2(dh dhVar) {
        Intrinsics.checkNotNullParameter(dhVar, "<set-?>");
        this.binding = dhVar;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        C1(this, K1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_change_of_address);
        dh dhVarC = dh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dhVarC, "inflate(...)");
        o2(dhVarC);
        setContentView(H1().b());
        ta3.a.w2(this, H1());
        r2(new wa3(this));
        w2(VahanProService.INSTANCE.a(this));
        t2(new ProgressDialog(this));
        M1().setMessage("Please wait...");
        M1().setCancelable(false);
        M1().setCanceledOnTouchOutside(false);
        x2((ld7) new z(this, new kd7(new jd7(P1()))).a(ld7.class));
        u2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        v2((NrvDetails) serializableExtra);
        s2(String.valueOf(getIntent().getStringExtra("off_code")));
        n2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        m2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        if (booleanExtra) {
            H1().I.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = H1().I.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        r2(new wa3(this));
        H1().S.setText(K1().b("vehicle_no", "Vehicle No.:") + ' ' + N1());
        H1().c.setText(O1().getRc_present_address());
        H1().C.setText(O1().getRc_permanent_address());
        this.state_code = O1().getState_cd();
        H1().T.setText(K1().b("view_vehicle_details", "View Vehicle Details"));
        H1().T.setPaintFlags(H1().T.getPaintFlags() | 8);
        H1().T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.py6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.S1(this.a, view);
            }
        });
        H1().O.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.T1(this.a, view);
            }
        });
        H1().O.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.b2(this.a, view);
            }
        });
        try {
            M1().show();
            R1().a1(this);
        } catch (Exception unused) {
        }
        H1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.c2(this.a, view);
            }
        });
        H1().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ry6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.d2(this.a, view);
            }
        });
        H1().J.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.sy6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                VahanChangeOfAddress.e2(this.a, compoundButton, z2);
            }
        });
        Spinner spinner = H1().K;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        Spinner spinner2 = H1().E;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b());
        }
        R1().Z0().g(this, new mf4() { // from class: com.zepto.ty6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.f2(this.a, (VahanStateModle) obj);
            }
        });
        R1().b1().g(this, new mf4() { // from class: com.zepto.uy6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.g2(this.a, (String) obj);
            }
        });
        R1().H().g(this, new mf4() { // from class: com.zepto.vy6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.h2(this.a, (DistictModle) obj);
            }
        });
        R1().I().g(this, new mf4() { // from class: com.zepto.wy6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.i2(this.a, (String) obj);
            }
        });
        R1().J().g(this, new mf4() { // from class: com.zepto.az6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.U1(this.a, (DistictModle) obj);
            }
        });
        R1().K().g(this, new mf4() { // from class: com.zepto.bz6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.V1(this.a, (String) obj);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.cz6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanChangeOfAddress.W1(this.a, datePicker, i, i2, i3);
            }
        };
        H1().Q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.X1(this.a, onDateSetListener, view);
            }
        });
        H1().N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ez6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanChangeOfAddress.Y1(this.a, view);
            }
        });
        R1().A().g(this, new mf4() { // from class: com.zepto.fz6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.Z1(this.a, (ChaangeOfAddressStatus) obj);
            }
        });
        R1().B().g(this, new mf4() { // from class: com.zepto.gz6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanChangeOfAddress.a2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        C1(this, K1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(ChaangeOfAddressStatus chaangeOfAddressStatus) {
        Intrinsics.checkNotNullParameter(chaangeOfAddressStatus, "<set-?>");
        this.change_ofAddress = chaangeOfAddressStatus;
    }

    public final void q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void r2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void t2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void u2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void v2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void w2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void x2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }
}
