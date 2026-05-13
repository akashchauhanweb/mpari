package com.nic.mparivahan.Dashboard;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.NoticeViewMoreActivity;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import com.zepto.mf4;
import com.zepto.n32;
import com.zepto.pq;
import com.zepto.uy1;
import com.zepto.vy1;
import com.zepto.wa3;
import com.zepto.xy1;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/nic/mparivahan/Dashboard/NoticeViewMoreActivity;", "Lcom/zepto/pq;", "", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "printReceiptLl", "D", "challanStatusLl", "E", "challanPayment", "F", "verifyChallanPayment", "G", "printChallan", "Landroidx/appcompat/widget/AppCompatImageView;", "H", "Landroidx/appcompat/widget/AppCompatImageView;", "backIv", "Landroid/widget/RelativeLayout;", "I", "Landroid/widget/RelativeLayout;", "topHolder", "Landroidx/recyclerview/widget/RecyclerView;", "J", "Landroidx/recyclerview/widget/RecyclerView;", "challan_recyclerView", "Landroid/widget/TextView;", "K", "Landroid/widget/TextView;", "challan_title", "Lcom/zepto/xy1;", "L", "Lcom/zepto/xy1;", "q1", "()Lcom/zepto/xy1;", "A1", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "M", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "B1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeViewMoreActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout printReceiptLl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout challanStatusLl;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LinearLayout challanPayment;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public LinearLayout verifyChallanPayment;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public LinearLayout printChallan;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public AppCompatImageView backIv;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RelativeLayout topHolder;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public RecyclerView challan_recyclerView;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView challan_title;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public xy1 mESViewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ESInterface mESInterface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(EnableServiceResponse enableServiceResponse) {
            RecyclerView recyclerView = null;
            try {
                if (NoticeViewMoreActivity.this.r1().isShowing()) {
                    NoticeViewMoreActivity.this.r1().dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                    RecyclerView recyclerView2 = NoticeViewMoreActivity.this.challan_recyclerView;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(8);
                    return;
                }
                RecyclerView recyclerView3 = NoticeViewMoreActivity.this.challan_recyclerView;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                    recyclerView3 = null;
                }
                recyclerView3.setVisibility(0);
                RecyclerView recyclerView4 = NoticeViewMoreActivity.this.challan_recyclerView;
                if (recyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                    recyclerView4 = null;
                }
                recyclerView4.setLayoutManager(new GridLayoutManager(NoticeViewMoreActivity.this, 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                CollectionsKt__MutableCollectionsJVMKt.sort(enabledservice);
                if (enabledservice.size() <= 0) {
                    RecyclerView recyclerView5 = NoticeViewMoreActivity.this.challan_recyclerView;
                    if (recyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                        recyclerView5 = null;
                    }
                    recyclerView5.setVisibility(8);
                    return;
                }
                NoticeViewMoreActivity noticeViewMoreActivity = NoticeViewMoreActivity.this;
                n32 n32Var = new n32(enabledservice, noticeViewMoreActivity, String.valueOf(noticeViewMoreActivity.getIntent().getStringExtra("state_code")));
                RecyclerView recyclerView6 = NoticeViewMoreActivity.this.challan_recyclerView;
                if (recyclerView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                    recyclerView6 = null;
                }
                recyclerView6.setAdapter(n32Var);
                n32Var.j();
            } catch (Exception e) {
                e.printStackTrace();
                RecyclerView recyclerView7 = NoticeViewMoreActivity.this.challan_recyclerView;
                if (recyclerView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("challan_recyclerView");
                } else {
                    recyclerView = recyclerView7;
                }
                recyclerView.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnableServiceResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
            super(1);
        }

        public final void invoke(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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

    private final void s1() {
        View viewFindViewById = findViewById(R.id.printReceiptLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.printReceiptLl = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.challan_status_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.challanStatusLl = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.challan_payment);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.challanPayment = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.verify_payment_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.verifyChallanPayment = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.printChallanLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.printChallan = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.backIv = (AppCompatImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.topHolder = (RelativeLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.challan_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.challan_recyclerView = (RecyclerView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.challan_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.challan_title = (TextView) viewFindViewById9;
        wa3 wa3Var = new wa3(this);
        TextView textView = this.challan_title;
        LinearLayout linearLayout = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challan_title");
            textView = null;
        }
        textView.setText(wa3Var.b("label_Notice_related", getString(R.string.Notice_related)));
        AppCompatImageView appCompatImageView = this.backIv;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backIv");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.t1(this.a, view);
            }
        });
        RelativeLayout relativeLayout = this.topHolder;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topHolder");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.u1(this.a, view);
            }
        });
        LinearLayout linearLayout2 = this.printReceiptLl;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("printReceiptLl");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.v1(this.a, view);
            }
        });
        LinearLayout linearLayout3 = this.challanStatusLl;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challanStatusLl");
            linearLayout3 = null;
        }
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.w1(this.a, view);
            }
        });
        LinearLayout linearLayout4 = this.challanPayment;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challanPayment");
            linearLayout4 = null;
        }
        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.td4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.x1(this.a, view);
            }
        });
        LinearLayout linearLayout5 = this.verifyChallanPayment;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyChallanPayment");
            linearLayout5 = null;
        }
        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ud4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.y1(this.a, view);
            }
        });
        LinearLayout linearLayout6 = this.printChallan;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("printChallan");
        } else {
            linearLayout = linearLayout6;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeViewMoreActivity.z1(this.a, view);
            }
        });
        q1().q().g(this, new c(new a()));
        q1().r().g(this, new c(b.c));
    }

    public static final void t1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void u1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchPrintReceiptActivity.class));
    }

    public static final void w1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchChallanOnlineActivity.class));
    }

    public static final void x1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) PaymentSearchChallan.class));
    }

    public static final void y1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VerifyPaymentChallan.class));
    }

    public static final void z1(NoticeViewMoreActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchPrintChallanActivity.class));
    }

    public final void A1(xy1 xy1Var) {
        Intrinsics.checkNotNullParameter(xy1Var, "<set-?>");
        this.mESViewModel = xy1Var;
    }

    public final void B1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challan_view_more);
        B1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        this.mESInterface = ESInterface.INSTANCE.a(this);
        ESInterface eSInterface = this.mESInterface;
        if (eSInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            eSInterface = null;
        }
        A1((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
        q1().g(String.valueOf(getIntent().getStringExtra("state_code")));
        s1();
    }

    public final xy1 q1() {
        xy1 xy1Var = this.mESViewModel;
        if (xy1Var != null) {
            return xy1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mESViewModel");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
