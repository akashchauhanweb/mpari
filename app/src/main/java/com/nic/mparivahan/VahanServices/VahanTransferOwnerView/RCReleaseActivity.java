package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.j37;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.we;
import java.io.Serializable;
import java.text.ParseException;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010G\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010K\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R*\u0010T\u001a\n M*\u0004\u0018\u00010L0L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u00102\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/RCReleaseActivity;", "Lcom/zepto/pq;", "", "F1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/we;", "C", "Lcom/zepto/we;", "q1", "()Lcom/zepto/we;", "I1", "(Lcom/zepto/we;)V", "binding", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "getRetrofitService", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/o47;", "E", "Lcom/zepto/o47;", "r1", "()Lcom/zepto/o47;", "J1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "F", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "s1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "K1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "O1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "H", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "P1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "J", "u1", "N1", "off_code", "K", "p1", "H1", "aadhar_name", "L", "o1", "G1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "M", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "N", "getFormated_date", "L1", "formated_date", "", "O", "Z", "y1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RCReleaseActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public we binding;

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

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(RCReleaseResponse rCReleaseResponse) {
            Integer statusCode;
            RCReleaseActivity.this.v1().dismiss();
            ApiMessage apiMessage = rCReleaseResponse.getApiMessage();
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                VContant.Companion companion = VContant.INSTANCE;
                RCReleaseActivity rCReleaseActivity = RCReleaseActivity.this;
                ApiMessage apiMessage2 = rCReleaseResponse.getApiMessage();
                companion.N(rCReleaseActivity, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = rCReleaseResponse.getData();
            Data dataCopy = data != null ? data.copy((319 & 1) != 0 ? data.stateCd : null, (319 & 2) != 0 ? data.offCd : null, (319 & 4) != 0 ? data.applNo : null, (319 & 8) != 0 ? data.purCd : null, (319 & 16) != 0 ? data.regNo : null, (319 & 32) != 0 ? data.releaseDt : null, (319 & 64) != 0 ? data.relFileRefNo : RCReleaseActivity.this.q1().e.getText().toString(), (319 & 128) != 0 ? data.relApprovedBy : RCReleaseActivity.this.q1().d.getText().toString(), (319 & 256) != 0 ? data.relOpDt : null) : null;
            Intent intent = new Intent(RCReleaseActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_RELEASE_CODE);
            intent.putExtra(VContant.RC_RELEASE_CODE, dataCopy);
            Data data2 = rCReleaseResponse.getData();
            intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
            NrvDetails nrvDetailsX1 = RCReleaseActivity.this.x1();
            intent.putExtra("state_code", nrvDetailsX1 != null ? nrvDetailsX1.getState_cd() : null);
            intent.putExtra("rc_number", RCReleaseActivity.this.w1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_RELEASE_PURPOSE_CODE);
            intent.putExtra("off_code", RCReleaseActivity.this.u1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, RCReleaseActivity.this.getIsFaceless());
            intent.putExtra("RC", RCReleaseActivity.this.w1());
            intent.putExtra("RcDetails", RCReleaseActivity.this.x1());
            intent.putExtra(VContant.NEXGEN_addahar_name, RCReleaseActivity.this.p1());
            intent.putExtra(VContant.NEXGEN_addahar_address, RCReleaseActivity.this.o1());
            RCReleaseActivity.this.startActivity(intent);
            RCReleaseActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RCReleaseResponse) obj);
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
            RCReleaseActivity.this.v1().dismiss();
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

    public static final void A1(RCReleaseActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.L1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().f.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void B1(RCReleaseActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void C1(RCReleaseActivity this$0, View view) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.q1().f.getText().toString();
            String string2 = this$0.q1().e.getText().toString();
            String string3 = this$0.q1().d.getText().toString();
            try {
                str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(string));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } catch (ParseException e) {
                e.printStackTrace();
                str = "";
            }
            if (string.length() < 3) {
                Toast.makeText(this$0, wa3Var.b("enter_release_date", this$0.getString(R.string.enter_release_date)), 0).show();
                return;
            }
            if (string2.length() < 3) {
                Toast.makeText(this$0, wa3Var.b("enter_file_reference_number", this$0.getString(R.string.enter_file_reference_number)), 0).show();
                return;
            }
            if (string3.length() < 3) {
                Toast.makeText(this$0, wa3Var.b("enter_approved_by", this$0.getString(R.string.enter_approved_by)), 0).show();
                return;
            }
            this$0.v1().show();
            Integer numValueOf = Integer.valueOf(Integer.parseInt(this$0.u1()));
            String strW1 = this$0.w1();
            String string4 = str.toString();
            NrvDetails nrvDetailsX1 = this$0.x1();
            this$0.r1().S(this$0, new RCReleaseModle("", string3, "", "", "", string2, numValueOf, "", "", VContant.RC_RELEASE_PURPOSE_CODE, "", "", "", strW1, "", "", string4, String.valueOf(nrvDetailsX1 != null ? nrvDetailsX1.getState_cd() : null), "", ""));
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("myrequ", Unit.INSTANCE.toString());
        }
    }

    public static final void D1(RCReleaseActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.t1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void E1(RCReleaseActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void z1(RCReleaseActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.w1());
        intent.putExtra("RcDetails", this$0.x1());
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

    public final void I1(we weVar) {
        Intrinsics.checkNotNullParameter(weVar, "<set-?>");
        this.binding = weVar;
    }

    public final void J1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void K1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void O1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void Q1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void R1(VahanProService vahanProService) {
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
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        we weVarC = we.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(weVarC, "inflate(...)");
        I1(weVarC);
        setContentView(q1().b());
        ta3.a.P2(this, q1());
        R1(VahanProService.INSTANCE.a(this));
        K1(DuplicateFitnessService.INSTANCE.a(this));
        M1(new wa3(this));
        O1(new ProgressDialog(this));
        v1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        J1((o47) new z(this, new n47(new j37(s1()))).a(o47.class));
        N1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        P1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Q1((NrvDetails) serializableExtra);
        M1(new wa3(this));
        q1().l.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
        q1().m.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        q1().m.setPaintFlags(q1().m.getPaintFlags() | 8);
        q1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCReleaseActivity.z1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.a35
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                RCReleaseActivity.A1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCReleaseActivity.B1(this.a, onDateSetListener, view);
            }
        });
        q1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCReleaseActivity.C1(this.a, view);
            }
        });
        r1().A().g(this, new c(new a()));
        r1().B().g(this, new c(new b()));
        q1().j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCReleaseActivity.D1(this.a, view);
            }
        });
        q1().j.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCReleaseActivity.E1(this.a, view);
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

    public final we q1() {
        we weVar = this.binding;
        if (weVar != null) {
            return weVar;
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

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }
}
