package com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownload;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.DownloadCheckpostTaxReceiptList;
import com.zepto.dv1;
import com.zepto.eb;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.tj0;
import com.zepto.uj0;
import com.zepto.vj0;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R2\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0014j\b\u0012\u0004\u0012\u00020\u0006`\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/DownloadCheckpostTaxReceiptList;", "Lcom/zepto/pq;", "", "r1", "u1", "", "Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptModel/CheckpostTaxReceiptDownloadItem;", "searchList", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/eb;", "C", "Lcom/zepto/eb;", "m1", "()Lcom/zepto/eb;", "x1", "(Lcom/zepto/eb;)V", "binding", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "n1", "()Ljava/util/ArrayList;", "y1", "(Ljava/util/ArrayList;)V", "pendingsearchList", "Lcom/zepto/dv1;", "E", "Lcom/zepto/dv1;", "l1", "()Lcom/zepto/dv1;", "w1", "(Lcom/zepto/dv1;)V", "adapter", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "progressDialog", "", "G", "Ljava/lang/String;", "q1", "()Ljava/lang/String;", "B1", "(Ljava/lang/String;)V", "stateCode", "H", "p1", "A1", "regNo", "Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptServices/CheckpostTaxReceiptServices;", "I", "Lcom/nic/mparivahan/VahanServices/Checkpost/CheckpostTaxReceipt/CheckpostTaxReceiptServices/CheckpostTaxReceiptServices;", "retrofitServicetax", "Lcom/zepto/vj0;", "J", "Lcom/zepto/vj0;", "viewModeltax", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownloadCheckpostTaxReceiptList extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public dv1 adapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String regNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public CheckpostTaxReceiptServices retrofitServicetax;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public vj0 viewModeltax;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(CheckpostTaxReceiptDownload checkpostTaxReceiptDownload) {
            try {
                DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList = DownloadCheckpostTaxReceiptList.this;
                Intrinsics.checkNotNull(checkpostTaxReceiptDownload, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem> }");
                downloadCheckpostTaxReceiptList.y1(checkpostTaxReceiptDownload);
                if (DownloadCheckpostTaxReceiptList.this.getPendingsearchList().size() > 0) {
                    Log.e("chekTaxc", DownloadCheckpostTaxReceiptList.this.getPendingsearchList().toString());
                    DownloadCheckpostTaxReceiptList downloadCheckpostTaxReceiptList2 = DownloadCheckpostTaxReceiptList.this;
                    downloadCheckpostTaxReceiptList2.v1(downloadCheckpostTaxReceiptList2.getPendingsearchList());
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (DownloadCheckpostTaxReceiptList.this.o1().isShowing()) {
                    DownloadCheckpostTaxReceiptList.this.o1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckpostTaxReceiptDownload) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
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
        this.retrofitServicetax = CheckpostTaxReceiptServices.INSTANCE.a(this);
        CheckpostTaxReceiptServices checkpostTaxReceiptServices = this.retrofitServicetax;
        vj0 vj0Var = null;
        if (checkpostTaxReceiptServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServicetax");
            checkpostTaxReceiptServices = null;
        }
        this.viewModeltax = (vj0) new z(this, new tj0(new uj0(checkpostTaxReceiptServices))).a(vj0.class);
        m1().e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.av1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCheckpostTaxReceiptList.s1(this.a, view);
            }
        });
        m1().e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCheckpostTaxReceiptList.t1(this.a, view);
            }
        });
        m1().c.setLayoutManager(new LinearLayoutManager(this));
        w1(new dv1(this, new ArrayList()));
        m1().c.setAdapter(l1());
        try {
            o1().show();
            vj0 vj0Var2 = this.viewModeltax;
            if (vj0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModeltax");
            } else {
                vj0Var = vj0Var2;
            }
            vj0Var.i(q1(), p1());
        } catch (Exception e) {
            e.printStackTrace();
            if (o1().isShowing()) {
                o1().dismiss();
            }
        }
        m1().c.setAdapter(l1());
        if (o1().isShowing()) {
            o1().dismiss();
        }
    }

    public static final void s1(DownloadCheckpostTaxReceiptList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void t1(DownloadCheckpostTaxReceiptList this$0, View view) {
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
        dv1 dv1VarL1 = l1();
        dv1VarL1.B(searchList);
        dv1VarL1.j();
    }

    public final void A1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regNo = str;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final dv1 l1() {
        dv1 dv1Var = this.adapter;
        if (dv1Var != null) {
            return dv1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final eb m1() {
        eb ebVar = this.binding;
        if (ebVar != null) {
            return ebVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: n1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eb ebVarC = eb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ebVarC, "inflate(...)");
        x1(ebVarC);
        setContentView(m1().b());
        ta3.a.D0(this, m1());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            B1(string);
            String string2 = extras.getString("regNo", "0");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            A1(string2);
            Log.e("stateInfo", q1().toString());
            Log.e("stateInfo", p1().toString());
        }
        m1().e.i.setText("Download Checkpost Tax Receipt");
        z1(new ProgressDialog(this));
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        r1();
        vj0 vj0Var = this.viewModeltax;
        if (vj0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModeltax");
            vj0Var = null;
        }
        vj0Var.g().g(this, new b(new a()));
    }

    public final String p1() {
        String str = this.regNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regNo");
        return null;
    }

    public final String q1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final void w1(dv1 dv1Var) {
        Intrinsics.checkNotNullParameter(dv1Var, "<set-?>");
        this.adapter = dv1Var;
    }

    public final void x1(eb ebVar) {
        Intrinsics.checkNotNullParameter(ebVar, "<set-?>");
        this.binding = ebVar;
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
