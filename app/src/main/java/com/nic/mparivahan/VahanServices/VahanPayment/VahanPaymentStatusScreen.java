package com.nic.mparivahan.VahanServices.VahanPayment;

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
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.nic.mparivahan.VahanServices.eSign.ModelEsign.esignModel;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;
import com.zepto.dl4;
import com.zepto.gd1;
import com.zepto.ih;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010.R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010.R\"\u0010A\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010.R\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010.R\"\u0010_\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010@\u001a\u0004\bi\u0010B\"\u0004\bj\u0010DR\"\u0010o\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010.\u001a\u0004\bm\u00100\"\u0004\bn\u00102R\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010.\u001a\u0004\by\u00100\"\u0004\bz\u00102R\"\u0010\u007f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010.\u001a\u0004\b}\u00100\"\u0004\b~\u00102R&\u0010\u0081\u0001\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010@\u001a\u0005\b\u0081\u0001\u0010B\"\u0005\b\u0082\u0001\u0010DR0\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010@\u001a\u0005\b\u008c\u0001\u0010B\"\u0005\b\u008d\u0001\u0010D¨\u0006\u0091\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPayment/VahanPaymentStatusScreen;", "Lcom/zepto/pq;", "", "it", "", "Y1", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "e2", "X1", "Landroid/content/Context;", "context", "message", "P1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "z1", "t2", "b2", "s2", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "N1", "()Lcom/zepto/ld7;", "r2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "p2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "H1", "()Landroid/app/ProgressDialog;", "k2", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Ljava/lang/String;", "E1", "()Ljava/lang/String;", "g2", "(Ljava/lang/String;)V", "enc_string", "Lcom/zepto/ih;", "G", "Lcom/zepto/ih;", "binding", "H", "stateCd", "I", "offCd", "J", "receiptNo", "", "K", "Z", "isDocUpload", "()Z", "f2", "(Z)V", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "j2", "(Lcom/zepto/wa3;)V", "languageSession", "Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "getStateCost", "()Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;", "q2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/StateCostForDms;)V", "stateCost", "N", "rcNo", "O", "purCd", "P", "Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;", "m2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/AfterPaymentResponse;)V", "payment_response", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "l2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "R", "O1", "h2", "isFaceless", "S", "K1", "n2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "T", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "o2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "U", "D1", "d2", "aadhar_name", "V", "C1", "c2", "aadhar_address", "W", "isCheckPaymentPending", "setCheckPaymentPending", "Ljava/util/ArrayList;", "X", "Ljava/util/ArrayList;", "getPurArray", "()Ljava/util/ArrayList;", "setPurArray", "(Ljava/util/ArrayList;)V", "purArray", "Y", "F1", "i2", "isslot", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanPaymentStatusScreen extends pq {

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

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public AfterPaymentResponse payment_response;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean isCheckPaymentPending;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String purCd = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ArrayList purArray = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean isslot = true;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(esignModel esignmodel) {
            VahanPaymentStatusScreen.this.H1().dismiss();
            if (gd1.a.m(esignmodel.getData())) {
                return;
            }
            Intent intent = new Intent(VahanPaymentStatusScreen.this, (Class<?>) eSignDMS.class);
            intent.putExtra("state_code", VahanPaymentStatusScreen.this.J1().getState_cd());
            ih ihVar = VahanPaymentStatusScreen.this.binding;
            if (ihVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar = null;
            }
            intent.putExtra(VContant.APP_NO, ihVar.e.getText().toString());
            intent.putExtra("rc_number", VahanPaymentStatusScreen.this.J1().getRegn_no());
            intent.putExtra(VContant.PURPOSE_CODE, VahanPaymentStatusScreen.this.J1().getPur_cd());
            intent.putExtra("off_code", VahanPaymentStatusScreen.this.J1().getOff_cd());
            intent.putExtra(VContant.FINAL_SUBMIT, VahanPaymentStatusScreen.this.I1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanPaymentStatusScreen.this.getIsFaceless());
            intent.putExtra("RC", VahanPaymentStatusScreen.this.K1());
            intent.putExtra("RcDetails", VahanPaymentStatusScreen.this.L1());
            intent.putExtra("vahlogReptDate", VahanPaymentStatusScreen.this.J1().getRcpt_dt());
            intent.putExtra("vahlogFeeAmt", VahanPaymentStatusScreen.this.J1().getRcpt_amt());
            intent.putExtra("vahlogReptNo", VahanPaymentStatusScreen.this.J1().getRcpt_NO());
            intent.putExtra("URL", StringsKt__StringsKt.trim((CharSequence) esignmodel.getData()).toString());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanPaymentStatusScreen.this.D1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanPaymentStatusScreen.this.C1());
            VahanPaymentStatusScreen.this.startActivity(intent);
            VahanPaymentStatusScreen.this.finish();
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
                if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                    VahanPaymentStatusScreen.this.H1().dismiss();
                }
                Intent intent = new Intent(VahanPaymentStatusScreen.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanPaymentStatusScreen.this.J1().getPur_cd());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putExtra("RC", VahanPaymentStatusScreen.this.K1());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RcDetails", VahanPaymentStatusScreen.this.L1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, VahanPaymentStatusScreen.this.getIsFaceless());
                intent.putExtra(VContant.NEXGEN_addahar_name, VahanPaymentStatusScreen.this.D1());
                intent.putExtra(VContant.NEXGEN_addahar_address, VahanPaymentStatusScreen.this.C1());
                VahanPaymentStatusScreen.this.startActivity(intent);
                VahanPaymentStatusScreen.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                    VahanPaymentStatusScreen.this.H1().dismiss();
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
                if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                    VahanPaymentStatusScreen.this.H1().dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanPaymentStatusScreen.this.Y1(str);
                } else {
                    VahanPaymentStatusScreen vahanPaymentStatusScreen = VahanPaymentStatusScreen.this;
                    Toast.makeText(vahanPaymentStatusScreen, vahanPaymentStatusScreen.getString(R.string.no_internet), 0).show();
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
                    if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                        VahanPaymentStatusScreen.this.H1().dismiss();
                    }
                    Intent intent = new Intent(VahanPaymentStatusScreen.this, (Class<?>) DashBoard.class);
                    intent.addFlags(67108864);
                    VahanPaymentStatusScreen.this.startActivity(intent);
                    VahanPaymentStatusScreen.this.finish();
                    return;
                }
                if (!finalRequestSubmitResponse.getApplication_status()) {
                    if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                        VahanPaymentStatusScreen.this.H1().dismiss();
                    }
                    Intent intent2 = new Intent(VahanPaymentStatusScreen.this, (Class<?>) DashBoard.class);
                    intent2.addFlags(67108864);
                    VahanPaymentStatusScreen.this.startActivity(intent2);
                    VahanPaymentStatusScreen.this.finish();
                    return;
                }
                if (!VahanPaymentStatusScreen.this.getIsslot()) {
                    Intent intent3 = new Intent(VahanPaymentStatusScreen.this, (Class<?>) DashBoard.class);
                    intent3.addFlags(67108864);
                    VahanPaymentStatusScreen.this.startActivity(intent3);
                    VahanPaymentStatusScreen.this.finish();
                    return;
                }
                ld7 ld7VarN1 = VahanPaymentStatusScreen.this.N1();
                VahanPaymentStatusScreen vahanPaymentStatusScreen = VahanPaymentStatusScreen.this;
                ih ihVar = vahanPaymentStatusScreen.binding;
                if (ihVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar = null;
                }
                ld7VarN1.m(vahanPaymentStatusScreen, ihVar.e.getText().toString());
            } catch (Exception unused) {
                if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                    VahanPaymentStatusScreen.this.H1().dismiss();
                }
                Intent intent4 = new Intent(VahanPaymentStatusScreen.this, (Class<?>) DashBoard.class);
                intent4.addFlags(67108864);
                VahanPaymentStatusScreen.this.startActivity(intent4);
                VahanPaymentStatusScreen.this.finish();
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
            if (VahanPaymentStatusScreen.this.H1().isShowing()) {
                VahanPaymentStatusScreen.this.H1().dismiss();
            }
            Intent intent = new Intent(VahanPaymentStatusScreen.this, (Class<?>) DashBoard.class);
            intent.addFlags(67108864);
            VahanPaymentStatusScreen.this.startActivity(intent);
            VahanPaymentStatusScreen.this.finish();
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(AfterPaymentResponse afterPaymentResponse) throws Throwable {
            try {
                VahanPaymentStatusScreen vahanPaymentStatusScreen = VahanPaymentStatusScreen.this;
                Intrinsics.checkNotNull(afterPaymentResponse);
                vahanPaymentStatusScreen.m2(afterPaymentResponse);
                if (!VahanPaymentStatusScreen.this.getIsFaceless()) {
                    if (Intrinsics.areEqual(VahanPaymentStatusScreen.this.J1().getFacelesstransaction(), Boolean.TRUE)) {
                        VahanPaymentStatusScreen.this.h2(true);
                    } else {
                        VahanPaymentStatusScreen.this.h2(false);
                    }
                }
                VahanPaymentStatusScreen.this.e2(afterPaymentResponse);
                if (kt6.d(VahanPaymentStatusScreen.this.purCd) && StringsKt__StringsJVMKt.equals(VahanPaymentStatusScreen.this.purCd, VContant.UPDATE_MOBILE_PURPOSE_CODE, true)) {
                    VahanPaymentStatusScreen vahanPaymentStatusScreen2 = VahanPaymentStatusScreen.this;
                    vahanPaymentStatusScreen2.P1(vahanPaymentStatusScreen2, afterPaymentResponse.getMessege());
                }
                VahanlogCapture.Companion companion = VahanlogCapture.INSTANCE;
                VahanPaymentStatusScreen vahanPaymentStatusScreen3 = VahanPaymentStatusScreen.this;
                companion.a(vahanPaymentStatusScreen3, vahanPaymentStatusScreen3.J1(), 1);
                if (VContant.INSTANCE.f(String.valueOf(VahanPaymentStatusScreen.this.J1().getPur_cd()))) {
                    ld7 ld7VarN1 = VahanPaymentStatusScreen.this.N1();
                    VahanPaymentStatusScreen vahanPaymentStatusScreen4 = VahanPaymentStatusScreen.this;
                    ld7VarN1.q1(vahanPaymentStatusScreen4, String.valueOf(vahanPaymentStatusScreen4.J1().getState_cd()), String.valueOf(VahanPaymentStatusScreen.this.J1().getRegn_no()), String.valueOf(VahanPaymentStatusScreen.this.J1().getPur_cd()));
                } else {
                    ld7 ld7VarN12 = VahanPaymentStatusScreen.this.N1();
                    VahanPaymentStatusScreen vahanPaymentStatusScreen5 = VahanPaymentStatusScreen.this;
                    ld7VarN12.p1(vahanPaymentStatusScreen5, String.valueOf(vahanPaymentStatusScreen5.J1().getState_cd()));
                }
            } catch (Exception e) {
                VahanPaymentStatusScreen.this.H1().dismiss();
                e.printStackTrace();
                ih ihVar = VahanPaymentStatusScreen.this.binding;
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
            VahanPaymentStatusScreen.this.H1().dismiss();
            ih ihVar = VahanPaymentStatusScreen.this.binding;
            if (ihVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ihVar = null;
            }
            ihVar.l.setVisibility(8);
            if (StringsKt__StringsJVMKt.equals(str.toString(), "Error", true)) {
                VahanPaymentStatusScreen vahanPaymentStatusScreen = VahanPaymentStatusScreen.this;
                vahanPaymentStatusScreen.t2(vahanPaymentStatusScreen, "unable to process request, please try again");
            } else {
                VahanPaymentStatusScreen vahanPaymentStatusScreen2 = VahanPaymentStatusScreen.this;
                vahanPaymentStatusScreen2.t2(vahanPaymentStatusScreen2, str);
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(StateCostForDms stateCostForDms) {
            try {
                VahanPaymentStatusScreen.this.H1().dismiss();
                if (stateCostForDms == null) {
                    VahanPaymentStatusScreen.this.H1().dismiss();
                    return;
                }
                VahanPaymentStatusScreen.this.q2(stateCostForDms);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getPur_cd(), new String[]{","}, false, 0, 6, (Object) null);
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getBook_app(), new String[]{","}, false, 0, 6, (Object) null);
                ih ihVar = null;
                if (!stateCostForDms.getUpload_doc() || !CollectionsKt___CollectionsKt.contains(listSplit$default, VahanPaymentStatusScreen.this.J1().getPur_cd())) {
                    if (StringsKt__StringsJVMKt.equals$default(VahanPaymentStatusScreen.this.J1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
                        wa3 wa3Var = new wa3(VahanPaymentStatusScreen.this);
                        VahanPaymentStatusScreen.this.f2(false);
                        ih ihVar2 = VahanPaymentStatusScreen.this.binding;
                        if (ihVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ihVar2 = null;
                        }
                        ihVar2.i.setText(wa3Var.b("label_home", "Home"));
                        ih ihVar3 = VahanPaymentStatusScreen.this.binding;
                        if (ihVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ihVar3 = null;
                        }
                        ihVar3.g.setText(wa3Var.b("print_rc_particular", "Print RC Particular Certificate"));
                    }
                    if (VahanPaymentStatusScreen.this.getIsFaceless() || !CollectionsKt___CollectionsKt.contains(listSplit$default2, VahanPaymentStatusScreen.this.J1().getPur_cd())) {
                        VahanPaymentStatusScreen.this.i2(false);
                        ih ihVar4 = VahanPaymentStatusScreen.this.binding;
                        if (ihVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ihVar4 = null;
                        }
                        ihVar4.i.setText("Home");
                        VahanPaymentStatusScreen.this.s2();
                    } else {
                        VahanPaymentStatusScreen.this.i2(true);
                    }
                    if (StringsKt__StringsJVMKt.equals$default(VahanPaymentStatusScreen.this.J1().getPur_cd(), VContant.ALTERATION_PURPOSE_CODE, false, 2, null) || StringsKt__StringsJVMKt.equals$default(VahanPaymentStatusScreen.this.J1().getPur_cd(), VContant.UPDATE_MOBILE_PURPOSE_CODE, false, 2, null)) {
                        ih ihVar5 = VahanPaymentStatusScreen.this.binding;
                        if (ihVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            ihVar = ihVar5;
                        }
                        ihVar.g.setVisibility(8);
                        return;
                    }
                    return;
                }
                VahanPaymentStatusScreen.this.f2(stateCostForDms.getUpload_doc());
                if (StringsKt__StringsJVMKt.equals$default(VahanPaymentStatusScreen.this.J1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
                    wa3 wa3Var2 = new wa3(VahanPaymentStatusScreen.this);
                    VahanPaymentStatusScreen.this.f2(false);
                    ih ihVar6 = VahanPaymentStatusScreen.this.binding;
                    if (ihVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ihVar6 = null;
                    }
                    ihVar6.i.setText(wa3Var2.b("label_home", "Home"));
                    ih ihVar7 = VahanPaymentStatusScreen.this.binding;
                    if (ihVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ihVar7 = null;
                    }
                    ihVar7.g.setText(wa3Var2.b("print_rc_particular", "Print RC Particular Certificate"));
                    if (gd1.a.m(stateCostForDms.getPur_cd())) {
                        return;
                    }
                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getPur_cd(), new String[]{","}, false, 0, 6, (Object) null);
                    int size = listSplit$default3.size();
                    for (int i = 0; i < size; i++) {
                        if (StringsKt__StringsKt.trim((CharSequence) ((String) listSplit$default3.get(i)).toString()).toString().equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
                            wa3 wa3Var3 = new wa3(VahanPaymentStatusScreen.this);
                            VahanPaymentStatusScreen.this.f2(true);
                            ih ihVar8 = VahanPaymentStatusScreen.this.binding;
                            if (ihVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                ihVar8 = null;
                            }
                            ihVar8.g.setVisibility(8);
                            ih ihVar9 = VahanPaymentStatusScreen.this.binding;
                            if (ihVar9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                ihVar9 = null;
                            }
                            ihVar9.i.setText(wa3Var3.b("btn_dl_serv_next", "Next"));
                            ih ihVar10 = VahanPaymentStatusScreen.this.binding;
                            if (ihVar10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                ihVar = ihVar10;
                            }
                            ihVar.g.setText(wa3Var3.b("print_rc_particular", "Print RC Particular Certificate"));
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanPaymentStatusScreen.this.H1().dismiss();
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
            VahanPaymentStatusScreen.this.H1().dismiss();
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

    public static final void A1(Dialog d2, VahanPaymentStatusScreen this$0, View view) {
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
    public static final void B1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.Q1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Q1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void R1(VahanPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1(this$0, this$0.G1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void S1(VahanPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X1();
    }

    public static final void T1(VahanPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void U1(VahanPaymentStatusScreen this$0, View view) {
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

    public static final void V1(VahanPaymentStatusScreen this$0, View view) {
        String str;
        ih ihVar;
        String str2;
        List listSplit$default;
        String book_app;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!this$0.isDocUpload) {
                if (!StringsKt__StringsJVMKt.equals$default(this$0.J1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null) && !StringsKt__StringsJVMKt.equals$default(this$0.J1().getPur_cd(), VContant.UPDATE_MOBILE_PURPOSE_CODE, false, 2, null)) {
                    if (this$0.isFaceless || !this$0.isslot) {
                        this$0.H1().show();
                        this$0.b2();
                        return;
                    } else {
                        this$0.H1().show();
                        this$0.b2();
                        return;
                    }
                }
                Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
                intent.addFlags(67108864);
                this$0.startActivity(intent);
                this$0.finish();
                return;
            }
            if (!this$0.isFaceless) {
                StateCostForDms stateCostForDms = this$0.stateCost;
                if (stateCostForDms != null) {
                    if (stateCostForDms == null || (book_app = stateCostForDms.getBook_app()) == null) {
                        str2 = VContant.NEXGEN_addahar_name;
                        listSplit$default = null;
                    } else {
                        str2 = VContant.NEXGEN_addahar_name;
                        listSplit$default = StringsKt__StringsKt.split$default((CharSequence) book_app, new String[]{","}, false, 0, 6, (Object) null);
                    }
                    Intrinsics.checkNotNull(listSplit$default);
                    if (!CollectionsKt___CollectionsKt.contains(listSplit$default, this$0.J1().getPur_cd())) {
                        this$0.isFaceless = true;
                    }
                } else {
                    str2 = VContant.NEXGEN_addahar_name;
                }
                Intent intent2 = new Intent(this$0, (Class<?>) VahanDmsAPI.class);
                intent2.putExtra("state_code", this$0.J1().getState_cd());
                ih ihVar2 = this$0.binding;
                if (ihVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar2 = null;
                }
                intent2.putExtra(VContant.APP_NO, ihVar2.e.getText().toString());
                intent2.putExtra("rc_number", this$0.J1().getRegn_no());
                intent2.putExtra(VContant.PURPOSE_CODE, this$0.J1().getPur_cd());
                intent2.putExtra("off_code", this$0.J1().getOff_cd());
                intent2.putExtra(VContant.FINAL_SUBMIT, this$0.I1());
                intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent2.putExtra("RC", this$0.K1());
                intent2.putExtra("RcDetails", this$0.L1());
                intent2.putExtra("vahlogReptDate", this$0.J1().getRcpt_dt());
                intent2.putExtra("vahlogFeeAmt", this$0.J1().getRcpt_amt());
                intent2.putExtra("vahlogReptNo", this$0.J1().getRcpt_NO());
                intent2.putExtra(str2, this$0.D1());
                intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.C1());
                this$0.startActivity(intent2);
                this$0.finish();
                return;
            }
            try {
                if (StringsKt__StringsJVMKt.equals(this$0.J1().getState_cd(), "DL", true)) {
                    str = "vahlogReptDate";
                    if (!StringsKt__StringsJVMKt.equals$default(this$0.J1().getPur_cd(), VContant.UPDATE_MOBILE_PURPOSE_CODE, false, 2, null)) {
                        this$0.H1().show();
                        String strReplace$default = StringsKt__StringsJVMKt.replace$default(VContant.INSTANCE.C(this$0, String.valueOf(this$0.J1().getPur_cd())).toString(), " ", "%20", false, 4, (Object) null);
                        VUtility.Companion companion = VUtility.INSTANCE;
                        String strValueOf = String.valueOf(this$0.J1().getState_cd());
                        String strM = companion.m(String.valueOf(this$0.L1().getPmt_type_code()));
                        Integer vehTypeAsInt = this$0.L1().getVehTypeAsInt();
                        Intrinsics.checkNotNull(vehTypeAsInt);
                        String strF0 = companion.f0(vehTypeAsInt.intValue());
                        String strL = companion.l(String.valueOf(this$0.L1().getPmt_catg_code()));
                        String strK1 = this$0.K1();
                        String strValueOf2 = String.valueOf(this$0.J1().getOff_cd());
                        String strValueOf3 = String.valueOf(this$0.J1().getPur_cd());
                        ih ihVar3 = this$0.binding;
                        if (ihVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ihVar = null;
                        } else {
                            ihVar = ihVar3;
                        }
                        JSONObject jSONObjectL = companion.L(strValueOf, strReplace$default, strM, strF0, strL, strK1, strValueOf2, strValueOf3, ihVar.e.getText().toString(), String.valueOf(this$0.J1().getPur_cd()));
                        ld7 ld7VarN1 = this$0.N1();
                        String string = jSONObjectL.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        ld7VarN1.q(string);
                        return;
                    }
                } else {
                    str = "vahlogReptDate";
                }
                Intent intent3 = new Intent(this$0, (Class<?>) VahanDmsAPI.class);
                intent3.putExtra("state_code", this$0.J1().getState_cd());
                ih ihVar4 = this$0.binding;
                if (ihVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ihVar4 = null;
                }
                intent3.putExtra(VContant.APP_NO, ihVar4.e.getText().toString());
                intent3.putExtra("rc_number", this$0.J1().getRegn_no());
                intent3.putExtra(VContant.PURPOSE_CODE, this$0.J1().getPur_cd());
                intent3.putExtra("off_code", this$0.J1().getOff_cd());
                intent3.putExtra(VContant.FINAL_SUBMIT, this$0.I1());
                intent3.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent3.putExtra("RC", this$0.K1());
                intent3.putExtra("RcDetails", this$0.L1());
                intent3.putExtra(str, this$0.J1().getRcpt_dt());
                intent3.putExtra("vahlogFeeAmt", this$0.J1().getRcpt_amt());
                intent3.putExtra("vahlogReptNo", this$0.J1().getRcpt_NO());
                intent3.putExtra(VContant.NEXGEN_addahar_name, this$0.D1());
                intent3.putExtra(VContant.NEXGEN_addahar_address, this$0.C1());
                this$0.startActivity(intent3);
                this$0.finish();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static final void W1(VahanPaymentStatusScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ih ihVar = null;
        if (!StringsKt__StringsJVMKt.equals$default(this$0.J1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, null)) {
            Intent intent = new Intent(this$0, (Class<?>) DownloadFormsActivity.class);
            intent.putExtra("state_code", this$0.J1().getState_cd());
            intent.putExtra("off_code", this$0.J1().getOff_cd());
            intent.putExtra("rc_number", this$0.J1().getRegn_no());
            intent.putExtra("appl_no", this$0.J1().getAppl_no());
            this$0.startActivity(intent);
            return;
        }
        ih ihVar2 = this$0.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        String string = ihVar2.e.getText().toString();
        String rcpt_NO = this$0.J1().getRcpt_NO();
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

    private final void X1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.Z1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ic7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.a2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e2(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse r12) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen.e2(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String C1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String D1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final String E1() {
        String str = this.enc_string;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enc_string");
        return null;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final boolean getIsslot() {
        return this.isslot;
    }

    public final wa3 G1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final BeforePaymentRequest I1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final AfterPaymentResponse J1() {
        AfterPaymentResponse afterPaymentResponse = this.payment_response;
        if (afterPaymentResponse != null) {
            return afterPaymentResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payment_response");
        return null;
    }

    public final String K1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails L1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 N1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void b2() {
        String aadharauth = I1().getAadharauth();
        ih ihVar = this.binding;
        if (ihVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar = null;
        }
        N1().y1(new BeforePaymentRequestfinal(aadharauth, ihVar.e.getText().toString(), I1().getChanngeOfAdressDto(), I1().getComp_cd(), I1().getDurcdto(), I1().getFir_dt(), I1().getFir_no(), I1().getHpaDto(), I1().getHptDto(), I1().getIdv(), String.valueOf(I1().getIns_from()), I1().getIns_type(), String.valueOf(I1().getIns_upto()), I1().getMsg().toString(), I1().getNocDto(), I1().getOff_cd().toString(), I1().getOp_dt().toString(), I1().getPolice_station().toString(), I1().getPolicy_no().toString(), I1().getPur_cd().toString(), String.valueOf(J1().getRcpt_dt()), String.valueOf(J1().getRcpt_NO()), String.valueOf(J1().getRcpt_amt()), I1().getReason(), I1().getRegn_no().toString(), I1().getState_cd().toString(), I1().getState_header().toString(), I1().getStatus().toString(), I1().getTax_mode().toString(), I1().getVh_class()));
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void f2(boolean z) {
        this.isDocUpload = z;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enc_string = str;
    }

    public final void h2(boolean z) {
        this.isFaceless = z;
    }

    public final void i2(boolean z) {
        this.isslot = z;
    }

    public final void j2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void k2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void l2(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    public final void m2(AfterPaymentResponse afterPaymentResponse) {
        Intrinsics.checkNotNullParameter(afterPaymentResponse, "<set-?>");
        this.payment_response = afterPaymentResponse;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void o2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        z1(this, G1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
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
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        ih ihVar2 = this.binding;
        if (ihVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar2 = null;
        }
        aVar.m2(this, ihVar2);
        j2(new wa3(this));
        p2(VahanProService.INSTANCE.a(this));
        g2(String.valueOf(getIntent().getStringExtra("EncString")));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
        l2((BeforePaymentRequest) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        d2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        c2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        n2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        o2((NrvDetails) serializableExtra2);
        this.isCheckPaymentPending = getIntent().getBooleanExtra("isPaymentPending", false);
        Log.e("IsFaceless -- > ", String.valueOf(this.isFaceless));
        k2(new ProgressDialog(this));
        H1().setMessage("Please wait...");
        H1().setCancelable(false);
        H1().setCanceledOnTouchOutside(false);
        r2((ld7) new z(this, new kd7(new jd7(M1()))).a(ld7.class));
        H1().show();
        N1().t(this, E1());
        N1().B0().g(this, new j(new f()));
        N1().C0().g(this, new j(new g()));
        ih ihVar3 = this.binding;
        if (ihVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar3 = null;
        }
        ihVar3.s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.R1(this.a, view);
            }
        });
        ih ihVar4 = this.binding;
        if (ihVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar4 = null;
        }
        ihVar4.s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.S1(this.a, view);
            }
        });
        ih ihVar5 = this.binding;
        if (ihVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar5 = null;
        }
        ihVar5.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.T1(this.a, view);
            }
        });
        ih ihVar6 = this.binding;
        if (ihVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar6 = null;
        }
        ihVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.U1(this.a, view);
            }
        });
        ih ihVar7 = this.binding;
        if (ihVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar7 = null;
        }
        ihVar7.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.V1(this.a, view);
            }
        });
        N1().l0().g(this, new j(new h()));
        N1().m0().g(this, new j(new i()));
        N1().R().g(this, new j(new a()));
        N1().Y0().g(this, new j(new b()));
        N1().X0().g(this, new j(new c()));
        N1().V().g(this, new j(new d()));
        N1().W().g(this, new j(new e()));
        ih ihVar8 = this.binding;
        if (ihVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ihVar = ihVar8;
        }
        ihVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.W1(this.a, view);
            }
        });
    }

    public final void p2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void q2(StateCostForDms stateCostForDms) {
        this.stateCost = stateCostForDms;
    }

    public final void r2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void s2() {
        String aadharauth = I1().getAadharauth();
        ih ihVar = this.binding;
        if (ihVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ihVar = null;
        }
        N1().z1(new BeforePaymentRequestfinal(aadharauth, ihVar.e.getText().toString(), I1().getChanngeOfAdressDto(), I1().getComp_cd(), I1().getDurcdto(), I1().getFir_dt(), I1().getFir_no(), I1().getHpaDto(), I1().getHptDto(), I1().getIdv(), String.valueOf(I1().getIns_from()), I1().getIns_type(), String.valueOf(I1().getIns_upto()), I1().getMsg().toString(), I1().getNocDto(), I1().getOff_cd().toString(), I1().getOp_dt().toString(), I1().getPolice_station().toString(), I1().getPolicy_no().toString(), I1().getPur_cd().toString(), String.valueOf(J1().getRcpt_dt()), String.valueOf(J1().getRcpt_NO()), String.valueOf(J1().getRcpt_amt()), I1().getReason(), I1().getRegn_no().toString(), I1().getState_cd().toString(), I1().getState_header().toString(), I1().getStatus().toString(), I1().getTax_mode().toString(), I1().getVh_class()));
    }

    public final void t2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.u2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void z1(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.A1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanPaymentStatusScreen.B1(dialog, view);
            }
        });
        dialog.show();
    }
}
