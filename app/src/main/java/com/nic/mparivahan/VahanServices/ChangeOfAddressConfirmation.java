package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ChangeOfAddressConfirmation;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.zepto.e7;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00102\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u00106\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\"\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\"\u0010=\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010\u001d\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R\"\u0010P\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010\u001d\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010!R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/nic/mparivahan/VahanServices/ChangeOfAddressConfirmation;", "Lcom/zepto/pq;", "", "E1", "onResume", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "n1", "Lcom/zepto/e7;", "C", "Lcom/zepto/e7;", "t1", "()Lcom/zepto/e7;", "I1", "(Lcom/zepto/e7;)V", "binding", "D", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "H1", "(Ljava/lang/String;)V", "application", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "E", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "u1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "J1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;)V", "confirm_details", "F", "A1", "P1", "state_code", "G", "y1", "N1", "rc_number", "H", "x1", "M1", VContant.PURPOSE_CODE, "I", "w1", "L1", "off_code", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "K1", "(Lcom/zepto/wa3;)V", "languageKeySession", "L", "r1", "G1", "aadhar_name", "M", "q1", "F1", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChangeOfAddressConfirmation extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public e7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String application;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ChaangeOfAddressStatus confirm_details;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    public static final void B1(ChangeOfAddressConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n1(this$0, this$0.v1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void C1(ChangeOfAddressConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public static final void D1(ChangeOfAddressConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) FeesDetailsScreen.class);
        intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.CHANGE_OF_ADDRESS_CODE);
        intent.putExtra(VContant.APP_NO, this$0.s1());
        intent.putExtra("state_code", this$0.A1());
        intent.putExtra("rc_number", this$0.y1());
        intent.putExtra(VContant.PURPOSE_CODE, this$0.x1());
        intent.putExtra("COV", this$0.u1());
        intent.putExtra("off_code", this$0.w1());
        intent.putExtra(VContant.SERVICE_NAME, "Change of Address in RC");
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RC", this$0.y1());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void o1(Dialog d, ChangeOfAddressConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void p1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final String A1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application = str;
    }

    public final void I1(e7 e7Var) {
        Intrinsics.checkNotNullParameter(e7Var, "<set-?>");
        this.binding = e7Var;
    }

    public final void J1(ChaangeOfAddressStatus chaangeOfAddressStatus) {
        Intrinsics.checkNotNullParameter(chaangeOfAddressStatus, "<set-?>");
        this.confirm_details = chaangeOfAddressStatus;
    }

    public final void K1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void n1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressConfirmation.o1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressConfirmation.p1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        n1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_of_address_confirmation);
        e7 e7VarC = e7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(e7VarC, "inflate(...)");
        I1(e7VarC);
        setContentView(t1().b());
        ta3.a.V(this, t1());
        H1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        Serializable serializableExtra = getIntent().getSerializableExtra("COV");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus");
        J1((ChaangeOfAddressStatus) serializableExtra);
        P1(String.valueOf(getIntent().getStringExtra("state_code")));
        N1(String.valueOf(getIntent().getStringExtra("rc_number")));
        M1(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        L1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra2);
        K1(new wa3(this));
        t1().d.i.setText(VContant.INSTANCE.L(this, x1()));
        t1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ah0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressConfirmation.B1(this.a, view);
            }
        });
        t1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressConfirmation.C1(this.a, view);
            }
        });
        t1().b.setText(v1().b("change_of_Address_Confirm", "Application for Change of Address In RC saved successfully in draft with application no.") + ' ' + s1());
        t1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ch0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressConfirmation.D1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        n1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            SaveVahanlog.Companion companion = SaveVahanlog.INSTANCE;
            NrvDetails nrvDetailsZ1 = z1();
            boolean z = this.isFaceless;
            String strS1 = s1();
            String strX1 = x1();
            String strSubstring = y1().substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            companion.a(this, nrvDetailsZ1, z, strS1, strX1, strSubstring);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public final String s1() {
        String str = this.application;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    public final e7 t1() {
        e7 e7Var = this.binding;
        if (e7Var != null) {
            return e7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ChaangeOfAddressStatus u1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.confirm_details;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirm_details");
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

    public final String x1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
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
