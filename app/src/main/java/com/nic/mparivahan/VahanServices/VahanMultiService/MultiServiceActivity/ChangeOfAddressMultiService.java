package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
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
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.ChangeOfAddressMultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.ed5;
import com.zepto.gz3;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ki0;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018R\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010R\u001a\n K*\u0004\u0018\u00010J0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u001c\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u0010 R\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010\u001c\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u0010 R\"\u0010^\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\u001c\u001a\u0004\b\\\u0010\u001e\"\u0004\b]\u0010 R\"\u0010b\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010\u001c\u001a\u0004\b`\u0010\u001e\"\u0004\ba\u0010 R\"\u0010f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010\u001c\u001a\u0004\bd\u0010\u001e\"\u0004\be\u0010 R\"\u0010i\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR6\u0010|\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0088\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010\u007f\u001a\u0006\b\u0086\u0001\u0010\u0081\u0001\"\u0006\b\u0087\u0001\u0010\u0083\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009b\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/ChangeOfAddressMultiService;", "Lcom/zepto/pq;", "", "l2", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "State_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "list", "Q1", "Landroid/content/Context;", "context", "message", "C1", "purCode", "Ljava/util/ArrayList;", "purSel", "x2", "C", "Ljava/lang/String;", "N1", "()Ljava/lang/String;", "u2", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/ki0;", "E", "Lcom/zepto/ki0;", "H1", "()Lcom/zepto/ki0;", "o2", "(Lcom/zepto/ki0;)V", "binding", "Lcom/zepto/ld7;", "F", "Lcom/zepto/ld7;", "R1", "()Lcom/zepto/ld7;", "y2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "w2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "M1", "()Landroid/app/ProgressDialog;", "t2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "I", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "J", "getState_code", "setState_code", "state_code", "K", "I1", "p2", "formated_date", "L", "L1", "s2", "off_code", "M", "G1", "n2", "aadhar_name", "N", "F1", "m2", "aadhar_address", "O", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "q2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lkotlin/collections/ArrayList;", "Q", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "S", "getDraftObj", "setDraftObj", "draftObj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "T", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "S1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "z2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "U", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "K1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "r2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChangeOfAddressMultiService extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ki0 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiServiceDraft draftObj;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (ChangeOfAddressMultiService.this.H1().K.getSelectedItemPosition() != 0) {
                ChangeOfAddressMultiService.this.M1().show();
                Object selectedItem = ChangeOfAddressMultiService.this.H1().K.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                ChangeOfAddressMultiService.this.R1().r1(ChangeOfAddressMultiService.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
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
            if (ChangeOfAddressMultiService.this.H1().E.getSelectedItemPosition() != 0) {
                ChangeOfAddressMultiService.this.M1().show();
                Object selectedItem = ChangeOfAddressMultiService.this.H1().E.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                ChangeOfAddressMultiService.this.R1().s1(ChangeOfAddressMultiService.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void D1(Dialog d, ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void E1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void T1(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void U1(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.N1());
        intent.putExtra("RcDetails", this$0.O1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.G1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.F1());
        this$0.startActivity(intent);
    }

    public static final void V1(ChangeOfAddressMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    public static final void W1(ChangeOfAddressMultiService this$0, DistictModle distictModle) {
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

    public static final void X1(ChangeOfAddressMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    public static final void Y1(ChangeOfAddressMultiService this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.p2(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.H1().R.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void Z1(ChangeOfAddressMultiService this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void a2(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.H1().g.getText().toString();
        String string2 = this$0.H1().h.getText().toString();
        String string3 = this$0.H1().j.getText().toString();
        String string4 = this$0.H1().i.getText().toString();
        String string5 = this$0.H1().y.getText().toString();
        String string6 = this$0.H1().z.getText().toString();
        String string7 = this$0.H1().B.getText().toString();
        String string8 = this$0.H1().A.getText().toString();
        if (this$0.H1().R.getText().length() < 2) {
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
            int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
            int i = Integer.parseInt(string4);
            String string9 = ((VahanStateModleSubList) selectedItem).get(0).toString();
            String strI1 = this$0.I1();
            String rc_off_cd = this$0.O1().getRc_off_cd();
            Intrinsics.checkNotNull(rc_off_cd);
            ChanngeOfAdressDto channgeOfAdressDto = new ChanngeOfAdressDto(40005, 40005, "", string, string3, string2, dist_cd, i, string9, "", 3, strI1, "", Integer.parseInt(rc_off_cd), "", string5, string7, string6, ((DistictModleItem) selectedItem4).getDist_cd(), Integer.parseInt(string4), ((VahanStateModleSubList) selectedItem2).get(0).toString(), Integer.parseInt("4"), this$0.N1(), String.valueOf(this$0.O1().getState_cd()), this$0.L1());
            MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft);
            this$0.draftObj = multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : null, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : channgeOfAdressDto, (2045 & 4) != 0 ? multiServiceDraft.durcdto : null, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : null, (2045 & 16) != 0 ? multiServiceDraft.hptDto : null, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null);
            VContant.Companion companion = VContant.INSTANCE;
            if (StringsKt__StringsJVMKt.equals(companion.t("4", this$0.multiServiceList), VContant.REDIRECT, true)) {
                this$0.M1().show();
                MultiSelectionViewModel multiSelectionViewModelS1 = this$0.S1();
                MultiServiceDraft multiServiceDraft2 = this$0.draftObj;
                Intrinsics.checkNotNull(multiServiceDraft2);
                multiSelectionViewModelS1.v(multiServiceDraft2);
                return;
            }
            Intent intent = new Intent();
            if (companion.w("4", this$0.multiServiceList)) {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.t("4", this$0.multiServiceList)));
            } else {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.t("4", this$0.multiServiceList)));
            }
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.N1());
            intent.putExtra("RcDetails", this$0.O1());
            intent.putExtra("off_code", this$0.L1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.G1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.F1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void b2(ChangeOfAddressMultiService this$0, DraftResponse draftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            return;
        }
        Data data = draftResponse.getData();
        String strValueOf = String.valueOf(data != null ? data.getApplNo() : null);
        Data data2 = draftResponse.getData();
        if (data2 != null) {
            data2.getTransferOwnershipDto();
        }
        Data data3 = draftResponse.getData();
        ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
        Data data4 = draftResponse.getData();
        HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
        Data data5 = draftResponse.getData();
        HptDto hptDto = data5 != null ? data5.getHptDto() : null;
        Data data6 = draftResponse.getData();
        Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
        MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
        MultiServiceDraft multiServiceDraftCopy = multiServiceDraft != null ? multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : strValueOf, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : channgeOfAdressDto, (2045 & 4) != 0 ? multiServiceDraft.durcdto : durcdto, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : hpaDto, (2045 & 16) != 0 ? multiServiceDraft.hptDto : hptDto, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null) : null;
        Intent intent = new Intent(this$0, (Class<?>) VahanMultiServiceConfirmationScreen.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftCopy);
        intent.putExtra("RcDetails", this$0.O1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.G1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.F1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void c2(ChangeOfAddressMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
        VContant.INSTANCE.N(this$0, str);
    }

    public static final void d2(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1(this$0, this$0.J1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void e2(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2();
    }

    public static final void f2(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().d.getVisibility() == 0) {
            this$0.H1().d.setVisibility(8);
            this$0.H1().m.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.H1().d.setVisibility(0);
            this$0.H1().m.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    public static final void g2(ChangeOfAddressMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().v.getVisibility() == 0) {
            this$0.H1().v.setVisibility(8);
            this$0.H1().n.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.H1().v.setVisibility(0);
            this$0.H1().n.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    public static final void h2(ChangeOfAddressMultiService this$0, CompoundButton compoundButton, boolean z) {
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

    public static final void i2(ChangeOfAddressMultiService this$0, VahanStateModle vahanStateModle) {
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

    public static final void j2(ChangeOfAddressMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().dismiss();
    }

    public static final void k2(ChangeOfAddressMultiService this$0, DistictModle distictModle) {
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

    private final void l2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.D1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.E1(dialog, view);
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

    public final ki0 H1() {
        ki0 ki0Var = this.binding;
        if (ki0Var != null) {
            return ki0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String I1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService K1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
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

    public final MultiSelectionViewModel S1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void o2(ki0 ki0Var) {
        Intrinsics.checkNotNullParameter(ki0Var, "<set-?>");
        this.binding = ki0Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        C1(this, J1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changeofaddress_multi);
        ki0 ki0VarC = ki0.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ki0VarC, "inflate(...)");
        o2(ki0VarC);
        setContentView(H1().b());
        ta3.a.x2(this, H1());
        q2(new wa3(this));
        w2(VahanProService.INSTANCE.a(this));
        t2(new ProgressDialog(this));
        M1().setMessage("Please wait...");
        M1().setCancelable(false);
        M1().setCanceledOnTouchOutside(false);
        y2((ld7) new z(this, new kd7(new jd7(P1()))).a(ld7.class));
        r2(MultiService.INSTANCE.a(this));
        z2((MultiSelectionViewModel) new z(this, new y67(new sx3(K1()))).a(MultiSelectionViewModel.class));
        u2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        v2((NrvDetails) serializableExtra);
        s2(String.valueOf(getIntent().getStringExtra("off_code")));
        n2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        m2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        H1().P.e.setVisibility(0);
        H1().P.e.setText(N1());
        SpannableString spannableString = new SpannableString(N1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        H1().P.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            H1().P.i.setText(new wa3(this).b("vahan_change_of_address", getString(R.string.change_of_address)));
        } else {
            SpannableString spannableString2 = new SpannableString(J1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            H1().P.i.setText(spannableString2);
        }
        H1().P.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.T1(this.a, view);
            }
        });
        x2("4", this.multiServiceList);
        if (this.isFaceless) {
            H1().I.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = H1().I.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        q2(new wa3(this));
        H1().T.setText(J1().b("vehicle_no", "Vehicle No.:") + ' ' + N1());
        H1().c.setText(O1().getRc_present_address());
        H1().C.setText(O1().getRc_permanent_address());
        this.state_code = O1().getState_cd();
        H1().U.setText(J1().b("view_vehicle_details", "View Vehicle Details"));
        H1().U.setPaintFlags(H1().U.getPaintFlags() | 8);
        H1().P.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.U1(this.a, view);
            }
        });
        H1().P.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.d2(this.a, view);
            }
        });
        H1().P.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.e2(this.a, view);
            }
        });
        try {
            M1().show();
            R1().a1(this);
        } catch (Exception unused) {
        }
        H1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.f2(this.a, view);
            }
        });
        H1().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.g2(this.a, view);
            }
        });
        H1().J.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ih0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ChangeOfAddressMultiService.h2(this.a, compoundButton, z2);
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
        R1().Z0().g(this, new mf4() { // from class: com.zepto.jh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.i2(this.a, (VahanStateModle) obj);
            }
        });
        R1().b1().g(this, new mf4() { // from class: com.zepto.kh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.j2(this.a, (String) obj);
            }
        });
        R1().H().g(this, new mf4() { // from class: com.zepto.lh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.k2(this.a, (DistictModle) obj);
            }
        });
        R1().I().g(this, new mf4() { // from class: com.zepto.oh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.V1(this.a, (String) obj);
            }
        });
        R1().J().g(this, new mf4() { // from class: com.zepto.ph0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.W1(this.a, (DistictModle) obj);
            }
        });
        R1().K().g(this, new mf4() { // from class: com.zepto.qh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.X1(this.a, (String) obj);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.rh0
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ChangeOfAddressMultiService.Y1(this.a, datePicker, i, i2, i3);
            }
        };
        H1().R.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.Z1(this.a, onDateSetListener, view);
            }
        });
        H1().O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.th0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressMultiService.a2(this.a, view);
            }
        });
        S1().l().g(this, new mf4() { // from class: com.zepto.uh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.b2(this.a, (DraftResponse) obj);
            }
        });
        S1().m().g(this, new mf4() { // from class: com.zepto.vh0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressMultiService.c2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        C1(this, J1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void q2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void r2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
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

    public final void x2(String purCode, ArrayList purSel) {
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        try {
            Intrinsics.checkNotNull(purSel);
            int iIndexOf = purSel.indexOf(purCode);
            if (purSel.size() == 4) {
                H1().N.b.setVisibility(0);
                TextView textView = H1().N.d;
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                textView.setText(companion.D(this, (String) obj));
                TextView textView2 = H1().N.f;
                Object obj2 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                textView2.setText(companion.D(this, (String) obj2));
                TextView textView3 = H1().N.k;
                Object obj3 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                textView3.setText(companion.D(this, (String) obj3));
                TextView textView4 = H1().N.n;
                Object obj4 = purSel.get(3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                textView4.setText(companion.D(this, (String) obj4));
                if (iIndexOf == 3) {
                    H1().N.c.setChecked(true);
                    H1().N.e.setChecked(true);
                    H1().N.h.setChecked(true);
                    H1().N.m.setChecked(false);
                }
                if (iIndexOf == 2) {
                    H1().N.c.setChecked(true);
                    H1().N.e.setChecked(true);
                    H1().N.h.setChecked(false);
                    H1().N.m.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 1) {
                    H1().N.c.setChecked(true);
                    H1().N.e.setChecked(false);
                    Drawable drawableE = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    H1().N.h.setCheckMarkDrawable(drawableE);
                    H1().N.m.setCheckMarkDrawable(drawableE);
                }
                if (iIndexOf == 0) {
                    H1().N.c.setChecked(false);
                    Drawable drawableE2 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    H1().N.e.setCheckMarkDrawable(drawableE2);
                    H1().N.h.setCheckMarkDrawable(drawableE2);
                    H1().N.m.setCheckMarkDrawable(drawableE2);
                }
            }
            if (purSel.size() == 3) {
                H1().N.u.setVisibility(0);
                TextView textView5 = H1().N.z;
                VContant.Companion companion2 = VContant.INSTANCE;
                Object obj5 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                textView5.setText(companion2.D(this, (String) obj5));
                TextView textView6 = H1().N.w;
                Object obj6 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                textView6.setText(companion2.D(this, (String) obj6));
                TextView textView7 = H1().N.j;
                Object obj7 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                textView7.setText(companion2.D(this, (String) obj7));
                if (iIndexOf == 2) {
                    H1().N.i.setChecked(true);
                    H1().N.v.setChecked(true);
                    H1().N.y.setChecked(false);
                }
                if (iIndexOf == 1) {
                    H1().N.i.setChecked(true);
                    H1().N.v.setChecked(false);
                    H1().N.y.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 0) {
                    H1().N.i.setChecked(false);
                    Drawable drawableE3 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    H1().N.v.setCheckMarkDrawable(drawableE3);
                    H1().N.y.setCheckMarkDrawable(drawableE3);
                }
            }
            if (purSel.size() == 2) {
                H1().N.A.setVisibility(0);
                TextView textView8 = H1().N.t;
                VContant.Companion companion3 = VContant.INSTANCE;
                Object obj8 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                textView8.setText(companion3.D(this, (String) obj8));
                TextView textView9 = H1().N.r;
                Object obj9 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                textView9.setText(companion3.D(this, (String) obj9));
                if (iIndexOf == 1) {
                    H1().N.q.setChecked(true);
                    H1().N.s.setChecked(false);
                }
                if (iIndexOf == 0) {
                    H1().N.q.setChecked(false);
                    H1().N.s.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void y2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void z2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }
}
