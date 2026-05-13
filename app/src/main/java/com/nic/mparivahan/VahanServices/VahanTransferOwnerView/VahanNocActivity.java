package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pa7;
import com.zepto.pq;
import com.zepto.qa7;
import com.zepto.ra7;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J*\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010Q\u001a\n J*\u0004\u0018\u00010I0I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00103\u001a\u0004\bS\u00105\"\u0004\bT\u00107R\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00103\u001a\u0004\b_\u00105\"\u0004\b`\u00107R\"\u0010e\u001a\u00020b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010d\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR\"\u0010o\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u00103\u001a\u0004\bm\u00105\"\u0004\bn\u00107R\"\u0010s\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u00103\u001a\u0004\bq\u00105\"\u0004\br\u00107R\"\u0010w\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u00103\u001a\u0004\bu\u00105\"\u0004\bv\u00107R\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~¨\u0006\u0082\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanNocActivity;", "Lcom/zepto/pq;", "T", "", "list", "Ljava/util/function/Predicate;", "predicate", "", "K1", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "state_list", "", "statecode", "C1", "Lcom/zepto/pa7;", "C", "Lcom/zepto/pa7;", "H1", "()Lcom/zepto/pa7;", "m2", "(Lcom/zepto/pa7;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "P1", "()Lcom/zepto/ld7;", "u2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "t2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "L1", "()Landroid/app/ProgressDialog;", "q2", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "M1", "()Ljava/lang/String;", "r2", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "s2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Landroid/widget/ImageView;", "I", "Landroid/widget/ImageView;", "G1", "()Landroid/widget/ImageView;", "l2", "(Landroid/widget/ImageView;)V", "back_image", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "K", "getFormated_date", "n2", "formated_date", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "L", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "I1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "o2", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;)V", "htpmodle", "M", "getOff_code", "setOff_code", "off_code", "", "N", "Z", "is_hpt", "()Z", "set_hpt", "(Z)V", "O", "isFaceless", "setFaceless", "P", "F1", "k2", "aadhar_name", "Q", "E1", "j2", "aadhar_address", "R", "getFnr_date", "setFnr_date", "fnr_date", "Lcom/zepto/wa3;", "S", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "p2", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanNocActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public pa7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HptDetailsModle htpmodle;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean is_hpt;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String fnr_date = " ";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (VahanNocActivity.this.H1().A.getSelectedItemPosition() != 0) {
                VahanNocActivity.this.L1().show();
                Object selectedItem = VahanNocActivity.this.H1().A.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanNocActivity.this.P1().O0(((VahanStateModleSubList) selectedItem).get(0).toString());
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
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = VahanNocActivity.this.H1().y.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
            if (((NocReasonModleItem) selectedItem).getCode() == 4) {
                VahanNocActivity.this.H1().H.setVisibility(8);
                VahanNocActivity.this.H1().G.setVisibility(8);
            } else {
                VahanNocActivity.this.H1().H.setVisibility(0);
                VahanNocActivity.this.H1().G.setVisibility(0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean D1(Ref.ObjectRef subList, String statecode, String a2) {
        Intrinsics.checkNotNullParameter(subList, "$subList");
        Intrinsics.checkNotNullParameter(statecode, "$statecode");
        Intrinsics.checkNotNullParameter(a2, "a");
        return ((VahanStateModleSubList) subList.element).get(0).toString().equals(statecode);
    }

    public static final void Q1(VahanNocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.M1());
        intent.putExtra("RcDetails", this$0.N1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.F1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.E1());
        this$0.startActivity(intent);
    }

    public static final void R1(VahanNocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    public static final void S1(final VahanNocActivity this$0, RtoNameModle rtoNameModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = String.valueOf(this$0.N1().getRc_off_cd());
            RtoNameModleItem rtoNameModleItem = new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select Authority", "0", "0", "0", "0", "0", "0");
            Intrinsics.checkNotNull(rtoNameModle);
            rtoNameModle.add(0, rtoNameModleItem);
            try {
                if (this$0.K1(rtoNameModle, new Predicate() { // from class: com.zepto.da7
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return VahanNocActivity.U1(this.a, (RtoNameModleItem) obj);
                    }
                }) > -1) {
                    rtoNameModle.remove(this$0.K1(rtoNameModle, new Predicate() { // from class: com.zepto.ea7
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return VahanNocActivity.T1(objectRef, (RtoNameModleItem) obj);
                        }
                    }));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this$0.H1().b.setAdapter((SpinnerAdapter) new ra7(this$0, rtoNameModle));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final boolean T1(Ref.ObjectRef String, RtoNameModleItem a2) {
        Intrinsics.checkNotNullParameter(String, "$String");
        Intrinsics.checkNotNullParameter(a2, "a");
        return a2.getOff_cd().equals(String.element);
    }

    public static final boolean U1(VahanNocActivity this$0, RtoNameModleItem a2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(a2, "a");
        String state_cd = a2.getState_cd();
        String state_cd2 = this$0.N1().getState_cd();
        return state_cd.equals(state_cd2 != null ? StringsKt__StringsKt.trim((CharSequence) state_cd2).toString() : null);
    }

    public static final void V1(VahanNocActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.H1().B.setVisibility(8);
        }
    }

    public static final void W1(VahanNocActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.H1().B.setVisibility(0);
        }
    }

    public static final void X1(VahanNocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object selectedItem = this$0.H1().y.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
        NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) selectedItem;
        if (this$0.is_hpt && !this$0.H1().f.isChecked() && !this$0.H1().E.isChecked()) {
            Toast.makeText(this$0, this$0.J1().b("please_Select_hypothentication_option", this$0.getString(R.string.please_Select_hypothentication_option)), 0).show();
            return;
        }
        if (this$0.H1().y.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.J1().b("please_select_noc_reason", this$0.getString(R.string.please_select_noc_reason)), 0).show();
            return;
        }
        if (this$0.H1().A.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.J1().b("please_select_the_state", this$0.getString(R.string.please_select_the_state)), 0).show();
            return;
        }
        if (this$0.H1().b.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.J1().b("please_select_authority", this$0.getString(R.string.please_select_authority)), 0).show();
            return;
        }
        if (this$0.H1().x.getText().length() < 3) {
            Toast.makeText(this$0, this$0.J1().b("please_select_ncrb_no", this$0.getString(R.string.please_select_ncrb_no)), 0).show();
            return;
        }
        if (this$0.H1().G.getText().length() == 0 && nocReasonModleItem.getCode() != 4) {
            Toast.makeText(this$0, this$0.J1().b("please_enter_name", this$0.getString(R.string.please_enter_name)), 0).show();
            return;
        }
        if (this$0.H1().G.getText().length() < 3 && nocReasonModleItem.getCode() != 4) {
            Toast.makeText(this$0, this$0.J1().b("please_enter_valid_name", this$0.getString(R.string.please_enter_valid_name)), 0).show();
            return;
        }
        if (!this$0.is_hpt || !this$0.H1().E.isChecked()) {
            try {
                Object selectedItem2 = this$0.H1().y.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
                NocReasonModleItem nocReasonModleItem2 = (NocReasonModleItem) selectedItem2;
                String string = this$0.H1().x.getText().toString();
                Object selectedItem3 = this$0.H1().A.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                Object selectedItem4 = this$0.H1().b.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) selectedItem4;
                String string2 = nocReasonModleItem2.getCode() == 4 ? " " : this$0.H1().G.getText().toString();
                this$0.L1().show();
                this$0.P1().w1(new NocDraftRequestParam(" ", " ", hz0.a.r(), string, string2, true, " ", String.valueOf(this$0.off_code), Integer.parseInt(rtoNameModleItem.getOff_cd()), nocReasonModleItem2.getCode(), this$0.M1(), rtoNameModleItem.getOff_name(), String.valueOf(this$0.N1().getState_cd()), rtoNameModleItem.getState_cd()));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            if (this$0.H1().j.getText().length() < 2) {
                Toast.makeText(this$0, this$0.J1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            } else {
                this$0.L1().show();
                String fncr_add1 = this$0.I1().getFncr_add1();
                String fncr_add2 = this$0.I1().getFncr_add2();
                String fncr_add3 = this$0.I1().getFncr_add3();
                String fncr_district = this$0.I1().getFncr_district();
                String fncr_district2 = this$0.I1().getFncr_district();
                String fncr_name = this$0.I1().getFncr_name();
                String fncr_pincode = this$0.I1().getFncr_pincode();
                String fncr_state = this$0.I1().getFncr_state();
                String rc_c_state = this$0.N1().getRc_c_state();
                String from_dt = this$0.I1().getFrom_dt();
                String hp_type = this$0.I1().getHp_type();
                String str = this$0.off_code;
                String strR = hz0.a.r();
                String strM1 = this$0.M1();
                String state_cd = this$0.N1().getState_cd();
                k18.a aVar = k18.a;
                this$0.P1().x1(this$0, new HPTRequestParamModle(" ", fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district2, fncr_name, fncr_pincode, fncr_state, rc_c_state, "0", "0", "0", "0", from_dt, " ", hp_type, " ", str, strR, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, strM1, VContant.MAINSCREEN, state_cd, aVar.h(this$0.H1().j.getText().toString()), "NA", aVar.h(this$0.H1().j.getText().toString()), "NA"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void Y1(VahanNocActivity this$0, HptTerResponse hptTerResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            String appl_no = hptTerResponse.getAppl_no();
            if (appl_no == null || appl_no.length() == 0) {
                this$0.L1().dismiss();
                return;
            }
            try {
                Object selectedItem = this$0.H1().y.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
                NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) selectedItem;
                String string = this$0.H1().x.getText().toString();
                Object selectedItem2 = this$0.H1().A.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                Object selectedItem3 = this$0.H1().b.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) selectedItem3;
                this$0.P1().w1(new NocDraftRequestParam(" ", " ", "", string, nocReasonModleItem.getCode() == 4 ? " " : this$0.H1().G.getText().toString(), true, "", String.valueOf(this$0.off_code), Integer.parseInt(rtoNameModleItem.getOff_cd()), nocReasonModleItem.getCode(), this$0.M1(), rtoNameModleItem.getOff_name(), String.valueOf(this$0.N1().getState_cd()), rtoNameModleItem.getState_cd()));
            } catch (Exception e) {
                this$0.L1().dismiss();
                e.printStackTrace();
            }
        } catch (Exception e2) {
            this$0.L1().dismiss();
            e2.printStackTrace();
        }
    }

    public static final void Z1(VahanNocActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
    }

    public static final void a2(VahanNocActivity this$0, NocDraftResponse nocDraftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        try {
            String appl_no = nocDraftResponse.getAppl_no();
            if (appl_no != null && appl_no.length() != 0) {
                vh7 vh7Var = new vh7(this$0);
                Intrinsics.checkNotNull(nocDraftResponse);
                NocDraftResponse nocDraftResponseCopy = this$0.isFaceless ? nocDraftResponse.copy((16383 & 1) != 0 ? nocDraftResponse.appl_no : null, (16383 & 2) != 0 ? nocDraftResponse.dispatch_no : null, (16383 & 4) != 0 ? nocDraftResponse.issue_date : null, (16383 & 8) != 0 ? nocDraftResponse.ncrb_ref : null, (16383 & 16) != 0 ? nocDraftResponse.new_own_name : null, (16383 & 32) != 0 ? nocDraftResponse.nocRetention : false, (16383 & 64) != 0 ? nocDraftResponse.noc_dt : null, (16383 & 128) != 0 ? nocDraftResponse.off_cd : 0, (16383 & 256) != 0 ? nocDraftResponse.off_to : 0, (16383 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? nocDraftResponse.reason : 0, (16383 & 1024) != 0 ? nocDraftResponse.regn_no : null, (16383 & 2048) != 0 ? nocDraftResponse.rto_to : null, (16383 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? nocDraftResponse.state_cd : null, (16383 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? nocDraftResponse.state_to : null, (16383 & 16384) != 0 ? nocDraftResponse.aadhaartxno : vh7Var.a()) : nocDraftResponse.copy((16383 & 1) != 0 ? nocDraftResponse.appl_no : null, (16383 & 2) != 0 ? nocDraftResponse.dispatch_no : null, (16383 & 4) != 0 ? nocDraftResponse.issue_date : null, (16383 & 8) != 0 ? nocDraftResponse.ncrb_ref : null, (16383 & 16) != 0 ? nocDraftResponse.new_own_name : null, (16383 & 32) != 0 ? nocDraftResponse.nocRetention : false, (16383 & 64) != 0 ? nocDraftResponse.noc_dt : null, (16383 & 128) != 0 ? nocDraftResponse.off_cd : 0, (16383 & 256) != 0 ? nocDraftResponse.off_to : 0, (16383 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? nocDraftResponse.reason : 0, (16383 & 1024) != 0 ? nocDraftResponse.regn_no : null, (16383 & 2048) != 0 ? nocDraftResponse.rto_to : null, (16383 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? nocDraftResponse.state_cd : null, (16383 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? nocDraftResponse.state_to : null, (16383 & 16384) != 0 ? nocDraftResponse.aadhaartxno : " ");
                Intent intent = new Intent(this$0, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NOC_CODE);
                intent.putExtra(VContant.NOC_CODE, nocDraftResponseCopy);
                intent.putExtra(VContant.APP_NO, nocDraftResponse.getAppl_no());
                intent.putExtra("state_code", this$0.N1().getState_cd());
                intent.putExtra("rc_number", this$0.M1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.NOC_PURPOSE_CODE);
                intent.putExtra("off_code", this$0.off_code);
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra("RC", this$0.M1());
                intent.putExtra("RcDetails", this$0.N1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra(VContant.NEXGEN_addahar_name, this$0.F1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this$0.E1());
                this$0.startActivity(intent);
                this$0.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void b2(VahanNocActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
    }

    public static final void c2(VahanNocActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.n2(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.H1().j.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void d2(VahanNocActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMinDate(VContant.INSTANCE.o(this$0.fnr_date));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void e2(VahanNocActivity this$0, NocReasonModle nocReasonModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (nocReasonModle.size() > 0) {
                NocReasonModleItem nocReasonModleItem = new NocReasonModleItem(0, "Select Reason");
                Intrinsics.checkNotNull(nocReasonModle);
                nocReasonModle.add(0, nocReasonModleItem);
                this$0.H1().y.setAdapter((SpinnerAdapter) new qa7(this$0, nocReasonModle));
                this$0.P1().a1(this$0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this$0.L1().dismiss();
        }
    }

    public static final void f2(VahanNocActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
    }

    public static final void g2(VahanNocActivity this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            int iC1 = this$0.C1(vahanStateModle, String.valueOf(this$0.N1().getState_cd()));
            if (iC1 > -1) {
                vahanStateModle.remove(iC1);
            }
            this$0.H1().A.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            try {
                this$0.L1().show();
                this$0.P1().n0(this$0, this$0.M1());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void h2(VahanNocActivity this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        try {
            Intrinsics.checkNotNull(hptDetailsModle);
            this$0.o2(hptDetailsModle);
            this$0.is_hpt = true;
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            this$0.fnr_date = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            if (strValueOf.length() == 0) {
                this$0.H1().n.setText("--");
            } else {
                this$0.H1().n.setText(strValueOf);
            }
            if (strValueOf2.length() != 0) {
                this$0.H1().l.setText(strValueOf2 + strValueOf3 + strValueOf4);
            }
            String str = this$0.fnr_date;
            if (str != null && str.length() != 0) {
                this$0.H1().i.setText(k18.a.f(this$0.fnr_date));
            }
            if (string != null && string.length() != 0) {
                this$0.H1().I.setText(string.toString());
            }
        } catch (Exception e) {
            this$0.is_hpt = false;
            e.printStackTrace();
            this$0.H1().u.setVisibility(8);
            this$0.H1().q.setVisibility(8);
            this$0.H1().r.setVisibility(8);
        }
    }

    public static final void i2(VahanNocActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().dismiss();
        this$0.H1().u.setVisibility(8);
        this$0.H1().q.setVisibility(8);
        this$0.H1().r.setVisibility(8);
        this$0.is_hpt = false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public final int C1(VahanStateModle state_list, final String statecode) {
        Intrinsics.checkNotNullParameter(state_list, "state_list");
        Intrinsics.checkNotNullParameter(statecode, "statecode");
        int size = state_list.size();
        for (int i = 0; i < size; i++) {
            try {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? r4 = state_list.get(i);
                Intrinsics.checkNotNullExpressionValue(r4, "get(...)");
                objectRef.element = r4;
                if (K1((List) r4, new Predicate() { // from class: com.zepto.fa7
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return VahanNocActivity.D1(objectRef, statecode, (String) obj);
                    }
                }) > -1) {
                    return i;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public final String E1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String F1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final ImageView G1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final pa7 H1() {
        pa7 pa7Var = this.binding;
        if (pa7Var != null) {
            return pa7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final HptDetailsModle I1() {
        HptDetailsModle hptDetailsModle = this.htpmodle;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("htpmodle");
        return null;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final int K1(List list, Predicate predicate) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            if (predicate.test(listIterator.next())) {
                return iNextIndex;
            }
        }
        return -1;
    }

    public final ProgressDialog L1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String M1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails N1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService O1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 P1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void l2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void m2(pa7 pa7Var) {
        Intrinsics.checkNotNullParameter(pa7Var, "<set-?>");
        this.binding = pa7Var;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void o2(HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(hptDetailsModle, "<set-?>");
        this.htpmodle = hptDetailsModle;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_noc);
        pa7 pa7VarC = pa7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pa7VarC, "inflate(...)");
        m2(pa7VarC);
        setContentView(H1().b());
        ta3.a.L2(this, H1());
        t2(VahanProService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        l2((ImageView) viewFindViewById);
        r2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        s2((NrvDetails) serializableExtra);
        k2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        j2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        p2(new wa3(this));
        H1().X.setText(J1().b("vehicle_no", "Vehicle No.:") + ' ' + M1());
        H1().Y.setText(J1().b("view_vehicle_details", "View Vehicle Details"));
        H1().Y.setPaintFlags(H1().Y.getPaintFlags() | 8);
        H1().Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanNocActivity.Q1(this.a, view);
            }
        });
        this.off_code = String.valueOf(getIntent().getStringExtra("off_code"));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        VContant.Companion companion = VContant.INSTANCE;
        LinearLayout appMent = H1().z.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(booleanExtra, appMent);
        q2(new ProgressDialog(this));
        L1().setMessage("Please wait...");
        L1().setCancelable(false);
        L1().setCanceledOnTouchOutside(false);
        u2((ld7) new z(this, new kd7(new jd7(O1()))).a(ld7.class));
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.na7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanNocActivity.R1(this.a, view);
            }
        });
        try {
            L1().show();
            P1().u0();
        } catch (Exception unused) {
        }
        H1().y.setOnItemSelectedListener(new b());
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.oa7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanNocActivity.c2(this.a, datePicker, i, i2, i3);
            }
        };
        H1().j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanNocActivity.d2(this.a, onDateSetListener, view);
            }
        });
        P1().g0().g(this, new mf4() { // from class: com.zepto.x97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.e2(this.a, (NocReasonModle) obj);
            }
        });
        P1().h0().g(this, new mf4() { // from class: com.zepto.y97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.f2(this.a, (String) obj);
            }
        });
        P1().Z0().g(this, new mf4() { // from class: com.zepto.z97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.g2(this.a, (VahanStateModle) obj);
            }
        });
        P1().o0().g(this, new mf4() { // from class: com.zepto.aa7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.h2(this.a, (HptDetailsModle) obj);
            }
        });
        P1().p0().g(this, new mf4() { // from class: com.zepto.ba7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.i2(this.a, (String) obj);
            }
        });
        Spinner spinner = H1().A;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        P1().i0().g(this, new mf4() { // from class: com.zepto.ca7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.S1(this.a, (RtoNameModle) obj);
            }
        });
        H1().f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ga7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanNocActivity.V1(this.a, compoundButton, z);
            }
        });
        H1().E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ha7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanNocActivity.W1(this.a, compoundButton, z);
            }
        });
        H1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ia7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanNocActivity.X1(this.a, view);
            }
        });
        P1().q0().g(this, new mf4() { // from class: com.zepto.ja7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.Y1(this.a, (HptTerResponse) obj);
            }
        });
        P1().r0().g(this, new mf4() { // from class: com.zepto.ka7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.Z1(this.a, (String) obj);
            }
        });
        P1().v0().g(this, new mf4() { // from class: com.zepto.la7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.a2(this.a, (NocDraftResponse) obj);
            }
        });
        P1().w0().g(this, new mf4() { // from class: com.zepto.ma7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanNocActivity.b2(this.a, (String) obj);
            }
        });
    }

    public final void p2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void q2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void s2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void t2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void u2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }
}
