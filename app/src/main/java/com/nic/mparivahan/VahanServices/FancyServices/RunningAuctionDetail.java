package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionDetail;
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionRepository.RunningAuctionRetrofitServices;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sf;
import com.zepto.sf5;
import com.zepto.vf5;
import com.zepto.wb0;
import com.zepto.wf5;
import com.zepto.xf5;
import com.zepto.yf5;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0014\u001a\u0004\b?\u0010\u0016\"\u0004\b@\u0010\u0018¨\u0006D"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/RunningAuctionDetail;", "Lcom/zepto/pq;", "", "q1", "m1", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/sf;", "C", "Lcom/zepto/sf;", "l1", "()Lcom/zepto/sf;", "v1", "(Lcom/zepto/sf;)V", "binding", "Ljava/util/ArrayList;", "", "D", "Ljava/util/ArrayList;", "getPendingsearchList", "()Ljava/util/ArrayList;", "setPendingsearchList", "(Ljava/util/ArrayList;)V", "pendingsearchList", "Lcom/zepto/sf5;", "E", "Lcom/zepto/sf5;", "k1", "()Lcom/zepto/sf5;", "u1", "(Lcom/zepto/sf5;)V", "adapter", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "n1", "()Landroid/app/ProgressDialog;", "w1", "(Landroid/app/ProgressDialog;)V", "progressDialog", "Lcom/nic/mparivahan/VahanServices/FancyServices/RunningAuctionRepository/RunningAuctionRetrofitServices;", "G", "Lcom/nic/mparivahan/VahanServices/FancyServices/RunningAuctionRepository/RunningAuctionRetrofitServices;", "retrofitService", "Lcom/zepto/yf5;", "H", "Lcom/zepto/yf5;", "viewModel", "", "I", "Ljava/lang/String;", "p1", "()Ljava/lang/String;", "y1", "(Ljava/lang/String;)V", "stateCode", "J", "o1", "x1", "rtoCode", "K", "getRunningAuctionArray", "setRunningAuctionArray", "runningAuctionArray", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RunningAuctionDetail extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public sf binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public sf5 adapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public RunningAuctionRetrofitServices retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public yf5 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList runningAuctionArray = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(xf5 xf5Var) {
            try {
                Intrinsics.checkNotNull(xf5Var);
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
                if (RunningAuctionDetail.this.n1().isShowing()) {
                    RunningAuctionDetail.this.n1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
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
            if (RunningAuctionDetail.this.n1().isShowing()) {
                RunningAuctionDetail.this.n1().dismiss();
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

    private final void m1() {
        try {
            n1().show();
            yf5 yf5Var = this.viewModel;
            if (yf5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                yf5Var = null;
            }
            yf5Var.i(p1(), o1());
        } catch (Exception e) {
            e.printStackTrace();
            if (n1().isShowing()) {
                n1().dismiss();
            }
        }
    }

    private final void q1() {
        RunningAuctionRetrofitServices runningAuctionRetrofitServices = this.retrofitService;
        if (runningAuctionRetrofitServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            runningAuctionRetrofitServices = null;
        }
        this.viewModel = (yf5) new z(this, new vf5(new wf5(runningAuctionRetrofitServices))).a(yf5.class);
        l1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningAuctionDetail.r1(this.a, view);
            }
        });
        l1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningAuctionDetail.s1(this.a, view);
            }
        });
        l1().b.setLayoutManager(new LinearLayoutManager(this));
        u1(new sf5(this, new ArrayList()));
        l1().b.setAdapter(k1());
        m1();
    }

    public static final void r1(RunningAuctionDetail this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void s1(RunningAuctionDetail this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    private final void t1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final sf5 k1() {
        sf5 sf5Var = this.adapter;
        if (sf5Var != null) {
            return sf5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final sf l1() {
        sf sfVar = this.binding;
        if (sfVar != null) {
            return sfVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        return null;
    }

    public final String o1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sf sfVarC = sf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sfVarC, "inflate(...)");
        v1(sfVarC);
        setContentView(l1().b());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            y1(string);
            String string2 = extras.getString("rtoCode", "0");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            x1(string2);
        }
        l1().d.i.setText("Running Auctions");
        w1(new ProgressDialog(this));
        n1().setCancelable(false);
        n1().setCanceledOnTouchOutside(false);
        this.retrofitService = RunningAuctionRetrofitServices.INSTANCE.a(this);
        q1();
        yf5 yf5Var = this.viewModel;
        yf5 yf5Var2 = null;
        if (yf5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yf5Var = null;
        }
        yf5Var.h().g(this, new c(new a()));
        yf5 yf5Var3 = this.viewModel;
        if (yf5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            yf5Var2 = yf5Var3;
        }
        yf5Var2.g().g(this, new c(new b()));
    }

    public final String p1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final void u1(sf5 sf5Var) {
        Intrinsics.checkNotNullParameter(sf5Var, "<set-?>");
        this.adapter = sf5Var;
    }

    public final void v1(sf sfVar) {
        Intrinsics.checkNotNullParameter(sfVar, "<set-?>");
        this.binding = sfVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.progressDialog = progressDialog;
    }

    public final void x1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }
}
