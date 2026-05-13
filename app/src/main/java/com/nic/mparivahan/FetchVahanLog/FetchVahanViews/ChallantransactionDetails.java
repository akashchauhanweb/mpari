package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.ChallantransactionDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.gd1;
import com.zepto.pq;
import com.zepto.t6;
import com.zepto.ta3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/FetchVahanViews/ChallantransactionDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J0", "Lcom/zepto/t6;", "C", "Lcom/zepto/t6;", "j1", "()Lcom/zepto/t6;", "l1", "(Lcom/zepto/t6;)V", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChallantransactionDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public t6 binding;

    public static final void k1(ChallantransactionDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void J0() {
        j1().q.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallantransactionDetails.k1(this.a, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("echlogchallannumber");
            String string2 = extras.getString("echlogDocNumber");
            String string3 = extras.getString("echlogStateCd");
            String string4 = extras.getString("echlogChallanDate");
            String string5 = extras.getString("challanAmt");
            String string6 = extras.getString("echlogChallanStatus");
            String string7 = extras.getString("echlogPaymentDate");
            String string8 = extras.getString("echlogTransId");
            String string9 = extras.getString("echlogReceiptNo");
            String string10 = extras.getString("doctype");
            j1().g.setText(string);
            j1().c.setText(string4);
            j1().b.setText(string5);
            j1().x.setText(string6);
            j1().w.setText(VContant.INSTANCE.l(String.valueOf(string3)));
            j1().z.setText(string8);
            j1().u.setText(string9);
            j1().s.setText(string7);
            gd1.a aVar = gd1.a;
            if (aVar.m(string8) || StringsKt__StringsJVMKt.equals$default(string8, "NA", false, 2, null)) {
                j1().m.setVisibility(8);
            }
            if (aVar.m(string9) || StringsKt__StringsJVMKt.equals$default(string9, "NA", false, 2, null)) {
                j1().i.setVisibility(8);
            }
            if (aVar.m(string7) || StringsKt__StringsJVMKt.equals$default(string7, "NA", false, 2, null)) {
                j1().h.setVisibility(8);
            }
            if (aVar.m(string5) || StringsKt__StringsJVMKt.equals$default(string5, "NA", false, 2, null)) {
                j1().e.setVisibility(8);
            }
            if (StringsKt__StringsJVMKt.equals$default(string10, "RC", false, 2, null)) {
                j1().o.setVisibility(8);
                j1().p.setText(string2);
            }
            if (StringsKt__StringsJVMKt.equals$default(string10, "DL", false, 2, null)) {
                j1().C.setVisibility(8);
                j1().E.setText(string2);
            }
            if (aVar.m(string2)) {
                return;
            }
            if (String.valueOf(string2).length() > 11) {
                j1().C.setVisibility(8);
                j1().p.setText(string2);
            } else {
                j1().o.setVisibility(8);
                j1().E.setText(string2);
            }
        }
    }

    public final t6 j1() {
        t6 t6Var = this.binding;
        if (t6Var != null) {
            return t6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void l1(t6 t6Var) {
        Intrinsics.checkNotNullParameter(t6Var, "<set-?>");
        this.binding = t6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challan_transaction);
        t6 t6VarC = t6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(t6VarC, "inflate(...)");
        l1(t6VarC);
        setContentView(j1().b());
        ta3.a.M(this, j1());
        J0();
    }
}
