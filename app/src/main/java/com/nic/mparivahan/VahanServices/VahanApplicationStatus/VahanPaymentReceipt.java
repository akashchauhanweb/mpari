package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPaymentReceipt;
import com.zepto.oe;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanPaymentReceipt;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/oe;", "C", "Lcom/zepto/oe;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPaymentReceipt extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public oe binding;

    public static final void j1(VahanPaymentReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_receipt);
        oe oeVarC = oe.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oeVarC, "inflate(...)");
        this.binding = oeVarC;
        oe oeVar = null;
        if (oeVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oeVarC = null;
        }
        setContentView(oeVarC.b());
        oe oeVar2 = this.binding;
        if (oeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oeVar = oeVar2;
        }
        oeVar.c.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentReceipt.j1(this.a, view);
            }
        });
    }
}
