package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Applnolist;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplTranByRcStatus;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.db3;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R2\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000607j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`88\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010\u001d\u001a\u0004\bi\u0010/\"\u0004\bj\u00101R\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010>\u001a\u0004\b}\u0010@\"\u0004\b~\u0010BR&\u0010\u0083\u0001\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010>\u001a\u0005\b\u0081\u0001\u0010@\"\u0005\b\u0082\u0001\u0010BR&\u0010\u0087\u0001\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010Z\u001a\u0005\b\u0085\u0001\u0010\\\"\u0005\b\u0086\u0001\u0010^R&\u0010\u008b\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010R\u001a\u0005\b\u0089\u0001\u0010T\"\u0005\b\u008a\u0001\u0010VR%\u0010\u008e\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b>\u0010\u001d\u001a\u0005\b\u008c\u0001\u0010/\"\u0005\b\u008d\u0001\u00101R&\u0010\u0092\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010\u001d\u001a\u0005\b\u0090\u0001\u0010/\"\u0005\b\u0091\u0001\u00101¨\u0006\u0095\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplTranByRcStatus;", "Lcom/zepto/pq;", "", "L1", "U1", "x1", "", "appl_no", "w1", "it", "V1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "onBackPressed", "Landroid/content/Context;", "context", "message", "j2", "C", "Landroid/content/Context;", "mContext", "Lcom/zepto/db3;", "D", "Lcom/zepto/db3;", "binding", "E", "Ljava/lang/String;", "applNo", "F", "ownerName", "G", "stateCd", "H", "registratioNo", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "J", "C1", "()Ljava/lang/String;", "setP_code", "(Ljava/lang/String;)V", "p_code", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "K", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "L", "Ljava/util/HashMap;", "stateList", "", "M", "Z", "z1", "()Z", "setFacelesstransaction", "(Z)V", "facelesstransaction", "N", "getAppointmentpending", "setAppointmentpending", "appointmentpending", "Landroid/app/ProgressDialog;", "O", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "a2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "P", "Lcom/zepto/ld7;", "J1", "()Lcom/zepto/ld7;", "h2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "c2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "R", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;)V", "reqBeforPayment", "S", "getPur_code", "setPur_code", "pur_code", "Lcom/zepto/al7;", "T", "Lcom/zepto/al7;", "K1", "()Lcom/zepto/al7;", "i2", "(Lcom/zepto/al7;)V", "viewModel1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "U", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService1", "V", "getIsdocuploadpending", "setIsdocuploadpending", "isdocuploadpending", "W", "getIsrtorejection", "setIsrtorejection", "isrtorejection", "X", "G1", "e2", "slotService", "Y", "H1", "f2", "slotViewModel", "y1", "Y1", "current_status", "a0", "I1", "g2", "status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanApplTranByRcStatus extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public db3 binding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails nrvDetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean facelesstransaction;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean appointmentpending;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public RequireDataForBePaymet reqBeforPayment;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public al7 viewModel1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService1;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean isdocuploadpending;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean isrtorejection;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String current_status;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String status;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final Context mContext = this;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String registratioNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String p_code = "0";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HashMap stateList = new HashMap();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String pur_code = "0";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    String str = ownerDetailPuccPermit.getP_add1() + ", " + ownerDetailPuccPermit.getP_add2() + ',' + ownerDetailPuccPermit.getP_add3();
                    String str2 = ownerDetailPuccPermit.getC_add1() + ", " + ownerDetailPuccPermit.getC_add2() + ',' + ownerDetailPuccPermit.getC_add3();
                    VahanApplTranByRcStatus vahanApplTranByRcStatus = VahanApplTranByRcStatus.this;
                    String fit_upto = ownerDetailPuccPermit.getFit_upto();
                    String norms_descr = ownerDetailPuccPermit.getNorms_descr();
                    String fuel_descr = ownerDetailPuccPermit.getFuel_descr();
                    String regn_dt = ownerDetailPuccPermit.getRegn_dt();
                    String model_name = ownerDetailPuccPermit.getModel_name();
                    String maker_name = ownerDetailPuccPermit.getMaker_name();
                    String strValueOf = String.valueOf(ownerDetailPuccPermit.getVch_catg_desc());
                    String vh_class_desc = ownerDetailPuccPermit.getVh_class_desc();
                    String f_name = ownerDetailPuccPermit.getF_name();
                    String owner_name = ownerDetailPuccPermit.getOwner_name();
                    String c_state = ownerDetailPuccPermit.getC_state();
                    String chasi_no = ownerDetailPuccPermit.getChasi_no();
                    String eng_no = ownerDetailPuccPermit.getEng_no();
                    String strValueOf2 = String.valueOf(ownerDetailPuccPermit.getMobile_no());
                    String strValueOf3 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                    String strValueOf4 = String.valueOf(ownerDetailPuccPermit.getOwner_sr());
                    String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                    String state_cd = ownerDetailPuccPermit.getState_cd();
                    String vch_catg = ownerDetailPuccPermit.getVch_catg();
                    String strValueOf5 = String.valueOf(ownerDetailPuccPermit.getVh_class());
                    String vehType = ownerDetailPuccPermit.getVehType();
                    Integer vehTypeAsInt = ownerDetailPuccPermit.getVehTypeAsInt();
                    Integer seat_cap = ownerDetailPuccPermit.getSeat_cap();
                    vahanApplTranByRcStatus.Z1(new NrvDetails(fit_upto, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", norms_descr, fuel_descr, regn_dt, model_name, maker_name, strValueOf, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, strValueOf2, strValueOf3, strValueOf4, str, str2, regn_no2, state_cd, vch_catg, strValueOf5, vehType, vehTypeAsInt, seat_cap != null ? Integer.valueOf(seat_cap.intValue()) : null, 0, "0", "0", "", null));
                    Intent intent = new Intent(VahanApplTranByRcStatus.this, (Class<?>) VahanDmsAPI.class);
                    intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                    intent.putExtra(VContant.APP_NO, VahanApplTranByRcStatus.this.applNo);
                    intent.putExtra("rc_number", VahanApplTranByRcStatus.this.registratioNo);
                    intent.putExtra(VContant.PURPOSE_CODE, VahanApplTranByRcStatus.this.getP_code());
                    String str3 = VahanApplTranByRcStatus.this.applNo;
                    String strValueOf6 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                    String p_code = VahanApplTranByRcStatus.this.getP_code();
                    String rcpt_dt = VahanApplTranByRcStatus.this.D1().getRcpt_dt();
                    String return_rcpt_no = VahanApplTranByRcStatus.this.D1().getReturn_rcpt_no();
                    Double dValueOf = Double.valueOf(VahanApplTranByRcStatus.this.D1().getRcpt_amt());
                    String regn_no3 = ownerDetailPuccPermit.getRegn_no();
                    String state_cd2 = VahanApplTranByRcStatus.this.D1().getState_cd();
                    String rc_vh_class_cd = VahanApplTranByRcStatus.this.A1().getRc_vh_class_cd();
                    BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest(null, null, "", str3, null, 0, null, " ", " ", null, null, 0, " ", 0, "", "", null, strValueOf6, " ", " ", " ", p_code, rcpt_dt, return_rcpt_no, dValueOf, 0, regn_no3, state_cd2, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null);
                    intent.putExtra("off_code", ownerDetailPuccPermit.getOff_cd());
                    intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                    intent.putExtra(VContant.NEXGEN_isFACELESS, VahanApplTranByRcStatus.this.getFacelesstransaction());
                    intent.putExtra("RC", VahanApplTranByRcStatus.this.registratioNo);
                    intent.putExtra("RcDetails", VahanApplTranByRcStatus.this.A1());
                    intent.putExtra("vahlogReptDate", VahanApplTranByRcStatus.this.D1().getRcpt_dt());
                    intent.putExtra("vahlogFeeAmt", VahanApplTranByRcStatus.this.D1().getRcpt_amt());
                    intent.putExtra("vahlogReptNo", VahanApplTranByRcStatus.this.D1().getReturn_rcpt_no());
                    intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                    intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                    VahanApplTranByRcStatus.this.startActivity(intent);
                    VahanApplTranByRcStatus.this.finish();
                    return;
                }
                VahanApplTranByRcStatus.this.B1().dismiss();
            } catch (Exception e) {
                VahanApplTranByRcStatus.this.B1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            VahanApplTranByRcStatus.this.B1().dismiss();
            VahanApplTranByRcStatus vahanApplTranByRcStatus = VahanApplTranByRcStatus.this;
            vahanApplTranByRcStatus.j2(vahanApplTranByRcStatus, vahanApplTranByRcStatus.getString(R.string.service_unavable_please_try));
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanApplTranByRcStatus.this.B1().isShowing()) {
                    VahanApplTranByRcStatus.this.B1().dismiss();
                }
                Intent intent = new Intent(VahanApplTranByRcStatus.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanApplTranByRcStatus.this.getP_code());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", VahanApplTranByRcStatus.this.registratioNo);
                intent.putExtra("RcDetails", VahanApplTranByRcStatus.this.A1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                VahanApplTranByRcStatus.this.startActivity(intent);
                VahanApplTranByRcStatus.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotUserDataModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (VahanApplTranByRcStatus.this.B1().isShowing()) {
                    VahanApplTranByRcStatus.this.B1().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanApplTranByRcStatus vahanApplTranByRcStatus = VahanApplTranByRcStatus.this;
                    Toast.makeText(vahanApplTranByRcStatus, vahanApplTranByRcStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    VahanApplTranByRcStatus.this.V1(str);
                    return;
                }
                VahanApplTranByRcStatus vahanApplTranByRcStatus2 = VahanApplTranByRcStatus.this;
                vahanApplTranByRcStatus2.V1(vahanApplTranByRcStatus2.getString(R.string.service_unavable_please_try));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    private final void L1() {
        db3 db3Var = this.binding;
        db3 db3Var2 = null;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        db3Var.g.setVisibility(8);
        db3 db3Var3 = this.binding;
        if (db3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var3 = null;
        }
        db3Var3.k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.M1(this.a, view);
            }
        });
        db3 db3Var4 = this.binding;
        if (db3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var4 = null;
        }
        db3Var4.k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.N1(this.a, view);
            }
        });
        try {
            g2(y1());
            if (StringsKt__StringsKt.contains$default((CharSequence) y1(), (CharSequence) "PENDING IN DRAFT", false, 2, (Object) null)) {
                db3 db3Var5 = this.binding;
                if (db3Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    db3Var5 = null;
                }
                db3Var5.p.setVisibility(8);
                db3 db3Var6 = this.binding;
                if (db3Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    db3Var6 = null;
                }
                db3Var6.c0.setVisibility(8);
                db3 db3Var7 = this.binding;
                if (db3Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    db3Var7 = null;
                }
                db3Var7.M.setVisibility(8);
            } else {
                if (StringsKt__StringsKt.contains$default((CharSequence) I1(), (CharSequence) "DOCUMENT UPLOAD PENDING AT ONLINE SERVICE", false, 2, (Object) null) && this.isdocuploadpending) {
                    Log.e("Pending311", "jbbkssk");
                    db3 db3Var8 = this.binding;
                    if (db3Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var8 = null;
                    }
                    db3Var8.p.setVisibility(0);
                    db3 db3Var9 = this.binding;
                    if (db3Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var9 = null;
                    }
                    db3Var9.c0.setVisibility(0);
                    db3 db3Var10 = this.binding;
                    if (db3Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var10 = null;
                    }
                    db3Var10.e0.setVisibility(0);
                    db3 db3Var11 = this.binding;
                    if (db3Var11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var11 = null;
                    }
                    db3Var11.Z.setVisibility(0);
                    db3 db3Var12 = this.binding;
                    if (db3Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var12 = null;
                    }
                    db3Var12.M.setVisibility(0);
                    if (this.facelesstransaction) {
                        db3 db3Var13 = this.binding;
                        if (db3Var13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            db3Var13 = null;
                        }
                        db3Var13.M.setVisibility(8);
                    } else {
                        db3 db3Var14 = this.binding;
                        if (db3Var14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            db3Var14 = null;
                        }
                        db3Var14.M.setVisibility(0);
                    }
                } else if (!this.isdocuploadpending) {
                    db3 db3Var15 = this.binding;
                    if (db3Var15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var15 = null;
                    }
                    db3Var15.p.setVisibility(0);
                    db3 db3Var16 = this.binding;
                    if (db3Var16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var16 = null;
                    }
                    db3Var16.c0.setVisibility(0);
                    db3 db3Var17 = this.binding;
                    if (db3Var17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var17 = null;
                    }
                    db3Var17.e0.setVisibility(0);
                    db3 db3Var18 = this.binding;
                    if (db3Var18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var18 = null;
                    }
                    db3Var18.Z.setVisibility(0);
                    db3 db3Var19 = this.binding;
                    if (db3Var19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var19 = null;
                    }
                    db3Var19.M.setVisibility(0);
                    db3 db3Var20 = this.binding;
                    if (db3Var20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var20 = null;
                    }
                    db3Var20.e0.setText("Completed");
                    db3 db3Var21 = this.binding;
                    if (db3Var21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var21 = null;
                    }
                    db3Var21.e0.setTextColor(getColor(R.color.green500));
                    db3 db3Var22 = this.binding;
                    if (db3Var22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var22 = null;
                    }
                    db3Var22.o.setBackgroundDrawable(getDrawable(R.drawable.circle_blue));
                    db3 db3Var23 = this.binding;
                    if (db3Var23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var23 = null;
                    }
                    db3Var23.o.setTextColor(getColor(R.color.white));
                    db3 db3Var24 = this.binding;
                    if (db3Var24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var24 = null;
                    }
                    db3Var24.d0.setVisibility(0);
                    db3 db3Var25 = this.binding;
                    if (db3Var25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var25 = null;
                    }
                    db3Var25.Z.setVisibility(8);
                    if (this.facelesstransaction) {
                        db3 db3Var26 = this.binding;
                        if (db3Var26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            db3Var26 = null;
                        }
                        db3Var26.M.setVisibility(8);
                    } else {
                        db3 db3Var27 = this.binding;
                        if (db3Var27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            db3Var27 = null;
                        }
                        db3Var27.M.setVisibility(0);
                    }
                }
                if (this.isrtorejection) {
                    db3 db3Var28 = this.binding;
                    if (db3Var28 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var28 = null;
                    }
                    db3Var28.c0.setVisibility(0);
                    db3 db3Var29 = this.binding;
                    if (db3Var29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var29 = null;
                    }
                    db3Var29.Z.setVisibility(8);
                    db3 db3Var30 = this.binding;
                    if (db3Var30 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var30 = null;
                    }
                    db3Var30.e0.setText("Rejected");
                    db3 db3Var31 = this.binding;
                    if (db3Var31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var31 = null;
                    }
                    db3Var31.Z.setText("Reupload");
                }
                boolean z = this.facelesstransaction;
                if (!z && !this.appointmentpending) {
                    Log.e("Pending4", "jbbkssk");
                    db3 db3Var32 = this.binding;
                    if (db3Var32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var32 = null;
                    }
                    db3Var32.M.setVisibility(0);
                    db3 db3Var33 = this.binding;
                    if (db3Var33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var33 = null;
                    }
                    db3Var33.O.setText("Completed");
                    db3 db3Var34 = this.binding;
                    if (db3Var34 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var34 = null;
                    }
                    db3Var34.O.setTextColor(getColor(R.color.green500));
                    db3 db3Var35 = this.binding;
                    if (db3Var35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var35 = null;
                    }
                    db3Var35.n.setBackgroundDrawable(getDrawable(R.drawable.circle_blue));
                    db3 db3Var36 = this.binding;
                    if (db3Var36 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var36 = null;
                    }
                    db3Var36.n.setTextColor(getColor(R.color.white));
                    db3 db3Var37 = this.binding;
                    if (db3Var37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var37 = null;
                    }
                    db3Var37.L.setVisibility(8);
                    db3 db3Var38 = this.binding;
                    if (db3Var38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var38 = null;
                    }
                    db3Var38.N.setVisibility(0);
                } else if (!z && this.appointmentpending) {
                    db3 db3Var39 = this.binding;
                    if (db3Var39 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var39 = null;
                    }
                    db3Var39.M.setVisibility(0);
                    db3 db3Var40 = this.binding;
                    if (db3Var40 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var40 = null;
                    }
                    db3Var40.O.setText("Pending");
                    db3 db3Var41 = this.binding;
                    if (db3Var41 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var41 = null;
                    }
                    db3Var41.L.setVisibility(0);
                    db3 db3Var42 = this.binding;
                    if (db3Var42 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var42 = null;
                    }
                    db3Var42.N.setVisibility(8);
                    db3 db3Var43 = this.binding;
                    if (db3Var43 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var43 = null;
                    }
                    db3Var43.n.setBackgroundDrawable(getDrawable(R.drawable.circle_white_gray));
                    db3 db3Var44 = this.binding;
                    if (db3Var44 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var44 = null;
                    }
                    db3Var44.n.setTextColor(getColor(R.color.white_grey));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.applNo.length() > 0) {
            db3 db3Var45 = this.binding;
            if (db3Var45 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                db3Var45 = null;
            }
            db3Var45.e.setText(this.applNo);
        }
        if (this.ownerName.length() > 0) {
            db3 db3Var46 = this.binding;
            if (db3Var46 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                db3Var46 = null;
            }
            db3Var46.h.setText(this.ownerName);
        }
        if (this.stateCd.length() > 0) {
            for (Object obj : this.stateList.keySet()) {
                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                String str = (String) obj;
                String str2 = (String) this.stateList.get(str);
                if (Intrinsics.areEqual(str, this.stateCd)) {
                    db3 db3Var47 = this.binding;
                    if (db3Var47 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        db3Var2 = db3Var47;
                    }
                    db3Var2.Q.setText(str2);
                    return;
                }
                db3 db3Var48 = this.binding;
                if (db3Var48 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    db3Var48 = null;
                }
                db3Var48.Q.setText(this.stateCd);
            }
        }
    }

    public static final void M1(VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void N1(VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void O1(final VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        db3 db3Var = this$0.binding;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        db3Var.x.setVisibility(8);
        final Dialog dialog = new Dialog(this$0.mContext, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setContentView(R.layout.layout_download_documents);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.id_statusDocumentCancel);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanApplTranByRcStatus.P1(dialog, this$0, view2);
            }
        });
        dialog.show();
    }

    public static final void P1(Dialog d2, VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        db3 db3Var = this$0.binding;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        db3Var.x.setVisibility(0);
    }

    public static final void Q1(VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().show();
        this$0.J1().w(this$0, this$0.applNo);
    }

    public static final void R1(VahanApplTranByRcStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.isdocuploadpending) {
                return;
            }
            this$0.B1().show();
            this$0.w1(this$0.applNo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void S1(VahanApplTranByRcStatus this$0, RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        if (requireDataForBePaymet != null) {
            this$0.b2(requireDataForBePaymet);
            if (StringsKt__StringsKt.contains$default((CharSequence) this$0.pur_code, (CharSequence) ".0", false, 2, (Object) null)) {
                String str = this$0.pur_code;
                String strSubstring = str.substring(0, str.length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                this$0.p_code = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            } else {
                this$0.p_code = StringsKt__StringsKt.trim((CharSequence) this$0.pur_code).toString();
            }
            this$0.K1().j(this$0, requireDataForBePaymet.getRegn_no(), requireDataForBePaymet.getState_cd(), this$0.p_code, "");
        }
    }

    public static final void T1(VahanApplTranByRcStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.X1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ov6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.W1(dialog, view);
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
    public static final void k2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.nrvDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nrvDetails");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getP_code() {
        return this.p_code;
    }

    public final RequireDataForBePaymet D1() {
        RequireDataForBePaymet requireDataForBePaymet = this.reqBeforPayment;
        if (requireDataForBePaymet != null) {
            return requireDataForBePaymet;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reqBeforPayment");
        return null;
    }

    public final VahanProService E1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanServiceConnection F1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService1;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService1");
        return null;
    }

    public final VahanProService G1() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 H1() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final String I1() {
        String str = this.status;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("status");
        return null;
    }

    public final ld7 J1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final al7 K1() {
        al7 al7Var = this.viewModel1;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.current_status = str;
    }

    public final void Z1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    public final void a2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void b2(RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(requireDataForBePaymet, "<set-?>");
        this.reqBeforPayment = requireDataForBePaymet;
    }

    public final void c2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void d2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService1 = vahanServiceConnection;
    }

    public final void e2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final void f2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void h2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void i2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel1 = al7Var;
    }

    public final void j2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.k2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, "Are you sure you want to leave?");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_aplication_transaction_status);
        db3 db3VarC = db3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(db3VarC, "inflate(...)");
        this.binding = db3VarC;
        VahanProService.Companion companion = VahanProService.INSTANCE;
        e2(companion.a(this));
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        f2((ld7) new z(this, new kd7(new jd7(G1()))).a(ld7.class));
        a2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        c2(companion.a(this));
        d2(VahanServiceConnection.INSTANCE.a(this));
        i2((al7) new z(this, new bl7(new bg7(F1()))).a(al7.class));
        h2((ld7) new z(this, new kd7(new jd7(E1()))).a(ld7.class));
        db3 db3Var = this.binding;
        db3 db3Var2 = null;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        setContentView(db3Var.b());
        if (getIntent() != null) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("list");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ApplicationStatusModel.Applnolist");
                Applnolist applnolist = (Applnolist) serializableExtra;
                if (!gd1.a.m(applnolist.getAppl_no())) {
                    this.applNo = applnolist.getAppl_no();
                    String regno = applnolist.getRegno();
                    this.registratioNo = regno;
                    String strSubstring = regno.substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    this.stateCd = strSubstring;
                    this.p_code = String.valueOf(applnolist.getPurCd());
                    this.pur_code = String.valueOf(applnolist.getPurCd());
                    db3 db3Var3 = this.binding;
                    if (db3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var3 = null;
                    }
                    db3Var3.h.setText("--");
                    db3 db3Var4 = this.binding;
                    if (db3Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var4 = null;
                    }
                    db3Var4.e.setText(this.applNo);
                    db3 db3Var5 = this.binding;
                    if (db3Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var5 = null;
                    }
                    db3Var5.d.setText(applnolist.getAppl_dt());
                    db3 db3Var6 = this.binding;
                    if (db3Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var6 = null;
                    }
                    db3Var6.G.setText(applnolist.getRegno());
                    db3 db3Var7 = this.binding;
                    if (db3Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var7 = null;
                    }
                    db3Var7.b.setText(applnolist.getOffName());
                    this.facelesstransaction = applnolist.getFacelesstransaction();
                    this.isdocuploadpending = applnolist.getIsdocuploadpending();
                    this.isrtorejection = applnolist.getIsrtorejection();
                    Y1(applnolist.getStatusDesc());
                    this.appointmentpending = applnolist.getAppointmentpending();
                    db3 db3Var8 = this.binding;
                    if (db3Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var8 = null;
                    }
                    db3Var8.c.setText(y1());
                    db3 db3Var9 = this.binding;
                    if (db3Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        db3Var9 = null;
                    }
                    db3Var9.l.setText(applnolist.getPurCdDescr());
                }
            } catch (Exception unused) {
            }
        }
        x1();
        L1();
        db3 db3Var10 = this.binding;
        if (db3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var10 = null;
        }
        db3Var10.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.O1(this.a, view);
            }
        });
        db3 db3Var11 = this.binding;
        if (db3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var11 = null;
        }
        db3Var11.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.Q1(this.a, view);
            }
        });
        db3 db3Var12 = this.binding;
        if (db3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            db3Var2 = db3Var12;
        }
        db3Var2.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplTranByRcStatus.R1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        J1().Y().g(this, new mf4() { // from class: com.zepto.kv6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplTranByRcStatus.S1(this.a, (RequireDataForBePaymet) obj);
            }
        });
        J1().b0().g(this, new mf4() { // from class: com.zepto.lv6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplTranByRcStatus.T1(this.a, (String) obj);
            }
        });
        K1().l().g(this, new e(new a()));
        K1().k().g(this, new e(new b()));
        H1().Y0().g(this, new e(new c()));
        H1().X0().g(this, new e(new d()));
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final void w1(String appl_no) {
        try {
            H1().m(this, appl_no);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void x1() {
        this.stateList.put("AN", "Andaman and Nicobar Islands");
        this.stateList.put("AP", "Andhra Pradesh");
        this.stateList.put("AR", "Arunachal Pradesh");
        this.stateList.put("AS", "Assam");
        this.stateList.put("BR", "Bihar");
        this.stateList.put("CG", "Chhattisgarh");
        this.stateList.put("CH", "Chandigarh");
        this.stateList.put("DH", "Dadra and Nagar Haveli");
        this.stateList.put("DD", "Daman and Diu");
        this.stateList.put("DL", "Delhi");
        this.stateList.put("GA", "Goa");
        this.stateList.put("GJ", "Gujarat");
        this.stateList.put("HR", "Haryana");
        this.stateList.put("HP", "Himachal Pradesh");
        this.stateList.put("JK", "Jammu and Kashmir");
        this.stateList.put("JH", "Jharkhand");
        this.stateList.put("KA", "Karnataka");
        this.stateList.put("KL", "Kerala");
        this.stateList.put("LD", "Lakshadweep");
        this.stateList.put("MP", "Madhya Pradesh");
        this.stateList.put("MH", "Maharashtra");
        this.stateList.put("MN", "Manipur");
        this.stateList.put("ML", "Meghalaya");
        this.stateList.put("MZ", "Mizoram");
        this.stateList.put("NL", "Nagaland");
        this.stateList.put("OR", "Odisha");
        this.stateList.put("PY", "Puducherry");
        this.stateList.put("PB", "Punjab");
        this.stateList.put("RJ", "Rajasthan");
        this.stateList.put("SK", "Sikkim");
        this.stateList.put("TN", "Tamil Nadu");
        this.stateList.put("TS", "Telangana");
        this.stateList.put("TR", "Tripura");
        this.stateList.put("UK", "Uttarakhand");
        this.stateList.put("UP", "Uttar Pradesh");
        this.stateList.put("WB", "West Bengal");
    }

    public final String y1() {
        String str = this.current_status;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("current_status");
        return null;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final boolean getFacelesstransaction() {
        return this.facelesstransaction;
    }
}
