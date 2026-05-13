package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.SearchChallanDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.pq;
import com.zepto.yp5;
import com.zepto.yy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0014¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchChallanDetails;", "Lcom/zepto/pq;", "", "n1", "s1", "m1", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "selectedChallan", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "C", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "Lcom/zepto/yp5;", "D", "Lcom/zepto/yp5;", "binding", "", "E", "Ljava/lang/String;", "inputType", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "F", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "G", "Lcom/zepto/fz1;", "viewModel", "H", "selectedButton", "I", "dlNo", "J", "challanPlace", "K", "challanNo", "L", "chassisNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SearchChallanDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public SearchChallanResultModel selectedChallan;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public yp5 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String selectedButton = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String challanPlace = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String chassisNo = "";

    private final void m1() {
        fz1 fz1Var;
        yp5 yp5Var = null;
        try {
            yp5 yp5Var2 = this.binding;
            if (yp5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var2 = null;
            }
            yp5Var2.B.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            SearchChallanResultModel searchChallanResultModel = this.selectedChallan;
            String challanNo = searchChallanResultModel != null ? searchChallanResultModel.getChallanNo() : null;
            Intrinsics.checkNotNull(challanNo);
            SearchChallanResultModel searchChallanResultModel2 = this.selectedChallan;
            String stateCd = searchChallanResultModel2 != null ? searchChallanResultModel2.getStateCd() : null;
            Intrinsics.checkNotNull(stateCd);
            SearchChallanResultModel searchChallanResultModel3 = this.selectedChallan;
            String docNo = searchChallanResultModel3 != null ? searchChallanResultModel3.getDocNo() : null;
            Intrinsics.checkNotNull(docNo);
            fz1Var.n(this, challanNo, "", "", stateCd, docNo, "62", this.chassisNo);
        } catch (Exception e) {
            e.printStackTrace();
            yp5 yp5Var3 = this.binding;
            if (yp5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yp5Var = yp5Var3;
            }
            yp5Var.B.setVisibility(8);
        }
    }

    private final void n1() {
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        SearchChallanService searchChallanService = this.retrofitService;
        yp5 yp5Var = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        yp5 yp5Var2 = this.binding;
        if (yp5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var2 = null;
        }
        yp5Var2.G.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.up5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanDetails.o1(this.a, view);
            }
        });
        yp5 yp5Var3 = this.binding;
        if (yp5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var3 = null;
        }
        yp5Var3.j.setVisibility(8);
        yp5 yp5Var4 = this.binding;
        if (yp5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var4 = null;
        }
        yp5Var4.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanDetails.p1(this.a, view);
            }
        });
        yp5 yp5Var5 = this.binding;
        if (yp5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var5 = null;
        }
        yp5Var5.G.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanDetails.q1(this.a, view);
            }
        });
        yp5 yp5Var6 = this.binding;
        if (yp5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var6 = null;
        }
        yp5Var6.x.setVisibility(8);
        yp5 yp5Var7 = this.binding;
        if (yp5Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yp5Var = yp5Var7;
        }
        yp5Var.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanDetails.r1(this.a, view);
            }
        });
    }

    public static final void o1(SearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void p1(SearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Challan";
        this$0.m1();
    }

    public static final void q1(SearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s1();
    }

    public static final void r1(SearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Receipt";
        this$0.m1();
    }

    private final void s1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void t1(SearchChallanResultModel selectedChallan) {
        String ownerName;
        yp5 yp5Var = null;
        Boolean boolValueOf = (selectedChallan == null || (ownerName = selectedChallan.getOwnerName()) == null) ? null : Boolean.valueOf(ownerName.length() > 0);
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            yp5 yp5Var2 = this.binding;
            if (yp5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var2 = null;
            }
            yp5Var2.u.setText(selectedChallan.getOwnerName());
        }
        if (selectedChallan.getDocNo().length() > 0) {
            yp5 yp5Var3 = this.binding;
            if (yp5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var3 = null;
            }
            yp5Var3.q.setText(selectedChallan.getDocNo());
        }
        if (this.dlNo.length() > 7) {
            yp5 yp5Var4 = this.binding;
            if (yp5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var4 = null;
            }
            yp5Var4.o.setText(this.dlNo);
        } else {
            yp5 yp5Var5 = this.binding;
            if (yp5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var5 = null;
            }
            yp5Var5.m.setVisibility(8);
        }
        if (selectedChallan.getChallanNo().length() > 0) {
            yp5 yp5Var6 = this.binding;
            if (yp5Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var6 = null;
            }
            yp5Var6.l.setText(selectedChallan.getChallanNo());
        }
        if (selectedChallan.getDateTime().length() > 0) {
            yp5 yp5Var7 = this.binding;
            if (yp5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var7 = null;
            }
            yp5Var7.e.setText(a.a.a(selectedChallan.getDateTime()));
        }
        if (this.challanPlace.length() > 0) {
            yp5 yp5Var8 = this.binding;
            if (yp5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var8 = null;
            }
            yp5Var8.i.setText(this.challanPlace);
        }
        String str = "";
        if (selectedChallan.getOffences().size() > 0) {
            int size = selectedChallan.getOffences().size();
            for (int i = 0; i < size; i++) {
                str = i == 0 ? (i + 1) + ". " + selectedChallan.getOffences().get(i).getOffenceName() : str + '\n' + (i + 1) + ". " + selectedChallan.getOffences().get(i).getOffenceName();
            }
        }
        yp5 yp5Var9 = this.binding;
        if (yp5Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var9 = null;
        }
        yp5Var9.r.y(yy0.c(this, R.color.back_color));
        yp5 yp5Var10 = this.binding;
        if (yp5Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var10 = null;
        }
        yp5Var10.r.z(0);
        yp5 yp5Var11 = this.binding;
        if (yp5Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var11 = null;
        }
        yp5Var11.r.A("Read More");
        yp5 yp5Var12 = this.binding;
        if (yp5Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var12 = null;
        }
        yp5Var12.r.A("Read Less");
        yp5 yp5Var13 = this.binding;
        if (yp5Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var13 = null;
        }
        yp5Var13.r.x(500);
        yp5 yp5Var14 = this.binding;
        if (yp5Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5Var14 = null;
        }
        yp5Var14.r.setText(str);
        if (selectedChallan.getAmount().length() > 0) {
            yp5 yp5Var15 = this.binding;
            if (yp5Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var15 = null;
            }
            yp5Var15.c.setText(selectedChallan.getAmount());
        }
        if (selectedChallan.getChallanStatus().length() > 0) {
            yp5 yp5Var16 = this.binding;
            if (yp5Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var16 = null;
            }
            yp5Var16.z.setText(selectedChallan.getChallanStatus());
        }
        if (selectedChallan.getPaymentEligible() == 3) {
            yp5 yp5Var17 = this.binding;
            if (yp5Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var17 = null;
            }
            yp5Var17.x.setVisibility(8);
            yp5 yp5Var18 = this.binding;
            if (yp5Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var18 = null;
            }
            yp5Var18.C.setChecked(true);
            yp5 yp5Var19 = this.binding;
            if (yp5Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var19 = null;
            }
            yp5Var19.H.setBackgroundColor(yy0.c(this, R.color.dodger_blue_new));
        } else {
            yp5 yp5Var20 = this.binding;
            if (yp5Var20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var20 = null;
            }
            yp5Var20.x.setVisibility(8);
            yp5 yp5Var21 = this.binding;
            if (yp5Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var21 = null;
            }
            yp5Var21.w.setChecked(false);
            yp5 yp5Var22 = this.binding;
            if (yp5Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yp5Var22 = null;
            }
            yp5Var22.A.setBackgroundColor(yy0.c(this, R.color.geyser));
        }
        if (selectedChallan.getStateCd().length() > 0) {
            yp5 yp5Var23 = this.binding;
            if (yp5Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yp5Var = yp5Var23;
            }
            yp5Var.E.setText(StringsKt__StringsKt.trim((CharSequence) VContant.INSTANCE.l(selectedChallan.getStateCd()).toString()).toString());
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yp5 yp5VarC = yp5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yp5VarC, "inflate(...)");
        this.binding = yp5VarC;
        yp5 yp5Var = null;
        if (yp5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yp5VarC = null;
        }
        setContentView(yp5VarC.b());
        az1.a aVar = az1.a;
        yp5 yp5Var2 = this.binding;
        if (yp5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yp5Var = yp5Var2;
        }
        aVar.f(this, yp5Var);
        String stringExtra = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra);
        this.inputType = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.challanNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("DL_NO");
        Intrinsics.checkNotNull(stringExtra3);
        this.dlNo = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("CHALLAN_PLACE");
        Intrinsics.checkNotNull(stringExtra4);
        this.challanPlace = stringExtra4;
        this.selectedChallan = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra5 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra5);
            this.chassisNo = stringExtra5;
        }
        n1();
        t1(this.selectedChallan);
    }
}
