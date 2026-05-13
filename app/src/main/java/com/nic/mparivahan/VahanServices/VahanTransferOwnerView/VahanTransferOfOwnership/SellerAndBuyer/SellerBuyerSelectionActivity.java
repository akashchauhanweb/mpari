package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerBuyerSelectionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yw5;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R'\u0010>\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerBuyerSelectionActivity;", "Lcom/zepto/pq;", "", "t1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/yw5;", "C", "Lcom/zepto/yw5;", "m1", "()Lcom/zepto/yw5;", "u1", "(Lcom/zepto/yw5;)V", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "o1", "()Landroid/app/ProgressDialog;", "w1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "E", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "F", "Ljava/lang/String;", "getState_code", "()Ljava/lang/String;", "setState_code", "(Ljava/lang/String;)V", "state_code", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "n1", "()Lcom/zepto/wa3;", "v1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ServiceList;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "getServiceListArray", "()Ljava/util/ArrayList;", "serviceListArray", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SellerBuyerSelectionActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public yw5 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final ArrayList serviceListArray = new ArrayList();

    public static final void p1(SellerBuyerSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void q1(SellerBuyerSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    public static final void r1(SellerBuyerSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        Intent intent = new Intent(this$0, (Class<?>) VahanSellerBuyerMainScreen.class);
        intent.putExtra("state_code", this$0.state_code);
        this$0.startActivity(intent);
    }

    public static final void s1(SellerBuyerSelectionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        Intent intent = new Intent(this$0, (Class<?>) TOBuyerInit.class);
        intent.putExtra("state_code", this$0.state_code);
        this$0.startActivity(intent);
    }

    private final void t1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final yw5 m1() {
        yw5 yw5Var = this.binding;
        if (yw5Var != null) {
            return yw5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 n1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
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

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_buyer_selection_activity);
        yw5 yw5VarC = yw5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yw5VarC, "inflate(...)");
        u1(yw5VarC);
        setContentView(m1().b());
        ta3.a.O1(this, m1());
        v1(new wa3(this));
        w1(new ProgressDialog(this));
        o1().setMessage("Please wait...");
        o1().setCancelable(false);
        o1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            this.state_code = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        m1().D.e.setVisibility(0);
        m1().D.i.setText(String.valueOf(n1().b("toSellerBuyer", "Transfer of Ownership \n (Seller & Buyer)")));
        m1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerSelectionActivity.p1(this.a, view);
            }
        });
        m1().D.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerSelectionActivity.q1(this.a, view);
            }
        });
        m1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ww5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerSelectionActivity.r1(this.a, view);
            }
        });
        m1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerSelectionActivity.s1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        finish();
        return true;
    }

    public final void u1(yw5 yw5Var) {
        Intrinsics.checkNotNullParameter(yw5Var, "<set-?>");
        this.binding = yw5Var;
    }

    public final void v1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void w1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }
}
