package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationOtpVerify;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.eb3;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b@\u0010AJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015J\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplicationOtpVerify;", "Lcom/zepto/pq;", "", "applNo", "stateCd", "", "t1", "v1", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "message", "C1", "onBackPressed", "Lcom/zepto/eb3;", "C", "Lcom/zepto/eb3;", "binding", "D", "Ljava/lang/String;", "E", "chassisNo", "F", "engineNo", "G", "regNo", "H", "mobileNo", "I", "otp", "J", "ownerName", "K", "L", "params", "M", "otpId", "Lcom/zepto/jv;", "N", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Lcom/zepto/ev;", "P", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "R", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "E1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanApplicationOtpVerify extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eb3 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String regNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String otp = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String params = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ProgressDialog pDialog;

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
        public final void a(ResendOtp resendOtp) {
            if (VahanApplicationOtpVerify.this.u1().isShowing()) {
                VahanApplicationOtpVerify.this.u1().dismiss();
            }
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
                    vahanApplicationOtpVerify.C1(vahanApplicationOtpVerify, "We have resent the OTP to your Mobile Number");
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    VahanApplicationOtpVerify vahanApplicationOtpVerify2 = VahanApplicationOtpVerify.this;
                    vahanApplicationOtpVerify2.C1(vahanApplicationOtpVerify2, resendOtp.getStatusDesc());
                } else {
                    VahanApplicationOtpVerify vahanApplicationOtpVerify3 = VahanApplicationOtpVerify.this;
                    vahanApplicationOtpVerify3.C1(vahanApplicationOtpVerify3, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                VahanApplicationOtpVerify vahanApplicationOtpVerify4 = VahanApplicationOtpVerify.this;
                vahanApplicationOtpVerify4.C1(vahanApplicationOtpVerify4, "Unable to resent the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
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
            if (VahanApplicationOtpVerify.this.u1().isShowing()) {
                VahanApplicationOtpVerify.this.u1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
            vahanApplicationOtpVerify.C1(vahanApplicationOtpVerify, "Unable to resent the OTP, Please try after some time");
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
            if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
                vahanApplicationOtpVerify.t1(vahanApplicationOtpVerify.applNo, VahanApplicationOtpVerify.this.stateCd);
            } else {
                VahanApplicationOtpVerify vahanApplicationOtpVerify2 = VahanApplicationOtpVerify.this;
                vahanApplicationOtpVerify2.C1(vahanApplicationOtpVerify2, otpVerifyResult.getStatusDesc());
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
            if (VahanApplicationOtpVerify.this.u1().isShowing()) {
                VahanApplicationOtpVerify.this.u1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
            vahanApplicationOtpVerify.C1(vahanApplicationOtpVerify, "Unable to Verify the OTP, Please try after some time");
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
        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (VahanApplicationOtpVerify.this.u1().isShowing()) {
                VahanApplicationOtpVerify.this.u1().dismiss();
            }
            if (applicationStatusSuccessModel.getTransList().size() <= 0) {
                VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
                vahanApplicationOtpVerify.C1(vahanApplicationOtpVerify, "No application status found for this application no.");
                return;
            }
            Intent intent = new Intent(VahanApplicationOtpVerify.this, (Class<?>) VahanApplicationTransactionStatus.class);
            intent.putExtra("transList", new Gson().toJson(applicationStatusSuccessModel.getTransList()));
            intent.putExtra("applicationNo", VahanApplicationOtpVerify.this.applNo);
            intent.putExtra("ownerName", VahanApplicationOtpVerify.this.ownerName);
            intent.putExtra("stateCd", VahanApplicationOtpVerify.this.stateCd);
            intent.putExtra("regNo", VahanApplicationOtpVerify.this.regNo);
            VahanApplicationOtpVerify.this.startActivity(intent);
            VahanApplicationOtpVerify.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
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
            if (VahanApplicationOtpVerify.this.u1().isShowing()) {
                VahanApplicationOtpVerify.this.u1().dismiss();
            }
            VahanApplicationOtpVerify vahanApplicationOtpVerify = VahanApplicationOtpVerify.this;
            vahanApplicationOtpVerify.C1(vahanApplicationOtpVerify, "No application status found for this application no.");
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

    public static final void A1(VahanApplicationOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().isShowing()) {
            this$0.u1().dismiss();
        }
        this$0.u1().show();
        ev evVar = this$0.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.s(this$0, this$0.otpId);
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(String applNo, String stateCd) {
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, applNo, stateCd);
    }

    private final void v1() {
        ApplicationService applicationService = this.retrofitService;
        eb3 eb3Var = null;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
        if (applicationServiceOtp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
        if (this.applNo.length() > 0) {
            eb3 eb3Var2 = this.binding;
            if (eb3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var2 = null;
            }
            eb3Var2.j.setText(this.applNo);
        }
        if (this.chassisNo.length() > 0) {
            eb3 eb3Var3 = this.binding;
            if (eb3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var3 = null;
            }
            eb3Var3.k.setText(this.chassisNo);
        }
        if (this.regNo.length() > 0) {
            eb3 eb3Var4 = this.binding;
            if (eb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var4 = null;
            }
            eb3Var4.l.setText(this.regNo);
        }
        if (this.params.length() > 0) {
            eb3 eb3Var5 = this.binding;
            if (eb3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var5 = null;
            }
            eb3Var5.e.setText(this.params);
        }
        eb3 eb3Var6 = this.binding;
        if (eb3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var6 = null;
        }
        eb3Var6.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ew6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.w1(this.a, view);
            }
        });
        eb3 eb3Var7 = this.binding;
        if (eb3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var7 = null;
        }
        eb3Var7.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.x1(this.a, view);
            }
        });
        eb3 eb3Var8 = this.binding;
        if (eb3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var8 = null;
        }
        eb3Var8.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.y1(this.a, view);
            }
        });
        eb3 eb3Var9 = this.binding;
        if (eb3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var9 = null;
        }
        eb3Var9.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.z1(this.a, view);
            }
        });
        eb3 eb3Var10 = this.binding;
        if (eb3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eb3Var = eb3Var10;
        }
        eb3Var.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.A1(this.a, view);
            }
        });
    }

    public static final void w1(VahanApplicationOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    public static final void x1(VahanApplicationOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y1(VahanApplicationOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void z1(VahanApplicationOtpVerify this$0, View view) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eb3 eb3Var = this$0.binding;
        eb3 eb3Var2 = null;
        if (eb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var = null;
        }
        Editable text = eb3Var.f.getText();
        if (text != null) {
            boolValueOf = Boolean.valueOf(text.length() > 0);
        } else {
            boolValueOf = null;
        }
        Intrinsics.checkNotNull(boolValueOf);
        if (!boolValueOf.booleanValue()) {
            this$0.C1(this$0, "Please enter the OTP");
            return;
        }
        if (this$0.u1().isShowing()) {
            this$0.u1().dismiss();
        }
        this$0.u1().show();
        ev evVar = this$0.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        eb3 eb3Var3 = this$0.binding;
        if (eb3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eb3Var2 = eb3Var3;
        }
        evVar.v(this$0, StringsKt__StringsKt.trim((CharSequence) String.valueOf(eb3Var2.f.getText())).toString(), this$0.otpId);
    }

    public final void C1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationOtpVerify.D1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void E1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, "Are you sure you want to leave?");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_application_otp_verify_vahan_services);
        eb3 eb3VarC = eb3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(eb3VarC, "inflate(...)");
        this.binding = eb3VarC;
        ev evVar = null;
        if (eb3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3VarC = null;
        }
        setContentView(eb3VarC.b());
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            Intrinsics.checkNotNull(stringExtra);
            this.applNo = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("chassisNo");
            Intrinsics.checkNotNull(stringExtra2);
            this.chassisNo = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("engineNo");
            Intrinsics.checkNotNull(stringExtra3);
            this.engineNo = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("regNo");
            Intrinsics.checkNotNull(stringExtra4);
            this.regNo = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("mobileNo");
            Intrinsics.checkNotNull(stringExtra5);
            this.mobileNo = stringExtra5;
            String stringExtra6 = getIntent().getStringExtra("ownerName");
            Intrinsics.checkNotNull(stringExtra6);
            this.ownerName = stringExtra6;
            String stringExtra7 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra7);
            this.stateCd = stringExtra7;
            String stringExtra8 = getIntent().getStringExtra("Param");
            Intrinsics.checkNotNull(stringExtra8);
            this.params = stringExtra8;
            String stringExtra9 = getIntent().getStringExtra("otpId");
            Intrinsics.checkNotNull(stringExtra9);
            this.otpId = stringExtra9;
        }
        E1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        v1();
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.r().g(this, new g(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar3 = null;
        }
        evVar3.q().g(this, new g(new b()));
        ev evVar4 = this.otpViewModel;
        if (evVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar4 = null;
        }
        evVar4.u().g(this, new g(new c()));
        ev evVar5 = this.otpViewModel;
        if (evVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar5 = null;
        }
        evVar5.t().g(this, new g(new d()));
        ev evVar6 = this.otpViewModel;
        if (evVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar6 = null;
        }
        evVar6.n().g(this, new g(new e()));
        ev evVar7 = this.otpViewModel;
        if (evVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar7;
        }
        evVar.k().g(this, new g(new f()));
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
