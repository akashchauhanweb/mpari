package com.nic.mparivahan.VahanServices.VahanView;

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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanOtpVerificationScreen;
import com.zepto.bg7;
import com.zepto.kk7;
import com.zepto.lk7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ws6;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u000e\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH\u0007J:\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00102\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\"\u0010:\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010\u0016\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010\u0016\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010\u001aR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010\u0016\u001a\u0005\b\u0080\u0001\u0010\u0018\"\u0005\b\u0081\u0001\u0010\u001aR&\u0010\u0086\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010\u0016\u001a\u0005\b\u0084\u0001\u0010\u0018\"\u0005\b\u0085\u0001\u0010\u001aR&\u0010\u008a\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010\u0016\u001a\u0005\b\u0088\u0001\u0010\u0018\"\u0005\b\u0089\u0001\u0010\u001aR&\u0010\u008e\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010\u0016\u001a\u0005\b\u008c\u0001\u0010\u0018\"\u0005\b\u008d\u0001\u0010\u001aRD\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010 \u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\u001d\u001a\u0005\b\u009e\u0001\u0010\u001f\"\u0005\b\u009f\u0001\u0010!¨\u0006£\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanOtpVerificationScreen;", "Lcom/zepto/pq;", "", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "P1", "Ljava/util/HashMap;", "serviceSelection_HashMap", "p1", "rc_number", "Lkotlin/collections/HashMap;", "", "isFaceless", "R1", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "G1", "()Landroid/widget/TextView;", "m2", "(Landroid/widget/TextView;)V", "verify_user", "D", "Ljava/lang/String;", "getParam", "()Ljava/lang/String;", "b2", "(Ljava/lang/String;)V", "param", "E", "w1", "c2", "RC", "Landroid/widget/EditText;", "F", "Landroid/widget/EditText;", "r1", "()Landroid/widget/EditText;", "V1", "(Landroid/widget/EditText;)V", "enterOtp", "G", "u1", "Z1", "otpId", "H", "getMobile_number", "W1", "mobile_number", "I", "y1", "e2", "resendOtp", "Lcom/zepto/lk7;", "J", "Lcom/zepto/lk7;", "H1", "()Lcom/zepto/lk7;", "n2", "(Lcom/zepto/lk7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "K", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "f2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "L", "getDisPlay", "U1", "disPlay", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "a2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroidx/appcompat/widget/AppCompatImageView;", "N", "Landroidx/appcompat/widget/AppCompatImageView;", "q1", "()Landroidx/appcompat/widget/AppCompatImageView;", "S1", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "backButton", "Landroid/widget/RelativeLayout;", "O", "Landroid/widget/RelativeLayout;", "s1", "()Landroid/widget/RelativeLayout;", "X1", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/widget/ImageView;", "P", "Landroid/widget/ImageView;", "C1", "()Landroid/widget/ImageView;", "h2", "(Landroid/widget/ImageView;)V", "showmpin", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "Q", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "T1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "R", "Lcom/zepto/ws6;", "getUserSessionManager", "()Lcom/zepto/ws6;", "l2", "(Lcom/zepto/ws6;)V", "userSessionManager", "S", "F1", "k2", "txt_vehicle_number", "T", "E1", "j2", "txt_reset", "U", "D1", "i2", "time_text", "V", "A1", "g2", "selectedServiceTv", "W", "Ljava/util/HashMap;", "B1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "X", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Y", "t1", "Y1", "off_code", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanOtpVerificationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView verify_user;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String param;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String RC;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String otpId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public lk7 viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public AppCompatImageView backButton;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public TextView txt_vehicle_number;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView time_text;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public TextView selectedServiceTv;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String off_code;

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanOtpVerificationScreen.this.y1().setVisibility(0);
            VahanOtpVerificationScreen.this.D1().setText("0");
            VahanOtpVerificationScreen.this.D1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanOtpVerificationScreen.this.D1().setText("Time remaining : " + (j / ((long) 1000)));
            VahanOtpVerificationScreen.this.y1().setVisibility(8);
            VahanOtpVerificationScreen.this.D1().setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {
        public b() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanOtpVerificationScreen.this.y1().setVisibility(0);
            VahanOtpVerificationScreen.this.D1().setText("0");
            VahanOtpVerificationScreen.this.D1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanOtpVerificationScreen.this.D1().setText("Time remaining : " + (j / ((long) 1000)));
            VahanOtpVerificationScreen.this.y1().setVisibility(8);
            VahanOtpVerificationScreen.this.D1().setVisibility(0);
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
                    VahanOtpVerificationScreen vahanOtpVerificationScreen = VahanOtpVerificationScreen.this;
                    vahanOtpVerificationScreen.R1(vahanOtpVerificationScreen.w1(), VahanOtpVerificationScreen.this.getServiceSelection_HashMap(), false);
                } else {
                    VahanOtpVerificationScreen.this.v1().dismiss();
                    VahanOtpVerificationScreen vahanOtpVerificationScreen2 = VahanOtpVerificationScreen.this;
                    vahanOtpVerificationScreen2.P1(vahanOtpVerificationScreen2, otpVerifyResult.getStatusDesc());
                }
            } catch (Exception unused) {
                VahanOtpVerificationScreen.this.v1().dismiss();
                VahanOtpVerificationScreen vahanOtpVerificationScreen3 = VahanOtpVerificationScreen.this;
                vahanOtpVerificationScreen3.P1(vahanOtpVerificationScreen3, "Unable to Verify the OTP, Please try after some time");
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

        public final void invoke(String str) {
            VahanOtpVerificationScreen.this.v1().dismiss();
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
                    VahanOtpVerificationScreen.this.v1().dismiss();
                    VahanOtpVerificationScreen vahanOtpVerificationScreen = VahanOtpVerificationScreen.this;
                    vahanOtpVerificationScreen.P1(vahanOtpVerificationScreen, "We have resent the OTP to your Mobile Number");
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    VahanOtpVerificationScreen vahanOtpVerificationScreen2 = VahanOtpVerificationScreen.this;
                    vahanOtpVerificationScreen2.P1(vahanOtpVerificationScreen2, resendOtp.getStatusDesc());
                } else {
                    VahanOtpVerificationScreen.this.v1().dismiss();
                    VahanOtpVerificationScreen vahanOtpVerificationScreen3 = VahanOtpVerificationScreen.this;
                    vahanOtpVerificationScreen3.P1(vahanOtpVerificationScreen3, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                VahanOtpVerificationScreen.this.v1().dismiss();
                VahanOtpVerificationScreen vahanOtpVerificationScreen4 = VahanOtpVerificationScreen.this;
                vahanOtpVerificationScreen4.P1(vahanOtpVerificationScreen4, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
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

    public static final void I1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void J1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1();
    }

    public static final void K1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.r1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.C1().setImageResource(R.drawable.pass_visible);
            this$0.r1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.C1().setImageResource(R.drawable.mvvm_visibility);
            this$0.r1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void L1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().show();
        this$0.new b().start();
        this$0.H1().j(this$0, this$0.u1());
    }

    public static final void M1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().setText("");
    }

    public static final void N1(VahanOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.r1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.P1(this$0, "Please enter the OTP");
        } else if (string.length() < 6) {
            this$0.P1(this$0, "Please enter the valid OTP");
        } else {
            this$0.v1().show();
            this$0.H1().l(this$0, string, this$0.u1());
        }
    }

    private final void O1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final TextView A1() {
        TextView textView = this.selectedServiceTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedServiceTv");
        return null;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final ImageView C1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.time_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final TextView E1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.txt_vehicle_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_vehicle_number");
        return null;
    }

    public final TextView G1() {
        TextView textView = this.verify_user;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verify_user");
        return null;
    }

    public final lk7 H1() {
        lk7 lk7Var = this.viewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void P1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.Q1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void R1(String rc_number, HashMap serviceSelection_HashMap, boolean isFaceless) {
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, (Class<?>) VahanDuplicateRcActivity.class);
            intent.putExtra("RC", rc_number);
            intent.putExtra("RcDetails", x1());
            intent.putExtra("map", serviceSelection_HashMap);
            intent.putExtra("off_code", t1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, (Class<?>) TransferOwnerShipActivity.class);
            intent2.putExtra("RC", rc_number);
            intent2.putExtra("RcDetails", x1());
            intent2.putExtra("map", serviceSelection_HashMap);
            intent2.putExtra("off_code", t1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent2);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, (Class<?>) VahanChangeOfAddress.class);
            intent3.putExtra("RC", rc_number);
            intent3.putExtra("RcDetails", x1());
            intent3.putExtra("map", serviceSelection_HashMap);
            intent3.putExtra("off_code", t1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent3.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent3.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent3);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, (Class<?>) HypothecationTerminationActivity.class);
            intent4.putExtra("RC", rc_number);
            intent4.putExtra("RcDetails", x1());
            intent4.putExtra("map", serviceSelection_HashMap);
            intent4.putExtra("off_code", t1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent4.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent4.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent4);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent5 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent5.putExtra("RC", rc_number);
            intent5.putExtra("RcDetails", x1());
            intent5.putExtra("map", serviceSelection_HashMap);
            intent5.putExtra("off_code", t1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent5.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent5.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent5);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, (Class<?>) HypothecationAdditionActivity.class);
            intent6.putExtra("RC", rc_number);
            intent6.putExtra("RcDetails", x1());
            intent6.putExtra("map", serviceSelection_HashMap);
            intent6.putExtra("off_code", t1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent6.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent6.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent6);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, (Class<?>) VahanDetailsForRcParticulara.class);
            intent7.putExtra("RcDetails", x1());
            intent7.putExtra("RC", rc_number);
            intent7.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent7.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent7.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent7);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, (Class<?>) VahanNocActivity.class);
            intent8.putExtra("RC", rc_number);
            intent8.putExtra("RcDetails", x1());
            intent8.putExtra("map", serviceSelection_HashMap);
            intent8.putExtra("off_code", t1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent8.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent8.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent8);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent9 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent9.putExtra("RC", rc_number);
            intent9.putExtra("RcDetails", x1());
            intent9.putExtra("map", serviceSelection_HashMap);
            intent9.putExtra("off_code", t1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent9.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent9.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent9);
            finish();
        }
    }

    public final void S1(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.backButton = appCompatImageView;
    }

    public final void T1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void U1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void V1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void X1(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void a2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.RC = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void e2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void f2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final void g2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.selectedServiceTv = textView;
    }

    public final void h2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void i2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.time_text = textView;
    }

    public final void j2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final void k2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_vehicle_number = textView;
    }

    public final void l2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void m2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.verify_user = textView;
    }

    public final void n2(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.viewModel = lk7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_verify_otp_screen);
        View viewFindViewById = findViewById(R.id.verify_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m2((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        V1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        U1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        e2((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        h2((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        j2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        i2((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        g2((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        k2((TextView) viewFindViewById9);
        f2(VahanServiceConnection.INSTANCE.a(this));
        a2(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        l2(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        T1(databaseHelperD0);
        View viewFindViewById10 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        S1((AppCompatImageView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        X1((RelativeLayout) viewFindViewById11);
        q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.I1(this.a, view);
            }
        });
        s1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.J1(this.a, view);
            }
        });
        new a().start();
        C1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.K1(this.a, view);
            }
        });
        new ws6(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                c2(String.valueOf(intent.getStringExtra("RC")));
                b2(String.valueOf(intent.getStringExtra("Param")));
                Z1(String.valueOf(intent.getStringExtra("otpId")));
                W1(String.valueOf(intent.getStringExtra("MobileNumber")));
                Y1(String.valueOf(intent.getStringExtra("off_code")));
                HashMap map = (HashMap) intent.getSerializableExtra("map");
                Intrinsics.checkNotNull(map);
                this.serviceSelection_HashMap = map;
                Serializable serializableExtra = intent.getSerializableExtra("RcDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                d2((NrvDetails) serializableExtra);
                F1().setText(w1().toString());
                p1(this.serviceSelection_HashMap);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ob7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.L1(this.a, view);
            }
        });
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.M1(this.a, view);
            }
        });
        n2((lk7) new z(this, new kk7(new bg7(z1()))).a(lk7.class));
        H1().k().g(this, new f(new c()));
        H1().g().g(this, new f(new d()));
        H1().i().g(this, new f(new e()));
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanOtpVerificationScreen.N1(this.a, view);
            }
        });
    }

    public final void p1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            A1().setText("Issue of Duplicate RC");
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            A1().setText("Transfer of Ownership");
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            A1().setText("Change of Address In RC");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            A1().setText("Hypothecation Termination");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            A1().setText("Hypothecation Continuation");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            A1().setText("Hypothecation Addition");
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            A1().setText("RC Particular of Vehicle");
        }
    }

    public final AppCompatImageView q1() {
        AppCompatImageView appCompatImageView = this.backButton;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText r1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final RelativeLayout s1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final String t1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final String w1() {
        String str = this.RC;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("RC");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TextView y1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final VahanServiceConnection z1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
