package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
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
import com.zepto.yy0;
import com.zepto.zy1;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
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
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bb\u0010cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR2\u0010O\u001a\u0012\u0012\u0004\u0012\u00020G0Fj\b\u0012\u0004\u0012\u00020G`H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\u0015¨\u0006d"}, d2 = {"Lcom/nic/mparivahan/Echallan/PaymentSearchChallan;", "Lcom/zepto/pq;", "", "F1", "f2", "R1", "", "e2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "Q1", "Landroid/content/Context;", "context", "message", "c2", "a2", "b2", "C", "Ljava/lang/String;", "inputType", "", "D", "I", "selectedTab", "Lcom/zepto/wf;", "E", "Lcom/zepto/wf;", "binding", "Lcom/zepto/a55;", "F", "Lcom/zepto/a55;", "C1", "()Lcom/zepto/a55;", "X1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "G", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "B1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "W1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "dialog", "Lcom/zepto/ws6;", "Lcom/zepto/ws6;", "E1", "()Lcom/zepto/ws6;", "Z1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "J", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "y1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "T1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "x1", "()Ljava/util/ArrayList;", "S1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/b31;", "L", "Lcom/zepto/b31;", "D1", "()Lcom/zepto/b31;", "Y1", "(Lcom/zepto/b31;)V", "myRcAdapter", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "V1", "(Lcom/zepto/wa3;)V", "langSession", "N", "serviceCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPaymentSearchChallan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSearchChallan.kt\ncom/nic/mparivahan/Echallan/PaymentSearchChallan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,825:1\n1#2:826\n*E\n"})
public final class PaymentSearchChallan extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int selectedTab;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wf binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String inputType = "RC";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceCode = "";

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
        public final void a(ValidateRcSuccess validateRcSuccess) {
            if (PaymentSearchChallan.this.z1().isShowing()) {
                PaymentSearchChallan.this.z1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                    PaymentSearchChallan paymentSearchChallan = PaymentSearchChallan.this;
                    paymentSearchChallan.c2(paymentSearchChallan, validateRcSuccess.getStatusDesc());
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                    hz0.a.Q(PaymentSearchChallan.this, validateRcSuccess.getStatusDesc(), 1);
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                    hz0.a.Q(PaymentSearchChallan.this, validateRcSuccess.getStatusDesc(), 2);
                    return;
                } else {
                    PaymentSearchChallan paymentSearchChallan2 = PaymentSearchChallan.this;
                    paymentSearchChallan2.c2(paymentSearchChallan2, paymentSearchChallan2.A1().b("error_msg_record_not_found", PaymentSearchChallan.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            int i = PaymentSearchChallan.this.selectedTab;
            wf wfVar = null;
            if (i == 0) {
                wf wfVar2 = PaymentSearchChallan.this.binding;
                if (wfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar2 = null;
                }
                if (StringsKt__StringNumberConversionsKt.toIntOrNull(wfVar2.m.getText().toString()) != null) {
                    Intent intent = new Intent(PaymentSearchChallan.this, (Class<?>) NoticeSearchList.class);
                    wf wfVar3 = PaymentSearchChallan.this.binding;
                    if (wfVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        wfVar = wfVar3;
                    }
                    intent.putExtra("inputValue", wfVar.m.getText().toString());
                    intent.putExtra("inputType", "RC");
                    intent.putExtra("Service_code", PaymentSearchChallan.this.serviceCode);
                    PaymentSearchChallan.this.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent(PaymentSearchChallan.this, (Class<?>) NoticeChallanVehicleSearchList.class);
                wf wfVar4 = PaymentSearchChallan.this.binding;
                if (wfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar4 = null;
                }
                intent2.putExtra("inputValue", wfVar4.m.getText().toString());
                wf wfVar5 = PaymentSearchChallan.this.binding;
                if (wfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar5 = null;
                }
                intent2.putExtra("inputchassisno", wfVar5.f.getText().toString());
                wf wfVar6 = PaymentSearchChallan.this.binding;
                if (wfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar = wfVar6;
                }
                intent2.putExtra("inputengineno", wfVar.j.getText().toString());
                intent2.putExtra("Service_code", PaymentSearchChallan.this.serviceCode);
                intent2.putExtra("inputType", PaymentSearchChallan.this.inputType);
                PaymentSearchChallan.this.startActivity(intent2);
                return;
            }
            if (i == 1) {
                Intent intent3 = new Intent(PaymentSearchChallan.this, (Class<?>) TranscationStatusActivity.class);
                wf wfVar7 = PaymentSearchChallan.this.binding;
                if (wfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar7 = null;
                }
                intent3.putExtra("inputValue", wfVar7.m.getText().toString());
                wf wfVar8 = PaymentSearchChallan.this.binding;
                if (wfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar8 = null;
                }
                intent3.putExtra("inputchassisno", wfVar8.f.getText().toString());
                wf wfVar9 = PaymentSearchChallan.this.binding;
                if (wfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar = wfVar9;
                }
                intent3.putExtra("inputengineno", wfVar.j.getText().toString());
                intent3.putExtra("inputType", PaymentSearchChallan.this.inputType);
                PaymentSearchChallan.this.startActivity(intent3);
                return;
            }
            if (i != 2) {
                return;
            }
            Intent intent4 = new Intent(PaymentSearchChallan.this, (Class<?>) ReprintReceiptActivity.class);
            wf wfVar10 = PaymentSearchChallan.this.binding;
            if (wfVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar10 = null;
            }
            intent4.putExtra("inputValue", wfVar10.m.getText().toString());
            wf wfVar11 = PaymentSearchChallan.this.binding;
            if (wfVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar11 = null;
            }
            intent4.putExtra("inputchassisno", wfVar11.f.getText().toString());
            wf wfVar12 = PaymentSearchChallan.this.binding;
            if (wfVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar12;
            }
            intent4.putExtra("inputengineno", wfVar.j.getText().toString());
            intent4.putExtra("inputType", PaymentSearchChallan.this.inputType);
            PaymentSearchChallan.this.startActivity(intent4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ValidateRcSuccess) obj);
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
            if (PaymentSearchChallan.this.z1().isShowing()) {
                PaymentSearchChallan.this.z1().dismiss();
            }
            PaymentSearchChallan paymentSearchChallan = PaymentSearchChallan.this;
            paymentSearchChallan.c2(paymentSearchChallan, paymentSearchChallan.A1().b("error_msg_record_not_found", PaymentSearchChallan.this.getString(R.string.service_unavable_please_try)));
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    private final void F1() {
        Z1(new ws6(this));
        W1(RcService.INSTANCE.a(this));
        X1((a55) new z(this, new b55(new s45(B1()))).a(a55.class));
        wf wfVar = this.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        EditText editText = wfVar.m;
        InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        editText.setFilters((InputFilter[]) ArraysKt___ArraysJvmKt.plus((InputFilter.AllCaps[]) filters, new InputFilter.AllCaps()));
        zy1.a aVar = zy1.a;
        wf wfVar3 = this.binding;
        if (wfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar3 = null;
        }
        EditText engineEt = wfVar3.j;
        Intrinsics.checkNotNullExpressionValue(engineEt, "engineEt");
        aVar.a(this, engineEt);
        wf wfVar4 = this.binding;
        if (wfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar4 = null;
        }
        EditText inputEt = wfVar4.m;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        aVar.a(this, inputEt);
        wf wfVar5 = this.binding;
        if (wfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar5 = null;
        }
        EditText chasisEt = wfVar5.f;
        Intrinsics.checkNotNullExpressionValue(chasisEt, "chasisEt");
        aVar.a(this, chasisEt);
        wf wfVar6 = this.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.an4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.G1(this.a, view);
            }
        });
        wf wfVar7 = this.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PaymentSearchChallan.H1(this.a, view);
            }
        });
        wf wfVar8 = this.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PaymentSearchChallan.I1(this.a, view);
            }
        });
        wf wfVar9 = this.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.J1(this.a, view);
            }
        });
        wf wfVar10 = this.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.en4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.K1(this.a, view);
            }
        });
        wf wfVar11 = this.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.E.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.L1(this.a, view);
            }
        });
        wf wfVar12 = this.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.E.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.M1(this.a, view);
            }
        });
        wf wfVar13 = this.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PaymentSearchChallan.N1(this.a, view);
            }
        });
        wf wfVar14 = this.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.in4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PaymentSearchChallan.O1(this.a, view);
            }
        });
        wf wfVar15 = this.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar15;
        }
        wfVar2.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                PaymentSearchChallan.P1(this.a, view);
            }
        });
    }

    public static final void G1(PaymentSearchChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.e.isSelected()) {
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
            this$0.inputType = "";
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
        wfVar22.m.setHint(this$0.A1().b("enterCNoticePlaceHolder", this$0.getString(R.string.enter_challan_notice_no)));
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.M.setVisibility(8);
        this$0.inputType = "Challan";
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.m.setError(null);
    }

    public static final void H1(PaymentSearchChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.O.isSelected()) {
            wf wfVar3 = this$0.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.O.setChecked(false);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.O.setSelected(false);
            this$0.inputType = "";
            wf wfVar5 = this$0.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar5 = null;
            }
            wfVar5.M.setVisibility(8);
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
        wfVar21.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.m.setHint(this$0.A1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.M.setVisibility(0);
        this$0.inputType = "RC";
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.m.setError(null);
        wf wfVar25 = this$0.binding;
        if (wfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar25;
        }
        wfVar2.Q.setVisibility(8);
        this$0.a2();
    }

    public static final void I1(PaymentSearchChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        if (wfVar.g.isSelected()) {
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
            this$0.inputType = "";
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
        wfVar7.w.setVisibility(8);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.R.setVisibility(8);
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
        wfVar21.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(18)});
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.M.setVisibility(8);
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.m.setHint(this$0.A1().b("label_challan_enter_dl_no", this$0.getString(R.string.enter_dl_number)));
        this$0.inputType = "DL";
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.m.setError(null);
        this$0.b2();
    }

    public static final void J1(PaymentSearchChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.e2() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                this$0.c2(this$0, this$0.A1().b("label_challan_please_select_one_search_type", "Please select one search type"));
                return;
            }
            return;
        }
        int i = this$0.selectedTab;
        wf wfVar = null;
        if (i == 0) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.f2();
                return;
            }
            wf wfVar2 = this$0.binding;
            if (wfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar2 = null;
            }
            if (StringsKt__StringNumberConversionsKt.toIntOrNull(wfVar2.m.getText().toString()) != null) {
                Intent intent = new Intent(this$0, (Class<?>) NoticeSearchList.class);
                wf wfVar3 = this$0.binding;
                if (wfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar = wfVar3;
                }
                intent.putExtra("inputValue", wfVar.m.getText().toString());
                intent.putExtra("inputType", "Notice");
                intent.putExtra("Service_code", this$0.serviceCode);
                this$0.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent(this$0, (Class<?>) PaymentSearchChallanList.class);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar4;
            }
            intent2.putExtra("inputValue", wfVar.m.getText().toString());
            intent2.putExtra("inputType", this$0.inputType);
            intent2.putExtra("inputchassisno", "");
            intent2.putExtra("inputengineno", "");
            intent2.putExtra("Service_code", this$0.serviceCode);
            this$0.startActivity(intent2);
            return;
        }
        if (i == 1) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.f2();
                return;
            }
            Intent intent3 = new Intent(this$0, (Class<?>) TranscationStatusActivity.class);
            wf wfVar5 = this$0.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar5;
            }
            intent3.putExtra("inputValue", wfVar.m.getText().toString());
            intent3.putExtra("inputType", this$0.inputType);
            intent3.putExtra("inputchassisno", "");
            intent3.putExtra("inputengineno", "");
            this$0.startActivity(intent3);
            return;
        }
        if (i != 2) {
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.f2();
            return;
        }
        Intent intent4 = new Intent(this$0, (Class<?>) ReprintReceiptActivity.class);
        wf wfVar6 = this$0.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar = wfVar6;
        }
        intent4.putExtra("inputValue", wfVar.m.getText().toString());
        intent4.putExtra("inputType", this$0.inputType);
        intent4.putExtra("inputchassisno", "");
        intent4.putExtra("inputengineno", "");
        this$0.startActivity(intent4);
    }

    public static final void K1(PaymentSearchChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wf wfVar = null;
        if (this$0.selectedTab == 0) {
            Intent intent = new Intent(this$0, (Class<?>) PaymentSearchChallanList.class);
            wf wfVar2 = this$0.binding;
            if (wfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar2 = null;
            }
            intent.putExtra("inputValue", wfVar2.v.getText().toString());
            intent.putExtra("inputType", "DL");
            intent.putExtra("inputchassisno", "");
            intent.putExtra("inputengineno", "");
            this$0.startActivity(intent);
        }
        if (this$0.selectedTab == 1) {
            Intent intent2 = new Intent(this$0, (Class<?>) TranscationStatusActivity.class);
            wf wfVar3 = this$0.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            intent2.putExtra("inputValue", wfVar3.v.getText().toString());
            intent2.putExtra("inputType", "DL");
            intent2.putExtra("inputchassisno", "");
            intent2.putExtra("inputengineno", "");
            this$0.startActivity(intent2);
        }
        if (this$0.selectedTab == 2) {
            Intent intent3 = new Intent(this$0, (Class<?>) ReprintReceiptActivity.class);
            wf wfVar4 = this$0.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar4;
            }
            intent3.putExtra("inputValue", wfVar.v.getText().toString());
            intent3.putExtra("inputType", "DL");
            intent3.putExtra("inputchassisno", "");
            intent3.putExtra("inputengineno", "");
            this$0.startActivity(intent3);
        }
    }

    public static final void L1(PaymentSearchChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void M1(PaymentSearchChallan this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1();
    }

    public static final void N1(PaymentSearchChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedTab = 0;
        this$0.a2();
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        wfVar.Q.setVisibility(8);
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
            wfVar5 = null;
        }
        wfVar5.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar6 = this$0.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.O.setChecked(true);
        wf wfVar7 = this$0.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.O.setSelected(true);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.N.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.g.setChecked(false);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.g.setSelected(false);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.m.setText("");
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.M.setVisibility(0);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.m.setHint(this$0.A1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.q.setBackground(yy0.e(this$0, R.drawable.corner_rectangle_bg_17));
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.H.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.A.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        wfVar18.r.setTextColor(yy0.c(this$0, R.color.white));
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        wfVar19.G.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        wfVar20.B.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.p.setImageResource(R.drawable.ic_pay_challan);
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.F.setImageResource(R.drawable.tax_nexgen);
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.z.setImageResource(R.drawable.tax_nexgen);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.c.setChecked(true);
        wf wfVar25 = this$0.binding;
        if (wfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar25 = null;
        }
        wfVar25.s.setChecked(false);
        wf wfVar26 = this$0.binding;
        if (wfVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar26;
        }
        wfVar2.x.setChecked(false);
    }

    public static final void O1(PaymentSearchChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedTab = 1;
        this$0.a2();
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        wfVar.Q.setVisibility(8);
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
            wfVar5 = null;
        }
        wfVar5.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar6 = this$0.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.O.setChecked(true);
        wf wfVar7 = this$0.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.O.setSelected(true);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.N.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.g.setChecked(false);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.g.setSelected(false);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.m.setText("");
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.M.setVisibility(0);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.m.setHint(this$0.A1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.q.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.H.setBackground(yy0.e(this$0, R.drawable.corner_rectangle_bg_17));
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.A.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        wfVar18.r.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        wfVar19.G.setTextColor(yy0.c(this$0, R.color.white));
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        wfVar20.B.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.p.setImageResource(R.drawable.tax_nexgen);
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.F.setImageResource(R.drawable.ic_pay_challan);
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.z.setImageResource(R.drawable.tax_nexgen);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.c.setChecked(false);
        wf wfVar25 = this$0.binding;
        if (wfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar25 = null;
        }
        wfVar25.s.setChecked(true);
        wf wfVar26 = this$0.binding;
        if (wfVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar26;
        }
        wfVar2.x.setChecked(false);
    }

    public static final void P1(PaymentSearchChallan this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedTab = 2;
        this$0.a2();
        wf wfVar = this$0.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        wfVar.Q.setVisibility(8);
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
            wfVar5 = null;
        }
        wfVar5.d.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar6 = this$0.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar6 = null;
        }
        wfVar6.O.setChecked(true);
        wf wfVar7 = this$0.binding;
        if (wfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar7 = null;
        }
        wfVar7.O.setSelected(true);
        wf wfVar8 = this$0.binding;
        if (wfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar8 = null;
        }
        wfVar8.N.setBackgroundResource(R.drawable.corner_circle_14_selected);
        wf wfVar9 = this$0.binding;
        if (wfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar9 = null;
        }
        wfVar9.g.setChecked(false);
        wf wfVar10 = this$0.binding;
        if (wfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar10 = null;
        }
        wfVar10.g.setSelected(false);
        wf wfVar11 = this$0.binding;
        if (wfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar11 = null;
        }
        wfVar11.m.setText("");
        wf wfVar12 = this$0.binding;
        if (wfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar12 = null;
        }
        wfVar12.i.setBackgroundResource(R.drawable.corner_circle_bg_14);
        wf wfVar13 = this$0.binding;
        if (wfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar13 = null;
        }
        wfVar13.M.setVisibility(0);
        wf wfVar14 = this$0.binding;
        if (wfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar14 = null;
        }
        wfVar14.m.setHint(this$0.A1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        wf wfVar15 = this$0.binding;
        if (wfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar15 = null;
        }
        wfVar15.q.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar16 = this$0.binding;
        if (wfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar16 = null;
        }
        wfVar16.H.setBackground(yy0.e(this$0, R.drawable.nexgendashboardmenu));
        wf wfVar17 = this$0.binding;
        if (wfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar17 = null;
        }
        wfVar17.A.setBackground(yy0.e(this$0, R.drawable.corner_rectangle_bg_17));
        wf wfVar18 = this$0.binding;
        if (wfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar18 = null;
        }
        wfVar18.r.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar19 = this$0.binding;
        if (wfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar19 = null;
        }
        wfVar19.G.setTextColor(yy0.c(this$0, R.color.black));
        wf wfVar20 = this$0.binding;
        if (wfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar20 = null;
        }
        wfVar20.B.setTextColor(yy0.c(this$0, R.color.white));
        wf wfVar21 = this$0.binding;
        if (wfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar21 = null;
        }
        wfVar21.p.setImageResource(R.drawable.tax_nexgen);
        wf wfVar22 = this$0.binding;
        if (wfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar22 = null;
        }
        wfVar22.F.setImageResource(R.drawable.tax_nexgen);
        wf wfVar23 = this$0.binding;
        if (wfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar23 = null;
        }
        wfVar23.z.setImageResource(R.drawable.ic_pay_challan);
        wf wfVar24 = this$0.binding;
        if (wfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar24 = null;
        }
        wfVar24.c.setChecked(false);
        wf wfVar25 = this$0.binding;
        if (wfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar25 = null;
        }
        wfVar25.s.setChecked(false);
        wf wfVar26 = this$0.binding;
        if (wfVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar2 = wfVar26;
        }
        wfVar2.x.setChecked(true);
    }

    private final void R1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void d2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean e2() {
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
                if (!Q1(strSubstring)) {
                    wf wfVar8 = this.binding;
                    if (wfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        wfVar8 = null;
                    }
                    wfVar8.m.setError(A1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
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
                    wfVar10.m.setError(A1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
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
                    wfVar12.m.setError(A1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
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
                wfVar14.m.setError(A1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
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
                wfVar16.m.setError(A1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
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
                wfVar18.m.setError(A1().b("label_challan_rc_validation", getString(R.string.rc_text)));
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
                wfVar20.m.setError(A1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                wf wfVar21 = this.binding;
                if (wfVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar21;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            wf wfVar22 = this.binding;
            if (wfVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar22 = null;
            }
            if (wfVar22.f.getText().toString().length() < 5) {
                wf wfVar23 = this.binding;
                if (wfVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar23 = null;
                }
                wfVar23.f.setError(A1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."));
                wf wfVar24 = this.binding;
                if (wfVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar24;
                }
                wfVar2.f.requestFocus();
                return true;
            }
            wf wfVar25 = this.binding;
            if (wfVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar25 = null;
            }
            if (wfVar25.j.getText().toString().length() < 5) {
                wf wfVar26 = this.binding;
                if (wfVar26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar26 = null;
                }
                wfVar26.j.setError(A1().b("label_challan_valid_engine_no", "Please enter the valid last 5 digit of engine no"));
                wf wfVar27 = this.binding;
                if (wfVar27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar27;
                }
                wfVar2.j.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                wf wfVar28 = this.binding;
                if (wfVar28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar28 = null;
                }
                wfVar28.m.setError(A1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                wf wfVar29 = this.binding;
                if (wfVar29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar29;
                }
                wfVar2.m.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                wf wfVar30 = this.binding;
                if (wfVar30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wfVar30 = null;
                }
                wfVar30.m.setError(A1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                wf wfVar31 = this.binding;
                if (wfVar31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wfVar2 = wfVar31;
                }
                wfVar2.m.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void f2() {
        z1().show();
        a55 a55VarC1 = C1();
        wf wfVar = this.binding;
        wf wfVar2 = null;
        if (wfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar = null;
        }
        String string = wfVar.m.getText().toString();
        String string2 = E1().k().toString();
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
        a55VarC1.m(string, string2, string3, wfVar2.j.getText().toString(), this, hz0.a.n());
    }

    public final wa3 A1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final RcService B1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 C1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final b31 D1() {
        b31 b31Var = this.myRcAdapter;
        if (b31Var != null) {
            return b31Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final ws6 E1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final boolean Q1(String string) {
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

    public final void S1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void T1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.dialog = progressDialog;
    }

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void W1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void X1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void Y1(b31 b31Var) {
        Intrinsics.checkNotNullParameter(b31Var, "<set-?>");
        this.myRcAdapter = b31Var;
    }

    public final void Z1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void a2() throws Throwable {
        ArrayList arrayListH0 = y1().H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
        S1(arrayListH0);
        wf wfVar = null;
        if (x1().size() <= 0) {
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
        if (this.selectedTab == 0) {
            b31 b31Var = new b31(x1(), this, 10, "");
            Intrinsics.checkNotNull(b31Var);
            Y1(b31Var);
        }
        if (this.selectedTab == 1) {
            b31 b31Var2 = new b31(x1(), this, 11, "");
            Intrinsics.checkNotNull(b31Var2);
            Y1(b31Var2);
        }
        if (this.selectedTab == 2) {
            b31 b31Var3 = new b31(x1(), this, 12, "");
            Intrinsics.checkNotNull(b31Var3);
            Y1(b31Var3);
        }
        wf wfVar6 = this.binding;
        if (wfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar = wfVar6;
        }
        wfVar.w.setAdapter(D1());
    }

    public final void b2() throws Throwable {
        DlobjX dlobj;
        String dlLicno = null;
        wf wfVar = null;
        dlLicno = null;
        if (this.selectedTab == 0) {
            wf wfVar2 = this.binding;
            if (wfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar2 = null;
            }
            wfVar2.P.setText(A1().b("label_view_challan", getString(R.string.show_recent_challan)));
        }
        if (this.selectedTab == 1) {
            wf wfVar3 = this.binding;
            if (wfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar3 = null;
            }
            wfVar3.P.setText(A1().b("label_challan_payment_status", "Transaction Status"));
        }
        if (this.selectedTab == 2) {
            wf wfVar4 = this.binding;
            if (wfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wfVar4 = null;
            }
            wfVar4.P.setText(A1().b("label_challan_reprint_receipt", "Reprint Receipt"));
        }
        if (y1().z0() == null) {
            wf wfVar5 = this.binding;
            if (wfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wfVar = wfVar5;
            }
            wfVar.Q.setVisibility(8);
            return;
        }
        try {
            ArrayList arrayListZ0 = y1().z0();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c2(Context context, String message) {
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
        textView.setText(A1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(A1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ym4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallan.d2(dialog, view);
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
        V1(new wa3(this));
        az1.a aVar = az1.a;
        wf wfVar2 = this.binding;
        if (wfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wfVar2 = null;
        }
        aVar.c(this, wfVar2);
        U1(new ProgressDialog(this));
        z1().setMessage(A1().b("label_challan_please_wait", "Please wait..."));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra);
            this.serviceCode = stringExtra;
        }
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        T1(databaseHelperD0);
        wf wfVar3 = this.binding;
        if (wfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wfVar = wfVar3;
        }
        wfVar.w.setLayoutManager(new LinearLayoutManager(this, 0, false));
        a2();
        F1();
        C1().V().g(this, new c(new a()));
        C1().W().g(this, new c(new b()));
    }

    public final ArrayList x1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final DatabaseHelper y1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }
}
