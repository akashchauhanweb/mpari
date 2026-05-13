package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import com.nic.mparivahan.Account.View.OtpVerificationforLoginScreen;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.RCDownloadService.SaveVirtualRCService;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.zepto.c26;
import com.zepto.fj4;
import com.zepto.gd1;
import com.zepto.gj4;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.oh;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
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
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\by\u0010zJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010t\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u00103\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006{"}, d2 = {"Lcom/nic/mparivahan/Account/View/OtpVerificationforLoginScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "D1", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "x1", "()Landroid/widget/LinearLayout;", "R1", "(Landroid/widget/LinearLayout;)V", "verify_user", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "getDefault_otp", "()Landroid/widget/TextView;", "H1", "(Landroid/widget/TextView;)V", "default_otp", "Landroid/widget/EditText;", "E", "Landroid/widget/EditText;", "p1", "()Landroid/widget/EditText;", "J1", "(Landroid/widget/EditText;)V", "enterOtp", "F", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "L1", "(Ljava/lang/String;)V", "otpId", "G", "r1", "K1", "mobile_number", "H", "u1", "N1", "resendOtp", "Lcom/zepto/gj4;", "I", "Lcom/zepto/gj4;", "y1", "()Lcom/zepto/gj4;", "S1", "(Lcom/zepto/gj4;)V", "viewModel", "J", "o1", "I1", "disPlay", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "L", "Landroid/widget/ImageView;", "n1", "()Landroid/widget/ImageView;", "F1", "(Landroid/widget/ImageView;)V", "backButton", "M", "w1", "P1", "showmpin", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "N", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "G1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "getUserSessionManager", "()Lcom/zepto/ws6;", "Q1", "(Lcom/zepto/ws6;)V", "userSessionManager", "Lcom/zepto/oh;", "P", "Lcom/zepto/oh;", "binding", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "session", "", "R", "q1", "()I", "setFlage", "(I)V", "flage", "Lcom/nic/mparivahan/Account/SignService;", "S", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class OtpVerificationforLoginScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout verify_user;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView default_otp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String otpId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public gj4 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public oh binding;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int flage;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public SignService retrofitService;

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
        public final void a(OtpVerifyResult otpVerifyResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    return;
                }
                OtpVerificationforLoginScreen.this.t1().dismiss();
                OtpVerificationforLoginScreen otpVerificationforLoginScreen = OtpVerificationforLoginScreen.this;
                otpVerificationforLoginScreen.D1(otpVerificationforLoginScreen, otpVerificationforLoginScreen.v1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
            } catch (Exception e) {
                e.printStackTrace();
                OtpVerificationforLoginScreen.this.t1().dismiss();
                OtpVerificationforLoginScreen otpVerificationforLoginScreen2 = OtpVerificationforLoginScreen.this;
                otpVerificationforLoginScreen2.D1(otpVerificationforLoginScreen2, otpVerificationforLoginScreen2.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
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

        public final void invoke(String str) {
            OtpVerificationforLoginScreen.this.t1().dismiss();
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
                    OtpVerificationforLoginScreen.this.t1().dismiss();
                    OtpVerificationforLoginScreen otpVerificationforLoginScreen = OtpVerificationforLoginScreen.this;
                    otpVerificationforLoginScreen.D1(otpVerificationforLoginScreen, otpVerificationforLoginScreen.v1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (!StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    OtpVerificationforLoginScreen.this.t1().dismiss();
                    OtpVerificationforLoginScreen otpVerificationforLoginScreen2 = OtpVerificationforLoginScreen.this;
                    otpVerificationforLoginScreen2.D1(otpVerificationforLoginScreen2, otpVerificationforLoginScreen2.v1().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                }
            } catch (Exception unused) {
                OtpVerificationforLoginScreen.this.t1().dismiss();
                OtpVerificationforLoginScreen otpVerificationforLoginScreen3 = OtpVerificationforLoginScreen.this;
                otpVerificationforLoginScreen3.D1(otpVerificationforLoginScreen3, otpVerificationforLoginScreen3.v1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time"));
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

        public final void a(GetVirtualDocDetails getVirtualDocDetails) {
            if (StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
                OtpVerificationforLoginScreen.this.t1().dismiss();
                Toast.makeText(OtpVerificationforLoginScreen.this.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
                if (OtpVerificationforLoginScreen.this.getFlage() == 1) {
                    OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                    OtpVerificationforLoginScreen.this.finish();
                    return;
                } else {
                    OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) DashBoard.class));
                    OtpVerificationforLoginScreen.this.finishAffinity();
                    return;
                }
            }
            if (!StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                OtpVerificationforLoginScreen.this.t1().dismiss();
                Toast.makeText(OtpVerificationforLoginScreen.this.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
                if (OtpVerificationforLoginScreen.this.getFlage() == 1) {
                    OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                    OtpVerificationforLoginScreen.this.finish();
                    return;
                } else {
                    OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) DashBoard.class));
                    OtpVerificationforLoginScreen.this.finishAffinity();
                    return;
                }
            }
            getVirtualDocDetails.getMparCitizenDocInfo();
            SaveVirtualRCService.Companion aVar = SaveVirtualRCService.INSTANCE;
            OtpVerificationforLoginScreen otpVerificationforLoginScreen = OtpVerificationforLoginScreen.this;
            Intrinsics.checkNotNull(getVirtualDocDetails);
            aVar.a(otpVerificationforLoginScreen, getVirtualDocDetails);
            OtpVerificationforLoginScreen.this.t1().dismiss();
            Toast.makeText(OtpVerificationforLoginScreen.this.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
            if (OtpVerificationforLoginScreen.this.getFlage() == 1) {
                OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                OtpVerificationforLoginScreen.this.finish();
            } else {
                OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) DashBoard.class));
                OtpVerificationforLoginScreen.this.finishAffinity();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetVirtualDocDetails) obj);
            return Unit.INSTANCE;
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

        public final void invoke(String str) {
            OtpVerificationforLoginScreen.this.t1().cancel();
            Toast.makeText(OtpVerificationforLoginScreen.this.getApplicationContext(), "User Successfully Logged into mParivahan", 1).show();
            if (OtpVerificationforLoginScreen.this.getFlage() == 1) {
                OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                OtpVerificationforLoginScreen.this.finish();
            } else {
                OtpVerificationforLoginScreen.this.startActivity(new Intent(OtpVerificationforLoginScreen.this, (Class<?>) DashBoard.class));
                OtpVerificationforLoginScreen.this.finishAffinity();
            }
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

    public static final void A1(OtpVerificationforLoginScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.w1().setImageResource(R.drawable.pass_visible);
            this$0.p1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.w1().setImageResource(R.drawable.mvvm_visibility);
            this$0.p1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void B1(OtpVerificationforLoginScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().show();
        this$0.y1().n(this$0.s1());
    }

    public static final void C1(OtpVerificationforLoginScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gd1.a.l(this$0);
        String string = this$0.p1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.D1(this$0, this$0.v1().b("label_log_entr_otp", "Please enter the OTP"));
        } else if (string.length() < 6) {
            this$0.D1(this$0, this$0.v1().b("enter_valid_otp", "Please enter the valid OTP"));
        } else {
            this$0.t1().show();
            this$0.y1().t(string, this$0.s1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void z1(OtpVerificationforLoginScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void D1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(v1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ej4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerificationforLoginScreen.E1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void F1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void G1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
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

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void P1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void Q1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void R1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verify_user = linearLayout;
    }

    public final void S1(gj4 gj4Var) {
        Intrinsics.checkNotNullParameter(gj4Var, "<set-?>");
        this.viewModel = gj4Var;
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

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        oh ohVarC = oh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ohVarC, "inflate(...)");
        this.binding = ohVarC;
        hz0.a aVar = hz0.a;
        aVar.k(this);
        oh ohVar = this.binding;
        SignService signService = null;
        if (ohVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar = null;
        }
        setContentView(ohVar.b());
        com.nic.mparivahan.Welcome.a.a.a(this);
        ta3.a aVar2 = ta3.a;
        oh ohVar2 = this.binding;
        if (ohVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ohVar2 = null;
        }
        aVar2.C1(this, ohVar2);
        O1(new wa3(this));
        this.retrofitService = SignService.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.verify_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        R1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.default_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        H1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        J1((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        I1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        N1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        P1((ImageView) viewFindViewById6);
        M1(new ProgressDialog(this));
        t1().setMessage(v1().b("label_challan_please_wait", "Please wait..."));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        Q1(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        G1(databaseHelperD0);
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        F1((ImageView) viewFindViewById7);
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerificationforLoginScreen.z1(this.a, view);
            }
        });
        w1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerificationforLoginScreen.A1(this.a, view);
            }
        });
        new ws6(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.flage = intent.getIntExtra(aVar.u(), 0);
                L1(String.valueOf(intent.getStringExtra("otpId")));
                K1(String.valueOf(intent.getStringExtra("MobileNumber")));
                String strR1 = r1();
                int length = strR1.length();
                String strReplace = "";
                for (int i = 0; i < length; i++) {
                    strR1.charAt(i);
                    strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(r1(), ""), "X");
                }
                o1().setText("+91 " + strReplace);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        u1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerificationforLoginScreen.B1(this.a, view);
            }
        });
        SignService signService2 = this.retrofitService;
        if (signService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            signService = signService2;
        }
        S1((gj4) new z(this, new fj4(new c26(signService))).a(gj4.class));
        y1().o().g(this, new f(new a()));
        y1().i().g(this, new f(new b()));
        y1().m().g(this, new f(new c()));
        y1().j().g(this, new f(new d()));
        y1().k().g(this, new f(new e()));
        x1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpVerificationforLoginScreen.C1(this.a, view);
            }
        });
    }

    public final EditText p1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getFlage() {
        return this.flage;
    }

    public final String r1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final String s1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final TextView u1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
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

    public final ImageView w1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final LinearLayout x1() {
        LinearLayout linearLayout = this.verify_user;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verify_user");
        return null;
    }

    public final gj4 y1() {
        gj4 gj4Var = this.viewModel;
        if (gj4Var != null) {
            return gj4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
