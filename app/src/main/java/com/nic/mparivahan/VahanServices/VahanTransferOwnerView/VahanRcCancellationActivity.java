package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.CancellationModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCCancellationResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.c55;
import com.zepto.j37;
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
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010G\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010K\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R*\u0010T\u001a\n M*\u0004\u0018\u00010L0L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u00102\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010l\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u00102\u001a\u0004\bj\u00104\"\u0004\bk\u00106¨\u0006o"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanRcCancellationActivity;", "Lcom/zepto/pq;", "", "G1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/c55;", "C", "Lcom/zepto/c55;", "q1", "()Lcom/zepto/c55;", "J1", "(Lcom/zepto/c55;)V", "binding", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "getRetrofitService", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/o47;", "E", "Lcom/zepto/o47;", "r1", "()Lcom/zepto/o47;", "K1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "F", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "s1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "L1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "H", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "Q1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "J", "v1", "O1", "off_code", "K", "p1", "I1", "aadhar_name", "L", "o1", "H1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "M", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "N", "t1", "M1", "formated_date", "", "O", "Z", "z1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Q", "getFir_date", "setFir_date", "fir_date", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanRcCancellationActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c55 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String fir_date;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(RCCancellationResponse rCCancellationResponse) {
            VahanRcCancellationActivity.this.w1().dismiss();
            if (rCCancellationResponse.getApiMessage().getStatusCode() == 200) {
                Data data = rCCancellationResponse.getData();
                Data dataCopy = data.copy((895 & 1) != 0 ? data.applNo : null, (895 & 2) != 0 ? data.approvedBy : null, (895 & 4) != 0 ? data.cancelDt : null, (895 & 8) != 0 ? data.fileRefNo : null, (895 & 16) != 0 ? data.offCd : 0, (895 & 32) != 0 ? data.opdt : null, (895 & 64) != 0 ? data.purCd : 0, (895 & 128) != 0 ? data.reason : VahanRcCancellationActivity.this.q1().f.getText().toString(), (895 & 256) != 0 ? data.regnNo : null, (895 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? data.stateCd : null);
                Intent intent = new Intent(VahanRcCancellationActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_CANCELLATION_CODE);
                intent.putExtra(VContant.RC_CANCELLATION_CODE, dataCopy);
                intent.putExtra(VContant.APP_NO, rCCancellationResponse.getData().getApplNo());
                intent.putExtra("state_code", VahanRcCancellationActivity.this.y1().getState_cd());
                intent.putExtra("rc_number", VahanRcCancellationActivity.this.x1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_CACELLATION_PURPOSE_CODE);
                intent.putExtra("off_code", VahanRcCancellationActivity.this.v1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, VahanRcCancellationActivity.this.getIsFaceless());
                intent.putExtra("RC", VahanRcCancellationActivity.this.x1());
                intent.putExtra("RcDetails", VahanRcCancellationActivity.this.y1());
                intent.putExtra(VContant.NEXGEN_addahar_name, VahanRcCancellationActivity.this.p1());
                intent.putExtra(VContant.NEXGEN_addahar_address, VahanRcCancellationActivity.this.o1());
                VahanRcCancellationActivity.this.startActivity(intent);
                VahanRcCancellationActivity.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RCCancellationResponse) obj);
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
            VahanRcCancellationActivity.this.w1().dismiss();
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    public static final void A1(VahanRcCancellationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public static final void B1(VahanRcCancellationActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.M1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().d.setText(simpleDateFormat.format(this$0.cal.getTime()));
        this$0.fir_date = this$0.t1();
    }

    public static final void C1(VahanRcCancellationActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void D1(VahanRcCancellationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new wa3(this$0);
        try {
            String string = this$0.q1().f.getText().toString();
            String str = this$0.fir_date;
            if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
                Toast.makeText(this$0, this$0.u1().b("pls_enter_RcCancallationDate", this$0.getString(R.string.pls_enter_rc_cancallation_date)), 0).show();
            } else if (string.length() < 3) {
                Toast.makeText(this$0, this$0.u1().b("please_enter_reason", this$0.getString(R.string.please_enter_reason)), 0).show();
            } else {
                this$0.w1().show();
                this$0.r1().R(this$0, new CancellationModle("", Integer.parseInt(this$0.v1()), Integer.parseInt(VContant.RC_CACELLATION_PURPOSE_CODE), this$0.x1(), String.valueOf(this$0.y1().getState_cd()), "", "", "", string, "", "", "", "", "", "", "", "", "", "", this$0.fir_date));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void E1(VahanRcCancellationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.u1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void F1(VahanRcCancellationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1();
    }

    private final void G1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void J1(c55 c55Var) {
        Intrinsics.checkNotNullParameter(c55Var, "<set-?>");
        this.binding = c55Var;
    }

    public final void K1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void L1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void R1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void S1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
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
        VUtility.INSTANCE.y(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rccanceltion);
        c55 c55VarC = c55.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c55VarC, "inflate(...)");
        J1(c55VarC);
        setContentView(q1().b());
        ta3.a.O2(this, q1());
        S1(VahanProService.INSTANCE.a(this));
        L1(DuplicateFitnessService.INSTANCE.a(this));
        N1(new wa3(this));
        P1(new ProgressDialog(this));
        w1().setMessage(u1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        K1((o47) new z(this, new n47(new j37(s1()))).a(o47.class));
        O1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Q1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        R1((NrvDetails) serializableExtra);
        N1(new wa3(this));
        q1().j.setText(u1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        q1().k.setText(u1().b("view_vehicle_details", "View Vehicle Details"));
        q1().k.setPaintFlags(q1().k.getPaintFlags() | 8);
        q1().k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.af7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcCancellationActivity.A1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.bf7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanRcCancellationActivity.B1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcCancellationActivity.C1(this.a, onDateSetListener, view);
            }
        });
        q1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.df7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcCancellationActivity.D1(this.a, view);
            }
        });
        r1().y().g(this, new c(new a()));
        r1().z().g(this, new c(new b()));
        q1().g.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ef7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcCancellationActivity.E1(this.a, view);
            }
        });
        q1().g.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ff7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcCancellationActivity.F1(this.a, view);
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

    public final c55 q1() {
        c55 c55Var = this.binding;
        if (c55Var != null) {
            return c55Var;
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

    public final String t1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String v1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final String x1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }
}
