package com.nic.mparivahan.DPTNotice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.DPTNotice.VerifyNoticePaymentResponseScreen;
import com.nic.mparivahan.R;
import com.zepto.ph;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.yy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010'\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\"\u0010/\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R\"\u00103\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/VerifyNoticePaymentResponseScreen;", "Lcom/zepto/pq;", "", "l1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/zepto/ph;", "C", "Lcom/zepto/ph;", "binding", "", "D", "Ljava/lang/String;", "getChallanNoValue", "()Ljava/lang/String;", "setChallanNoValue", "(Ljava/lang/String;)V", "challanNoValue", "E", "getVehicleNoValue", "setVehicleNoValue", "vehicleNoValue", "F", "getTransactionIdValue", "setTransactionIdValue", "transactionIdValue", "G", "getTransactionStatusValue", "setTransactionStatusValue", "transactionStatusValue", "H", "getReceiptUrlValue", "setReceiptUrlValue", "receiptUrlValue", "I", "getAmountValue", "setAmountValue", "amountValue", "J", "getPaymentDate", "setPaymentDate", "paymentDate", "K", "getReceiptNo", "setReceiptNo", "receiptNo", "L", "getServiceName", "setServiceName", "serviceName", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "k1", "()Lcom/zepto/wa3;", "o1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VerifyNoticePaymentResponseScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ph binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String challanNoValue = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String vehicleNoValue = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String transactionIdValue = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String transactionStatusValue = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String receiptUrlValue = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String amountValue = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String paymentDate = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    private final void l1() {
        ph phVar = this.binding;
        ph phVar2 = null;
        if (phVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            phVar = null;
        }
        phVar.B.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyNoticePaymentResponseScreen.m1(this.a, view);
            }
        });
        if (this.transactionStatusValue.length() > 0) {
            if (StringsKt__StringsJVMKt.equals(this.transactionStatusValue, "Cash", true) || StringsKt__StringsJVMKt.equals(this.transactionStatusValue, "Success", true)) {
                ph phVar3 = this.binding;
                if (phVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar3 = null;
                }
                phVar3.C.setImageResource(R.drawable.verified);
                ph phVar4 = this.binding;
                if (phVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar4 = null;
                }
                phVar4.D.setText(k1().b("title_challan_trans_success", getString(R.string.transaction_success)));
                ph phVar5 = this.binding;
                if (phVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar5 = null;
                }
                phVar5.D.setTextColor(yy0.c(this, R.color.green_new));
                ph phVar6 = this.binding;
                if (phVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar6 = null;
                }
                phVar6.y.setText(k1().b("label_challan_print_receipt", getString(R.string.print_receipt)));
            } else if (StringsKt__StringsJVMKt.equals(this.transactionStatusValue, "Pending", true)) {
                ph phVar7 = this.binding;
                if (phVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar7 = null;
                }
                phVar7.C.setImageResource(R.drawable.new_pending);
                ph phVar8 = this.binding;
                if (phVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar8 = null;
                }
                phVar8.D.setText(k1().b("title_challan_trans_pending", getString(R.string.transaction_pending)));
                ph phVar9 = this.binding;
                if (phVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar9 = null;
                }
                phVar9.D.setTextColor(yy0.c(this, R.color.blue_new));
                ph phVar10 = this.binding;
                if (phVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar10 = null;
                }
                phVar10.y.setText(k1().b("btn_go_back", "Go Back"));
            } else if (StringsKt__StringsJVMKt.equals(this.transactionStatusValue, "Failed", true)) {
                ph phVar11 = this.binding;
                if (phVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar11 = null;
                }
                phVar11.C.setImageResource(R.drawable.payment_failed);
                ph phVar12 = this.binding;
                if (phVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar12 = null;
                }
                phVar12.D.setText(k1().b("title_challan_trans_failed", getString(R.string.transaction_failed)));
                ph phVar13 = this.binding;
                if (phVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar13 = null;
                }
                phVar13.D.setTextColor(yy0.c(this, R.color.red_new));
                ph phVar14 = this.binding;
                if (phVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    phVar14 = null;
                }
                phVar14.y.setText(k1().b("btn_try_again", getString(R.string.payment_try_again)));
            }
        }
        if (this.challanNoValue.length() > 0) {
            ph phVar15 = this.binding;
            if (phVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar15 = null;
            }
            phVar15.A.setText(this.challanNoValue);
        } else {
            ph phVar16 = this.binding;
            if (phVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar16 = null;
            }
            phVar16.A.setText("");
        }
        if (this.vehicleNoValue.length() > 0) {
            ph phVar17 = this.binding;
            if (phVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar17 = null;
            }
            phVar17.E.setText(this.vehicleNoValue);
        } else {
            ph phVar18 = this.binding;
            if (phVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar18 = null;
            }
            phVar18.E.setText("");
        }
        if (this.amountValue.length() > 0) {
            ph phVar19 = this.binding;
            if (phVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar19 = null;
            }
            phVar19.x.setText(this.amountValue);
        } else {
            ph phVar20 = this.binding;
            if (phVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                phVar20 = null;
            }
            phVar20.x.setText("");
        }
        ph phVar21 = this.binding;
        if (phVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            phVar2 = phVar21;
        }
        phVar2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.go7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyNoticePaymentResponseScreen.n1(this.a, view);
            }
        });
    }

    public static final void m1(VerifyNoticePaymentResponseScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void n1(VerifyNoticePaymentResponseScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(this$0.transactionStatusValue, "Cash") && !Intrinsics.areEqual(this$0.transactionStatusValue, "Success")) {
            Intent intent = new Intent(this$0, (Class<?>) NoticeSearch.class);
            intent.setFlags(67108864);
            intent.putExtra("serviceName", this$0.serviceName);
            this$0.startActivity(intent);
            this$0.finish();
            return;
        }
        if (this$0.receiptUrlValue.length() > 0) {
            Intent intent2 = new Intent(this$0, (Class<?>) DownloadNoticeActivity.class);
            intent2.putExtra("challanPdfUrl", this$0.receiptUrlValue);
            intent2.putExtra("challanNo", this$0.challanNoValue);
            intent2.putExtra("fromActivity", "byPassPayment");
            this$0.startActivity(intent2);
        }
    }

    public final wa3 k1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void o1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) NoticeSearch.class);
        intent.setFlags(67108864);
        intent.putExtra("serviceName", this.serviceName);
        startActivity(intent);
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ph phVarX = ph.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(phVarX, "inflate(...)");
        this.binding = phVarX;
        if (phVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            phVarX = null;
        }
        setContentView(phVarX.m());
        o1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra);
        this.challanNoValue = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("vehicleNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.vehicleNoValue = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("transactionId");
        Intrinsics.checkNotNull(stringExtra3);
        this.transactionIdValue = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("status");
        Intrinsics.checkNotNull(stringExtra4);
        this.transactionStatusValue = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("challanPdfUrl");
        Intrinsics.checkNotNull(stringExtra5);
        this.receiptUrlValue = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("amount");
        Intrinsics.checkNotNull(stringExtra6);
        this.amountValue = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("serviceName");
        Intrinsics.checkNotNull(stringExtra7);
        this.serviceName = stringExtra7;
        if (getIntent().hasExtra("paymentDate")) {
            String stringExtra8 = getIntent().getStringExtra("paymentDate");
            Intrinsics.checkNotNull(stringExtra8);
            this.paymentDate = stringExtra8;
        }
        if (getIntent().hasExtra("receiptNo")) {
            String stringExtra9 = getIntent().getStringExtra("receiptNo");
            Intrinsics.checkNotNull(stringExtra9);
            this.receiptNo = stringExtra9;
        }
        l1();
    }
}
