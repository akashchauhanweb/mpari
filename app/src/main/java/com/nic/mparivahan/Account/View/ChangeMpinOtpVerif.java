package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.ChangeMpinOtpVerif;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.R;
import com.zepto.af2;
import com.zepto.c26;
import com.zepto.gd1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw4;
import com.zepto.ta3;
import com.zepto.uy3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xr6;
import com.zepto.yr6;
import com.zepto.ze2;
import com.zepto.zr6;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b|\u0010}J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u001bR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010_\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010\u0017\u001a\u0004\b]\u0010\u0019\"\u0004\b^\u0010\u001bR\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006~"}, d2 = {"Lcom/nic/mparivahan/Account/View/ChangeMpinOtpVerif;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "L1", "title", "p1", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "E1", "()Landroid/widget/LinearLayout;", "b2", "(Landroid/widget/LinearLayout;)V", "submit", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "getDefault_otp", "()Landroid/widget/TextView;", "O1", "(Landroid/widget/TextView;)V", "default_otp", "Landroid/widget/EditText;", "E", "Landroid/widget/EditText;", "t1", "()Landroid/widget/EditText;", "Q1", "(Landroid/widget/EditText;)V", "enterOtp", "F", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "otpId", "G", "w1", "T1", "mobile_number", "H", "x1", "U1", "NewMpin", "Lcom/zepto/af2;", "I", "Lcom/zepto/af2;", "F1", "()Lcom/zepto/af2;", "c2", "(Lcom/zepto/af2;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "J", "Lcom/nic/mparivahan/Account/SignService;", "B1", "()Lcom/nic/mparivahan/Account/SignService;", "Y1", "(Lcom/nic/mparivahan/Account/SignService;)V", "retrofitService", "K", "getDisPlay", "P1", "disPlay", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "W1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "M", "Landroid/widget/ImageView;", "s1", "()Landroid/widget/ImageView;", "N1", "(Landroid/widget/ImageView;)V", "backButton", "N", "D1", "a2", "showmpin", "O", "A1", "X1", "resendOtp", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "Z1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/uy3;", "Q", "Lcom/zepto/uy3;", "binding", "Lcom/zepto/zr6;", "R", "Lcom/zepto/zr6;", "u1", "()Lcom/zepto/zr6;", "R1", "(Lcom/zepto/zr6;)V", "mUserBloodViewModel", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "S", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "v1", "()Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "S1", "(Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;)V", "mUserService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChangeMpinOtpVerif extends pq {

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
    public String NewMpin;

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

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public zr6 mUserBloodViewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public UserBloodDetails mUserService;

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            uy3 uy3Var = ChangeMpinOtpVerif.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = ChangeMpinOtpVerif.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(ChangeMpinOtpVerif.this.C1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = ChangeMpinOtpVerif.this.binding;
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
            uy3 uy3Var = ChangeMpinOtpVerif.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.f.setVisibility(0);
            uy3 uy3Var3 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.l.setText("0");
            uy3 uy3Var4 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uy3Var2 = uy3Var4;
            }
            uy3Var2.l.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            uy3 uy3Var = ChangeMpinOtpVerif.this.binding;
            uy3 uy3Var2 = null;
            if (uy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var = null;
            }
            uy3Var.l.setText(ChangeMpinOtpVerif.this.C1().b("time_remaining", "Time remaining") + ' ' + (j / ((long) 1000)));
            uy3 uy3Var3 = ChangeMpinOtpVerif.this.binding;
            if (uy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uy3Var3 = null;
            }
            uy3Var3.f.setVisibility(8);
            uy3 uy3Var4 = ChangeMpinOtpVerif.this.binding;
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
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ws6 ws6Var = new ws6(ChangeMpinOtpVerif.this);
                    String string = Settings.Secure.getString(ChangeMpinOtpVerif.this.getContentResolver(), "android_id");
                    pw4.a aVar = pw4.a;
                    long j = Long.parseLong(ws6Var.k().toString());
                    String strW1 = ChangeMpinOtpVerif.this.w1();
                    String strN = ws6Var.n();
                    String strH = ws6Var.h();
                    String strQ = ws6Var.q();
                    Intrinsics.checkNotNull(string);
                    String string2 = aVar.d(j, strW1, strN, strH, strQ, true, string, ws6Var.l(), ws6Var.e(), ChangeMpinOtpVerif.this.x1()).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    ChangeMpinOtpVerif.this.u1().v(string2, ChangeMpinOtpVerif.this);
                } else {
                    ChangeMpinOtpVerif.this.z1().dismiss();
                    ChangeMpinOtpVerif changeMpinOtpVerif = ChangeMpinOtpVerif.this;
                    changeMpinOtpVerif.L1(changeMpinOtpVerif, String.valueOf(otpVerifyResult.getStatusDesc()));
                }
            } catch (Exception unused) {
                ChangeMpinOtpVerif.this.z1().dismiss();
                ChangeMpinOtpVerif changeMpinOtpVerif2 = ChangeMpinOtpVerif.this;
                changeMpinOtpVerif2.L1(changeMpinOtpVerif2, changeMpinOtpVerif2.C1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            ChangeMpinOtpVerif.this.z1().dismiss();
            ChangeMpinOtpVerif changeMpinOtpVerif = ChangeMpinOtpVerif.this;
            changeMpinOtpVerif.L1(changeMpinOtpVerif, changeMpinOtpVerif.C1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
                    ChangeMpinOtpVerif.this.z1().dismiss();
                    ChangeMpinOtpVerif changeMpinOtpVerif = ChangeMpinOtpVerif.this;
                    changeMpinOtpVerif.L1(changeMpinOtpVerif, changeMpinOtpVerif.C1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!gd1.a.m(resendOtp.getStatusDesc())) {
                    ChangeMpinOtpVerif.this.z1().dismiss();
                    ChangeMpinOtpVerif changeMpinOtpVerif2 = ChangeMpinOtpVerif.this;
                    changeMpinOtpVerif2.L1(changeMpinOtpVerif2, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                ChangeMpinOtpVerif.this.z1().dismiss();
                ChangeMpinOtpVerif changeMpinOtpVerif3 = ChangeMpinOtpVerif.this;
                changeMpinOtpVerif3.L1(changeMpinOtpVerif3, changeMpinOtpVerif3.C1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            ChangeMpinOtpVerif.this.z1().dismiss();
            ChangeMpinOtpVerif changeMpinOtpVerif = ChangeMpinOtpVerif.this;
            changeMpinOtpVerif.L1(changeMpinOtpVerif, changeMpinOtpVerif.C1().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
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

    public static final void G1(ChangeMpinOtpVerif this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H1(ChangeMpinOtpVerif this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.t1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.D1().setImageResource(R.drawable.pass_visible);
            this$0.t1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.D1().setImageResource(R.drawable.mvvm_visibility);
            this$0.t1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void I1(ChangeMpinOtpVerif this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.new b().start();
        this$0.z1().show();
        this$0.F1().j(this$0.y1());
    }

    public static final void J1(ChangeMpinOtpVerif this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.t1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.L1(this$0, this$0.C1().b("label_log_entr_otp", "Please enter the OTP"));
        } else if (string.length() < 6) {
            this$0.L1(this$0, this$0.C1().b("label_log_entr_otp", "Please enter the valid OTP"));
        } else {
            this$0.z1().show();
            this$0.F1().m(string, this$0.y1(), this$0);
        }
    }

    public static final void K1(ChangeMpinOtpVerif this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        if (num == null || num.intValue() != 1) {
            this$0.z1().cancel();
            Toast.makeText(this$0.getApplicationContext(), this$0.C1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
        } else {
            new ws6(this$0).a(this$0.x1());
            String strB = this$0.C1().b("label_log_mpin_rest_succ", "MPIN reset successfully!");
            Intrinsics.checkNotNull(strB);
            this$0.p1(this$0, strB);
        }
    }

    public static final void M1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void q1(Dialog dialog, ChangeMpinOtpVerif this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public final TextView A1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final SignService B1() {
        SignService signService = this.retrofitService;
        if (signService != null) {
            return signService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wa3 C1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ImageView D1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.submit;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submit");
        return null;
    }

    public final af2 F1() {
        af2 af2Var = this.viewModel;
        if (af2Var != null) {
            return af2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void L1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ge0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.M1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void N1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void O1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.default_otp = textView;
    }

    public final void P1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void Q1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void R1(zr6 zr6Var) {
        Intrinsics.checkNotNullParameter(zr6Var, "<set-?>");
        this.mUserBloodViewModel = zr6Var;
    }

    public final void S1(UserBloodDetails userBloodDetails) {
        Intrinsics.checkNotNullParameter(userBloodDetails, "<set-?>");
        this.mUserService = userBloodDetails;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.NewMpin = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void W1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void X1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void Y1(SignService signService) {
        Intrinsics.checkNotNullParameter(signService, "<set-?>");
        this.retrofitService = signService;
    }

    public final void Z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void a2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void b2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.submit = linearLayout;
    }

    public final void c2(af2 af2Var) {
        Intrinsics.checkNotNullParameter(af2Var, "<set-?>");
        this.viewModel = af2Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uy3 uy3VarC = uy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(uy3VarC, "inflate(...)");
        this.binding = uy3VarC;
        uy3 uy3Var = null;
        if (uy3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uy3VarC = null;
        }
        setContentView(uy3VarC.b());
        ta3.a aVar = ta3.a;
        uy3 uy3Var2 = this.binding;
        if (uy3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uy3Var2 = null;
        }
        aVar.N0(this, uy3Var2);
        Z1(new wa3(this));
        Y1(SignService.INSTANCE.a(this));
        S1(UserBloodDetails.INSTANCE.a(this));
        R1((zr6) new z(this, new xr6(new yr6(v1()))).a(zr6.class));
        View viewFindViewById = findViewById(R.id.submit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        b2((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Q1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        P1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.default_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        O1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        a2((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        X1((TextView) viewFindViewById6);
        W1(new ProgressDialog(this));
        z1().setMessage(C1().b("label_challan_please_wait", "Please wait..."));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        N1((ImageView) viewFindViewById7);
        s1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.G1(this.a, view);
            }
        });
        D1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.be0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.H1(this.a, view);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            try {
                uy3 uy3Var3 = this.binding;
                if (uy3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    uy3Var3 = null;
                }
                uy3Var3.m.setText(intent.getStringExtra("title"));
                V1(String.valueOf(intent.getStringExtra("otpId")));
                T1(String.valueOf(intent.getStringExtra("MobileNumber")));
                U1(String.valueOf(intent.getStringExtra("NewMpin")));
                String strW1 = w1();
                int length = strW1.length();
                String strReplace = "";
                for (int i = 0; i < length; i++) {
                    strW1.charAt(i);
                    strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(w1(), ""), "X");
                }
                uy3 uy3Var4 = this.binding;
                if (uy3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uy3Var = uy3Var4;
                }
                uy3Var.q.setText(C1().b("label_otp_sent_to_mobile", "OTP has been sent to your registered mobile +91") + strReplace);
                new a().start();
            } catch (Exception unused) {
            }
        }
        A1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ce0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.I1(this.a, view);
            }
        });
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.de0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.J1(this.a, view);
            }
        });
        c2((af2) new z(this, new ze2(new c26(B1()))).a(af2.class));
        F1().k().g(this, new g(new c()));
        F1().g().g(this, new g(new d()));
        F1().i().g(this, new g(new e()));
        F1().h().g(this, new g(new f()));
        u1().n().g(this, new mf4() { // from class: com.zepto.ee0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeMpinOtpVerif.K1(this.a, (Integer) obj);
            }
        });
    }

    public final void p1(Context context, String title) {
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
        textView.setText(C1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinOtpVerif.q1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final ImageView s1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText t1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final zr6 u1() {
        zr6 zr6Var = this.mUserBloodViewModel;
        if (zr6Var != null) {
            return zr6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails v1() {
        UserBloodDetails userBloodDetails = this.mUserService;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserService");
        return null;
    }

    public final String w1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final String x1() {
        String str = this.NewMpin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("NewMpin");
        return null;
    }

    public final String y1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
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
