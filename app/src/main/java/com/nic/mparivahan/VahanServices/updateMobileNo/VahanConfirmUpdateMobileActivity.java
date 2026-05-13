package com.nic.mparivahan.VahanServices.updateMobileNo;

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
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanConfirmUpdateMobileActivity;
import com.zepto.al7;
import com.zepto.ar6;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.eh;
import com.zepto.kk7;
import com.zepto.lk7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xq6;
import com.zepto.yq6;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b|\u0010}J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010Z\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006~"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/VahanConfirmUpdateMobileActivity;", "Lcom/zepto/pq;", "", "F1", "Z1", "N1", "", "mobile_no", "D1", "C1", "", "n2", "o2", "m2", "it", "", "showHomePage", "j2", "V1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "p2", "message", "W1", "Lcom/zepto/eh;", "C", "Lcom/zepto/eh;", "binding", "D", "Z", "isAadharEnable", "E", "Ljava/lang/String;", "regNo", "F", "stateCd", "G", "stateName", "H", "ownerName", "I", "mobileNo", "J", "aadharNo", "K", "emailId", "L", "getOtpId", "()Ljava/lang/String;", "b2", "(Ljava/lang/String;)V", "otpId", "M", "getRcNo", "c2", "rcNo", "Lcom/zepto/ar6;", "N", "Lcom/zepto/ar6;", "L1", "()Lcom/zepto/ar6;", "h2", "(Lcom/zepto/ar6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileNoService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "P", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/lk7;", "Q", "Lcom/zepto/lk7;", "K1", "()Lcom/zepto/lk7;", "g2", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "R", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "f2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "verifyOtpRetrofitService", "Lcom/zepto/al7;", "S", "Lcom/zepto/al7;", "M1", "()Lcom/zepto/al7;", "i2", "(Lcom/zepto/al7;)V", "viewModel1", "T", "I1", "e2", "retrofitService1", "Landroid/app/Dialog;", "U", "Landroid/app/Dialog;", "E1", "()Landroid/app/Dialog;", "Y1", "(Landroid/app/Dialog;)V", "d", "Lcom/zepto/wa3;", "V", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanConfirmUpdateMobileActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isAadharEnable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String regNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateName = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadharNo = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String emailId = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ar6 viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public UpdateMobileNoService retrofitService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public lk7 verifyOtpViewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public VahanServiceConnection verifyOtpRetrofitService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public al7 viewModel1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = VahanConfirmUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanConfirmUpdateMobileActivity.this.j2(str, 0);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(Boolean bool) {
            ProgressDialog progressDialog = VahanConfirmUpdateMobileActivity.this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                eh ehVar2 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar2 = null;
                }
                ehVar2.f.setFocusable(0);
                eh ehVar3 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar3 = null;
                }
                ehVar3.m.setFocusable(0);
                eh ehVar4 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar4 = null;
                }
                ehVar4.b.setFocusable(0);
                eh ehVar5 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar5 = null;
                }
                ehVar5.h.setVisibility(8);
                eh ehVar6 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar6 = null;
                }
                ehVar6.g.setVisibility(8);
                eh ehVar7 = VahanConfirmUpdateMobileActivity.this.binding;
                if (ehVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar7;
                }
                ehVar.o.setVisibility(0);
                VahanConfirmUpdateMobileActivity.this.C1();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
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
            ProgressDialog progressDialog = VahanConfirmUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanConfirmUpdateMobileActivity.this.j2(str, 0);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
                ProgressDialog progressDialog = VahanConfirmUpdateMobileActivity.this.dialog;
                eh ehVar = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity = VahanConfirmUpdateMobileActivity.this;
                    eh ehVar2 = vahanConfirmUpdateMobileActivity.binding;
                    if (ehVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        ehVar = ehVar2;
                    }
                    vahanConfirmUpdateMobileActivity.p2(vahanConfirmUpdateMobileActivity, String.valueOf(ehVar.g.getText()));
                    VahanConfirmUpdateMobileActivity.this.b2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = VahanConfirmUpdateMobileActivity.this;
                    vahanConfirmUpdateMobileActivity2.c2(vahanConfirmUpdateMobileActivity2.regNo);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true)) {
                    Toast.makeText(VahanConfirmUpdateMobileActivity.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(VahanConfirmUpdateMobileActivity.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(VahanConfirmUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(VahanConfirmUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanConfirmUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
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
        public final void a(OtpVerifyResult otpVerifyResult) {
            ProgressDialog progressDialog = null;
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ProgressDialog progressDialog2 = VahanConfirmUpdateMobileActivity.this.dialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog2 = null;
                    }
                    if (progressDialog2.isShowing()) {
                        ProgressDialog progressDialog3 = VahanConfirmUpdateMobileActivity.this.dialog;
                        if (progressDialog3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            progressDialog3 = null;
                        }
                        progressDialog3.dismiss();
                    }
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity = VahanConfirmUpdateMobileActivity.this;
                    vahanConfirmUpdateMobileActivity.W1(vahanConfirmUpdateMobileActivity, otpVerifyResult.getStatusDesc());
                    return;
                }
                ProgressDialog progressDialog4 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = VahanConfirmUpdateMobileActivity.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog5 = null;
                    }
                    progressDialog5.dismiss();
                }
                if (VahanConfirmUpdateMobileActivity.this.E1().isShowing()) {
                    VahanConfirmUpdateMobileActivity.this.E1().dismiss();
                }
                VahanConfirmUpdateMobileActivity.this.C1();
            } catch (Exception unused) {
                ProgressDialog progressDialog6 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog6 = null;
                }
                if (progressDialog6.isShowing()) {
                    ProgressDialog progressDialog7 = VahanConfirmUpdateMobileActivity.this.dialog;
                    if (progressDialog7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog7;
                    }
                    progressDialog.dismiss();
                }
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = VahanConfirmUpdateMobileActivity.this;
                vahanConfirmUpdateMobileActivity2.W1(vahanConfirmUpdateMobileActivity2, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
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
            ProgressDialog progressDialog = null;
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    ProgressDialog progressDialog2 = VahanConfirmUpdateMobileActivity.this.dialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity = VahanConfirmUpdateMobileActivity.this;
                    vahanConfirmUpdateMobileActivity.W1(vahanConfirmUpdateMobileActivity, "We have resent the OTP to your Mobile Number");
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity2 = VahanConfirmUpdateMobileActivity.this;
                    vahanConfirmUpdateMobileActivity2.W1(vahanConfirmUpdateMobileActivity2, resendOtp.getStatusDesc());
                    return;
                }
                ProgressDialog progressDialog3 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity3 = VahanConfirmUpdateMobileActivity.this;
                vahanConfirmUpdateMobileActivity3.W1(vahanConfirmUpdateMobileActivity3, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog progressDialog4 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog4;
                }
                progressDialog.dismiss();
                VahanConfirmUpdateMobileActivity vahanConfirmUpdateMobileActivity4 = VahanConfirmUpdateMobileActivity.this;
                vahanConfirmUpdateMobileActivity4.W1(vahanConfirmUpdateMobileActivity4, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = VahanConfirmUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanConfirmUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanConfirmUpdateMobileActivity.this.j2(str, 1);
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final class i extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            JSONObject jSONObject = new JSONObject();
            new JSONObject();
            jSONObject.put("emailid", this.emailId);
            if (this.isAadharEnable) {
                eh ehVar2 = this.binding;
                if (ehVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar2;
                }
                jSONObject.put("mobile", String.valueOf(ehVar.f.getText()));
            } else {
                eh ehVar3 = this.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar3;
                }
                jSONObject.put("mobile", String.valueOf(ehVar.g.getText()));
            }
            jSONObject.put("regn_no", this.regNo);
            jSONObject.put("state_cd", this.stateCd);
            L1().n(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void F1() {
        if (getIntent() != null) {
            this.isAadharEnable = getIntent().getBooleanExtra("isAadharEnable", false);
            if (getIntent().hasExtra("regNo")) {
                String stringExtra = getIntent().getStringExtra("regNo");
                Intrinsics.checkNotNull(stringExtra);
                this.regNo = stringExtra;
                eh ehVar = this.binding;
                if (ehVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar = null;
                }
                ehVar.t.setText(G1().b("vehicle_no", "Vehicle No.:") + ' ' + this.regNo);
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra2 = getIntent().getStringExtra("stateCd");
                Intrinsics.checkNotNull(stringExtra2);
                this.stateCd = stringExtra2;
            }
            if (getIntent().hasExtra("stateName")) {
                String stringExtra3 = getIntent().getStringExtra("stateName");
                Intrinsics.checkNotNull(stringExtra3);
                this.stateName = stringExtra3;
            }
            if (getIntent().hasExtra("ownerName")) {
                String stringExtra4 = getIntent().getStringExtra("ownerName");
                Intrinsics.checkNotNull(stringExtra4);
                this.ownerName = stringExtra4;
            }
            if (getIntent().hasExtra("mobileNo")) {
                String stringExtra5 = getIntent().getStringExtra("mobileNo");
                Intrinsics.checkNotNull(stringExtra5);
                this.mobileNo = stringExtra5;
            }
            if (getIntent().hasExtra("aadharNo")) {
                String stringExtra6 = getIntent().getStringExtra("aadharNo");
                Intrinsics.checkNotNull(stringExtra6);
                this.aadharNo = stringExtra6;
            }
            if (getIntent().hasExtra("emailId")) {
                String stringExtra7 = getIntent().getStringExtra("emailId");
                Intrinsics.checkNotNull(stringExtra7);
                this.emailId = stringExtra7;
            }
            Z1();
        }
    }

    private final void N1() {
        M1().i().g(this, new h(new d()));
        K1().k().g(this, new h(new e()));
        K1().i().g(this, new h(new f()));
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        ehVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.O1(this.a, view);
            }
        });
        h2((ar6) new z(this, new yq6(new xq6(H1()))).a(ar6.class));
        eh ehVar3 = this.binding;
        if (ehVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar3 = null;
        }
        ehVar3.q.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.Q1(this.a, view);
            }
        });
        eh ehVar4 = this.binding;
        if (ehVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar4 = null;
        }
        ehVar4.q.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.R1(this.a, view);
            }
        });
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        ehVar5.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.S1(this.a, view);
            }
        });
        eh ehVar6 = this.binding;
        if (ehVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar6 = null;
        }
        ehVar6.c.setVisibility(8);
        eh ehVar7 = this.binding;
        if (ehVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar7 = null;
        }
        ehVar7.b.setVisibility(8);
        if (this.isAadharEnable) {
            eh ehVar8 = this.binding;
            if (ehVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar8 = null;
            }
            ehVar8.c.setVisibility(0);
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar9 = null;
            }
            ehVar9.b.setVisibility(0);
            eh ehVar10 = this.binding;
            if (ehVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar10 = null;
            }
            ehVar10.h.setVisibility(8);
            eh ehVar11 = this.binding;
            if (ehVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar11 = null;
            }
            ehVar11.g.setVisibility(8);
            eh ehVar12 = this.binding;
            if (ehVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar12 = null;
            }
            ehVar12.o.setVisibility(0);
            eh ehVar13 = this.binding;
            if (ehVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar13 = null;
            }
            ehVar13.j.setVisibility(8);
            eh ehVar14 = this.binding;
            if (ehVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar14 = null;
            }
            ehVar14.i.setVisibility(8);
            eh ehVar15 = this.binding;
            if (ehVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar15 = null;
            }
            ehVar15.s.setText("Validate with Aadhaar");
        } else {
            eh ehVar16 = this.binding;
            if (ehVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar16 = null;
            }
            ehVar16.f.setFocusable(0);
            eh ehVar17 = this.binding;
            if (ehVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar17 = null;
            }
            ehVar17.m.setFocusable(0);
            eh ehVar18 = this.binding;
            if (ehVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar18 = null;
            }
            ehVar18.c.setVisibility(8);
            eh ehVar19 = this.binding;
            if (ehVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar19 = null;
            }
            ehVar19.b.setVisibility(8);
            eh ehVar20 = this.binding;
            if (ehVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar20 = null;
            }
            ehVar20.h.setVisibility(0);
            eh ehVar21 = this.binding;
            if (ehVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar21 = null;
            }
            ehVar21.g.setVisibility(0);
            eh ehVar22 = this.binding;
            if (ehVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar22 = null;
            }
            ehVar22.o.setVisibility(0);
            eh ehVar23 = this.binding;
            if (ehVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar23 = null;
            }
            ehVar23.k.setText("Owner Name (As per Vahan)");
            eh ehVar24 = this.binding;
            if (ehVar24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar24 = null;
            }
            ehVar24.k.setText(G1().b("label_dl_ownername_as_aadhaar", "Owner Name (As per Vahan)"));
            eh ehVar25 = this.binding;
            if (ehVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar25 = null;
            }
            ehVar25.l.setText(G1().b("lbl_owner_Mobile_no_as_per_Aadhaar", "Existing Mobile No (As per Vahan)"));
            eh ehVar26 = this.binding;
            if (ehVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar26 = null;
            }
            ehVar26.j.setVisibility(0);
            eh ehVar27 = this.binding;
            if (ehVar27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar27 = null;
            }
            ehVar27.i.setVisibility(0);
            eh ehVar28 = this.binding;
            if (ehVar28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar28 = null;
            }
            ehVar28.s.setText("Update Mobile No.");
        }
        eh ehVar29 = this.binding;
        if (ehVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar29 = null;
        }
        ehVar29.s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.T1(this.a, view);
            }
        });
        L1().j().g(this, new h(new g()));
        L1().i().g(this, new h(new a()));
        L1().m().g(this, new h(new b()));
        L1().l().g(this, new h(new c()));
        eh ehVar30 = this.binding;
        if (ehVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar30;
        }
        ehVar2.o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.U1(this.a, view);
            }
        });
    }

    public static final void O1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.G1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanConfirmUpdateMobileActivity.P1(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void P1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void Q1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void R1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V1();
    }

    public static final void S1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void T1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eh ehVar = this$0.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (Intrinsics.areEqual(ehVar.s.getText().toString(), "Validate with Aadhaar")) {
            if (this$0.m2()) {
                eh ehVar3 = this$0.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar2 = ehVar3;
                }
                String strValueOf = String.valueOf(ehVar2.f.getText());
                this$0.mobileNo = strValueOf;
                this$0.D1(strValueOf);
                return;
            }
            return;
        }
        if (this$0.isAadharEnable) {
            if (this$0.o2()) {
                this$0.C1();
            }
        } else if (this$0.n2()) {
            ProgressDialog progressDialog = this$0.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ws6 ws6Var = new ws6(this$0);
            eh ehVar4 = this$0.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            this$0.M1().m(this$0, String.valueOf(ehVar2.g.getText()), ws6Var.k());
        }
    }

    public static final void U1(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eh ehVar = this$0.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        CheckBox checkBox = ehVar.p;
        eh ehVar3 = this$0.binding;
        if (ehVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar3;
        }
        checkBox.setChecked(!ehVar2.p.isChecked());
    }

    private final void V1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void Z1() {
        if (!this.isAadharEnable) {
            eh ehVar = this.binding;
            eh ehVar2 = null;
            if (ehVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar = null;
            }
            ehVar.m.setText(this.ownerName);
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar3;
            }
            ehVar2.f.setText(this.mobileNo);
        }
        new wa3(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(String it, final int showHomePage) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.k2(dialog, showHomePage, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.l2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void k2(Dialog d2, int i2, VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (i2 == 1) {
            this$0.V1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean m2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.b.getText()).length() == 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.b.setError(getString(R.string.enter_aadhar_no));
            eh ehVar4 = this.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            ehVar2.b.requestFocus();
            return false;
        }
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        if (String.valueOf(ehVar5.m.getText()).length() == 0) {
            eh ehVar6 = this.binding;
            if (ehVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar6 = null;
            }
            ehVar6.m.setError(getString(R.string.enter_owner_name));
            eh ehVar7 = this.binding;
            if (ehVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar7;
            }
            ehVar2.m.requestFocus();
            return false;
        }
        eh ehVar8 = this.binding;
        if (ehVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar8 = null;
        }
        if (String.valueOf(ehVar8.f.getText()).length() != 0) {
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar9;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar10 = this.binding;
        if (ehVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar10 = null;
        }
        ehVar10.f.setError("Please enter the mobile no");
        eh ehVar11 = this.binding;
        if (ehVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar11;
        }
        ehVar2.f.requestFocus();
        return false;
    }

    private final boolean n2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.m.getText()).length() == 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.m.setError(getString(R.string.enter_owner_name));
            eh ehVar4 = this.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            ehVar2.m.requestFocus();
            return false;
        }
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        if (String.valueOf(ehVar5.g.getText()).length() == 0) {
            eh ehVar6 = this.binding;
            if (ehVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar6 = null;
            }
            ehVar6.g.setError(getString(R.string.enter_mobile_no));
            eh ehVar7 = this.binding;
            if (ehVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar7;
            }
            ehVar2.g.requestFocus();
            return false;
        }
        mt6.a aVar = mt6.a;
        eh ehVar8 = this.binding;
        if (ehVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar8 = null;
        }
        if (aVar.t(String.valueOf(ehVar8.g.getText()))) {
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar9;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar10 = this.binding;
        if (ehVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar10 = null;
        }
        ehVar10.g.setError(getString(R.string.enter_mobile_no));
        eh ehVar11 = this.binding;
        if (ehVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar11;
        }
        ehVar2.g.requestFocus();
        return false;
    }

    private final boolean o2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.f.getText()).length() != 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar3;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar4 = this.binding;
        if (ehVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar4 = null;
        }
        ehVar4.g.setError(getString(R.string.enter_mobile_no));
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar5;
        }
        ehVar2.g.requestFocus();
        return false;
    }

    public static final void q2(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void r2(VahanConfirmUpdateMobileActivity this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        new j(time_text, resendOtp).start();
        this$0.K1().j(this$0, this$0.otpId);
    }

    public static final void s2(EditText enterOtp, VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, "Please enter the OTP", 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid OTP", 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this$0.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.dismiss();
        }
        ProgressDialog progressDialog4 = this$0.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog2 = progressDialog4;
        }
        progressDialog2.show();
        this$0.K1().l(this$0, string, this$0.otpId);
    }

    public static final void t2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void u2(VahanConfirmUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
    }

    public final void D1(String mobile_no) {
        try {
            ProgressDialog progressDialog = this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            JSONObject jSONObject = new JSONObject();
            eh ehVar2 = this.binding;
            if (ehVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar2 = null;
            }
            jSONObject.put("aadharNo", String.valueOf(ehVar2.b.getText()));
            jSONObject.put("mobile_no", mobile_no);
            jSONObject.put("regn_no", this.regNo);
            jSONObject.put("state_cd", this.stateCd);
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar = ehVar3;
            }
            jSONObject.put("name", String.valueOf(ehVar.m.getText()));
            L1().o(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final Dialog E1() {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d");
        return null;
    }

    public final wa3 G1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final UpdateMobileNoService H1() {
        UpdateMobileNoService updateMobileNoService = this.retrofitService;
        if (updateMobileNoService != null) {
            return updateMobileNoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanServiceConnection I1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService1;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService1");
        return null;
    }

    public final VahanServiceConnection J1() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final lk7 K1() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final ar6 L1() {
        ar6 ar6Var = this.viewModel;
        if (ar6Var != null) {
            return ar6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final al7 M1() {
        al7 al7Var = this.viewModel1;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    public final void W1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Y1(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<set-?>");
        this.d = dialog;
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final void d2(UpdateMobileNoService updateMobileNoService) {
        Intrinsics.checkNotNullParameter(updateMobileNoService, "<set-?>");
        this.retrofitService = updateMobileNoService;
    }

    public final void e2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService1 = vahanServiceConnection;
    }

    public final void f2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final void g2(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.verifyOtpViewModel = lk7Var;
    }

    public final void h2(ar6 ar6Var) {
        Intrinsics.checkNotNullParameter(ar6Var, "<set-?>");
        this.viewModel = ar6Var;
    }

    public final void i2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel1 = al7Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, G1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_confirm_update_mobile);
        eh ehVarC = eh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ehVarC, "inflate(...)");
        this.binding = ehVarC;
        ProgressDialog progressDialog = null;
        if (ehVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVarC = null;
        }
        setContentView(ehVarC.b());
        ta3.a aVar = ta3.a;
        eh ehVar = this.binding;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        aVar.A2(this, ehVar);
        eh ehVar2 = this.binding;
        if (ehVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar2 = null;
        }
        ehVar2.q.i.setText(getString(R.string.update_mobile_no));
        a2(new wa3(this));
        Y1(new Dialog(this));
        d2(UpdateMobileNoService.INSTANCE.a(this));
        VahanServiceConnection.Companion companion = VahanServiceConnection.INSTANCE;
        e2(companion.a(this));
        f2(companion.a(this));
        g2((lk7) new z(this, new kk7(new bg7(J1()))).a(lk7.class));
        i2((al7) new z(this, new bl7(new bg7(I1()))).a(al7.class));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.dialog = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage("Please wait...");
        F1();
        N1();
    }

    public final void p2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        E1().setContentView(R.layout.validateotp);
        E1().setCanceledOnTouchOutside(false);
        E1().setCancelable(false);
        Window window = E1().getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = E1().findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = E1().findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = E1().findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = E1().findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = E1().findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = E1().findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = E1().findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = E1().findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        int length = mobile_no.length();
        String strReplace = "";
        for (int i2 = 0; i2 < length; i2++) {
            mobile_no.charAt(i2);
            strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(mobile_no, ""), "X");
        }
        textView5.setText("OTP has been sent to your mobile \n+91 " + strReplace);
        new i(textView3, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.q2(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.r2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.s2(editText, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.t2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanConfirmUpdateMobileActivity.u2(this.a, view);
            }
        });
        E1().show();
    }
}
