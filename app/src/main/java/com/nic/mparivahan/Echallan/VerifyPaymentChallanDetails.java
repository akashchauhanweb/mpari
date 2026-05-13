package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.EtransChallanPayment;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.nic.mparivahan.Echallan.Echallan.Networking.StagingEchallanService;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.Model.VerifyPaymentModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.g66;
import com.zepto.h66;
import com.zepto.i66;
import com.zepto.j;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.ne;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0003J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010 R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010 R\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010 ¨\u0006G"}, d2 = {"Lcom/nic/mparivahan/Echallan/VerifyPaymentChallanDetails;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "selectedChallan", "", "J1", "A1", "s1", "t1", "u1", "H1", "Landroid/content/Context;", "context", "", "message", "", "fromVerifyPayment", "w1", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "C", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "z1", "()Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "setSelectedChallan", "(Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;)V", "D", "I", "paymentStatusValue", "E", "Ljava/lang/String;", "selectedButton", "F", "inputType", "Lcom/zepto/ne;", "G", "Lcom/zepto/ne;", "binding", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "H", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "I1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/Echallan/Echallan/Networking/StagingEchallanService;", "K", "Lcom/nic/mparivahan/Echallan/Echallan/Networking/StagingEchallanService;", "stagingRetrofitService", "Lcom/zepto/i66;", "L", "Lcom/zepto/i66;", "stagingViewModal", "M", "dlNo", "N", "challanPlace", "O", "chassisNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VerifyPaymentChallanDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public SearchChallanResultModel selectedChallan;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int paymentStatusValue;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ne binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public StagingEchallanService stagingRetrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public i66 stagingViewModal;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String selectedButton = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String challanPlace = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String chassisNo = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(VerifyPaymentModel verifyPaymentModel) {
            ne neVar = null;
            try {
                ne neVar2 = VerifyPaymentChallanDetails.this.binding;
                if (neVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar2 = null;
                }
                ProgressBar progressBar = neVar2.G;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    ne neVar3 = VerifyPaymentChallanDetails.this.binding;
                    if (neVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        neVar3 = null;
                    }
                    neVar3.G.setVisibility(8);
                }
                if (!StringsKt__StringsJVMKt.equals(verifyPaymentModel != null ? verifyPaymentModel.getStatus() : null, "200", true)) {
                    if (kt6.d(verifyPaymentModel.getMessage())) {
                        Toast.makeText(VerifyPaymentChallanDetails.this, verifyPaymentModel.getMessage(), 0).show();
                    }
                } else {
                    Intent intent = new Intent(VerifyPaymentChallanDetails.this, (Class<?>) VerifyPendingChallanWebView.class);
                    intent.putExtra("pgiUrl", verifyPaymentModel.getPgiUrl());
                    intent.putExtra("fromActivity", VContant.VERIFY_PAYMENT);
                    VerifyPaymentChallanDetails.this.startActivity(intent);
                    VerifyPaymentChallanDetails.this.finish();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ne neVar4 = VerifyPaymentChallanDetails.this.binding;
                if (neVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar4 = null;
                }
                ProgressBar progressBar2 = neVar4.G;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    ne neVar5 = VerifyPaymentChallanDetails.this.binding;
                    if (neVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        neVar = neVar5;
                    }
                    neVar.G.setVisibility(8);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VerifyPaymentModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ne neVar = VerifyPaymentChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = VerifyPaymentChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(PaymentEtransPgi paymentEtransPgi) {
            ne neVar = VerifyPaymentChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = VerifyPaymentChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
            if (paymentEtransPgi.getStatus() != 200 || !Intrinsics.areEqual(paymentEtransPgi.getType(), "eTransPgi")) {
                if (kt6.d(paymentEtransPgi.getMessage())) {
                    Toast.makeText(VerifyPaymentChallanDetails.this, paymentEtransPgi.getMessage(), 0).show();
                    return;
                } else {
                    Toast.makeText(VerifyPaymentChallanDetails.this, paymentEtransPgi.getReason(), 0).show();
                    return;
                }
            }
            Intent intent = new Intent(VerifyPaymentChallanDetails.this, (Class<?>) EtransChallanPayment.class);
            intent.putExtra("requestUrl", paymentEtransPgi.getVurl());
            intent.putExtra("requestData", paymentEtransPgi.getVenData());
            intent.putExtra("selectedData", VerifyPaymentChallanDetails.this.getSelectedChallan());
            intent.putExtra("type", VerifyPaymentChallanDetails.this.inputType);
            intent.putExtra("paymentType", "eTrans");
            intent.putExtra("fromActivity", VContant.VERIFY_PAYMENT);
            VerifyPaymentChallanDetails.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PaymentEtransPgi) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(ChallanPdfDataModal challanPdfDataModal) {
            ne neVar = VerifyPaymentChallanDetails.this.binding;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar2 = VerifyPaymentChallanDetails.this.binding;
                if (neVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar2 = null;
                }
                neVar2.G.setVisibility(8);
            }
            if (challanPdfDataModal.getStatus() == 200) {
                if (VerifyPaymentChallanDetails.this.selectedButton == "Challan") {
                    String strA = j.a.a(challanPdfDataModal.getResults().getPdf_url(), "E@CHALLAN*#2017$");
                    Intent intent = new Intent(VerifyPaymentChallanDetails.this, (Class<?>) PrintChallanWebView.class);
                    intent.putExtra("challanPdfUrl", strA);
                    intent.putExtra("challan_receipt_url", "");
                    SearchChallanResultModel selectedChallan = VerifyPaymentChallanDetails.this.getSelectedChallan();
                    intent.putExtra("challanNo", selectedChallan != null ? selectedChallan.getDocNo() : null);
                    intent.putExtra("fromActivity", "verifyPaymentChallanDetails");
                    VerifyPaymentChallanDetails.this.startActivity(intent);
                    return;
                }
                String receipt_url = challanPdfDataModal.getResults().getReceipt_url();
                if (kt6.d(receipt_url)) {
                    String strA2 = j.a.a(receipt_url, "E@CHALLAN*#2017$");
                    Intent intent2 = new Intent(VerifyPaymentChallanDetails.this, (Class<?>) PrintChallanWebView.class);
                    intent2.putExtra("challanPdfUrl", "");
                    intent2.putExtra("challan_receipt_url", strA2);
                    SearchChallanResultModel selectedChallan2 = VerifyPaymentChallanDetails.this.getSelectedChallan();
                    intent2.putExtra("challanNo", selectedChallan2 != null ? selectedChallan2.getDocNo() : null);
                    intent2.putExtra("fromActivity", "verifyPaymentChallanDetails");
                    VerifyPaymentChallanDetails.this.startActivity(intent2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanPdfDataModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ne neVar = VerifyPaymentChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = VerifyPaymentChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final void A1() {
        SearchChallanService searchChallanService = this.retrofitService;
        ne neVar = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        StagingEchallanService stagingEchallanService = this.stagingRetrofitService;
        if (stagingEchallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stagingRetrofitService");
            stagingEchallanService = null;
        }
        this.stagingViewModal = (i66) new z(this, new h66(new g66(stagingEchallanService))).a(i66.class);
        ne neVar2 = this.binding;
        if (neVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar2 = null;
        }
        neVar2.L.setText(y1().b("label_verify_payment_status", "Verify Payment Status"));
        ne neVar3 = this.binding;
        if (neVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar3 = null;
        }
        neVar3.M.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ro7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.B1(this.a, view);
            }
        });
        ne neVar4 = this.binding;
        if (neVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar4 = null;
        }
        neVar4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.so7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.C1(this.a, view);
            }
        });
        ne neVar5 = this.binding;
        if (neVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar5 = null;
        }
        neVar5.l.setVisibility(8);
        ne neVar6 = this.binding;
        if (neVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar6 = null;
        }
        neVar6.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.to7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.D1(this.a, view);
            }
        });
        ne neVar7 = this.binding;
        if (neVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar7 = null;
        }
        neVar7.k.setVisibility(8);
        ne neVar8 = this.binding;
        if (neVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar8 = null;
        }
        neVar8.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.E1(this.a, view);
            }
        });
        ne neVar9 = this.binding;
        if (neVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar9 = null;
        }
        neVar9.I.setVisibility(8);
        ne neVar10 = this.binding;
        if (neVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar10 = null;
        }
        neVar10.I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.F1(this.a, view);
            }
        });
        ne neVar11 = this.binding;
        if (neVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            neVar = neVar11;
        }
        neVar.M.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.G1(this.a, view);
            }
        });
    }

    public static final void B1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void C1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.paymentStatusValue;
        if (i == 0) {
            SearchChallanResultModel searchChallanResultModel = this$0.selectedChallan;
            if (searchChallanResultModel == null || searchChallanResultModel.getPaymentGateway() != 1) {
                this$0.w1(this$0, this$0.y1().b("label_challan_payment_verification", this$0.getString(R.string.payment_verification_in_progress)), 1);
                return;
            } else {
                this$0.u1();
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            SearchChallanResultModel searchChallanResultModel2 = this$0.selectedChallan;
            String statusTxt = searchChallanResultModel2 != null ? searchChallanResultModel2.getStatusTxt() : null;
            Intrinsics.checkNotNull(statusTxt);
            if (statusTxt.length() > 0) {
                SearchChallanResultModel searchChallanResultModel3 = this$0.selectedChallan;
                this$0.w1(this$0, searchChallanResultModel3 != null ? searchChallanResultModel3.getStatusTxt() : null, 0);
                return;
            }
            return;
        }
        SearchChallanResultModel searchChallanResultModel4 = this$0.selectedChallan;
        if (searchChallanResultModel4 != null && searchChallanResultModel4.getPaymentGateway() == 1) {
            this$0.t1();
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) ChallanPaymentWebView.class);
        intent.putExtra("selectedData", this$0.selectedChallan);
        intent.putExtra("type", this$0.inputType);
        intent.putExtra("fromActivity", VContant.VERIFY_PAYMENT);
        this$0.startActivity(intent);
    }

    public static final void D1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Challan";
        this$0.s1();
    }

    public static final void E1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Challan";
        this$0.s1();
    }

    public static final void F1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Receipt";
        this$0.s1();
    }

    public static final void G1(VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void J1(SearchChallanResultModel selectedChallan) {
        String ownerName;
        ne neVar = null;
        Boolean boolValueOf = (selectedChallan == null || (ownerName = selectedChallan.getOwnerName()) == null) ? null : Boolean.valueOf(ownerName.length() > 0);
        Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            ne neVar2 = this.binding;
            if (neVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar2 = null;
            }
            neVar2.w.setText(selectedChallan.getOwnerName());
        }
        if (selectedChallan.getDocNo().length() > 0) {
            ne neVar3 = this.binding;
            if (neVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar3 = null;
            }
            neVar3.s.setText(selectedChallan.getDocNo());
        }
        if (this.dlNo.length() > 7) {
            ne neVar4 = this.binding;
            if (neVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar4 = null;
            }
            neVar4.q.setText(this.dlNo);
        } else {
            ne neVar5 = this.binding;
            if (neVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar5 = null;
            }
            neVar5.o.setVisibility(8);
        }
        if (selectedChallan.getChallanNo().length() > 0) {
            ne neVar6 = this.binding;
            if (neVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar6 = null;
            }
            neVar6.n.setText(selectedChallan.getChallanNo());
        }
        if (selectedChallan.getDateTime().length() > 0) {
            ne neVar7 = this.binding;
            if (neVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar7 = null;
            }
            neVar7.f.setText(com.nic.mparivahan.Echallan.a.a.a(selectedChallan.getDateTime()));
        }
        if (this.challanPlace.length() > 0) {
            ne neVar8 = this.binding;
            if (neVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar8 = null;
            }
            neVar8.j.setText(this.challanPlace);
        }
        if (selectedChallan.getAmount().length() > 0) {
            ne neVar9 = this.binding;
            if (neVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar9 = null;
            }
            neVar9.c.setText(selectedChallan.getAmount());
        }
        String str = "";
        if (selectedChallan.getOffences().size() > 0) {
            int size = selectedChallan.getOffences().size();
            for (int i = 0; i < size; i++) {
                str = i == 0 ? (i + 1) + ". " + selectedChallan.getOffences().get(i).getOffenceName() : str + '\n' + (i + 1) + ". " + selectedChallan.getOffences().get(i).getOffenceName();
            }
        }
        ne neVar10 = this.binding;
        if (neVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar10 = null;
        }
        neVar10.t.y(yy0.c(this, R.color.back_color));
        ne neVar11 = this.binding;
        if (neVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar11 = null;
        }
        neVar11.t.z(0);
        ne neVar12 = this.binding;
        if (neVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar12 = null;
        }
        neVar12.t.A("Read More");
        ne neVar13 = this.binding;
        if (neVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar13 = null;
        }
        neVar13.t.A("Read Less");
        ne neVar14 = this.binding;
        if (neVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar14 = null;
        }
        neVar14.t.x(500);
        ne neVar15 = this.binding;
        if (neVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar15 = null;
        }
        neVar15.t.setText(str);
        if (selectedChallan.getChallanStatus().length() > 0) {
            ne neVar16 = this.binding;
            if (neVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar16 = null;
            }
            neVar16.E.setText(selectedChallan.getChallanStatus());
        }
        if (selectedChallan.getPaymentDate().length() > 0) {
            ne neVar17 = this.binding;
            if (neVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar17 = null;
            }
            neVar17.A.setVisibility(0);
            ne neVar18 = this.binding;
            if (neVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar18 = null;
            }
            neVar18.C.setText(com.nic.mparivahan.Echallan.a.a.a(selectedChallan.getPaymentDate()));
        } else {
            ne neVar19 = this.binding;
            if (neVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar19 = null;
            }
            neVar19.A.setVisibility(8);
        }
        this.paymentStatusValue = selectedChallan.getPaymentEligible();
        int paymentEligible = selectedChallan.getPaymentEligible();
        if (paymentEligible == 0) {
            ne neVar20 = this.binding;
            if (neVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar20 = null;
            }
            neVar20.y.setText(y1().b("label_challan_verify_payment", getString(R.string.verify_payment)));
            ne neVar21 = this.binding;
            if (neVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar21 = null;
            }
            neVar21.d.setVisibility(8);
            ne neVar22 = this.binding;
            if (neVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar22 = null;
            }
            neVar22.k.setVisibility(8);
            ne neVar23 = this.binding;
            if (neVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar23 = null;
            }
            neVar23.z.setChecked(false);
            ne neVar24 = this.binding;
            if (neVar24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar24 = null;
            }
            neVar24.H.setChecked(false);
            ne neVar25 = this.binding;
            if (neVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar25 = null;
            }
            neVar25.F.setBackgroundColor(yy0.c(this, R.color.geyser));
        } else if (paymentEligible == 1) {
            ne neVar26 = this.binding;
            if (neVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar26 = null;
            }
            neVar26.y.setText(y1().b("label_challan_pay_now", getString(R.string.pay_now)));
            ne neVar27 = this.binding;
            if (neVar27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar27 = null;
            }
            neVar27.d.setVisibility(8);
            ne neVar28 = this.binding;
            if (neVar28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar28 = null;
            }
            neVar28.k.setVisibility(8);
            ne neVar29 = this.binding;
            if (neVar29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar29 = null;
            }
            neVar29.z.setChecked(false);
            ne neVar30 = this.binding;
            if (neVar30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar30 = null;
            }
            neVar30.H.setChecked(false);
            ne neVar31 = this.binding;
            if (neVar31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar31 = null;
            }
            neVar31.F.setBackgroundColor(yy0.c(this, R.color.geyser));
        } else if (paymentEligible == 2) {
            ne neVar32 = this.binding;
            if (neVar32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar32 = null;
            }
            neVar32.y.setText(y1().b("label_challan_pay_status", getString(R.string.status)));
            ne neVar33 = this.binding;
            if (neVar33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar33 = null;
            }
            neVar33.d.setVisibility(8);
            ne neVar34 = this.binding;
            if (neVar34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar34 = null;
            }
            neVar34.k.setVisibility(8);
            ne neVar35 = this.binding;
            if (neVar35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar35 = null;
            }
            neVar35.z.setChecked(false);
            ne neVar36 = this.binding;
            if (neVar36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar36 = null;
            }
            neVar36.H.setChecked(false);
            ne neVar37 = this.binding;
            if (neVar37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar37 = null;
            }
            neVar37.F.setBackgroundColor(yy0.c(this, R.color.geyser));
        } else if (paymentEligible == 3) {
            ne neVar38 = this.binding;
            if (neVar38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar38 = null;
            }
            neVar38.y.setText(y1().b("label_challan_pay_paid", getString(R.string.paid)));
            ne neVar39 = this.binding;
            if (neVar39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar39 = null;
            }
            neVar39.d.setVisibility(8);
            ne neVar40 = this.binding;
            if (neVar40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar40 = null;
            }
            neVar40.k.setVisibility(8);
            ne neVar41 = this.binding;
            if (neVar41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar41 = null;
            }
            neVar41.H.setChecked(true);
            ne neVar42 = this.binding;
            if (neVar42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar42 = null;
            }
            neVar42.z.setChecked(true);
            ne neVar43 = this.binding;
            if (neVar43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar43 = null;
            }
            neVar43.F.setBackgroundColor(yy0.c(this, R.color.dodger_blue_new));
        }
        if (selectedChallan.getPdfUrl().length() > 0) {
            ne neVar44 = this.binding;
            if (neVar44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar44 = null;
            }
            neVar44.l.setVisibility(8);
        } else {
            ne neVar45 = this.binding;
            if (neVar45 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar45 = null;
            }
            neVar45.l.setVisibility(8);
        }
        if (selectedChallan.getStateCd().length() > 0) {
            ne neVar46 = this.binding;
            if (neVar46 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar46;
            }
            neVar.K.setText(StringsKt__StringsKt.trim((CharSequence) VContant.INSTANCE.l(selectedChallan.getStateCd()).toString()).toString());
        }
    }

    private final void s1() {
        fz1 fz1Var;
        ne neVar = null;
        try {
            ne neVar2 = this.binding;
            if (neVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar2 = null;
            }
            neVar2.G.setVisibility(0);
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
        } catch (Exception e2) {
            e2.printStackTrace();
            ne neVar3 = this.binding;
            if (neVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar3;
            }
            neVar.G.setVisibility(8);
        }
    }

    private final void t1() {
        ne neVar = null;
        try {
            ws6 ws6Var = new ws6(this);
            ne neVar2 = this.binding;
            if (neVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar2 = null;
            }
            neVar2.G.setVisibility(0);
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            SearchChallanResultModel searchChallanResultModel = this.selectedChallan;
            String challanNo = searchChallanResultModel != null ? searchChallanResultModel.getChallanNo() : null;
            Intrinsics.checkNotNull(challanNo);
            fz1Var.t(this, challanNo, ws6Var.l());
        } catch (Exception e2) {
            e2.printStackTrace();
            ne neVar3 = this.binding;
            if (neVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar3;
            }
            neVar.G.setVisibility(8);
        }
    }

    private final void u1() {
        fz1 fz1Var;
        ne neVar = null;
        try {
            ne neVar2 = this.binding;
            if (neVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar2 = null;
            }
            neVar2.G.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            SearchChallanResultModel searchChallanResultModel = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel);
            String challanNo = searchChallanResultModel.getChallanNo();
            SearchChallanResultModel searchChallanResultModel2 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel2);
            String docNo = searchChallanResultModel2.getDocNo();
            SearchChallanResultModel searchChallanResultModel3 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel3);
            String amount = searchChallanResultModel3.getAmount();
            SearchChallanResultModel searchChallanResultModel4 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel4);
            String challanStatus = searchChallanResultModel4.getChallanStatus();
            SearchChallanResultModel searchChallanResultModel5 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel5);
            fz1Var.F(this, challanNo, docNo, amount, challanStatus, searchChallanResultModel5.getStateCd());
        } catch (Exception e2) {
            e2.printStackTrace();
            ne neVar3 = this.binding;
            if (neVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar3;
            }
            neVar.G.setVisibility(8);
        }
    }

    private final void v1() {
        fz1 fz1Var;
        ne neVar = null;
        try {
            ne neVar2 = this.binding;
            if (neVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar2 = null;
            }
            neVar2.G.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            SearchChallanResultModel searchChallanResultModel = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel);
            String challanNo = searchChallanResultModel.getChallanNo();
            SearchChallanResultModel searchChallanResultModel2 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel2);
            String stateCd = searchChallanResultModel2.getStateCd();
            SearchChallanResultModel searchChallanResultModel3 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel3);
            String docNo = searchChallanResultModel3.getDocNo();
            SearchChallanResultModel searchChallanResultModel4 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel4);
            String amount = searchChallanResultModel4.getAmount();
            SearchChallanResultModel searchChallanResultModel5 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel5);
            fz1Var.G(this, challanNo, stateCd, docNo, amount, searchChallanResultModel5.getChallanStatus());
        } catch (Exception e2) {
            e2.printStackTrace();
            ne neVar3 = this.binding;
            if (neVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar3;
            }
            neVar.G.setVisibility(8);
        }
    }

    private final void w1(Context context, String message, final int fromVerifyPayment) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.process);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.btnHolderLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        View viewFindViewById6 = dialog.findViewById(R.id.titleTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(message);
        textView.setText(y1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanDetails.x1(dialog, fromVerifyPayment, this, view);
            }
        });
        dialog.show();
    }

    public static final void x1(Dialog d2, int i, VerifyPaymentChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (i == 1) {
            this$0.v1();
        }
    }

    public final void I1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ne neVarC = ne.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(neVarC, "inflate(...)");
        this.binding = neVarC;
        fz1 fz1Var = null;
        if (neVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVarC = null;
        }
        setContentView(neVarC.b());
        I1(new wa3(this));
        az1.a aVar = az1.a;
        ne neVar = this.binding;
        if (neVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar = null;
        }
        aVar.l(this, neVar);
        this.selectedChallan = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra);
        this.inputType = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("DL_NO");
        Intrinsics.checkNotNull(stringExtra2);
        this.dlNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("CHALLAN_PLACE");
        Intrinsics.checkNotNull(stringExtra3);
        this.challanPlace = stringExtra3;
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra4 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra4);
            this.chassisNo = stringExtra4;
        }
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        this.stagingRetrofitService = StagingEchallanService.INSTANCE.a(this);
        A1();
        J1(this.selectedChallan);
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.p().g(this, new f(new a()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var3 = null;
        }
        fz1Var3.o().g(this, new f(new b()));
        fz1 fz1Var4 = this.viewModel;
        if (fz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var4 = null;
        }
        fz1Var4.u().g(this, new f(new c()));
        fz1 fz1Var5 = this.viewModel;
        if (fz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var5 = null;
        }
        fz1Var5.m().g(this, new f(new d()));
        fz1 fz1Var6 = this.viewModel;
        if (fz1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var6;
        }
        fz1Var.r().g(this, new f(new e()));
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final SearchChallanResultModel getSelectedChallan() {
        return this.selectedChallan;
    }
}
