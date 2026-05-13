package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.DetailView.HypothecationTerminationViewDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gz3;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mr2;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010E\u001a\n >*\u0004\u0018\u00010=0=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010P\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010+\u001a\u0004\bN\u0010-\"\u0004\bO\u0010/R\"\u0010T\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010+\u001a\u0004\bR\u0010-\"\u0004\bS\u0010/R\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R*\u0010d\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010l\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/DetailView/HypothecationTerminationViewDetails;", "Lcom/zepto/pq;", "", "B1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/mr2;", "binding", "O1", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "I1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "getViewModel", "()Lcom/zepto/ld7;", "M1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "F", "Lcom/zepto/mr2;", "p1", "()Lcom/zepto/mr2;", "E1", "(Lcom/zepto/mr2;)V", "", "G", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "J1", "(Ljava/lang/String;)V", "rc_number", "H", "getOff_code", "H1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "u1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "K", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "L", "o1", "D1", "aadhar_name", "M", "n1", "C1", "aadhar_address", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "O", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "P", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "r1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "G1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "S", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationTerminationViewDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public mr2 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

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

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final void A1(HypothecationTerminationViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void w1(HypothecationTerminationViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void x1(HypothecationTerminationViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.t1());
        intent.putExtra("RcDetails", this$0.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
        this$0.startActivity(intent);
    }

    public static final void y1(HypothecationTerminationViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        StringBuilder sb = new StringBuilder();
        sb.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.");
        VContant.Companion companion = VContant.INSTANCE;
        ArrayList arrayList = this$0.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        sb.append(companion.s((String) obj, "B"));
        intent.setClass(this$0, Class.forName(sb.toString()));
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
    }

    public static final void z1(HypothecationTerminationViewDetails this$0, View view) {
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

    public final void E1(mr2 mr2Var) {
        Intrinsics.checkNotNullParameter(mr2Var, "<set-?>");
        this.binding = mr2Var;
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void G1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void I1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void K1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void L1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void M1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void N1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void O1(mr2 binding) {
        HptDto hptDto;
        HptDto hptDto2;
        HptDto hptDto3;
        HptDto hptDto4;
        HptDto hptDto5;
        HptDto hptDto6;
        HptDto hptDto7;
        Intrinsics.checkNotNullParameter(binding, "binding");
        TextView textView = binding.h;
        MultiServiceDraftTO multiServiceDraftTO = this.multiServiceobj;
        String from_dt = null;
        textView.setText((multiServiceDraftTO == null || (hptDto7 = multiServiceDraftTO.getHptDto()) == null) ? null : hptDto7.getUpto_dt());
        AppCompatTextView appCompatTextView = binding.x;
        MultiServiceDraftTO multiServiceDraftTO2 = this.multiServiceobj;
        appCompatTextView.setText((multiServiceDraftTO2 == null || (hptDto6 = multiServiceDraftTO2.getHptDto()) == null) ? null : hptDto6.getHp_type());
        AppCompatTextView appCompatTextView2 = binding.l;
        MultiServiceDraftTO multiServiceDraftTO3 = this.multiServiceobj;
        appCompatTextView2.setText((multiServiceDraftTO3 == null || (hptDto5 = multiServiceDraftTO3.getHptDto()) == null) ? null : hptDto5.getFncr_name());
        MultiServiceDraftTO multiServiceDraftTO4 = this.multiServiceobj;
        String strValueOf = String.valueOf((multiServiceDraftTO4 == null || (hptDto4 = multiServiceDraftTO4.getHptDto()) == null) ? null : hptDto4.getFncr_add1());
        MultiServiceDraftTO multiServiceDraftTO5 = this.multiServiceobj;
        String strValueOf2 = String.valueOf((multiServiceDraftTO5 == null || (hptDto3 = multiServiceDraftTO5.getHptDto()) == null) ? null : hptDto3.getFncr_add2());
        MultiServiceDraftTO multiServiceDraftTO6 = this.multiServiceobj;
        String strValueOf3 = String.valueOf((multiServiceDraftTO6 == null || (hptDto2 = multiServiceDraftTO6.getHptDto()) == null) ? null : hptDto2.getFncr_add3());
        TextView textView2 = binding.g;
        MultiServiceDraftTO multiServiceDraftTO7 = this.multiServiceobj;
        if (multiServiceDraftTO7 != null && (hptDto = multiServiceDraftTO7.getHptDto()) != null) {
            from_dt = hptDto.getFrom_dt();
        }
        textView2.setText(String.valueOf(from_dt));
        if (strValueOf.length() == 0) {
            return;
        }
        binding.j.setText(strValueOf + strValueOf2 + strValueOf3);
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
        VUtility.INSTANCE.y(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hpt_details);
        mr2 mr2VarC = mr2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mr2VarC, "inflate(...)");
        E1(mr2VarC);
        setContentView(p1().b());
        getWindow().addFlags(128);
        F1(new wa3(this));
        L1(VahanProService.INSTANCE.a(this));
        I1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        M1((ld7) new z(this, new kd7(new jd7(v1()))).a(ld7.class));
        G1(MultiService.INSTANCE.a(this));
        N1((MultiSelectionViewModel) new z(this, new y67(new sx3(r1()))).a(MultiSelectionViewModel.class));
        J1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        K1((NrvDetails) serializableExtra);
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
            this.getAddharrdetails = doAadhaarResponse;
            Log.e("getAddharrdetails-ToBuyerMain", String.valueOf(doAadhaarResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
        O1(p1());
        p1().d.setText("Confirm & Proceed");
        p1().w.e.setVisibility(0);
        p1().w.e.setText(t1());
        SpannableString spannableString = new SpannableString(t1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        p1().w.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            p1().w.i.setText(String.valueOf(q1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        } else {
            SpannableString spannableString2 = new SpannableString("RC Services");
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            p1().w.i.setText(spannableString2);
        }
        p1().w.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ew2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationViewDetails.w1(this.a, view);
            }
        });
        p1().I.setText(q1().b("vehicle_no", "Vehicle No.:") + ' ' + t1());
        p1().J.setText(q1().b("view_vehicle_details", "View Vehicle Details"));
        p1().J.setPaintFlags(p1().J.getPaintFlags() | 8);
        p1().w.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationViewDetails.x1(this.a, view);
            }
        });
        H1(String.valueOf(u1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        if (booleanExtra) {
            p1().s.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = p1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        p1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationViewDetails.y1(this.a, view);
            }
        });
        p1().w.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationViewDetails.z1(this.a, view);
            }
        });
        p1().w.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationTerminationViewDetails.A1(this.a, view);
            }
        });
    }

    public final mr2 p1() {
        mr2 mr2Var = this.binding;
        if (mr2Var != null) {
            return mr2Var;
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
