package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeeRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.Fees;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeesResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.FessMultiModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.MultiServiceFeesDetailsScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanMultiServicePayment;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.gz3;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.ly3;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.y67;
import com.zepto.y82;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J\"\u0010\u001a\u001a\u00020\u00112\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0018R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010R\u001a\u0004\bi\u0010T\"\u0004\bj\u0010VR\"\u0010o\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010R\u001a\u0004\bm\u0010T\"\u0004\bn\u0010VR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R<\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/MultiServiceFeesDetailsScreen;", "Lcom/zepto/pq;", "", "T1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "", "title", "h2", "message", "f2", "v1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiServiceList", "D1", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "I1", "()Lcom/zepto/ld7;", "d2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "c2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "E1", "()Landroid/app/ProgressDialog;", "Z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getConfirm_details", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "setConfirm_details", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;)V", "confirm_details", "Lcom/zepto/ly3;", "G", "Lcom/zepto/ly3;", "A1", "()Lcom/zepto/ly3;", "W1", "(Lcom/zepto/ly3;)V", "binding", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "H", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;)V", "paymentRequest", "I", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "J", "Ljava/lang/String;", "getTotal_amount", "()Ljava/lang/String;", "setTotal_amount", "(Ljava/lang/String;)V", "total_amount", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "K", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Y1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "M", "z1", "V1", "aadhar_name", "N", "y1", "U1", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "B1", "()Lcom/zepto/wa3;", "X1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Q", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MultiServiceFeesDetailsScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ChaangeOfAddressStatus confirm_details;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ly3 binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public MultiServiceBeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String total_amount = "0.0";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final void K1(MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.G1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.G1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.z1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.y1());
        this$0.startActivity(intent);
    }

    public static final void L1(MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void M1(MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T1();
    }

    public static final void N1(MultiServiceFeesDetailsScreen this$0, FeesResponse feesResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        try {
            this$0.A1().l.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            ArrayList<ArrayList<Fees>> feesList = feesResponse.getFeesList();
            Log.e("DATA", String.valueOf(feesList));
            String strValueOf = " ";
            Intrinsics.checkNotNull(feesList);
            int size = feesList.size();
            for (int i = 0; i < size; i++) {
                if (feesList.get(i).size() > 1) {
                    int size2 = feesList.get(i).size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        if (VContant.INSTANCE.H(String.valueOf(feesList.get(i).get(i2).getPurCd()))) {
                            strValueOf = String.valueOf(feesList.get(i).get(i2).getFeeHeadDescr());
                            break;
                        }
                        i2++;
                    }
                    ArrayList<Fees> arrayList2 = feesList.get(i);
                    Intrinsics.checkNotNullExpressionValue(arrayList2, "get(...)");
                    arrayList.add(new FessMultiModel(strValueOf, arrayList2));
                } else if (gd1.a.m(feesList.get(i).get(0).getServicecharge())) {
                    String strValueOf2 = String.valueOf(feesList.get(i).get(0).getFeeHeadDescr());
                    ArrayList<Fees> arrayList3 = feesList.get(i);
                    Intrinsics.checkNotNullExpressionValue(arrayList3, "get(...)");
                    arrayList.add(new FessMultiModel(strValueOf2, arrayList3));
                } else {
                    String servicecharge = feesList.get(i).get(0).getServicecharge();
                    Integer numValueOf = servicecharge != null ? Integer.valueOf(Integer.parseInt(servicecharge)) : null;
                    Intrinsics.checkNotNull(numValueOf);
                    if (numValueOf.intValue() > 0) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.addAll(feesList.get(i));
                        Fees fees = feesList.get(i).get(0);
                        Intrinsics.checkNotNullExpressionValue(fees, "get(...)");
                        Fees fees2 = fees;
                        String servicecharge2 = fees2.getServicecharge();
                        Intrinsics.checkNotNull(servicecharge2);
                        arrayList4.add(Fees.copy$default(fees2, Integer.parseInt(servicecharge2), "Service Charge", 0, 0, null, 0, 52, null));
                        arrayList.add(new FessMultiModel(String.valueOf(feesList.get(i).get(0).getFeeHeadDescr()), arrayList4));
                    } else {
                        String strValueOf3 = String.valueOf(feesList.get(i).get(0).getFeeHeadDescr());
                        ArrayList<Fees> arrayList5 = feesList.get(i);
                        Intrinsics.checkNotNullExpressionValue(arrayList5, "get(...)");
                        arrayList.add(new FessMultiModel(strValueOf3, arrayList5));
                    }
                }
            }
            this$0.A1().t.setVisibility(0);
            this$0.A1().i.setVisibility(0);
            this$0.A1().B.setText(String.valueOf(feesResponse.getTotalAmount()));
            this$0.A1().h.setAdapter(new y82(arrayList, this$0));
        } catch (Exception e) {
            e.printStackTrace();
            this$0.A1().l.setVisibility(8);
            this$0.h2(this$0, "Unable to get the fee details, Please try after some time!");
        }
    }

    public static final void O1(MultiServiceFeesDetailsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        this$0.h2(this$0, "Unable to get the fee details, Please try after some time!");
    }

    public static final void P1(MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            vh7 vh7Var = new vh7(this$0);
            new ArrayList();
            VContant.Companion companion = VContant.INSTANCE;
            MultiServiceDto multiServiceDto = new MultiServiceDto(null, companion.k(this$0.multiServiceList), this$0.G1().getRc_regn_no(), this$0.G1().getState_cd(), 0);
            this$0.E1().show();
            if (this$0.isFaceless) {
                String strA = vh7Var.a();
                MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft);
                String strValueOf = String.valueOf(multiServiceDraft.getApplNo());
                MultiServiceDraft multiServiceDraft2 = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft2);
                ChanngeOfAdressDto channgeOfAdressDto = multiServiceDraft2.getChanngeOfAdressDto();
                String strValueOf2 = String.valueOf(this$0.G1().getRc_chasi_no());
                MultiServiceDraft multiServiceDraft3 = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft3);
                Durcdto durcdto = multiServiceDraft3.getDurcdto();
                MultiServiceDraft multiServiceDraft4 = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft4);
                HpaDto hpaDto = multiServiceDraft4.getHpaDto();
                MultiServiceDraft multiServiceDraft5 = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft5);
                HptDto hptDto = multiServiceDraft5.getHptDto();
                String rc_off_cd = this$0.G1().getRc_off_cd();
                Intrinsics.checkNotNull(rc_off_cd);
                int i = Integer.parseInt(rc_off_cd);
                String strR = hz0.a.r();
                ArrayList arrayListK = companion.k(this$0.multiServiceList);
                int i2 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                String strValueOf3 = String.valueOf(this$0.G1().getRc_regn_no());
                String strValueOf4 = String.valueOf(this$0.G1().getState_cd());
                MultiServiceDraft multiServiceDraft6 = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraft6);
                TransferOwnershipDto transferOwnershipDto = multiServiceDraft6.getTransferOwnershipDto();
                String rc_vh_class_cd = this$0.G1().getRc_vh_class_cd();
                this$0.a2(new MultiServiceBeforePaymentRequest(strA, "A", strValueOf, true, channgeOfAdressDto, strValueOf2, 22, durcdto, null, "", "", false, hpaDto, hptDto, 0, "", 1, "", false, "", multiServiceDto, false, i, strR, "", "", arrayListK, i2, "", "", 0, 0, strValueOf3, 0, strValueOf4, "", "", "L", transferOwnershipDto, rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null));
                this$0.J1().g(this$0.F1());
                return;
            }
            String strA2 = vh7Var.a();
            MultiServiceDraft multiServiceDraft7 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft7);
            String strValueOf5 = String.valueOf(multiServiceDraft7.getApplNo());
            MultiServiceDraft multiServiceDraft8 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft8);
            ChanngeOfAdressDto channgeOfAdressDto2 = multiServiceDraft8.getChanngeOfAdressDto();
            String strValueOf6 = String.valueOf(this$0.G1().getRc_chasi_no());
            MultiServiceDraft multiServiceDraft9 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft9);
            Durcdto durcdto2 = multiServiceDraft9.getDurcdto();
            MultiServiceDraft multiServiceDraft10 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft10);
            HpaDto hpaDto2 = multiServiceDraft10.getHpaDto();
            MultiServiceDraft multiServiceDraft11 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft11);
            HptDto hptDto2 = multiServiceDraft11.getHptDto();
            String rc_off_cd2 = this$0.G1().getRc_off_cd();
            Intrinsics.checkNotNull(rc_off_cd2);
            int i3 = Integer.parseInt(rc_off_cd2);
            String strR2 = hz0.a.r();
            ArrayList arrayListK2 = companion.k(this$0.multiServiceList);
            int i4 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
            String strValueOf7 = String.valueOf(this$0.G1().getRc_regn_no());
            String strValueOf8 = String.valueOf(this$0.G1().getState_cd());
            MultiServiceDraft multiServiceDraft12 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft12);
            TransferOwnershipDto transferOwnershipDto2 = multiServiceDraft12.getTransferOwnershipDto();
            String rc_vh_class_cd2 = this$0.G1().getRc_vh_class_cd();
            this$0.a2(new MultiServiceBeforePaymentRequest(strA2, "M", strValueOf5, true, channgeOfAdressDto2, strValueOf6, 22, durcdto2, null, "", "", false, hpaDto2, hptDto2, 0, "", 1, "", false, "", multiServiceDto, false, i3, strR2, "", "", arrayListK2, i4, "", "", 0, 0, strValueOf7, 0, strValueOf8, "", "", "L", transferOwnershipDto2, rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null));
            this$0.J1().g(this$0.F1());
        } catch (Exception e) {
            this$0.E1().dismiss();
            e.printStackTrace();
        }
    }

    public static final void Q1(MultiServiceFeesDetailsScreen this$0, MultiBeforePaymentResponse multiBeforePaymentResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        String returnUrl = multiBeforePaymentResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) VahanMultiServicePayment.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra("state_code", this$0.G1().getState_cd());
            intent.putExtra("rc_number", this$0.G1().getRc_regn_no());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.MULTISERVICE_PURPOSE_CODE);
            intent.putExtra("URL", multiBeforePaymentResponse.getReturnUrl());
            intent.putExtra(VContant.FINAL_SUBMIT, this$0.F1());
            intent.putExtra("RC", this$0.G1().getRc_regn_no());
            intent.putExtra("RcDetails", this$0.G1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.z1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.y1());
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void R1(MultiServiceFeesDetailsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        if (str.equals("Error")) {
            this$0.f2(this$0, this$0.getString(R.string.service_unavable_please_try));
        } else {
            this$0.f2(this$0, str);
        }
    }

    public static final void S1(MultiServiceFeesDetailsScreen this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        try {
            Intrinsics.checkNotNull(distictModle);
            int size = distictModle.size();
            for (int i = 0; i < size; i++) {
                String strValueOf = String.valueOf(distictModle.get(i).getDist_cd());
                ChaangeOfAddressStatus chaangeOfAddressStatus = this$0.confirm_details;
                Intrinsics.checkNotNull(chaangeOfAddressStatus);
                if (StringsKt__StringsJVMKt.equals(strValueOf, chaangeOfAddressStatus.getC_district().toString(), true)) {
                    StringBuilder sb = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus2 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus2);
                    sb.append(chaangeOfAddressStatus2.getC_add1());
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus3);
                    sb.append(chaangeOfAddressStatus3.getC_add2());
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus4 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus4);
                    sb.append(chaangeOfAddressStatus4.getC_add3());
                    sb.append(", ");
                    sb.append(distictModle.get(i).getDescr());
                    sb.append(", ");
                    VContant.Companion companion = VContant.INSTANCE;
                    sb.append(companion.l(String.valueOf(this$0.G1().getRc_c_state())));
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus5);
                    sb.append(chaangeOfAddressStatus5.getC_pincode());
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus6 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus6);
                    sb2.append(chaangeOfAddressStatus6.getP_add1());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus7);
                    sb2.append(chaangeOfAddressStatus7.getP_add2());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus8 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus8);
                    sb2.append(chaangeOfAddressStatus8.getP_add3());
                    sb2.append(", ");
                    sb2.append(distictModle.get(i).getDescr());
                    sb2.append(", ");
                    sb2.append(companion.l(String.valueOf(this$0.G1().getRc_c_state())));
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus9);
                    sb2.append(chaangeOfAddressStatus9.getP_pincode());
                    String string2 = sb2.toString();
                    this$0.A1().c.setText(string.toString());
                    this$0.A1().o.setText(string2.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb3 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus10 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus10);
            sb3.append(chaangeOfAddressStatus10.getC_add1());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus11 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus11);
            sb3.append(chaangeOfAddressStatus11.getC_add2());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus12 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus12);
            sb3.append(chaangeOfAddressStatus12.getC_add3());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus13 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus13);
            sb3.append(chaangeOfAddressStatus13.getC_district());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus14 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus14);
            sb3.append(chaangeOfAddressStatus14.getC_state());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus15 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus15);
            sb3.append(chaangeOfAddressStatus15.getC_pincode());
            String string3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus16 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus16);
            sb4.append(chaangeOfAddressStatus16.getP_add1());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus17 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus17);
            sb4.append(chaangeOfAddressStatus17.getP_add2());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus18 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus18);
            sb4.append(chaangeOfAddressStatus18.getP_add3());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus19 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus19);
            sb4.append(chaangeOfAddressStatus19.getP_district());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus20 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus20);
            sb4.append(chaangeOfAddressStatus20.getP_state());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus21 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus21);
            sb4.append(chaangeOfAddressStatus21.getP_pincode());
            String string4 = sb4.toString();
            this$0.A1().c.setText(string3.toString());
            this$0.A1().o.setText(string4.toString());
        }
    }

    private final void T1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void g2(Dialog d, MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void i2(Dialog dialog, MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.finish();
    }

    public static final void w1(Dialog d, MultiServiceFeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void x1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final ly3 A1() {
        ly3 ly3Var = this.binding;
        if (ly3Var != null) {
            return ly3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 B1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService C1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String D1(ArrayList multiServiceList) {
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(multiServiceList);
        if (multiServiceList.size() > 0) {
            int size = multiServiceList.size();
            for (int i = 0; i < size; i++) {
                Object obj = multiServiceList.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(VContant.INSTANCE.C(this, (String) obj));
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final MultiServiceBeforePaymentRequest F1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.paymentRequest;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final NrvDetails G1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService H1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 I1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel J1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void W1(ly3 ly3Var) {
        Intrinsics.checkNotNullParameter(ly3Var, "<set-?>");
        this.binding = ly3Var;
    }

    public final void X1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void Y1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void Z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void a2(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        Intrinsics.checkNotNullParameter(multiServiceBeforePaymentRequest, "<set-?>");
        this.paymentRequest = multiServiceBeforePaymentRequest;
    }

    public final void b2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void c2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void d2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void e2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void f2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.g2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void h2(Context context, String title) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.i2(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        v1(this, B1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiservice_feelayout);
        ly3 ly3VarC = ly3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ly3VarC, "inflate(...)");
        W1(ly3VarC);
        setContentView(A1().b());
        ta3.a.R0(this, A1());
        X1(new wa3(this));
        c2(VahanProService.INSTANCE.a(this));
        Z1(new ProgressDialog(this));
        E1().setMessage("Please wait...");
        E1().setCancelable(false);
        E1().setCanceledOnTouchOutside(false);
        d2((ld7) new z(this, new kd7(new jd7(H1()))).a(ld7.class));
        Y1(MultiService.INSTANCE.a(this));
        e2((MultiSelectionViewModel) new z(this, new y67(new sx3(C1()))).a(MultiSelectionViewModel.class));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        V1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        b2((NrvDetails) serializableExtra2);
        A1().h.setLayoutManager(new LinearLayoutManager(this));
        A1().h.setHasFixedSize(true);
        Log.e("IsFaceless-> ", String.valueOf(this.isFaceless));
        A1().z.e.setVisibility(0);
        SpannableString spannableString = new SpannableString(String.valueOf(G1().getRc_regn_no()));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        A1().z.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        if (arrayList == null || !arrayList.contains(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            ArrayList arrayList2 = this.multiServiceList;
            Intrinsics.checkNotNull(arrayList2);
            if (arrayList2.size() > 1) {
                SpannableString spannableString2 = new SpannableString(B1().b("rcServices", getString(R.string.rc_service)));
                spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
                A1().z.i.setText(spannableString2);
            } else {
                A1().z.i.setText(D1(this.multiServiceList));
            }
        } else {
            A1().z.i.setText("Transfer of OwnerShip \n(Buyer)");
        }
        if (this.isFaceless) {
            A1().s.f.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = A1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        try {
            A1().H.setPaintFlags(A1().H.getPaintFlags() | 8);
            A1().z.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yx3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultiServiceFeesDetailsScreen.K1(this.a, view);
                }
            });
            A1().z.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zx3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultiServiceFeesDetailsScreen.L1(this.a, view);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        A1().z.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ay3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.M1(this.a, view);
            }
        });
        E1().show();
        J1().r(new FeeRequest(VContant.INSTANCE.k(this.multiServiceList), String.valueOf(G1().getRc_regn_no()), String.valueOf(G1().getState_cd())));
        J1().h().g(this, new mf4() { // from class: com.zepto.by3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MultiServiceFeesDetailsScreen.N1(this.a, (FeesResponse) obj);
            }
        });
        J1().i().g(this, new mf4() { // from class: com.zepto.cy3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MultiServiceFeesDetailsScreen.O1(this.a, (String) obj);
            }
        });
        A1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.P1(this.a, view);
            }
        });
        J1().p().g(this, new mf4() { // from class: com.zepto.ey3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MultiServiceFeesDetailsScreen.Q1(this.a, (MultiBeforePaymentResponse) obj);
            }
        });
        J1().q().g(this, new mf4() { // from class: com.zepto.fy3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MultiServiceFeesDetailsScreen.R1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        v1(this, B1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        I1().J().g(this, new mf4() { // from class: com.zepto.ux3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MultiServiceFeesDetailsScreen.S1(this.a, (DistictModle) obj);
            }
        });
    }

    public final void v1(Context context, String message) {
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
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.w1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultiServiceFeesDetailsScreen.x1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String y1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String z1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }
}
