package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.HypothecationTerminationActivityMultiServiceTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.gz3;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.nr2;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010H\u001a\n A*\u0004\u0018\u00010@0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010_\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010.\u001a\u0004\b]\u00100\"\u0004\b^\u00102R\"\u0010c\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010.\u001a\u0004\ba\u00100\"\u0004\bb\u00102R\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010o\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010f\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR*\u0010w\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u007f\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/HypothecationTerminationActivityMultiServiceTO;", "Lcom/zepto/pq;", "", "O1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "e2", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "A1", "()Landroid/app/ProgressDialog;", "Y1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "E1", "()Lcom/zepto/ld7;", "c2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/nr2;", "F", "Lcom/zepto/nr2;", "u1", "()Lcom/zepto/nr2;", "R1", "(Lcom/zepto/nr2;)V", "binding", "G", "Ljava/lang/String;", "B1", "()Ljava/lang/String;", "Z1", "(Ljava/lang/String;)V", "rc_number", "H", "z1", "X1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "K", "getFormated_date", "S1", "formated_date", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "L", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "v1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "T1", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;)V", "htpmodle", "", "M", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "N", "t1", "Q1", "aadhar_name", "O", "s1", "P1", "aadhar_address", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "V1", "(Lcom/zepto/wa3;)V", "languageSession", "Q", "w1", "U1", "languageKeySession", "Ljava/util/ArrayList;", "R", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "S", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "T", "getDraftObj", "setDraftObj", "draftObj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "U", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "V", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationTerminationActivityMultiServiceTO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public nr2 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

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
    public wa3 languageSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraftTO draftObj;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final void F1(HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void G1(HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.B1());
        intent.putExtra("RcDetails", this$0.C1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
    }

    public static final void H1(HypothecationTerminationActivityMultiServiceTO this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.u1().h.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void I1(HypothecationTerminationActivityMultiServiceTO this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void J1(HypothecationTerminationActivityMultiServiceTO this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
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
                    this$0.u1().l.setText("--");
                } else {
                    this$0.u1().l.setText(strValueOf);
                }
                if (strValueOf2.length() != 0) {
                    this$0.u1().j.setText(strValueOf2 + strValueOf3 + strValueOf4);
                }
                if (strValueOf5.length() != 0) {
                    this$0.u1().g.setText(k18.a.f(strValueOf5));
                }
                if (string != null && string.length() != 0) {
                    this$0.u1().x.setText(string.toString());
                    return;
                }
                return;
            }
            String strB = this$0.x1().b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.e2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void K1(HypothecationTerminationActivityMultiServiceTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
        try {
            String strB = this$0.x1().b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.e2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void L1(HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().h.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            String strValueOf = String.valueOf(this$0.v1().getFncr_add1());
            String strValueOf2 = String.valueOf(this$0.v1().getFncr_add2());
            String strValueOf3 = String.valueOf(this$0.v1().getFncr_add3());
            String fncr_district = this$0.v1().getFncr_district();
            Intrinsics.checkNotNull(fncr_district);
            int i = Integer.parseInt(fncr_district);
            String strValueOf4 = String.valueOf(this$0.v1().getFncr_district());
            String strValueOf5 = String.valueOf(this$0.v1().getFncr_name());
            String fncr_pincode = this$0.v1().getFncr_pincode();
            Integer numValueOf = Integer.valueOf(fncr_pincode != null ? Integer.parseInt(fncr_pincode) : 1);
            String fncr_state = this$0.v1().getFncr_state();
            String fncr_state2 = this$0.v1().getFncr_state();
            String strValueOf6 = String.valueOf(this$0.v1().getFrom_dt());
            String hp_type = this$0.v1().getHp_type();
            int i2 = Integer.parseInt(this$0.z1());
            String strR = hz0.a.r();
            int i3 = Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
            String strB1 = this$0.B1();
            Integer rc_owner_srNo = this$0.C1().getRc_owner_srNo();
            int iIntValue = rc_owner_srNo != null ? rc_owner_srNo.intValue() : 1;
            String strValueOf7 = String.valueOf(this$0.C1().getState_cd());
            k18.a aVar = k18.a;
            HptDto hptDto = new HptDto(" ", strValueOf, strValueOf2, strValueOf3, i, strValueOf4, strValueOf5, numValueOf, fncr_state, fncr_state2, 0, "0", 0, "0", strValueOf6, " ", hp_type, " ", i2, strR, i3, strB1, iIntValue, strValueOf7, aVar.h(this$0.u1().h.getText().toString()), " ", aVar.h(this$0.u1().h.getText().toString()), " ");
            MultiServiceDraftTO multiServiceDraftTO = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraftTO);
            this$0.draftObj = MultiServiceDraftTO.copy$default(multiServiceDraftTO, null, null, null, null, null, null, null, hptDto, 0, null, null, null, null, null, null, null, 65407, null);
            Intent intent = new Intent();
            intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.INSTANCE.u(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, this$0.multiServiceList, "S")));
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.B1());
            intent.putExtra("RcDetails", this$0.C1());
            intent.putExtra("off_code", this$0.z1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final void M1(HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.w1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void N1(HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1();
    }

    private final void O1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void f2(Dialog dialog, HypothecationTerminationActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.finish();
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String B1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails C1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService D1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 E1() {
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

    public final void R1(nr2 nr2Var) {
        Intrinsics.checkNotNullParameter(nr2Var, "<set-?>");
        this.binding = nr2Var;
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

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void W1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void b2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void c2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void d2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void e2(Context context, String title) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.f2(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hpttermination_multi_service);
        nr2 nr2VarC = nr2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(nr2VarC, "inflate(...)");
        R1(nr2VarC);
        setContentView(u1().b());
        getWindow().addFlags(128);
        V1(new wa3(this));
        U1(new wa3(this));
        ta3.a.Z0(this, u1());
        b2(VahanProService.INSTANCE.a(this));
        Y1(new ProgressDialog(this));
        A1().setMessage("Please wait...");
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        c2((ld7) new z(this, new kd7(new jd7(D1()))).a(ld7.class));
        W1(MultiService.INSTANCE.a(this));
        d2((MultiSelectionViewModel) new z(this, new y67(new sx3(y1()))).a(MultiSelectionViewModel.class));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        u1().w.e.setVisibility(0);
        u1().w.e.setText(B1());
        SpannableString spannableString = new SpannableString(B1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        u1().w.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            U1(new wa3(this));
            u1().w.i.setText(w1().b("hypothecation_termination", getString(R.string.vahan_hypothecation_termination)));
        } else {
            u1().w.i.setText(String.valueOf(w1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        }
        u1().w.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.F1(this.a, view);
            }
        });
        u1().I.setText(w1().b("vehicle_no", "Vehicle No.:") + ' ' + B1());
        u1().J.setText(w1().b("view_vehicle_details", "View Vehicle Details"));
        u1().J.setPaintFlags(u1().J.getPaintFlags() | 8);
        u1().w.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.G1(this.a, view);
            }
        });
        X1(String.valueOf(C1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        if (booleanExtra) {
            u1().s.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = u1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        try {
            A1().show();
            E1().n0(this, B1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.wv2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationTerminationActivityMultiServiceTO.H1(this.a, datePicker, i, i2, i3);
            }
        };
        u1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.I1(this.a, onDateSetListener, view);
            }
        });
        E1().o0().g(this, new mf4() { // from class: com.zepto.yv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiServiceTO.J1(this.a, (HptDetailsModle) obj);
            }
        });
        E1().p0().g(this, new mf4() { // from class: com.zepto.zv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiServiceTO.K1(this.a, (String) obj);
            }
        });
        u1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.L1(this.a, view);
            }
        });
        u1().w.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.M1(this.a, view);
            }
        });
        u1().w.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiServiceTO.N1(this.a, view);
            }
        });
    }

    public final String s1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String t1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final nr2 u1() {
        nr2 nr2Var = this.binding;
        if (nr2Var != null) {
            return nr2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final HptDetailsModle v1() {
        HptDetailsModle hptDetailsModle = this.htpmodle;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("htpmodle");
        return null;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final MultiService y1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String z1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }
}
