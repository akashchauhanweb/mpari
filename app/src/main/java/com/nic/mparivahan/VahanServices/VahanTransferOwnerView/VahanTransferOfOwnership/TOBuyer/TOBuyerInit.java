package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToAadharVerification;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.DataX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.VahanOVForBuyer;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit;
import com.zepto.e03;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.oa6;
import com.zepto.of;
import com.zepto.og;
import com.zepto.pa6;
import com.zepto.pq;
import com.zepto.qa6;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u00101\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\"\u0010X\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010)\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010)\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR$\u0010`\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010)\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR>\u0010i\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0aj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010)\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR\"\u0010q\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010)\u001a\u0004\bo\u0010U\"\u0004\bp\u0010WR$\u0010y\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010}\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010)\u001a\u0004\b{\u0010U\"\u0004\b|\u0010WR$\u0010\u0081\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010)\u001a\u0004\b\u007f\u0010U\"\u0005\b\u0080\u0001\u0010WR&\u0010\u0085\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010)\u001a\u0005\b\u0083\u0001\u0010U\"\u0005\b\u0084\u0001\u0010WR)\u0010\u0088\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u008e\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010)\u001a\u0005\b\u008c\u0001\u0010U\"\u0005\b\u008d\u0001\u0010WR&\u0010\u0092\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010)\u001a\u0005\b\u0090\u0001\u0010U\"\u0005\b\u0091\u0001\u0010WR,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R.\u0010¢\u0001\u001a\u0014\u0012\u000f\u0012\r \u009d\u0001*\u0005\u0018\u00010\u009c\u00010\u009c\u00010\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R.\u0010¥\u0001\u001a\u0014\u0012\u000f\u0012\r \u009d\u0001*\u0005\u0018\u00010\u009c\u00010\u009c\u00010\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009f\u0001\u001a\u0006\b¤\u0001\u0010¡\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerInit;", "Lcom/zepto/pq;", "", "N1", "", "r2", "Y1", "Landroid/content/Context;", "context", "", "it", "o2", "applNo", "isRC", "y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "title", "v1", "Lcom/zepto/og;", "C", "Lcom/zepto/og;", "binding", "Lcom/zepto/pa6;", "D", "Lcom/zepto/pa6;", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "I1", "()Landroid/app/ProgressDialog;", "h2", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "digit", "H", "ownerName", "I", "tabSelected", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "d2", "(Lcom/zepto/wa3;)V", "languageSession", "Lcom/zepto/ld7;", "K", "Lcom/zepto/ld7;", "M1", "()Lcom/zepto/ld7;", "m2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "l2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "f2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "N", "F1", "c2", "langSession", "O", "getRc_number", "()Ljava/lang/String;", "i2", "(Ljava/lang/String;)V", "rc_number", "P", "getMobile_number", "e2", "mobile_number", "Q", "getOff_code", "g2", "off_code", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "R", "Ljava/util/HashMap;", "getServiceSelectionHashMap", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "S", "B1", "Z1", "application_no", "T", "C1", "a2", "authmode", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "U", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "K1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "k2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;)V", "ToBuyerObject", "V", "getVehicle_number", "n2", "vehicle_number", "W", "J1", "j2", "stateCd", "X", "D1", "b2", "chassiLastDig", "Y", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "A1", "setAadhar_name", "aadhar_name", "a0", "z1", "setAadhar_address", "aadhar_address", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "b0", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "E1", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "c0", "Lcom/zepto/of;", "getMessageLauncher", "()Lcom/zepto/of;", "messageLauncher", "d0", "getLauncherAadhaar", "launcherAadhaar", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTOBuyerInit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TOBuyerInit.kt\ncom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerInit\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,517:1\n260#2:518\n260#2:519\n260#2:520\n260#2:521\n*S KotlinDebug\n*F\n+ 1 TOBuyerInit.kt\ncom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerInit\n*L\n389#1:518\n395#1:519\n417#1:520\n431#1:521\n*E\n"})
public final class TOBuyerInit extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public og binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public pa6 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOBuyerApplicationService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public NrvDetails nrvDetails;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TOFetchApplicationDetails ToBuyerObject;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final of messageLauncher;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final of launcherAadhaar;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String tabSelected = "ApplicationNo";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rc_number = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String mobile_number = "NA";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String application_no = " ";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String authmode = "M";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String vehicle_number = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String chassiLastDig = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String aadhar_name = "NA";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_address = "NA";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(TOFetchApplicationDetails tOFetchApplicationDetails) {
            TransferOwnershipDto transferOwnershipDto;
            TransferOwnershipDto transferOwnershipDto2;
            TransferOwnershipDto transferOwnershipDto3;
            ApiMessageX apiMessage = tOFetchApplicationDetails.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                if (TOBuyerInit.this.I1().isShowing()) {
                    TOBuyerInit.this.I1().dismiss();
                }
                TOBuyerInit tOBuyerInit = TOBuyerInit.this;
                ApiMessageX apiMessage2 = tOFetchApplicationDetails.getApiMessage();
                tOBuyerInit.o2(tOBuyerInit, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            TOBuyerInit.this.k2(tOFetchApplicationDetails);
            ws6 ws6Var = new ws6(TOBuyerInit.this);
            TOBuyerInit tOBuyerInit2 = TOBuyerInit.this;
            DataX data = tOFetchApplicationDetails.getData();
            tOBuyerInit2.Z1(String.valueOf(data != null ? data.getApplNo() : null));
            TOBuyerInit tOBuyerInit3 = TOBuyerInit.this;
            DataX data2 = tOFetchApplicationDetails.getData();
            tOBuyerInit3.g2(String.valueOf(data2 != null ? Integer.valueOf(data2.getOfficeCode()) : null));
            DataX data3 = tOFetchApplicationDetails.getData();
            String strValueOf = String.valueOf(data3 != null ? data3.getChassisNo() : null);
            TOBuyerInit tOBuyerInit4 = TOBuyerInit.this;
            String strSubstring = strValueOf.substring(strValueOf.length() - 5, strValueOf.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            tOBuyerInit4.b2(strSubstring);
            gd1.a aVar = gd1.a;
            DataX data4 = tOFetchApplicationDetails.getData();
            if (aVar.m(String.valueOf((data4 == null || (transferOwnershipDto3 = data4.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto3.getMobileNo()))) {
                TOBuyerInit.this.e2(ws6Var.l());
            } else {
                TOBuyerInit tOBuyerInit5 = TOBuyerInit.this;
                DataX data5 = tOFetchApplicationDetails.getData();
                tOBuyerInit5.e2(String.valueOf((data5 == null || (transferOwnershipDto = data5.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto.getMobileNo()));
            }
            TOBuyerInit tOBuyerInit6 = TOBuyerInit.this;
            DataX data6 = tOFetchApplicationDetails.getData();
            tOBuyerInit6.i2(String.valueOf(data6 != null ? data6.getRegnNo() : null));
            TOBuyerInit tOBuyerInit7 = TOBuyerInit.this;
            DataX data7 = tOFetchApplicationDetails.getData();
            tOBuyerInit7.a2(String.valueOf((data7 == null || (transferOwnershipDto2 = data7.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto2.getAuthMode()));
            TOBuyerInit tOBuyerInit8 = TOBuyerInit.this;
            DataX data8 = tOFetchApplicationDetails.getData();
            tOBuyerInit8.n2(String.valueOf(data8 != null ? data8.getRegnNo() : null));
            TOBuyerInit tOBuyerInit9 = TOBuyerInit.this;
            DataX data9 = tOFetchApplicationDetails.getData();
            tOBuyerInit9.j2(String.valueOf(data9 != null ? data9.getStateCode() : null));
            ld7 ld7VarM1 = TOBuyerInit.this.M1();
            TOBuyerInit tOBuyerInit10 = TOBuyerInit.this;
            ld7VarM1.p1(tOBuyerInit10, tOBuyerInit10.getStateCd().toString());
            ld7 ld7VarM12 = TOBuyerInit.this.M1();
            TOBuyerInit tOBuyerInit11 = TOBuyerInit.this;
            ld7VarM12.i(tOBuyerInit11, tOBuyerInit11.getStateCd().toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TOFetchApplicationDetails) obj);
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
            if (TOBuyerInit.this.I1().isShowing()) {
                TOBuyerInit.this.I1().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                return;
            }
            TOBuyerInit tOBuyerInit = TOBuyerInit.this;
            tOBuyerInit.o2(tOBuyerInit, str);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    TOBuyerInit.this.f2(VContant.INSTANCE.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : TOBuyerInit.this.getChassiLastDig(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                    Intent intent = new Intent(TOBuyerInit.this, (Class<?>) TOBuyerSelectionScreen.class);
                    intent.putExtra("RC", TOBuyerInit.this.H1().getRc_regn_no());
                    intent.putExtra("applNo", TOBuyerInit.this.getApplication_no());
                    intent.putExtra("Buyerdetails", TOBuyerInit.this.getToBuyerObject());
                    intent.putExtra("RcDetails", TOBuyerInit.this.H1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, TOBuyerInit.this.getAadhar_name());
                    intent.putExtra(VContant.NEXGEN_addahar_address, TOBuyerInit.this.getAadhar_address());
                    if (TOBuyerInit.this.getAuthmode().equals("A")) {
                        intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                        intent.putExtra("AadhaarDetails", TOBuyerInit.this.getGetAddharrdetails());
                    } else {
                        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                    }
                    TOBuyerInit.this.startActivity(intent);
                    TOBuyerInit.this.finish();
                    return;
                }
                TOBuyerInit.this.I1().dismiss();
                TOBuyerInit tOBuyerInit = TOBuyerInit.this;
                tOBuyerInit.v1(tOBuyerInit, "No details found");
            } catch (Exception e) {
                TOBuyerInit.this.I1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            TOBuyerInit.this.I1().dismiss();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(StateCostForDms stateCostForDms) {
            if (StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getBook_app(), new String[]{","}, false, 0, 6, (Object) null).contains(VContant.TRANFER_OF_OWNERSHIP)) {
                new vh7(TOBuyerInit.this).g(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateCostForDms) obj);
            return Unit.INSTANCE;
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

    public TOBuyerInit() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.ra6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TOBuyerInit.V1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.messageLauncher = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.va6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TOBuyerInit.U1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.launcherAadhaar = ofVarB02;
    }

    private final void N1() {
        TOBuyerApplicationService tOBuyerApplicationService = this.retrofitService;
        og ogVar = null;
        if (tOBuyerApplicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            tOBuyerApplicationService = null;
        }
        this.viewModel = (pa6) new z(this, new qa6(new oa6(tOBuyerApplicationService))).a(pa6.class);
        og ogVar2 = this.binding;
        if (ogVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar2 = null;
        }
        ogVar2.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ab6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.O1(this.a, view);
            }
        });
        og ogVar3 = this.binding;
        if (ogVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar3 = null;
        }
        ogVar3.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.P1(this.a, view);
            }
        });
        og ogVar4 = this.binding;
        if (ogVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar4 = null;
        }
        ogVar4.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                TOBuyerInit.Q1(this.a, view);
            }
        });
        og ogVar5 = this.binding;
        if (ogVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar5 = null;
        }
        ogVar5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.db6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.R1(this.a, view);
            }
        });
        og ogVar6 = this.binding;
        if (ogVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar6 = null;
        }
        ogVar6.n.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        og ogVar7 = this.binding;
        if (ogVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar7 = null;
        }
        ogVar7.n.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        og ogVar8 = this.binding;
        if (ogVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar8 = null;
        }
        ogVar8.m.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        og ogVar9 = this.binding;
        if (ogVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar9 = null;
        }
        ogVar9.m.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        og ogVar10 = this.binding;
        if (ogVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar10 = null;
        }
        ogVar10.l.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        og ogVar11 = this.binding;
        if (ogVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar11 = null;
        }
        ogVar11.l.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        og ogVar12 = this.binding;
        if (ogVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar12 = null;
        }
        ogVar12.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.S1(this.a, view);
            }
        });
        og ogVar13 = this.binding;
        if (ogVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ogVar = ogVar13;
        }
        ogVar.p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ta6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.T1(this.a, view);
            }
        });
    }

    public static final void O1(TOBuyerInit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1();
    }

    public static final void P1(TOBuyerInit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(TOBuyerInit this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.r2()) {
            og ogVar = null;
            if (Intrinsics.areEqual(this$0.tabSelected, "ApplicationNo")) {
                og ogVar2 = this$0.binding;
                if (ogVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ogVar = ogVar2;
                }
                this$0.y1(String.valueOf(ogVar.l.getText()), false);
                return;
            }
            og ogVar3 = this$0.binding;
            if (ogVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ogVar = ogVar3;
            }
            this$0.y1(String.valueOf(ogVar.l.getText()), true);
        }
    }

    public static final void R1(TOBuyerInit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void S1(TOBuyerInit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        og ogVar = this$0.binding;
        og ogVar2 = null;
        if (ogVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar = null;
        }
        if (ogVar.d.isSelected()) {
            og ogVar3 = this$0.binding;
            if (ogVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ogVar3 = null;
            }
            ogVar3.d.setChecked(false);
            og ogVar4 = this$0.binding;
            if (ogVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ogVar4 = null;
            }
            ogVar4.d.setSelected(false);
            og ogVar5 = this$0.binding;
            if (ogVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ogVar2 = ogVar5;
            }
            ogVar2.c.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        og ogVar6 = this$0.binding;
        if (ogVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar6 = null;
        }
        ogVar6.d.setChecked(true);
        og ogVar7 = this$0.binding;
        if (ogVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar7 = null;
        }
        ogVar7.d.setSelected(true);
        og ogVar8 = this$0.binding;
        if (ogVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar8 = null;
        }
        ogVar8.c.setBackgroundResource(R.drawable.corner_circle_14_selected);
        og ogVar9 = this$0.binding;
        if (ogVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar9 = null;
        }
        ogVar9.p.setChecked(false);
        og ogVar10 = this$0.binding;
        if (ogVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar10 = null;
        }
        ogVar10.p.setSelected(false);
        og ogVar11 = this$0.binding;
        if (ogVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar11 = null;
        }
        ogVar11.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
        og ogVar12 = this$0.binding;
        if (ogVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar12 = null;
        }
        ogVar12.l.setVisibility(0);
        og ogVar13 = this$0.binding;
        if (ogVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar13 = null;
        }
        ogVar13.b.setVisibility(0);
        og ogVar14 = this$0.binding;
        if (ogVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar14 = null;
        }
        ogVar14.j.setVisibility(8);
        og ogVar15 = this$0.binding;
        if (ogVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar15 = null;
        }
        ogVar15.n.setVisibility(8);
        og ogVar16 = this$0.binding;
        if (ogVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar16 = null;
        }
        ogVar16.f.setVisibility(8);
        og ogVar17 = this$0.binding;
        if (ogVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ogVar2 = ogVar17;
        }
        ogVar2.m.setVisibility(8);
        this$0.tabSelected = "ApplicationNo";
    }

    public static final void T1(TOBuyerInit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        og ogVar = this$0.binding;
        og ogVar2 = null;
        if (ogVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar = null;
        }
        if (ogVar.p.isSelected()) {
            og ogVar3 = this$0.binding;
            if (ogVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ogVar3 = null;
            }
            ogVar3.p.setChecked(false);
            og ogVar4 = this$0.binding;
            if (ogVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ogVar4 = null;
            }
            ogVar4.p.setSelected(false);
            og ogVar5 = this$0.binding;
            if (ogVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ogVar2 = ogVar5;
            }
            ogVar2.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        og ogVar6 = this$0.binding;
        if (ogVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar6 = null;
        }
        ogVar6.d.setChecked(false);
        og ogVar7 = this$0.binding;
        if (ogVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar7 = null;
        }
        ogVar7.d.setSelected(false);
        og ogVar8 = this$0.binding;
        if (ogVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar8 = null;
        }
        ogVar8.c.setBackgroundResource(R.drawable.corner_circle_bg_14);
        og ogVar9 = this$0.binding;
        if (ogVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar9 = null;
        }
        ogVar9.p.setChecked(true);
        og ogVar10 = this$0.binding;
        if (ogVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar10 = null;
        }
        ogVar10.p.setSelected(true);
        og ogVar11 = this$0.binding;
        if (ogVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar11 = null;
        }
        ogVar11.o.setBackgroundResource(R.drawable.corner_circle_14_selected);
        og ogVar12 = this$0.binding;
        if (ogVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar12 = null;
        }
        ogVar12.l.setVisibility(8);
        og ogVar13 = this$0.binding;
        if (ogVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar13 = null;
        }
        ogVar13.b.setVisibility(8);
        og ogVar14 = this$0.binding;
        if (ogVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar14 = null;
        }
        ogVar14.j.setVisibility(0);
        og ogVar15 = this$0.binding;
        if (ogVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar15 = null;
        }
        ogVar15.n.setVisibility(0);
        og ogVar16 = this$0.binding;
        if (ogVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar16 = null;
        }
        ogVar16.f.setVisibility(0);
        og ogVar17 = this$0.binding;
        if (ogVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ogVar2 = ogVar17;
        }
        ogVar2.m.setVisibility(0);
        this$0.tabSelected = "Vehicle";
    }

    public static final void U1(TOBuyerInit this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            this$0.I1().show();
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.authmode = String.valueOf(intentC.getStringExtra(VContant.AUTHMODE));
            this$0.isFaceless = intentC.getBooleanExtra(VContant.NEXGEN_isFACELESS, true);
            this$0.aadhar_name = String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_name));
            this$0.aadhar_address = String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_address));
            this$0.getAddharrdetails = (DoAadhaarResponse) intentC.getSerializableExtra("AadhaarDetails");
            this$0.M1().F0(this$0, this$0.vehicle_number.toString(), this$0.stateCd.toString(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, this$0.chassiLastDig);
        }
    }

    public static final void V1(TOBuyerInit this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            this$0.M1().F0(this$0, this$0.vehicle_number.toString(), this$0.stateCd.toString(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, this$0.chassiLastDig);
        }
    }

    public static final void W1(TOBuyerInit this$0, vahanOnlineCheck vahanonlinecheck) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.I1().dismiss();
            if (this$0.authmode.equals("A")) {
                Intent intent = new Intent(this$0, (Class<?>) ToAadharVerification.class);
                e03.a aVar = e03.a;
                String str = this$0.rc_number;
                HashMap map = this$0.serviceSelectionHashMap;
                String str2 = this$0.off_code;
                Intrinsics.checkNotNull(str2);
                intent.putExtra(VContant.AAHARAUTH, aVar.a(str, map, str2, this$0.stateCd, this$0.chassiLastDig, VContant.MAINSCREEN, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE));
                of ofVar = this$0.launcherAadhaar;
                Intrinsics.checkNotNull(ofVar);
                ofVar.a(intent);
            } else {
                Intent intent2 = new Intent(this$0, (Class<?>) VahanOVForBuyer.class);
                e03.a aVar2 = e03.a;
                String str3 = this$0.rc_number;
                String str4 = this$0.off_code;
                Intrinsics.checkNotNull(str4);
                intent2.putExtra(VContant.MOBAUTH, aVar2.b(str3, str4, this$0.stateCd, this$0.chassiLastDig, VContant.MAINSCREEN, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, this$0.mobile_number));
                of ofVar2 = this$0.messageLauncher;
                Intrinsics.checkNotNull(ofVar2);
                ofVar2.a(intent2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void X1(TOBuyerInit this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1().dismiss();
        VContant.INSTANCE.N(this$0, this$0.F1().b("record_error_msg", this$0.getString(R.string.service_unavable_please_try)));
    }

    private final void Y1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
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
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ya6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.p2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.za6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.q2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void p2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean r2() {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit.r2():boolean");
    }

    public static final void w1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final String getAadhar_name() {
        return this.aadhar_name;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final String getApplication_no() {
        return this.application_no;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getAuthmode() {
        return this.authmode;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final String getChassiLastDig() {
        return this.chassiLastDig;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final DoAadhaarResponse getGetAddharrdetails() {
        return this.getAddharrdetails;
    }

    public final wa3 F1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final wa3 G1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final NrvDetails H1() {
        NrvDetails nrvDetails = this.nrvDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nrvDetails");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final TOFetchApplicationDetails getToBuyerObject() {
        return this.ToBuyerObject;
    }

    public final VahanProService L1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final ld7 M1() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application_no = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authmode = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassiLastDig = str;
    }

    public final void c2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void d2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void f2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    public final void g2(String str) {
        this.off_code = str;
    }

    public final void h2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final void k2(TOFetchApplicationDetails tOFetchApplicationDetails) {
        this.ToBuyerObject = tOFetchApplicationDetails;
    }

    public final void l2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void m2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vehicle_number = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        og ogVarC = og.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ogVarC, "inflate(...)");
        this.binding = ogVarC;
        pa6 pa6Var = null;
        if (ogVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVarC = null;
        }
        setContentView(ogVarC.b());
        getWindow().addFlags(128);
        d2(new wa3(this));
        this.retrofitService = TOBuyerApplicationService.INSTANCE.a(this);
        l2(VahanProService.INSTANCE.a(this));
        m2((ld7) new z(this, new kd7(new jd7(L1()))).a(ld7.class));
        h2(new ProgressDialog(this));
        I1().setMessage(G1().b("label_challan_please_wait", "Please wait..."));
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        og ogVar = this.binding;
        if (ogVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar = null;
        }
        ogVar.e.i.setText(String.valueOf(G1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        c2(new wa3(this));
        this.serviceSelectionHashMap.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        N1();
        pa6 pa6Var2 = this.viewModel;
        if (pa6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            pa6Var2 = null;
        }
        pa6Var2.h().g(this, new f(new a()));
        pa6 pa6Var3 = this.viewModel;
        if (pa6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            pa6Var = pa6Var3;
        }
        pa6Var.i().g(this, new f(new b()));
        M1().I0().g(this, new f(new c()));
        M1().H0().g(this, new f(new d()));
        M1().l0().g(this, new f(new e()));
        M1().c1().g(this, new mf4() { // from class: com.zepto.wa6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                TOBuyerInit.W1(this.a, (vahanOnlineCheck) obj);
            }
        });
        M1().d1().g(this, new mf4() { // from class: com.zepto.xa6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                TOBuyerInit.X1(this.a, (String) obj);
            }
        });
    }

    public final void v1(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(new wa3(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ua6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerInit.w1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void y1(String applNo, boolean isRC) throws JSONException {
        pa6 pa6Var = null;
        og ogVar = null;
        if (!isRC) {
            I1().show();
            pa6 pa6Var2 = this.viewModel;
            if (pa6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                pa6Var = pa6Var2;
            }
            pa6Var.g(applNo, false, "", "");
            return;
        }
        I1().show();
        pa6 pa6Var3 = this.viewModel;
        if (pa6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            pa6Var3 = null;
        }
        og ogVar2 = this.binding;
        if (ogVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ogVar2 = null;
        }
        String strValueOf = String.valueOf(ogVar2.n.getText());
        og ogVar3 = this.binding;
        if (ogVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ogVar = ogVar3;
        }
        pa6Var3.g(applNo, true, strValueOf, String.valueOf(ogVar.m.getText()));
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getAadhar_address() {
        return this.aadhar_address;
    }
}
