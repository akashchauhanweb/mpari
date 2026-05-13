package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationContinuationActivityMulti;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.ed5;
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
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b{\u0010|J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR6\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\n\u0018\u0001`S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010b\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010*\u001a\u0004\bt\u0010,\"\u0004\bu\u0010.R\"\u0010z\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010*\u001a\u0004\bx\u0010,\"\u0004\by\u0010.¨\u0006}"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/HypothecationContinuationActivityMulti;", "Lcom/zepto/pq;", "", "N1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "b2", "purCode", "Ljava/util/ArrayList;", "purSel", "Y1", "Lcom/zepto/hs2;", "C", "Lcom/zepto/hs2;", "u1", "()Lcom/zepto/hs2;", "Q1", "(Lcom/zepto/hs2;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "C1", "()Lcom/zepto/ld7;", "Z1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "X1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "F", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "rc_number", "G", "x1", "T1", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "R1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lkotlin/collections/ArrayList;", "L", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "M", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "P", "t1", "P1", "aadhar_name", "Q", "s1", "O1", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationContinuationActivityMulti extends pq {

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
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String aadhar_address;

    public static final void E1(HypothecationContinuationActivityMulti this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void F1(HypothecationContinuationActivityMulti this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.z1());
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
    }

    public static final void G1(HypothecationContinuationActivityMulti this$0, HptDetailsModle hptDetailsModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        try {
            this$0.u1().o.setVisibility(0);
            this$0.u1().d.setVisibility(0);
            String strValueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String strValueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String strValueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String strValueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String strValueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String string = hptDetailsModle.getHp_type().toString();
            if (strValueOf.length() == 0) {
                this$0.u1().j.setText("--");
            } else {
                this$0.u1().j.setText(strValueOf);
            }
            if (strValueOf2.length() != 0) {
                this$0.u1().h.setText(strValueOf2 + strValueOf3 + strValueOf4);
            }
            if (strValueOf5.length() != 0) {
                this$0.u1().g.setText(k18.a.f(strValueOf5));
            }
            if (string != null && string.length() != 0) {
                this$0.u1().v.setText(string.toString());
            }
        } catch (Exception e) {
            this$0.u1().o.setVisibility(8);
            this$0.u1().d.setVisibility(8);
            this$0.b2(this$0, this$0.getString(R.string.service_unavable_please_try));
            e.printStackTrace();
        }
    }

    public static final void H1(HypothecationContinuationActivityMulti this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        this$0.u1().o.setVisibility(8);
        this$0.u1().d.setVisibility(8);
        this$0.b2(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void I1(HypothecationContinuationActivityMulti this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        VContant.Companion companion = VContant.INSTANCE;
        if (StringsKt__StringsJVMKt.equals(companion.t(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this$0.multiServiceList), VContant.REDIRECT, true)) {
            this$0.y1().show();
            MultiSelectionViewModel multiSelectionViewModelD1 = this$0.D1();
            MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft);
            multiSelectionViewModelD1.v(multiServiceDraft);
            return;
        }
        if (companion.w(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this$0.multiServiceList)) {
            intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.t(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this$0.multiServiceList)));
        } else {
            intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.t(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this$0.multiServiceList)));
        }
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
        intent.putExtra("RC", this$0.z1());
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra("off_code", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void J1(HypothecationContinuationActivityMulti this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.v1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void K1(HypothecationContinuationActivityMulti this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1();
    }

    public static final void L1(HypothecationContinuationActivityMulti this$0, DraftResponse draftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            return;
        }
        Data data = draftResponse.getData();
        String strValueOf = String.valueOf(data != null ? data.getApplNo() : null);
        Data data2 = draftResponse.getData();
        if (data2 != null) {
            data2.getTransferOwnershipDto();
        }
        Data data3 = draftResponse.getData();
        ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
        Data data4 = draftResponse.getData();
        HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
        Data data5 = draftResponse.getData();
        HptDto hptDto = data5 != null ? data5.getHptDto() : null;
        Data data6 = draftResponse.getData();
        Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
        MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
        MultiServiceDraft multiServiceDraftCopy = multiServiceDraft != null ? multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : strValueOf, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : channgeOfAdressDto, (2045 & 4) != 0 ? multiServiceDraft.durcdto : durcdto, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : hpaDto, (2045 & 16) != 0 ? multiServiceDraft.hptDto : hptDto, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null) : null;
        Intent intent = new Intent(this$0, (Class<?>) VahanMultiServiceConfirmationScreen.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftCopy);
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void M1(HypothecationContinuationActivityMulti this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    private final void N1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 C1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel D1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void Q1(hs2 hs2Var) {
        Intrinsics.checkNotNullParameter(hs2Var, "<set-?>");
        this.binding = hs2Var;
    }

    public final void R1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void S1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Y1(String purCode, ArrayList purSel) {
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        try {
            Intrinsics.checkNotNull(purSel);
            int iIndexOf = purSel.indexOf(purCode);
            if (purSel.size() == 4) {
                u1().r.b.setVisibility(0);
                TextView textView = u1().r.d;
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                textView.setText(companion.D(this, (String) obj));
                TextView textView2 = u1().r.f;
                Object obj2 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                textView2.setText(companion.D(this, (String) obj2));
                TextView textView3 = u1().r.k;
                Object obj3 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                textView3.setText(companion.D(this, (String) obj3));
                TextView textView4 = u1().r.n;
                Object obj4 = purSel.get(3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                textView4.setText(companion.D(this, (String) obj4));
                if (iIndexOf == 3) {
                    u1().r.c.setChecked(true);
                    u1().r.e.setChecked(true);
                    u1().r.h.setChecked(true);
                    u1().r.m.setChecked(false);
                }
                if (iIndexOf == 2) {
                    u1().r.c.setChecked(true);
                    u1().r.e.setChecked(true);
                    u1().r.h.setChecked(false);
                    u1().r.m.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 1) {
                    u1().r.c.setChecked(true);
                    u1().r.e.setChecked(false);
                    Drawable drawableE = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    u1().r.h.setCheckMarkDrawable(drawableE);
                    u1().r.m.setCheckMarkDrawable(drawableE);
                }
                if (iIndexOf == 0) {
                    u1().r.c.setChecked(false);
                    Drawable drawableE2 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    u1().r.e.setCheckMarkDrawable(drawableE2);
                    u1().r.h.setCheckMarkDrawable(drawableE2);
                    u1().r.m.setCheckMarkDrawable(drawableE2);
                }
            }
            if (purSel.size() == 3) {
                u1().r.u.setVisibility(0);
                TextView textView5 = u1().r.z;
                VContant.Companion companion2 = VContant.INSTANCE;
                Object obj5 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                textView5.setText(companion2.D(this, (String) obj5));
                TextView textView6 = u1().r.w;
                Object obj6 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                textView6.setText(companion2.D(this, (String) obj6));
                TextView textView7 = u1().r.j;
                Object obj7 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                textView7.setText(companion2.D(this, (String) obj7));
                if (iIndexOf == 2) {
                    u1().r.i.setChecked(true);
                    u1().r.v.setChecked(true);
                    u1().r.y.setChecked(false);
                }
                if (iIndexOf == 1) {
                    u1().r.i.setChecked(true);
                    u1().r.v.setChecked(false);
                    u1().r.y.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 0) {
                    u1().r.i.setChecked(false);
                    Drawable drawableE3 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    u1().r.v.setCheckMarkDrawable(drawableE3);
                    u1().r.y.setCheckMarkDrawable(drawableE3);
                }
            }
            if (purSel.size() == 2) {
                u1().r.A.setVisibility(0);
                TextView textView8 = u1().r.t;
                VContant.Companion companion3 = VContant.INSTANCE;
                Object obj8 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                textView8.setText(companion3.D(this, (String) obj8));
                TextView textView9 = u1().r.r;
                Object obj9 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                textView9.setText(companion3.D(this, (String) obj9));
                if (iIndexOf == 1) {
                    u1().r.q.setChecked(true);
                    u1().r.s.setChecked(false);
                }
                if (iIndexOf == 0) {
                    u1().r.q.setChecked(false);
                    u1().r.s.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void Z1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void a2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void b2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ou2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.c2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hypo_continustion_multi);
        hs2 hs2VarC = hs2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hs2VarC, "inflate(...)");
        Q1(hs2VarC);
        setContentView(u1().b());
        ta3.a.V0(this, u1());
        X1(VahanProService.INSTANCE.a(this));
        S1(MultiService.INSTANCE.a(this));
        a2((MultiSelectionViewModel) new z(this, new y67(new sx3(w1()))).a(MultiSelectionViewModel.class));
        V1(String.valueOf(getIntent().getStringExtra("RC")));
        T1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        W1((NrvDetails) serializableExtra);
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        O1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        u1().u.e.setVisibility(0);
        u1().u.e.setText(z1());
        SpannableString spannableString = new SpannableString(z1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        u1().u.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            R1(new wa3(this));
            u1().u.i.setText(v1().b("hypothecation_continuation", getString(R.string.vahan_hypothecation_continuation)));
        } else {
            SpannableString spannableString2 = new SpannableString(v1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            u1().u.i.setText(spannableString2);
        }
        u1().u.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.E1(this.a, view);
            }
        });
        Y1(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this.multiServiceList);
        if (this.isFaceless) {
            u1().q.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = u1().q.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        R1(new wa3(this));
        u1().G.setText(v1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        u1().H.setText(v1().b("view_vehicle_details", "View Vehicle Details"));
        u1().H.setPaintFlags(u1().H.getPaintFlags() | 8);
        u1().u.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.F1(this.a, view);
            }
        });
        U1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        Z1((ld7) new z(this, new kd7(new jd7(B1()))).a(ld7.class));
        try {
            y1().show();
            C1().n0(this, z1());
        } catch (Exception e) {
            e.printStackTrace();
        }
        C1().o0().g(this, new mf4() { // from class: com.zepto.hu2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMulti.G1(this.a, (HptDetailsModle) obj);
            }
        });
        C1().p0().g(this, new mf4() { // from class: com.zepto.iu2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMulti.H1(this.a, (String) obj);
            }
        });
        u1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ju2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.I1(this.a, view);
            }
        });
        u1().u.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ku2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.J1(this.a, view);
            }
        });
        u1().u.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationContinuationActivityMulti.K1(this.a, view);
            }
        });
        D1().l().g(this, new mf4() { // from class: com.zepto.mu2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMulti.L1(this.a, (DraftResponse) obj);
            }
        });
        D1().m().g(this, new mf4() { // from class: com.zepto.nu2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationContinuationActivityMulti.M1(this.a, (String) obj);
            }
        });
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

    public final hs2 u1() {
        hs2 hs2Var = this.binding;
        if (hs2Var != null) {
            return hs2Var;
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

    public final MultiService w1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String x1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }
}
