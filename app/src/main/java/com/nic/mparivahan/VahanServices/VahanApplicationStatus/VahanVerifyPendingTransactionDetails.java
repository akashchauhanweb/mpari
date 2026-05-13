package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransactionDetails;
import com.zepto.pq;
import com.zepto.th;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanVerifyPendingTransactionDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/th;", "C", "Lcom/zepto/th;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanVerifyPendingTransactionDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public th binding;

    public static final void j1(VahanVerifyPendingTransactionDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_pending_transaction_details);
        th thVarC = th.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(thVarC, "inflate(...)");
        this.binding = thVarC;
        th thVar = null;
        if (thVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            thVarC = null;
        }
        setContentView(thVarC.b());
        th thVar2 = this.binding;
        if (thVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            thVar = thVar2;
        }
        thVar.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVerifyPendingTransactionDetails.j1(this.a, view);
            }
        });
    }
}
