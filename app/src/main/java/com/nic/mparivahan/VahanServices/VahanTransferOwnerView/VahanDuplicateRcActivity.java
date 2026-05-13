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
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.DuprcDto;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.c47;
import com.zepto.cg7;
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
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\ba\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\"\u0010C\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R*\u0010L\u001a\n E*\u0004\u0018\u00010D0D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010*\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanDuplicateRcActivity;", "Lcom/zepto/pq;", "", "F1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/c47;", "C", "Lcom/zepto/c47;", "q1", "()Lcom/zepto/c47;", "I1", "(Lcom/zepto/c47;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "x1", "()Lcom/zepto/ld7;", "Q1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "G", "Ljava/lang/String;", "u1", "()Ljava/lang/String;", "N1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "I", "s1", "L1", "off_code", "J", "p1", "H1", "aadhar_name", "K", "o1", "G1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "L", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "M", "getFormated_date", "J1", "formated_date", "", "N", "Z", "y1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "K1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanDuplicateRcActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c47 binding;

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
    public String off_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DReasonResponse dReasonResponse) {
            VahanDuplicateRcActivity.this.t1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", null));
                    VahanDuplicateRcActivity vahanDuplicateRcActivity = VahanDuplicateRcActivity.this;
                    Intrinsics.checkNotNull(dReasonResponse);
                    VahanDuplicateRcActivity.this.q1().h.setAdapter((SpinnerAdapter) new cg7(vahanDuplicateRcActivity, dReasonResponse));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DReasonResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanDuplicateRcActivity.this.t1().dismiss();
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = VahanDuplicateRcActivity.this.q1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "OTHER", true) || StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                VahanDuplicateRcActivity.this.q1().e.setVisibility(8);
            } else {
                VahanDuplicateRcActivity.this.q1().e.setVisibility(0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(dulicateRcResponseModle dulicatercresponsemodle) {
            VahanDuplicateRcActivity.this.t1().dismiss();
            String appl_no = dulicatercresponsemodle.getAppl_no();
            if (appl_no == null || appl_no.length() == 0) {
                return;
            }
            vh7 vh7Var = new vh7(VahanDuplicateRcActivity.this);
            Intrinsics.checkNotNull(dulicatercresponsemodle);
            dulicateRcResponseModle dulicatercresponsemodleCopy = VahanDuplicateRcActivity.this.getIsFaceless() ? dulicatercresponsemodle.copy((536870911 & 1) != 0 ? dulicatercresponsemodle.appl_no : null, (536870911 & 2) != 0 ? dulicatercresponsemodle.channgeOfAdressDto : null, (536870911 & 4) != 0 ? dulicatercresponsemodle.comp_cd : 0, (536870911 & 8) != 0 ? dulicatercresponsemodle.duprcDto : null, (536870911 & 16) != 0 ? dulicatercresponsemodle.fir_dt : null, (536870911 & 32) != 0 ? dulicatercresponsemodle.fir_no : null, (536870911 & 64) != 0 ? dulicatercresponsemodle.hpaDto : null, (536870911 & 128) != 0 ? dulicatercresponsemodle.hptDto : null, (536870911 & 256) != 0 ? dulicatercresponsemodle.idv : 0, (536870911 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dulicatercresponsemodle.ins_from : null, (536870911 & 1024) != 0 ? dulicatercresponsemodle.ins_type : 0, (536870911 & 2048) != 0 ? dulicatercresponsemodle.ins_upto : null, (536870911 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dulicatercresponsemodle.msg : null, (536870911 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dulicatercresponsemodle.nocDto : null, (536870911 & 16384) != 0 ? dulicatercresponsemodle.off_cd : null, (536870911 & 32768) != 0 ? dulicatercresponsemodle.op_dt : null, (536870911 & 65536) != 0 ? dulicatercresponsemodle.police_station : null, (536870911 & 131072) != 0 ? dulicatercresponsemodle.policy_no : null, (536870911 & 262144) != 0 ? dulicatercresponsemodle.pur_cd : 0, (536870911 & 524288) != 0 ? dulicatercresponsemodle.rcp_dt : null, (536870911 & 1048576) != 0 ? dulicatercresponsemodle.rcpt_NO : null, (536870911 & 2097152) != 0 ? dulicatercresponsemodle.rcpt_amt : 0, (536870911 & 4194304) != 0 ? dulicatercresponsemodle.reason : null, (536870911 & 8388608) != 0 ? dulicatercresponsemodle.regn_no : null, (536870911 & 16777216) != 0 ? dulicatercresponsemodle.state_cd : null, (536870911 & 33554432) != 0 ? dulicatercresponsemodle.state_header : null, (536870911 & 67108864) != 0 ? dulicatercresponsemodle.status : null, (536870911 & 134217728) != 0 ? dulicatercresponsemodle.tax_mode : null, (536870911 & 268435456) != 0 ? dulicatercresponsemodle.vh_class : 0, (536870911 & 536870912) != 0 ? dulicatercresponsemodle.aadhaartxno : vh7Var.a()) : dulicatercresponsemodle.copy((536870911 & 1) != 0 ? dulicatercresponsemodle.appl_no : null, (536870911 & 2) != 0 ? dulicatercresponsemodle.channgeOfAdressDto : null, (536870911 & 4) != 0 ? dulicatercresponsemodle.comp_cd : 0, (536870911 & 8) != 0 ? dulicatercresponsemodle.duprcDto : null, (536870911 & 16) != 0 ? dulicatercresponsemodle.fir_dt : null, (536870911 & 32) != 0 ? dulicatercresponsemodle.fir_no : null, (536870911 & 64) != 0 ? dulicatercresponsemodle.hpaDto : null, (536870911 & 128) != 0 ? dulicatercresponsemodle.hptDto : null, (536870911 & 256) != 0 ? dulicatercresponsemodle.idv : 0, (536870911 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dulicatercresponsemodle.ins_from : null, (536870911 & 1024) != 0 ? dulicatercresponsemodle.ins_type : 0, (536870911 & 2048) != 0 ? dulicatercresponsemodle.ins_upto : null, (536870911 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dulicatercresponsemodle.msg : null, (536870911 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dulicatercresponsemodle.nocDto : null, (536870911 & 16384) != 0 ? dulicatercresponsemodle.off_cd : null, (536870911 & 32768) != 0 ? dulicatercresponsemodle.op_dt : null, (536870911 & 65536) != 0 ? dulicatercresponsemodle.police_station : null, (536870911 & 131072) != 0 ? dulicatercresponsemodle.policy_no : null, (536870911 & 262144) != 0 ? dulicatercresponsemodle.pur_cd : 0, (536870911 & 524288) != 0 ? dulicatercresponsemodle.rcp_dt : null, (536870911 & 1048576) != 0 ? dulicatercresponsemodle.rcpt_NO : null, (536870911 & 2097152) != 0 ? dulicatercresponsemodle.rcpt_amt : 0, (536870911 & 4194304) != 0 ? dulicatercresponsemodle.reason : null, (536870911 & 8388608) != 0 ? dulicatercresponsemodle.regn_no : null, (536870911 & 16777216) != 0 ? dulicatercresponsemodle.state_cd : null, (536870911 & 33554432) != 0 ? dulicatercresponsemodle.state_header : null, (536870911 & 67108864) != 0 ? dulicatercresponsemodle.status : null, (536870911 & 134217728) != 0 ? dulicatercresponsemodle.tax_mode : null, (536870911 & 268435456) != 0 ? dulicatercresponsemodle.vh_class : 0, (536870911 & 536870912) != 0 ? dulicatercresponsemodle.aadhaartxno : "");
            Intent intent = new Intent(VahanDuplicateRcActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
            intent.putExtra(VContant.DUPLICATE_RC_CODE, dulicatercresponsemodleCopy);
            intent.putExtra(VContant.APP_NO, dulicatercresponsemodle.getAppl_no());
            intent.putExtra("state_code", VahanDuplicateRcActivity.this.v1().getState_cd());
            intent.putExtra("rc_number", VahanDuplicateRcActivity.this.u1());
            intent.putExtra(VContant.PURPOSE_CODE, "3");
            intent.putExtra("off_code", VahanDuplicateRcActivity.this.s1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanDuplicateRcActivity.this.getIsFaceless());
            intent.putExtra("RC", VahanDuplicateRcActivity.this.u1());
            intent.putExtra("RcDetails", VahanDuplicateRcActivity.this.v1());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanDuplicateRcActivity.this.p1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanDuplicateRcActivity.this.o1());
            VahanDuplicateRcActivity.this.startActivity(intent);
            VahanDuplicateRcActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((dulicateRcResponseModle) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanDuplicateRcActivity.this.t1().dismiss();
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void A1(VahanDuplicateRcActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.J1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().c.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void B1(VahanDuplicateRcActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void C1(VahanDuplicateRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.q1().i.getText().toString();
            String string2 = this$0.q1().d.getText().toString();
            String string3 = this$0.q1().c.getText().toString();
            String string4 = this$0.q1().f.getText().toString();
            Object selectedItem = this$0.q1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (this$0.q1().h.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, wa3Var.b("please_Select_the_reason", this$0.getString(R.string.please_Select_the_reason)), 0).show();
                return;
            }
            if (string.length() < 3) {
                Toast.makeText(this$0, wa3Var.b("please_enter_the_remark", this$0.getString(R.string.please_enter_the_remark)), 0).show();
                return;
            }
            if (string2.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_the_valid_fir_no", this$0.getString(R.string.please_enter_the_valid_fir_no)), 0).show();
                return;
            }
            if (string3.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_fir_date", this$0.getString(R.string.please_enter_fir_date)), 0).show();
                return;
            }
            if (string4.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_police_station", this$0.getString(R.string.please_enter_police_station)), 0).show();
                return;
            }
            this$0.t1().show();
            k18.a aVar = k18.a;
            String strH = aVar.h(string3);
            String strS1 = this$0.s1();
            hz0.a aVar2 = hz0.a;
            String strR = aVar2.r();
            int i = Integer.parseInt("3");
            String strH2 = aVar.h(string3);
            String strValueOf = String.valueOf(dReasonResponseItem.getReason_desc());
            String strU1 = this$0.u1();
            String strValueOf2 = String.valueOf(this$0.v1().getState_cd());
            String rc_vh_class_cd = this$0.v1().getRc_vh_class_cd();
            Intrinsics.checkNotNull(rc_vh_class_cd);
            DuprcDto duprcDto = new DuprcDto("", 0, strH, string2, 0, " ", 0, " ", "", strS1, strR, string4, string2, i, strH2, " ", 0, strValueOf, strU1, strValueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
            String strH3 = aVar.h(string3);
            String strS12 = this$0.s1();
            String strR2 = aVar2.r();
            int i2 = Integer.parseInt("3");
            String strValueOf3 = String.valueOf(dReasonResponseItem.getReason_desc());
            String strU12 = this$0.u1();
            String strValueOf4 = String.valueOf(this$0.v1().getState_cd());
            String rc_vh_class_cd2 = this$0.v1().getRc_vh_class_cd();
            Intrinsics.checkNotNull(rc_vh_class_cd2);
            this$0.x1().v1(this$0, new duprcDtoRequestModle("", 22, duprcDto, strH3, string2, 0, "", 1, "", "", strS12, strR2, string4, "", i2, "", "", 0, strValueOf3, strU12, strValueOf4, "", "", "", Integer.parseInt(rc_vh_class_cd2)));
        } catch (Exception unused) {
        }
    }

    public static final void D1(VahanDuplicateRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.r1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void E1(VahanDuplicateRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void z1(VahanDuplicateRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.u1());
        intent.putExtra("RcDetails", this$0.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void I1(c47 c47Var) {
        Intrinsics.checkNotNullParameter(c47Var, "<set-?>");
        this.binding = c47Var;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void K1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void P1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Q1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final String o1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_duplicate_rc);
        c47 c47VarC = c47.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c47VarC, "inflate(...)");
        I1(c47VarC);
        setContentView(q1().b());
        ta3.a.F2(this, q1());
        P1(VahanProService.INSTANCE.a(this));
        K1(new wa3(this));
        M1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        Q1((ld7) new z(this, new kd7(new jd7(w1()))).a(ld7.class));
        L1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra);
        if (this.isFaceless) {
            q1().g.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = q1().g.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        K1(new wa3(this));
        q1().s.setText(r1().b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        q1().t.setText(r1().b("view_vehicle_details", "View Vehicle Details"));
        q1().t.setPaintFlags(q1().t.getPaintFlags() | 8);
        q1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateRcActivity.z1(this.a, view);
            }
        });
        try {
            t1().show();
            x1().N0(this, "3");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.x37
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanDuplicateRcActivity.A1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateRcActivity.B1(this.a, onDateSetListener, view);
            }
        });
        x1().L().g(this, new f(new a()));
        x1().M().g(this, new f(new b()));
        q1().h.setOnItemSelectedListener(new c());
        q1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateRcActivity.C1(this.a, view);
            }
        });
        x1().N().g(this, new f(new d()));
        x1().O().g(this, new f(new e()));
        q1().k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateRcActivity.D1(this.a, view);
            }
        });
        q1().k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateRcActivity.E1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final c47 q1() {
        c47 c47Var = this.binding;
        if (c47Var != null) {
            return c47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 r1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String s1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 x1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }
}
