package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.sh;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanVerifyPendingTransaction;", "Lcom/zepto/pq;", "", "x1", "E1", "Landroid/content/Context;", "context", "", "it", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "rcNo", "chassisNo", "u1", "transactionNo", "v1", "Lcom/zepto/sh;", "C", "Lcom/zepto/sh;", "binding", "D", "Ljava/lang/String;", "selectedTab", "Lcom/zepto/jv;", "E", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanVerifyPendingTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanVerifyPendingTransaction.kt\ncom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanVerifyPendingTransaction\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,322:1\n260#2:323\n260#2:324\n*S KotlinDebug\n*F\n+ 1 VahanVerifyPendingTransaction.kt\ncom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanVerifyPendingTransaction\n*L\n245#1:323\n249#1:324\n*E\n"})
public final class VahanVerifyPendingTransaction extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public sh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String selectedTab = "Transaction";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageSession;

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
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                sh shVar = VahanVerifyPendingTransaction.this.binding;
                if (shVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    shVar = null;
                }
                shVar.f.setError(null);
            }
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
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                sh shVar = VahanVerifyPendingTransaction.this.binding;
                if (shVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    shVar = null;
                }
                shVar.e.setError(null);
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(PendingTransRegNoModel pendingTransRegNoModel) {
            if (VahanVerifyPendingTransaction.this.w1().isShowing()) {
                VahanVerifyPendingTransaction.this.w1().dismiss();
            }
            Gson gson = new Gson();
            if (pendingTransRegNoModel.size() <= 0) {
                VahanVerifyPendingTransaction vahanVerifyPendingTransaction = VahanVerifyPendingTransaction.this;
                vahanVerifyPendingTransaction.H1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.t1().b("no_pending_trans", "No pending transaction found for this application no."));
                return;
            }
            Intent intent = new Intent(VahanVerifyPendingTransaction.this, (Class<?>) VahanVerifyPendingTransactionList.class);
            intent.putExtra("selectedTab", VahanVerifyPendingTransaction.this.selectedTab);
            sh shVar = VahanVerifyPendingTransaction.this.binding;
            if (shVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar = null;
            }
            intent.putExtra("inputNo", shVar.f.getText().toString());
            intent.putExtra("listValue", gson.toJson(pendingTransRegNoModel));
            VahanVerifyPendingTransaction.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingTransRegNoModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(PendingTransRegNoModel pendingTransRegNoModel) {
            if (VahanVerifyPendingTransaction.this.w1().isShowing()) {
                VahanVerifyPendingTransaction.this.w1().dismiss();
            }
            Gson gson = new Gson();
            if (pendingTransRegNoModel.size() <= 0) {
                VahanVerifyPendingTransaction vahanVerifyPendingTransaction = VahanVerifyPendingTransaction.this;
                vahanVerifyPendingTransaction.H1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.t1().b("no_pending_trans", "No pending transaction found for this application no."));
                return;
            }
            Intent intent = new Intent(VahanVerifyPendingTransaction.this, (Class<?>) VahanVerifyPendingTransactionList.class);
            intent.putExtra("selectedTab", VahanVerifyPendingTransaction.this.selectedTab);
            sh shVar = VahanVerifyPendingTransaction.this.binding;
            if (shVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar = null;
            }
            intent.putExtra("inputNo", shVar.f.getText().toString());
            intent.putExtra("listValue", gson.toJson(pendingTransRegNoModel));
            VahanVerifyPendingTransaction.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingTransRegNoModel) obj);
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
            if (VahanVerifyPendingTransaction.this.w1().isShowing()) {
                VahanVerifyPendingTransaction.this.w1().dismiss();
            }
            if (str.toString().equals("ERROR")) {
                VahanVerifyPendingTransaction vahanVerifyPendingTransaction = VahanVerifyPendingTransaction.this;
                vahanVerifyPendingTransaction.H1(vahanVerifyPendingTransaction, vahanVerifyPendingTransaction.t1().b("no_pending_trans", "No pending transaction found for this application no."));
            } else {
                VahanVerifyPendingTransaction vahanVerifyPendingTransaction2 = VahanVerifyPendingTransaction.this;
                vahanVerifyPendingTransaction2.H1(vahanVerifyPendingTransaction2, str);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A1(VahanVerifyPendingTransaction this$0, Ref.ObjectRef languageSession, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        sh shVar = null;
        if (Intrinsics.areEqual(this$0.selectedTab, "Transaction")) {
            sh shVar2 = this$0.binding;
            if (shVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar2 = null;
            }
            Editable text = shVar2.f.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() != 0) {
                sh shVar3 = this$0.binding;
                if (shVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    shVar = shVar3;
                }
                this$0.v1(shVar.f.getText().toString());
                return;
            }
            sh shVar4 = this$0.binding;
            if (shVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar4 = null;
            }
            shVar4.f.setError(((wa3) languageSession.element).b("PLEASE_ENTER_APPLICATION", this$0.getString(R.string.please_enter_valid_app_no)));
            sh shVar5 = this$0.binding;
            if (shVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                shVar = shVar5;
            }
            shVar.f.requestFocus();
            return;
        }
        sh shVar6 = this$0.binding;
        if (shVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar6 = null;
        }
        Editable text2 = shVar6.f.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            sh shVar7 = this$0.binding;
            if (shVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar7 = null;
            }
            shVar7.f.setError(((wa3) languageSession.element).b("PLEASE_ENTER_REG", this$0.getString(R.string.please_enter_reg_no)));
            sh shVar8 = this$0.binding;
            if (shVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                shVar = shVar8;
            }
            shVar.f.requestFocus();
            return;
        }
        sh shVar9 = this$0.binding;
        if (shVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar9 = null;
        }
        EditText inputChasisEt = shVar9.e;
        Intrinsics.checkNotNullExpressionValue(inputChasisEt, "inputChasisEt");
        if (inputChasisEt.getVisibility() == 0) {
            sh shVar10 = this$0.binding;
            if (shVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar10 = null;
            }
            Editable text3 = shVar10.e.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            if (text3.length() == 0) {
                sh shVar11 = this$0.binding;
                if (shVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    shVar11 = null;
                }
                shVar11.e.setError(((wa3) languageSession.element).b("PLEASE_ENTER_CHASSI", this$0.getString(R.string.please_enter_chassis_no)));
                sh shVar12 = this$0.binding;
                if (shVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    shVar = shVar12;
                }
                shVar.e.requestFocus();
                return;
            }
        }
        sh shVar13 = this$0.binding;
        if (shVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar13 = null;
        }
        EditText inputChasisEt2 = shVar13.e;
        Intrinsics.checkNotNullExpressionValue(inputChasisEt2, "inputChasisEt");
        if (inputChasisEt2.getVisibility() == 0) {
            sh shVar14 = this$0.binding;
            if (shVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar14 = null;
            }
            if (shVar14.e.getText().toString().length() < 5) {
                sh shVar15 = this$0.binding;
                if (shVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    shVar15 = null;
                }
                shVar15.e.setError(((wa3) languageSession.element).b("INVALID_CHASSI", this$0.getString(R.string.invalid_chassis_no)));
                sh shVar16 = this$0.binding;
                if (shVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    shVar = shVar16;
                }
                shVar.e.requestFocus();
                return;
            }
        }
        sh shVar17 = this$0.binding;
        if (shVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar17 = null;
        }
        String string = shVar17.f.getText().toString();
        sh shVar18 = this$0.binding;
        if (shVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            shVar = shVar18;
        }
        this$0.u1(string, shVar.e.getText().toString());
    }

    public static final void B1(VahanVerifyPendingTransaction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void C1(VahanVerifyPendingTransaction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public static final void D1(VahanVerifyPendingTransaction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.I1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ok7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.J1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.zepto.wa3] */
    private final void x1() {
        ApplicationService applicationService = this.retrofitService;
        sh shVar = null;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this);
        sh shVar2 = this.binding;
        if (shVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar2 = null;
        }
        shVar2.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.y1(this.a, objectRef, view);
            }
        });
        sh shVar3 = this.binding;
        if (shVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar3 = null;
        }
        shVar3.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.z1(this.a, objectRef, view);
            }
        });
        sh shVar4 = this.binding;
        if (shVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar4 = null;
        }
        shVar4.f.addTextChangedListener(new a());
        sh shVar5 = this.binding;
        if (shVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar5 = null;
        }
        shVar5.e.addTextChangedListener(new b());
        sh shVar6 = this.binding;
        if (shVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar6 = null;
        }
        shVar6.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.A1(this.a, objectRef, view);
            }
        });
        sh shVar7 = this.binding;
        if (shVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar7 = null;
        }
        shVar7.g.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.B1(this.a, view);
            }
        });
        sh shVar8 = this.binding;
        if (shVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            shVar = shVar8;
        }
        shVar.g.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.C1(this.a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y1(VahanVerifyPendingTransaction this$0, Ref.ObjectRef languageSession, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        sh shVar = this$0.binding;
        sh shVar2 = null;
        if (shVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar = null;
        }
        if (shVar.l.isSelected()) {
            sh shVar3 = this$0.binding;
            if (shVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar3 = null;
            }
            shVar3.l.setChecked(false);
            sh shVar4 = this$0.binding;
            if (shVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar4 = null;
            }
            shVar4.l.setSelected(false);
            sh shVar5 = this$0.binding;
            if (shVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                shVar2 = shVar5;
            }
            shVar2.k.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        sh shVar6 = this$0.binding;
        if (shVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar6 = null;
        }
        shVar6.l.setChecked(true);
        sh shVar7 = this$0.binding;
        if (shVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar7 = null;
        }
        shVar7.l.setSelected(true);
        sh shVar8 = this$0.binding;
        if (shVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar8 = null;
        }
        shVar8.k.setBackgroundResource(R.drawable.corner_circle_14_selected);
        sh shVar9 = this$0.binding;
        if (shVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar9 = null;
        }
        shVar9.i.setChecked(false);
        sh shVar10 = this$0.binding;
        if (shVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar10 = null;
        }
        shVar10.i.setSelected(false);
        sh shVar11 = this$0.binding;
        if (shVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar11 = null;
        }
        shVar11.f.setText("");
        sh shVar12 = this$0.binding;
        if (shVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar12 = null;
        }
        shVar12.h.setBackgroundResource(R.drawable.corner_circle_bg_14);
        sh shVar13 = this$0.binding;
        if (shVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar13 = null;
        }
        shVar13.e.setVisibility(8);
        sh shVar14 = this$0.binding;
        if (shVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar14 = null;
        }
        shVar14.c.setText(((wa3) languageSession.element).b("vahan_application_no", "Application Number"));
        sh shVar15 = this$0.binding;
        if (shVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar15 = null;
        }
        shVar15.b.setVisibility(8);
        sh shVar16 = this$0.binding;
        if (shVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            shVar2 = shVar16;
        }
        shVar2.f.setHint(((wa3) languageSession.element).b(va3.a.E(), "Enter Application Number"));
        this$0.selectedTab = "Transaction";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z1(VahanVerifyPendingTransaction this$0, Ref.ObjectRef languageSession, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        sh shVar = this$0.binding;
        sh shVar2 = null;
        if (shVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar = null;
        }
        if (shVar.i.isSelected()) {
            sh shVar3 = this$0.binding;
            if (shVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar3 = null;
            }
            shVar3.i.setChecked(false);
            sh shVar4 = this$0.binding;
            if (shVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                shVar4 = null;
            }
            shVar4.i.setSelected(false);
            sh shVar5 = this$0.binding;
            if (shVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                shVar2 = shVar5;
            }
            shVar2.h.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        sh shVar6 = this$0.binding;
        if (shVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar6 = null;
        }
        shVar6.i.setChecked(true);
        sh shVar7 = this$0.binding;
        if (shVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar7 = null;
        }
        shVar7.i.setSelected(true);
        sh shVar8 = this$0.binding;
        if (shVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar8 = null;
        }
        shVar8.h.setBackgroundResource(R.drawable.corner_circle_14_selected);
        sh shVar9 = this$0.binding;
        if (shVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar9 = null;
        }
        shVar9.l.setChecked(false);
        sh shVar10 = this$0.binding;
        if (shVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar10 = null;
        }
        shVar10.l.setSelected(false);
        sh shVar11 = this$0.binding;
        if (shVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar11 = null;
        }
        shVar11.k.setBackgroundResource(R.drawable.corner_circle_bg_14);
        sh shVar12 = this$0.binding;
        if (shVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar12 = null;
        }
        shVar12.e.setVisibility(0);
        sh shVar13 = this$0.binding;
        if (shVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar13 = null;
        }
        shVar13.f.setHint(((wa3) languageSession.element).b("vahan_enter_registration_no", "Enter Registration Number"));
        sh shVar14 = this$0.binding;
        if (shVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar14 = null;
        }
        shVar14.f.setText("");
        this$0.selectedTab = "RC";
        sh shVar15 = this$0.binding;
        if (shVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar15 = null;
        }
        shVar15.c.setText(((wa3) languageSession.element).b("vahan_registration_no", "Registration Number"));
        sh shVar16 = this$0.binding;
        if (shVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            shVar2 = shVar16;
        }
        shVar2.b.setVisibility(0);
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void G1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_pending_transaction);
        sh shVarC = sh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(shVarC, "inflate(...)");
        this.binding = shVarC;
        jv jvVar = null;
        if (shVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVarC = null;
        }
        setContentView(shVarC.b());
        ta3.a aVar = ta3.a;
        sh shVar = this.binding;
        if (shVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar = null;
        }
        aVar.r2(this, shVar);
        getWindow().addFlags(128);
        F1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        sh shVar2 = this.binding;
        if (shVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            shVar2 = null;
        }
        shVar2.g.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransaction.D1(this.a, view);
            }
        });
        G1(new ProgressDialog(this));
        w1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        x1();
        jv jvVar2 = this.viewModel;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar2 = null;
        }
        jvVar2.w().g(this, new f(new c()));
        jv jvVar3 = this.viewModel;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar3 = null;
        }
        jvVar3.x().g(this, new f(new d()));
        jv jvVar4 = this.viewModel;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            jvVar = jvVar4;
        }
        jvVar.v().g(this, new f(new e()));
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final void u1(String rcNo, String chassisNo) {
        if (w1().isShowing()) {
            w1().dismiss();
        }
        w1().show();
        jv jvVar = this.viewModel;
        if (jvVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar = null;
        }
        jvVar.t(this, rcNo, chassisNo);
    }

    public final void v1(String transactionNo) {
        if (w1().isShowing()) {
            w1().dismiss();
        }
        w1().show();
        jv jvVar = this.viewModel;
        if (jvVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar = null;
        }
        jvVar.u(this, transactionNo);
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
