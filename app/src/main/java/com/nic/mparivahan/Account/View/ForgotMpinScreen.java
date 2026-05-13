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
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.MparCitizenUser;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.ForgotMpinScreen;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u001bR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010_\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010\u0017\u001a\u0004\b]\u0010\u0019\"\u0004\b^\u0010\u001bR\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/nic/mparivahan/Account/View/ForgotMpinScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "H1", "title", "o1", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "B1", "()Landroid/widget/LinearLayout;", "V1", "(Landroid/widget/LinearLayout;)V", "submit", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "getDefault_otp", "()Landroid/widget/TextView;", "K1", "(Landroid/widget/TextView;)V", "default_otp", "Landroid/widget/EditText;", "E", "Landroid/widget/EditText;", "s1", "()Landroid/widget/EditText;", "M1", "(Landroid/widget/EditText;)V", "enterOtp", "F", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "P1", "(Ljava/lang/String;)V", "otpId", "G", "t1", "N1", "mobile_number", "H", "u1", "O1", "mpin", "Lcom/zepto/af2;", "I", "Lcom/zepto/af2;", "C1", "()Lcom/zepto/af2;", "W1", "(Lcom/zepto/af2;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "J", "Lcom/nic/mparivahan/Account/SignService;", "y1", "()Lcom/nic/mparivahan/Account/SignService;", "S1", "(Lcom/nic/mparivahan/Account/SignService;)V", "retrofitService", "K", "getDisPlay", "L1", "disPlay", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "M", "Landroid/widget/ImageView;", "r1", "()Landroid/widget/ImageView;", "J1", "(Landroid/widget/ImageView;)V", "backButton", "N", "A1", "U1", "showmpin", "O", "x1", "R1", "resendOtp", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "z1", "()Lcom/zepto/wa3;", "T1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/uy3;", "Q", "Lcom/zepto/uy3;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ForgotMpinScreen extends pq {

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
    public String mpin;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public af2 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public uy3 binding;

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            uy3 uy3Var = ForgotMpinScreen.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = ForgotMpinScreen.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = ForgotMpinScreen.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = ForgotMpinScreen.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(ForgotMpinScreen.this.z1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = ForgotMpinScreen.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = ForgotMpinScreen.this.binding;
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
            uy3 uy3Var = ForgotMpinScreen.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = ForgotMpinScreen.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = ForgotMpinScreen.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = ForgotMpinScreen.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(ForgotMpinScreen.this.z1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = ForgotMpinScreen.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = ForgotMpinScreen.this.binding;
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
                ForgotMpinScreen.this.w1().dismiss();
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ForgotMpinScreen forgotMpinScreen = ForgotMpinScreen.this;
                    forgotMpinScreen.H1(forgotMpinScreen, String.valueOf(otpVerifyResult.getStatusDesc()));
                    return;
                }
                ws6 ws6Var = new ws6(ForgotMpinScreen.this);
                if (ws6Var.u()) {
                    ws6Var.v();
                    DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(ForgotMpinScreen.this);
                    Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                    databaseHelperD0.m0();
                    databaseHelperD0.close();
                    new cq(ForgotMpinScreen.this).e();
                    NaxpToKenService.INSTANCE.a(ForgotMpinScreen.this);
                }
                Gson gson = new Gson();
                Object objFromJson = gson.fromJson(gson.toJson(otpVerifyResult.getMparCitizenUser()), (Class<Object>) MparCitizenUser.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                MparCitizenUser mparCitizenUser = (MparCitizenUser) objFromJson;
                ws6Var.b(String.valueOf(mparCitizenUser.getCtzRecordId()), String.valueOf(mparCitizenUser.getCtzMobile()), mparCitizenUser.getCtzDispName(), mparCitizenUser.getCtzEmail(), ForgotMpinScreen.this.u1(), mparCitizenUser.getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(mparCitizenUser.getCtzMpinStatus()));
                ForgotMpinScreen forgotMpinScreen2 = ForgotMpinScreen.this;
                String strB = forgotMpinScreen2.z1().b("label_log_mpin_rest_succ", "MPIN reset successfully!");
                Intrinsics.checkNotNull(strB);
                forgotMpinScreen2.o1(forgotMpinScreen2, strB);
            } catch (Exception unused) {
                ForgotMpinScreen forgotMpinScreen3 = ForgotMpinScreen.this;
                forgotMpinScreen3.H1(forgotMpinScreen3, forgotMpinScreen3.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            ForgotMpinScreen.this.w1().dismiss();
            ForgotMpinScreen forgotMpinScreen = ForgotMpinScreen.this;
            forgotMpinScreen.H1(forgotMpinScreen, forgotMpinScreen.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
                    ForgotMpinScreen.this.w1().dismiss();
                    ForgotMpinScreen forgotMpinScreen = ForgotMpinScreen.this;
                    forgotMpinScreen.H1(forgotMpinScreen, forgotMpinScreen.z1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!gd1.a.m(resendOtp.getStatusDesc())) {
                    ForgotMpinScreen.this.w1().dismiss();
                    ForgotMpinScreen forgotMpinScreen2 = ForgotMpinScreen.this;
                    forgotMpinScreen2.H1(forgotMpinScreen2, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                ForgotMpinScreen.this.w1().dismiss();
                ForgotMpinScreen forgotMpinScreen3 = ForgotMpinScreen.this;
                forgotMpinScreen3.H1(forgotMpinScreen3, forgotMpinScreen3.z1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            ForgotMpinScreen.this.w1().dismiss();
            ForgotMpinScreen forgotMpinScreen = ForgotMpinScreen.this;
            forgotMpinScreen.H1(forgotMpinScreen, forgotMpinScreen.z1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
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

    public static final void D1(ForgotMpinScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void E1(ForgotMpinScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.s1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.A1().setImageResource(R.drawable.pass_visible);
            this$0.s1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.A1().setImageResource(R.drawable.mvvm_visibility);
            this$0.s1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void F1(ForgotMpinScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.new b().start();
        this$0.w1().show();
        this$0.C1().j(this$0.v1());
    }

    public static final void G1(ForgotMpinScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.s1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.H1(this$0, this$0.z1().b("label_log_entr_otp", "Please enter the OTP"));
        } else if (string.length() < 6) {
            this$0.H1(this$0, this$0.z1().b("label_log_entr_otp", "Please enter the valid OTP"));
        } else {
            this$0.w1().show();
            this$0.C1().l(string, this$0.v1(), this$0.t1(), this$0, this$0.u1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void p1(Dialog dialog, ForgotMpinScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public final ImageView A1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.submit;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submit");
        return null;
    }

    public final af2 C1() {
        af2 af2Var = this.viewModel;
        if (af2Var != null) {
            return af2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void H1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xe2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.I1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void J1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void K1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.default_otp = textView;
    }

    public final void L1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void M1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mpin = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void S1(SignService signService) {
        Intrinsics.checkNotNullParameter(signService, "<set-?>");
        this.retrofitService = signService;
    }

    public final void T1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void U1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void V1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.submit = linearLayout;
    }

    public final void W1(af2 af2Var) {
        Intrinsics.checkNotNullParameter(af2Var, "<set-?>");
        this.viewModel = af2Var;
    }

    public final void o1(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.succes_mpin);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(z1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ye2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.p1(dialog, this, view);
            }
        });
        dialog.show();
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
        aVar.N0(this, uy3Var3);
        T1(new wa3(this));
        S1(SignService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.submit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        V1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        M1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        L1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.default_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        K1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        U1((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        R1((TextView) viewFindViewById6);
        Q1(new ProgressDialog(this));
        w1().setMessage(z1().b("label_challan_please_wait", "Please wait..."));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        J1((ImageView) viewFindViewById7);
        r1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.te2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.D1(this.a, view);
            }
        });
        A1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ue2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.E1(this.a, view);
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
                uy3Var4.m.setText(intent.getStringExtra("title"));
                P1(String.valueOf(intent.getStringExtra("otpId")));
                N1(String.valueOf(intent.getStringExtra("MobileNumber")));
                O1(String.valueOf(intent.getStringExtra("Mpin")));
                String strT1 = t1();
                int length = strT1.length();
                String strReplace = "";
                for (int i = 0; i < length; i++) {
                    strT1.charAt(i);
                    strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(t1(), ""), "X");
                }
                uy3 uy3Var5 = this.binding;
                if (uy3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uy3Var2 = uy3Var5;
                }
                uy3Var2.q.setText(z1().b("label_otp_sent_to_mobile", "OTP has been sent to your registered mobile +91") + strReplace);
                new a().start();
            } catch (Exception unused) {
            }
        }
        x1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ve2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.F1(this.a, view);
            }
        });
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.we2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotMpinScreen.G1(this.a, view);
            }
        });
        W1((af2) new z(this, new ze2(new c26(y1()))).a(af2.class));
        C1().k().g(this, new g(new c()));
        C1().g().g(this, new g(new d()));
        C1().i().g(this, new g(new e()));
        C1().h().g(this, new g(new f()));
    }

    public final ImageView r1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText s1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final String t1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final String u1() {
        String str = this.mpin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpin");
        return null;
    }

    public final String v1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
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

    public final TextView x1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final SignService y1() {
        SignService signService = this.retrofitService;
        if (signService != null) {
            return signService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
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
