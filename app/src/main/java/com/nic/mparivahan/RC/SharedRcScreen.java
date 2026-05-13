package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.SharedDocModle;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.SharedRcScreen;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.gd1;
import com.zepto.hg;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010IJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R>\u0010?\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r07j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`88\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/nic/mparivahan/RC/SharedRcScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "s1", "Landroid/content/Context;", "context", "", "message", "v1", "S1", "", "position", "x1", "Lcom/zepto/hg;", "C", "Lcom/zepto/hg;", "binding", "Lcom/zepto/a55;", "D", "Lcom/zepto/a55;", "D1", "()Lcom/zepto/a55;", "R1", "(Lcom/zepto/a55;)V", "viewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "E", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "A1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "O1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "duration", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "C1", "()Lcom/zepto/ws6;", "Q1", "(Lcom/zepto/ws6;)V", "sessionManager", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "I", "Ljava/util/HashMap;", "y1", "()Ljava/util/HashMap;", "M1", "(Ljava/util/HashMap;)V", "hashMap", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "B1", "()Lcom/zepto/wa3;", "P1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SharedRcScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public a55 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RcService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String duration;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public HashMap hashMap;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 session;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (i > 0) {
                SharedRcScreen sharedRcScreen = SharedRcScreen.this;
                sharedRcScreen.duration = String.valueOf(sharedRcScreen.x1(i));
            } else if (i == 0) {
                SharedRcScreen.this.duration = null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void E1(SharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(SharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hg hgVar = this$0.binding;
        if (hgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar = null;
        }
        hgVar.c.performClick();
    }

    public static final void G1(SharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hg hgVar = this$0.binding;
        hg hgVar2 = null;
        if (hgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar = null;
        }
        String string = hgVar.f.getText().toString();
        if (string == null || string.length() == 0 || string.length() < 10) {
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 1).show();
            return;
        }
        if (!mt6.a.t(string)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 1).show();
            return;
        }
        if (StringsKt__StringsJVMKt.equals(this$0.C1().l().toString(), string, true)) {
            this$0.S1(this$0, "RC cannot be shared as You are allready Logged-In using this mobile number");
            return;
        }
        hg hgVar3 = this$0.binding;
        if (hgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            hgVar2 = hgVar3;
        }
        if (hgVar2.c.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.r0(), "Please Select the duration"), 1).show();
        } else {
            this$0.z1().show();
            this$0.D1().r(string, this$0);
        }
    }

    public static final void H1(SharedRcScreen this$0, String str, GetCitizenDetails getCitizenDetails) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                if (gd1.a.m(getCitizenDetails.getStatusDesc())) {
                    return;
                }
                this$0.z1().dismiss();
                Toast.makeText(this$0.getApplicationContext(), getCitizenDetails.getStatusDesc().toString(), 1).show();
                return;
            }
            a55 a55VarD1 = this$0.D1();
            String string = this$0.C1().k().toString();
            String strValueOf = String.valueOf(str);
            hg hgVar = this$0.binding;
            hg hgVar2 = null;
            if (hgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hgVar = null;
            }
            String string2 = hgVar.f.getText().toString();
            HashMap mapY1 = this$0.y1();
            hg hgVar3 = this$0.binding;
            if (hgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                hgVar2 = hgVar3;
            }
            a55VarD1.Z(string, strValueOf, string2, String.valueOf(mapY1.get(Integer.valueOf(hgVar2.c.getSelectedItemPosition()))), this$0);
        } catch (Exception e) {
            this$0.z1().dismiss();
            e.printStackTrace();
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    public static final void I1(SharedRcScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
    }

    public static final void J1(SharedRcScreen this$0, SharedDocModle sharedDocModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.z1().dismiss();
            if (StringsKt__StringsJVMKt.equals(sharedDocModle.getStatusCode(), "VTLD001", true)) {
                this$0.v1(this$0, "RC Shared Successfully");
            } else {
                this$0.v1(this$0, sharedDocModle.getStatusDesc().toString());
            }
        } catch (Exception e) {
            this$0.z1().dismiss();
            e.printStackTrace();
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    public static final void K1(SharedRcScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
    }

    public static final void L1(SharedRcScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void w1(Dialog d, SharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public final RcService A1() {
        RcService rcService = this.retrofitService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wa3 B1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 C1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final a55 D1() {
        a55 a55Var = this.viewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void M1(HashMap map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.hashMap = map;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.retrofitService = rcService;
    }

    public final void P1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void Q1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void R1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.viewModel = a55Var;
    }

    public final void S1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
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
        textView.setText(B1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById3).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedRcScreen.T1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hg hgVarC = hg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hgVarC, "inflate(...)");
        this.binding = hgVarC;
        hg hgVar = null;
        if (hgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVarC = null;
        }
        setContentView(hgVarC.b());
        ta3.a aVar = ta3.a;
        hg hgVar2 = this.binding;
        if (hgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar2 = null;
        }
        aVar.Q1(this, hgVar2);
        P1(new wa3(this));
        O1(RcService.INSTANCE.a(this));
        s1();
        N1(new ProgressDialog(this));
        z1().setMessage(B1().b("label_challan_please_wait", "Please wait..."));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        Q1(new ws6(this));
        R1((a55) new z(this, new b55(new s45(A1()))).a(a55.class));
        hg hgVar3 = this.binding;
        if (hgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar3 = null;
        }
        hgVar3.l.setText(B1().b("share_rc", "Share RC"));
        hg hgVar4 = this.binding;
        if (hgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar4 = null;
        }
        hgVar4.j.setText(B1().b("share_rc", "Share RC"));
        final String stringExtra = getIntent().getStringExtra("RcNumber");
        if (stringExtra != null && !StringsKt__StringsJVMKt.isBlank(stringExtra)) {
            hg hgVar5 = this.binding;
            if (hgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hgVar5 = null;
            }
            hgVar5.i.setText(stringExtra);
            ArrayAdapter<CharSequence> arrayAdapterCreateFromResource = ArrayAdapter.createFromResource(this, R.array.spinnerItems1, android.R.layout.simple_spinner_item);
            Intrinsics.checkNotNullExpressionValue(arrayAdapterCreateFromResource, "createFromResource(...)");
            arrayAdapterCreateFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            hg hgVar6 = this.binding;
            if (hgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hgVar6 = null;
            }
            hgVar6.c.setAdapter((SpinnerAdapter) arrayAdapterCreateFromResource);
            hg hgVar7 = this.binding;
            if (hgVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hgVar7 = null;
            }
            hgVar7.c.setOnItemSelectedListener(new a());
        }
        hg hgVar8 = this.binding;
        if (hgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar8 = null;
        }
        hgVar8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedRcScreen.E1(this.a, view);
            }
        });
        hg hgVar9 = this.binding;
        if (hgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar9 = null;
        }
        hgVar9.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedRcScreen.F1(this.a, view);
            }
        });
        hg hgVar10 = this.binding;
        if (hgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar10 = null;
        }
        hgVar10.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedRcScreen.G1(this.a, view);
            }
        });
        D1().u().g(this, new mf4() { // from class: com.zepto.y06
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SharedRcScreen.H1(this.a, stringExtra, (GetCitizenDetails) obj);
            }
        });
        D1().t().g(this, new mf4() { // from class: com.zepto.z06
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SharedRcScreen.I1(this.a, (String) obj);
            }
        });
        D1().H().g(this, new mf4() { // from class: com.zepto.a16
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SharedRcScreen.J1(this.a, (SharedDocModle) obj);
            }
        });
        D1().I().g(this, new mf4() { // from class: com.zepto.b16
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SharedRcScreen.K1(this.a, (String) obj);
            }
        });
        D1().t().g(this, new mf4() { // from class: com.zepto.c16
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SharedRcScreen.L1(this.a, (String) obj);
            }
        });
        hg hgVar11 = this.binding;
        if (hgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar11 = null;
        }
        hgVar11.l.setText(B1().b("share_rc", "Share RC"));
        hg hgVar12 = this.binding;
        if (hgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hgVar12 = null;
        }
        hgVar12.j.setText(B1().b("share_rc", "Share RC"));
        hg hgVar13 = this.binding;
        if (hgVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            hgVar = hgVar13;
        }
        hgVar.f.setHint(B1().b("label_mb", "Enter Mobile No."));
    }

    public final void s1() {
        M1(new HashMap());
        y1().put(0, 0);
        y1().put(1, 1);
        y1().put(2, 7);
        y1().put(3, 15);
        y1().put(4, 30);
        y1().put(5, 60);
        y1().put(6, 90);
        y1().put(7, 120);
        y1().put(8, 150);
        y1().put(9, 180);
        y1().put(10, 365);
    }

    public final void v1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.shared_rc_diloge);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(B1().b("btn_dl_serv_close", "Close"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedRcScreen.w1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final int x1(int position) {
        if (position == 1) {
            return 1;
        }
        if (position == 2) {
            return 7;
        }
        if (position != 3) {
            return position != 4 ? 0 : 30;
        }
        return 15;
    }

    public final HashMap y1() {
        HashMap map = this.hashMap;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hashMap");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
