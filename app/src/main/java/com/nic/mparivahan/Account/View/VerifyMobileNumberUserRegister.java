package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.MparCitizenUserX;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.otpRegistartionResult;
import com.nic.mparivahan.Account.View.VerifyMobileNumberUserRegister;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.zepto.cq;
import com.zepto.f11;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.oh;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.un7;
import com.zepto.va3;
import com.zepto.vn7;
import com.zepto.wa3;
import com.zepto.ws6;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bv\u0010wJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010\u0014\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0018R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010(\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010(\u001a\u0004\bc\u0010*\"\u0004\bd\u0010,R\"\u0010i\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/nic/mparivahan/Account/View/VerifyMobileNumberUserRegister;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "H1", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "B1", "()Landroid/widget/LinearLayout;", "Y1", "(Landroid/widget/LinearLayout;)V", "verify_user", "D", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "fullname_text", "E", "s1", "P1", "mobile_number_text", "F", "t1", "Q1", "mpin_text", "G", "p1", "M1", "email_text", "Landroid/widget/TextView;", "H", "Landroid/widget/TextView;", "getDefault_otp", "()Landroid/widget/TextView;", "K1", "(Landroid/widget/TextView;)V", "default_otp", "Landroid/widget/EditText;", "I", "Landroid/widget/EditText;", "q1", "()Landroid/widget/EditText;", "N1", "(Landroid/widget/EditText;)V", "enterOtp", "J", "u1", "R1", "otpId", "K", "A1", "X1", "StateCode", "Lcom/zepto/vn7;", "L", "Lcom/zepto/vn7;", "C1", "()Lcom/zepto/vn7;", "Z1", "(Lcom/zepto/vn7;)V", "viewModel", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "M", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "x1", "()Lcom/nic/mparivahan/Account/CreateAccountServices;", "U1", "(Lcom/nic/mparivahan/Account/CreateAccountServices;)V", "retrofitService", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "S1", "(Landroid/app/ProgressDialog;)V", "pDialog", "O", "o1", "L1", "disPlay", "Landroid/widget/ImageView;", "P", "Landroid/widget/ImageView;", "n1", "()Landroid/widget/ImageView;", "J1", "(Landroid/widget/ImageView;)V", "backButton", "Q", "w1", "T1", "resendOtp", "R", "z1", "W1", "showmpin", "Lcom/zepto/oh;", "S", "Lcom/zepto/oh;", "binding", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "V1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VerifyMobileNumberUserRegister extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout verify_user;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String fullname_text;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String mobile_number_text;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String mpin_text;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String email_text;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView default_otp;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String otpId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String StateCode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vn7 viewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public CreateAccountServices retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public oh binding;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ VerifyMobileNumberUserRegister e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef objectRef, VerifyMobileNumberUserRegister verifyMobileNumberUserRegister) {
            super(1);
            this.c = objectRef;
            this.e = verifyMobileNumberUserRegister;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void a(otpRegistartionResult otpregistartionresult) {
            try {
                if (!StringsKt__StringsJVMKt.equals(otpregistartionresult.getStatusCode(), "AL001", true)) {
                    if (StringsKt__StringsJVMKt.equals(otpregistartionresult.getStatusCode(), "AL002", true)) {
                        this.e.v1().dismiss();
                        VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = this.e;
                        verifyMobileNumberUserRegister.H1(verifyMobileNumberUserRegister, otpregistartionresult.getStatusDesc().toString());
                        return;
                    }
                    if (StringsKt__StringsJVMKt.equals(otpregistartionresult.getStatusCode(), "AL003", true)) {
                        this.e.v1().dismiss();
                        VerifyMobileNumberUserRegister verifyMobileNumberUserRegister2 = this.e;
                        verifyMobileNumberUserRegister2.H1(verifyMobileNumberUserRegister2, otpregistartionresult.getStatusDesc().toString());
                        return;
                    } else {
                        if (StringsKt__StringsJVMKt.equals(otpregistartionresult.getStatusCode(), "AL004", true)) {
                            this.e.v1().dismiss();
                            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister3 = this.e;
                            verifyMobileNumberUserRegister3.H1(verifyMobileNumberUserRegister3, otpregistartionresult.getStatusDesc().toString());
                            return;
                        }
                        this.e.v1().dismiss();
                        if (gd1.a.m(otpregistartionresult.getStatusDesc())) {
                            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister4 = this.e;
                            verifyMobileNumberUserRegister4.H1(verifyMobileNumberUserRegister4, verifyMobileNumberUserRegister4.y1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                            return;
                        } else {
                            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister5 = this.e;
                            verifyMobileNumberUserRegister5.H1(verifyMobileNumberUserRegister5, otpregistartionresult.getStatusDesc());
                            return;
                        }
                    }
                }
                if (((ws6) this.c.element).u()) {
                    ((ws6) this.c.element).v();
                    DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this.e);
                    Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                    databaseHelperD0.m0();
                    databaseHelperD0.close();
                    new cq(this.e).e();
                    NaxpToKenService.INSTANCE.a(this.e);
                }
                this.e.v1().dismiss();
                ws6 ws6Var = (ws6) this.c.element;
                MparCitizenUserX mparCitizenUser = otpregistartionresult.getMparCitizenUser();
                String strValueOf = String.valueOf(mparCitizenUser != null ? Long.valueOf(mparCitizenUser.getCtzRecordId()) : null);
                String strS1 = this.e.s1();
                String strR1 = this.e.r1();
                String strP1 = this.e.p1();
                String strT1 = this.e.t1();
                MparCitizenUserX mparCitizenUser2 = otpregistartionresult.getMparCitizenUser();
                String ctzStateCd = mparCitizenUser2 != null ? mparCitizenUser2.getCtzStateCd() : null;
                Boolean bool = Boolean.TRUE;
                MparCitizenUserX mparCitizenUser3 = otpregistartionresult.getMparCitizenUser();
                ws6Var.b(strValueOf, strS1, strR1, strP1, strT1, ctzStateCd, bool, mparCitizenUser3 != null ? Boolean.valueOf(mparCitizenUser3.getCtzMpinStatus()) : null);
                Toast.makeText(this.e.getApplicationContext(), this.e.y1().b(va3.a.k0(), "User registered successfully with NextGen mParivahan"), 1).show();
                this.e.startActivity(new Intent(this.e, (Class<?>) SignInScreen.class));
                this.e.finishAffinity();
            } catch (Exception unused) {
                this.e.v1().dismiss();
                VerifyMobileNumberUserRegister verifyMobileNumberUserRegister6 = this.e;
                verifyMobileNumberUserRegister6.H1(verifyMobileNumberUserRegister6, verifyMobileNumberUserRegister6.y1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((otpRegistartionResult) obj);
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
            VerifyMobileNumberUserRegister.this.v1().dismiss();
            Log.e("error", str.toString());
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = VerifyMobileNumberUserRegister.this;
            verifyMobileNumberUserRegister.H1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some times"));
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
        public final void a(ResendOtp resendOtp) {
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    VerifyMobileNumberUserRegister.this.v1().dismiss();
                    VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = VerifyMobileNumberUserRegister.this;
                    verifyMobileNumberUserRegister.H1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.y1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (gd1.a.m(resendOtp.getStatusDesc())) {
                    VerifyMobileNumberUserRegister.this.v1().dismiss();
                    VerifyMobileNumberUserRegister verifyMobileNumberUserRegister2 = VerifyMobileNumberUserRegister.this;
                    verifyMobileNumberUserRegister2.H1(verifyMobileNumberUserRegister2, verifyMobileNumberUserRegister2.y1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                } else {
                    VerifyMobileNumberUserRegister verifyMobileNumberUserRegister3 = VerifyMobileNumberUserRegister.this;
                    verifyMobileNumberUserRegister3.H1(verifyMobileNumberUserRegister3, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                VerifyMobileNumberUserRegister.this.v1().dismiss();
                VerifyMobileNumberUserRegister verifyMobileNumberUserRegister4 = VerifyMobileNumberUserRegister.this;
                verifyMobileNumberUserRegister4.H1(verifyMobileNumberUserRegister4, verifyMobileNumberUserRegister4.y1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
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
            VerifyMobileNumberUserRegister.this.v1().dismiss();
            Log.e("error", str.toString());
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = VerifyMobileNumberUserRegister.this;
            verifyMobileNumberUserRegister.H1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.y1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
            Log.e("error--", str.toString());
            VerifyMobileNumberUserRegister.this.v1().dismiss();
            VerifyMobileNumberUserRegister verifyMobileNumberUserRegister = VerifyMobileNumberUserRegister.this;
            verifyMobileNumberUserRegister.H1(verifyMobileNumberUserRegister, verifyMobileNumberUserRegister.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"));
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public static final void D1(VerifyMobileNumberUserRegister this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.q1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.z1().setImageResource(R.drawable.pass_visible);
            this$0.q1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.z1().setImageResource(R.drawable.mvvm_visibility);
            this$0.q1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void E1(VerifyMobileNumberUserRegister this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(VerifyMobileNumberUserRegister this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().show();
        this$0.C1().k(this$0.u1());
    }

    public static final void G1(VerifyMobileNumberUserRegister this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.q1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.H1(this$0, this$0.y1().b("label_log_entr_otp", "Please enter the OTP"));
        } else if (string.length() < 6) {
            this$0.H1(this$0, this$0.y1().b("label_log_entr_otp", "Please enter the valid OTP"));
        } else {
            this$0.v1().show();
            this$0.C1().o(string, this$0.u1(), this$0.s1(), this$0.r1(), this$0.p1(), this$0.t1(), this$0.A1(), this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.StateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("StateCode");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.verify_user;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verify_user");
        return null;
    }

    public final vn7 C1() {
        vn7 vn7Var = this.viewModel;
        if (vn7Var != null) {
            return vn7Var;
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileNumberUserRegister.I1(dialog, view);
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

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email_text = str;
    }

    public final void N1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullname_text = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number_text = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mpin_text = str;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void S1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void T1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void U1(CreateAccountServices createAccountServices) {
        Intrinsics.checkNotNullParameter(createAccountServices, "<set-?>");
        this.retrofitService = createAccountServices;
    }

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void W1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.StateCode = str;
    }

    public final void Y1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verify_user = linearLayout;
    }

    public final void Z1(vn7 vn7Var) {
        Intrinsics.checkNotNullParameter(vn7Var, "<set-?>");
        this.viewModel = vn7Var;
    }

    public final ImageView n1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.disPlay;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("disPlay");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.zepto.ws6] */
    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        oh ohVarC = oh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ohVarC, "inflate(...)");
        this.binding = ohVarC;
        hz0.a.k(this);
        oh ohVar = this.binding;
        oh ohVar2 = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        setContentView(ohVar.b());
        ta3.a aVar = ta3.a;
        oh ohVar3 = this.binding;
        if (ohVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ohVar2 = ohVar3;
        }
        aVar.Z2(this, ohVar2);
        V1(new wa3(this));
        View viewFindViewById = findViewById(R.id.verify_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Y1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.default_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        K1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        N1((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        L1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        T1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        W1((ImageView) viewFindViewById6);
        U1(CreateAccountServices.INSTANCE.a(this));
        z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileNumberUserRegister.D1(this.a, view);
            }
        });
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        J1((ImageView) viewFindViewById7);
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileNumberUserRegister.E1(this.a, view);
            }
        });
        S1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ws6(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                O1(String.valueOf(intent.getStringExtra("FullName")));
                P1(String.valueOf(intent.getStringExtra("MobileNo")));
                Q1(String.valueOf(intent.getStringExtra("MPIN")));
                M1(String.valueOf(intent.getStringExtra("Email")));
                R1(String.valueOf(intent.getStringExtra("otpId")));
                X1(String.valueOf(intent.getStringExtra("StateCode")));
                String strS1 = s1();
                int length = strS1.length();
                String strReplace = "";
                for (int i = 0; i < length; i++) {
                    strS1.charAt(i);
                    strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(s1(), ""), "X");
                }
                o1().setText("+91 " + strReplace);
            } catch (Exception unused) {
            }
        }
        w1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileNumberUserRegister.F1(this.a, view);
            }
        });
        Z1((vn7) new z(this, new un7(new f11(x1()))).a(vn7.class));
        C1().l().g(this, new f(new a(objectRef, this)));
        C1().g().g(this, new f(new b()));
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyMobileNumberUserRegister.G1(this.a, view);
            }
        });
        C1().j().g(this, new f(new c()));
        C1().i().g(this, new f(new d()));
        C1().h().g(this, new f(new e()));
    }

    public final String p1() {
        String str = this.email_text;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email_text");
        return null;
    }

    public final EditText q1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final String r1() {
        String str = this.fullname_text;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullname_text");
        return null;
    }

    public final String s1() {
        String str = this.mobile_number_text;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number_text");
        return null;
    }

    public final String t1() {
        String str = this.mpin_text;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpin_text");
        return null;
    }

    public final String u1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
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

    public final TextView w1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final CreateAccountServices x1() {
        CreateAccountServices createAccountServices = this.retrofitService;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ImageView z1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }
}
