package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.IssueOfDuplicateDetailView;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.a23;
import com.zepto.gz3;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010B\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\"\u0010F\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R*\u0010O\u001a\n H*\u0004\u0018\u00010G0G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R6\u0010g\u001a\u0016\u0012\u0004\u0012\u00020+\u0018\u00010_j\n\u0012\u0004\u0012\u00020+\u0018\u0001``8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R8\u0010\u008a\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u0086\u00010_j\t\u0012\u0005\u0012\u00030\u0086\u0001``8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010b\u001a\u0005\b\u0088\u0001\u0010d\"\u0005\b\u0089\u0001\u0010f¨\u0006\u008d\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/DetailView/IssueOfDuplicateDetailView;", "Lcom/zepto/pq;", "", "B1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/a23;", "binding", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "multiServiceobj", "F1", "C", "Lcom/zepto/a23;", "p1", "()Lcom/zepto/a23;", "E1", "(Lcom/zepto/a23;)V", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "getViewModel", "()Lcom/zepto/ld7;", "N1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "J1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "G", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "K1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "u1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "I", "getOff_code", "I1", "off_code", "J", "o1", "D1", "aadhar_name", "K", "n1", "C1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "L", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "M", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "O", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "P", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "O1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "r1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "H1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "S", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "Lcom/nic/mparivahan/VahanServices/DRcModle/DReasonResponseItem;", "T", "getReasonList", "setReasonList", "reasonList", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class IssueOfDuplicateDetailView extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public a23 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

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

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ArrayList reasonList = new ArrayList();

    public static final void A1(IssueOfDuplicateDetailView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void w1(IssueOfDuplicateDetailView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.t1());
        intent.putExtra("RcDetails", this$0.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
        this$0.startActivity(intent);
    }

    public static final void x1(IssueOfDuplicateDetailView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void y1(IssueOfDuplicateDetailView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            MultiServiceDraftTO multiServiceDraftTO = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraftTO);
            if (multiServiceDraftTO.getPurposeCode().contains(Integer.valueOf(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)))) {
                Intent intent = new Intent(this$0, (Class<?>) HypothecationTerminationViewDetails.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
                intent.putExtra("AadhaarDetails", this$0.getAddharrdetails);
                intent.putExtra("RC", this$0.u1().getRc_regn_no());
                intent.putExtra("RcDetails", this$0.u1());
                intent.putExtra("off_code", this$0.u1().getRc_off_cd());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
                this$0.startActivity(intent);
                this$0.finish();
            } else {
                Intent intent2 = new Intent();
                StringBuilder sb = new StringBuilder();
                sb.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.");
                VContant.Companion companion = VContant.INSTANCE;
                ArrayList arrayList = this$0.multiServiceList;
                Intrinsics.checkNotNull(arrayList);
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                sb.append(companion.s((String) obj, "B"));
                intent2.setClass(this$0, Class.forName(sb.toString()));
                intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
                intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
                intent2.putExtra("AadhaarDetails", this$0.getAddharrdetails);
                intent2.putExtra("RC", this$0.u1().getRc_regn_no());
                intent2.putExtra("RcDetails", this$0.u1());
                intent2.putExtra("off_code", this$0.u1().getRc_off_cd());
                intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
                intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
                this$0.startActivity(intent2);
                this$0.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void z1(IssueOfDuplicateDetailView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.q1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public final void C1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void E1(a23 a23Var) {
        Intrinsics.checkNotNullParameter(a23Var, "<set-?>");
        this.binding = a23Var;
    }

    public final void F1(a23 binding, MultiServiceDraftTO multiServiceobj) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(multiServiceobj, "multiServiceobj");
        Durcdto durcdto = multiServiceobj.getDurcdto();
        if (durcdto != null) {
            binding.h.setText(durcdto.getReason());
            if (StringsKt__StringsJVMKt.equals(durcdto.getReason(), "OTHER", true) || StringsKt__StringsJVMKt.equals(durcdto.getReason(), "TORN", true)) {
                binding.e.setVisibility(8);
                binding.i.setText(durcdto.getReason());
                return;
            }
            try {
                binding.i.setText(durcdto.getReason());
                binding.e.setVisibility(0);
                binding.c.setText(durcdto.getFir_dt());
                binding.d.setText(durcdto.getFir_no().toString());
                binding.i.setText(durcdto.getMsg());
                binding.f.setText(durcdto.getPolice_station());
            } catch (Exception unused) {
            }
        }
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void H1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void J1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void L1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void M1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void N1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void O1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final String n1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issueofduplicate_detailsview);
        a23 a23VarC = a23.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(a23VarC, "inflate(...)");
        E1(a23VarC);
        setContentView(p1().b());
        getWindow().addFlags(128);
        M1(VahanProService.INSTANCE.a(this));
        G1(new wa3(this));
        J1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        N1((ld7) new z(this, new kd7(new jd7(v1()))).a(ld7.class));
        H1(MultiService.INSTANCE.a(this));
        O1((MultiSelectionViewModel) new z(this, new y67(new sx3(r1()))).a(MultiSelectionViewModel.class));
        I1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            this.getAddharrdetails = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
        } catch (Exception e) {
            e.printStackTrace();
        }
        a23 a23VarP1 = p1();
        MultiServiceDraftTO multiServiceDraftTO = this.multiServiceobj;
        Intrinsics.checkNotNull(multiServiceDraftTO);
        F1(a23VarP1, multiServiceDraftTO);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            G1(new wa3(this));
            p1().k.i.setText(String.valueOf(q1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        } else {
            p1().k.i.setText(String.valueOf(q1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        }
        if (this.isFaceless) {
            p1().g.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = p1().g.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        G1(new wa3(this));
        p1().k.e.setVisibility(0);
        p1().k.e.setText(t1());
        SpannableString spannableString = new SpannableString(t1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        p1().k.e.setText(spannableString);
        p1().t.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        p1().b.setText("Confirm & Proceed");
        p1().t.setPaintFlags(p1().t.getPaintFlags() | 8);
        p1().k.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueOfDuplicateDetailView.w1(this.a, view);
            }
        });
        p1().k.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueOfDuplicateDetailView.x1(this.a, view);
            }
        });
        p1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueOfDuplicateDetailView.y1(this.a, view);
            }
        });
        p1().k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueOfDuplicateDetailView.z1(this.a, view);
            }
        });
        p1().k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueOfDuplicateDetailView.A1(this.a, view);
            }
        });
    }

    public final a23 p1() {
        a23 a23Var = this.binding;
        if (a23Var != null) {
            return a23Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService r1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService v1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
