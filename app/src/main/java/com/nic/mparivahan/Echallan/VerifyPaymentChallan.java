package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.az1;
import com.zepto.b31;
import com.zepto.b55;
import com.zepto.hz0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.wa3;
import com.zepto.wf;
import com.zepto.ws6;
import com.zepto.zy1;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR2\u0010(\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0015R\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0015R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/nic/mparivahan/Echallan/VerifyPaymentChallan;", "Lcom/zepto/pq;", "", "K1", "B1", "Y1", "", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "J1", "Landroid/content/Context;", "context", "message", "V1", "T1", "U1", "C", "Ljava/lang/String;", "inputType", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "u1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "M1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "E", "Ljava/util/ArrayList;", "t1", "()Ljava/util/ArrayList;", "L1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/b31;", "F", "Lcom/zepto/b31;", "z1", "()Lcom/zepto/b31;", "R1", "(Lcom/zepto/b31;)V", "myRcAdapter", "Lcom/zepto/wf;", "G", "Lcom/zepto/wf;", "binding", "Lcom/zepto/a55;", "H", "Lcom/zepto/a55;", "y1", "()Lcom/zepto/a55;", "Q1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "I", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "x1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "P1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "dialog", "Lcom/zepto/ws6;", "K", "Lcom/zepto/ws6;", "A1", "()Lcom/zepto/ws6;", "S1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "M", "serviceName", "N", "serviceCode", "Landroid/text/TextWatcher;", "O", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVerifyPaymentChallan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyPaymentChallan.kt\ncom/nic/mparivahan/Echallan/VerifyPaymentChallan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,613:1\n1#2:614\n*E\n"})
public final class VerifyPaymentChallan extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wf binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String inputType = "RC";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final TextWatcher inputTextWatcher = new c();

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            wf wfVar = VerifyPaymentChallan.this.binding;
            if (wfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar = null;
            }
            wfVar.f.setError(null);
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            wf wfVar = VerifyPaymentChallan.this.binding;
            if (wfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar = null;
            }
            wfVar.j.setError(null);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            wf wfVar = VerifyPaymentChallan.this.binding;
            if (wfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar = null;
            }
            wfVar.m.setError(null);
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
        public final void a(ValidateRcSuccess validateRcSuccess) {
            if (VerifyPaymentChallan.this.v1().isShowing()) {
                VerifyPaymentChallan.this.v1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                    VerifyPaymentChallan verifyPaymentChallan = VerifyPaymentChallan.this;
                    verifyPaymentChallan.V1(verifyPaymentChallan, validateRcSuccess.getStatusDesc());
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                    hz0.a.Q(VerifyPaymentChallan.this, validateRcSuccess.getStatusDesc(), 1);
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                    hz0.a.Q(VerifyPaymentChallan.this, validateRcSuccess.getStatusDesc(), 2);
                    return;
                } else {
                    VerifyPaymentChallan verifyPaymentChallan2 = VerifyPaymentChallan.this;
                    verifyPaymentChallan2.V1(verifyPaymentChallan2, verifyPaymentChallan2.w1().b("error_msg_record_not_found", VerifyPaymentChallan.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            Intent intent = new Intent(VerifyPaymentChallan.this, (Class<?>) NoticeChallanVehicleSearchList.class);
            wf wfVar = VerifyPaymentChallan.this.binding;
            wf wfVar2 = null;
            if (wfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar = null;
            }
            intent.putExtra("inputValue", wfVar.m.getText().toString());
            intent.putExtra("inputType", VerifyPaymentChallan.this.inputType);
            wf wfVar3 = VerifyPaymentChallan.this.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            intent.putExtra("inputchassisno", wfVar3.f.getText().toString());
            wf wfVar4 = VerifyPaymentChallan.this.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar2 = wfVar4;
            }
            intent.putExtra("inputengineno", wfVar2.j.getText().toString());
            intent.putExtra("Service_code", VerifyPaymentChallan.this.serviceCode);
            VerifyPaymentChallan.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ValidateRcSuccess) obj);
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
            if (VerifyPaymentChallan.this.v1().isShowing()) {
                VerifyPaymentChallan.this.v1().dismiss();
            }
            VerifyPaymentChallan verifyPaymentChallan = VerifyPaymentChallan.this;
            verifyPaymentChallan.V1(verifyPaymentChallan, verifyPaymentChallan.w1().b("error_msg_record_not_found", VerifyPaymentChallan.this.getString(R.string.service_unavable_please_try)));
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

    private final void B1() {
        S1(new ws6(this));
        P1(RcService.INSTANCE.a(this));
        Q1((a55) new z(this, new b55(new s45(x1()))).a(a55.class));
        wf wfVar = this.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        wfVar.D.setText(w1().b("label_verify_payment_status", "Verify Payment Status"));
        wf wfVar3 = this.binding;
        if (wfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar3 = null;
        }
        wfVar3.C.setVisibility(8);
        wf wfVar4 = this.binding;
        if (wfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar4 = null;
        }
        wfVar4.t.setVisibility(8);
        wf wfVar5 = this.binding;
        if (wfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar5 = null;
        }
        wfVar5.b.setVisibility(8);
        wf wfVar6 = this.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.io7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.C1(this.a, view);
            }
        });
        wf wfVar7 = this.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VerifyPaymentChallan.D1(this.a, view);
            }
        });
        wf wfVar8 = this.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ko7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VerifyPaymentChallan.E1(this.a, view);
            }
        });
        wf wfVar9 = this.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.m.addTextChangedListener(this.inputTextWatcher);
        wf wfVar10 = this.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.f.addTextChangedListener(new a());
        wf wfVar11 = this.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.j.addTextChangedListener(new b());
        wf wfVar12 = this.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.F1(this.a, view);
            }
        });
        wf wfVar13 = this.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.G1(this.a, view);
            }
        });
        wf wfVar14 = this.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.E.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.no7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.H1(this.a, view);
            }
        });
        wf wfVar15 = this.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar15;
        }
        wfVar2.E.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.I1(this.a, view);
            }
        });
    }

    public static final void C1(VerifyPaymentChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.e.isSelected()) {
            this$0.inputType = "";
            wf wfVar3 = this$0.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.e.setChecked(false);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.e.setSelected(false);
            wf wfVar5 = this$0.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar2 = wfVar5;
            }
            wfVar2.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        wf wfVar6 = this$0.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.w.setVisibility(8);
        wf wfVar7 = this$0.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.R.setVisibility(8);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.Q.setVisibility(8);
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.e.setChecked(true);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.e.setSelected(true);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.d.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.O.setChecked(false);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.O.setSelected(false);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.N.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.g.setChecked(false);
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.g.setSelected(false);
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        Editable text = wfVar18.m.getText();
        if (text != null) {
            text.clear();
        }
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        Editable text2 = wfVar19.j.getText();
        if (text2 != null) {
            text2.clear();
        }
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        Editable text3 = wfVar20.f.getText();
        if (text3 != null) {
            text3.clear();
        }
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.m.setHint(this$0.w1().b("enterCNoticePlaceHolder", this$0.getString(R.string.enter_challan_notice_no)));
        this$0.inputType = "Challan";
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.m.setError(null);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar24;
        }
        wfVar2.M.setVisibility(8);
    }

    public static final void D1(VerifyPaymentChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.O.isSelected()) {
            this$0.inputType = "";
            wf wfVar3 = this$0.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.M.setVisibility(8);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.O.setChecked(false);
            wf wfVar5 = this$0.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar5 = null;
            }
            wfVar5.O.setSelected(false);
            wf wfVar6 = this$0.binding;
            if (wfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar6 = null;
            }
            wfVar6.N.setBackgroundResource(R.drawable.corner_circle_bg_14);
            wf wfVar7 = this$0.binding;
            if (wfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar7 = null;
            }
            wfVar7.w.setVisibility(8);
            wf wfVar8 = this$0.binding;
            if (wfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar2 = wfVar8;
            }
            wfVar2.R.setVisibility(8);
            return;
        }
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.e.setChecked(false);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.e.setSelected(false);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.O.setChecked(true);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.O.setSelected(true);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.N.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.g.setChecked(false);
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.g.setSelected(false);
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        Editable text = wfVar18.m.getText();
        if (text != null) {
            text.clear();
        }
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        Editable text2 = wfVar19.j.getText();
        if (text2 != null) {
            text2.clear();
        }
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        Editable text3 = wfVar20.f.getText();
        if (text3 != null) {
            text3.clear();
        }
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.m.setHint(this$0.w1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        this$0.inputType = "RC";
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.m.setError(null);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.M.setVisibility(0);
        wf wfVar25 = this$0.binding;
        if (wfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar25;
        }
        wfVar2.Q.setVisibility(8);
        this$0.T1();
    }

    public static final void E1(VerifyPaymentChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.g.isSelected()) {
            this$0.inputType = "";
            wf wfVar3 = this$0.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.g.setChecked(false);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.g.setSelected(false);
            wf wfVar5 = this$0.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar5 = null;
            }
            wfVar5.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
            wf wfVar6 = this$0.binding;
            if (wfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar2 = wfVar6;
            }
            wfVar2.Q.setVisibility(8);
            return;
        }
        wf wfVar7 = this$0.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.e.setChecked(false);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.e.setSelected(false);
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.w.setVisibility(8);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.R.setVisibility(8);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.O.setChecked(false);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.O.setSelected(false);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.N.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.g.setChecked(true);
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.g.setSelected(true);
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.i.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        Editable text = wfVar18.m.getText();
        if (text != null) {
            text.clear();
        }
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        Editable text2 = wfVar19.j.getText();
        if (text2 != null) {
            text2.clear();
        }
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        Editable text3 = wfVar20.f.getText();
        if (text3 != null) {
            text3.clear();
        }
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.m.setHint(this$0.w1().b("label_challan_enter_dl_no", this$0.getString(R.string.enter_dl_number)));
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(18)});
        this$0.inputType = "DL";
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.m.setError(null);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar24;
        }
        wfVar2.M.setVisibility(8);
        this$0.U1();
    }

    public static final void F1(VerifyPaymentChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.X1() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                this$0.V1(this$0, this$0.w1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.Y1();
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) VerifyPaymentChallanList.class);
            wf wfVar = this$0.binding;
            if (wfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar = null;
            }
            intent.putExtra("inputValue", wfVar.m.getText().toString());
            intent.putExtra("inputType", this$0.inputType);
            intent.putExtra("inputchassisno", "");
            intent.putExtra("inputengineno", "");
            this$0.startActivity(intent);
        }
    }

    public static final void G1(VerifyPaymentChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VerifyPaymentChallanList.class);
        wf wfVar = this$0.binding;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        intent.putExtra("inputValue", wfVar.v.getText().toString());
        intent.putExtra("inputType", "DL");
        intent.putExtra("inputchassisno", "");
        intent.putExtra("inputengineno", "");
        this$0.startActivity(intent);
    }

    public static final void H1(VerifyPaymentChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void I1(VerifyPaymentChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    private final void K1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean X1() {
        String strSubstring;
        wf wfVar = this.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) wfVar.m.getText().toString()).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            wf wfVar3 = this.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) wfVar3.m.getText().toString()).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                wf wfVar4 = this.binding;
                if (wfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar4 = null;
                }
                wfVar4.m.setError(getString(R.string.please_enter_challan_notice_no));
                wf wfVar5 = this.binding;
                if (wfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar5;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    wf wfVar6 = this.binding;
                    if (wfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wfVar6 = null;
                    }
                    wfVar6.m.setError(getString(R.string.enter_min_notice_no));
                    wf wfVar7 = this.binding;
                    if (wfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wfVar2 = wfVar7;
                    }
                    wfVar2.m.requestFocus();
                    return true;
                }
            } else {
                if (!J1(strSubstring)) {
                    wf wfVar8 = this.binding;
                    if (wfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wfVar8 = null;
                    }
                    wfVar8.m.setError(w1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    wf wfVar9 = this.binding;
                    if (wfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wfVar2 = wfVar9;
                    }
                    wfVar2.m.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    wf wfVar10 = this.binding;
                    if (wfVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wfVar10 = null;
                    }
                    wfVar10.m.setError(w1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    wf wfVar11 = this.binding;
                    if (wfVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wfVar2 = wfVar11;
                    }
                    wfVar2.m.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    wf wfVar12 = this.binding;
                    if (wfVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wfVar12 = null;
                    }
                    wfVar12.m.setError(w1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    wf wfVar13 = this.binding;
                    if (wfVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wfVar2 = wfVar13;
                    }
                    wfVar2.m.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                wf wfVar14 = this.binding;
                if (wfVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar14 = null;
                }
                wfVar14.m.setError(w1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                wf wfVar15 = this.binding;
                if (wfVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar15;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 4) {
                wf wfVar16 = this.binding;
                if (wfVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar16 = null;
                }
                wfVar16.m.setError(w1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                wf wfVar17 = this.binding;
                if (wfVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar17;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                wf wfVar18 = this.binding;
                if (wfVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar18 = null;
                }
                wfVar18.m.setError(w1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                wf wfVar19 = this.binding;
                if (wfVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar19;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                wf wfVar20 = this.binding;
                if (wfVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar20 = null;
                }
                wfVar20.m.setError(w1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                wf wfVar21 = this.binding;
                if (wfVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar21;
                }
                wfVar2.m.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                wf wfVar22 = this.binding;
                if (wfVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar22 = null;
                }
                wfVar22.m.setError(w1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                wf wfVar23 = this.binding;
                if (wfVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar23;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                wf wfVar24 = this.binding;
                if (wfVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar24 = null;
                }
                wfVar24.m.setError(w1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                wf wfVar25 = this.binding;
                if (wfVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar25;
                }
                wfVar2.m.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void Y1() {
        v1().show();
        a55 a55VarY1 = y1();
        wf wfVar = this.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        String string = wfVar.m.getText().toString();
        String string2 = A1().k().toString();
        wf wfVar3 = this.binding;
        if (wfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar3 = null;
        }
        String string3 = wfVar3.f.getText().toString();
        wf wfVar4 = this.binding;
        if (wfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar4;
        }
        a55VarY1.m(string, string2, string3, wfVar2.j.getText().toString(), this, hz0.a.n());
    }

    public final ws6 A1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final boolean J1(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (('A' > cCharAt || cCharAt >= '[') && ('a' > cCharAt || cCharAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void L1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void M1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.dialog = progressDialog;
    }

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void P1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void Q1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void R1(b31 b31Var) {
        Intrinsics.checkNotNullParameter(b31Var, "<set-?>");
        this.myRcAdapter = b31Var;
    }

    public final void S1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void T1() throws Throwable {
        ArrayList arrayListH0 = u1().H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
        L1(arrayListH0);
        wf wfVar = null;
        if (t1().size() <= 0) {
            wf wfVar2 = this.binding;
            if (wfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar2 = null;
            }
            wfVar2.w.setVisibility(8);
            wf wfVar3 = this.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar3;
            }
            wfVar.R.setVisibility(8);
            return;
        }
        Log.e("Arraylist", "1---------------->");
        wf wfVar4 = this.binding;
        if (wfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar4 = null;
        }
        wfVar4.R.setVisibility(0);
        wf wfVar5 = this.binding;
        if (wfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar5 = null;
        }
        wfVar5.w.setVisibility(0);
        b31 b31Var = new b31(t1(), this, 13, "");
        Intrinsics.checkNotNull(b31Var);
        R1(b31Var);
        wf wfVar6 = this.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar = wfVar6;
        }
        wfVar.w.setAdapter(z1());
    }

    public final void U1() throws Throwable {
        DlobjX dlobj;
        String dlLicno = null;
        wf wfVar = null;
        dlLicno = null;
        if (u1().z0() == null) {
            wf wfVar2 = this.binding;
            if (wfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar2;
            }
            wfVar.Q.setVisibility(8);
            return;
        }
        try {
            wf wfVar3 = this.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.P.setText(w1().b("label_verify_payment_status", "Verify Payment Status"));
            wf wfVar4 = this.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.L.setText(w1().b("label_challan_dl_no", "Driving Licence No"));
            wf wfVar5 = this.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar5 = null;
            }
            wfVar5.o.setText(w1().b("label_challan_my_dl_number", getString(R.string.my_driving_license)));
            ArrayList arrayListZ0 = u1().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            if (((DLDocument) arrayListZ0.get(0)).getDldetails() != null) {
                wf wfVar6 = this.binding;
                if (wfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar6 = null;
                }
                wfVar6.Q.setVisibility(0);
                wf wfVar7 = this.binding;
                if (wfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar7 = null;
                }
                TextView textView = wfVar7.v;
                DldetobjX dldetails = ((DLDocument) arrayListZ0.get(0)).getDldetails();
                if (dldetails != null && (dlobj = dldetails.getDlobj()) != null) {
                    dlLicno = dlobj.getDlLicno();
                }
                textView.setText(dlLicno);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void V1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
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
        textView.setText(w1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(w1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ho7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallan.W1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        wf wfVarC = wf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wfVarC, "inflate(...)");
        this.binding = wfVarC;
        wf wfVar = null;
        if (wfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVarC = null;
        }
        setContentView(wfVarC.b());
        O1(new wa3(this));
        az1.a aVar = az1.a;
        wf wfVar2 = this.binding;
        if (wfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar2 = null;
        }
        aVar.c(this, wfVar2);
        if (getIntent().hasExtra("Service_name")) {
            String stringExtra = getIntent().getStringExtra("Service_name");
            Intrinsics.checkNotNull(stringExtra);
            this.serviceName = stringExtra;
        }
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra2 = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra2);
            this.serviceCode = stringExtra2;
        }
        N1(new ProgressDialog(this));
        v1().setMessage(w1().b("label_challan_please_wait", "Please wait..."));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        M1(databaseHelperD0);
        wf wfVar3 = this.binding;
        if (wfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar3 = null;
        }
        wfVar3.w.setLayoutManager(new LinearLayoutManager(this, 0, false));
        zy1.a aVar2 = zy1.a;
        wf wfVar4 = this.binding;
        if (wfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar4 = null;
        }
        EditText engineEt = wfVar4.j;
        Intrinsics.checkNotNullExpressionValue(engineEt, "engineEt");
        aVar2.a(this, engineEt);
        wf wfVar5 = this.binding;
        if (wfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar5 = null;
        }
        EditText inputEt = wfVar5.m;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        aVar2.a(this, inputEt);
        wf wfVar6 = this.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        EditText chasisEt = wfVar6.f;
        Intrinsics.checkNotNullExpressionValue(chasisEt, "chasisEt");
        aVar2.a(this, chasisEt);
        B1();
        T1();
        wf wfVar7 = this.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar = wfVar7;
        }
        wfVar.E.i.setText(w1().b("label_challan_verify_payment_status", getString(R.string.verify_challan_payment)));
        y1().V().g(this, new f(new d()));
        y1().W().g(this, new f(new e()));
    }

    public final ArrayList t1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final DatabaseHelper u1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final RcService x1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 y1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final b31 z1() {
        b31 b31Var = this.myRcAdapter;
        if (b31Var != null) {
            return b31Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }
}
