package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeCourtProceedingDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeCourtStatusModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeVirtualCourtModel;
import com.nic.mparivahan.DPTNotice.NoticeVirtualCourtActivity;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.R;
import com.zepto.ec1;
import com.zepto.je;
import com.zepto.kt6;
import com.zepto.lc1;
import com.zepto.mc1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.wa3;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/NoticeVirtualCourtActivity;", "Lcom/zepto/pq;", "", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "n1", "Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeVirtualCourtModel;", "it", "u1", "r1", "Lcom/zepto/wa3;", "C", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "v1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/je;", "D", "Lcom/zepto/je;", "binding", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "E", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "retrofitService", "Lcom/zepto/mc1;", "F", "Lcom/zepto/mc1;", "viewModel", "G", "Ljava/lang/String;", "challanNo", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeVirtualCourtActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public je binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public NoticeService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public mc1 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog dialog;

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
        public final void a(NoticeVirtualCourtModel noticeVirtualCourtModel) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = NoticeVirtualCourtActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = NoticeVirtualCourtActivity.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (noticeVirtualCourtModel.getCode() == 200) {
                    if (noticeVirtualCourtModel.getResult().size() > 0) {
                        NoticeVirtualCourtActivity.this.u1(noticeVirtualCourtModel);
                    } else {
                        NoticeVirtualCourtActivity noticeVirtualCourtActivity = NoticeVirtualCourtActivity.this;
                        noticeVirtualCourtActivity.n1(noticeVirtualCourtActivity, noticeVirtualCourtActivity.q1().b("error_msg_record_not_found", NoticeVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = NoticeVirtualCourtActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = NoticeVirtualCourtActivity.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
                NoticeVirtualCourtActivity noticeVirtualCourtActivity2 = NoticeVirtualCourtActivity.this;
                noticeVirtualCourtActivity2.n1(noticeVirtualCourtActivity2, noticeVirtualCourtActivity2.q1().b("error_msg_record_not_found", NoticeVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NoticeVirtualCourtModel) obj);
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
            ProgressDialog progressDialog = NoticeVirtualCourtActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = NoticeVirtualCourtActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            NoticeVirtualCourtActivity noticeVirtualCourtActivity = NoticeVirtualCourtActivity.this;
            noticeVirtualCourtActivity.n1(noticeVirtualCourtActivity, noticeVirtualCourtActivity.q1().b("error_msg_record_not_found", NoticeVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
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

    public static final void o1(Dialog d, NoticeVirtualCourtActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void p1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void s1() {
        je jeVar = this.binding;
        NoticeService noticeService = null;
        if (jeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar = null;
        }
        jeVar.t.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeVirtualCourtActivity.t1(this.a, view);
            }
        });
        this.retrofitService = NoticeService.INSTANCE.a(this);
        NoticeService noticeService2 = this.retrofitService;
        if (noticeService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            noticeService = noticeService2;
        }
        this.viewModel = (mc1) new z(this, new lc1(new ec1(noticeService))).a(mc1.class);
        if (kt6.d(this.challanNo)) {
            r1();
        }
    }

    public static final void t1(NoticeVirtualCourtActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public final void n1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeVirtualCourtActivity.o1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeVirtualCourtActivity.p1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        je jeVarC = je.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jeVarC, "inflate(...)");
        this.binding = jeVarC;
        mc1 mc1Var = null;
        if (jeVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVarC = null;
        }
        setContentView(jeVarC.b());
        v1(new wa3(this));
        if (getIntent() != null && getIntent().hasExtra("challanNo")) {
            this.challanNo = String.valueOf(getIntent().getIntExtra("challanNo", 0));
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(q1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        s1();
        mc1 mc1Var2 = this.viewModel;
        if (mc1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mc1Var2 = null;
        }
        mc1Var2.j().g(this, new c(new a()));
        mc1 mc1Var3 = this.viewModel;
        if (mc1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            mc1Var = mc1Var3;
        }
        mc1Var.g().g(this, new c(new b()));
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void r1() {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = this.dialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog2 = null;
            }
            if (progressDialog2.isShowing()) {
                ProgressDialog progressDialog3 = this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
            }
            ProgressDialog progressDialog4 = this.dialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog4 = null;
            }
            progressDialog4.show();
            mc1 mc1Var = this.viewModel;
            if (mc1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                mc1Var = null;
            }
            mc1Var.n(this.challanNo);
        } catch (Exception e) {
            e.printStackTrace();
            ProgressDialog progressDialog5 = this.dialog;
            if (progressDialog5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this.dialog;
                if (progressDialog6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    public final void u1(NoticeVirtualCourtModel it) {
        Intrinsics.checkNotNull(it);
        je jeVar = null;
        if (it.getResult().size() > 0) {
            NoticeCourtStatusModel noticeCourtStatusModel = it.getResult().get(0);
            Intrinsics.checkNotNullExpressionValue(noticeCourtStatusModel, "get(...)");
            NoticeCourtStatusModel noticeCourtStatusModel2 = noticeCourtStatusModel;
            if (kt6.d(Integer.valueOf(noticeCourtStatusModel2.getChallan_no()))) {
                je jeVar2 = this.binding;
                if (jeVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jeVar2 = null;
                }
                jeVar2.c.setText(String.valueOf(noticeCourtStatusModel2.getChallan_no()));
            }
            if (kt6.d(Integer.valueOf(noticeCourtStatusModel2.getAmount()))) {
                je jeVar3 = this.binding;
                if (jeVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jeVar3 = null;
                }
                jeVar3.b.setText(String.valueOf(noticeCourtStatusModel2.getAmount()));
            }
            if (kt6.d(noticeCourtStatusModel2.getCourt_name())) {
                je jeVar4 = this.binding;
                if (jeVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jeVar4 = null;
                }
                jeVar4.k.setText(noticeCourtStatusModel2.getCourt_name());
            }
            if (kt6.d(noticeCourtStatusModel2.getCourt_address())) {
                je jeVar5 = this.binding;
                if (jeVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jeVar5 = null;
                }
                jeVar5.j.setText(noticeCourtStatusModel2.getCourt_address());
            }
            if (kt6.d(noticeCourtStatusModel2.getForword_date())) {
                je jeVar6 = this.binding;
                if (jeVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jeVar6 = null;
                }
                jeVar6.r.setText(noticeCourtStatusModel2.getForword_date());
            }
        }
        if (it.getProceeding_data().size() <= 0) {
            je jeVar7 = this.binding;
            if (jeVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar7 = null;
            }
            jeVar7.p.setVisibility(8);
            je jeVar8 = this.binding;
            if (jeVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar8 = null;
            }
            jeVar8.N.setVisibility(8);
            je jeVar9 = this.binding;
            if (jeVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar9 = null;
            }
            jeVar9.P.setVisibility(8);
            je jeVar10 = this.binding;
            if (jeVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar10 = null;
            }
            jeVar10.n.setVisibility(8);
            je jeVar11 = this.binding;
            if (jeVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jeVar = jeVar11;
            }
            jeVar.l.setVisibility(8);
            return;
        }
        je jeVar12 = this.binding;
        if (jeVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar12 = null;
        }
        jeVar12.p.setVisibility(0);
        je jeVar13 = this.binding;
        if (jeVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar13 = null;
        }
        jeVar13.N.setVisibility(0);
        je jeVar14 = this.binding;
        if (jeVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar14 = null;
        }
        jeVar14.P.setVisibility(0);
        je jeVar15 = this.binding;
        if (jeVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar15 = null;
        }
        jeVar15.n.setVisibility(0);
        je jeVar16 = this.binding;
        if (jeVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jeVar16 = null;
        }
        jeVar16.l.setVisibility(0);
        NoticeCourtProceedingDataModel noticeCourtProceedingDataModel = it.getProceeding_data().get(0);
        Intrinsics.checkNotNullExpressionValue(noticeCourtProceedingDataModel, "get(...)");
        NoticeCourtProceedingDataModel noticeCourtProceedingDataModel2 = noticeCourtProceedingDataModel;
        if (kt6.d(noticeCourtProceedingDataModel2.getDate_of_proceeding())) {
            je jeVar17 = this.binding;
            if (jeVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar17 = null;
            }
            jeVar17.q.setText(noticeCourtProceedingDataModel2.getDate_of_proceeding());
        }
        if (kt6.d(noticeCourtProceedingDataModel2.getFine_imposed())) {
            je jeVar18 = this.binding;
            if (jeVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jeVar18 = null;
            }
            jeVar18.m.setText(noticeCourtProceedingDataModel2.getFine_imposed());
        }
        if (kt6.d(noticeCourtProceedingDataModel2.getParty_name())) {
            je jeVar19 = this.binding;
            if (jeVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jeVar = jeVar19;
            }
            jeVar.o.setText(noticeCourtProceedingDataModel2.getParty_name());
        }
    }

    public final void v1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
