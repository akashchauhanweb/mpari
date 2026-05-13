package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanServiceWithdrawnAccepted;
import com.zepto.gg;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanServiceWithdrawnAccepted;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/gg;", "C", "Lcom/zepto/gg;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanServiceWithdrawnAccepted extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gg binding;

    public static final void k1(VahanServiceWithdrawnAccepted this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void l1(VahanServiceWithdrawnAccepted this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanWithdraw.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_withdrawn_accepted);
        gg ggVarC = gg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ggVarC, "inflate(...)");
        this.binding = ggVarC;
        gg ggVar = null;
        if (ggVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ggVarC = null;
        }
        setContentView(ggVarC.b());
        gg ggVar2 = this.binding;
        if (ggVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ggVar2 = null;
        }
        ggVar2.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.th7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanServiceWithdrawnAccepted.k1(this.a, view);
            }
        });
        gg ggVar3 = this.binding;
        if (ggVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ggVar = ggVar3;
        }
        ggVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanServiceWithdrawnAccepted.l1(this.a, view);
            }
        });
    }
}
