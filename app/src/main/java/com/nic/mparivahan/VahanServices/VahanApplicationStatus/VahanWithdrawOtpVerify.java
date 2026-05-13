package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdrawOtpVerify;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanApplVerifySuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.eb3;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ws6;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanWithdrawOtpVerify;", "Lcom/zepto/pq;", "", "w1", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "E1", "onBackPressed", "Lcom/zepto/eb3;", "C", "Lcom/zepto/eb3;", "binding", "D", "Ljava/lang/String;", "applNo", "E", "chassisNo", "F", "engineNo", "G", "regNo", "H", "mobileNo", "", "I", "otp", "J", "ownerName", "K", "stateCd", "Lcom/zepto/jv;", "L", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanWithdrawOtpVerify extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eb3 binding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int otp;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

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

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String stateCd = "";

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
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
            VahanWithdrawOtpVerify.this.otp = sendOtpResult.getRecordId();
            VahanWithdrawOtpVerify vahanWithdrawOtpVerify = VahanWithdrawOtpVerify.this;
            vahanWithdrawOtpVerify.E1(vahanWithdrawOtpVerify, "We have resent the OTP to your Mobile Number");
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

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
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
        public final void a(VahanApplVerifySuccessModel vahanApplVerifySuccessModel) {
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
            try {
                ArrayList arrayList = new ArrayList();
                String request_dt = "";
                int size = vahanApplVerifySuccessModel.size();
                for (int i = 0; i < size; i++) {
                    arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(new ModifiedListOfDisposeApplModel(vahanApplVerifySuccessModel.get(i).getTransaction_no(), vahanApplVerifySuccessModel.get(i).getPur_cd(), vahanApplVerifySuccessModel.get(i).getRegn_no(), vahanApplVerifySuccessModel.get(i).getApplication_status(), vahanApplVerifySuccessModel.get(i).getRequest_dt(), vahanApplVerifySuccessModel.get(i).getState_cd(), vahanApplVerifySuccessModel.get(i).getOff_cd(), vahanApplVerifySuccessModel.get(i).getDescr())));
                    request_dt = vahanApplVerifySuccessModel.get(i).getRequest_dt();
                }
                Intent intent = new Intent(VahanWithdrawOtpVerify.this, (Class<?>) VahanWithdrawTransactionApplied.class);
                intent.putExtra("arrayList", arrayList);
                intent.putExtra("applicationNo", VahanWithdrawOtpVerify.this.applNo);
                intent.putExtra("ownerName", VahanWithdrawOtpVerify.this.ownerName);
                intent.putExtra("stateCd", VahanWithdrawOtpVerify.this.stateCd);
                intent.putExtra("regNo", VahanWithdrawOtpVerify.this.regNo);
                intent.putExtra("transactionDate", request_dt);
                VahanWithdrawOtpVerify.this.startActivity(intent);
                VahanWithdrawOtpVerify.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify = VahanWithdrawOtpVerify.this;
                vahanWithdrawOtpVerify.E1(vahanWithdrawOtpVerify, vahanWithdrawOtpVerify.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanApplVerifySuccessModel) obj);
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
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
            if (str.equals("Error")) {
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify = VahanWithdrawOtpVerify.this;
                vahanWithdrawOtpVerify.E1(vahanWithdrawOtpVerify, "No Online application is available for withrawal.");
            } else {
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify2 = VahanWithdrawOtpVerify.this;
                vahanWithdrawOtpVerify2.E1(vahanWithdrawOtpVerify2, "No Online application is available for withrawal.");
            }
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
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    VahanWithdrawOtpVerify vahanWithdrawOtpVerify = VahanWithdrawOtpVerify.this;
                    vahanWithdrawOtpVerify.E1(vahanWithdrawOtpVerify, otpVerifyResult.getStatusDesc());
                    return;
                }
                VahanWithdrawOtpVerify.this.v1().show();
                jv jvVar = VahanWithdrawOtpVerify.this.viewModel;
                if (jvVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    jvVar = null;
                }
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify2 = VahanWithdrawOtpVerify.this;
                jvVar.E(vahanWithdrawOtpVerify2, vahanWithdrawOtpVerify2.regNo, VahanWithdrawOtpVerify.this.applNo, "1234");
            } catch (Exception unused) {
                VahanWithdrawOtpVerify vahanWithdrawOtpVerify3 = VahanWithdrawOtpVerify.this;
                vahanWithdrawOtpVerify3.E1(vahanWithdrawOtpVerify3, "Unable to Verify the OTP, Please try after some time");
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
            if (VahanWithdrawOtpVerify.this.v1().isShowing()) {
                VahanWithdrawOtpVerify.this.v1().dismiss();
            }
            VahanWithdrawOtpVerify vahanWithdrawOtpVerify = VahanWithdrawOtpVerify.this;
            vahanWithdrawOtpVerify.E1(vahanWithdrawOtpVerify, "Unable to Verify the OTP, Please try after some time");
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

    public static final void A1(VahanWithdrawOtpVerify this$0, View view) {
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
            this$0.E1(this$0, "Please enter the valid OTP");
            return;
        }
        if (this$0.v1().isShowing()) {
            this$0.v1().dismiss();
        }
        eb3 eb3Var3 = this$0.binding;
        if (eb3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var3 = null;
        }
        if (String.valueOf(eb3Var3.f.getText()).length() < 4) {
            this$0.E1(this$0, "Please enter the valid OTP");
            return;
        }
        this$0.v1().show();
        jv jvVar = this$0.viewModel;
        if (jvVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar = null;
        }
        eb3 eb3Var4 = this$0.binding;
        if (eb3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eb3Var2 = eb3Var4;
        }
        jvVar.D(this$0, String.valueOf(eb3Var2.f.getText()), String.valueOf(this$0.otp));
    }

    public static final void B1(VahanWithdrawOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().isShowing()) {
            this$0.v1().dismiss();
        }
        this$0.v1().show();
        ws6 ws6Var = new ws6(this$0);
        jv jvVar = this$0.viewModel;
        if (jvVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar = null;
        }
        jvVar.q(this$0, this$0.mobileNo, ws6Var.k());
    }

    public static final void C1(VahanWithdrawOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eb3 eb3Var = this$0.binding;
        eb3 eb3Var2 = null;
        if (eb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var = null;
        }
        if (eb3Var.f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            eb3 eb3Var3 = this$0.binding;
            if (eb3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var3 = null;
            }
            eb3Var3.h.setImageResource(R.drawable.pass_visible);
            eb3 eb3Var4 = this$0.binding;
            if (eb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                eb3Var2 = eb3Var4;
            }
            eb3Var2.f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            return;
        }
        eb3 eb3Var5 = this$0.binding;
        if (eb3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var5 = null;
        }
        eb3Var5.h.setImageResource(R.drawable.mvvm_visibility);
        eb3 eb3Var6 = this$0.binding;
        if (eb3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eb3Var2 = eb3Var6;
        }
        eb3Var2.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    private final void D1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void w1() {
        eb3 eb3Var = this.binding;
        eb3 eb3Var2 = null;
        if (eb3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var = null;
        }
        eb3Var.g.setText("Dispose Application");
        eb3 eb3Var3 = this.binding;
        if (eb3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var3 = null;
        }
        eb3Var3.b.i.setText("Dispose Application");
        ApplicationService applicationService = this.retrofitService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        if (this.applNo.length() > 0) {
            eb3 eb3Var4 = this.binding;
            if (eb3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var4 = null;
            }
            eb3Var4.j.setText(this.applNo);
        }
        if (this.chassisNo.length() > 0) {
            eb3 eb3Var5 = this.binding;
            if (eb3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var5 = null;
            }
            eb3Var5.k.setText("xxxxxxx" + this.chassisNo);
        }
        if (this.regNo.length() > 0) {
            eb3 eb3Var6 = this.binding;
            if (eb3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var6 = null;
            }
            eb3Var6.l.setText(this.regNo);
        }
        try {
            String str = this.mobileNo;
            int length = str.length();
            String strReplace = "";
            for (int i = 0; i < length; i++) {
                str.charAt(i);
                strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(this.mobileNo, ""), "X");
            }
            eb3 eb3Var7 = this.binding;
            if (eb3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eb3Var7 = null;
            }
            eb3Var7.e.setText("OTP has been sent to your mobile \n+91 " + strReplace);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        eb3 eb3Var8 = this.binding;
        if (eb3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var8 = null;
        }
        eb3Var8.b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.x1(this.a, view);
            }
        });
        eb3 eb3Var9 = this.binding;
        if (eb3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var9 = null;
        }
        eb3Var9.b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ol7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.y1(this.a, view);
            }
        });
        eb3 eb3Var10 = this.binding;
        if (eb3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var10 = null;
        }
        eb3Var10.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.z1(this.a, view);
            }
        });
        eb3 eb3Var11 = this.binding;
        if (eb3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var11 = null;
        }
        eb3Var11.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ql7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.A1(this.a, view);
            }
        });
        eb3 eb3Var12 = this.binding;
        if (eb3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3Var12 = null;
        }
        eb3Var12.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.B1(this.a, view);
            }
        });
        eb3 eb3Var13 = this.binding;
        if (eb3Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eb3Var2 = eb3Var13;
        }
        eb3Var2.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.C1(this.a, view);
            }
        });
    }

    public static final void x1(VahanWithdrawOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1();
    }

    public static final void y1(VahanWithdrawOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void z1(VahanWithdrawOtpVerify this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void E1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawOtpVerify.F1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void G1(ProgressDialog progressDialog) {
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
        jv jvVar = null;
        if (eb3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eb3VarC = null;
        }
        setContentView(eb3VarC.b());
        this.retrofitService = ApplicationService.INSTANCE.a(this);
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
            this.otp = getIntent().getIntExtra("otp", 0);
            String stringExtra6 = getIntent().getStringExtra("ownerName");
            Intrinsics.checkNotNull(stringExtra6);
            this.ownerName = stringExtra6;
            String stringExtra7 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra7);
            this.stateCd = stringExtra7;
        }
        G1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        w1();
        jv jvVar2 = this.viewModel;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar2 = null;
        }
        jvVar2.k().g(this, new g(new a()));
        jv jvVar3 = this.viewModel;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar3 = null;
        }
        jvVar3.j().g(this, new g(new b()));
        jv jvVar4 = this.viewModel;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar4 = null;
        }
        jvVar4.n().g(this, new g(new c()));
        jv jvVar5 = this.viewModel;
        if (jvVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar5 = null;
        }
        jvVar5.m().g(this, new g(new d()));
        jv jvVar6 = this.viewModel;
        if (jvVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar6 = null;
        }
        jvVar6.s().g(this, new g(new e()));
        jv jvVar7 = this.viewModel;
        if (jvVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            jvVar = jvVar7;
        }
        jvVar.r().g(this, new g(new f()));
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
