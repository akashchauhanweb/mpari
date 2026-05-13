package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.DeleteAccountVerify;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.zepto.af2;
import com.zepto.c26;
import com.zepto.cq;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.uy3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.ze2;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bn\u0010oJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010\u0015\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010L\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR\"\u0010Y\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010\u0015\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010\u0019R\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lcom/nic/mparivahan/Account/View/DeleteAccountVerify;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "E1", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "y1", "()Landroid/widget/LinearLayout;", "S1", "(Landroid/widget/LinearLayout;)V", "submit", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "getDefault_otp", "()Landroid/widget/TextView;", "H1", "(Landroid/widget/TextView;)V", "default_otp", "Landroid/widget/EditText;", "E", "Landroid/widget/EditText;", "p1", "()Landroid/widget/EditText;", "J1", "(Landroid/widget/EditText;)V", "enterOtp", "F", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "L1", "(Ljava/lang/String;)V", "otpId", "G", "q1", "K1", "mobile_number", "Lcom/zepto/af2;", "H", "Lcom/zepto/af2;", "z1", "()Lcom/zepto/af2;", "T1", "(Lcom/zepto/af2;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "I", "Lcom/nic/mparivahan/Account/SignService;", "u1", "()Lcom/nic/mparivahan/Account/SignService;", "O1", "(Lcom/nic/mparivahan/Account/SignService;)V", "retrofitService", "J", "getDisPlay", "I1", "disPlay", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "L", "Landroid/widget/ImageView;", "o1", "()Landroid/widget/ImageView;", "G1", "(Landroid/widget/ImageView;)V", "backButton", "M", "x1", "R1", "showmpin", "N", "t1", "N1", "resendOtp", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "P1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/uy3;", "P", "Lcom/zepto/uy3;", "binding", "Lcom/zepto/ws6;", "Q", "Lcom/zepto/ws6;", "w1", "()Lcom/zepto/ws6;", "Q1", "(Lcom/zepto/ws6;)V", "sessionManager", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DeleteAccountVerify extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout submit;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView default_otp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String otpId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public af2 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public uy3 binding;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ws6 sessionManager;

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            uy3 uy3Var = DeleteAccountVerify.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = DeleteAccountVerify.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = DeleteAccountVerify.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = DeleteAccountVerify.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(DeleteAccountVerify.this.v1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = DeleteAccountVerify.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = DeleteAccountVerify.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {
        public b() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            uy3 uy3Var = DeleteAccountVerify.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = DeleteAccountVerify.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = DeleteAccountVerify.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = DeleteAccountVerify.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(DeleteAccountVerify.this.v1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = DeleteAccountVerify.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = DeleteAccountVerify.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(0);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(OtpVerifyResult otpVerifyResult) {
            try {
                DeleteAccountVerify.this.s1().dismiss();
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    DeleteAccountVerify.this.w1().v();
                    DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(DeleteAccountVerify.this);
                    Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                    databaseHelperD0.m0();
                    databaseHelperD0.close();
                    new cq(DeleteAccountVerify.this).e();
                    NaxpToKenService.INSTANCE.a(DeleteAccountVerify.this);
                    if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusDesc(), "Success", true) || StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusDesc(), "Success", true)) {
                        DeleteAccountVerify deleteAccountVerify = DeleteAccountVerify.this;
                        deleteAccountVerify.E1(deleteAccountVerify, "Your account is successfully deleted");
                    } else {
                        DeleteAccountVerify deleteAccountVerify2 = DeleteAccountVerify.this;
                        deleteAccountVerify2.E1(deleteAccountVerify2, String.valueOf(otpVerifyResult.getStatusDesc()));
                    }
                } else {
                    DeleteAccountVerify deleteAccountVerify3 = DeleteAccountVerify.this;
                    deleteAccountVerify3.E1(deleteAccountVerify3, String.valueOf(otpVerifyResult.getStatusDesc()));
                }
            } catch (Exception unused) {
                DeleteAccountVerify deleteAccountVerify4 = DeleteAccountVerify.this;
                deleteAccountVerify4.E1(deleteAccountVerify4, deleteAccountVerify4.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
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
        public final void invoke(String str) {
            DeleteAccountVerify.this.s1().dismiss();
            DeleteAccountVerify deleteAccountVerify = DeleteAccountVerify.this;
            deleteAccountVerify.E1(deleteAccountVerify, deleteAccountVerify.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(ResendOtp resendOtp) {
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    DeleteAccountVerify.this.s1().dismiss();
                    DeleteAccountVerify deleteAccountVerify = DeleteAccountVerify.this;
                    deleteAccountVerify.E1(deleteAccountVerify, deleteAccountVerify.v1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!gd1.a.m(resendOtp.getStatusDesc())) {
                    DeleteAccountVerify.this.s1().dismiss();
                    DeleteAccountVerify deleteAccountVerify2 = DeleteAccountVerify.this;
                    deleteAccountVerify2.E1(deleteAccountVerify2, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                DeleteAccountVerify.this.s1().dismiss();
                DeleteAccountVerify deleteAccountVerify3 = DeleteAccountVerify.this;
                deleteAccountVerify3.E1(deleteAccountVerify3, deleteAccountVerify3.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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
        public final void invoke(String str) {
            DeleteAccountVerify.this.s1().dismiss();
            DeleteAccountVerify deleteAccountVerify = DeleteAccountVerify.this;
            deleteAccountVerify.E1(deleteAccountVerify, deleteAccountVerify.v1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
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

    public static final void A1(DeleteAccountVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B1(DeleteAccountVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.x1().setImageResource(R.drawable.pass_visible);
            this$0.p1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.x1().setImageResource(R.drawable.mvvm_visibility);
            this$0.p1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void C1(DeleteAccountVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.new b().start();
        this$0.s1().show();
        this$0.z1().j(this$0.r1());
    }

    public static final void D1(DeleteAccountVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.p1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.E1(this$0, this$0.v1().b("label_log_entr_otp", "Please enter the OTP"));
        } else if (string.length() < 6) {
            this$0.E1(this$0, this$0.v1().b("label_log_entr_otp", "Please enter the valid OTP"));
        } else {
            this$0.s1().show();
            this$0.z1().n(string, this$0.r1(), this$0.q1(), this$0);
        }
    }

    public static final void F1(Dialog d2, DeleteAccountVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public final void E1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(v1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountVerify.F1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void G1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void H1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.default_otp = textView;
    }

    public final void I1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void J1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void N1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void O1(SignService signService) {
        Intrinsics.checkNotNullParameter(signService, "<set-?>");
        this.retrofitService = signService;
    }

    public final void P1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void Q1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void R1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void S1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.submit = linearLayout;
    }

    public final void T1(af2 af2Var) {
        Intrinsics.checkNotNullParameter(af2Var, "<set-?>");
        this.viewModel = af2Var;
    }

    public final ImageView o1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.nic.mparivahan.Welcome.a.a.a(this);
        uy3 uy3VarC = uy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(uy3VarC, "inflate(...)");
        this.binding = uy3VarC;
        hz0.a.k(this);
        uy3 uy3Var = this.binding;
        uy3 uy3Var2 = null;
        if (uy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uy3Var = null;
        }
        setContentView(uy3Var.b());
        ta3.a aVar = ta3.a;
        uy3 uy3Var3 = this.binding;
        if (uy3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uy3Var3 = null;
        }
        aVar.Y2(this, uy3Var3);
        P1(new wa3(this));
        Q1(new ws6(this));
        O1(SignService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.submit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        S1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        J1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        I1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.default_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        H1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        R1((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        N1((TextView) viewFindViewById6);
        M1(new ProgressDialog(this));
        s1().setMessage(v1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        G1((ImageView) viewFindViewById7);
        o1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountVerify.A1(this.a, view);
            }
        });
        x1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountVerify.B1(this.a, view);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            try {
                uy3 uy3Var4 = this.binding;
                if (uy3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    uy3Var4 = null;
                }
                uy3Var4.p.setVisibility(0);
                uy3 uy3Var5 = this.binding;
                if (uy3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    uy3Var5 = null;
                }
                uy3Var5.m.setText(intent.getStringExtra("title"));
                L1(String.valueOf(intent.getStringExtra("otpId")));
                K1(String.valueOf(intent.getStringExtra("MobileNumber")));
                String strQ1 = q1();
                int length = strQ1.length();
                String strReplace = "";
                for (int i = 0; i < length; i++) {
                    strQ1.charAt(i);
                    strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(q1(), ""), "X");
                }
                uy3 uy3Var6 = this.binding;
                if (uy3Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uy3Var2 = uy3Var6;
                }
                uy3Var2.q.setText(v1().b("label_otp_sent_to_mobile", "OTP has been sent to your registered mobile +91") + strReplace);
                new a().start();
            } catch (Exception unused) {
            }
        }
        t1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountVerify.C1(this.a, view);
            }
        });
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountVerify.D1(this.a, view);
            }
        });
        T1((af2) new z(this, new ze2(new c26(u1()))).a(af2.class));
        z1().k().g(this, new g(new c()));
        z1().g().g(this, new g(new d()));
        z1().i().g(this, new g(new e()));
        z1().h().g(this, new g(new f()));
    }

    public final EditText p1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final String q1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final String r1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final TextView t1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final SignService u1() {
        SignService signService = this.retrofitService;
        if (signService != null) {
            return signService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 w1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ImageView x1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.submit;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submit");
        return null;
    }

    public final af2 z1() {
        af2 af2Var = this.viewModel;
        if (af2Var != null) {
            return af2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
