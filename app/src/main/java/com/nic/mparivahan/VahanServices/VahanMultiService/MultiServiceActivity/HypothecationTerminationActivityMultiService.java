package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationTerminationActivityMultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.ed5;
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
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010L\u001a\n E*\u0004\u0018\u00010D0D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00102\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u00102\u001a\u0004\ba\u00104\"\u0004\bb\u00106R\"\u0010g\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00102\u001a\u0004\be\u00104\"\u0004\bf\u00106R\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010v\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010~\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010y\u001a\u0005\b\u0080\u0001\u0010{\"\u0005\b\u0081\u0001\u0010}R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/HypothecationTerminationActivityMultiService;", "Lcom/zepto/pq;", "", "S1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "i2", "purCode", "Ljava/util/ArrayList;", "purSel", "f2", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "F1", "()Lcom/zepto/ld7;", "g2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/nr2;", "F", "Lcom/zepto/nr2;", "w1", "()Lcom/zepto/nr2;", "V1", "(Lcom/zepto/nr2;)V", "binding", "G", "Ljava/lang/String;", "C1", "()Ljava/lang/String;", "c2", "(Ljava/lang/String;)V", "rc_number", "H", "A1", "a2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "K", "getFormated_date", "W1", "formated_date", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "L", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "x1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "X1", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;)V", "htpmodle", "", "M", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "N", "v1", "U1", "aadhar_name", "O", "u1", "T1", "aadhar_address", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "Y1", "(Lcom/zepto/wa3;)V", "languageSession", "Q", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "S", "getDraftObj", "setDraftObj", "draftObj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "T", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "h2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "U", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationTerminationActivityMultiService extends pq {

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

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiServiceDraft draftObj;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final void H1(HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void I1(HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.C1());
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.u1());
        this$0.startActivity(intent);
    }

    public static final void J1(HypothecationTerminationActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        VContant.INSTANCE.N(this$0, str);
    }

    public static final void K1(HypothecationTerminationActivityMultiService this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.W1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.w1().h.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void L1(HypothecationTerminationActivityMultiService this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void M1(HypothecationTerminationActivityMultiService this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            Intrinsics.checkNotNull(hptDetailsModle);
            this$0.X1(hptDetailsModle);
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String strValueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            gd1.a aVar = gd1.a;
            if (!aVar.m(string) && !aVar.m(strValueOf)) {
                if (strValueOf.length() == 0) {
                    this$0.w1().l.setText("--");
                } else {
                    this$0.w1().l.setText(strValueOf);
                }
                if (strValueOf2.length() != 0) {
                    this$0.w1().j.setText(strValueOf2 + strValueOf3 + strValueOf4);
                }
                if (strValueOf5.length() != 0) {
                    this$0.w1().g.setText(k18.a.f(strValueOf5));
                }
                if (string != null && string.length() != 0) {
                    this$0.w1().x.setText(string.toString());
                    return;
                }
                return;
            }
            String strB = this$0.y1().b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.i2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void N1(HypothecationTerminationActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            String strB = this$0.y1().b("unable_to_process_your_request", this$0.getString(R.string.unable_to_process_your_request));
            Intrinsics.checkNotNull(strB);
            this$0.i2(this$0, strB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void O1(HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.w1().h.getText().length() < 2) {
            Toast.makeText(this$0, this$0.y1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            try {
                String strValueOf = String.valueOf(this$0.x1().getFncr_add1());
                String strValueOf2 = String.valueOf(this$0.x1().getFncr_add2());
                String strValueOf3 = String.valueOf(this$0.x1().getFncr_add3());
                String fncr_district = this$0.x1().getFncr_district();
                Intrinsics.checkNotNull(fncr_district);
                int i = Integer.parseInt(fncr_district);
                String strValueOf4 = String.valueOf(this$0.x1().getFncr_district());
                String strValueOf5 = String.valueOf(this$0.x1().getFncr_name());
                String fncr_pincode = this$0.x1().getFncr_pincode();
                Integer numValueOf = Integer.valueOf(fncr_pincode != null ? Integer.parseInt(fncr_pincode) : 1);
                String fncr_state = this$0.x1().getFncr_state();
                String fncr_state2 = this$0.x1().getFncr_state();
                String strValueOf6 = String.valueOf(this$0.x1().getFrom_dt());
                String hp_type = this$0.x1().getHp_type();
                int i2 = Integer.parseInt(this$0.A1());
                String strR = hz0.a.r();
                int i3 = Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                String strC1 = this$0.C1();
                Integer rc_owner_srNo = this$0.D1().getRc_owner_srNo();
                int iIntValue = rc_owner_srNo != null ? rc_owner_srNo.intValue() : 1;
                String strValueOf7 = String.valueOf(this$0.D1().getState_cd());
                k18.a aVar = k18.a;
                HptDto hptDto = new HptDto(" ", strValueOf, strValueOf2, strValueOf3, i, strValueOf4, strValueOf5, numValueOf, fncr_state, fncr_state2, 0, "0", 0, "0", strValueOf6, " ", hp_type, " ", i2, strR, i3, strC1, iIntValue, strValueOf7, aVar.h(this$0.w1().h.getText().toString()), " ", aVar.h(this$0.w1().h.getText().toString()), " ");
                MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft);
                this$0.draftObj = multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : null, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : null, (2045 & 4) != 0 ? multiServiceDraft.durcdto : null, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : null, (2045 & 16) != 0 ? multiServiceDraft.hptDto : hptDto, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            VContant.Companion companion = VContant.INSTANCE;
            if (StringsKt__StringsJVMKt.equals(companion.t(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, this$0.multiServiceList), VContant.REDIRECT, true)) {
                this$0.B1().show();
                MultiSelectionViewModel multiSelectionViewModelG1 = this$0.G1();
                MultiServiceDraft multiServiceDraft2 = this$0.draftObj;
                Intrinsics.checkNotNull(multiServiceDraft2);
                multiSelectionViewModelG1.v(multiServiceDraft2);
                return;
            }
            Intent intent = new Intent();
            if (companion.w(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, this$0.multiServiceList)) {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.t(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, this$0.multiServiceList)));
            } else {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.t(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, this$0.multiServiceList)));
            }
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.C1());
            intent.putExtra("RcDetails", this$0.D1());
            intent.putExtra("off_code", this$0.A1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.v1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.u1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void P1(HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.y1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void Q1(HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S1();
    }

    public static final void R1(HypothecationTerminationActivityMultiService this$0, DraftResponse draftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
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
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.u1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void S1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void j2(Dialog dialog, HypothecationTerminationActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.finish();
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

    public final VahanProService E1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 F1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel G1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void V1(nr2 nr2Var) {
        Intrinsics.checkNotNullParameter(nr2Var, "<set-?>");
        this.binding = nr2Var;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void X1(HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(hptDetailsModle, "<set-?>");
        this.htpmodle = hptDetailsModle;
    }

    public final void Y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void Z1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
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

    public final void e2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void f2(String purCode, ArrayList purSel) {
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        try {
            Intrinsics.checkNotNull(purSel);
            int iIndexOf = purSel.indexOf(purCode);
            if (purSel.size() == 4) {
                w1().t.b.setVisibility(0);
                TextView textView = w1().t.d;
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                textView.setText(companion.D(this, (String) obj));
                TextView textView2 = w1().t.f;
                Object obj2 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                textView2.setText(companion.D(this, (String) obj2));
                TextView textView3 = w1().t.k;
                Object obj3 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                textView3.setText(companion.D(this, (String) obj3));
                TextView textView4 = w1().t.n;
                Object obj4 = purSel.get(3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                textView4.setText(companion.D(this, (String) obj4));
                if (iIndexOf == 3) {
                    w1().t.c.setChecked(true);
                    w1().t.e.setChecked(true);
                    w1().t.h.setChecked(true);
                    w1().t.m.setChecked(false);
                }
                if (iIndexOf == 2) {
                    w1().t.c.setChecked(true);
                    w1().t.e.setChecked(true);
                    w1().t.h.setChecked(false);
                    w1().t.m.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 1) {
                    w1().t.c.setChecked(true);
                    w1().t.e.setChecked(false);
                    Drawable drawableE = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().t.h.setCheckMarkDrawable(drawableE);
                    w1().t.m.setCheckMarkDrawable(drawableE);
                }
                if (iIndexOf == 0) {
                    w1().t.c.setChecked(false);
                    Drawable drawableE2 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().t.e.setCheckMarkDrawable(drawableE2);
                    w1().t.h.setCheckMarkDrawable(drawableE2);
                    w1().t.m.setCheckMarkDrawable(drawableE2);
                }
            }
            if (purSel.size() == 3) {
                w1().t.u.setVisibility(0);
                TextView textView5 = w1().t.z;
                VContant.Companion companion2 = VContant.INSTANCE;
                Object obj5 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                textView5.setText(companion2.D(this, (String) obj5));
                TextView textView6 = w1().t.w;
                Object obj6 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                textView6.setText(companion2.D(this, (String) obj6));
                TextView textView7 = w1().t.j;
                Object obj7 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                textView7.setText(companion2.D(this, (String) obj7));
                if (iIndexOf == 2) {
                    w1().t.i.setChecked(true);
                    w1().t.v.setChecked(true);
                    w1().t.y.setChecked(false);
                }
                if (iIndexOf == 1) {
                    w1().t.i.setChecked(true);
                    w1().t.v.setChecked(false);
                    w1().t.y.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 0) {
                    w1().t.i.setChecked(false);
                    Drawable drawableE3 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().t.v.setCheckMarkDrawable(drawableE3);
                    w1().t.y.setCheckMarkDrawable(drawableE3);
                }
            }
            if (purSel.size() == 2) {
                w1().t.A.setVisibility(0);
                TextView textView8 = w1().t.t;
                VContant.Companion companion3 = VContant.INSTANCE;
                Object obj8 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                textView8.setText(companion3.D(this, (String) obj8));
                TextView textView9 = w1().t.r;
                Object obj9 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                textView9.setText(companion3.D(this, (String) obj9));
                if (iIndexOf == 1) {
                    w1().t.q.setChecked(true);
                    w1().t.s.setChecked(false);
                }
                if (iIndexOf == 0) {
                    w1().t.q.setChecked(false);
                    w1().t.s.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void g2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void h2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void i2(Context context, String title) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.j2(dialog, this, view);
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
        V1(nr2VarC);
        setContentView(w1().b());
        ta3.a.Y0(this, w1());
        Y1(new wa3(this));
        e2(VahanProService.INSTANCE.a(this));
        b2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        g2((ld7) new z(this, new kd7(new jd7(E1()))).a(ld7.class));
        Z1(MultiService.INSTANCE.a(this));
        h2((MultiSelectionViewModel) new z(this, new y67(new sx3(z1()))).a(MultiSelectionViewModel.class));
        c2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra);
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.multiServiceList = arrayList;
        f2(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, arrayList);
        w1().w.e.setVisibility(0);
        w1().w.e.setText(C1());
        SpannableString spannableString = new SpannableString(C1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        w1().w.e.setText(spannableString);
        ArrayList arrayList2 = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList2);
        if (arrayList2.size() <= 1) {
            Y1(new wa3(this));
            w1().w.i.setText(y1().b("hypothecation_termination", getString(R.string.vahan_hypothecation_termination)));
        } else {
            SpannableString spannableString2 = new SpannableString(y1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            w1().w.i.setText(spannableString2);
        }
        w1().w.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.H1(this.a, view);
            }
        });
        Y1(new wa3(this));
        w1().I.setText(y1().b("vehicle_no", "Vehicle No.:") + ' ' + C1());
        w1().J.setText(y1().b("view_vehicle_details", "View Vehicle Details"));
        w1().J.setPaintFlags(w1().J.getPaintFlags() | 8);
        w1().w.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.I1(this.a, view);
            }
        });
        a2(String.valueOf(D1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        if (booleanExtra) {
            w1().s.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = w1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        try {
            B1().show();
            F1().n0(this, C1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.nv2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationTerminationActivityMultiService.K1(this.a, datePicker, i, i2, i3);
            }
        };
        w1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ov2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.L1(this.a, onDateSetListener, view);
            }
        });
        F1().o0().g(this, new mf4() { // from class: com.zepto.pv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiService.M1(this.a, (HptDetailsModle) obj);
            }
        });
        F1().p0().g(this, new mf4() { // from class: com.zepto.qv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiService.N1(this.a, (String) obj);
            }
        });
        w1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.O1(this.a, view);
            }
        });
        w1().w.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.P1(this.a, view);
            }
        });
        w1().w.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationActivityMultiService.Q1(this.a, view);
            }
        });
        G1().l().g(this, new mf4() { // from class: com.zepto.jv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiService.R1(this.a, (DraftResponse) obj);
            }
        });
        G1().m().g(this, new mf4() { // from class: com.zepto.lv2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationTerminationActivityMultiService.J1(this.a, (String) obj);
            }
        });
    }

    public final String u1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String v1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final nr2 w1() {
        nr2 nr2Var = this.binding;
        if (nr2Var != null) {
            return nr2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final HptDetailsModle x1() {
        HptDetailsModle hptDetailsModle = this.htpmodle;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("htpmodle");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final MultiService z1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }
}
