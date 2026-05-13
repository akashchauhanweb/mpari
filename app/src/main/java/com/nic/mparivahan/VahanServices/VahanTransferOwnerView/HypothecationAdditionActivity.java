package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.d67;
import com.zepto.e67;
import com.zepto.hz0;
import com.zepto.ir2;
import com.zepto.k18;
import com.zepto.kr2;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.wk2;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\n )*\u0004\u0018\u00010(0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010@\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\"\u0010P\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00103\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\"\u0010T\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/HypothecationAdditionActivity;", "Lcom/zepto/pq;", "", "U1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/e67;", "C", "Lcom/zepto/e67;", "y1", "()Lcom/zepto/e67;", "X1", "(Lcom/zepto/e67;)V", "binding", "Lcom/zepto/kr2;", "D", "Lcom/zepto/kr2;", "F1", "()Lcom/zepto/kr2;", "f2", "(Lcom/zepto/kr2;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "E", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "E1", "()Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "e2", "(Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "H", "Ljava/lang/String;", "getFormated_date", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "formated_date", "I", "C1", "c2", "rc_number", "J", "A1", "a2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "L", "x1", "W1", "aadhar_name", "M", "w1", "V1", "aadhar_address", "", "N", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "z1", "()Lcom/zepto/wa3;", "Z1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationAdditionActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public e67 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public kr2 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public HServices retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (HypothecationAdditionActivity.this.y1().p.getSelectedItemPosition() != 0) {
                HypothecationAdditionActivity.this.B1().show();
                Object selectedItem = HypothecationAdditionActivity.this.y1().p.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                HypothecationAdditionActivity.this.F1().q(((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void G1(HypothecationAdditionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.C1());
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.x1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.w1());
        this$0.startActivity(intent);
    }

    public static final void H1(HypothecationAdditionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.z1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void I1(HypothecationAdditionActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void J1(HypothecationAdditionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.y1().h.getText().toString();
        String string2 = this$0.y1().i.getText().toString();
        String string3 = this$0.y1().B.getText().toString();
        String string4 = this$0.y1().l.getText().toString();
        String string5 = this$0.y1().d.getText().toString();
        String string6 = this$0.y1().f.getText().toString();
        Object selectedItem = this$0.y1().p.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (this$0.y1().k.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.z1().b("please_enter_hypothentication_type", this$0.getString(R.string.please_enter_hypothentication_type)), 0).show();
            return;
        }
        if (string.length() < 2) {
            Toast.makeText(this$0, this$0.z1().b("please_enter_the_financer_name", this$0.getString(R.string.please_enter_the_financer_name)), 0).show();
            return;
        }
        if (string2.length() < 2) {
            Toast.makeText(this$0, this$0.z1().b("please_enter_valid_house_no", this$0.getString(R.string.please_enter_valid_house_no)), 0).show();
            return;
        }
        if (string3.length() < 3) {
            Toast.makeText(this$0, this$0.z1().b("please_enter_village_town_city", this$0.getString(R.string.please_enter_village_town_city)), 0).show();
            return;
        }
        if (this$0.y1().p.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.z1().b("please_select_the_state", this$0.getString(R.string.please_select_the_state)), 0).show();
            return;
        }
        if (this$0.y1().c.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.z1().b("please_select_district", this$0.getString(R.string.please_select_district)), 0).show();
            return;
        }
        if (string5.length() < 6) {
            Toast.makeText(this$0, this$0.z1().b("please_enter_valid_pincode", this$0.getString(R.string.please_enter_valid_pincode)), 0).show();
            return;
        }
        if (this$0.y1().f.getText().length() < 2) {
            Toast.makeText(this$0, this$0.z1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            hz0.a aVar = hz0.a;
            aVar.r();
            Object selectedItem2 = this$0.y1().k.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
            this$0.B1().show();
            Object selectedItem3 = this$0.y1().c.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            this$0.F1().r(string2, string3, string4, String.valueOf(((DistictModleItem) selectedItem3).getDist_cd()), string, string5, vahanStateModleSubList.get(0).toString(), k18.a.h(string6), aVar.r(), String.valueOf(this$0.D1().getState_cd()), this$0.C1(), this$0.A1(), ((HTPModleItem) selectedItem2).getHp_type_cd());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void K1(HypothecationAdditionActivity this$0, HPAResModle hPAResModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            String appl_no = hPAResModle.getAppl_no();
            if (appl_no != null && appl_no.length() != 0) {
                vh7 vh7Var = new vh7(this$0);
                Intrinsics.checkNotNull(hPAResModle);
                HPAResModle hPAResModleCopy = this$0.isFaceless ? hPAResModle.copy((65535 & 1) != 0 ? hPAResModle.appl_no : null, (65535 & 2) != 0 ? hPAResModle.fncr_add1 : null, (65535 & 4) != 0 ? hPAResModle.fncr_add2 : null, (65535 & 8) != 0 ? hPAResModle.fncr_add3 : null, (65535 & 16) != 0 ? hPAResModle.fncr_district : 0, (65535 & 32) != 0 ? hPAResModle.fncr_name : null, (65535 & 64) != 0 ? hPAResModle.fncr_pincode : 0, (65535 & 128) != 0 ? hPAResModle.fncr_state : null, (65535 & 256) != 0 ? hPAResModle.from_dt : null, (65535 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? hPAResModle.hp_type : null, (65535 & 1024) != 0 ? hPAResModle.off_cd : null, (65535 & 2048) != 0 ? hPAResModle.op_dt : null, (65535 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? hPAResModle.pur_cd : 0, (65535 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? hPAResModle.regn_no : null, (65535 & 16384) != 0 ? hPAResModle.sr_no : 0, (65535 & 32768) != 0 ? hPAResModle.state_cd : null, (65535 & 65536) != 0 ? hPAResModle.aadhaartxno : vh7Var.a()) : hPAResModle.copy((65535 & 1) != 0 ? hPAResModle.appl_no : null, (65535 & 2) != 0 ? hPAResModle.fncr_add1 : null, (65535 & 4) != 0 ? hPAResModle.fncr_add2 : null, (65535 & 8) != 0 ? hPAResModle.fncr_add3 : null, (65535 & 16) != 0 ? hPAResModle.fncr_district : 0, (65535 & 32) != 0 ? hPAResModle.fncr_name : null, (65535 & 64) != 0 ? hPAResModle.fncr_pincode : 0, (65535 & 128) != 0 ? hPAResModle.fncr_state : null, (65535 & 256) != 0 ? hPAResModle.from_dt : null, (65535 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? hPAResModle.hp_type : null, (65535 & 1024) != 0 ? hPAResModle.off_cd : null, (65535 & 2048) != 0 ? hPAResModle.op_dt : null, (65535 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? hPAResModle.pur_cd : 0, (65535 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? hPAResModle.regn_no : null, (65535 & 16384) != 0 ? hPAResModle.sr_no : 0, (65535 & 32768) != 0 ? hPAResModle.state_cd : null, (65535 & 65536) != 0 ? hPAResModle.aadhaartxno : " ");
                Intent intent = new Intent(this$0, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
                intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, hPAResModleCopy);
                intent.putExtra(VContant.APP_NO, hPAResModle.getAppl_no());
                intent.putExtra("state_code", this$0.D1().getState_cd());
                intent.putExtra("rc_number", this$0.C1());
                intent.putExtra("off_code", this$0.A1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra("RC", this$0.C1());
                intent.putExtra("RcDetails", this$0.D1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this$0.x1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this$0.w1());
                this$0.startActivity(intent);
                this$0.finish();
            }
        } catch (Exception unused) {
        }
    }

    public static final void L1(HypothecationAdditionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    public static final void M1(HypothecationAdditionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void N1(HypothecationAdditionActivity this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.y1().p.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            this$0.B1().show();
            this$0.F1().m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void O1(HypothecationAdditionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    public static final void P1(HypothecationAdditionActivity this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.y1().c.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void Q1(HypothecationAdditionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    public static final void R1(HypothecationAdditionActivity this$0, HtpTypeModle htpTypeModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            Intrinsics.checkNotNull(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            this$0.y1().k.setAdapter((SpinnerAdapter) new d67(this$0, htpTypeModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void S1(HypothecationAdditionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        this$0.y1().k.setAdapter((SpinnerAdapter) new d67(this$0, arrayList));
    }

    public static final void T1(HypothecationAdditionActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.Y1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.y1().f.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    private final void U1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final String A1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String C1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final HServices E1() {
        HServices hServices = this.retrofitService;
        if (hServices != null) {
            return hServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final kr2 F1() {
        kr2 kr2Var = this.viewModel;
        if (kr2Var != null) {
            return kr2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void X1(e67 e67Var) {
        Intrinsics.checkNotNullParameter(e67Var, "<set-?>");
        this.binding = e67Var;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void Z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void b2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void e2(HServices hServices) {
        Intrinsics.checkNotNullParameter(hServices, "<set-?>");
        this.retrofitService = hServices;
    }

    public final void f2(kr2 kr2Var) {
        Intrinsics.checkNotNullParameter(kr2Var, "<set-?>");
        this.viewModel = kr2Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, z1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_hypothecation_addition);
        e67 e67VarC = e67.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(e67VarC, "inflate(...)");
        X1(e67VarC);
        setContentView(y1().b());
        ta3.a.V2(this, y1());
        Z1(new wa3(this));
        b2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        e2(HServices.INSTANCE.a(this));
        f2((kr2) new z(this, new wk2(new ir2(E1()))).a(kr2.class));
        c2(String.valueOf(getIntent().getStringExtra("RC")));
        a2(String.valueOf(getIntent().getStringExtra("off_code")));
        W1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        V1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        c2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra);
        if (this.isFaceless) {
            y1().o.e.setWeightSum(3.0f);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        VContant.Companion companion = VContant.INSTANCE;
        LinearLayout appMent = y1().o.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(booleanExtra, appMent);
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra2);
        y1().z.setText(z1().b("vehicle_no", "Vehicle No.:") + ' ' + C1());
        y1().A.setText(z1().b("view_vehicle_details", "View Vehicle Details"));
        y1().A.setPaintFlags(y1().A.getPaintFlags() | 8);
        y1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.is2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivity.G1(this.a, view);
            }
        });
        y1().r.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rs2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivity.H1(this.a, view);
            }
        });
        y1().r.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivity.M1(this.a, view);
            }
        });
        try {
            B1().show();
            F1().o();
        } catch (Exception unused) {
        }
        F1().n().g(this, new mf4() { // from class: com.zepto.ts2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.N1(this.a, (VahanStateModle) obj);
            }
        });
        F1().p().g(this, new mf4() { // from class: com.zepto.us2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.O1(this.a, (String) obj);
            }
        });
        F1().g().g(this, new mf4() { // from class: com.zepto.vs2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.P1(this.a, (DistictModle) obj);
            }
        });
        F1().h().g(this, new mf4() { // from class: com.zepto.js2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.Q1(this.a, (String) obj);
            }
        });
        F1().i().g(this, new mf4() { // from class: com.zepto.ks2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.R1(this.a, (HtpTypeModle) obj);
            }
        });
        F1().j().g(this, new mf4() { // from class: com.zepto.ls2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.S1(this.a, (String) obj);
            }
        });
        Spinner spinner = y1().p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ms2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationAdditionActivity.T1(this.a, datePicker, i, i2, i3);
            }
        };
        y1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ns2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivity.I1(this.a, onDateSetListener, view);
            }
        });
        y1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.os2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivity.J1(this.a, view);
            }
        });
        F1().k().g(this, new mf4() { // from class: com.zepto.ps2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.K1(this.a, (HPAResModle) obj);
            }
        });
        F1().l().g(this, new mf4() { // from class: com.zepto.qs2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivity.L1(this.a, (String) obj);
            }
        });
    }

    public final String w1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String x1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final e67 y1() {
        e67 e67Var = this.binding;
        if (e67Var != null) {
            return e67Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 z1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }
}
