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
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.az1;
import com.zepto.b31;
import com.zepto.b55;
import com.zepto.bg;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.wa3;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bk\u0010lJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR2\u0010L\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010R\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0019\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010\u0019R\u0016\u0010f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\u0019R\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchPrintReceiptActivity;", "Lcom/zepto/pq;", "", "B1", "Y1", "K1", "", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "J1", "Landroid/content/Context;", "context", "message", "V1", "T1", "U1", "Lcom/zepto/bg;", "C", "Lcom/zepto/bg;", "binding", "D", "Ljava/lang/String;", "inputType", "Lcom/zepto/a55;", "E", "Lcom/zepto/a55;", "y1", "()Lcom/zepto/a55;", "Q1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "F", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "x1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "P1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "dialog", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "A1", "()Lcom/zepto/ws6;", "S1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "I", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "u1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "M1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "t1", "()Ljava/util/ArrayList;", "L1", "(Ljava/util/ArrayList;)V", "arrayList", "K", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Lcom/zepto/b31;", "L", "Lcom/zepto/b31;", "z1", "()Lcom/zepto/b31;", "R1", "(Lcom/zepto/b31;)V", "myRcAdapter", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "N", "serviceName", "O", "serviceCode", "Landroid/text/TextWatcher;", "P", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SearchPrintReceiptActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bg binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "RC";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String name = " ";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String serviceCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
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
            bg bgVar = SearchPrintReceiptActivity.this.binding;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar = null;
            }
            bgVar.d.setError(null);
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
            bg bgVar = SearchPrintReceiptActivity.this.binding;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar = null;
            }
            bgVar.h.setError(null);
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
            bg bgVar = SearchPrintReceiptActivity.this.binding;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar = null;
            }
            bgVar.l.setError(null);
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
            if (SearchPrintReceiptActivity.this.v1().isShowing()) {
                SearchPrintReceiptActivity.this.v1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                    SearchPrintReceiptActivity searchPrintReceiptActivity = SearchPrintReceiptActivity.this;
                    searchPrintReceiptActivity.V1(searchPrintReceiptActivity, validateRcSuccess.getStatusDesc());
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                    hz0.a.Q(SearchPrintReceiptActivity.this, validateRcSuccess.getStatusDesc(), 1);
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                    hz0.a.Q(SearchPrintReceiptActivity.this, validateRcSuccess.getStatusDesc(), 2);
                    return;
                } else {
                    SearchPrintReceiptActivity searchPrintReceiptActivity2 = SearchPrintReceiptActivity.this;
                    searchPrintReceiptActivity2.V1(searchPrintReceiptActivity2, searchPrintReceiptActivity2.w1().b("error_msg_record_not_found", SearchPrintReceiptActivity.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            Intent intent = new Intent(SearchPrintReceiptActivity.this, (Class<?>) NoticeChallanVehicleSearchList.class);
            bg bgVar = SearchPrintReceiptActivity.this.binding;
            bg bgVar2 = null;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar = null;
            }
            intent.putExtra("inputValue", bgVar.l.getText().toString());
            intent.putExtra("inputType", SearchPrintReceiptActivity.this.inputType);
            bg bgVar3 = SearchPrintReceiptActivity.this.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar3 = null;
            }
            intent.putExtra("inputchassisno", bgVar3.d.getText().toString());
            bg bgVar4 = SearchPrintReceiptActivity.this.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar2 = bgVar4;
            }
            intent.putExtra("inputengineno", bgVar2.h.getText().toString());
            intent.putExtra("Service_code", SearchPrintReceiptActivity.this.serviceCode);
            SearchPrintReceiptActivity.this.startActivity(intent);
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
            if (SearchPrintReceiptActivity.this.v1().isShowing()) {
                SearchPrintReceiptActivity.this.v1().dismiss();
            }
            SearchPrintReceiptActivity searchPrintReceiptActivity = SearchPrintReceiptActivity.this;
            searchPrintReceiptActivity.V1(searchPrintReceiptActivity, searchPrintReceiptActivity.w1().b("error_msg_record_not_found", SearchPrintReceiptActivity.this.getString(R.string.service_unavable_please_try)));
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
        bg bgVar = null;
        try {
            if (getIntent() == null) {
                bg bgVar2 = this.binding;
                if (bgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar2 = null;
                }
                bgVar2.j.i.setText(w1().b("label_challan_print_receipt", getString(R.string.print_receipt)));
            } else if (getIntent().hasExtra("Service_name")) {
                this.name = String.valueOf(getIntent().getStringExtra("Service_name"));
                bg bgVar3 = this.binding;
                if (bgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar3 = null;
                }
                bgVar3.j.i.setText(w1().b("View_Payment_Receipt", this.name));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar4 = null;
        }
        bgVar4.j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ps5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.C1(this.a, view);
            }
        });
        bg bgVar5 = this.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar5 = null;
        }
        bgVar5.j.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.D1(this.a, view);
            }
        });
        bg bgVar6 = this.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar6 = null;
        }
        bgVar6.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.E1(this.a, view);
            }
        });
        bg bgVar7 = this.binding;
        if (bgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar7 = null;
        }
        bgVar7.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchPrintReceiptActivity.F1(this.a, view);
            }
        });
        bg bgVar8 = this.binding;
        if (bgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar8 = null;
        }
        bgVar8.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchPrintReceiptActivity.G1(this.a, view);
            }
        });
        bg bgVar9 = this.binding;
        if (bgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar9 = null;
        }
        bgVar9.l.addTextChangedListener(this.inputTextWatcher);
        bg bgVar10 = this.binding;
        if (bgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar10 = null;
        }
        bgVar10.d.addTextChangedListener(new a());
        bg bgVar11 = this.binding;
        if (bgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar11 = null;
        }
        bgVar11.h.addTextChangedListener(new b());
        bg bgVar12 = this.binding;
        if (bgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar12 = null;
        }
        bgVar12.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.H1(this.a, view);
            }
        });
        bg bgVar13 = this.binding;
        if (bgVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar = bgVar13;
        }
        bgVar.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.I1(this.a, view);
            }
        });
    }

    public static final void C1(SearchPrintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void D1(SearchPrintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    public static final void E1(SearchPrintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bg bgVar = this$0.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        if (bgVar.c.isSelected()) {
            bg bgVar3 = this$0.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar3 = null;
            }
            bgVar3.c.setChecked(false);
            bg bgVar4 = this$0.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar4 = null;
            }
            bgVar4.c.setSelected(false);
            this$0.inputType = "";
            bg bgVar5 = this$0.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar2 = bgVar5;
            }
            bgVar2.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        bg bgVar6 = this$0.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar6 = null;
        }
        bgVar6.p.setVisibility(8);
        bg bgVar7 = this$0.binding;
        if (bgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar7 = null;
        }
        bgVar7.A.setVisibility(8);
        bg bgVar8 = this$0.binding;
        if (bgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar8 = null;
        }
        bgVar8.z.setVisibility(8);
        bg bgVar9 = this$0.binding;
        if (bgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar9 = null;
        }
        bgVar9.c.setChecked(true);
        bg bgVar10 = this$0.binding;
        if (bgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar10 = null;
        }
        bgVar10.c.setSelected(true);
        bg bgVar11 = this$0.binding;
        if (bgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar11 = null;
        }
        bgVar11.b.setBackgroundResource(R.drawable.corner_circle_14_selected);
        bg bgVar12 = this$0.binding;
        if (bgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar12 = null;
        }
        bgVar12.x.setChecked(false);
        bg bgVar13 = this$0.binding;
        if (bgVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar13 = null;
        }
        bgVar13.x.setSelected(false);
        bg bgVar14 = this$0.binding;
        if (bgVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar14 = null;
        }
        bgVar14.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar15 = this$0.binding;
        if (bgVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar15 = null;
        }
        bgVar15.e.setChecked(false);
        bg bgVar16 = this$0.binding;
        if (bgVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar16 = null;
        }
        bgVar16.e.setSelected(false);
        bg bgVar17 = this$0.binding;
        if (bgVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar17 = null;
        }
        bgVar17.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar18 = this$0.binding;
        if (bgVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar18 = null;
        }
        Editable text = bgVar18.l.getText();
        if (text != null) {
            text.clear();
        }
        bg bgVar19 = this$0.binding;
        if (bgVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar19 = null;
        }
        Editable text2 = bgVar19.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        bg bgVar20 = this$0.binding;
        if (bgVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar20 = null;
        }
        Editable text3 = bgVar20.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        bg bgVar21 = this$0.binding;
        if (bgVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar21 = null;
        }
        bgVar21.l.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
        bg bgVar22 = this$0.binding;
        if (bgVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar22 = null;
        }
        bgVar22.l.setHint(this$0.w1().b("enterCNoticePlaceHolder", this$0.getString(R.string.enter_challan_notice_no)));
        this$0.inputType = "Challan";
        bg bgVar23 = this$0.binding;
        if (bgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar23 = null;
        }
        bgVar23.l.setError(null);
        bg bgVar24 = this$0.binding;
        if (bgVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar24;
        }
        bgVar2.v.setVisibility(8);
    }

    public static final void F1(SearchPrintReceiptActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bg bgVar = this$0.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        if (bgVar.x.isSelected()) {
            bg bgVar3 = this$0.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar3 = null;
            }
            bgVar3.x.setChecked(false);
            bg bgVar4 = this$0.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar4 = null;
            }
            bgVar4.x.setSelected(false);
            this$0.inputType = "";
            bg bgVar5 = this$0.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar5 = null;
            }
            bgVar5.v.setVisibility(8);
            bg bgVar6 = this$0.binding;
            if (bgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar6 = null;
            }
            bgVar6.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
            bg bgVar7 = this$0.binding;
            if (bgVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar7 = null;
            }
            bgVar7.p.setVisibility(8);
            bg bgVar8 = this$0.binding;
            if (bgVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar2 = bgVar8;
            }
            bgVar2.A.setVisibility(8);
            return;
        }
        bg bgVar9 = this$0.binding;
        if (bgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar9 = null;
        }
        bgVar9.c.setChecked(false);
        bg bgVar10 = this$0.binding;
        if (bgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar10 = null;
        }
        bgVar10.c.setSelected(false);
        bg bgVar11 = this$0.binding;
        if (bgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar11 = null;
        }
        bgVar11.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar12 = this$0.binding;
        if (bgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar12 = null;
        }
        bgVar12.x.setChecked(true);
        bg bgVar13 = this$0.binding;
        if (bgVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar13 = null;
        }
        bgVar13.x.setSelected(true);
        bg bgVar14 = this$0.binding;
        if (bgVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar14 = null;
        }
        bgVar14.w.setBackgroundResource(R.drawable.corner_circle_14_selected);
        bg bgVar15 = this$0.binding;
        if (bgVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar15 = null;
        }
        bgVar15.e.setChecked(false);
        bg bgVar16 = this$0.binding;
        if (bgVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar16 = null;
        }
        bgVar16.e.setSelected(false);
        bg bgVar17 = this$0.binding;
        if (bgVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar17 = null;
        }
        bgVar17.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar18 = this$0.binding;
        if (bgVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar18 = null;
        }
        Editable text = bgVar18.l.getText();
        if (text != null) {
            text.clear();
        }
        bg bgVar19 = this$0.binding;
        if (bgVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar19 = null;
        }
        Editable text2 = bgVar19.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        bg bgVar20 = this$0.binding;
        if (bgVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar20 = null;
        }
        Editable text3 = bgVar20.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        bg bgVar21 = this$0.binding;
        if (bgVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar21 = null;
        }
        bgVar21.v.setVisibility(0);
        bg bgVar22 = this$0.binding;
        if (bgVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar22 = null;
        }
        bgVar22.l.setHint(this$0.w1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        bg bgVar23 = this$0.binding;
        if (bgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar23 = null;
        }
        bgVar23.l.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        this$0.inputType = "RC";
        bg bgVar24 = this$0.binding;
        if (bgVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar24 = null;
        }
        bgVar24.l.setError(null);
        bg bgVar25 = this$0.binding;
        if (bgVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar25;
        }
        bgVar2.z.setVisibility(8);
        this$0.T1();
    }

    public static final void G1(SearchPrintReceiptActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bg bgVar = this$0.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        if (bgVar.e.isSelected()) {
            bg bgVar3 = this$0.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar3 = null;
            }
            bgVar3.e.setChecked(false);
            bg bgVar4 = this$0.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar4 = null;
            }
            bgVar4.e.setSelected(false);
            this$0.inputType = "";
            bg bgVar5 = this$0.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar5 = null;
            }
            bgVar5.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            bg bgVar6 = this$0.binding;
            if (bgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar2 = bgVar6;
            }
            bgVar2.z.setVisibility(8);
            return;
        }
        bg bgVar7 = this$0.binding;
        if (bgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar7 = null;
        }
        bgVar7.p.setVisibility(8);
        bg bgVar8 = this$0.binding;
        if (bgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar8 = null;
        }
        bgVar8.A.setVisibility(8);
        bg bgVar9 = this$0.binding;
        if (bgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar9 = null;
        }
        bgVar9.c.setChecked(false);
        bg bgVar10 = this$0.binding;
        if (bgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar10 = null;
        }
        bgVar10.c.setSelected(false);
        bg bgVar11 = this$0.binding;
        if (bgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar11 = null;
        }
        bgVar11.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar12 = this$0.binding;
        if (bgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar12 = null;
        }
        bgVar12.x.setChecked(false);
        bg bgVar13 = this$0.binding;
        if (bgVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar13 = null;
        }
        bgVar13.x.setSelected(false);
        bg bgVar14 = this$0.binding;
        if (bgVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar14 = null;
        }
        bgVar14.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bg bgVar15 = this$0.binding;
        if (bgVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar15 = null;
        }
        bgVar15.e.setChecked(true);
        bg bgVar16 = this$0.binding;
        if (bgVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar16 = null;
        }
        bgVar16.e.setSelected(true);
        bg bgVar17 = this$0.binding;
        if (bgVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar17 = null;
        }
        bgVar17.v.setVisibility(8);
        bg bgVar18 = this$0.binding;
        if (bgVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar18 = null;
        }
        bgVar18.g.setBackgroundResource(R.drawable.corner_circle_14_selected);
        bg bgVar19 = this$0.binding;
        if (bgVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar19 = null;
        }
        Editable text = bgVar19.l.getText();
        if (text != null) {
            text.clear();
        }
        bg bgVar20 = this$0.binding;
        if (bgVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar20 = null;
        }
        Editable text2 = bgVar20.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        bg bgVar21 = this$0.binding;
        if (bgVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar21 = null;
        }
        Editable text3 = bgVar21.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        bg bgVar22 = this$0.binding;
        if (bgVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar22 = null;
        }
        bgVar22.l.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(18)});
        bg bgVar23 = this$0.binding;
        if (bgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar23 = null;
        }
        bgVar23.l.setHint(this$0.w1().b("label_challan_enter_dl_no", this$0.getString(R.string.enter_dl_number)));
        this$0.inputType = "DL";
        bg bgVar24 = this$0.binding;
        if (bgVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar24 = null;
        }
        bgVar24.l.setError(null);
        bg bgVar25 = this$0.binding;
        if (bgVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar25;
        }
        bgVar2.y.setText("Print Challan");
        this$0.U1();
    }

    public static final void H1(SearchPrintReceiptActivity this$0, View view) {
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
            Intent intent = new Intent(this$0, (Class<?>) SearchPrintReceiptListActivity.class);
            bg bgVar = this$0.binding;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar = null;
            }
            intent.putExtra("inputValue", bgVar.l.getText().toString());
            intent.putExtra("inputType", this$0.inputType);
            intent.putExtra("Service_name", this$0.name);
            intent.putExtra("inputchassisno", "");
            intent.putExtra("inputengineno", "");
            this$0.startActivity(intent);
        }
    }

    public static final void I1(SearchPrintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SearchPrintReceiptListActivity.class);
        bg bgVar = this$0.binding;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        intent.putExtra("inputValue", bgVar.o.getText().toString());
        intent.putExtra("inputType", "DL");
        intent.putExtra("Service_name", this$0.name);
        intent.putExtra("inputchassisno", "");
        intent.putExtra("inputengineno", "");
        this$0.startActivity(intent);
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
        bg bgVar = this.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) bgVar.l.getText().toString()).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            bg bgVar3 = this.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) bgVar3.l.getText().toString()).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                bg bgVar4 = this.binding;
                if (bgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar4 = null;
                }
                bgVar4.l.setError(getString(R.string.please_enter_challan_notice_no));
                bg bgVar5 = this.binding;
                if (bgVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar5;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    bg bgVar6 = this.binding;
                    if (bgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bgVar6 = null;
                    }
                    bgVar6.l.setError(getString(R.string.enter_min_notice_no));
                    bg bgVar7 = this.binding;
                    if (bgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bgVar2 = bgVar7;
                    }
                    bgVar2.l.requestFocus();
                    return true;
                }
            } else {
                if (!J1(strSubstring)) {
                    bg bgVar8 = this.binding;
                    if (bgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bgVar8 = null;
                    }
                    bgVar8.l.setError(w1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    bg bgVar9 = this.binding;
                    if (bgVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bgVar2 = bgVar9;
                    }
                    bgVar2.l.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    bg bgVar10 = this.binding;
                    if (bgVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bgVar10 = null;
                    }
                    bgVar10.l.setError(w1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    bg bgVar11 = this.binding;
                    if (bgVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bgVar2 = bgVar11;
                    }
                    bgVar2.l.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    bg bgVar12 = this.binding;
                    if (bgVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bgVar12 = null;
                    }
                    bgVar12.l.setError(w1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    bg bgVar13 = this.binding;
                    if (bgVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bgVar2 = bgVar13;
                    }
                    bgVar2.l.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                bg bgVar14 = this.binding;
                if (bgVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar14 = null;
                }
                bgVar14.l.setError(w1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                bg bgVar15 = this.binding;
                if (bgVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar15;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 4) {
                bg bgVar16 = this.binding;
                if (bgVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar16 = null;
                }
                bgVar16.l.setError(w1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                bg bgVar17 = this.binding;
                if (bgVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar17;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                bg bgVar18 = this.binding;
                if (bgVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar18 = null;
                }
                bgVar18.l.setError(w1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                bg bgVar19 = this.binding;
                if (bgVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar19;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                bg bgVar20 = this.binding;
                if (bgVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar20 = null;
                }
                bgVar20.l.setError(w1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                bg bgVar21 = this.binding;
                if (bgVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar21;
                }
                bgVar2.l.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                bg bgVar22 = this.binding;
                if (bgVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar22 = null;
                }
                bgVar22.l.setError(w1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                bg bgVar23 = this.binding;
                if (bgVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar23;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                bg bgVar24 = this.binding;
                if (bgVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar24 = null;
                }
                bgVar24.l.setError(w1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                bg bgVar25 = this.binding;
                if (bgVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar25;
                }
                bgVar2.l.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void Y1() {
        v1().show();
        a55 a55VarY1 = y1();
        bg bgVar = this.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        String string = bgVar.l.getText().toString();
        String string2 = A1().k().toString();
        bg bgVar3 = this.binding;
        if (bgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar3 = null;
        }
        String string3 = bgVar3.d.getText().toString();
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar4;
        }
        a55VarY1.m(string, string2, string3, bgVar2.h.getText().toString(), this, hz0.a.n());
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
        bg bgVar = null;
        if (t1().size() <= 0) {
            bg bgVar2 = this.binding;
            if (bgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar2 = null;
            }
            bgVar2.p.setVisibility(8);
            bg bgVar3 = this.binding;
            if (bgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar = bgVar3;
            }
            bgVar.A.setVisibility(8);
            return;
        }
        Log.e("Arraylist", "1---------------->");
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar4 = null;
        }
        bgVar4.A.setVisibility(0);
        bg bgVar5 = this.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar5 = null;
        }
        bgVar5.p.setVisibility(0);
        R1(new b31(t1(), this, 2, this.name));
        bg bgVar6 = this.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar = bgVar6;
        }
        bgVar.p.setAdapter(z1());
    }

    public final void U1() throws Throwable {
        DlobjX dlobj;
        String dlLicno = null;
        bg bgVar = null;
        dlLicno = null;
        if (u1().z0() == null) {
            bg bgVar2 = this.binding;
            if (bgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar = bgVar2;
            }
            bgVar.z.setVisibility(8);
            return;
        }
        try {
            if (!gd1.a.m(this.name)) {
                bg bgVar3 = this.binding;
                if (bgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar3 = null;
                }
                bgVar3.y.setText(w1().b("View_Payment_Receipt", this.name));
            }
            bg bgVar4 = this.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar4 = null;
            }
            bgVar4.u.setText(w1().b("label_challan_dl_no", "Driving Licence No"));
            bg bgVar5 = this.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar5 = null;
            }
            bgVar5.n.setText(w1().b("label_challan_my_dl_number", getString(R.string.my_driving_license)));
            ArrayList arrayListZ0 = u1().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            if (((DLDocument) arrayListZ0.get(0)).getDldetails() != null) {
                bg bgVar6 = this.binding;
                if (bgVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar6 = null;
                }
                bgVar6.z.setVisibility(0);
                bg bgVar7 = this.binding;
                if (bgVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar7 = null;
                }
                TextView textView = bgVar7.o;
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.os5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintReceiptActivity.W1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        bg bgVarC = bg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bgVarC, "inflate(...)");
        this.binding = bgVarC;
        bg bgVar = null;
        if (bgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVarC = null;
        }
        setContentView(bgVarC.b());
        O1(new wa3(this));
        az1.a aVar = az1.a;
        bg bgVar2 = this.binding;
        if (bgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar2 = null;
        }
        aVar.j(this, bgVar2);
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
        bg bgVar3 = this.binding;
        if (bgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar3 = null;
        }
        bgVar3.p.setLayoutManager(new LinearLayoutManager(this, 0, false));
        zy1.a aVar2 = zy1.a;
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar4 = null;
        }
        EditText engineEt = bgVar4.h;
        Intrinsics.checkNotNullExpressionValue(engineEt, "engineEt");
        aVar2.a(this, engineEt);
        bg bgVar5 = this.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar5 = null;
        }
        EditText inputEt = bgVar5.l;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        aVar2.a(this, inputEt);
        bg bgVar6 = this.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar = bgVar6;
        }
        EditText chasisEt = bgVar.d;
        Intrinsics.checkNotNullExpressionValue(chasisEt, "chasisEt");
        aVar2.a(this, chasisEt);
        B1();
        T1();
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
