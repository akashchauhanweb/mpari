package com.nic.mparivahan.dlservices.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.ex;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.o40;
import com.zepto.wa3;
import com.zepto.wl5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/DLServiceFinalSubmitedActivity;", "Lcom/zepto/o40;", "Landroid/content/Context;", "context", "", "G1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/zepto/ex;", "F", "Lcom/zepto/ex;", "mBinding", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "languageSession", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "B1", "()Lcom/zepto/wl5;", "F1", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLServiceFinalSubmitedActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ex mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final void C1(DLServiceFinalSubmitedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void D1(DLServiceFinalSubmitedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void E1(DLServiceFinalSubmitedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ApplicationStatusActivity.class);
        new wl5(this$0).t("Application Status", VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        this$0.startActivity(intent);
    }

    public final wl5 B1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void F1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void G1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) DLServiceFinalSubmitedActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        new DashBoard().W1(this);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.application_submitted);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (ex) lq7VarF;
        this.languageSession = new wa3(this);
        F1(new wl5(this));
        ex exVar = this.mBinding;
        ex exVar2 = null;
        if (exVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar = null;
        }
        exVar.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceFinalSubmitedActivity.C1(this.a, view);
            }
        });
        ex exVar3 = this.mBinding;
        if (exVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar3 = null;
        }
        exVar3.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ya1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceFinalSubmitedActivity.D1(this.a, view);
            }
        });
        ex exVar4 = this.mBinding;
        if (exVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar4 = null;
        }
        exVar4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.za1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceFinalSubmitedActivity.E1(this.a, view);
            }
        });
        ex exVar5 = this.mBinding;
        if (exVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar5 = null;
        }
        MyTextView myTextView = exVar5.x;
        wa3 wa3Var = this.languageSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageSession");
            wa3Var = null;
        }
        myTextView.setText(wa3Var.b("label_app_submitted_successfully", "Your application has been submitted successfully."));
        ex exVar6 = this.mBinding;
        if (exVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar6 = null;
        }
        MyTextView myTextView2 = exVar6.y;
        wa3 wa3Var2 = this.languageSession;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageSession");
            wa3Var2 = null;
        }
        myTextView2.setText(wa3Var2.b("redirect_link_to_application_status", "Click here to check your Application Status"));
        ex exVar7 = this.mBinding;
        if (exVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar7 = null;
        }
        TextView textView = exVar7.z;
        wa3 wa3Var3 = this.languageSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageSession");
            wa3Var3 = null;
        }
        textView.setText(wa3Var3.b("label_home", "Home"));
        ex exVar8 = this.mBinding;
        if (exVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            exVar8 = null;
        }
        exVar8.C.e.setVisibility(8);
        ex exVar9 = this.mBinding;
        if (exVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            exVar2 = exVar9;
        }
        exVar2.A.g.setText(B1().k());
    }
}
