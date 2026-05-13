package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdrawTransactionApplied;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import com.nic.mparivahan.VahanServices.VahanModel.VahanDisposeAppSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.ev6;
import com.zepto.ib3;
import com.zepto.jv;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u0012\u0012\u0004\u0012\u00020/0.j\b\u0012\u0004\u0012\u00020/`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u001eR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010'R\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u001eR\u0016\u0010R\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u001eR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010'R\u0016\u0010V\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u001eR\u0016\u0010X\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u001e¨\u0006["}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanWithdrawTransactionApplied;", "Lcom/zepto/pq;", "Lcom/zepto/ev6$a;", "", "t1", "z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "position", "", "clickAble", "j", "Landroid/content/Context;", "context", "", "message", "A1", "onBackPressed", "C1", "q1", "C", "Landroid/content/Context;", "mContext", "Lcom/zepto/ib3;", "D", "Lcom/zepto/ib3;", "binding", "E", "Ljava/lang/String;", "applNo", "F", "ownerName", "G", "stateCd", "H", "registratioNo", "Lcom/zepto/jv;", "I", "Lcom/zepto/jv;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "J", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/ModifiedListOfDisposeApplModel;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "arrayList", "Lcom/zepto/ev6;", "L", "Lcom/zepto/ev6;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$p;", "M", "Landroidx/recyclerview/widget/RecyclerView$p;", "r1", "()Landroidx/recyclerview/widget/RecyclerView$p;", "F1", "(Landroidx/recyclerview/widget/RecyclerView$p;)V", "disposeTranscationManager", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "pDialog", "O", "Z", "isCheckBoxClicked", "P", "transactionId", "Q", "purCd", "R", "regNo", "S", "selectedStateCd", "T", "offCd", "U", "desc", "V", "transcationDateValue", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanWithdrawTransactionApplied extends pq implements ev6.a {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ib3 binding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ev6 adapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public RecyclerView.p disposeTranscationManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isCheckBoxClicked;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int purCd;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int offCd;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final Context mContext = this;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String registratioNo = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList arrayList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String transactionId = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String regNo = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedStateCd = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String desc = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String transcationDateValue = "";

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
        public final void a(VahanDisposeAppSuccessModel vahanDisposeAppSuccessModel) {
            if (VahanWithdrawTransactionApplied.this.s1().isShowing()) {
                VahanWithdrawTransactionApplied.this.s1().dismiss();
            }
            if (!Intrinsics.areEqual(vahanDisposeAppSuccessModel.get(0), "Application Dispose Sussessfully...")) {
                VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied = VahanWithdrawTransactionApplied.this;
                vahanWithdrawTransactionApplied.A1(vahanWithdrawTransactionApplied, vahanWithdrawTransactionApplied.getString(R.string.service_unavable_please_try));
            } else {
                VahanWithdrawTransactionApplied.this.startActivity(new Intent(VahanWithdrawTransactionApplied.this, (Class<?>) VahanServiceWithdrawnAccepted.class));
                VahanWithdrawTransactionApplied.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanDisposeAppSuccessModel) obj);
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
            if (VahanWithdrawTransactionApplied.this.s1().isShowing()) {
                VahanWithdrawTransactionApplied.this.s1().dismiss();
            }
            if (str.equals("Error")) {
                VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied = VahanWithdrawTransactionApplied.this;
                vahanWithdrawTransactionApplied.A1(vahanWithdrawTransactionApplied, vahanWithdrawTransactionApplied.getString(R.string.service_unavable_please_try));
            } else {
                VahanWithdrawTransactionApplied vahanWithdrawTransactionApplied2 = VahanWithdrawTransactionApplied.this;
                vahanWithdrawTransactionApplied2.A1(vahanWithdrawTransactionApplied2, str);
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void D1(Dialog d, VahanWithdrawTransactionApplied this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.q1();
    }

    public static final void E1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void t1() {
        ib3 ib3Var = this.binding;
        ib3 ib3Var2 = null;
        if (ib3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var = null;
        }
        ib3Var.g.setText("Dispose Application");
        ib3 ib3Var3 = this.binding;
        if (ib3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var3 = null;
        }
        ib3Var3.e.i.setText("Dispose Application");
        ApplicationService applicationService = this.retrofitService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        if (this.applNo.length() > 0) {
            ib3 ib3Var4 = this.binding;
            if (ib3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var4 = null;
            }
            ib3Var4.c.setText(this.applNo);
        }
        if (this.ownerName.length() > 0) {
            ib3 ib3Var5 = this.binding;
            if (ib3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var5 = null;
            }
            ib3Var5.d.setText(this.ownerName);
        }
        if (this.stateCd.length() > 0) {
            ib3 ib3Var6 = this.binding;
            if (ib3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var6 = null;
            }
            ib3Var6.m.setText(this.stateCd);
        }
        if (this.registratioNo.length() > 0) {
            ib3 ib3Var7 = this.binding;
            if (ib3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var7 = null;
            }
            ib3Var7.k.setText(this.registratioNo);
        }
        if (this.transcationDateValue.length() > 0) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
                Date date = simpleDateFormat.parse(this.transcationDateValue);
                Intrinsics.checkNotNull(date);
                String str = simpleDateFormat2.format(date);
                Intrinsics.checkNotNull(str);
                if (str.length() > 0) {
                    ib3 ib3Var8 = this.binding;
                    if (ib3Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ib3Var8 = null;
                    }
                    ib3Var8.b.setText(str);
                } else {
                    ib3 ib3Var9 = this.binding;
                    if (ib3Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ib3Var9 = null;
                    }
                    ib3Var9.b.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ib3 ib3Var10 = this.binding;
        if (ib3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var10 = null;
        }
        ib3Var10.h.setAlpha(0.5f);
        ib3 ib3Var11 = this.binding;
        if (ib3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var11 = null;
        }
        ib3Var11.h.setEnabled(false);
        ib3 ib3Var12 = this.binding;
        if (ib3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var12 = null;
        }
        ib3Var12.f.setAlpha(0.5f);
        ib3 ib3Var13 = this.binding;
        if (ib3Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var13 = null;
        }
        ib3Var13.f.setEnabled(false);
        if (this.arrayList.size() > 0) {
            F1(new LinearLayoutManager(this, 1, false));
            ib3 ib3Var14 = this.binding;
            if (ib3Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var14 = null;
            }
            ib3Var14.n.setLayoutManager(r1());
            this.adapter = new ev6(this.arrayList, this);
            ib3 ib3Var15 = this.binding;
            if (ib3Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var15 = null;
            }
            RecyclerView recyclerView = ib3Var15.n;
            ev6 ev6Var = this.adapter;
            if (ev6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                ev6Var = null;
            }
            recyclerView.setAdapter(ev6Var);
        }
        ib3 ib3Var16 = this.binding;
        if (ib3Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var16 = null;
        }
        ib3Var16.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.u1(this.a, view);
            }
        });
        ib3 ib3Var17 = this.binding;
        if (ib3Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var17 = null;
        }
        ib3Var17.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.v1(this.a, view);
            }
        });
        ib3 ib3Var18 = this.binding;
        if (ib3Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var18 = null;
        }
        ib3Var18.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.w1(this.a, view);
            }
        });
        ib3 ib3Var19 = this.binding;
        if (ib3Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var19 = null;
        }
        ib3Var19.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.x1(this.a, view);
            }
        });
        ib3 ib3Var20 = this.binding;
        if (ib3Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ib3Var2 = ib3Var20;
        }
        ib3Var2.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.zl7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanWithdrawTransactionApplied.y1(this.a, compoundButton, z);
            }
        });
    }

    public static final void u1(VahanWithdrawTransactionApplied this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ib3 ib3Var = this$0.binding;
        if (ib3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var = null;
        }
        if (ib3Var.f.isChecked()) {
            this$0.C1();
        } else {
            Toast.makeText(this$0, "Please agree term & condition", 0).show();
        }
    }

    public static final void v1(VahanWithdrawTransactionApplied this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void w1(VahanWithdrawTransactionApplied this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    public static final void x1(VahanWithdrawTransactionApplied this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y1(VahanWithdrawTransactionApplied this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ib3 ib3Var = null;
        if (z && this$0.isCheckBoxClicked) {
            ib3 ib3Var2 = this$0.binding;
            if (ib3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var2 = null;
            }
            ib3Var2.h.setAlpha(1.0f);
            ib3 ib3Var3 = this$0.binding;
            if (ib3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ib3Var = ib3Var3;
            }
            ib3Var.h.setEnabled(true);
            return;
        }
        ib3 ib3Var4 = this$0.binding;
        if (ib3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var4 = null;
        }
        ib3Var4.h.setAlpha(0.5f);
        ib3 ib3Var5 = this$0.binding;
        if (ib3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ib3Var = ib3Var5;
        }
        ib3Var.h.setEnabled(false);
    }

    private final void z1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ul7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.B1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void C1() {
        final Dialog dialog = new Dialog(this.mContext);
        dialog.setContentView(R.layout.dialog_withdraw_services_selection);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.dialogProceed);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById2 = dialog.findViewById(R.id.dialogCancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        ((MyTextView) viewFindViewById3).setText(this.desc);
        ((CardView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.am7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.D1(dialog, this, view);
            }
        });
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanWithdrawTransactionApplied.E1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void F1(RecyclerView.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.disposeTranscationManager = pVar;
    }

    public final void G1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.ev6.a
    public void j(int position, boolean clickAble) {
        ib3 ib3Var = null;
        if (!clickAble) {
            this.isCheckBoxClicked = false;
            this.transactionId = "";
            this.purCd = 0;
            this.regNo = "";
            this.selectedStateCd = "";
            this.offCd = 0;
            this.desc = "";
            ib3 ib3Var2 = this.binding;
            if (ib3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var2 = null;
            }
            ib3Var2.h.setAlpha(0.5f);
            ib3 ib3Var3 = this.binding;
            if (ib3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var3 = null;
            }
            ib3Var3.h.setEnabled(false);
            ib3 ib3Var4 = this.binding;
            if (ib3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var4 = null;
            }
            ib3Var4.f.setAlpha(0.5f);
            ib3 ib3Var5 = this.binding;
            if (ib3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ib3Var = ib3Var5;
            }
            ib3Var.f.setEnabled(false);
            return;
        }
        this.isCheckBoxClicked = true;
        this.transactionId = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getTransaction_no();
        this.purCd = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getPur_cd();
        this.regNo = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getRegn_no();
        this.selectedStateCd = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getState_cd();
        this.offCd = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getOff_cd();
        this.desc = ((ModifiedListOfDisposeApplModel) this.arrayList.get(position)).getDescr();
        ib3 ib3Var6 = this.binding;
        if (ib3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var6 = null;
        }
        if (ib3Var6.f.isChecked()) {
            ib3 ib3Var7 = this.binding;
            if (ib3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var7 = null;
            }
            ib3Var7.h.setAlpha(1.0f);
            ib3 ib3Var8 = this.binding;
            if (ib3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ib3Var8 = null;
            }
            ib3Var8.h.setEnabled(true);
        }
        ib3 ib3Var9 = this.binding;
        if (ib3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3Var9 = null;
        }
        ib3Var9.f.setAlpha(1.0f);
        ib3 ib3Var10 = this.binding;
        if (ib3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ib3Var = ib3Var10;
        }
        ib3Var.f.setEnabled(true);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, "Are you sure you want to leave?");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_withdrawn_transaction_applied);
        ib3 ib3VarC = ib3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ib3VarC, "inflate(...)");
        this.binding = ib3VarC;
        jv jvVar = null;
        if (ib3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ib3VarC = null;
        }
        setContentView(ib3VarC.b());
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            Intrinsics.checkNotNull(stringExtra);
            this.applNo = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("ownerName");
            Intrinsics.checkNotNull(stringExtra2);
            this.ownerName = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra3);
            this.stateCd = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("transactionDate");
            Intrinsics.checkNotNull(stringExtra4);
            this.transcationDateValue = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("regNo");
            Intrinsics.checkNotNull(stringExtra5);
            this.registratioNo = stringExtra5;
            ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("arrayList");
            Intrinsics.checkNotNull(arrayList);
            this.arrayList = arrayList;
        }
        G1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        t1();
        jv jvVar2 = this.viewModel;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            jvVar2 = null;
        }
        jvVar2.p().g(this, new c(new a()));
        jv jvVar3 = this.viewModel;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            jvVar = jvVar3;
        }
        jvVar.o().g(this, new c(new b()));
    }

    public final void q1() {
        if (s1().isShowing()) {
            s1().dismiss();
        }
        s1().show();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionID", this.transactionId);
            jSONObject.put("pur_cd", this.purCd);
            jSONObject.put("regn_no", this.regNo);
            jSONObject.put("state_cd", this.selectedStateCd);
            jSONObject.put("off_cd", this.offCd);
            jSONObject.put("descr", this.desc);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jv jvVar = this.viewModel;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                jvVar = null;
            }
            jvVar.g(this, jSONArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final RecyclerView.p r1() {
        RecyclerView.p pVar = this.disposeTranscationManager;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("disposeTranscationManager");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
