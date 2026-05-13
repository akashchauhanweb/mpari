package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.VehicleTransactionDetails;
import com.nic.mparivahan.R;
import com.zepto.gd1;
import com.zepto.nh;
import com.zepto.pq;
import com.zepto.ta3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u0010.\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00106\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/FetchVahanViews/VehicleTransactionDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J0", "Landroid/widget/ImageView;", "C", "Landroid/widget/ImageView;", "m1", "()Landroid/widget/ImageView;", "y1", "(Landroid/widget/ImageView;)V", "mvvm_back", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "t1", "()Landroid/widget/TextView;", "F1", "(Landroid/widget/TextView;)V", "vehicleno", "E", "l1", "x1", "applicationNo", "F", "k1", "w1", "applicationDate", "G", "s1", "E1", "tv_receiptno", "H", "o1", "A1", "receiptno", "I", "n1", "z1", "receiptdate", "J", "j1", "v1", "amount", "K", "q1", "C1", "tv_amount", "L", "p1", "B1", "transactionname", "M", "r1", "D1", "tv_receiptdate", "Lcom/zepto/nh;", "N", "Lcom/zepto/nh;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VehicleTransactionDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView vehicleno;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView applicationNo;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView applicationDate;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView tv_receiptno;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView receiptno;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView receiptdate;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView amount;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView tv_amount;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView transactionname;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView tv_receiptdate;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public nh binding;

    public static final void u1(VehicleTransactionDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void A1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.receiptno = textView;
    }

    public final void B1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.transactionname = textView;
    }

    public final void C1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_amount = textView;
    }

    public final void D1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_receiptdate = textView;
    }

    public final void E1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_receiptno = textView;
    }

    public final void F1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vehicleno = textView;
    }

    public final void J0() {
        View viewFindViewById = findViewById(R.id.vehicleno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        F1((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.applicationNo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        x1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.applicationDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        w1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_receiptno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        E1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.receiptno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        A1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.receiptdate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        z1((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_receiptdate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        D1((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        v1((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.tv_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        C1((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.transactionname);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        B1((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.back_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        y1((ImageView) viewFindViewById11);
        m1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleTransactionDetails.u1(this.a, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            t1().setText(extras.getString("vehicleno"));
            l1().setText(extras.getString("ApplicationNo"));
            k1().setText(extras.getString("ApplicationDate"));
            p1().setText(extras.getString("TransactionName"));
            gd1.a aVar = gd1.a;
            if (aVar.m(extras.getString("ReceiptNo"))) {
                o1().setVisibility(8);
                s1().setVisibility(8);
            } else {
                o1().setText(extras.getString("ReceiptNo"));
            }
            if (aVar.m(extras.getString("ReceiptDate"))) {
                n1().setVisibility(8);
                r1().setVisibility(8);
            } else {
                n1().setText(extras.getString("ReceiptDate"));
            }
            if (!aVar.m(extras.getString("Amount"))) {
                j1().setText(extras.getString("Amount"));
            } else {
                j1().setVisibility(8);
                q1().setVisibility(8);
            }
        }
    }

    public final TextView j1() {
        TextView textView = this.amount;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amount");
        return null;
    }

    public final TextView k1() {
        TextView textView = this.applicationDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationDate");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.applicationNo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationNo");
        return null;
    }

    public final ImageView m1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.receiptdate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("receiptdate");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.receiptno;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("receiptno");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_transcation);
        nh nhVarC = nh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(nhVarC, "inflate(...)");
        this.binding = nhVarC;
        nh nhVar = null;
        if (nhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            nhVarC = null;
        }
        setContentView(nhVarC.b());
        ta3.a aVar = ta3.a;
        nh nhVar2 = this.binding;
        if (nhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            nhVar = nhVar2;
        }
        aVar.o2(this, nhVar);
        J0();
    }

    public final TextView p1() {
        TextView textView = this.transactionname;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionname");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.tv_amount;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_amount");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.tv_receiptdate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_receiptdate");
        return null;
    }

    public final TextView s1() {
        TextView textView = this.tv_receiptno;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_receiptno");
        return null;
    }

    public final TextView t1() {
        TextView textView = this.vehicleno;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleno");
        return null;
    }

    public final void v1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.amount = textView;
    }

    public final void w1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.applicationDate = textView;
    }

    public final void x1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.applicationNo = textView;
    }

    public final void y1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.receiptdate = textView;
    }
}
