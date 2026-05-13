package com.nic.mparivahan.VahanServices.VahanMultiService.Payment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.VahanlogCapture;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanPaymentMultiServiceStatusScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.eSign.ModelEsign.esignModel;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;
import com.zepto.dl4;
import com.zepto.gd1;
import com.zepto.ih;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\"\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00102R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00102R\"\u0010D\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u00102R\u0016\u0010k\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u00102R\"\u0010r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010~\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010C\u001a\u0004\b|\u0010E\"\u0004\b}\u0010GR%\u0010\u0082\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u00102\u001a\u0005\b\u0080\u0001\u00104\"\u0005\b\u0081\u0001\u00106R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u00102\u001a\u0005\b\u008c\u0001\u00104\"\u0005\b\u008d\u0001\u00106R&\u0010\u0092\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u00102\u001a\u0005\b\u0090\u0001\u00104\"\u0005\b\u0091\u0001\u00106R&\u0010\u0094\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010C\u001a\u0005\b\u0094\u0001\u0010E\"\u0005\b\u0095\u0001\u0010GR:\u0010\u009d\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00020\u0096\u0001j\t\u0012\u0004\u0012\u00020\u0002`\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bC\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R&\u0010¡\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010C\u001a\u0005\b\u009f\u0001\u0010E\"\u0005\b \u0001\u0010GR?\u0010¥\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0096\u0001j\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0098\u0001\u001a\u0006\b£\u0001\u0010\u009a\u0001\"\u0006\b¤\u0001\u0010\u009c\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Payment/VahanPaymentMultiServiceStatusScreen;", "Lcom/zepto/pq;", "", "it", "", "V1", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "b2", "U1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "message", "x1", "r2", "Y1", "", "", "serviceSelPurList", "PurList", "", "w1", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "L1", "()Lcom/zepto/ld7;", "p2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "K1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "n2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "F1", "()Landroid/app/ProgressDialog;", "i2", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Ljava/lang/String;", "C1", "()Ljava/lang/String;", "d2", "(Ljava/lang/String;)V", "enc_string", "Lcom/zepto/ih;", "G", "Lcom/zepto/ih;", "binding", "H", "stateCd", "I", "offCd", "J", "receiptNo", "K", "Z", "isDocUpload", "()Z", "c2", "(Z)V", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "D1", "()Lcom/zepto/wa3;", "g2", "(Lcom/zepto/wa3;)V", "languageSession", "Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "getStateCost", "()Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "o2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;)V", "stateCost", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "q2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "h2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "P", "rcNo", "Q", "purCd", "R", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "k2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;)V", "payment_response", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "S", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "j2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;)V", "paymentRequest", "T", "N1", "e2", "isFaceless", "U", "I1", "l2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "m2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "W", "B1", "a2", "aadhar_name", "X", "A1", "Z1", "aadhar_address", "Y", "isCheckPaymentPending", "setCheckPaymentPending", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getPurArray", "()Ljava/util/ArrayList;", "setPurArray", "(Ljava/util/ArrayList;)V", "purArray", "a0", "getIsslot", "f2", "isslot", "b0", "getMultiServiceList", "setMultiServiceList", "multiServiceList", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPaymentMultiServiceStatusScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String enc_string;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ih binding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean isDocUpload;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public StateCostForDms stateCost;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public AfterPaymentResponse payment_response;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiServiceBeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean isCheckPaymentPending;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String purCd = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ArrayList purArray = new ArrayList();

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public boolean isslot = true;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(esignModel esignmodel) {
            VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
            if (gd1.a.m(esignmodel.getData())) {
                return;
            }
            Intent intent = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) eSignDMS.class);
            intent.putExtra("state_code", VahanPaymentMultiServiceStatusScreen.this.H1().getState_cd());
            ih ihVar = VahanPaymentMultiServiceStatusScreen.this.binding;
            if (ihVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar = null;
            }
            intent.putExtra(VContant.APP_NO, ihVar.e.getText().toString());
            intent.putExtra("rc_number", VahanPaymentMultiServiceStatusScreen.this.H1().getRegn_no());
            intent.putExtra(VContant.PURPOSE_CODE, VahanPaymentMultiServiceStatusScreen.this.H1().getPur_cd());
            intent.putExtra("off_code", VahanPaymentMultiServiceStatusScreen.this.H1().getOff_cd());
            intent.putExtra(VContant.FINAL_SUBMIT, VahanPaymentMultiServiceStatusScreen.this.G1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanPaymentMultiServiceStatusScreen.this.getIsFaceless());
            intent.putExtra("RC", VahanPaymentMultiServiceStatusScreen.this.I1());
            intent.putExtra("RcDetails", VahanPaymentMultiServiceStatusScreen.this.J1());
            intent.putExtra("vahlogReptDate", VahanPaymentMultiServiceStatusScreen.this.H1().getRcpt_dt());
            intent.putExtra("vahlogFeeAmt", VahanPaymentMultiServiceStatusScreen.this.H1().getRcpt_amt());
            intent.putExtra("vahlogReptNo", VahanPaymentMultiServiceStatusScreen.this.H1().getRcpt_NO());
            intent.putExtra("URL", StringsKt__StringsKt.trim((CharSequence) esignmodel.getData()).toString());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanPaymentMultiServiceStatusScreen.this.B1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanPaymentMultiServiceStatusScreen.this.A1());
            VahanPaymentMultiServiceStatusScreen.this.startActivity(intent);
            VahanPaymentMultiServiceStatusScreen.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((esignModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                    VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                }
                Intent intent = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanPaymentMultiServiceStatusScreen.this.H1().getPur_cd());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putExtra("RC", VahanPaymentMultiServiceStatusScreen.this.I1());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RcDetails", VahanPaymentMultiServiceStatusScreen.this.J1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, VahanPaymentMultiServiceStatusScreen.this.getIsFaceless());
                intent.putExtra(VContant.NEXGEN_addahar_name, VahanPaymentMultiServiceStatusScreen.this.B1());
                intent.putExtra(VContant.NEXGEN_addahar_address, VahanPaymentMultiServiceStatusScreen.this.A1());
                VahanPaymentMultiServiceStatusScreen.this.startActivity(intent);
                VahanPaymentMultiServiceStatusScreen.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                    VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotUserDataModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                    VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanPaymentMultiServiceStatusScreen.this.V1(str);
                } else {
                    VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen = VahanPaymentMultiServiceStatusScreen.this;
                    Toast.makeText(vahanPaymentMultiServiceStatusScreen, vahanPaymentMultiServiceStatusScreen.getString(R.string.no_internet), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            try {
                if (finalRequestSubmitResponse == null) {
                    if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                        VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                    }
                    Intent intent = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) DashBoard.class);
                    intent.addFlags(67108864);
                    VahanPaymentMultiServiceStatusScreen.this.startActivity(intent);
                    VahanPaymentMultiServiceStatusScreen.this.finish();
                    return;
                }
                if (!finalRequestSubmitResponse.getApplication_status()) {
                    if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                        VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                    }
                    Intent intent2 = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) DashBoard.class);
                    intent2.addFlags(67108864);
                    VahanPaymentMultiServiceStatusScreen.this.startActivity(intent2);
                    VahanPaymentMultiServiceStatusScreen.this.finish();
                    return;
                }
                ih ihVar = VahanPaymentMultiServiceStatusScreen.this.binding;
                ih ihVar2 = null;
                if (ihVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar = null;
                }
                if (ihVar.i.getText().equals("Home")) {
                    Intent intent3 = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) DashBoard.class);
                    intent3.addFlags(67108864);
                    VahanPaymentMultiServiceStatusScreen.this.startActivity(intent3);
                    VahanPaymentMultiServiceStatusScreen.this.finish();
                    return;
                }
                ld7 ld7VarL1 = VahanPaymentMultiServiceStatusScreen.this.L1();
                VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen = VahanPaymentMultiServiceStatusScreen.this;
                ih ihVar3 = vahanPaymentMultiServiceStatusScreen.binding;
                if (ihVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ihVar2 = ihVar3;
                }
                ld7VarL1.m(vahanPaymentMultiServiceStatusScreen, ihVar2.e.getText().toString());
            } catch (Exception unused) {
                if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                    VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                }
                Intent intent4 = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) DashBoard.class);
                intent4.addFlags(67108864);
                VahanPaymentMultiServiceStatusScreen.this.startActivity(intent4);
                VahanPaymentMultiServiceStatusScreen.this.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FinalRequestSubmitResponse) obj);
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
            if (VahanPaymentMultiServiceStatusScreen.this.F1().isShowing()) {
                VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
            }
            Intent intent = new Intent(VahanPaymentMultiServiceStatusScreen.this, (Class<?>) DashBoard.class);
            intent.addFlags(67108864);
            VahanPaymentMultiServiceStatusScreen.this.startActivity(intent);
            VahanPaymentMultiServiceStatusScreen.this.finish();
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(AfterPaymentResponse afterPaymentResponse) throws Throwable {
            try {
                VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen = VahanPaymentMultiServiceStatusScreen.this;
                Intrinsics.checkNotNull(afterPaymentResponse);
                vahanPaymentMultiServiceStatusScreen.k2(afterPaymentResponse);
                if (!VahanPaymentMultiServiceStatusScreen.this.getIsFaceless()) {
                    if (Intrinsics.areEqual(VahanPaymentMultiServiceStatusScreen.this.H1().getFacelesstransaction(), Boolean.TRUE)) {
                        VahanPaymentMultiServiceStatusScreen.this.e2(true);
                    } else {
                        VahanPaymentMultiServiceStatusScreen.this.e2(false);
                    }
                }
                VahanPaymentMultiServiceStatusScreen.this.b2(afterPaymentResponse);
                VahanlogCapture.Companion companion = VahanlogCapture.INSTANCE;
                VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen2 = VahanPaymentMultiServiceStatusScreen.this;
                companion.a(vahanPaymentMultiServiceStatusScreen2, vahanPaymentMultiServiceStatusScreen2.H1(), 1);
                ld7 ld7VarL1 = VahanPaymentMultiServiceStatusScreen.this.L1();
                VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen3 = VahanPaymentMultiServiceStatusScreen.this;
                ld7VarL1.p1(vahanPaymentMultiServiceStatusScreen3, String.valueOf(vahanPaymentMultiServiceStatusScreen3.H1().getState_cd()));
            } catch (Exception e) {
                VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                e.printStackTrace();
                ih ihVar = VahanPaymentMultiServiceStatusScreen.this.binding;
                if (ihVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar = null;
                }
                ihVar.l.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((AfterPaymentResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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
        public final void invoke(String str) {
            VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
            ih ihVar = VahanPaymentMultiServiceStatusScreen.this.binding;
            if (ihVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar = null;
            }
            ihVar.l.setVisibility(8);
            VahanPaymentMultiServiceStatusScreen vahanPaymentMultiServiceStatusScreen = VahanPaymentMultiServiceStatusScreen.this;
            vahanPaymentMultiServiceStatusScreen.r2(vahanPaymentMultiServiceStatusScreen, str.toString());
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(StateCostForDms stateCostForDms) {
            try {
                VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                if (stateCostForDms == null) {
                    VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
                    return;
                }
                VahanPaymentMultiServiceStatusScreen.this.o2(stateCostForDms);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getPur_cd(), new String[]{","}, false, 0, 6, (Object) null);
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getBook_app(), new String[]{","}, false, 0, 6, (Object) null);
                ArrayList<Integer> purCodList = VahanPaymentMultiServiceStatusScreen.this.G1().getPurCodList();
                if (stateCostForDms.getUpload_doc() && VahanPaymentMultiServiceStatusScreen.this.w1(purCodList, listSplit$default)) {
                    VahanPaymentMultiServiceStatusScreen.this.c2(stateCostForDms.getUpload_doc());
                    return;
                }
                if (!VahanPaymentMultiServiceStatusScreen.this.getIsFaceless() && VahanPaymentMultiServiceStatusScreen.this.w1(purCodList, listSplit$default2)) {
                    VahanPaymentMultiServiceStatusScreen.this.f2(true);
                    return;
                }
                VahanPaymentMultiServiceStatusScreen.this.f2(false);
                ih ihVar = VahanPaymentMultiServiceStatusScreen.this.binding;
                if (ihVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar = null;
                }
                ihVar.i.setText("Home");
            } catch (Exception e) {
                e.printStackTrace();
                VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateCostForDms) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanPaymentMultiServiceStatusScreen.this.F1().dismiss();
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    public static final void O1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1(this$0, this$0.D1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void P1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void Q1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ih ihVar = this$0.binding;
        ih ihVar2 = null;
        if (ihVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar = null;
        }
        String string = ihVar.e.getText().toString();
        if (string.length() > 0) {
            String str = s14.a.i() + "printreciept/" + this$0.stateCd + '/' + this$0.offCd + '/' + string + '/' + this$0.rcNo + '/' + this$0.purCd;
            Intent intent = new Intent(this$0, (Class<?>) PdfViewActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("formType", "Fee Receipt");
            StringBuilder sb = new StringBuilder();
            sb.append(this$0.rcNo);
            sb.append('_');
            ih ihVar3 = this$0.binding;
            if (ihVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ihVar2 = ihVar3;
            }
            sb.append((Object) ihVar2.e.getText());
            intent.putExtra("applNo", sb.toString());
            this$0.startActivity(intent);
        }
    }

    public static final void S1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        String str;
        String book_app;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!this$0.isDocUpload) {
                if (StringsKt__StringsJVMKt.equals$default(this$0.H1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
                    Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
                    intent.addFlags(67108864);
                    this$0.startActivity(intent);
                    this$0.finish();
                    return;
                }
                if (this$0.isFaceless || !this$0.isslot) {
                    this$0.F1().show();
                    this$0.Y1();
                    return;
                } else {
                    this$0.F1().show();
                    this$0.Y1();
                    return;
                }
            }
            if (this$0.isFaceless) {
                try {
                    Intent intent2 = new Intent(this$0, (Class<?>) VahanMultiDmsAPI.class);
                    intent2.putExtra("state_code", this$0.H1().getState_cd());
                    ih ihVar = this$0.binding;
                    if (ihVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ihVar = null;
                    }
                    intent2.putExtra(VContant.APP_NO, ihVar.e.getText().toString());
                    intent2.putExtra("rc_number", this$0.H1().getRegn_no());
                    intent2.putExtra(VContant.PURPOSE_CODE, this$0.H1().getPur_cd());
                    intent2.putExtra("off_code", this$0.H1().getOff_cd());
                    intent2.putExtra(VContant.FINAL_SUBMIT, this$0.G1());
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                    intent2.putExtra("RC", this$0.I1());
                    intent2.putExtra("RcDetails", this$0.J1());
                    intent2.putExtra("vahlogReptDate", this$0.H1().getRcpt_dt());
                    intent2.putExtra("vahlogFeeAmt", this$0.H1().getRcpt_amt());
                    intent2.putExtra("vahlogReptNo", this$0.H1().getRcpt_NO());
                    intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.B1());
                    intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.A1());
                    intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
                    this$0.startActivity(intent2);
                    this$0.finish();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            StateCostForDms stateCostForDms = this$0.stateCost;
            if (stateCostForDms != null) {
                if (stateCostForDms == null || (book_app = stateCostForDms.getBook_app()) == null) {
                    str = VContant.NEXGEN_addahar_name;
                } else {
                    str = VContant.NEXGEN_addahar_name;
                    StringsKt__StringsKt.split$default((CharSequence) book_app, new String[]{","}, false, 0, 6, (Object) null);
                }
                if (Intrinsics.areEqual(this$0.H1().getFacelesstransaction(), Boolean.TRUE)) {
                    this$0.isFaceless = true;
                }
            } else {
                str = VContant.NEXGEN_addahar_name;
            }
            Log.e("IsFaceless->2 ", String.valueOf(this$0.isFaceless));
            Intent intent3 = new Intent(this$0, (Class<?>) VahanMultiDmsAPI.class);
            intent3.putExtra("state_code", this$0.H1().getState_cd());
            ih ihVar2 = this$0.binding;
            if (ihVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar2 = null;
            }
            intent3.putExtra(VContant.APP_NO, ihVar2.e.getText().toString());
            intent3.putExtra("rc_number", this$0.H1().getRegn_no());
            intent3.putExtra(VContant.PURPOSE_CODE, this$0.H1().getPur_cd());
            intent3.putExtra("off_code", this$0.H1().getOff_cd());
            intent3.putExtra(VContant.FINAL_SUBMIT, this$0.G1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent3.putExtra("RC", this$0.I1());
            intent3.putExtra("RcDetails", this$0.J1());
            intent3.putExtra("vahlogReptDate", this$0.H1().getRcpt_dt());
            intent3.putExtra("vahlogFeeAmt", this$0.H1().getRcpt_amt());
            intent3.putExtra("vahlogReptNo", this$0.H1().getRcpt_NO());
            intent3.putExtra(str, this$0.B1());
            intent3.putExtra(VContant.NEXGEN_addahar_address, this$0.A1());
            intent3.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            this$0.startActivity(intent3);
            this$0.finish();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static final void T1(VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ih ihVar = null;
        if (!StringsKt__StringsJVMKt.equals$default(this$0.H1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
            Intent intent = new Intent(this$0, (Class<?>) DownloadFormsActivity.class);
            intent.putExtra("state_code", this$0.H1().getState_cd());
            intent.putExtra("off_code", this$0.H1().getOff_cd());
            intent.putExtra("rc_number", this$0.H1().getRegn_no());
            intent.putExtra("appl_no", this$0.H1().getAppl_no());
            this$0.startActivity(intent);
            return;
        }
        ih ihVar2 = this$0.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        String string = ihVar2.e.getText().toString();
        String rcpt_NO = this$0.H1().getRcpt_NO();
        String str = "https://vahan.parivahan.gov.in/vahancapi-common/getVehicleParticularDobj/" + this$0.offCd + '/' + this$0.rcNo + '/' + string + '/' + this$0.purCd + '/' + (rcpt_NO != null ? StringsKt__StringsKt.trim((CharSequence) rcpt_NO).toString() : null) + '/' + this$0.stateCd;
        Intent intent2 = new Intent(this$0, (Class<?>) PdfViewActivity.class);
        intent2.putExtra("url", str);
        intent2.putExtra("formType", "RC Particular Certificate");
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.rcNo);
        sb.append('_');
        ih ihVar3 = this$0.binding;
        if (ihVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ihVar = ihVar3;
        }
        sb.append((Object) ihVar.e.getText());
        intent2.putExtra("applNo", sb.toString());
        this$0.startActivity(intent2);
    }

    private final void U1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.W1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ec7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b2(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse r12) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanPaymentMultiServiceStatusScreen.b2(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void y1(Dialog d2, VahanPaymentMultiServiceStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        new dl4(this$0).g(1);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String B1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final String C1() {
        String str = this.enc_string;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enc_string");
        return null;
    }

    public final wa3 D1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final MultiService E1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final MultiServiceBeforePaymentRequest G1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.paymentRequest;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final AfterPaymentResponse H1() {
        AfterPaymentResponse afterPaymentResponse = this.payment_response;
        if (afterPaymentResponse != null) {
            return afterPaymentResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payment_response");
        return null;
    }

    public final String I1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails J1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 L1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel M1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void Y1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequestG1 = G1();
        String strValueOf = String.valueOf(H1().getRcpt_dt());
        String rcpt_NO = H1().getRcpt_NO();
        Double rcpt_amt = H1().getRcpt_amt();
        Intrinsics.checkNotNull(rcpt_amt);
        M1().x(multiServiceBeforePaymentRequestG1.copy(((-1879048193) & 1) != 0 ? multiServiceBeforePaymentRequestG1.aadhaartxno : null, ((-1879048193) & 2) != 0 ? multiServiceBeforePaymentRequestG1.aadharauth : null, ((-1879048193) & 4) != 0 ? multiServiceBeforePaymentRequestG1.appl_no : null, ((-1879048193) & 8) != 0 ? multiServiceBeforePaymentRequestG1.application_status : false, ((-1879048193) & 16) != 0 ? multiServiceBeforePaymentRequestG1.channgeOfAdressDto : null, ((-1879048193) & 32) != 0 ? multiServiceBeforePaymentRequestG1.chasi_no : null, ((-1879048193) & 64) != 0 ? multiServiceBeforePaymentRequestG1.comp_cd : 0, ((-1879048193) & 128) != 0 ? multiServiceBeforePaymentRequestG1.durcdto : null, ((-1879048193) & 256) != 0 ? multiServiceBeforePaymentRequestG1.feelist : null, ((-1879048193) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceBeforePaymentRequestG1.fir_dt : null, ((-1879048193) & 1024) != 0 ? multiServiceBeforePaymentRequestG1.fir_no : null, ((-1879048193) & 2048) != 0 ? multiServiceBeforePaymentRequestG1.fromScheduler : false, ((-1879048193) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? multiServiceBeforePaymentRequestG1.hpaDto : null, ((-1879048193) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? multiServiceBeforePaymentRequestG1.hptDto : null, ((-1879048193) & 16384) != 0 ? multiServiceBeforePaymentRequestG1.idv : 0, ((-1879048193) & 32768) != 0 ? multiServiceBeforePaymentRequestG1.ins_from : null, ((-1879048193) & 65536) != 0 ? multiServiceBeforePaymentRequestG1.ins_type : 0, ((-1879048193) & 131072) != 0 ? multiServiceBeforePaymentRequestG1.ins_upto : null, ((-1879048193) & 262144) != 0 ? multiServiceBeforePaymentRequestG1.isscheduler : false, ((-1879048193) & 524288) != 0 ? multiServiceBeforePaymentRequestG1.msg : null, ((-1879048193) & 1048576) != 0 ? multiServiceBeforePaymentRequestG1.multiServiceDto : null, ((-1879048193) & 2097152) != 0 ? multiServiceBeforePaymentRequestG1.nofees : false, ((-1879048193) & 4194304) != 0 ? multiServiceBeforePaymentRequestG1.off_cd : 0, ((-1879048193) & 8388608) != 0 ? multiServiceBeforePaymentRequestG1.op_dt : null, ((-1879048193) & 16777216) != 0 ? multiServiceBeforePaymentRequestG1.police_station : null, ((-1879048193) & 33554432) != 0 ? multiServiceBeforePaymentRequestG1.policy_no : null, ((-1879048193) & 67108864) != 0 ? multiServiceBeforePaymentRequestG1.purCodList : null, ((-1879048193) & 134217728) != 0 ? multiServiceBeforePaymentRequestG1.pur_cd : 0, ((-1879048193) & 268435456) != 0 ? multiServiceBeforePaymentRequestG1.rcp_dt : strValueOf, ((-1879048193) & 536870912) != 0 ? multiServiceBeforePaymentRequestG1.rcpt_NO : rcpt_NO, ((-1879048193) & 1073741824) != 0 ? multiServiceBeforePaymentRequestG1.rcpt_amt : (int) rcpt_amt.doubleValue(), ((-1879048193) & IntCompanionObject.MIN_VALUE) != 0 ? multiServiceBeforePaymentRequestG1.reason : 0, (KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? multiServiceBeforePaymentRequestG1.regn_no : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? multiServiceBeforePaymentRequestG1.service_charge : 0, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? multiServiceBeforePaymentRequestG1.state_cd : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? multiServiceBeforePaymentRequestG1.state_header : null, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? multiServiceBeforePaymentRequestG1.status : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? multiServiceBeforePaymentRequestG1.tax_mode : null, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? multiServiceBeforePaymentRequestG1.transferOwnershipDto : null, (KotlinVersion.MAX_COMPONENT_VALUE & 128) != 0 ? multiServiceBeforePaymentRequestG1.vh_class : null));
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void c2(boolean z) {
        this.isDocUpload = z;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enc_string = str;
    }

    public final void e2(boolean z) {
        this.isFaceless = z;
    }

    public final void f2(boolean z) {
        this.isslot = z;
    }

    public final void g2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void h2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void i2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void j2(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        Intrinsics.checkNotNullParameter(multiServiceBeforePaymentRequest, "<set-?>");
        this.paymentRequest = multiServiceBeforePaymentRequest;
    }

    public final void k2(AfterPaymentResponse afterPaymentResponse) {
        Intrinsics.checkNotNullParameter(afterPaymentResponse, "<set-?>");
        this.payment_response = afterPaymentResponse;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void m2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void n2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void o2(StateCostForDms stateCostForDms) {
        this.stateCost = stateCostForDms;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        x1(this, D1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_payment_status_screen);
        ih ihVarC = ih.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ihVarC, "inflate(...)");
        this.binding = ihVarC;
        ih ihVar = null;
        if (ihVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVarC = null;
        }
        setContentView(ihVarC.b());
        ta3.a aVar = ta3.a;
        ih ihVar2 = this.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        aVar.m2(this, ihVar2);
        g2(new wa3(this));
        n2(VahanProService.INSTANCE.a(this));
        d2(String.valueOf(getIntent().getStringExtra("EncString")));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest");
        j2((MultiServiceBeforePaymentRequest) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        a2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        l2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        m2((NrvDetails) serializableExtra2);
        this.isCheckPaymentPending = getIntent().getBooleanExtra("isPaymentPending", false);
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        Log.e("IsFaceless 1-> ", String.valueOf(this.isFaceless));
        i2(new ProgressDialog(this));
        F1().setMessage("Please wait...");
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        p2((ld7) new z(this, new kd7(new jd7(K1()))).a(ld7.class));
        h2(MultiService.INSTANCE.a(this));
        q2((MultiSelectionViewModel) new z(this, new y67(new sx3(E1()))).a(MultiSelectionViewModel.class));
        F1().show();
        L1().t(this, C1());
        L1().B0().g(this, new j(new f()));
        L1().C0().g(this, new j(new g()));
        ih ihVar3 = this.binding;
        if (ihVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar3 = null;
        }
        ihVar3.s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.O1(this.a, view);
            }
        });
        ih ihVar4 = this.binding;
        if (ihVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar4 = null;
        }
        ihVar4.s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.P1(this.a, view);
            }
        });
        ih ihVar5 = this.binding;
        if (ihVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar5 = null;
        }
        ihVar5.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.Q1(this.a, view);
            }
        });
        ih ihVar6 = this.binding;
        if (ihVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar6 = null;
        }
        ihVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ac7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.R1(this.a, view);
            }
        });
        ih ihVar7 = this.binding;
        if (ihVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar7 = null;
        }
        ihVar7.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.S1(this.a, view);
            }
        });
        L1().l0().g(this, new j(new h()));
        L1().m0().g(this, new j(new i()));
        L1().R().g(this, new j(new a()));
        L1().Y0().g(this, new j(new b()));
        L1().X0().g(this, new j(new c()));
        L1().V().g(this, new j(new d()));
        L1().W().g(this, new j(new e()));
        ih ihVar8 = this.binding;
        if (ihVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ihVar = ihVar8;
        }
        ihVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.T1(this.a, view);
            }
        });
    }

    public final void p2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void q2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void r2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.s2(dialog, view);
            }
        });
        dialog.show();
    }

    public final boolean w1(List serviceSelPurList, List PurList) {
        Intrinsics.checkNotNullParameter(serviceSelPurList, "serviceSelPurList");
        Intrinsics.checkNotNullParameter(PurList, "PurList");
        int size = serviceSelPurList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (PurList.contains(String.valueOf(((Number) serviceSelPurList.get(i2)).intValue()))) {
                return true;
            }
        }
        return false;
    }

    public final void x1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(this);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ub7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.y1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentMultiServiceStatusScreen.z1(dialog, view);
            }
        });
        dialog.show();
    }
}
