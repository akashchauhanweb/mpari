package com.nic.mparivahan.RC;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.RC.ViewRcChallanActivity;
import com.zepto.bq7;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sr7;
import com.zepto.ta3;
import com.zepto.wa3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0002R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001fj\b\u0012\u0004\u0012\u00020\u0006` 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/nic/mparivahan/RC/ViewRcChallanActivity;", "Lcom/zepto/pq;", "", "r1", "u1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "n1", "Lcom/zepto/sr7;", "C", "Lcom/zepto/sr7;", "m1", "()Lcom/zepto/sr7;", "x1", "(Lcom/zepto/sr7;)V", "binding", "", "D", "Ljava/lang/String;", "vehicleNo", "E", "type", "F", "engineNo", "G", "chassisNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "o1", "()Ljava/util/ArrayList;", "y1", "(Ljava/util/ArrayList;)V", "pendingsearchList", "Lcom/zepto/bq7;", "I", "Lcom/zepto/bq7;", "l1", "()Lcom/zepto/bq7;", "w1", "(Lcom/zepto/bq7;)V", "adapter", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "p1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "progressDialog", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "A1", "(Lcom/zepto/wa3;)V", "session", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "L", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "M", "Lcom/zepto/fz1;", "viewModel", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ViewRcChallanActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public sr7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String vehicleNo = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String type = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public bq7 adapter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public fz1 viewModel;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ChallanListModal challanListModal) {
            try {
                Intrinsics.checkNotNull(challanListModal);
                if (challanListModal.getStatus() != 200) {
                    if (ViewRcChallanActivity.this.p1().isShowing()) {
                        ViewRcChallanActivity.this.p1().dismiss();
                    }
                    ViewRcChallanActivity.this.m1().b.setVisibility(8);
                    ViewRcChallanActivity.this.m1().c.setVisibility(0);
                    return;
                }
                ViewRcChallanActivity.this.y1(challanListModal.getResult());
                ViewRcChallanActivity.this.m1().b.setVisibility(0);
                ViewRcChallanActivity.this.m1().c.setVisibility(8);
                if (ViewRcChallanActivity.this.getPendingsearchList().size() > 0) {
                    ViewRcChallanActivity viewRcChallanActivity = ViewRcChallanActivity.this;
                    viewRcChallanActivity.v1(viewRcChallanActivity.getPendingsearchList());
                } else {
                    ViewRcChallanActivity.this.m1().b.setVisibility(8);
                    ViewRcChallanActivity.this.m1().c.setVisibility(0);
                }
                if (ViewRcChallanActivity.this.p1().isShowing()) {
                    ViewRcChallanActivity.this.p1().dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (ViewRcChallanActivity.this.p1().isShowing()) {
                    ViewRcChallanActivity.this.p1().dismiss();
                }
                ViewRcChallanActivity.this.m1().b.setVisibility(8);
                ViewRcChallanActivity.this.m1().c.setVisibility(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanListModal) obj);
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

        public final void invoke(String str) {
            if (ViewRcChallanActivity.this.p1().isShowing()) {
                ViewRcChallanActivity.this.p1().dismiss();
            }
            ViewRcChallanActivity.this.m1().b.setVisibility(8);
            ViewRcChallanActivity.this.m1().c.setVisibility(0);
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

    private final void r1() {
        SearchChallanService searchChallanService = this.retrofitService;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        m1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewRcChallanActivity.s1(this.a, view);
            }
        });
        m1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewRcChallanActivity.t1(this.a, view);
            }
        });
        m1().b.setLayoutManager(new LinearLayoutManager(this));
        w1(new bq7(this, new ArrayList(), q1()));
        m1().b.setAdapter(l1());
        n1();
    }

    public static final void s1(ViewRcChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void t1(ViewRcChallanActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1();
    }

    private final void u1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(List searchList) {
        bq7 bq7VarL1 = l1();
        bq7VarL1.B(searchList);
        bq7VarL1.j();
    }

    public final void A1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final bq7 l1() {
        bq7 bq7Var = this.adapter;
        if (bq7Var != null) {
            return bq7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final sr7 m1() {
        sr7 sr7Var = this.binding;
        if (sr7Var != null) {
            return sr7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void n1() {
        try {
            p1().show();
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            fz1Var.l(this, this.type, this.vehicleNo, 1, this.engineNo, this.chassisNo);
        } catch (Exception e) {
            e.printStackTrace();
            if (p1().isShowing()) {
                p1().dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sr7 sr7VarC = sr7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sr7VarC, "inflate(...)");
        x1(sr7VarC);
        setContentView(m1().b());
        ta3.a.a3(this, m1());
        A1(new wa3(this));
        if (getIntent().hasExtra("rcNo")) {
            String stringExtra = getIntent().getStringExtra("rcNo");
            Intrinsics.checkNotNull(stringExtra);
            this.vehicleNo = stringExtra;
        }
        if (getIntent().hasExtra("type")) {
            String stringExtra2 = getIntent().getStringExtra("type");
            Intrinsics.checkNotNull(stringExtra2);
            this.type = stringExtra2;
        }
        if (getIntent().hasExtra("engineNo")) {
            String stringExtra3 = getIntent().getStringExtra("engineNo");
            Intrinsics.checkNotNull(stringExtra3);
            this.engineNo = stringExtra3;
        }
        if (getIntent().hasExtra("chassisNo")) {
            String stringExtra4 = getIntent().getStringExtra("chassisNo");
            Intrinsics.checkNotNull(stringExtra4);
            this.chassisNo = stringExtra4;
        }
        z1(new ProgressDialog(this));
        p1().setCancelable(false);
        p1().setCanceledOnTouchOutside(false);
        p1().setMessage(q1().b("label_challan_please_wait", "Please wait..."));
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        r1();
        fz1 fz1Var = this.viewModel;
        fz1 fz1Var2 = null;
        if (fz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var = null;
        }
        fz1Var.i().g(this, new c(new a()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var2 = fz1Var3;
        }
        fz1Var2.h().g(this, new c(new b()));
    }

    public final ProgressDialog p1() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void w1(bq7 bq7Var) {
        Intrinsics.checkNotNullParameter(bq7Var, "<set-?>");
        this.adapter = bq7Var;
    }

    public final void x1(sr7 sr7Var) {
        Intrinsics.checkNotNullParameter(sr7Var, "<set-?>");
        this.binding = sr7Var;
    }

    public final void y1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.pendingsearchList = arrayList;
    }

    public final void z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.progressDialog = progressDialog;
    }
}
