package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.HypothecationContinuationActivityMultiTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gz3;
import com.zepto.hs2;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR6\u0010W\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010Oj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010&\u001a\u0004\bq\u0010(\"\u0004\br\u0010*R\"\u0010w\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010&\u001a\u0004\bu\u0010(\"\u0004\bv\u0010*¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/HypothecationContinuationActivityMultiTO;", "Lcom/zepto/pq;", "", "I1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "V1", "Lcom/zepto/hs2;", "C", "Lcom/zepto/hs2;", "s1", "()Lcom/zepto/hs2;", "L1", "(Lcom/zepto/hs2;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "A1", "()Lcom/zepto/ld7;", "T1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "F", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "Q1", "(Ljava/lang/String;)V", "rc_number", "G", "v1", "O1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "L", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "M", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "U1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "u1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "P", "r1", "K1", "aadhar_name", "Q", "q1", "J1", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationContinuationActivityMultiTO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hs2 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String aadhar_address;

    public static final void B1(HypothecationContinuationActivityMultiTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void C1(HypothecationContinuationActivityMultiTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void D1(HypothecationContinuationActivityMultiTO this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        try {
            this$0.s1().o.setVisibility(0);
            this$0.s1().d.setVisibility(0);
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String strValueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            if (strValueOf.length() == 0) {
                this$0.s1().j.setText("--");
            } else {
                this$0.s1().j.setText(strValueOf);
            }
            if (strValueOf2.length() != 0) {
                this$0.s1().h.setText(strValueOf2 + strValueOf3 + strValueOf4);
            }
            if (strValueOf5.length() != 0) {
                this$0.s1().g.setText(k18.a.f(strValueOf5));
            }
            if (string != null && string.length() != 0) {
                this$0.s1().v.setText(string.toString());
            }
        } catch (Exception e) {
            this$0.s1().o.setVisibility(8);
            this$0.s1().d.setVisibility(8);
            this$0.V1(this$0, this$0.getString(R.string.service_unavable_please_try));
            e.printStackTrace();
        }
    }

    public static final void E1(HypothecationContinuationActivityMultiTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        this$0.s1().o.setVisibility(8);
        this$0.s1().d.setVisibility(8);
        this$0.V1(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void F1(HypothecationContinuationActivityMultiTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.INSTANCE.u(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this$0.multiServiceList, "S")));
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra("off_code", this$0.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void G1(HypothecationContinuationActivityMultiTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.t1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void H1(HypothecationContinuationActivityMultiTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    private final void I1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final ld7 A1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void L1(hs2 hs2Var) {
        Intrinsics.checkNotNullParameter(hs2Var, "<set-?>");
        this.binding = hs2Var;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void N1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void R1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void S1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void T1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void U1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void V1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.W1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hypo_continustion_multi);
        hs2 hs2VarC = hs2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hs2VarC, "inflate(...)");
        L1(hs2VarC);
        setContentView(s1().b());
        getWindow().addFlags(128);
        ta3.a.W0(this, s1());
        S1(VahanProService.INSTANCE.a(this));
        N1(MultiService.INSTANCE.a(this));
        U1((MultiSelectionViewModel) new z(this, new y67(new sx3(u1()))).a(MultiSelectionViewModel.class));
        Q1(String.valueOf(getIntent().getStringExtra("RC")));
        O1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        R1((NrvDetails) serializableExtra);
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        s1().u.e.setVisibility(0);
        s1().u.e.setText(x1());
        SpannableString spannableString = new SpannableString(x1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        s1().u.e.setText(spannableString);
        M1(new wa3(this));
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            s1().u.i.setText(t1().b("hypothecation_continuation", getString(R.string.vahan_hypothecation_continuation)));
        } else {
            SpannableString spannableString2 = new SpannableString(String.valueOf(t1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            s1().u.i.setText(spannableString2);
        }
        s1().u.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.B1(this.a, view);
            }
        });
        if (this.isFaceless) {
            s1().q.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = s1().q.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        M1(new wa3(this));
        s1().G.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        s1().H.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        s1().H.setPaintFlags(s1().H.getPaintFlags() | 8);
        s1().u.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.C1(this.a, view);
            }
        });
        P1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        T1((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        try {
            w1().show();
            A1().n0(this, x1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        A1().o0().g(this, new mf4() { // from class: com.zepto.ru2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMultiTO.D1(this.a, (HptDetailsModle) obj);
            }
        });
        A1().p0().g(this, new mf4() { // from class: com.zepto.su2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMultiTO.E1(this.a, (String) obj);
            }
        });
        s1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.F1(this.a, view);
            }
        });
        s1().u.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.G1(this.a, view);
            }
        });
        s1().u.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMultiTO.H1(this.a, view);
            }
        });
    }

    public final String q1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final hs2 s1() {
        hs2 hs2Var = this.binding;
        if (hs2Var != null) {
            return hs2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService u1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String v1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
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

    public final VahanProService z1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
