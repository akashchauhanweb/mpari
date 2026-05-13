package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

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
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.OtpVerification;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import com.zepto.ez5;
import com.zepto.fz5;
import com.zepto.gz5;
import com.zepto.hz5;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.pq;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010;R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010;¨\u0006M"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Activity/OtpVerification;", "Lcom/zepto/pq;", "", "B1", "", "message", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "mobile_no", "L1", "x1", "Lcom/zepto/fz5;", "C", "Lcom/zepto/fz5;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "dialog", "E", "Landroid/content/Context;", "mContext", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "z1", "()Lcom/zepto/wl5;", "J1", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/hz5;", "H", "Lcom/zepto/hz5;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "I", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "service", "Lcom/zepto/ws6;", "J", "Lcom/zepto/ws6;", "A1", "()Lcom/zepto/ws6;", "K1", "(Lcom/zepto/ws6;)V", "sessionManager", "K", "Ljava/lang/String;", "getRecord_id", "()Ljava/lang/String;", "I1", "(Ljava/lang/String;)V", "record_id", "L", "mobileNo", "M", "applicationNo", "N", "applicantName", "O", "applicantDob", "P", "relationPersonName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class OtpVerification extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fz5 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public hz5 viewModal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ServiceWithdrawn service;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String applicationNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String applicantName = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String applicantDob = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String relationPersonName = "";

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
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = OtpVerification.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = OtpVerification.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                        mt6.a.c(OtpVerification.this, sendOtpResult.getStatusDesc());
                        return;
                    } else {
                        OtpVerification.this.F1(sendOtpResult.getStatusDesc());
                        return;
                    }
                }
                OtpVerification.this.I1(String.valueOf(sendOtpResult.getRecordId()));
                OtpVerification otpVerification = OtpVerification.this;
                fz5 fz5Var = otpVerification.binding;
                if (fz5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fz5Var = null;
                }
                otpVerification.L1(otpVerification, fz5Var.f.getText().toString());
            } catch (Exception unused) {
                ProgressDialog progressDialog4 = OtpVerification.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = OtpVerification.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
                OtpVerification otpVerification2 = OtpVerification.this;
                String strB = otpVerification2.y1().b("label_went_wrong", OtpVerification.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                otpVerification2.F1(strB);
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
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    OtpVerification.this.F1(otpVerifyResult.getStatusDesc());
                    return;
                }
                ProgressDialog progressDialog = OtpVerification.this.dialog;
                ProgressDialog progressDialog2 = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog = null;
                }
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog3 = OtpVerification.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog2 = progressDialog3;
                    }
                    progressDialog2.dismiss();
                }
                Intent intent = new Intent(OtpVerification.this, (Class<?>) SelectedWithdrawnList.class);
                intent.putExtra("applNo", OtpVerification.this.applicationNo);
                intent.putExtra("applicantFullName", OtpVerification.this.applicantName);
                intent.putExtra("applicantDob", OtpVerification.this.applicantDob);
                OtpVerification.this.startActivity(intent);
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

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = OtpVerification.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = OtpVerification.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = OtpVerification.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = OtpVerification.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final class f extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ OtpVerification b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextView textView, OtpVerification otpVerification, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = otpVerification;
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
            this.a.setText(this.b.y1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class g extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ OtpVerification b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextView textView, OtpVerification otpVerification, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = otpVerification;
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
            this.a.setText(this.b.y1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void B1() {
        this.mContext = this;
        K1(new ws6(this));
        Context context = this.mContext;
        fz5 fz5Var = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        J1(new wl5(context));
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        H1(new wa3(context2));
        ServiceWithdrawn.Companion companion = ServiceWithdrawn.INSTANCE;
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context3 = null;
        }
        this.service = companion.b(context3);
        fz5 fz5Var2 = this.binding;
        if (fz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5Var2 = null;
        }
        fz5Var2.e.f.setText(z1().k());
        fz5 fz5Var3 = this.binding;
        if (fz5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5Var3 = null;
        }
        fz5Var3.e.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.si4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.C1(this.a, view);
            }
        });
        ServiceWithdrawn serviceWithdrawn = this.service;
        if (serviceWithdrawn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            serviceWithdrawn = null;
        }
        this.viewModal = (hz5) new z(this, new ez5(new gz5(serviceWithdrawn))).a(hz5.class);
        fz5 fz5Var4 = this.binding;
        if (fz5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5Var4 = null;
        }
        fz5Var4.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ti4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.D1(this.a, view);
            }
        });
        fz5 fz5Var5 = this.binding;
        if (fz5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fz5Var = fz5Var5;
        }
        fz5Var.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ui4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.E1(this.a, view);
            }
        });
    }

    public static final void C1(OtpVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D1(OtpVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = null;
        try {
            fz5 fz5Var = this$0.binding;
            if (fz5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fz5Var = null;
            }
            if (fz5Var.f.getText().toString().length() < 10) {
                Toast.makeText(this$0, this$0.y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
            mt6.a aVar = mt6.a;
            fz5 fz5Var2 = this$0.binding;
            if (fz5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fz5Var2 = null;
            }
            if (!aVar.t(fz5Var2.f.getText().toString())) {
                Toast.makeText(this$0, this$0.y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
            ProgressDialog progressDialog2 = this$0.dialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            hz5 hz5Var = this$0.viewModal;
            if (hz5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
                hz5Var = null;
            }
            fz5 fz5Var3 = this$0.binding;
            if (fz5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fz5Var3 = null;
            }
            hz5Var.u(fz5Var3.f.getText().toString(), this$0.A1().k());
        } catch (Exception e2) {
            ProgressDialog progressDialog3 = this$0.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            if (progressDialog3.isShowing()) {
                ProgressDialog progressDialog4 = this$0.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog4;
                }
                progressDialog.dismiss();
            }
            e2.printStackTrace();
        }
    }

    public static final void E1(OtpVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fz5 fz5Var = this$0.binding;
        if (fz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5Var = null;
        }
        fz5Var.f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(String message) {
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
        ((TextView) viewFindViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ri4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.G1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void M1(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void N1(OtpVerification this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        hz5 hz5Var = this$0.viewModal;
        if (hz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var = null;
        }
        hz5Var.q(String.valueOf(this$0.record_id));
        new g(time_text, this$0, resendOtp).start();
    }

    public static final void O1(OtpVerification this$0, EditText enterOtp, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.y1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.y1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        d2.dismiss();
        hz5 hz5Var = this$0.viewModal;
        if (hz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var = null;
        }
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        hz5Var.x(string, str);
    }

    public static final void P1(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void Q1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final ws6 A1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void I1(String str) {
        this.record_id = str;
    }

    public final void J1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void K1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void L1(Context context, String mobile_no) {
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
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(y1().b("otp_verification", getString(R.string.otp_verification)));
        textView2.setText(y1().b("vahan_btn_submit", getString(R.string.submit)));
        textView4.setText(y1().b("btn_reset", getString(R.string.reset)));
        textView.setText(y1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(y1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(y1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView5.setText(sb.toString());
            } else {
                textView5.setText(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView5.setText(y1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new f(textView3, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.M1(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.N1(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.O1(this.a, editText, dialog, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.P1(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerification.Q1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fz5 fz5VarC = fz5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fz5VarC, "inflate(...)");
        this.binding = fz5VarC;
        hz5 hz5Var = null;
        if (fz5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5VarC = null;
        }
        setContentView(fz5VarC.b());
        H1(new wa3(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(y1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        x1();
        B1();
        ta3.a aVar = ta3.a;
        fz5 fz5Var = this.binding;
        if (fz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fz5Var = null;
        }
        aVar.r(this, fz5Var);
        hz5 hz5Var2 = this.viewModal;
        if (hz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var2 = null;
        }
        hz5Var2.n().g(this, new e(new a()));
        hz5 hz5Var3 = this.viewModal;
        if (hz5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var3 = null;
        }
        hz5Var3.r().g(this, new e(new b()));
        hz5 hz5Var4 = this.viewModal;
        if (hz5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            hz5Var4 = null;
        }
        hz5Var4.m().g(this, new e(new c()));
        hz5 hz5Var5 = this.viewModal;
        if (hz5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            hz5Var = hz5Var5;
        }
        hz5Var.o().g(this, new e(new d()));
    }

    public final void x1() {
        String stringExtra = getIntent().getStringExtra("mobileNo");
        Intrinsics.checkNotNull(stringExtra);
        this.mobileNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("applNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.applicationNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra3);
        this.applicantName = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("fatherName");
        Intrinsics.checkNotNull(stringExtra4);
        this.relationPersonName = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra5);
        this.applicantDob = stringExtra5;
        fz5 fz5Var = null;
        if (kt6.d(this.mobileNo)) {
            fz5 fz5Var2 = this.binding;
            if (fz5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fz5Var2 = null;
            }
            fz5Var2.f.setText(this.mobileNo);
        }
        if (kt6.d(this.applicationNo)) {
            fz5 fz5Var3 = this.binding;
            if (fz5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fz5Var = fz5Var3;
            }
            fz5Var.b.setText(this.applicationNo);
        }
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final wl5 z1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }
}
