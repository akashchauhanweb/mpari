package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;
import com.nic.mparivahan.ClServices.View.DuplicateCl;
import com.nic.mparivahan.ClServices.View.RenewalCl;
import com.nic.mparivahan.ClServicesMainScreens.SelectClService;
import com.nic.mparivahan.R;
import com.zepto.eg;
import com.zepto.kt6;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.wl5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bg\u0010hJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010E\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R\"\u0010I\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\"\u0010M\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R\"\u0010Q\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010U\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010Y\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\bW\u0010:\"\u0004\bX\u0010<R\"\u0010]\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u00108\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010<R2\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u00050^j\b\u0012\u0004\u0012\u00020\u0005`_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/SelectClService;", "Lcom/zepto/pq;", "", "E1", "C1", "", "message", "K1", "Landroid/content/Intent;", "intent", "selectCode", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/eg;", "C", "Lcom/zepto/eg;", "t1", "()Lcom/zepto/eg;", "R1", "(Lcom/zepto/eg;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "u1", "()Landroid/content/Context;", "S1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "T1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "z1", "()Lcom/zepto/wa3;", "X1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "y1", "()Lcom/zepto/wl5;", "W1", "(Lcom/zepto/wl5;)V", "sarthiSession", "H", "Ljava/lang/String;", "q1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "dlValue", "I", "r1", "P1", "dobValue", "J", "s1", "Q1", "fatherName", "K", "o1", "M1", "clName", "L", "p1", "N1", "clPhoto", "M", "w1", "U1", "rtoCode", "N", "A1", "Y1", "stateCode", "O", "B1", "Z1", "stateName", "P", "x1", "V1", "rtoName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Q", "Ljava/util/ArrayList;", "getSelectClService", "()Ljava/util/ArrayList;", "setSelectClService", "(Ljava/util/ArrayList;)V", "selectClService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SelectClService extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eg mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String stateName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList selectClService = new ArrayList();

    private final void C1() {
        eg egVarX = eg.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(egVarX, "inflate(...)");
        R1(egVarX);
        setContentView(t1().m());
        S1(this);
        X1(new wa3(u1()));
        W1(new wl5(u1()));
        T1(new ProgressDialog(u1()));
        v1().setMessage(z1().b("label_challan_please_wait", getString(R.string.please_wait)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        try {
            P1(String.valueOf(getIntent().getStringExtra("dobValue")));
            O1(String.valueOf(getIntent().getStringExtra("dlValue")));
            Q1(String.valueOf(getIntent().getStringExtra("fatherName")));
            M1(String.valueOf(getIntent().getStringExtra("clName")));
            N1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            U1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            V1(String.valueOf(getIntent().getStringExtra("rtoName")));
            Y1(String.valueOf(getIntent().getStringExtra("stateCode")));
            Z1(String.valueOf(getIntent().getStringExtra("stateName")));
            t1().H.setText("CL No : " + q1());
            t1().B.g.setText(y1().k());
            String strP1 = p1();
            if (strP1 == null || strP1.length() == 0) {
                t1().B.f.setVisibility(8);
            } else {
                t1().B.f.setVisibility(0);
                t1().B.b.setImageBitmap(kt6.a(p1()));
            }
        } catch (Exception unused) {
        }
    }

    private final void E1() {
        t1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.F1(this.a, view);
            }
        });
        t1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.G1(this.a, view);
            }
        });
        t1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.H1(this.a, view);
            }
        });
        t1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ev5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.I1(this.a, view);
            }
        });
        t1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.J1(this.a, view);
            }
        });
    }

    public static final void F1(SelectClService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.selectClService.contains("552")) {
            this$0.D1(new Intent(this$0, (Class<?>) RenewalCl.class), "552");
            return;
        }
        if (this$0.selectClService.contains("553")) {
            this$0.D1(new Intent(this$0, (Class<?>) ChangeOfAddressCl.class), "553");
            return;
        }
        if (this$0.selectClService.contains("554")) {
            this$0.D1(new Intent(this$0, (Class<?>) DuplicateCl.class), "554");
        } else if (this$0.selectClService.contains("559")) {
            this$0.D1(new Intent(this$0, (Class<?>) ChangeNameCl.class), "559");
        } else {
            this$0.K1("Please select minimum one service");
        }
    }

    public static final void G1(SelectClService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        if (!((CompoundButton) view).isChecked()) {
            this$0.selectClService.remove("552");
            return;
        }
        this$0.selectClService.add("552");
        this$0.t1().w.setChecked(false);
        this$0.t1().y.setChecked(false);
        this$0.t1().x.setChecked(false);
        if (this$0.selectClService.contains("553")) {
            this$0.selectClService.remove("553");
        } else if (this$0.selectClService.contains("554")) {
            this$0.selectClService.remove("554");
        } else if (this$0.selectClService.contains("559")) {
            this$0.selectClService.remove("559");
        }
    }

    public static final void H1(SelectClService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        if (!((CompoundButton) view).isChecked()) {
            this$0.selectClService.remove("553");
            return;
        }
        this$0.selectClService.add("553");
        this$0.t1().y.setChecked(false);
        this$0.t1().x.setChecked(false);
        this$0.t1().z.setChecked(false);
        if (this$0.selectClService.contains("552")) {
            this$0.selectClService.remove("552");
        } else if (this$0.selectClService.contains("554")) {
            this$0.selectClService.remove("554");
        } else if (this$0.selectClService.contains("559")) {
            this$0.selectClService.remove("559");
        }
    }

    public static final void I1(SelectClService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        if (!((CompoundButton) view).isChecked()) {
            this$0.selectClService.remove("554");
            return;
        }
        this$0.selectClService.add("554");
        this$0.t1().w.setChecked(false);
        this$0.t1().y.setChecked(false);
        this$0.t1().z.setChecked(false);
        if (this$0.selectClService.contains("553")) {
            this$0.selectClService.remove("553");
        } else if (this$0.selectClService.contains("552")) {
            this$0.selectClService.remove("552");
        } else if (this$0.selectClService.contains("559")) {
            this$0.selectClService.remove("559");
        }
    }

    public static final void J1(SelectClService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        if (!((CompoundButton) view).isChecked()) {
            this$0.selectClService.remove("559");
            return;
        }
        this$0.selectClService.add("559");
        this$0.t1().w.setChecked(false);
        this$0.t1().x.setChecked(false);
        this$0.t1().z.setChecked(false);
        if (this$0.selectClService.contains("553")) {
            this$0.selectClService.remove("553");
        } else if (this$0.selectClService.contains("554")) {
            this$0.selectClService.remove("554");
        } else if (this$0.selectClService.contains("552")) {
            this$0.selectClService.remove("552");
        }
    }

    private final void K1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(z1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClService.L1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final String A1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final String B1() {
        String str = this.stateName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateName");
        return null;
    }

    public final void D1(Intent intent, String selectCode) {
        try {
            intent.putExtra("dlValue", q1());
            intent.putExtra("dobValue", r1());
            intent.putExtra("fatherName", s1());
            intent.putExtra("clName", o1());
            intent.putExtra("clPhoto", p1());
            intent.putExtra("stateCode", A1());
            intent.putExtra("rtoCode", w1());
            intent.putExtra("rtoName", x1());
            intent.putExtra("selectCode", selectCode);
            intent.putExtra("stateName", B1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void R1(eg egVar) {
        Intrinsics.checkNotNullParameter(egVar, "<set-?>");
        this.mBinding = egVar;
    }

    public final void S1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void T1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void W1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void X1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateName = str;
    }

    public final String o1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C1();
        E1();
    }

    public final String p1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final String q1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String r1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String s1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final eg t1() {
        eg egVar = this.mBinding;
        if (egVar != null) {
            return egVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context u1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
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
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String x1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 y1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final wa3 z1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
