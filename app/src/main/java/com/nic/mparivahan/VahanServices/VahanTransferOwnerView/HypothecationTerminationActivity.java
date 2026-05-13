package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.g67;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010H\u001a\n A*\u0004\u0018\u00010@0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010_\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010.\u001a\u0004\b]\u00100\"\u0004\b^\u00102R\"\u0010c\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010.\u001a\u0004\ba\u00100\"\u0004\bb\u00102R\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/HypothecationTerminationActivity;", "Lcom/zepto/pq;", "", "O1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "b2", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "W1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "D1", "()Lcom/zepto/ld7;", "a2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/g67;", "F", "Lcom/zepto/g67;", "v1", "()Lcom/zepto/g67;", "R1", "(Lcom/zepto/g67;)V", "binding", "G", "Ljava/lang/String;", "A1", "()Ljava/lang/String;", "X1", "(Ljava/lang/String;)V", "rc_number", "H", "y1", "V1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Y1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "K", "getFormated_date", "S1", "formated_date", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "L", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "w1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "T1", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;)V", "htpmodle", "", "M", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "N", "u1", "Q1", "aadhar_name", "O", "t1", "P1", "aadhar_address", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "U1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationTerminationActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public g67 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HptDetailsModle htpmodle;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final void E1(HypothecationTerminationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.A1());
        intent.putExtra("RcDetails", this$0.B1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
        this$0.startActivity(intent);
    }

    public static final void F1(HypothecationTerminationActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.S1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.v1().h.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void G1(HypothecationTerminationActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H1(HypothecationTerminationActivity this$0, Ref.ObjectRef languageSession, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        this$0.z1().dismiss();
        try {
            Intrinsics.checkNotNull(hptDetailsModle);
            this$0.T1(hptDetailsModle);
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String strValueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            gd1.a aVar = gd1.a;
            if (!aVar.m(string) && !aVar.m(strValueOf)) {
                if (strValueOf.length() == 0) {
                    this$0.v1().l.setText("--");
                } else {
                    this$0.v1().l.setText(strValueOf);
                }
                if (strValueOf2.length() != 0) {
                    this$0.v1().j.setText(strValueOf2 + strValueOf3 + strValueOf4);
                }
                if (strValueOf5.length() != 0) {
                    this$0.v1().g.setText(k18.a.f(strValueOf5));
                }
                if (string != null && string.length() != 0) {
                    this$0.v1().w.setText(string.toString());
                    return;
                }
                return;
            }
            String strB = ((wa3) languageSession.element).b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.b2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I1(HypothecationTerminationActivity this$0, Ref.ObjectRef languageSession, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        this$0.z1().dismiss();
        try {
            String strB = ((wa3) languageSession.element).b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.b2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void J1(HypothecationTerminationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().h.getText().length() < 2) {
            Toast.makeText(this$0, this$0.x1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            String fncr_add1 = this$0.w1().getFncr_add1();
            String fncr_add2 = this$0.w1().getFncr_add2();
            String fncr_add3 = this$0.w1().getFncr_add3();
            String fncr_district = this$0.w1().getFncr_district();
            String fncr_district2 = this$0.w1().getFncr_district();
            String fncr_name = this$0.w1().getFncr_name();
            String fncr_pincode = this$0.w1().getFncr_pincode();
            String fncr_state = this$0.w1().getFncr_state();
            String fncr_state2 = this$0.w1().getFncr_state();
            String from_dt = this$0.w1().getFrom_dt();
            String hp_type = this$0.w1().getHp_type();
            String strY1 = this$0.y1();
            String strR = hz0.a.r();
            String strA1 = this$0.A1();
            String state_cd = this$0.B1().getState_cd();
            k18.a aVar = k18.a;
            this$0.D1().x1(this$0, new HPTRequestParamModle(" ", fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district2, fncr_name, fncr_pincode, fncr_state, fncr_state2, "0", "0", "0", "0", from_dt, " ", hp_type, " ", strY1, strR, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, strA1, VContant.MAINSCREEN, state_cd, aVar.h(this$0.v1().h.getText().toString()), "", aVar.h(this$0.v1().h.getText().toString()), ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void K1(HypothecationTerminationActivity this$0, HptTerResponse hptTerResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        try {
            String appl_no = hptTerResponse.getAppl_no();
            if (appl_no != null && appl_no.length() != 0) {
                vh7 vh7Var = new vh7(this$0);
                Intrinsics.checkNotNull(hptTerResponse);
                HptTerResponse hptTerResponseCopy = this$0.isFaceless ? hptTerResponse.copy((268435455 & 1) != 0 ? hptTerResponse.appl_no : null, (268435455 & 2) != 0 ? hptTerResponse.fncr_add1 : null, (268435455 & 4) != 0 ? hptTerResponse.fncr_add2 : null, (268435455 & 8) != 0 ? hptTerResponse.fncr_add3 : null, (268435455 & 16) != 0 ? hptTerResponse.fncr_district : 0, (268435455 & 32) != 0 ? hptTerResponse.fncr_district_descr : null, (268435455 & 64) != 0 ? hptTerResponse.fncr_name : null, (268435455 & 128) != 0 ? hptTerResponse.fncr_pincode : 0, (268435455 & 256) != 0 ? hptTerResponse.fncr_state : null, (268435455 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? hptTerResponse.fncr_state_name : null, (268435455 & 1024) != 0 ? hptTerResponse.fncr_taluk : 0, (268435455 & 2048) != 0 ? hptTerResponse.fncr_taluk_descr : null, (268435455 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? hptTerResponse.fncr_village : 0, (268435455 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? hptTerResponse.fncr_village_descr : null, (268435455 & 16384) != 0 ? hptTerResponse.from_dt : null, (268435455 & 32768) != 0 ? hptTerResponse.from_dt_descr : null, (268435455 & 65536) != 0 ? hptTerResponse.hp_type : null, (268435455 & 131072) != 0 ? hptTerResponse.hp_type_descr : null, (268435455 & 262144) != 0 ? hptTerResponse.off_cd : null, (268435455 & 524288) != 0 ? hptTerResponse.op_dt : null, (268435455 & 1048576) != 0 ? hptTerResponse.pur_cd : 0, (268435455 & 2097152) != 0 ? hptTerResponse.regn_no : null, (268435455 & 4194304) != 0 ? hptTerResponse.sr_no : 0, (268435455 & 8388608) != 0 ? hptTerResponse.state_cd : null, (268435455 & 16777216) != 0 ? hptTerResponse.term_dt : null, (268435455 & 33554432) != 0 ? hptTerResponse.term_dt_descr : null, (268435455 & 67108864) != 0 ? hptTerResponse.upto_dt : null, (268435455 & 134217728) != 0 ? hptTerResponse.upto_dt_descr : null, (268435455 & 268435456) != 0 ? hptTerResponse.aadhaartxno : vh7Var.a()) : hptTerResponse.copy((268435455 & 1) != 0 ? hptTerResponse.appl_no : null, (268435455 & 2) != 0 ? hptTerResponse.fncr_add1 : null, (268435455 & 4) != 0 ? hptTerResponse.fncr_add2 : null, (268435455 & 8) != 0 ? hptTerResponse.fncr_add3 : null, (268435455 & 16) != 0 ? hptTerResponse.fncr_district : 0, (268435455 & 32) != 0 ? hptTerResponse.fncr_district_descr : null, (268435455 & 64) != 0 ? hptTerResponse.fncr_name : null, (268435455 & 128) != 0 ? hptTerResponse.fncr_pincode : 0, (268435455 & 256) != 0 ? hptTerResponse.fncr_state : null, (268435455 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? hptTerResponse.fncr_state_name : null, (268435455 & 1024) != 0 ? hptTerResponse.fncr_taluk : 0, (268435455 & 2048) != 0 ? hptTerResponse.fncr_taluk_descr : null, (268435455 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? hptTerResponse.fncr_village : 0, (268435455 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? hptTerResponse.fncr_village_descr : null, (268435455 & 16384) != 0 ? hptTerResponse.from_dt : null, (268435455 & 32768) != 0 ? hptTerResponse.from_dt_descr : null, (268435455 & 65536) != 0 ? hptTerResponse.hp_type : null, (268435455 & 131072) != 0 ? hptTerResponse.hp_type_descr : null, (268435455 & 262144) != 0 ? hptTerResponse.off_cd : null, (268435455 & 524288) != 0 ? hptTerResponse.op_dt : null, (268435455 & 1048576) != 0 ? hptTerResponse.pur_cd : 0, (268435455 & 2097152) != 0 ? hptTerResponse.regn_no : null, (268435455 & 4194304) != 0 ? hptTerResponse.sr_no : 0, (268435455 & 8388608) != 0 ? hptTerResponse.state_cd : null, (268435455 & 16777216) != 0 ? hptTerResponse.term_dt : null, (268435455 & 33554432) != 0 ? hptTerResponse.term_dt_descr : null, (268435455 & 67108864) != 0 ? hptTerResponse.upto_dt : null, (268435455 & 134217728) != 0 ? hptTerResponse.upto_dt_descr : null, (268435455 & 268435456) != 0 ? hptTerResponse.aadhaartxno : " ");
                Intent intent = new Intent(this$0, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
                intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, hptTerResponseCopy);
                intent.putExtra(VContant.APP_NO, hptTerResponse.getAppl_no());
                intent.putExtra("state_code", this$0.B1().getState_cd());
                intent.putExtra("rc_number", this$0.A1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                intent.putExtra("off_code", this$0.y1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra("RC", this$0.A1());
                intent.putExtra("RcDetails", this$0.B1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
                this$0.startActivity(intent);
                this$0.finish();
            }
        } catch (Exception unused) {
        }
    }

    public static final void L1(HypothecationTerminationActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
    }

    public static final void M1(HypothecationTerminationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.x1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void N1(HypothecationTerminationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1();
    }

    private final void O1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void c2(Dialog dialog, HypothecationTerminationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.finish();
    }

    public final String A1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails B1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService C1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 D1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void R1(g67 g67Var) {
        Intrinsics.checkNotNullParameter(g67Var, "<set-?>");
        this.binding = g67Var;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void T1(HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(hptDetailsModle, "<set-?>");
        this.htpmodle = hptDetailsModle;
    }

    public final void U1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void W1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void Y1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Z1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void a2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void b2(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.c2(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.zepto.wa3] */
    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_hypothecation_termination);
        g67 g67VarC = g67.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g67VarC, "inflate(...)");
        R1(g67VarC);
        setContentView(v1().b());
        ta3.a.X0(this, v1());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this);
        Z1(VahanProService.INSTANCE.a(this));
        W1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        a2((ld7) new z(this, new kd7(new jd7(C1()))).a(ld7.class));
        X1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Y1((NrvDetails) serializableExtra);
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        U1(new wa3(this));
        v1().H.setText(x1().b("vehicle_no", "Vehicle No.:") + ' ' + A1());
        v1().I.setText(x1().b("view_vehicle_details", "View Vehicle Details"));
        v1().I.setPaintFlags(v1().I.getPaintFlags() | 8);
        v1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.E1(this.a, view);
            }
        });
        V1(String.valueOf(getIntent().getStringExtra("off_code")));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        if (booleanExtra) {
            v1().s.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = v1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        try {
            z1().show();
            D1().n0(this, A1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.zu2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationTerminationActivity.F1(this.a, datePicker, i, i2, i3);
            }
        };
        v1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.av2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.G1(this.a, onDateSetListener, view);
            }
        });
        D1().o0().g(this, new mf4() { // from class: com.zepto.bv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivity.H1(this.a, objectRef, (HptDetailsModle) obj);
            }
        });
        D1().p0().g(this, new mf4() { // from class: com.zepto.cv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivity.I1(this.a, objectRef, (String) obj);
            }
        });
        v1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.J1(this.a, view);
            }
        });
        D1().q0().g(this, new mf4() { // from class: com.zepto.ev2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivity.K1(this.a, (HptTerResponse) obj);
            }
        });
        D1().r0().g(this, new mf4() { // from class: com.zepto.fv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivity.L1(this.a, (String) obj);
            }
        });
        v1().v.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.M1(this.a, view);
            }
        });
        v1().v.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivity.N1(this.a, view);
            }
        });
    }

    public final String t1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String u1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final g67 v1() {
        g67 g67Var = this.binding;
        if (g67Var != null) {
            return g67Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final HptDetailsModle w1() {
        HptDetailsModle hptDetailsModle = this.htpmodle;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("htpmodle");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String y1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
