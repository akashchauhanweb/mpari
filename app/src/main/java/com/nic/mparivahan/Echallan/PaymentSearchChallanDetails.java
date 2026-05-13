package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.EtransChallanPayment;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.nic.mparivahan.Echallan.Echallan.Networking.StagingEchallanService;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.Model.VerifyPaymentModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.PaymentSearchChallanDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.g66;
import com.zepto.h66;
import com.zepto.i66;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.mt6;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010(R\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010(R\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010(R\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010(R\u0016\u0010R\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010(R\u0016\u0010T\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010(R\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010(¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/Echallan/PaymentSearchChallanDetails;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "selectedChallan", "", "c2", "O1", "F1", "G1", "H1", "Landroid/content/Context;", "context", "", "message", "", "fromVerifyPayment", "J1", "I1", "V1", "W1", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "mobile_no", "d2", "C", "Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "M1", "()Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "setSelectedChallan", "(Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;)V", "D", "I", "paymentStatusValue", "Lcom/zepto/ne;", "E", "Lcom/zepto/ne;", "binding", "F", "Ljava/lang/String;", "inputType", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "G", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "H", "Lcom/zepto/fz1;", "viewModel", "Lcom/nic/mparivahan/Echallan/Echallan/Networking/StagingEchallanService;", "Lcom/nic/mparivahan/Echallan/Echallan/Networking/StagingEchallanService;", "stagingRetrofitService", "Lcom/zepto/i66;", "J", "Lcom/zepto/i66;", "stagingViewModal", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/ws6;", "L", "Lcom/zepto/ws6;", "N1", "()Lcom/zepto/ws6;", "b2", "(Lcom/zepto/ws6;)V", "sessionManager", "M", "selectedButton", "N", "challanNo", "O", "dlNo", "P", "challanPlace", "Q", "chassisNo", "R", "recordId", "S", "mobileNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PaymentSearchChallanDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public SearchChallanResultModel selectedChallan;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int paymentStatusValue;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ne binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public StagingEchallanService stagingRetrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public i66 stagingViewModal;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String selectedButton = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String challanPlace = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String recordId = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String mobileNo = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(VerifyPaymentModel verifyPaymentModel) {
            ne neVar = null;
            try {
                ne neVar2 = PaymentSearchChallanDetails.this.binding;
                if (neVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar2 = null;
                }
                ProgressBar progressBar = neVar2.G;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    ne neVar3 = PaymentSearchChallanDetails.this.binding;
                    if (neVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        neVar3 = null;
                    }
                    neVar3.G.setVisibility(8);
                }
                if (!StringsKt__StringsJVMKt.equals(verifyPaymentModel != null ? verifyPaymentModel.getStatus() : null, "200", true)) {
                    if (StringsKt__StringsJVMKt.equals(verifyPaymentModel != null ? verifyPaymentModel.getStatus() : null, "204", true)) {
                        PaymentSearchChallanDetails paymentSearchChallanDetails = PaymentSearchChallanDetails.this;
                        paymentSearchChallanDetails.W1(paymentSearchChallanDetails, verifyPaymentModel != null ? verifyPaymentModel.getMessage() : null);
                        return;
                    }
                    return;
                }
                Intent intent = new Intent(PaymentSearchChallanDetails.this, (Class<?>) VerifyPendingChallanWebView.class);
                intent.putExtra("pgiUrl", verifyPaymentModel.getPgiUrl());
                intent.putExtra("fromActivity", "challanDetails");
                PaymentSearchChallanDetails.this.startActivity(intent);
                PaymentSearchChallanDetails.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                ne neVar4 = PaymentSearchChallanDetails.this.binding;
                if (neVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar4 = null;
                }
                ProgressBar progressBar2 = neVar4.G;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    ne neVar5 = PaymentSearchChallanDetails.this.binding;
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
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
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
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
            if (paymentEtransPgi.getStatus() != 200 || !Intrinsics.areEqual(paymentEtransPgi.getType(), "eTransPgi")) {
                Toast.makeText(PaymentSearchChallanDetails.this, paymentEtransPgi.getReason(), 0).show();
                return;
            }
            Intent intent = new Intent(PaymentSearchChallanDetails.this, (Class<?>) EtransChallanPayment.class);
            intent.putExtra("requestUrl", paymentEtransPgi.getVurl());
            intent.putExtra("requestData", paymentEtransPgi.getVenData());
            intent.putExtra("selectedData", PaymentSearchChallanDetails.this.getSelectedChallan());
            intent.putExtra("type", PaymentSearchChallanDetails.this.inputType);
            intent.putExtra("paymentType", "eTrans");
            intent.putExtra("fromActivity", "challanDetails");
            PaymentSearchChallanDetails.this.startActivity(intent);
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
            ne neVar = PaymentSearchChallanDetails.this.binding;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar2 = PaymentSearchChallanDetails.this.binding;
                if (neVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    neVar2 = null;
                }
                neVar2.G.setVisibility(8);
            }
            if (challanPdfDataModal.getStatus() == 200) {
                if (PaymentSearchChallanDetails.this.selectedButton == "Challan") {
                    String strA = com.zepto.j.a.a(challanPdfDataModal.getResults().getPdf_url(), "E@CHALLAN*#2017$");
                    Intent intent = new Intent(PaymentSearchChallanDetails.this, (Class<?>) PrintChallanWebView.class);
                    intent.putExtra("challanPdfUrl", strA);
                    intent.putExtra("challan_receipt_url", "");
                    SearchChallanResultModel selectedChallan = PaymentSearchChallanDetails.this.getSelectedChallan();
                    intent.putExtra("challanNo", selectedChallan != null ? selectedChallan.getDocNo() : null);
                    intent.putExtra("fromActivity", "paymentSearchChallanDetails");
                    PaymentSearchChallanDetails.this.startActivity(intent);
                    return;
                }
                String receipt_url = challanPdfDataModal.getResults().getReceipt_url();
                if (!kt6.d(receipt_url)) {
                    Toast.makeText(PaymentSearchChallanDetails.this, "Payment is pending so can't download receipt", 0).show();
                    return;
                }
                String strA2 = com.zepto.j.a.a(receipt_url, "E@CHALLAN*#2017$");
                Intent intent2 = new Intent(PaymentSearchChallanDetails.this, (Class<?>) PrintChallanWebView.class);
                intent2.putExtra("challanPdfUrl", "");
                intent2.putExtra("challan_receipt_url", strA2);
                SearchChallanResultModel selectedChallan2 = PaymentSearchChallanDetails.this.getSelectedChallan();
                intent2.putExtra("challanNo", selectedChallan2 != null ? selectedChallan2.getDocNo() : null);
                intent2.putExtra("fromActivity", "paymentSearchChallanDetails");
                PaymentSearchChallanDetails.this.startActivity(intent2);
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
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SendOtpResult sendOtpResult) {
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    PaymentSearchChallanDetails.this.recordId = String.valueOf(sendOtpResult.getRecordId());
                    PaymentSearchChallanDetails paymentSearchChallanDetails = PaymentSearchChallanDetails.this;
                    paymentSearchChallanDetails.d2(paymentSearchChallanDetails, paymentSearchChallanDetails.mobileNo);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(PaymentSearchChallanDetails.this, sendOtpResult.getStatusDesc());
                } else {
                    PaymentSearchChallanDetails.this.Y1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                PaymentSearchChallanDetails paymentSearchChallanDetails2 = PaymentSearchChallanDetails.this;
                String strB = paymentSearchChallanDetails2.L1().b("label_went_wrong", PaymentSearchChallanDetails.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                paymentSearchChallanDetails2.Y1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    PaymentSearchChallanDetails.this.Y1(otpVerifyResult.getStatusDesc());
                    return;
                }
                SearchChallanResultModel selectedChallan = PaymentSearchChallanDetails.this.getSelectedChallan();
                if (selectedChallan != null && selectedChallan.getPaymentGateway() == 1) {
                    PaymentSearchChallanDetails.this.G1();
                    return;
                }
                Intent intent = new Intent(PaymentSearchChallanDetails.this, (Class<?>) ChallanPaymentWebView.class);
                intent.putExtra("selectedData", PaymentSearchChallanDetails.this.getSelectedChallan());
                intent.putExtra("type", PaymentSearchChallanDetails.this.inputType);
                intent.putExtra("fromActivity", "challanPayment");
                intent.putExtra("paymentType", "pgi");
                PaymentSearchChallanDetails.this.startActivity(intent);
            } catch (Exception unused) {
                PaymentSearchChallanDetails paymentSearchChallanDetails = PaymentSearchChallanDetails.this;
                String strB = paymentSearchChallanDetails.L1().b("label_went_wrong", PaymentSearchChallanDetails.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                paymentSearchChallanDetails.Y1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ne neVar = PaymentSearchChallanDetails.this.binding;
            ne neVar2 = null;
            if (neVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar = null;
            }
            ProgressBar progressBar = neVar.G;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                ne neVar3 = PaymentSearchChallanDetails.this.binding;
                if (neVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    neVar2 = neVar3;
                }
                neVar2.G.setVisibility(8);
            }
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ PaymentSearchChallanDetails b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, PaymentSearchChallanDetails paymentSearchChallanDetails, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = paymentSearchChallanDetails;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Log.e("calling", "321");
            this.a.setText(this.b.L1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class k extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ PaymentSearchChallanDetails b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextView textView, PaymentSearchChallanDetails paymentSearchChallanDetails, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = paymentSearchChallanDetails;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.L1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void I1() {
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

    private final void J1(Context context, String message, final int fromVerifyPayment) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.process);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.btnHolderLl);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById6 = dialog.findViewById(R.id.titleTv);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(L1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById3).setText(message);
        textView.setText(L1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.on4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.K1(dialog, fromVerifyPayment, this, view);
            }
        });
        dialog.show();
    }

    public static final void K1(Dialog d2, int i2, PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (i2 == 1) {
            this$0.I1();
        }
    }

    private final void O1() {
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
        neVar2.M.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.P1(this.a, view);
            }
        });
        ne neVar3 = this.binding;
        if (neVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar3 = null;
        }
        neVar3.M.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.Q1(this.a, view);
            }
        });
        ne neVar4 = this.binding;
        if (neVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar4 = null;
        }
        neVar4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.R1(this.a, view);
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
        neVar6.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.S1(this.a, view);
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
        neVar8.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.T1(this.a, view);
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
        } else {
            neVar = neVar10;
        }
        neVar.I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.un4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.U1(this.a, view);
            }
        });
    }

    public static final void P1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V1();
    }

    public static final void Q1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void R1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = this$0.paymentStatusValue;
        if (i2 == 0) {
            SearchChallanResultModel searchChallanResultModel = this$0.selectedChallan;
            if (searchChallanResultModel == null || searchChallanResultModel.getPaymentGateway() != 1) {
                this$0.J1(this$0, this$0.L1().b("label_challan_payment_verification", this$0.getString(R.string.payment_verification_in_progress)), 1);
                return;
            } else {
                this$0.H1();
                return;
            }
        }
        fz1 fz1Var = null;
        fz1 fz1Var2 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            SearchChallanResultModel searchChallanResultModel2 = this$0.selectedChallan;
            if (searchChallanResultModel2 != null && searchChallanResultModel2.getVcourt_eligible() == 1) {
                Intent intent = new Intent(this$0, (Class<?>) EchallanVirtualCourtActivity.class);
                SearchChallanResultModel searchChallanResultModel3 = this$0.selectedChallan;
                intent.putExtra("challanNo", searchChallanResultModel3 != null ? searchChallanResultModel3.getChallanNo() : null);
                this$0.startActivity(intent);
                return;
            }
            SearchChallanResultModel searchChallanResultModel4 = this$0.selectedChallan;
            String statusTxt = searchChallanResultModel4 != null ? searchChallanResultModel4.getStatusTxt() : null;
            Intrinsics.checkNotNull(statusTxt);
            if (statusTxt.length() > 0) {
                SearchChallanResultModel searchChallanResultModel5 = this$0.selectedChallan;
                this$0.J1(this$0, searchChallanResultModel5 != null ? searchChallanResultModel5.getStatusTxt() : null, 0);
                return;
            }
            return;
        }
        SearchChallanResultModel searchChallanResultModel6 = this$0.selectedChallan;
        if (searchChallanResultModel6 != null && searchChallanResultModel6.getPaymentGateway() == 1) {
            SearchChallanResultModel searchChallanResultModel7 = this$0.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel7);
            String strSubstring = StringsKt__StringsKt.trim((CharSequence) searchChallanResultModel7.getDocNo()).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!StringsKt__StringsJVMKt.equals(strSubstring, "AP", true)) {
                this$0.G1();
                return;
            }
            this$0.mobileNo = this$0.N1().l();
            fz1 fz1Var3 = this$0.viewModel;
            if (fz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                fz1Var2 = fz1Var3;
            }
            fz1Var2.A(this$0, this$0.mobileNo, this$0.N1().k());
            return;
        }
        SearchChallanResultModel searchChallanResultModel8 = this$0.selectedChallan;
        Intrinsics.checkNotNull(searchChallanResultModel8);
        String strSubstring2 = StringsKt__StringsKt.trim((CharSequence) searchChallanResultModel8.getDocNo()).toString().substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        if (StringsKt__StringsJVMKt.equals(strSubstring2, "AP", true)) {
            this$0.mobileNo = this$0.N1().l();
            fz1 fz1Var4 = this$0.viewModel;
            if (fz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                fz1Var = fz1Var4;
            }
            fz1Var.A(this$0, this$0.mobileNo, this$0.N1().k());
            return;
        }
        Intent intent2 = new Intent(this$0, (Class<?>) ChallanPaymentWebView.class);
        intent2.putExtra("selectedData", this$0.selectedChallan);
        intent2.putExtra("type", this$0.inputType);
        intent2.putExtra("fromActivity", "challanPayment");
        intent2.putExtra("paymentType", "pgi");
        this$0.startActivity(intent2);
    }

    public static final void S1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Challan";
        this$0.F1();
    }

    public static final void T1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Challan";
        this$0.F1();
    }

    public static final void U1(PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedButton = "Receipt";
        this$0.F1();
    }

    private final void V1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(Context context, String message) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        textView.setText(L1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.titleTv);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.X1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void X1(Dialog d2, PaymentSearchChallanDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) PaymentSearchChallan.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void e2(PaymentSearchChallanDetails this$0, EditText enterOtp, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.L1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.L1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        d2.dismiss();
        ne neVar = this$0.binding;
        fz1 fz1Var = null;
        if (neVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar = null;
        }
        neVar.G.setVisibility(0);
        fz1 fz1Var2 = this$0.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var2;
        }
        fz1Var.D(this$0, enterOtp.getText().toString(), this$0.recordId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void h2(Dialog d2, Context context, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        d2.dismiss();
        context.startActivity(new Intent(context, (Class<?>) VahanUpdateMobiActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void j2(PaymentSearchChallanDetails this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        fz1 fz1Var = this$0.viewModel;
        if (fz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var = null;
        }
        fz1Var.y(this$0, this$0.recordId);
        new k(time_text, this$0, resendOtp).start();
    }

    public final void F1() {
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
            Intrinsics.checkNotNull(searchChallanResultModel2);
            String stateCd = searchChallanResultModel2.getStateCd();
            SearchChallanResultModel searchChallanResultModel3 = this.selectedChallan;
            Intrinsics.checkNotNull(searchChallanResultModel3);
            fz1Var.n(this, challanNo, "", "", stateCd, searchChallanResultModel3.getDocNo(), "62", this.chassisNo);
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

    public final void G1() {
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

    public final void H1() {
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

    public final wa3 L1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final SearchChallanResultModel getSelectedChallan() {
        return this.selectedChallan;
    }

    public final ws6 N1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void b2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void c2(SearchChallanResultModel selectedChallan) {
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
        String str = "";
        if (selectedChallan.getOffences().size() > 0) {
            int size = selectedChallan.getOffences().size();
            for (int i2 = 0; i2 < size; i2++) {
                str = i2 == 0 ? (i2 + 1) + ". " + selectedChallan.getOffences().get(i2).getOffenceName() : str + '\n' + (i2 + 1) + ". " + selectedChallan.getOffences().get(i2).getOffenceName();
            }
        }
        ne neVar9 = this.binding;
        if (neVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar9 = null;
        }
        neVar9.t.y(yy0.c(this, R.color.back_color));
        ne neVar10 = this.binding;
        if (neVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar10 = null;
        }
        neVar10.t.z(0);
        ne neVar11 = this.binding;
        if (neVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar11 = null;
        }
        neVar11.t.A("Read More");
        ne neVar12 = this.binding;
        if (neVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar12 = null;
        }
        neVar12.t.A("Read Less");
        ne neVar13 = this.binding;
        if (neVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar13 = null;
        }
        neVar13.t.x(500);
        ne neVar14 = this.binding;
        if (neVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar14 = null;
        }
        neVar14.t.setText(str);
        if (selectedChallan.getAmount().length() > 0) {
            ne neVar15 = this.binding;
            if (neVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                neVar15 = null;
            }
            neVar15.c.setText(selectedChallan.getAmount());
        }
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
            neVar20.y.setText(L1().b("label_challan_verify_payment", getString(R.string.verify_payment)));
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
            neVar26.y.setText(L1().b("label_challan_pay_now", getString(R.string.pay_now)));
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
            neVar32.y.setText(L1().b("label_challan_pay_status", getString(R.string.status)));
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
            neVar38.y.setText(L1().b("label_challan_pay_paid", getString(R.string.paid)));
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
        if (selectedChallan.getStateCd().length() > 0) {
            ne neVar44 = this.binding;
            if (neVar44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                neVar = neVar44;
            }
            neVar.K.setText(StringsKt__StringsKt.trim((CharSequence) VContant.INSTANCE.l(selectedChallan.getStateCd()).toString()).toString());
        }
    }

    public final void d2(final Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp_echallan);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.update_mob);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.note_text);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) viewFindViewById10;
        textView7.setVisibility(8);
        textView6.setVisibility(8);
        View viewFindViewById11 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById12 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
        textView6.setText(L1().b("update_Mobile_No", context.getString(R.string.update2)));
        textView7.setText(L1().b("mobile_number_is_added", context.getString(R.string.mobile_correct_added)));
        ((TextView) viewFindViewById11).setText(L1().b("otp_verification", getString(R.string.otp_verification)));
        textView2.setText(L1().b("vahan_btn_submit", getString(R.string.submit)));
        textView4.setText(L1().b("btn_reset", getString(R.string.reset)));
        textView.setText(L1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(L1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById12).setText(L1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(L1().b("label_echallan_otp_msg", getString(R.string.echallan_otp_msg)));
                sb.append(" +91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView5.setText(sb.toString());
            } else {
                textView5.setText(L1().b("label_echallan_otp_msg", getString(R.string.echallan_otp_msg)));
            }
        } catch (Exception unused) {
            textView5.setText(L1().b("label_echallan_otp_msg", getString(R.string.echallan_otp_msg)));
        }
        new j(textView3, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.i2(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.j2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.e2(this.a, editText, dialog, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ln4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.f2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.g2(dialog, view);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanDetails.h2(dialog, context, view);
            }
        });
        dialog.show();
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
        a2(new wa3(this));
        az1.a aVar = az1.a;
        ne neVar = this.binding;
        if (neVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            neVar = null;
        }
        aVar.a(this, neVar);
        b2(new ws6(this));
        String stringExtra = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra);
        this.challanNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("DL_NO");
        Intrinsics.checkNotNull(stringExtra2);
        this.dlNo = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("CHALLAN_PLACE");
        Intrinsics.checkNotNull(stringExtra3);
        this.challanPlace = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra4);
        this.inputType = stringExtra4;
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra5 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra5);
            this.chassisNo = stringExtra5;
        }
        this.selectedChallan = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        this.stagingRetrofitService = StagingEchallanService.INSTANCE.a(this);
        O1();
        c2(this.selectedChallan);
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.p().g(this, new i(new a()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var3 = null;
        }
        fz1Var3.o().g(this, new i(new b()));
        fz1 fz1Var4 = this.viewModel;
        if (fz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var4 = null;
        }
        fz1Var4.u().g(this, new i(new c()));
        fz1 fz1Var5 = this.viewModel;
        if (fz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var5 = null;
        }
        fz1Var5.m().g(this, new i(new d()));
        fz1 fz1Var6 = this.viewModel;
        if (fz1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var6 = null;
        }
        fz1Var6.r().g(this, new i(new e()));
        fz1 fz1Var7 = this.viewModel;
        if (fz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var7 = null;
        }
        fz1Var7.v().g(this, new i(new f()));
        fz1 fz1Var8 = this.viewModel;
        if (fz1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var8 = null;
        }
        fz1Var8.z().g(this, new i(new g()));
        fz1 fz1Var9 = this.viewModel;
        if (fz1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var9;
        }
        fz1Var.s().g(this, new i(new h()));
    }
}
