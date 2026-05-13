package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.HypothecationTerminationViewDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.IssueOfDuplicateDetailView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.DataX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.az5;
import com.zepto.k87;
import com.zepto.my3;
import com.zepto.pq;
import com.zepto.rx3;
import com.zepto.sx3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010A\u001a\n :*\u0004\u0018\u000109098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\"\u0010I\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010\u001b\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010\u001fR\"\u0010M\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010\u001b\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001fR\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010\u001b\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR\"\u0010U\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001b\u001a\u0004\bS\u0010\u001d\"\u0004\bT\u0010\u001fR\"\u0010X\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR'\u0010{\u001a\u0012\u0012\u0004\u0012\u00020u0tj\b\u0012\u0004\u0012\u00020u`v8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010\u001b\u001a\u0004\b}\u0010\u001d\"\u0004\b~\u0010\u001fR(\u0010\u0085\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0080\u0001\u0010F\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0018\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerSelectionScreen;", "Lcom/zepto/pq;", "Lcom/zepto/rx3;", "", "H1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "p1", "J0", "B1", "purposeCode", "position", "U", "d0", "C", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/my3;", "E", "Lcom/zepto/my3;", "u1", "()Lcom/zepto/my3;", "K1", "(Lcom/zepto/my3;)V", "binding", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "getState_code", "setState_code", "state_code", "I", "getOff_code", "M1", "off_code", "J", "t1", "J1", "aadhar_name", "K", "s1", "I1", "aadhar_address", "L", "getApplNo", "setApplNo", "applNo", "M", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "L1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModel", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "P", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "retrofitService", "Ljava/util/ArrayList;", "Lcom/zepto/az5;", "Lkotlin/collections/ArrayList;", "Q", "Ljava/util/ArrayList;", "getServiceListArray", "()Ljava/util/ArrayList;", "serviceListArray", "R", "getCurrentPurCode", "setCurrentPurCode", "currentPurCode", "S", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "CurrentPosition", "Lcom/zepto/k87;", "T", "Lcom/zepto/k87;", "A1", "()Lcom/zepto/k87;", "R1", "(Lcom/zepto/k87;)V", "selectionAdapter", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "getToBuyerObject", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "setToBuyerObject", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;)V", "ToBuyerObject", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "V", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TOBuyerSelectionScreen extends pq implements rx3 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public my3 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public MultiService retrofitService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int CurrentPosition;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public k87 selectionAdapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TOFetchApplicationDetails ToBuyerObject;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final ArrayList serviceListArray = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String currentPurCode = "0";

    public static final void C1(TOBuyerSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
    }

    public static final void D1(TOBuyerSelectionScreen this$0, View view) {
        String str;
        DataX data;
        DataX data2;
        DataX data3;
        DataX data4;
        DataX data5;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            int size = this$0.serviceListArray.size();
            for (int i = 0; i < size; i++) {
                if (((az5) this$0.serviceListArray.get(i)).b() && (VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE.equals(String.valueOf(((az5) this$0.serviceListArray.get(i)).a())) || VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE.equals(String.valueOf(((az5) this$0.serviceListArray.get(i)).a())) || ("3".equals(String.valueOf(((az5) this$0.serviceListArray.get(i)).a())) && ((az5) this$0.serviceListArray.get(i)).c()))) {
                    arrayList.add(String.valueOf(((az5) this$0.serviceListArray.get(i)).a()));
                }
            }
            if (arrayList.size() > 0) {
                TOFetchApplicationDetails tOFetchApplicationDetails = this$0.ToBuyerObject;
                String str2 = this$0.applNo;
                String authMode = (tOFetchApplicationDetails == null || (data5 = tOFetchApplicationDetails.getData()) == null) ? null : data5.getAuthMode();
                Durcdto durcdto = (tOFetchApplicationDetails == null || (data4 = tOFetchApplicationDetails.getData()) == null) ? null : data4.getDurcdto();
                HptDto hptDto = (tOFetchApplicationDetails == null || (data3 = tOFetchApplicationDetails.getData()) == null) ? null : data3.getHptDto();
                String rc_off_cd = this$0.y1().getRc_off_cd();
                Intrinsics.checkNotNull(rc_off_cd);
                int i2 = Integer.parseInt(rc_off_cd);
                ArrayList<Integer> purposeCode = (tOFetchApplicationDetails == null || (data2 = tOFetchApplicationDetails.getData()) == null) ? null : data2.getPurposeCode();
                Intrinsics.checkNotNull(purposeCode);
                MultiServiceDraftTO multiServiceDraftTO = new MultiServiceDraftTO(str2, authMode, null, "", null, durcdto, null, hptDto, i2, null, purposeCode, this$0.x1(), this$0.y1().getState_cd(), "B", (tOFetchApplicationDetails == null || (data = tOFetchApplicationDetails.getData()) == null) ? null : data.getTransferOwnershipDto(), null);
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Log.e("TestDrive--> ", companion.s((String) obj, "B"));
                if (multiServiceDraftTO.getPurposeCode().contains(Integer.valueOf(Integer.parseInt("3")))) {
                    str = VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
                } else {
                    ArrayList<Integer> purposeCode2 = multiServiceDraftTO.getPurposeCode();
                    int i3 = Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                    str = VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
                    if (!purposeCode2.contains(Integer.valueOf(i3))) {
                        Intent intent = new Intent();
                        StringBuilder sb = new StringBuilder();
                        sb.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.");
                        Object obj2 = arrayList.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        sb.append(companion.s((String) obj2, "B"));
                        intent.setClass(this$0, Class.forName(sb.toString()));
                        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO);
                        intent.putExtra("AadhaarDetails", this$0.getAddharrdetails);
                        intent.putExtra("RC", this$0.y1().getRc_regn_no());
                        intent.putExtra("RcDetails", this$0.y1());
                        intent.putExtra("off_code", this$0.y1().getRc_off_cd());
                        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
                        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
                        this$0.startActivity(intent);
                        return;
                    }
                }
                if (multiServiceDraftTO.getPurposeCode().contains(Integer.valueOf(Integer.parseInt("3")))) {
                    Intent intent2 = new Intent(this$0, (Class<?>) IssueOfDuplicateDetailView.class);
                    intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                    intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO);
                    intent2.putExtra("AadhaarDetails", this$0.getAddharrdetails);
                    intent2.putExtra("RC", this$0.y1().getRc_regn_no());
                    intent2.putExtra("RcDetails", this$0.y1());
                    intent2.putExtra("off_code", this$0.y1().getRc_off_cd());
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                    intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
                    intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
                    this$0.startActivity(intent2);
                    return;
                }
                if (multiServiceDraftTO.getPurposeCode().contains(Integer.valueOf(Integer.parseInt(str)))) {
                    Intent intent3 = new Intent(this$0, (Class<?>) HypothecationTerminationViewDetails.class);
                    intent3.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                    intent3.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO);
                    intent3.putExtra("AadhaarDetails", this$0.getAddharrdetails);
                    intent3.putExtra("RC", this$0.y1().getRc_regn_no());
                    intent3.putExtra("RcDetails", this$0.y1());
                    intent3.putExtra("off_code", this$0.y1().getRc_off_cd());
                    intent3.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                    intent3.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
                    intent3.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
                    this$0.startActivity(intent3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void E1(TOBuyerSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.serviceListArray.clear();
        this$0.B1();
        this$0.A1().j();
    }

    public static final void F1(TOBuyerSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p1(this$0, this$0.v1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void G1(TOBuyerSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void q1(Dialog d, TOBuyerSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final k87 A1() {
        k87 k87Var = this.selectionAdapter;
        if (k87Var != null) {
            return k87Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectionAdapter");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B1() {
        /*
            r12 = this;
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails r0 = r12.ToBuyerObject
            java.lang.String r1 = "3"
            java.lang.String r2 = "5"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L81
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "PList"
            android.util.Log.e(r5, r0)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails r0 = r12.ToBuyerObject
            r5 = 0
            if (r0 == 0) goto L23
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.DataX r0 = r0.getData()
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = r0.getPurposeCode()
            goto L24
        L23:
            r0 = r5
        L24:
            if (r0 == 0) goto L2a
            kotlin.ranges.IntRange r5 = kotlin.collections.CollectionsKt.getIndices(r0)
        L2a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r6 = r5.getFirst()
            int r5 = r5.getLast()
            if (r6 > r5) goto L81
            r7 = r4
        L38:
            java.lang.Object r8 = r0.get(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L7a
            java.util.ArrayList r8 = r12.serviceListArray
            com.zepto.az5 r9 = new com.zepto.az5
            java.lang.Object r10 = r0.get(r6)
            java.lang.String r11 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r9.<init>(r10, r3, r4)
            r8.add(r9)
            java.lang.Object r8 = r0.get(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L7a
            r7 = r3
        L7a:
            if (r6 == r5) goto L7f
            int r6 = r6 + 1
            goto L38
        L7f:
            if (r7 != 0) goto L8f
        L81:
            java.util.ArrayList r0 = r12.serviceListArray
            com.zepto.az5 r5 = new com.zepto.az5
            int r1 = java.lang.Integer.parseInt(r1)
            r5.<init>(r1, r4, r3)
            r0.add(r5)
        L8f:
            java.util.ArrayList r0 = r12.serviceListArray
            com.zepto.az5 r1 = new com.zepto.az5
            java.lang.String r5 = "6"
            int r5 = java.lang.Integer.parseInt(r5)
            r1.<init>(r5, r4, r3)
            r0.add(r1)
            java.util.ArrayList r0 = r12.serviceListArray
            com.zepto.az5 r1 = new com.zepto.az5
            int r2 = java.lang.Integer.parseInt(r2)
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerSelectionScreen.B1():void");
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J0() {
        B1();
        R1(new k87(this.serviceListArray, this, this));
        u1().g.setAdapter(A1());
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(my3 my3Var) {
        Intrinsics.checkNotNullParameter(my3Var, "<set-?>");
        this.binding = my3Var;
    }

    public final void L1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Q1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.retrofitService = multiService;
    }

    public final void R1(k87 k87Var) {
        Intrinsics.checkNotNullParameter(k87Var, "<set-?>");
        this.selectionAdapter = k87Var;
    }

    public final void S1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModel = multiSelectionViewModel;
    }

    @Override // com.zepto.rx3
    public void U(String purposeCode, int position) {
        Intrinsics.checkNotNull(purposeCode);
        this.currentPurCode = purposeCode;
        this.CurrentPosition = position;
        ArrayList arrayList = new ArrayList();
        if (this.serviceListArray.size() > 0) {
            int size = this.serviceListArray.size();
            for (int i = 0; i < size; i++) {
                if (((az5) this.serviceListArray.get(i)).b()) {
                    arrayList.add(String.valueOf(((az5) this.serviceListArray.get(i)).a()));
                }
            }
            if (arrayList.size() == 0) {
                arrayList.add(this.currentPurCode);
            }
            arrayList.add(this.currentPurCode);
            HashSet hashSet = new HashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(hashSet);
        } else {
            arrayList.add(this.currentPurCode);
        }
        int iIndexOf = this.serviceListArray.indexOf(new az5(Integer.parseInt(this.currentPurCode), false, true));
        az5 az5Var = new az5(Integer.parseInt(this.currentPurCode), true, true);
        this.serviceListArray.remove(iIndexOf);
        this.serviceListArray.add(iIndexOf, az5Var);
        A1().j();
    }

    @Override // com.zepto.rx3
    public void d0(String purposeCode, int position) {
        Intrinsics.checkNotNull(purposeCode);
        this.serviceListArray.set(this.serviceListArray.indexOf(new az5(Integer.parseInt(purposeCode), true, true)), new az5(Integer.parseInt(purposeCode), false, true));
        A1().j();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        p1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiservicelayout);
        my3 my3VarC = my3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(my3VarC, "inflate(...)");
        K1(my3VarC);
        setContentView(u1().b());
        getWindow().addFlags(128);
        L1(new wa3(this));
        Q1(MultiService.INSTANCE.a(this));
        S1((MultiSelectionViewModel) new z(this, new y67(new sx3(z1()))).a(MultiSelectionViewModel.class));
        N1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        this.applNo = String.valueOf(getIntent().getStringExtra("applNo"));
        Serializable serializableExtra = getIntent().getSerializableExtra("Buyerdetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails");
        this.ToBuyerObject = (TOFetchApplicationDetails) serializableExtra;
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra2);
        M1(String.valueOf(getIntent().getStringExtra("off_code")));
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        O1(String.valueOf(y1().getRc_regn_no()));
        try {
            Serializable serializableExtra3 = getIntent().getSerializableExtra("AadhaarDetails");
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse");
            DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) serializableExtra3;
            this.getAddharrdetails = doAadhaarResponse;
            Log.e("TestDrive--> ", String.valueOf(doAadhaarResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
        L1(new wa3(this));
        this.state_code = y1().getState_cd();
        u1().f.e.setVisibility(0);
        SpannableString spannableString = new SpannableString(x1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        u1().f.i.setText(String.valueOf(v1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        u1().f.e.setText(spannableString);
        u1().g.setLayoutManager(new GridLayoutManager(this, 3));
        u1().f.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.C1(this.a, view);
            }
        });
        if (this.ToBuyerObject != null) {
            J0();
        }
        u1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.D1(this.a, view);
            }
        });
        u1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.E1(this.a, view);
            }
        });
        u1().f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.F1(this.a, view);
            }
        });
        u1().f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ob6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.G1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        p1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p1(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ib6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.q1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerSelectionScreen.r1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String s1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String t1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final my3 u1() {
        my3 my3Var = this.binding;
        if (my3Var != null) {
            return my3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final MultiService z1() {
        MultiService multiService = this.retrofitService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
