package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.os.Bundle;
import com.nic.mparivahan.R;
import com.zepto.gi7;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/TransferOwnerShipActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/gi7;", "C", "Lcom/zepto/gi7;", "i1", "()Lcom/zepto/gi7;", "j1", "(Lcom/zepto/gi7;)V", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TransferOwnerShipActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gi7 binding;

    public final gi7 i1() {
        gi7 gi7Var = this.binding;
        if (gi7Var != null) {
            return gi7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void j1(gi7 gi7Var) {
        Intrinsics.checkNotNullParameter(gi7Var, "<set-?>");
        this.binding = gi7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_transfer_ownership);
        gi7 gi7VarC = gi7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gi7VarC, "inflate(...)");
        j1(gi7VarC);
        setContentView(i1().b());
    }
}
