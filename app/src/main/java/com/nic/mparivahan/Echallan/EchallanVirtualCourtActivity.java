package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.EchallanVirtualCourtActivity;
import com.nic.mparivahan.Echallan.Model.VirtualChallanDetailsModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanProceedingModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanResultModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.R;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pb;
import com.zepto.pq;
import com.zepto.wa3;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/nic/mparivahan/Echallan/EchallanVirtualCourtActivity;", "Lcom/zepto/pq;", "", "t1", "s1", "w1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "o1", "Lcom/nic/mparivahan/Echallan/Model/VirtualChallanResultModel;", "result", "x1", "C", "Ljava/lang/String;", "challanNo", "Lcom/zepto/pb;", "D", "Lcom/zepto/pb;", "binding", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "dialog", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "F", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "G", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class EchallanVirtualCourtActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public pb binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

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
        public final void a(VirtualChallanDetailsModel virtualChallanDetailsModel) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = EchallanVirtualCourtActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = EchallanVirtualCourtActivity.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!kt6.d(virtualChallanDetailsModel.getStatus()) || !StringsKt__StringsJVMKt.equals(virtualChallanDetailsModel.getStatus(), "200", true)) {
                    EchallanVirtualCourtActivity echallanVirtualCourtActivity = EchallanVirtualCourtActivity.this;
                    echallanVirtualCourtActivity.o1(echallanVirtualCourtActivity, echallanVirtualCourtActivity.r1().b("error_msg_record_not_found", EchallanVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
                } else {
                    Intrinsics.checkNotNull(virtualChallanDetailsModel);
                    EchallanVirtualCourtActivity.this.x1(virtualChallanDetailsModel.getResult());
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = EchallanVirtualCourtActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = EchallanVirtualCourtActivity.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
                EchallanVirtualCourtActivity echallanVirtualCourtActivity2 = EchallanVirtualCourtActivity.this;
                echallanVirtualCourtActivity2.o1(echallanVirtualCourtActivity2, echallanVirtualCourtActivity2.r1().b("error_msg_record_not_found", EchallanVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VirtualChallanDetailsModel) obj);
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
            ProgressDialog progressDialog = EchallanVirtualCourtActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = EchallanVirtualCourtActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            EchallanVirtualCourtActivity echallanVirtualCourtActivity = EchallanVirtualCourtActivity.this;
            echallanVirtualCourtActivity.o1(echallanVirtualCourtActivity, echallanVirtualCourtActivity.r1().b("error_msg_record_not_found", EchallanVirtualCourtActivity.this.getString(R.string.service_unavable_please_try)));
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

    public static final void p1(Dialog d, EchallanVirtualCourtActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void q1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void s1() {
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
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            fz1Var.q(this, this.challanNo);
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

    private final void t1() {
        SearchChallanService searchChallanService = this.retrofitService;
        pb pbVar = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        pb pbVar2 = this.binding;
        if (pbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pbVar2 = null;
        }
        pbVar2.t.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EchallanVirtualCourtActivity.u1(this.a, view);
            }
        });
        pb pbVar3 = this.binding;
        if (pbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pbVar3 = null;
        }
        pbVar3.t.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EchallanVirtualCourtActivity.v1(this.a, view);
            }
        });
        pb pbVar4 = this.binding;
        if (pbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pbVar = pbVar4;
        }
        pbVar.s.setVisibility(8);
    }

    public static final void u1(EchallanVirtualCourtActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(EchallanVirtualCourtActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1();
    }

    private final void w1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void o1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EchallanVirtualCourtActivity.p1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EchallanVirtualCourtActivity.q1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echallan_virtual_court);
        pb pbVarC = pb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pbVarC, "inflate(...)");
        this.binding = pbVarC;
        fz1 fz1Var = null;
        if (pbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pbVarC = null;
        }
        setContentView(pbVarC.b());
        y1(new wa3(this));
        az1.a aVar = az1.a;
        pb pbVar = this.binding;
        if (pbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pbVar = null;
        }
        aVar.n(this, pbVar);
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        if (getIntent() != null && getIntent().hasExtra("challanNo")) {
            String stringExtra = getIntent().getStringExtra("challanNo");
            Intrinsics.checkNotNull(stringExtra);
            this.challanNo = stringExtra;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(r1().b("label_challan_getting_details", "Getting details..."));
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
        t1();
        if (kt6.d(this.challanNo)) {
            s1();
        }
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.C().g(this, new c(new a()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var3;
        }
        fz1Var.B().g(this, new c(new b()));
    }

    public final wa3 r1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void x1(VirtualChallanResultModel result) {
        pb pbVar = null;
        if (kt6.d(result.getChallan_no())) {
            pb pbVar2 = this.binding;
            if (pbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar2 = null;
            }
            pbVar2.c.setText(result.getChallan_no());
        }
        if (kt6.d(result.getAmount())) {
            pb pbVar3 = this.binding;
            if (pbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar3 = null;
            }
            pbVar3.b.setText(result.getAmount());
        }
        if (kt6.d(result.getCourt_address())) {
            pb pbVar4 = this.binding;
            if (pbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar4 = null;
            }
            pbVar4.j.setText(result.getCourt_address());
        }
        if (kt6.d(result.getCourt_name())) {
            pb pbVar5 = this.binding;
            if (pbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar5 = null;
            }
            pbVar5.k.setText(result.getCourt_name());
        }
        if (kt6.d(result.getForword_date())) {
            pb pbVar6 = this.binding;
            if (pbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar6 = null;
            }
            pbVar6.r.setText(result.getForword_date());
        }
        if (kt6.d(result.getProceeding_data()) && kt6.d(result.getProceeding_data().getDate_of_proceeding())) {
            pb pbVar7 = this.binding;
            if (pbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar7 = null;
            }
            pbVar7.p.setVisibility(0);
            pb pbVar8 = this.binding;
            if (pbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar8 = null;
            }
            pbVar8.N.setVisibility(0);
            pb pbVar9 = this.binding;
            if (pbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar9 = null;
            }
            pbVar9.P.setVisibility(0);
            pb pbVar10 = this.binding;
            if (pbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar10 = null;
            }
            pbVar10.n.setVisibility(0);
            pb pbVar11 = this.binding;
            if (pbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar11 = null;
            }
            pbVar11.l.setVisibility(0);
            VirtualChallanProceedingModel proceeding_data = result.getProceeding_data();
            if (kt6.d(proceeding_data.getDate_of_proceeding())) {
                pb pbVar12 = this.binding;
                if (pbVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pbVar12 = null;
                }
                pbVar12.q.setText(proceeding_data.getDate_of_proceeding());
            }
            if (kt6.d(proceeding_data.getFine_imposed())) {
                pb pbVar13 = this.binding;
                if (pbVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pbVar13 = null;
                }
                pbVar13.m.setText(proceeding_data.getFine_imposed());
            }
            if (kt6.d(proceeding_data.getParty_name())) {
                pb pbVar14 = this.binding;
                if (pbVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pbVar14 = null;
                }
                pbVar14.o.setText(proceeding_data.getParty_name());
            }
        } else {
            pb pbVar15 = this.binding;
            if (pbVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar15 = null;
            }
            pbVar15.p.setVisibility(8);
            pb pbVar16 = this.binding;
            if (pbVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar16 = null;
            }
            pbVar16.N.setVisibility(8);
            pb pbVar17 = this.binding;
            if (pbVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar17 = null;
            }
            pbVar17.P.setVisibility(8);
            pb pbVar18 = this.binding;
            if (pbVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar18 = null;
            }
            pbVar18.n.setVisibility(8);
            pb pbVar19 = this.binding;
            if (pbVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar19 = null;
            }
            pbVar19.l.setVisibility(8);
        }
        if (kt6.d(result.getContested_data()) && kt6.d(result.getContested_data().getChallan_no())) {
            pb pbVar20 = this.binding;
            if (pbVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar20 = null;
            }
            pbVar20.g.setVisibility(0);
        } else {
            pb pbVar21 = this.binding;
            if (pbVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                pbVar21 = null;
            }
            pbVar21.g.setVisibility(8);
        }
        if (kt6.d(result.getTransferred_to_court_data()) && kt6.d(result.getTransferred_to_court_data().getChallan_no())) {
            pb pbVar22 = this.binding;
            if (pbVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                pbVar = pbVar22;
            }
            pbVar.x.setVisibility(0);
            return;
        }
        pb pbVar23 = this.binding;
        if (pbVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pbVar = pbVar23;
        }
        pbVar.x.setVisibility(8);
    }

    public final void y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
