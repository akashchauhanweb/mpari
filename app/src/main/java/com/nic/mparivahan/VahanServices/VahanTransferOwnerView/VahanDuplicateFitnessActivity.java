package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.cg7;
import com.zepto.hz0;
import com.zepto.j37;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.lb;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bq\u0010rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010:\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\"\u0010O\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\"\u0010S\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010>R*\u0010\\\u001a\n U*\u0004\u0018\u00010T0T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanDuplicateFitnessActivity;", "Lcom/zepto/pq;", "", "H1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/lb;", "C", "Lcom/zepto/lb;", "q1", "()Lcom/zepto/lb;", "K1", "(Lcom/zepto/lb;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "z1", "()Lcom/zepto/ld7;", "U1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "T1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/o47;", "F", "Lcom/zepto/o47;", "r1", "()Lcom/zepto/o47;", "L1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "G", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "s1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "M1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "I", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "K", "u1", "P1", "off_code", "L", "p1", "J1", "aadhar_name", "M", "o1", "I1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "N", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "O", "getFormated_date", "N1", "formated_date", "", "P", "Z", "A1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanDuplicateFitnessActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public lb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DReasonResponse dReasonResponse) {
            VahanDuplicateFitnessActivity.this.v1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", null));
                    VahanDuplicateFitnessActivity vahanDuplicateFitnessActivity = VahanDuplicateFitnessActivity.this;
                    Intrinsics.checkNotNull(dReasonResponse);
                    VahanDuplicateFitnessActivity.this.q1().g.setAdapter((SpinnerAdapter) new cg7(vahanDuplicateFitnessActivity, dReasonResponse));
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
            VahanDuplicateFitnessActivity.this.v1().dismiss();
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = VahanDuplicateFitnessActivity.this.q1().g.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "OTHER", true) || StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                VahanDuplicateFitnessActivity.this.q1().e.setVisibility(8);
            } else {
                VahanDuplicateFitnessActivity.this.q1().e.setVisibility(0);
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

        public final void a(DuplicateFitessDraft duplicateFitessDraft) {
            VahanDuplicateFitnessActivity.this.v1().dismiss();
            String appl_no = duplicateFitessDraft.getAppl_no();
            if (appl_no == null || appl_no.length() == 0) {
                return;
            }
            Intent intent = new Intent(VahanDuplicateFitnessActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_FITNESS_CODE);
            intent.putExtra(VContant.DUPLICATE_FITNESS_CODE, duplicateFitessDraft);
            intent.putExtra(VContant.APP_NO, duplicateFitessDraft.getAppl_no());
            intent.putExtra("state_code", VahanDuplicateFitnessActivity.this.x1().getState_cd());
            intent.putExtra("rc_number", VahanDuplicateFitnessActivity.this.w1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
            intent.putExtra("off_code", VahanDuplicateFitnessActivity.this.u1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanDuplicateFitnessActivity.this.getIsFaceless());
            intent.putExtra("RC", VahanDuplicateFitnessActivity.this.w1());
            intent.putExtra("RcDetails", VahanDuplicateFitnessActivity.this.x1());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanDuplicateFitnessActivity.this.p1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanDuplicateFitnessActivity.this.o1());
            VahanDuplicateFitnessActivity.this.startActivity(intent);
            VahanDuplicateFitnessActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DuplicateFitessDraft) obj);
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
            VahanDuplicateFitnessActivity.this.v1().dismiss();
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

    public static final void B1(VahanDuplicateFitnessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.w1());
        intent.putExtra("RcDetails", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public static final void C1(VahanDuplicateFitnessActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.N1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().c.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void D1(VahanDuplicateFitnessActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void E1(VahanDuplicateFitnessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.q1().h.getText().toString();
            String string2 = this$0.q1().d.getText().toString();
            String string3 = this$0.q1().c.getText().toString();
            String string4 = this$0.q1().f.getText().toString();
            Object selectedItem = this$0.q1().g.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (this$0.q1().g.getSelectedItemPosition() == 0) {
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
            this$0.v1().show();
            this$0.r1().P(this$0, new DuplicateFitessDraft("", k18.a.h(string3), string2, Integer.parseInt(this$0.u1()), hz0.a.r(), string4, Integer.parseInt(VContant.DUPLICATE_FITNESS_PURPOSE_CODE), String.valueOf(dReasonResponseItem.getReason_desc()), this$0.w1(), String.valueOf(this$0.x1().getState_cd())));
        } catch (Exception unused) {
        }
    }

    public static final void F1(VahanDuplicateFitnessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.t1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void G1(VahanDuplicateFitnessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(lb lbVar) {
        Intrinsics.checkNotNullParameter(lbVar, "<set-?>");
        this.binding = lbVar;
    }

    public final void L1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void M1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void S1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void T1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void U1(ld7 ld7Var) {
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
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duplicate_fitness_certificate);
        lb lbVarC = lb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lbVarC, "inflate(...)");
        K1(lbVarC);
        setContentView(q1().b());
        ta3.a.D2(this, q1());
        T1(VahanProService.INSTANCE.a(this));
        M1(DuplicateFitnessService.INSTANCE.a(this));
        O1(new wa3(this));
        Q1(new ProgressDialog(this));
        v1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        U1((ld7) new z(this, new kd7(new jd7(y1()))).a(ld7.class));
        L1((o47) new z(this, new n47(new j37(s1()))).a(o47.class));
        P1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        R1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        S1((NrvDetails) serializableExtra);
        O1(new wa3(this));
        q1().q.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
        q1().r.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        q1().r.setPaintFlags(q1().r.getPaintFlags() | 8);
        q1().r.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateFitnessActivity.B1(this.a, view);
            }
        });
        try {
            v1().show();
            z1().N0(this, "3");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.l37
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanDuplicateFitnessActivity.C1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateFitnessActivity.D1(this.a, onDateSetListener, view);
            }
        });
        z1().L().g(this, new f(new a()));
        z1().M().g(this, new f(new b()));
        q1().g.setOnItemSelectedListener(new c());
        q1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateFitnessActivity.E1(this.a, view);
            }
        });
        r1().m().g(this, new f(new d()));
        z1().O().g(this, new f(new e()));
        q1().j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateFitnessActivity.F1(this.a, view);
            }
        });
        q1().j.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicateFitnessActivity.G1(this.a, view);
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

    public final lb q1() {
        lb lbVar = this.binding;
        if (lbVar != null) {
            return lbVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final o47 r1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService s1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String u1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String w1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
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

    public final VahanProService y1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 z1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
