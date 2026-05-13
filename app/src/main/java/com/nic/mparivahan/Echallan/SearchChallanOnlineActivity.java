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
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
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
import com.zepto.ws6;
import com.zepto.yf;
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
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR2\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00104\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchChallanOnlineActivity;", "Lcom/zepto/pq;", "", "B1", "Y1", "K1", "", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "J1", "Landroid/content/Context;", "context", "message", "V1", "T1", "U1", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "C", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "u1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "M1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "t1", "()Ljava/util/ArrayList;", "L1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/b31;", "E", "Lcom/zepto/b31;", "z1", "()Lcom/zepto/b31;", "R1", "(Lcom/zepto/b31;)V", "myRcAdapter", "F", "Ljava/lang/String;", "inputType", "G", "serviceName", "H", "serviceCode", "Lcom/zepto/yf;", "I", "Lcom/zepto/yf;", "binding", "Lcom/zepto/a55;", "J", "Lcom/zepto/a55;", "y1", "()Lcom/zepto/a55;", "Q1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "K", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "x1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "P1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "dialog", "Lcom/zepto/ws6;", "M", "Lcom/zepto/ws6;", "A1", "()Lcom/zepto/ws6;", "S1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "Landroid/text/TextWatcher;", "O", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchChallanOnlineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchChallanOnlineActivity.kt\ncom/nic/mparivahan/Echallan/SearchChallanOnlineActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
public final class SearchChallanOnlineActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public yf binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String inputType = "RC";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String serviceCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final TextWatcher inputTextWatcher = new a();

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
            yf yfVar = SearchChallanOnlineActivity.this.binding;
            if (yfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar = null;
            }
            yfVar.k.setError(null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
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
            if (SearchChallanOnlineActivity.this.v1().isShowing()) {
                SearchChallanOnlineActivity.this.v1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                    SearchChallanOnlineActivity searchChallanOnlineActivity = SearchChallanOnlineActivity.this;
                    searchChallanOnlineActivity.V1(searchChallanOnlineActivity, validateRcSuccess.getStatusDesc());
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                    hz0.a.Q(SearchChallanOnlineActivity.this, validateRcSuccess.getStatusDesc(), 1);
                    return;
                } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                    hz0.a.Q(SearchChallanOnlineActivity.this, validateRcSuccess.getStatusDesc(), 2);
                    return;
                } else {
                    SearchChallanOnlineActivity searchChallanOnlineActivity2 = SearchChallanOnlineActivity.this;
                    searchChallanOnlineActivity2.V1(searchChallanOnlineActivity2, searchChallanOnlineActivity2.w1().b("error_msg_record_not_found", SearchChallanOnlineActivity.this.getString(R.string.service_unavable_please_try)));
                    return;
                }
            }
            Intent intent = new Intent(SearchChallanOnlineActivity.this, (Class<?>) NoticeChallanVehicleSearchList.class);
            yf yfVar = SearchChallanOnlineActivity.this.binding;
            yf yfVar2 = null;
            if (yfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar = null;
            }
            intent.putExtra("inputValue", yfVar.k.getText().toString());
            intent.putExtra("inputType", SearchChallanOnlineActivity.this.inputType);
            yf yfVar3 = SearchChallanOnlineActivity.this.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar3 = null;
            }
            intent.putExtra("inputchassisno", yfVar3.d.getText().toString());
            yf yfVar4 = SearchChallanOnlineActivity.this.binding;
            if (yfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar2 = yfVar4;
            }
            intent.putExtra("inputengineno", yfVar2.h.getText().toString());
            intent.putExtra("Service_code", SearchChallanOnlineActivity.this.serviceCode);
            SearchChallanOnlineActivity.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ValidateRcSuccess) obj);
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
            if (SearchChallanOnlineActivity.this.v1().isShowing()) {
                SearchChallanOnlineActivity.this.v1().dismiss();
            }
            SearchChallanOnlineActivity searchChallanOnlineActivity = SearchChallanOnlineActivity.this;
            searchChallanOnlineActivity.V1(searchChallanOnlineActivity, searchChallanOnlineActivity.w1().b("error_msg_record_not_found", SearchChallanOnlineActivity.this.getString(R.string.service_unavable_please_try)));
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    private final void B1() throws Throwable {
        S1(new ws6(this));
        P1(RcService.INSTANCE.a(this));
        Q1((a55) new z(this, new b55(new s45(x1()))).a(a55.class));
        T1();
        yf yfVar = this.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        yfVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.C1(this.a, view);
            }
        });
        yf yfVar3 = this.binding;
        if (yfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar3 = null;
        }
        yfVar3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchChallanOnlineActivity.D1(this.a, view);
            }
        });
        yf yfVar4 = this.binding;
        if (yfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar4 = null;
        }
        yfVar4.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchChallanOnlineActivity.E1(this.a, view);
            }
        });
        yf yfVar5 = this.binding;
        if (yfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar5 = null;
        }
        yfVar5.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.F1(this.a, view);
            }
        });
        yf yfVar6 = this.binding;
        if (yfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar6 = null;
        }
        yfVar6.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.G1(this.a, view);
            }
        });
        yf yfVar7 = this.binding;
        if (yfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar7 = null;
        }
        yfVar7.q.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.H1(this.a, view);
            }
        });
        yf yfVar8 = this.binding;
        if (yfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar8;
        }
        yfVar2.q.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.I1(this.a, view);
            }
        });
    }

    public static final void C1(SearchChallanOnlineActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf yfVar = this$0.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        if (yfVar.c.isSelected()) {
            this$0.inputType = "";
            yf yfVar3 = this$0.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar3 = null;
            }
            yfVar3.c.setChecked(false);
            yf yfVar4 = this$0.binding;
            if (yfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar4 = null;
            }
            yfVar4.c.setSelected(false);
            yf yfVar5 = this$0.binding;
            if (yfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar2 = yfVar5;
            }
            yfVar2.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        yf yfVar6 = this$0.binding;
        if (yfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar6 = null;
        }
        yfVar6.o.setVisibility(8);
        yf yfVar7 = this$0.binding;
        if (yfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar7 = null;
        }
        yfVar7.A.setVisibility(8);
        yf yfVar8 = this$0.binding;
        if (yfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar8 = null;
        }
        yfVar8.z.setVisibility(8);
        yf yfVar9 = this$0.binding;
        if (yfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar9 = null;
        }
        yfVar9.c.setChecked(true);
        yf yfVar10 = this$0.binding;
        if (yfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar10 = null;
        }
        yfVar10.c.setSelected(true);
        yf yfVar11 = this$0.binding;
        if (yfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar11 = null;
        }
        yfVar11.b.setBackgroundResource(R.drawable.corner_circle_14_selected);
        yf yfVar12 = this$0.binding;
        if (yfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar12 = null;
        }
        yfVar12.x.setChecked(false);
        yf yfVar13 = this$0.binding;
        if (yfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar13 = null;
        }
        yfVar13.x.setSelected(false);
        yf yfVar14 = this$0.binding;
        if (yfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar14 = null;
        }
        yfVar14.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar15 = this$0.binding;
        if (yfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar15 = null;
        }
        yfVar15.e.setChecked(false);
        yf yfVar16 = this$0.binding;
        if (yfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar16 = null;
        }
        yfVar16.e.setSelected(false);
        yf yfVar17 = this$0.binding;
        if (yfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar17 = null;
        }
        yfVar17.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar18 = this$0.binding;
        if (yfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar18 = null;
        }
        Editable text = yfVar18.k.getText();
        if (text != null) {
            text.clear();
        }
        yf yfVar19 = this$0.binding;
        if (yfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar19 = null;
        }
        Editable text2 = yfVar19.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        yf yfVar20 = this$0.binding;
        if (yfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar20 = null;
        }
        Editable text3 = yfVar20.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        yf yfVar21 = this$0.binding;
        if (yfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar21 = null;
        }
        yfVar21.k.setHint(this$0.w1().b("enterCNoticePlaceHolder", this$0.getString(R.string.enter_challan_notice_no)));
        yf yfVar22 = this$0.binding;
        if (yfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar22 = null;
        }
        yfVar22.k.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
        this$0.inputType = "Challan";
        yf yfVar23 = this$0.binding;
        if (yfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar23 = null;
        }
        yfVar23.k.setError(null);
        yf yfVar24 = this$0.binding;
        if (yfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar24;
        }
        yfVar2.v.setVisibility(8);
    }

    public static final void D1(SearchChallanOnlineActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf yfVar = this$0.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        if (yfVar.x.isSelected()) {
            yf yfVar3 = this$0.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar3 = null;
            }
            yfVar3.v.setVisibility(8);
            this$0.inputType = "";
            yf yfVar4 = this$0.binding;
            if (yfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar4 = null;
            }
            yfVar4.x.setChecked(false);
            yf yfVar5 = this$0.binding;
            if (yfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar5 = null;
            }
            yfVar5.x.setSelected(false);
            yf yfVar6 = this$0.binding;
            if (yfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar6 = null;
            }
            yfVar6.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
            yf yfVar7 = this$0.binding;
            if (yfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar7 = null;
            }
            yfVar7.o.setVisibility(8);
            yf yfVar8 = this$0.binding;
            if (yfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar2 = yfVar8;
            }
            yfVar2.A.setVisibility(8);
            return;
        }
        yf yfVar9 = this$0.binding;
        if (yfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar9 = null;
        }
        yfVar9.c.setChecked(false);
        yf yfVar10 = this$0.binding;
        if (yfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar10 = null;
        }
        yfVar10.c.setSelected(false);
        yf yfVar11 = this$0.binding;
        if (yfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar11 = null;
        }
        yfVar11.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar12 = this$0.binding;
        if (yfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar12 = null;
        }
        yfVar12.x.setChecked(true);
        yf yfVar13 = this$0.binding;
        if (yfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar13 = null;
        }
        yfVar13.x.setSelected(true);
        yf yfVar14 = this$0.binding;
        if (yfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar14 = null;
        }
        yfVar14.w.setBackgroundResource(R.drawable.corner_circle_14_selected);
        yf yfVar15 = this$0.binding;
        if (yfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar15 = null;
        }
        yfVar15.e.setChecked(false);
        yf yfVar16 = this$0.binding;
        if (yfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar16 = null;
        }
        yfVar16.e.setSelected(false);
        yf yfVar17 = this$0.binding;
        if (yfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar17 = null;
        }
        yfVar17.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar18 = this$0.binding;
        if (yfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar18 = null;
        }
        Editable text = yfVar18.k.getText();
        if (text != null) {
            text.clear();
        }
        yf yfVar19 = this$0.binding;
        if (yfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar19 = null;
        }
        Editable text2 = yfVar19.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        yf yfVar20 = this$0.binding;
        if (yfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar20 = null;
        }
        Editable text3 = yfVar20.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        yf yfVar21 = this$0.binding;
        if (yfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar21 = null;
        }
        yfVar21.k.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        yf yfVar22 = this$0.binding;
        if (yfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar22 = null;
        }
        yfVar22.k.setHint(this$0.w1().b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        this$0.inputType = "RC";
        yf yfVar23 = this$0.binding;
        if (yfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar23 = null;
        }
        yfVar23.k.setError(null);
        yf yfVar24 = this$0.binding;
        if (yfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar24 = null;
        }
        yfVar24.v.setVisibility(0);
        yf yfVar25 = this$0.binding;
        if (yfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar25;
        }
        yfVar2.z.setVisibility(8);
        this$0.T1();
    }

    public static final void E1(SearchChallanOnlineActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        yf yfVar = this$0.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        if (yfVar.e.isSelected()) {
            this$0.inputType = "";
            yf yfVar3 = this$0.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar3 = null;
            }
            yfVar3.e.setChecked(false);
            yf yfVar4 = this$0.binding;
            if (yfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar4 = null;
            }
            yfVar4.e.setSelected(false);
            yf yfVar5 = this$0.binding;
            if (yfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar5 = null;
            }
            yfVar5.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            yf yfVar6 = this$0.binding;
            if (yfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar2 = yfVar6;
            }
            yfVar2.z.setVisibility(8);
            return;
        }
        yf yfVar7 = this$0.binding;
        if (yfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar7 = null;
        }
        yfVar7.o.setVisibility(8);
        yf yfVar8 = this$0.binding;
        if (yfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar8 = null;
        }
        yfVar8.A.setVisibility(8);
        yf yfVar9 = this$0.binding;
        if (yfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar9 = null;
        }
        yfVar9.c.setChecked(false);
        yf yfVar10 = this$0.binding;
        if (yfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar10 = null;
        }
        yfVar10.c.setSelected(false);
        yf yfVar11 = this$0.binding;
        if (yfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar11 = null;
        }
        yfVar11.b.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar12 = this$0.binding;
        if (yfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar12 = null;
        }
        yfVar12.x.setChecked(false);
        yf yfVar13 = this$0.binding;
        if (yfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar13 = null;
        }
        yfVar13.x.setSelected(false);
        yf yfVar14 = this$0.binding;
        if (yfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar14 = null;
        }
        yfVar14.w.setBackgroundResource(R.drawable.corner_circle_bg_14);
        yf yfVar15 = this$0.binding;
        if (yfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar15 = null;
        }
        yfVar15.e.setChecked(true);
        yf yfVar16 = this$0.binding;
        if (yfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar16 = null;
        }
        yfVar16.e.setSelected(true);
        yf yfVar17 = this$0.binding;
        if (yfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar17 = null;
        }
        yfVar17.g.setBackgroundResource(R.drawable.corner_circle_14_selected);
        yf yfVar18 = this$0.binding;
        if (yfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar18 = null;
        }
        Editable text = yfVar18.k.getText();
        if (text != null) {
            text.clear();
        }
        yf yfVar19 = this$0.binding;
        if (yfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar19 = null;
        }
        Editable text2 = yfVar19.h.getText();
        if (text2 != null) {
            text2.clear();
        }
        yf yfVar20 = this$0.binding;
        if (yfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar20 = null;
        }
        Editable text3 = yfVar20.d.getText();
        if (text3 != null) {
            text3.clear();
        }
        yf yfVar21 = this$0.binding;
        if (yfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar21 = null;
        }
        yfVar21.k.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(18)});
        yf yfVar22 = this$0.binding;
        if (yfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar22 = null;
        }
        yfVar22.k.setHint(this$0.w1().b("label_challan_enter_dl_no", this$0.getString(R.string.enter_dl_number)));
        this$0.inputType = "DL";
        yf yfVar23 = this$0.binding;
        if (yfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar23 = null;
        }
        yfVar23.k.setError(null);
        yf yfVar24 = this$0.binding;
        if (yfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar24;
        }
        yfVar2.v.setVisibility(8);
        this$0.U1();
    }

    public static final void F1(SearchChallanOnlineActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.X1() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                this$0.V1(this$0, this$0.w1().b("label_challan_please_select_one_search_type", "Please select one search type"));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.Y1();
            return;
        }
        yf yfVar = this$0.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        if (StringsKt__StringNumberConversionsKt.toIntOrNull(yfVar.k.getText().toString()) != null) {
            Intent intent = new Intent(this$0, (Class<?>) NoticeSearchList.class);
            yf yfVar3 = this$0.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar2 = yfVar3;
            }
            intent.putExtra("inputValue", yfVar2.k.getText().toString());
            intent.putExtra("inputType", "Notice");
            intent.putExtra("Service_code", this$0.serviceCode);
            this$0.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this$0, (Class<?>) SearchChallanListActivity.class);
        yf yfVar4 = this$0.binding;
        if (yfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar4;
        }
        intent2.putExtra("inputValue", yfVar2.k.getText().toString());
        intent2.putExtra("inputType", this$0.inputType);
        intent2.putExtra("inputchassisno", "");
        intent2.putExtra("inputengineno", "");
        this$0.startActivity(intent2);
    }

    public static final void G1(SearchChallanOnlineActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SearchChallanListActivity.class);
        yf yfVar = this$0.binding;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        intent.putExtra("inputValue", yfVar.n.getText().toString());
        intent.putExtra("inputType", "DL");
        intent.putExtra("inputchassisno", "");
        intent.putExtra("inputengineno", "");
        this$0.startActivity(intent);
    }

    public static final void H1(SearchChallanOnlineActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void I1(SearchChallanOnlineActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    private final void K1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean X1() {
        String strSubstring;
        yf yfVar = this.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) yfVar.k.getText().toString()).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            yf yfVar3 = this.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) yfVar3.k.getText().toString()).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                yf yfVar4 = this.binding;
                if (yfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar4 = null;
                }
                yfVar4.k.setError(getString(R.string.please_enter_challan_notice_no));
                yf yfVar5 = this.binding;
                if (yfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar5;
                }
                yfVar2.k.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    yf yfVar6 = this.binding;
                    if (yfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yfVar6 = null;
                    }
                    yfVar6.k.setError(getString(R.string.enter_min_notice_no));
                    yf yfVar7 = this.binding;
                    if (yfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yfVar2 = yfVar7;
                    }
                    yfVar2.k.requestFocus();
                    return true;
                }
            } else {
                if (!J1(strSubstring)) {
                    yf yfVar8 = this.binding;
                    if (yfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yfVar8 = null;
                    }
                    yfVar8.k.setError(w1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    yf yfVar9 = this.binding;
                    if (yfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yfVar2 = yfVar9;
                    }
                    yfVar2.k.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    yf yfVar10 = this.binding;
                    if (yfVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yfVar10 = null;
                    }
                    yfVar10.k.setError(w1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    yf yfVar11 = this.binding;
                    if (yfVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yfVar2 = yfVar11;
                    }
                    yfVar2.k.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    yf yfVar12 = this.binding;
                    if (yfVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yfVar12 = null;
                    }
                    yfVar12.k.setError(w1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    yf yfVar13 = this.binding;
                    if (yfVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yfVar2 = yfVar13;
                    }
                    yfVar2.k.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                yf yfVar14 = this.binding;
                if (yfVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar14 = null;
                }
                yfVar14.k.setError(w1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                yf yfVar15 = this.binding;
                if (yfVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar15;
                }
                yfVar2.k.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 4) {
                yf yfVar16 = this.binding;
                if (yfVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar16 = null;
                }
                yfVar16.k.setError(w1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                yf yfVar17 = this.binding;
                if (yfVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar17;
                }
                yfVar2.k.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                yf yfVar18 = this.binding;
                if (yfVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar18 = null;
                }
                yfVar18.k.setError(w1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                yf yfVar19 = this.binding;
                if (yfVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar19;
                }
                yfVar2.k.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                yf yfVar20 = this.binding;
                if (yfVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar20 = null;
                }
                yfVar20.k.setError(w1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                yf yfVar21 = this.binding;
                if (yfVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar21;
                }
                yfVar2.k.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                yf yfVar22 = this.binding;
                if (yfVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar22 = null;
                }
                yfVar22.k.setError(w1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                yf yfVar23 = this.binding;
                if (yfVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar23;
                }
                yfVar2.k.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                yf yfVar24 = this.binding;
                if (yfVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar24 = null;
                }
                yfVar24.k.setError(w1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                yf yfVar25 = this.binding;
                if (yfVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yfVar2 = yfVar25;
                }
                yfVar2.k.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void Y1() {
        v1().show();
        a55 a55VarY1 = y1();
        yf yfVar = this.binding;
        yf yfVar2 = null;
        if (yfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar = null;
        }
        String string = yfVar.k.getText().toString();
        String string2 = A1().k().toString();
        yf yfVar3 = this.binding;
        if (yfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar3 = null;
        }
        String string3 = yfVar3.d.getText().toString();
        yf yfVar4 = this.binding;
        if (yfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar2 = yfVar4;
        }
        a55VarY1.m(string, string2, string3, yfVar2.h.getText().toString(), this, hz0.a.n());
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
        yf yfVar = null;
        if (t1().size() <= 0) {
            yf yfVar2 = this.binding;
            if (yfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yfVar2 = null;
            }
            yfVar2.o.setVisibility(8);
            yf yfVar3 = this.binding;
            if (yfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar = yfVar3;
            }
            yfVar.A.setVisibility(8);
            return;
        }
        yf yfVar4 = this.binding;
        if (yfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar4 = null;
        }
        yfVar4.A.setVisibility(0);
        yf yfVar5 = this.binding;
        if (yfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar5 = null;
        }
        yfVar5.o.setVisibility(0);
        b31 b31Var = new b31(t1(), this, 1, "");
        Intrinsics.checkNotNull(b31Var);
        R1(b31Var);
        yf yfVar6 = this.binding;
        if (yfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar = yfVar6;
        }
        yfVar.o.setAdapter(z1());
    }

    public final void U1() throws Throwable {
        DlobjX dlobj;
        String dlLicno = null;
        yf yfVar = null;
        dlLicno = null;
        if (u1().z0() == null) {
            yf yfVar2 = this.binding;
            if (yfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yfVar = yfVar2;
            }
            yfVar.z.setVisibility(8);
            return;
        }
        try {
            ArrayList arrayListZ0 = u1().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            if (((DLDocument) arrayListZ0.get(0)).getDldetails() != null) {
                yf yfVar3 = this.binding;
                if (yfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar3 = null;
                }
                yfVar3.z.setVisibility(0);
                yf yfVar4 = this.binding;
                if (yfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yfVar4 = null;
                }
                TextView textView = yfVar4.n;
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanOnlineActivity.W1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        yf yfVarC = yf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yfVarC, "inflate(...)");
        this.binding = yfVarC;
        yf yfVar = null;
        if (yfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVarC = null;
        }
        setContentView(yfVarC.b());
        O1(new wa3(this));
        az1.a aVar = az1.a;
        yf yfVar2 = this.binding;
        if (yfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar2 = null;
        }
        aVar.g(this, yfVar2);
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
        yf yfVar3 = this.binding;
        if (yfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar3 = null;
        }
        yfVar3.o.setLayoutManager(new LinearLayoutManager(this, 0, false));
        zy1.a aVar2 = zy1.a;
        yf yfVar4 = this.binding;
        if (yfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar4 = null;
        }
        EditText engineEt = yfVar4.h;
        Intrinsics.checkNotNullExpressionValue(engineEt, "engineEt");
        aVar2.a(this, engineEt);
        yf yfVar5 = this.binding;
        if (yfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yfVar5 = null;
        }
        EditText inputEt = yfVar5.k;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        aVar2.a(this, inputEt);
        yf yfVar6 = this.binding;
        if (yfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yfVar = yfVar6;
        }
        EditText chasisEt = yfVar.d;
        Intrinsics.checkNotNullExpressionValue(chasisEt, "chasisEt");
        aVar2.a(this, chasisEt);
        B1();
        y1().V().g(this, new d(new b()));
        y1().W().g(this, new d(new c()));
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
