package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.f67;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010&\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\"\u0010V\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010&\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/HypothecationContinuationActivity;", "Lcom/zepto/pq;", "", "F1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "Q1", "Lcom/zepto/f67;", "C", "Lcom/zepto/f67;", "r1", "()Lcom/zepto/f67;", "I1", "(Lcom/zepto/f67;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "y1", "()Lcom/zepto/ld7;", "P1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "F", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "M1", "(Ljava/lang/String;)V", "rc_number", "G", "t1", "K1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "L1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "languageKeySession", "L", "q1", "H1", "aadhar_name", "M", "p1", "G1", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationContinuationActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public f67 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    public static final void A1(HypothecationContinuationActivity this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
        try {
            this$0.r1().o.setVisibility(0);
            this$0.r1().d.setVisibility(0);
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String strValueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            if (strValueOf.length() == 0) {
                this$0.r1().j.setText("--");
            } else {
                this$0.r1().j.setText(strValueOf);
            }
            if (strValueOf2.length() != 0) {
                this$0.r1().h.setText(strValueOf2 + strValueOf3 + strValueOf4);
            }
            if (strValueOf5.length() != 0) {
                this$0.r1().g.setText(k18.a.f(strValueOf5));
            }
            if (string != null && string.length() != 0) {
                this$0.r1().u.setText(string.toString());
            }
        } catch (Exception e) {
            this$0.r1().o.setVisibility(8);
            this$0.r1().d.setVisibility(8);
            this$0.Q1(this$0, this$0.getString(R.string.service_unavable_please_try));
            e.printStackTrace();
        }
    }

    public static final void B1(HypothecationContinuationActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().dismiss();
        this$0.r1().o.setVisibility(8);
        this$0.r1().d.setVisibility(8);
        this$0.Q1(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void C1(HypothecationContinuationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setIntent(new Intent(this$0, (Class<?>) FeesDetailsScreen.class));
        this$0.getIntent().putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_CONTINUATION_CODE);
        this$0.getIntent().putExtra(VContant.PURPOSE_CODE, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
        this$0.getIntent().putExtra("state_code", this$0.w1().getState_cd());
        Intent intent = this$0.getIntent();
        if (intent != null) {
            intent.putExtra("rc_number", this$0.v1());
        }
        Intent intent2 = this$0.getIntent();
        if (intent2 != null) {
            intent2.putExtra("RcDetails", this$0.w1());
        }
        Intent intent3 = this$0.getIntent();
        if (intent3 != null) {
            intent3.putExtra("off_code", this$0.t1());
        }
        this$0.getIntent().putExtra(VContant.SERVICE_NAME, "Hypothecation Continuation");
        this$0.getIntent().putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        this$0.getIntent().putExtra("RC", this$0.v1());
        Intent intent4 = this$0.getIntent();
        if (intent4 != null) {
            intent4.putExtra(VContant.NEXGEN_addahar_name, this$0.q1());
        }
        Intent intent5 = this$0.getIntent();
        if (intent5 != null) {
            intent5.putExtra(VContant.NEXGEN_addahar_address, this$0.p1());
        }
        this$0.startActivity(this$0.getIntent());
        this$0.finish();
    }

    public static final void D1(HypothecationContinuationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.s1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void E1(HypothecationContinuationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void R1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void z1(HypothecationContinuationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.v1());
        intent.putExtra("RcDetails", this$0.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.p1());
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

    public final void I1(f67 f67Var) {
        Intrinsics.checkNotNullParameter(f67Var, "<set-?>");
        this.binding = f67Var;
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void L1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void N1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void O1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void P1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void Q1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivity.R1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_hypothecation_continuation);
        f67 f67VarC = f67.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(f67VarC, "inflate(...)");
        I1(f67VarC);
        setContentView(r1().b());
        ta3.a.U0(this, r1());
        O1(VahanProService.INSTANCE.a(this));
        M1(String.valueOf(getIntent().getStringExtra("RC")));
        K1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        if (this.isFaceless) {
            r1().q.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = r1().q.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        J1(new wa3(this));
        r1().F.setText(s1().b("vehicle_no", "Vehicle No.:") + ' ' + v1());
        r1().G.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        r1().G.setPaintFlags(r1().G.getPaintFlags() | 8);
        r1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivity.z1(this.a, view);
            }
        });
        L1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        P1((ld7) new z(this, new kd7(new jd7(x1()))).a(ld7.class));
        try {
            u1().show();
            y1().n0(this, v1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        y1().o0().g(this, new mf4() { // from class: com.zepto.zt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivity.A1(this.a, (HptDetailsModle) obj);
            }
        });
        y1().p0().g(this, new mf4() { // from class: com.zepto.au2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivity.B1(this.a, (String) obj);
            }
        });
        r1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivity.C1(this.a, view);
            }
        });
        r1().t.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivity.D1(this.a, view);
            }
        });
        r1().t.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.du2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivity.E1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final f67 r1() {
        f67 f67Var = this.binding;
        if (f67Var != null) {
            return f67Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String t1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String v1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 y1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
