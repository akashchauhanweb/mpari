package com.nic.mparivahan.Dashboard.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.ui.VehicleServiceHomeNew;
import com.nic.mparivahan.R;
import com.zepto.h42;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.uy1;
import com.zepto.vy1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xy1;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/VehicleServiceHomeNew;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "l1", "()Landroid/widget/TextView;", "t1", "(Landroid/widget/TextView;)V", "lable", "Landroid/widget/LinearLayout;", "D", "Landroid/widget/LinearLayout;", "n1", "()Landroid/widget/LinearLayout;", "v1", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "w1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroidx/recyclerview/widget/RecyclerView;", "F", "Landroidx/recyclerview/widget/RecyclerView;", "p1", "()Landroidx/recyclerview/widget/RecyclerView;", "x1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView_vahan", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "y1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/xy1;", "H", "Lcom/zepto/xy1;", "m1", "()Lcom/zepto/xy1;", "u1", "(Lcom/zepto/xy1;)V", "mESViewModel", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "I", "Lcom/nic/mparivahan/Dashboard/EnabledServices/Interfaces/ESInterface;", "mESInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VehicleServiceHomeNew extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView lable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RecyclerView recyclerView_vahan;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public xy1 mESViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ESInterface mESInterface;

    public static final void q1(VehicleServiceHomeNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r1(VehicleServiceHomeNew this$0, EnableServiceResponse enableServiceResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.o1().dismiss();
            ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
            Collections.sort(enabledservice);
            this$0.p1().setLayoutManager(new GridLayoutManager(this$0, 4));
            this$0.p1().setAdapter(new h42(enabledservice, this$0, String.valueOf(this$0.getIntent().getStringExtra("state_code"))));
        } catch (Exception unused) {
            this$0.o1().dismiss();
        }
    }

    public static final void s1(VehicleServiceHomeNew this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.o1().dismiss();
        } catch (Exception unused) {
        }
    }

    public final TextView l1() {
        TextView textView = this.lable;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lable");
        return null;
    }

    public final xy1 m1() {
        xy1 xy1Var = this.mESViewModel;
        if (xy1Var != null) {
            return xy1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mESViewModel");
        return null;
    }

    public final LinearLayout n1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final ProgressDialog o1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_service_home_new);
        this.mESInterface = ESInterface.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        v1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.lableService);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        t1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vehicle_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        l1().setText(new wa3(this).b("label_vehicle_related", getString(R.string.vehicle_related_service)));
        View viewFindViewById4 = findViewById(R.id.es_vahan_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        x1((RecyclerView) viewFindViewById4);
        w1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        y1(new ws6(this));
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHomeNew.q1(this.a, view);
            }
        });
        ESInterface eSInterface = this.mESInterface;
        if (eSInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mESInterface");
            eSInterface = null;
        }
        u1((xy1) new z(this, new uy1(new vy1(eSInterface))).a(xy1.class));
        o1().show();
        m1().i(String.valueOf(getIntent().getStringExtra("state_code")));
        m1().s().g(this, new mf4() { // from class: com.zepto.hn7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VehicleServiceHomeNew.r1(this.a, (EnableServiceResponse) obj);
            }
        });
        m1().v().g(this, new mf4() { // from class: com.zepto.in7
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VehicleServiceHomeNew.s1(this.a, (String) obj);
            }
        });
    }

    public final RecyclerView p1() {
        RecyclerView recyclerView = this.recyclerView_vahan;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView_vahan");
        return null;
    }

    public final void t1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.lable = textView;
    }

    public final void u1(xy1 xy1Var) {
        Intrinsics.checkNotNullParameter(xy1Var, "<set-?>");
        this.mESViewModel = xy1Var;
    }

    public final void v1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void w1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void x1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView_vahan = recyclerView;
    }

    public final void y1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }
}
