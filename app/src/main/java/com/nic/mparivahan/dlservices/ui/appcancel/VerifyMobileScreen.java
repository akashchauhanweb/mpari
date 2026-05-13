package com.nic.mparivahan.dlservices.ui.appcancel;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelAppPojo;
import com.nic.mparivahan.dlservices.ui.appcancel.VerifyMobileScreen;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.l6;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0014\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/VerifyMobileScreen;", "Lcom/zepto/pq;", "", "G1", "", "message", "J1", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "mobile_no", "Y1", "Lcom/zepto/l6;", "C", "Lcom/zepto/l6;", "binding", "D", "Ljava/lang/String;", "applNo", "E", "dob", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "A1", "()Landroid/app/ProgressDialog;", "R1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/nr1;", "H", "Lcom/zepto/nr1;", "w1", "()Lcom/zepto/nr1;", "N1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "B1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "T1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ws6;", "J", "Lcom/zepto/ws6;", "D1", "()Lcom/zepto/ws6;", "V1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/widget/TextView;", "K", "Landroid/widget/TextView;", "F1", "()Landroid/widget/TextView;", "X1", "(Landroid/widget/TextView;)V", "txt_reset", "L", "E1", "W1", "submitOtp", "M", "getRecord_id", "()Ljava/lang/String;", "S1", "(Ljava/lang/String;)V", "record_id", "Lcom/zepto/kl0;", "N", "Lcom/zepto/kl0;", "y1", "()Lcom/zepto/kl0;", "P1", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "O", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "z1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "Q1", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Lcom/zepto/wl5;", "P", "Lcom/zepto/wl5;", "C1", "()Lcom/zepto/wl5;", "U1", "(Lcom/zepto/wl5;)V", "sarathiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VerifyMobileScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public l6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wl5 sarathiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SendOtpResult sendOtpResult) {
            try {
                if (VerifyMobileScreen.this.A1().isShowing()) {
                    VerifyMobileScreen.this.A1().dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                        mt6.a.c(VerifyMobileScreen.this, sendOtpResult.getStatusDesc());
                        return;
                    } else {
                        VerifyMobileScreen.this.J1(sendOtpResult.getStatusDesc());
                        return;
                    }
                }
                VerifyMobileScreen.this.S1(String.valueOf(sendOtpResult.getRecordId()));
                VerifyMobileScreen verifyMobileScreen = VerifyMobileScreen.this;
                l6 l6Var = verifyMobileScreen.binding;
                if (l6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    l6Var = null;
                }
                verifyMobileScreen.Y1(verifyMobileScreen, String.valueOf(l6Var.f.getText()));
            } catch (Exception unused) {
                if (VerifyMobileScreen.this.A1().isShowing()) {
                    VerifyMobileScreen.this.A1().dismiss();
                }
                VerifyMobileScreen verifyMobileScreen2 = VerifyMobileScreen.this;
                String strB = verifyMobileScreen2.x1().b("label_went_wrong", VerifyMobileScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                verifyMobileScreen2.J1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    VerifyMobileScreen.this.A1().show();
                    kl0 kl0VarY1 = VerifyMobileScreen.this.y1();
                    VerifyMobileScreen verifyMobileScreen = VerifyMobileScreen.this;
                    kl0VarY1.g(verifyMobileScreen, verifyMobileScreen.applNo, VerifyMobileScreen.this.dob);
                } else {
                    VerifyMobileScreen.this.J1(otpVerifyResult.getStatusDesc());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(CancelAppPojo cancelAppPojo) {
            try {
                if (VerifyMobileScreen.this.A1().isShowing()) {
                    VerifyMobileScreen.this.A1().dismiss();
                }
                if (!Intrinsics.areEqual(cancelAppPojo.getStatus_code(), "00")) {
                    VerifyMobileScreen.this.J1(cancelAppPojo.getStatus_desc());
                } else {
                    VerifyMobileScreen verifyMobileScreen = VerifyMobileScreen.this;
                    verifyMobileScreen.L1(verifyMobileScreen.x1().b("APPOINTMENT_CANCELLED_SUCCESS", "Appointment is cancelled Successfully"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CancelAppPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final class e extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ VerifyMobileScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextView textView, VerifyMobileScreen verifyMobileScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = verifyMobileScreen;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.x1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class f extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ VerifyMobileScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextView textView, VerifyMobileScreen verifyMobileScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = verifyMobileScreen;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.x1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void G1() {
        V1(new ws6(this));
        U1(new wl5(this));
        l6 l6Var = this.binding;
        l6 l6Var2 = null;
        if (l6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l6Var = null;
        }
        l6Var.e.g.setText(C1().k());
        T1(DlServiceInt.INSTANCE.a(this));
        N1((nr1) new z(this, new rq1(new lr1(B1(), this))).a(nr1.class));
        Q1(ClInter.INSTANCE.a(this));
        P1((kl0) new z(this, new sn0(new jl0(z1()))).a(kl0.class));
        if (this.applNo.length() > 0) {
            l6 l6Var3 = this.binding;
            if (l6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                l6Var3 = null;
            }
            l6Var3.b.setText(this.applNo);
        }
        l6 l6Var4 = this.binding;
        if (l6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l6Var4 = null;
        }
        l6Var4.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.do7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.H1(this.a, view);
            }
        });
        l6 l6Var5 = this.binding;
        if (l6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            l6Var2 = l6Var5;
        }
        l6Var2.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.I1(this.a, view);
            }
        });
    }

    public static final void H1(VerifyMobileScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            l6 l6Var = this$0.binding;
            l6 l6Var2 = null;
            if (l6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                l6Var = null;
            }
            if (String.valueOf(l6Var.f.getText()).length() < 10) {
                Toast.makeText(this$0, this$0.x1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
            mt6.a aVar = mt6.a;
            l6 l6Var3 = this$0.binding;
            if (l6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                l6Var3 = null;
            }
            if (!aVar.t(String.valueOf(l6Var3.f.getText()))) {
                Toast.makeText(this$0, this$0.x1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
            this$0.A1().show();
            nr1 nr1VarW1 = this$0.w1();
            l6 l6Var4 = this$0.binding;
            if (l6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                l6Var2 = l6Var4;
            }
            nr1VarW1.F(this$0, String.valueOf(l6Var2.f.getText()), this$0.D1().k());
        } catch (Exception e2) {
            if (this$0.A1().isShowing()) {
                this$0.A1().dismiss();
            }
            e2.printStackTrace();
        }
    }

    public static final void I1(VerifyMobileScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        l6 l6Var = this$0.binding;
        if (l6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l6Var = null;
        }
        l6Var.f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(x1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(x1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.K1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(x1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(x1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.M1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void M1(Dialog d2, VerifyMobileScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) ApplicationCancel.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void Z1(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void a2(VerifyMobileScreen this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.w1().D(this$0, String.valueOf(this$0.record_id));
        new f(time_text, this$0, resendOtp).start();
    }

    public static final void b2(VerifyMobileScreen this$0, EditText enterOtp, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.x1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.x1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.x1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        d2.dismiss();
        nr1 nr1VarW1 = this$0.w1();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarW1.G(this$0, string, str);
    }

    public static final void c2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void d2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt B1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 C1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final ws6 D1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final TextView E1() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void N1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void P1(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void Q1(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void R1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1(String str) {
        this.record_id = str;
    }

    public final void T1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void U1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void V1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void W1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final void X1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final void Y1(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        W1((TextView) viewFindViewById4);
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        X1((TextView) viewFindViewById7);
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(x1().b("otp_verification", getString(R.string.otp_verification)));
        E1().setText(x1().b("vahan_btn_submit", getString(R.string.submit)));
        F1().setText(x1().b("btn_reset", getString(R.string.reset)));
        textView.setText(x1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(x1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(x1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(x1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView3.setText(sb.toString());
            } else {
                textView3.setText(x1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView3.setText(x1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new e(textView2, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.Z1(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.a2(this.a, textView2, textView, view);
            }
        });
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ao7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.b2(this.a, editText, dialog, view);
            }
        });
        F1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.c2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.co7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileScreen.d2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l6 l6VarC = l6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l6VarC, "inflate(...)");
        this.binding = l6VarC;
        l6 l6Var = null;
        if (l6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l6VarC = null;
        }
        setContentView(l6VarC.b());
        String stringExtra = getIntent().getStringExtra("applNo");
        Intrinsics.checkNotNull(stringExtra);
        this.applNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra2);
        this.dob = stringExtra2;
        O1(new wa3(this));
        R1(new ProgressDialog(this));
        A1().setMessage(x1().b("label_challan_please_wait", getString(R.string.please_wait)));
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        G1();
        ta3.a aVar = ta3.a;
        l6 l6Var2 = this.binding;
        if (l6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            l6Var = l6Var2;
        }
        aVar.F(this, l6Var);
        w1().u().g(this, new d(new a()));
        w1().E().g(this, new d(new b()));
        y1().n().g(this, new d(new c()));
    }

    public final nr1 w1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final kl0 y1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter z1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }
}
