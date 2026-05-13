package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.RcSurrenderResModel;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCSurrenderModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.j37;
import com.zepto.kh;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\"\u0010>\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010)\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\"\u0010B\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-R*\u0010K\u001a\n D*\u0004\u0018\u00010C0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010)\u001a\u0004\b]\u0010+\"\u0004\b^\u0010-¨\u0006b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanRcSurrenderActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/kh;", "C", "Lcom/zepto/kh;", "s1", "()Lcom/zepto/kh;", "L1", "(Lcom/zepto/kh;)V", "binding", "Lcom/zepto/o47;", "D", "Lcom/zepto/o47;", "t1", "()Lcom/zepto/o47;", "M1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "E", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "u1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "N1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "x1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "G", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "I", "w1", "P1", "off_code", "J", "r1", "K1", "aadhar_name", "K", "q1", "J1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "L", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "M", "Z", "A1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "languageKeySession", "O", "getTaxSelectedFlag", "setTaxSelectedFlag", "taxSelectedFlag", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanRcSurrenderActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public kh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

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

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String taxSelectedFlag = "0";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanRcSurrenderActivity.this.x1().dismiss();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(RcSurrenderResModel rcSurrenderResModel) {
            VahanRcSurrenderActivity.this.x1().dismiss();
            if (rcSurrenderResModel.getApiMessage().getStatusCode() == 200) {
                Intent intent = new Intent(VahanRcSurrenderActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_SURRENDER_RC_CODE);
                intent.putExtra(VContant.RC_SURRENDER_RC_CODE, rcSurrenderResModel.getData());
                intent.putExtra(VContant.APP_NO, rcSurrenderResModel.getData().getApplNo());
                intent.putExtra("state_code", VahanRcSurrenderActivity.this.z1().getState_cd());
                intent.putExtra("rc_number", VahanRcSurrenderActivity.this.y1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_SURRENDER_PURPOSE_CODE);
                intent.putExtra("off_code", VahanRcSurrenderActivity.this.w1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, VahanRcSurrenderActivity.this.getIsFaceless());
                intent.putExtra("RC", VahanRcSurrenderActivity.this.y1());
                intent.putExtra("RcDetails", VahanRcSurrenderActivity.this.z1());
                intent.putExtra(VContant.NEXGEN_addahar_name, VahanRcSurrenderActivity.this.r1());
                intent.putExtra(VContant.NEXGEN_addahar_address, VahanRcSurrenderActivity.this.q1());
                VahanRcSurrenderActivity.this.startActivity(intent);
                VahanRcSurrenderActivity.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RcSurrenderResModel) obj);
            return Unit.INSTANCE;
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

    public static final void B1(VahanRcSurrenderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.y1());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void C1(VahanRcSurrenderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.v1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void D1(VahanRcSurrenderActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.s1().f.setVisibility(0);
        } else {
            this$0.s1().f.setVisibility(8);
        }
    }

    public static final void E1(VahanRcSurrenderActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.s1().d.setVisibility(0);
        } else {
            this$0.s1().d.setVisibility(8);
        }
    }

    public static final void F1(VahanRcSurrenderActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.s1().e.setVisibility(0);
        } else {
            this$0.s1().e.setVisibility(8);
        }
    }

    public static final void G1(VahanRcSurrenderActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.s1().n.setChecked(false);
            this$0.taxSelectedFlag = "N";
        }
    }

    public static final void H1(VahanRcSurrenderActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.s1().m.setChecked(false);
            this$0.taxSelectedFlag = "Y";
        }
    }

    public static final void I1(VahanRcSurrenderActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.s1().k.getText().toString();
        String string2 = this$0.s1().f.getText().toString();
        String string3 = this$0.s1().d.getText().toString();
        String string4 = this$0.s1().e.getText().toString();
        if (string.length() < 4) {
            Toast.makeText(this$0, this$0.v1().b("please_enter_reason", this$0.getString(R.string.please_enter_reason)), 0).show();
            return;
        }
        if (this$0.s1().l.isChecked() && string2.length() < 2) {
            Toast.makeText(this$0, this$0.v1().b("please_enter_rc_serial_no", this$0.getString(R.string.please_enter_rc_serial_no)), 0).show();
            return;
        }
        if (this$0.s1().g.isChecked() && string3.length() < 2) {
            Toast.makeText(this$0, this$0.v1().b("please_enter_fitness_certificate_no", this$0.getString(R.string.please_enter_fitness_certificate_no)), 0).show();
            return;
        }
        if (this$0.s1().i.isChecked() && string4.length() < 2) {
            Toast.makeText(this$0, this$0.v1().b("please_enter_permit_no", this$0.getString(R.string.please_enter_permit_no)), 0).show();
        } else {
            if (this$0.taxSelectedFlag.equals("0")) {
                Toast.makeText(this$0, this$0.v1().b("please_select_tax_exemption", this$0.getString(R.string.please_select_tax_exemption)), 0).show();
                return;
            }
            this$0.x1().show();
            this$0.t1().T(this$0, new RCSurrenderModle("", Integer.parseInt(this$0.w1()), Integer.parseInt(VContant.RC_SURRENDER_PURPOSE_CODE), this$0.y1(), String.valueOf(this$0.z1().getState_cd()), "", "", "", string, "", string2, "", string4, "", string3, "", "", "", "", ""));
        }
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void L1(kh khVar) {
        Intrinsics.checkNotNullParameter(khVar, "<set-?>");
        this.binding = khVar;
    }

    public final void M1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void N1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
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

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_rc_surrender);
        kh khVarC = kh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(khVarC, "inflate(...)");
        L1(khVarC);
        setContentView(s1().b());
        ta3.a.Q2(this, s1());
        O1(new wa3(this));
        Q1(new ProgressDialog(this));
        x1().setMessage(v1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        N1(DuplicateFitnessService.INSTANCE.a(this));
        M1((o47) new z(this, new n47(new j37(u1()))).a(o47.class));
        P1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        R1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        S1((NrvDetails) serializableExtra);
        O1(new wa3(this));
        s1().s.setText(v1().b("vehicle_no", "Vehicle No.:") + ' ' + y1());
        s1().t.setText(v1().b("view_vehicle_details", "View Vehicle Details"));
        s1().t.setPaintFlags(s1().t.getPaintFlags() | 8);
        s1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcSurrenderActivity.B1(this.a, view);
            }
        });
        s1().p.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcSurrenderActivity.C1(this.a, view);
            }
        });
        s1().l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.if7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanRcSurrenderActivity.D1(this.a, compoundButton, z);
            }
        });
        s1().g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.jf7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanRcSurrenderActivity.E1(this.a, compoundButton, z);
            }
        });
        s1().i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.kf7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanRcSurrenderActivity.F1(this.a, compoundButton, z);
            }
        });
        s1().m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.lf7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanRcSurrenderActivity.G1(this.a, compoundButton, z);
            }
        });
        s1().n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.mf7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanRcSurrenderActivity.H1(this.a, compoundButton, z);
            }
        });
        s1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRcSurrenderActivity.I1(this.a, view);
            }
        });
        t1().C().g(this, new c(new b()));
        t1().D().g(this, new c(new a()));
    }

    public final String q1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final kh s1() {
        kh khVar = this.binding;
        if (khVar != null) {
            return khVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final o47 t1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService u1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String w1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String y1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
