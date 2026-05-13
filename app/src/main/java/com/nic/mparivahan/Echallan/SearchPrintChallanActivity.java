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
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.MyTextView;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R&\u00104\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`18\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchPrintChallanActivity;", "Lcom/zepto/pq;", "", "v1", "K1", "E1", "", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "D1", "Landroid/content/Context;", "context", "message", "H1", "F1", "G1", "Lcom/zepto/bg;", "C", "Lcom/zepto/bg;", "binding", "D", "Ljava/lang/String;", "inputType", "Lcom/zepto/a55;", "E", "Lcom/zepto/a55;", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "F", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "mRcService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "sessionManager", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "I", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "arrayList", "Lcom/zepto/b31;", "K", "Lcom/zepto/b31;", "myRcAdapter", "L", "getChallan_title", "()Ljava/lang/String;", "setChallan_title", "(Ljava/lang/String;)V", "challan_title", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "langSession", "N", "serviceCode", "Landroid/text/TextWatcher;", "O", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchPrintChallanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPrintChallanActivity.kt\ncom/nic/mparivahan/Echallan/SearchPrintChallanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,606:1\n1#2:607\n*E\n"})
public final class SearchPrintChallanActivity extends pq {

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

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public b31 myRcAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "RC";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String challan_title = "";

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
            bg bgVar = SearchPrintChallanActivity.this.binding;
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
            bg bgVar = SearchPrintChallanActivity.this.binding;
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
            bg bgVar = SearchPrintChallanActivity.this.binding;
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
            ProgressDialog progressDialog = SearchPrintChallanActivity.this.dialog;
            wa3 wa3Var = null;
            bg bgVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = SearchPrintChallanActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(SearchPrintChallanActivity.this, (Class<?>) NoticeChallanVehicleSearchList.class);
                bg bgVar2 = SearchPrintChallanActivity.this.binding;
                if (bgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar2 = null;
                }
                intent.putExtra("inputValue", bgVar2.l.getText().toString());
                intent.putExtra("inputType", SearchPrintChallanActivity.this.inputType);
                bg bgVar3 = SearchPrintChallanActivity.this.binding;
                if (bgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar3 = null;
                }
                intent.putExtra("inputchassisno", bgVar3.d.getText().toString());
                bg bgVar4 = SearchPrintChallanActivity.this.binding;
                if (bgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar = bgVar4;
                }
                intent.putExtra("inputengineno", bgVar.h.getText().toString());
                intent.putExtra("Service_code", SearchPrintChallanActivity.this.serviceCode);
                SearchPrintChallanActivity.this.startActivity(intent);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP985", true) || StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NR005", true)) {
                SearchPrintChallanActivity searchPrintChallanActivity = SearchPrintChallanActivity.this;
                searchPrintChallanActivity.H1(searchPrintChallanActivity, validateRcSuccess.getStatusDesc());
                return;
            }
            if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR090")) {
                hz0.a.Q(SearchPrintChallanActivity.this, validateRcSuccess.getStatusDesc(), 1);
                return;
            }
            if (Intrinsics.areEqual(validateRcSuccess.getStatusCode(), "NR091")) {
                hz0.a.Q(SearchPrintChallanActivity.this, validateRcSuccess.getStatusDesc(), 2);
                return;
            }
            if (!gd1.a.m(validateRcSuccess.getStatusDesc())) {
                SearchPrintChallanActivity searchPrintChallanActivity2 = SearchPrintChallanActivity.this;
                searchPrintChallanActivity2.H1(searchPrintChallanActivity2, validateRcSuccess.getStatusDesc());
                return;
            }
            SearchPrintChallanActivity searchPrintChallanActivity3 = SearchPrintChallanActivity.this;
            wa3 wa3Var2 = searchPrintChallanActivity3.langSession;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var2;
            }
            searchPrintChallanActivity3.H1(searchPrintChallanActivity3, wa3Var.b("error_msg_record_not_found", SearchPrintChallanActivity.this.getString(R.string.service_unavable_please_try)));
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
            ProgressDialog progressDialog = SearchPrintChallanActivity.this.dialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = SearchPrintChallanActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            SearchPrintChallanActivity searchPrintChallanActivity = SearchPrintChallanActivity.this;
            wa3 wa3Var2 = searchPrintChallanActivity.langSession;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var2;
            }
            searchPrintChallanActivity.H1(searchPrintChallanActivity, wa3Var.b("error_msg_record_not_found", SearchPrintChallanActivity.this.getString(R.string.service_unavable_please_try)));
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

    public static final void A1(SearchPrintChallanActivity this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bg bgVar = this$0.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        if (bgVar.e.isSelected()) {
            this$0.inputType = "";
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
        EditText editText = bgVar23.l;
        wa3 wa3Var = this$0.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        editText.setHint(wa3Var.b("label_challan_enter_dl_no", this$0.getString(R.string.enter_dl_number)));
        this$0.inputType = "DL";
        bg bgVar24 = this$0.binding;
        if (bgVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar24 = null;
        }
        bgVar24.l.setError(null);
        this$0.G1();
    }

    public static final void B1(SearchPrintChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = null;
        bg bgVar = null;
        bg bgVar2 = null;
        if (this$0.J1() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                wa3 wa3Var2 = this$0.langSession;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var2;
                }
                this$0.H1(this$0, wa3Var.b("label_challan_please_select_one_search_type", "Please select one search type"));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.K1();
            return;
        }
        bg bgVar3 = this$0.binding;
        if (bgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar3 = null;
        }
        if (StringsKt__StringNumberConversionsKt.toIntOrNull(bgVar3.l.getText().toString()) != null) {
            Intent intent = new Intent(this$0, (Class<?>) NoticeSearchList.class);
            bg bgVar4 = this$0.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bgVar = bgVar4;
            }
            intent.putExtra("inputValue", bgVar.l.getText().toString());
            intent.putExtra("inputType", "Notice");
            intent.putExtra("Service_code", this$0.serviceCode);
            this$0.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this$0, (Class<?>) SearchPrintChallanListActivity.class);
        bg bgVar5 = this$0.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar5;
        }
        intent2.putExtra("inputValue", bgVar2.l.getText().toString());
        intent2.putExtra("inputType", this$0.inputType);
        intent2.putExtra("Service_name", this$0.challan_title);
        intent2.putExtra("inputchassisno", "");
        intent2.putExtra("inputengineno", "");
        this$0.startActivity(intent2);
    }

    public static final void C1(SearchPrintChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SearchPrintChallanListActivity.class);
        bg bgVar = this$0.binding;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        intent.putExtra("inputValue", bgVar.o.getText().toString());
        intent.putExtra("inputType", "DL");
        intent.putExtra("Service_name", this$0.challan_title);
        intent.putExtra("inputchassisno", "");
        intent.putExtra("inputengineno", "");
        this$0.startActivity(intent);
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean J1() {
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
                if (!D1(strSubstring)) {
                    bg bgVar8 = this.binding;
                    if (bgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bgVar8 = null;
                    }
                    EditText editText = bgVar8.l;
                    wa3 wa3Var = this.langSession;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var = null;
                    }
                    editText.setError(wa3Var.b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
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
                    EditText editText2 = bgVar10.l;
                    wa3 wa3Var2 = this.langSession;
                    if (wa3Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var2 = null;
                    }
                    editText2.setError(wa3Var2.b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
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
                    EditText editText3 = bgVar12.l;
                    wa3 wa3Var3 = this.langSession;
                    if (wa3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var3 = null;
                    }
                    editText3.setError(wa3Var3.b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
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
                EditText editText4 = bgVar14.l;
                wa3 wa3Var4 = this.langSession;
                if (wa3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var4 = null;
                }
                editText4.setError(wa3Var4.b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
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
                EditText editText5 = bgVar16.l;
                wa3 wa3Var5 = this.langSession;
                if (wa3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var5 = null;
                }
                editText5.setError(wa3Var5.b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
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
                EditText editText6 = bgVar18.l;
                wa3 wa3Var6 = this.langSession;
                if (wa3Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var6 = null;
                }
                editText6.setError(wa3Var6.b("label_challan_rc_validation", getString(R.string.rc_text)));
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
                EditText editText7 = bgVar20.l;
                wa3 wa3Var7 = this.langSession;
                if (wa3Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var7 = null;
                }
                editText7.setError(wa3Var7.b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                bg bgVar21 = this.binding;
                if (bgVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar21;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            bg bgVar22 = this.binding;
            if (bgVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar22 = null;
            }
            if (bgVar22.d.getText().toString().length() < 5) {
                bg bgVar23 = this.binding;
                if (bgVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar23 = null;
                }
                EditText editText8 = bgVar23.d;
                wa3 wa3Var8 = this.langSession;
                if (wa3Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var8 = null;
                }
                editText8.setError(wa3Var8.b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."));
                bg bgVar24 = this.binding;
                if (bgVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar24;
                }
                bgVar2.d.requestFocus();
                return true;
            }
            bg bgVar25 = this.binding;
            if (bgVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar25 = null;
            }
            if (bgVar25.h.getText().toString().length() < 5) {
                bg bgVar26 = this.binding;
                if (bgVar26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar26 = null;
                }
                EditText editText9 = bgVar26.h;
                wa3 wa3Var9 = this.langSession;
                if (wa3Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var9 = null;
                }
                editText9.setError(wa3Var9.b("label_challan_valid_engine_no", "Please enter the valid last 5 digit of engine no"));
                bg bgVar27 = this.binding;
                if (bgVar27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar27;
                }
                bgVar2.h.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                bg bgVar28 = this.binding;
                if (bgVar28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar28 = null;
                }
                EditText editText10 = bgVar28.l;
                wa3 wa3Var10 = this.langSession;
                if (wa3Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var10 = null;
                }
                editText10.setError(wa3Var10.b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                bg bgVar29 = this.binding;
                if (bgVar29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar29;
                }
                bgVar2.l.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                bg bgVar30 = this.binding;
                if (bgVar30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar30 = null;
                }
                EditText editText11 = bgVar30.l;
                wa3 wa3Var11 = this.langSession;
                if (wa3Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var11 = null;
                }
                editText11.setError(wa3Var11.b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                bg bgVar31 = this.binding;
                if (bgVar31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bgVar2 = bgVar31;
                }
                bgVar2.l.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void K1() {
        a55 a55Var;
        ProgressDialog progressDialog = this.dialog;
        bg bgVar = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        a55 a55Var2 = this.mRcViewModel;
        if (a55Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
            a55Var = null;
        } else {
            a55Var = a55Var2;
        }
        bg bgVar2 = this.binding;
        if (bgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar2 = null;
        }
        String string = bgVar2.l.getText().toString();
        ws6 ws6Var = this.sessionManager;
        if (ws6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var = null;
        }
        String string2 = ws6Var.k().toString();
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
            bgVar = bgVar4;
        }
        a55Var.m(string, string2, string3, bgVar.h.getText().toString(), this, hz0.a.n());
    }

    private final void v1() {
        try {
            if (getIntent() != null) {
                this.challan_title = String.valueOf(getIntent().getStringExtra("Service_name"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        bg bgVar = this.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        TextView textView = bgVar.j.i;
        wa3 wa3Var = this.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        textView.setText(wa3Var.b("cn_downloadTitle", getString(R.string.challan_notice_download_title)));
        this.sessionManager = new ws6(this);
        this.mRcService = RcService.INSTANCE.a(this);
        RcService rcService = this.mRcService;
        if (rcService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRcService");
            rcService = null;
        }
        this.mRcViewModel = (a55) new z(this, new b55(new s45(rcService))).a(a55.class);
        bg bgVar3 = this.binding;
        if (bgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar3 = null;
        }
        bgVar3.j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.w1(this.a, view);
            }
        });
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar4 = null;
        }
        bgVar4.j.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ur5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.x1(this.a, view);
            }
        });
        bg bgVar5 = this.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar5 = null;
        }
        bgVar5.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.y1(this.a, view);
            }
        });
        bg bgVar6 = this.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar6 = null;
        }
        bgVar6.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchPrintChallanActivity.z1(this.a, view);
            }
        });
        bg bgVar7 = this.binding;
        if (bgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar7 = null;
        }
        bgVar7.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchPrintChallanActivity.A1(this.a, view);
            }
        });
        bg bgVar8 = this.binding;
        if (bgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar8 = null;
        }
        bgVar8.l.addTextChangedListener(this.inputTextWatcher);
        bg bgVar9 = this.binding;
        if (bgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar9 = null;
        }
        bgVar9.d.addTextChangedListener(new a());
        bg bgVar10 = this.binding;
        if (bgVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar10 = null;
        }
        bgVar10.h.addTextChangedListener(new b());
        bg bgVar11 = this.binding;
        if (bgVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar11 = null;
        }
        bgVar11.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.B1(this.a, view);
            }
        });
        bg bgVar12 = this.binding;
        if (bgVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bgVar2 = bgVar12;
        }
        bgVar2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.C1(this.a, view);
            }
        });
    }

    public static final void w1(SearchPrintChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void x1(SearchPrintChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public static final void y1(SearchPrintChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bg bgVar = this$0.binding;
        bg bgVar2 = null;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        if (bgVar.c.isSelected()) {
            this$0.inputType = "";
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
        bgVar17.v.setVisibility(8);
        bg bgVar18 = this$0.binding;
        if (bgVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar18 = null;
        }
        bgVar18.g.setBackgroundResource(R.drawable.corner_circle_bg_14);
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
        bgVar22.l.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
        bg bgVar23 = this$0.binding;
        if (bgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar23 = null;
        }
        EditText editText = bgVar23.l;
        wa3 wa3Var = this$0.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        editText.setHint(wa3Var.b("enterCNoticePlaceHolder", this$0.getString(R.string.enter_challan_notice_no)));
        this$0.inputType = "Challan";
        bg bgVar24 = this$0.binding;
        if (bgVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar24 = null;
        }
        bgVar24.l.setError(null);
    }

    public static final void z1(SearchPrintChallanActivity this$0, View view) throws Throwable {
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
            bgVar3.v.setVisibility(8);
            this$0.inputType = "";
            bg bgVar4 = this$0.binding;
            if (bgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar4 = null;
            }
            bgVar4.x.setChecked(false);
            bg bgVar5 = this$0.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar5 = null;
            }
            bgVar5.x.setSelected(false);
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
        bgVar21.l.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        bg bgVar22 = this$0.binding;
        if (bgVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar22 = null;
        }
        EditText editText = bgVar22.l;
        wa3 wa3Var = this$0.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        editText.setHint(wa3Var.b("label_challan_enter_vehicle_no", this$0.getString(R.string.enter_vehicle_number)));
        this$0.inputType = "RC";
        bg bgVar23 = this$0.binding;
        if (bgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar23 = null;
        }
        bgVar23.v.setVisibility(0);
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
        this$0.F1();
    }

    public final boolean D1(String string) {
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
    public final void F1() throws Throwable {
        DatabaseHelper databaseHelper = this.databaseHelper;
        bg bgVar = null;
        b31 b31Var = null;
        if (databaseHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
            databaseHelper = null;
        }
        ArrayList arrayListH0 = databaseHelper.H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
        this.arrayList = arrayListH0;
        if (arrayListH0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayList");
            arrayListH0 = null;
        }
        if (arrayListH0.size() <= 0) {
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
        ArrayList arrayList = this.arrayList;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arrayList");
            arrayList = null;
        }
        b31 b31Var2 = new b31(arrayList, this, 3, this.challan_title);
        Intrinsics.checkNotNull(b31Var2);
        this.myRcAdapter = b31Var2;
        bg bgVar6 = this.binding;
        if (bgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar6 = null;
        }
        RecyclerView recyclerView = bgVar6.p;
        b31 b31Var3 = this.myRcAdapter;
        if (b31Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        } else {
            b31Var = b31Var3;
        }
        recyclerView.setAdapter(b31Var);
    }

    public final void G1() throws Throwable {
        DlobjX dlobj;
        DatabaseHelper databaseHelper = this.databaseHelper;
        String dlLicno = null;
        bg bgVar = null;
        dlLicno = null;
        if (databaseHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
            databaseHelper = null;
        }
        if (databaseHelper.z0() == null) {
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
            if (gd1.a.m(this.challan_title)) {
                bg bgVar3 = this.binding;
                if (bgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar3 = null;
                }
                TextView textView = bgVar3.y;
                wa3 wa3Var = this.langSession;
                if (wa3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var = null;
                }
                textView.setText(wa3Var.b("label_challan_print", "Print Challan"));
            } else {
                bg bgVar4 = this.binding;
                if (bgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar4 = null;
                }
                TextView textView2 = bgVar4.y;
                wa3 wa3Var2 = this.langSession;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var2 = null;
                }
                textView2.setText(wa3Var2.b("label_challan_download", this.challan_title));
            }
            bg bgVar5 = this.binding;
            if (bgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar5 = null;
            }
            TextView textView3 = bgVar5.u;
            wa3 wa3Var3 = this.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var3 = null;
            }
            textView3.setText(wa3Var3.b("label_challan_dl_no", "Driving Licence No"));
            bg bgVar6 = this.binding;
            if (bgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bgVar6 = null;
            }
            MyTextView myTextView = bgVar6.n;
            wa3 wa3Var4 = this.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var4 = null;
            }
            myTextView.setText(wa3Var4.b("label_challan_my_dl_number", getString(R.string.my_driving_license)));
            DatabaseHelper databaseHelper2 = this.databaseHelper;
            if (databaseHelper2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
                databaseHelper2 = null;
            }
            ArrayList arrayListZ0 = databaseHelper2.z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            if (((DLDocument) arrayListZ0.get(0)).getDldetails() != null) {
                bg bgVar7 = this.binding;
                if (bgVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar7 = null;
                }
                bgVar7.z.setVisibility(0);
                bg bgVar8 = this.binding;
                if (bgVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bgVar8 = null;
                }
                TextView textView4 = bgVar8.o;
                DldetobjX dldetails = ((DLDocument) arrayListZ0.get(0)).getDldetails();
                if (dldetails != null && (dlobj = dldetails.getDlobj()) != null) {
                    dlLicno = dlobj.getDlLicno();
                }
                textView4.setText(dlLicno);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void H1(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        wa3 wa3Var = this.langSession;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView.setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        wa3 wa3Var3 = this.langSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var2 = wa3Var3;
        }
        textView3.setText(wa3Var2.b("nex_parivahan", getString(R.string.app_name)));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.as5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanActivity.I1(dialog, view);
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
        a55 a55Var = null;
        if (bgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVarC = null;
        }
        setContentView(bgVarC.b());
        az1.a aVar = az1.a;
        bg bgVar = this.binding;
        if (bgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar = null;
        }
        aVar.j(this, bgVar);
        this.langSession = new wa3(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        wa3 wa3Var = this.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        progressDialog.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        this.databaseHelper = databaseHelperD0;
        bg bgVar2 = this.binding;
        if (bgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar2 = null;
        }
        bgVar2.p.setLayoutManager(new LinearLayoutManager(this, 0, false));
        zy1.a aVar2 = zy1.a;
        bg bgVar3 = this.binding;
        if (bgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar3 = null;
        }
        EditText engineEt = bgVar3.h;
        Intrinsics.checkNotNullExpressionValue(engineEt, "engineEt");
        aVar2.a(this, engineEt);
        bg bgVar4 = this.binding;
        if (bgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar4 = null;
        }
        EditText inputEt = bgVar4.l;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        aVar2.a(this, inputEt);
        bg bgVar5 = this.binding;
        if (bgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bgVar5 = null;
        }
        EditText chasisEt = bgVar5.d;
        Intrinsics.checkNotNullExpressionValue(chasisEt, "chasisEt");
        aVar2.a(this, chasisEt);
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra);
            this.serviceCode = stringExtra;
        }
        v1();
        F1();
        a55 a55Var2 = this.mRcViewModel;
        if (a55Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
            a55Var2 = null;
        }
        a55Var2.V().g(this, new f(new d()));
        a55 a55Var3 = this.mRcViewModel;
        if (a55Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        } else {
            a55Var = a55Var3;
        }
        a55Var.W().g(this, new f(new e()));
    }
}
