package com.nic.mparivahan.DPTNotice;

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
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DPTNotice.NoticeSearch;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.b31;
import com.zepto.b55;
import com.zepto.he;
import com.zepto.hz0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R2\u0010H\u001a\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010\u0015¨\u0006]"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/NoticeSearch;", "Lcom/zepto/pq;", "", "y1", "", "O1", "L1", "P1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "M1", "Lcom/zepto/he;", "C", "Lcom/zepto/he;", "binding", "D", "Ljava/lang/String;", "inputType", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "F", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "r1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "E1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/a55;", "G", "Lcom/zepto/a55;", "v1", "()Lcom/zepto/a55;", "I1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "H", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "u1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "H1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "F1", "(Landroid/app/ProgressDialog;)V", "dialog", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "q1", "()Ljava/util/ArrayList;", "D1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/b31;", "K", "Lcom/zepto/b31;", "w1", "()Lcom/zepto/b31;", "J1", "(Lcom/zepto/b31;)V", "myRcAdapter", "Lcom/zepto/ws6;", "L", "Lcom/zepto/ws6;", "x1", "()Lcom/zepto/ws6;", "K1", "(Lcom/zepto/ws6;)V", "sessionManager", "M", "serviceName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeSearch extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public he binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "Notice";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String serviceName = "";

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
            he heVar = NoticeSearch.this.binding;
            if (heVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar = null;
            }
            heVar.b.setError(null);
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
            he heVar = NoticeSearch.this.binding;
            if (heVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar = null;
            }
            heVar.c.setError(null);
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
            he heVar = NoticeSearch.this.binding;
            if (heVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar = null;
            }
            heVar.e.setError(null);
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
            if (NoticeSearch.this.s1().isShowing()) {
                NoticeSearch.this.s1().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(NoticeSearch.this, (Class<?>) NoticeSearchList.class);
                he heVar = NoticeSearch.this.binding;
                if (heVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    heVar = null;
                }
                intent.putExtra("inputValue", heVar.e.getText().toString());
                intent.putExtra("inputType", NoticeSearch.this.inputType);
                intent.putExtra("serviceName", NoticeSearch.this.serviceName);
                NoticeSearch.this.startActivity(intent);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                NoticeSearch noticeSearch = NoticeSearch.this;
                noticeSearch.M1(noticeSearch, validateRcSuccess.getStatusDesc());
            } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                hz0.a.Q(NoticeSearch.this, validateRcSuccess.getStatusDesc(), 1);
            } else if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                hz0.a.Q(NoticeSearch.this, validateRcSuccess.getStatusDesc(), 2);
            } else {
                NoticeSearch noticeSearch2 = NoticeSearch.this;
                noticeSearch2.M1(noticeSearch2, noticeSearch2.t1().b("error_msg_record_not_found", NoticeSearch.this.getString(R.string.service_unavable_please_try)));
            }
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
            if (NoticeSearch.this.s1().isShowing()) {
                NoticeSearch.this.s1().dismiss();
            }
            NoticeSearch noticeSearch = NoticeSearch.this;
            noticeSearch.M1(noticeSearch, noticeSearch.t1().b("error_msg_record_not_found", NoticeSearch.this.getString(R.string.service_unavable_please_try)));
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

    public static final void A1(NoticeSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        he heVar = this$0.binding;
        he heVar2 = null;
        if (heVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar = null;
        }
        if (heVar.f.isSelected()) {
            this$0.inputType = "";
            he heVar3 = this$0.binding;
            if (heVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar3 = null;
            }
            heVar3.q.setVisibility(8);
            he heVar4 = this$0.binding;
            if (heVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar4 = null;
            }
            heVar4.f.setChecked(false);
            he heVar5 = this$0.binding;
            if (heVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar5 = null;
            }
            heVar5.f.setSelected(false);
            he heVar6 = this$0.binding;
            if (heVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar6;
            }
            heVar2.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        he heVar7 = this$0.binding;
        if (heVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar7 = null;
        }
        heVar7.q.setVisibility(8);
        he heVar8 = this$0.binding;
        if (heVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar8 = null;
        }
        heVar8.f.setChecked(true);
        he heVar9 = this$0.binding;
        if (heVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar9 = null;
        }
        heVar9.f.setSelected(true);
        he heVar10 = this$0.binding;
        if (heVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar10 = null;
        }
        heVar10.p.setChecked(false);
        he heVar11 = this$0.binding;
        if (heVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar11 = null;
        }
        heVar11.p.setSelected(false);
        he heVar12 = this$0.binding;
        if (heVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar12 = null;
        }
        heVar12.g.setBackgroundResource(R.drawable.corner_circle_14_selected);
        he heVar13 = this$0.binding;
        if (heVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar13 = null;
        }
        heVar13.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
        he heVar14 = this$0.binding;
        if (heVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar14 = null;
        }
        Editable text = heVar14.e.getText();
        if (text != null) {
            text.clear();
        }
        he heVar15 = this$0.binding;
        if (heVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar15 = null;
        }
        heVar15.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        this$0.inputType = "Notice";
        he heVar16 = this$0.binding;
        if (heVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar16 = null;
        }
        heVar16.e.setHint(this$0.getString(R.string.enter_notice_number));
        he heVar17 = this$0.binding;
        if (heVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar17 = null;
        }
        heVar17.e.setError(null);
        he heVar18 = this$0.binding;
        if (heVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar2 = heVar18;
        }
        heVar2.n.setVisibility(8);
    }

    public static final void B1(NoticeSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        he heVar = this$0.binding;
        he heVar2 = null;
        if (heVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar = null;
        }
        if (heVar.p.isSelected()) {
            this$0.inputType = "";
            he heVar3 = this$0.binding;
            if (heVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar3 = null;
            }
            heVar3.p.setChecked(false);
            he heVar4 = this$0.binding;
            if (heVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar4 = null;
            }
            heVar4.p.setSelected(false);
            he heVar5 = this$0.binding;
            if (heVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar5 = null;
            }
            heVar5.h.setVisibility(0);
            he heVar6 = this$0.binding;
            if (heVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar6 = null;
            }
            heVar6.q.setVisibility(0);
            he heVar7 = this$0.binding;
            if (heVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar7;
            }
            heVar2.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        he heVar8 = this$0.binding;
        if (heVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar8 = null;
        }
        heVar8.h.setVisibility(0);
        he heVar9 = this$0.binding;
        if (heVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar9 = null;
        }
        heVar9.q.setVisibility(0);
        he heVar10 = this$0.binding;
        if (heVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar10 = null;
        }
        heVar10.f.setChecked(false);
        he heVar11 = this$0.binding;
        if (heVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar11 = null;
        }
        heVar11.f.setSelected(false);
        he heVar12 = this$0.binding;
        if (heVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar12 = null;
        }
        heVar12.p.setChecked(true);
        he heVar13 = this$0.binding;
        if (heVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar13 = null;
        }
        heVar13.p.setSelected(true);
        he heVar14 = this$0.binding;
        if (heVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar14 = null;
        }
        heVar14.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        he heVar15 = this$0.binding;
        if (heVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar15 = null;
        }
        heVar15.o.setBackgroundResource(R.drawable.corner_circle_14_selected);
        he heVar16 = this$0.binding;
        if (heVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar16 = null;
        }
        Editable text = heVar16.e.getText();
        if (text != null) {
            text.clear();
        }
        he heVar17 = this$0.binding;
        if (heVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar17 = null;
        }
        heVar17.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        he heVar18 = this$0.binding;
        if (heVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar18 = null;
        }
        heVar18.e.setHint(this$0.getString(R.string.enter_vehicle_number));
        this$0.inputType = "RC";
        he heVar19 = this$0.binding;
        if (heVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar19 = null;
        }
        heVar19.e.setError(null);
        he heVar20 = this$0.binding;
        if (heVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar2 = heVar20;
        }
        heVar2.n.setVisibility(0);
    }

    public static final void C1(NoticeSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.O1() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                this$0.M1(this$0, this$0.t1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.P1();
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) NoticeSearchList.class);
            he heVar = this$0.binding;
            if (heVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar = null;
            }
            intent.putExtra("inputValue", heVar.e.getText().toString());
            intent.putExtra("inputType", this$0.inputType);
            intent.putExtra("serviceName", this$0.serviceName);
            this$0.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean O1() {
        he heVar = this.binding;
        he heVar2 = null;
        if (heVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) heVar.e.getText().toString()).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (!Intrinsics.areEqual(this.inputType, "RC")) {
            if (!Intrinsics.areEqual(this.inputType, "Notice")) {
                return false;
            }
            if (string.length() == 0) {
                he heVar3 = this.binding;
                if (heVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    heVar3 = null;
                }
                heVar3.e.setError(getString(R.string.please_enter_notice_no));
                he heVar4 = this.binding;
                if (heVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    heVar2 = heVar4;
                }
                heVar2.e.requestFocus();
                return true;
            }
            if (string.length() >= 5) {
                return false;
            }
            he heVar5 = this.binding;
            if (heVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar5 = null;
            }
            heVar5.e.setError(getString(R.string.enter_min_notice_no));
            he heVar6 = this.binding;
            if (heVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar6;
            }
            heVar2.e.requestFocus();
            return true;
        }
        if (string.length() == 0) {
            he heVar7 = this.binding;
            if (heVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar7 = null;
            }
            heVar7.e.setError(t1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
            he heVar8 = this.binding;
            if (heVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar8;
            }
            heVar2.e.requestFocus();
            return true;
        }
        int length = charArray.length;
        if (length >= 0 && length < 4) {
            he heVar9 = this.binding;
            if (heVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar9 = null;
            }
            heVar9.e.setError(t1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
            he heVar10 = this.binding;
            if (heVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar10;
            }
            heVar2.e.requestFocus();
            return true;
        }
        if (string.length() > 10) {
            he heVar11 = this.binding;
            if (heVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar11 = null;
            }
            heVar11.e.setError(t1().b("label_challan_rc_validation", getString(R.string.rc_text)));
            he heVar12 = this.binding;
            if (heVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar12;
            }
            heVar2.e.requestFocus();
            return true;
        }
        if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
            he heVar13 = this.binding;
            if (heVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar13 = null;
            }
            heVar13.e.setError(t1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
            he heVar14 = this.binding;
            if (heVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar14;
            }
            heVar2.e.requestFocus();
            return true;
        }
        he heVar15 = this.binding;
        if (heVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar15 = null;
        }
        if (heVar15.b.getText().toString().length() < 5) {
            he heVar16 = this.binding;
            if (heVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar16 = null;
            }
            heVar16.b.setError(t1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."));
            he heVar17 = this.binding;
            if (heVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar2 = heVar17;
            }
            heVar2.b.requestFocus();
            return true;
        }
        he heVar18 = this.binding;
        if (heVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar18 = null;
        }
        if (heVar18.c.getText().toString().length() >= 5) {
            return false;
        }
        he heVar19 = this.binding;
        if (heVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar19 = null;
        }
        heVar19.c.setError(t1().b("label_challan_valid_engine_no", "Please enter the valid last 5 digit of engine no"));
        he heVar20 = this.binding;
        if (heVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar2 = heVar20;
        }
        heVar2.c.requestFocus();
        return true;
    }

    private final void y1() throws Throwable {
        he heVar = this.binding;
        he heVar2 = null;
        if (heVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar = null;
        }
        heVar.j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ed4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearch.z1(this.a, view);
            }
        });
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra = getIntent().getStringExtra("serviceName");
            Intrinsics.checkNotNull(stringExtra);
            this.serviceName = stringExtra;
            he heVar3 = this.binding;
            if (heVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar3 = null;
            }
            heVar3.i.setText(this.serviceName);
            he heVar4 = this.binding;
            if (heVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar4 = null;
            }
            heVar4.j.i.setText(this.serviceName);
        }
        K1(new ws6(this));
        H1(RcService.INSTANCE.a(this));
        I1((a55) new z(this, new b55(new s45(u1()))).a(a55.class));
        he heVar5 = this.binding;
        if (heVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar5 = null;
        }
        heVar5.q.setVisibility(8);
        he heVar6 = this.binding;
        if (heVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar6 = null;
        }
        heVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearch.A1(this.a, view);
            }
        });
        he heVar7 = this.binding;
        if (heVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar7 = null;
        }
        heVar7.p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearch.B1(this.a, view);
            }
        });
        he heVar8 = this.binding;
        if (heVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar8 = null;
        }
        heVar8.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearch.C1(this.a, view);
            }
        });
        he heVar9 = this.binding;
        if (heVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar9 = null;
        }
        heVar9.b.addTextChangedListener(new a());
        he heVar10 = this.binding;
        if (heVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar10 = null;
        }
        heVar10.c.addTextChangedListener(new b());
        he heVar11 = this.binding;
        if (heVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar2 = heVar11;
        }
        heVar2.e.addTextChangedListener(new c());
        L1();
    }

    public static final void z1(NoticeSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void D1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void E1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void F1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.dialog = progressDialog;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void H1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void I1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void J1(b31 b31Var) {
        Intrinsics.checkNotNullParameter(b31Var, "<set-?>");
        this.myRcAdapter = b31Var;
    }

    public final void K1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void L1() throws Throwable {
        ArrayList arrayListH0 = r1().H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
        D1(arrayListH0);
        he heVar = null;
        if (q1().size() <= 0) {
            he heVar2 = this.binding;
            if (heVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                heVar2 = null;
            }
            heVar2.h.setVisibility(8);
            he heVar3 = this.binding;
            if (heVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                heVar = heVar3;
            }
            heVar.q.setVisibility(8);
            return;
        }
        he heVar4 = this.binding;
        if (heVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar4 = null;
        }
        heVar4.h.setVisibility(0);
        J1(new b31(q1(), this, 15, ""));
        he heVar5 = this.binding;
        if (heVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar = heVar5;
        }
        heVar.h.setAdapter(w1());
    }

    public final void M1(Context context, String message) {
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
        textView.setText(t1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(t1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.id4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearch.N1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void P1() {
        s1().show();
        a55 a55VarV1 = v1();
        he heVar = this.binding;
        he heVar2 = null;
        if (heVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar = null;
        }
        String string = heVar.e.getText().toString();
        String string2 = x1().k().toString();
        he heVar3 = this.binding;
        if (heVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVar3 = null;
        }
        String string3 = heVar3.b.getText().toString();
        he heVar4 = this.binding;
        if (heVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar2 = heVar4;
        }
        a55VarV1.m(string, string2, string3, heVar2.c.getText().toString(), this, hz0.a.n());
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        he heVarC = he.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(heVarC, "inflate(...)");
        this.binding = heVarC;
        he heVar = null;
        if (heVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            heVarC = null;
        }
        setContentView(heVarC.b());
        G1(new wa3(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        E1(databaseHelperD0);
        F1(new ProgressDialog(this));
        s1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        he heVar2 = this.binding;
        if (heVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            heVar = heVar2;
        }
        heVar.h.setLayoutManager(new LinearLayoutManager(this, 0, false));
        y1();
        v1().V().g(this, new f(new d()));
        v1().W().g(this, new f(new e()));
    }

    public final ArrayList q1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final RcService u1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 v1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final b31 w1() {
        b31 b31Var = this.myRcAdapter;
        if (b31Var != null) {
            return b31Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final ws6 x1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }
}
