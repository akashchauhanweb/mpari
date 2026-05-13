package com.nic.mparivahan.VahanServices.Nominee;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundFeeServices;
import com.nic.mparivahan.VahanServices.Nominee.NModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.Nominee.NModel.Data;
import com.nic.mparivahan.VahanServices.Nominee.NModel.DataX;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeDraftResponse;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRelationModle;
import com.nic.mparivahan.VahanServices.Nominee.NModel.NomineeRequest;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import com.zepto.al7;
import com.zepto.as0;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jb4;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.ur0;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.xb4;
import com.zepto.yy0;
import com.zepto.zr0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010U\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR>\u0010^\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0Vj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010i\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010m\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010`\u001a\u0004\bk\u0010b\"\u0004\bl\u0010dR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR2\u0010~\u001a\u0012\u0012\u0004\u0012\u00020\u000b0vj\b\u0012\u0004\u0012\u00020\u000b`w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010`\u001a\u0005\b\u0080\u0001\u0010b\"\u0005\b\u0081\u0001\u0010dR*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0096\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010`\u001a\u0005\b\u0094\u0001\u0010b\"\u0005\b\u0095\u0001\u0010dR*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010¢\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010`\u001a\u0005\b \u0001\u0010b\"\u0005\b¡\u0001\u0010dR&\u0010¦\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b£\u0001\u0010`\u001a\u0005\b¤\u0001\u0010b\"\u0005\b¥\u0001\u0010dR*\u0010©\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Nominee/NomineeActivity;", "Lcom/zepto/pq;", "", "K1", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "", "message", "e2", "Lcom/zepto/jb4;", "C", "Lcom/zepto/jb4;", "s1", "()Lcom/zepto/jb4;", "P1", "(Lcom/zepto/jb4;)V", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "R1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "F", "Lcom/zepto/al7;", "getViewModel", "()Lcom/zepto/al7;", "c2", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "X1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "Lcom/zepto/vh7;", "H", "Lcom/zepto/vh7;", "A1", "()Lcom/zepto/vh7;", "Z1", "(Lcom/zepto/vh7;)V", "session", "Lcom/zepto/ld7;", "I", "Lcom/zepto/ld7;", "getVahanViewModle", "()Lcom/zepto/ld7;", "b2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "K", "getViewModelAddMob", "d2", "viewModelAddMob", "L", "z1", "Y1", "retrofitServiceAddMob", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "M", "Ljava/util/HashMap;", "getServiceSelectionHashMap", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "N", "Ljava/lang/String;", "getMobile_number", "()Ljava/lang/String;", "setMobile_number", "(Ljava/lang/String;)V", "mobile_number", "O", "getOff_code", "setOff_code", "off_code", "P", "getState_intent", "setState_intent", "state_intent", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "T1", "(Lcom/zepto/wa3;)V", "languageSession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "R", "Ljava/util/ArrayList;", "getRcArrayList", "()Ljava/util/ArrayList;", "setRcArrayList", "(Ljava/util/ArrayList;)V", "rcArrayList", "S", "getRegistrationDateEtString", "setRegistrationDateEtString", "registrationDateEtString", "Lcom/zepto/as0;", "T", "Lcom/zepto/as0;", "t1", "()Lcom/zepto/as0;", "Q1", "(Lcom/zepto/as0;)V", "compoundViewModel", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "U", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "u1", "()Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;", "S1", "(Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundFeeServices;)V", "feeService", "V", "getRc_number", "V1", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "X", "getAadhar_name", "O1", "aadhar_name", "Y", "getAadhar_address", "N1", "aadhar_address", "", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NomineeActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jb4 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public al7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public as0 compoundViewModel;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public CompoundFeeServices feeService;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String mobile_number = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String state_intent = "NA";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList rcArrayList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String registrationDateEtString = "";

    public static final void C1(NomineeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D1(NomineeActivity this$0, NomineeRelationModle nomineeRelationModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        if (nomineeRelationModle.getApiMessage().getStatusCode() == 200) {
            Data data = new Data(0, "Select Relation");
            new ArrayList();
            ArrayList<Data> data2 = nomineeRelationModle.getData();
            data2.add(0, data);
            this$0.s1().h.setAdapter((SpinnerAdapter) new xb4(this$0, data2));
        }
    }

    public static final void E1(NomineeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
    }

    public static final void F1(NomineeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.s1().i.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 3) {
            Toast.makeText(this$0, this$0.v1().b("please_enter_valid_name", this$0.getString(R.string.please_enter_valid_name)), 1).show();
            return;
        }
        if (this$0.s1().h.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.v1().b("label_please_select_relation", this$0.getString(R.string.please_enter_valid_name)), 1).show();
            return;
        }
        if (this$0.s1().f.getText().length() == 0) {
            Toast.makeText(this$0, this$0.v1().b("please_select_nomination_date", this$0.getString(R.string.please_select_nomination_date)), 1).show();
            return;
        }
        this$0.w1().show();
        Object selectedItem = this$0.s1().h.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.Nominee.NModel.Data");
        Data data = (Data) selectedItem;
        String str = this$0.registrationDateEtString;
        String strValueOf = String.valueOf(this$0.s1().i.getText());
        String str2 = this$0.off_code;
        Integer numValueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
        Intrinsics.checkNotNull(numValueOf);
        NomineeRequest nomineeRequest = new NomineeRequest(" ", str, strValueOf, numValueOf.intValue(), hz0.a.r(), Integer.parseInt(VContant.NOMINEE_PURPOSE_CODE), String.valueOf(this$0.x1().getRc_regn_no()), data.getCode(), String.valueOf(this$0.x1().getState_cd()));
        Gson gson = new Gson();
        as0 as0VarT1 = this$0.t1();
        String json = gson.toJson(nomineeRequest);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        as0VarT1.g(json);
    }

    public static final void G1(NomineeActivity this$0, NomineeDraftResponse nomineeDraftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        ApiMessageX apiMessage = nomineeDraftResponse.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            ApiMessageX apiMessage2 = nomineeDraftResponse.getApiMessage();
            this$0.e2(this$0, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
            return;
        }
        gd1.a aVar = gd1.a;
        DataX data = nomineeDraftResponse.getData();
        if (aVar.m(data != null ? data.getApplNo() : null)) {
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) VahanFaceLessConfirmation.class);
        intent.putExtra("state_code", String.valueOf(this$0.x1().getState_cd()));
        intent.putExtra("rc_number", this$0.x1().getRc_regn_no());
        DataX data2 = nomineeDraftResponse.getData();
        intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
        intent.putExtra(VContant.PURPOSE_CODE, VContant.NOMINEE_PURPOSE_CODE);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void H1(NomineeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
    }

    public static final void I1(NomineeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    public static final void J1(NomineeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1();
    }

    private final void K1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void M1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, NomineeActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationDateEtString = sb3.toString();
        AppCompatTextView appCompatTextView = this$0.s1().f;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatTextView.setText(sb4.toString());
    }

    public static final void f2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final vh7 A1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final void L1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ja4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                NomineeActivity.M1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void P1(jb4 jb4Var) {
        Intrinsics.checkNotNullParameter(jb4Var, "<set-?>");
        this.binding = jb4Var;
    }

    public final void Q1(as0 as0Var) {
        Intrinsics.checkNotNullParameter(as0Var, "<set-?>");
        this.compoundViewModel = as0Var;
    }

    public final void R1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void S1(CompoundFeeServices compoundFeeServices) {
        Intrinsics.checkNotNullParameter(compoundFeeServices, "<set-?>");
        this.feeService = compoundFeeServices;
    }

    public final void T1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final void Y1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void Z1(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void a2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void b2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void c2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    public final void d2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final void e2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ia4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeActivity.f2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nominee_layout);
        jb4 jb4VarC = jb4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jb4VarC, "inflate(...)");
        P1(jb4VarC);
        setContentView(s1().b());
        getWindow().addFlags(128);
        T1(new wa3(this));
        ta3.a.A1(this, s1());
        if (getIntent() != null) {
            this.off_code = String.valueOf(getIntent().getStringExtra("off_code"));
            this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
            O1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            V1(String.valueOf(getIntent().getStringExtra("RC")));
            Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            W1((NrvDetails) serializableExtra);
        }
        VahanProService.Companion companion = VahanProService.INSTANCE;
        a2(companion.a(this));
        S1(CompoundFeeServices.INSTANCE.a(this));
        Y1(companion.a(this));
        Q1((as0) new z(this, new ur0(new zr0(u1()))).a(as0.class));
        X1(VahanServiceConnection.INSTANCE.a(this));
        d2((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        c2((al7) new z(this, new bl7(new bg7(y1()))).a(al7.class));
        b2((ld7) new z(this, new kd7(new jd7(B1()))).a(ld7.class));
        wa3 wa3Var = new wa3(this);
        U1(new ProgressDialog(this));
        w1().setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        Z1(new vh7(this));
        s1().k.i.setText(VContant.INSTANCE.n(this, A1()));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        R1(databaseHelperD0);
        try {
            if (StringsKt__StringsJVMKt.equals(A1().c(), VContant.COMPOUND_FEE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(A1().c(), VContant.Nominee_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.Nominee_Addition, VContant.Nominee_CODE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        s1().k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aa4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeActivity.C1(this.a, view);
            }
        });
        w1().show();
        t1().p();
        t1().n().g(this, new mf4() { // from class: com.zepto.ba4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeActivity.D1(this.a, (NomineeRelationModle) obj);
            }
        });
        t1().o().g(this, new mf4() { // from class: com.zepto.ca4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeActivity.E1(this.a, (String) obj);
            }
        });
        s1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.da4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeActivity.F1(this.a, view);
            }
        });
        t1().l().g(this, new mf4() { // from class: com.zepto.ea4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeActivity.G1(this.a, (NomineeDraftResponse) obj);
            }
        });
        t1().m().g(this, new mf4() { // from class: com.zepto.fa4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeActivity.H1(this.a, (String) obj);
            }
        });
        s1().k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ga4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeActivity.I1(this.a, view);
            }
        });
        s1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ha4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeActivity.J1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.INSTANCE.a(this);
        } catch (Exception unused) {
        }
    }

    public final jb4 s1() {
        jb4 jb4Var = this.binding;
        if (jb4Var != null) {
            return jb4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final as0 t1() {
        as0 as0Var = this.compoundViewModel;
        if (as0Var != null) {
            return as0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("compoundViewModel");
        return null;
    }

    public final CompoundFeeServices u1() {
        CompoundFeeServices compoundFeeServices = this.feeService;
        if (compoundFeeServices != null) {
            return compoundFeeServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feeService");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanServiceConnection y1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }
}
