package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.DrivingLicenceTransactionDetails;
import com.nic.mparivahan.R;
import com.zepto.bb;
import com.zepto.gd1;
import com.zepto.pq;
import com.zepto.ta3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010DJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u0010.\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00106\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\"\u0010>\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010\u0011\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/FetchVahanViews/DrivingLicenceTransactionDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J0", "Landroid/widget/ImageView;", "C", "Landroid/widget/ImageView;", "n1", "()Landroid/widget/ImageView;", "A1", "(Landroid/widget/ImageView;)V", "mvvm_back", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "l1", "()Landroid/widget/TextView;", "y1", "(Landroid/widget/TextView;)V", "applicationNo", "E", "k1", "x1", "applicationDate", "F", "p1", "C1", "receiptno", "G", "o1", "B1", "receiptdate", "H", "s1", "F1", "tv_receiptdate", "I", "j1", "w1", "amount", "J", "t1", "G1", "tv_receiptno", "K", "u1", "H1", "tv_transactionname", "L", "q1", "D1", "transactionname", "M", "m1", "z1", "drivinglic_no", "N", "r1", "E1", "tv_amount", "Lcom/zepto/bb;", "O", "Lcom/zepto/bb;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DrivingLicenceTransactionDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView applicationNo;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView applicationDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView receiptno;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView receiptdate;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView tv_receiptdate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView amount;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView tv_receiptno;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView tv_transactionname;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView transactionname;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView drivinglic_no;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView tv_amount;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public bb binding;

    public static final void v1(DrivingLicenceTransactionDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void A1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void B1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.receiptdate = textView;
    }

    public final void C1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.receiptno = textView;
    }

    public final void D1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.transactionname = textView;
    }

    public final void E1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_amount = textView;
    }

    public final void F1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_receiptdate = textView;
    }

    public final void G1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_receiptno = textView;
    }

    public final void H1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_transactionname = textView;
    }

    public final void J0() {
        View viewFindViewById = findViewById(R.id.applicationNo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        y1((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.applicationDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        x1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.receiptno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_receiptno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        G1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.receiptdate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        B1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        w1((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.transactionname);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        D1((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_transactionname);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        H1((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.drivinglic_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        z1((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.back_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        A1((ImageView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.tv_receiptdate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        F1((TextView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.tv_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        E1((TextView) viewFindViewById12);
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ex1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DrivingLicenceTransactionDetails.v1(this.a, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            l1().setText(extras.getString("ApplicationNo"));
            k1().setText(extras.getString("ApplicationDate"));
            gd1.a aVar = gd1.a;
            if (aVar.m(extras.getString("ReceiptNo"))) {
                p1().setVisibility(8);
                t1().setVisibility(8);
            } else {
                p1().setText(extras.getString("ReceiptNo"));
            }
            if (aVar.m(extras.getString("TransactionName"))) {
                q1().setVisibility(8);
                u1().setVisibility(8);
            } else {
                q1().setText(extras.getString("TransactionName"));
            }
            j1().setText(extras.getString("Amount"));
            m1().setText(extras.getString("sarlogDlNumber"));
            String string = extras.getString("sarlogFeeDate");
            if (string == null || string.length() == 0 || StringsKt__StringsJVMKt.equals$default(extras.getString("sarlogFeeDate"), "NA", false, 2, null)) {
                s1().setVisibility(8);
                o1().setVisibility(8);
            } else {
                s1().setVisibility(0);
                o1().setVisibility(0);
                o1().setText(extras.getString("sarlogFeeDate"));
            }
            String string2 = extras.getString("Amount");
            if (string2 == null || string2.length() == 0 || StringsKt__StringsJVMKt.equals(extras.getString("Amount"), "NA", true)) {
                r1().setVisibility(8);
                j1().setVisibility(8);
            } else {
                r1().setVisibility(0);
                j1().setVisibility(0);
                j1().setText(extras.getString("Amount"));
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

    public final TextView m1() {
        TextView textView = this.drivinglic_no;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivinglic_no");
        return null;
    }

    public final ImageView n1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.receiptdate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("receiptdate");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl_transaction);
        bb bbVarC = bb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bbVarC, "inflate(...)");
        this.binding = bbVarC;
        bb bbVar = null;
        if (bbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bbVarC = null;
        }
        setContentView(bbVarC.b());
        ta3.a aVar = ta3.a;
        bb bbVar2 = this.binding;
        if (bbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bbVar = bbVar2;
        }
        aVar.L1(this, bbVar);
        J0();
    }

    public final TextView p1() {
        TextView textView = this.receiptno;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("receiptno");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.transactionname;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionname");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.tv_amount;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_amount");
        return null;
    }

    public final TextView s1() {
        TextView textView = this.tv_receiptdate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_receiptdate");
        return null;
    }

    public final TextView t1() {
        TextView textView = this.tv_receiptno;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_receiptno");
        return null;
    }

    public final TextView u1() {
        TextView textView = this.tv_transactionname;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_transactionname");
        return null;
    }

    public final void w1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.amount = textView;
    }

    public final void x1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.applicationDate = textView;
    }

    public final void y1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.applicationNo = textView;
    }

    public final void z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.drivinglic_no = textView;
    }
}
