package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.zepto.e7;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010.\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00102\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R)\u0010\u00ad\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010´\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010\u0085\u0001\u001a\u0006\b²\u0001\u0010\u0087\u0001\"\u0006\b³\u0001\u0010\u0089\u0001R&\u0010·\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¬\u0001\u0010\u001d\u001a\u0005\bµ\u0001\u0010\u001f\"\u0005\b¶\u0001\u0010!R&\u0010»\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010\u001d\u001a\u0005\b¹\u0001\u0010\u001f\"\u0005\bº\u0001\u0010!R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001¨\u0006Î\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanCommonConfirmationScreen;", "Lcom/zepto/pq;", "", "T1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "n1", "Lcom/zepto/e7;", "C", "Lcom/zepto/e7;", "u1", "()Lcom/zepto/e7;", "Y1", "(Lcom/zepto/e7;)V", "binding", "D", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "X1", "(Ljava/lang/String;)V", "application", "E", "N1", "r2", "state_code", "F", "K1", "o2", "rc_number", "G", "G1", "k2", VContant.PURPOSE_CODE, "H", "E1", "i2", "off_code", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "I", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "z1", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "d2", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;)V", "hptObject", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "J", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "y1", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "c2", "(Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;)V", "hpaObject", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "K", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "x1", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "b2", "(Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;)V", "duplicate_RC", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "L", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "v1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "Z1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;)V", "duplicate_FC", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "M", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "H1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "l2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;)V", "rcCancellation", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "N", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "J1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "n2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;)V", "rcSurrender", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "O", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "w1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "a2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;)V", "duplicate_Permit", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "P", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "I1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "m2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;)V", "rcRelease", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "Q", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "D1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "h2", "(Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;)V", "npAuthPermit", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "R", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;)V", "noc_draft", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "S", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "O1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "s2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;)V", "temPermitDraft", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "T", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "P1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "t2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;)V", "transferOfOwnerDraft", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "U", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "F1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "j2", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;)V", "permitRenewalDraft", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "V", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "s1", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "W1", "(Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;)V", "alterDraft", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "W", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "B1", "()Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "f2", "(Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;)V", "mobileNoUpdateDraft", "X", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Y", "M1", "q2", "specialPermitDraft", "r1", "V1", "aadhar_name", "a0", "q1", "U1", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "b0", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "p2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/wa3;", "c0", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "e2", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanCommonConfirmationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public e7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String application;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public HptTerResponse hptObject;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public HPAResModle hpaObject;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public dulicateRcResponseModle duplicate_RC;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DuplicateFitessDraft duplicate_FC;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Data rcCancellation;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrender;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DuplicatePermitDraft duplicate_Permit;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcRelease;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data npAuthPermit;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public NocDraftResponse noc_draft;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data temPermitDraft;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data transferOfOwnerDraft;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data permitRenewalDraft;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data alterDraft;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data mobileNoUpdateDraft;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data specialPermitDraft;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final void Q1(VahanCommonConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n1(this$0, "Are you sure you want to leave?");
    }

    public static final void R1(VahanCommonConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T1();
    }

    public static final void S1(VahanCommonConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) FeesDetailsScreen.class);
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHICATION_TERMINATION_CODE);
                intent.putExtra(VContant.HYPOTHICATION_TERMINATION_CODE, this$0.z1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Hypothecation Termination");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.HYPOTHECATION_ADDITION_CODE);
                intent.putExtra(VContant.HYPOTHECATION_ADDITION_CODE, this$0.y1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Hypothecation Addition");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
                intent.putExtra(VContant.DUPLICATE_RC_CODE, this$0.x1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Issue of Duplicate RC");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NOC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NOC_CODE);
                intent.putExtra(VContant.NOC_CODE, this$0.C1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "No Objection Certificate (NOC)");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_FITNESS_CODE);
                intent.putExtra(VContant.DUPLICATE_FITNESS_CODE, this$0.v1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Duplicate Fitness Certificate");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_CANCELLATION_CODE);
                intent.putExtra(VContant.RC_CANCELLATION_CODE, this$0.H1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Cancellation");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_SURRENDER_RC_CODE);
                intent.putExtra(VContant.RC_SURRENDER_RC_CODE, this$0.J1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Surrender");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_PERMIT_CODE);
                intent.putExtra(VContant.DUPLICATE_PERMIT_CODE, this$0.w1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Duplicate Permit Certificate");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RC_RELEASE_CODE);
                intent.putExtra(VContant.RC_RELEASE_CODE, this$0.I1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "RC Release");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NP_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NP_CODE);
                intent.putExtra(VContant.NP_CODE, this$0.D1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Renewal of NP Authorization Permit");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TEMPERMIT_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.TEMPERMIT_CODE);
                intent.putExtra(VContant.TEMPERMIT_CODE, this$0.O1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Temporary Permit");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.TRANFER_OF_OWNERSHIP_CODE);
                intent.putExtra(VContant.TRANFER_OF_OWNERSHIP_CODE, this$0.P1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Transfer of Ownership");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.PERMIT_RENEWAL_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.PERMIT_RENEWAL_CODE);
                intent.putExtra(VContant.PERMIT_RENEWAL_CODE, this$0.F1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Permit Renewal");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.ALTERATION_CODE);
                intent.putExtra(VContant.ALTERATION_CODE, this$0.s1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Alteration of Vehicle");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.UPDATE_MOBILE_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.UPDATE_MOBILE_CODE);
                intent.putExtra(VContant.UPDATE_MOBILE_CODE, this$0.B1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Update Mobile Number");
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.SPEICAL_PERMIT_CODE, true)) {
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.SPEICAL_PERMIT_CODE);
                intent.putExtra(VContant.SPEICAL_PERMIT_CODE, this$0.M1());
                intent.putExtra(VContant.APP_NO, this$0.t1());
                intent.putExtra("state_code", this$0.N1());
                intent.putExtra("rc_number", this$0.K1());
                intent.putExtra(VContant.PURPOSE_CODE, this$0.G1());
                intent.putExtra(VContant.SERVICE_NAME, "Special Permit");
            }
            intent.putExtra("off_code", this$0.E1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
            intent.putExtra("RC", this$0.K1());
            intent.putExtra("RcDetails", this$0.L1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void T1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void o1(Dialog d, VahanCommonConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final wa3 A1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data B1() {
        com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data data = this.mobileNoUpdateDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobileNoUpdateDraft");
        return null;
    }

    public final NocDraftResponse C1() {
        NocDraftResponse nocDraftResponse = this.noc_draft;
        if (nocDraftResponse != null) {
            return nocDraftResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noc_draft");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data D1() {
        com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data = this.npAuthPermit;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("npAuthPermit");
        return null;
    }

    public final String E1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data F1() {
        com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data = this.permitRenewalDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitRenewalDraft");
        return null;
    }

    public final String G1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final Data H1() {
        Data data = this.rcCancellation;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcCancellation");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data I1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data = this.rcRelease;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcRelease");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data J1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data = this.rcSurrender;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcSurrender");
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

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data M1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data = this.specialPermitDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("specialPermitDraft");
        return null;
    }

    public final String N1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data O1() {
        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data = this.temPermitDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("temPermitDraft");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data P1() {
        com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data data = this.transferOfOwnerDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferOfOwnerDraft");
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

    public final void W1(com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.alterDraft = data;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application = str;
    }

    public final void Y1(e7 e7Var) {
        Intrinsics.checkNotNullParameter(e7Var, "<set-?>");
        this.binding = e7Var;
    }

    public final void Z1(DuplicateFitessDraft duplicateFitessDraft) {
        Intrinsics.checkNotNullParameter(duplicateFitessDraft, "<set-?>");
        this.duplicate_FC = duplicateFitessDraft;
    }

    public final void a2(DuplicatePermitDraft duplicatePermitDraft) {
        Intrinsics.checkNotNullParameter(duplicatePermitDraft, "<set-?>");
        this.duplicate_Permit = duplicatePermitDraft;
    }

    public final void b2(dulicateRcResponseModle dulicatercresponsemodle) {
        Intrinsics.checkNotNullParameter(dulicatercresponsemodle, "<set-?>");
        this.duplicate_RC = dulicatercresponsemodle;
    }

    public final void c2(HPAResModle hPAResModle) {
        Intrinsics.checkNotNullParameter(hPAResModle, "<set-?>");
        this.hpaObject = hPAResModle;
    }

    public final void d2(HptTerResponse hptTerResponse) {
        Intrinsics.checkNotNullParameter(hptTerResponse, "<set-?>");
        this.hptObject = hptTerResponse;
    }

    public final void e2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void f2(com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.mobileNoUpdateDraft = data;
    }

    public final void g2(NocDraftResponse nocDraftResponse) {
        Intrinsics.checkNotNullParameter(nocDraftResponse, "<set-?>");
        this.noc_draft = nocDraftResponse;
    }

    public final void h2(com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.npAuthPermit = data;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void j2(com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.permitRenewalDraft = data;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void l2(Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.rcCancellation = data;
    }

    public final void m2(com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.rcRelease = data;
    }

    public final void n1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanCommonConfirmationScreen.o1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanCommonConfirmationScreen.p1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void n2(com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.rcSurrender = data;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        n1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_of_address_confirmation);
        e7 e7VarC = e7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(e7VarC, "inflate(...)");
        Y1(e7VarC);
        setContentView(u1().b());
        ta3.a.y2(this, u1());
        e2(new wa3(this));
        r2(String.valueOf(getIntent().getStringExtra("state_code")));
        o2(String.valueOf(getIntent().getStringExtra("rc_number")));
        X1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        k2(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        i2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        p2((NrvDetails) serializableExtra);
        V1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        u1().d.i.setText(VContant.INSTANCE.L(this, G1()));
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
            Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.HYPOTHICATION_TERMINATION_CODE);
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse");
            d2((HptTerResponse) serializableExtra2);
            u1().b.setText(A1().b("HPT_Confirm", "Application for Hypothecation Termination saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
            Serializable serializableExtra3 = getIntent().getSerializableExtra(VContant.HYPOTHECATION_ADDITION_CODE);
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPA.HPAResModle");
            c2((HPAResModle) serializableExtra3);
            u1().b.setText(A1().b("HPA_Confirm", "Application for Hypothecation Addition saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
            Serializable serializableExtra4 = getIntent().getSerializableExtra(VContant.DUPLICATE_RC_CODE);
            Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle");
            b2((dulicateRcResponseModle) serializableExtra4);
            u1().b.setText(A1().b("duplicate_Confirm", "Application for Issue of Duplicate RC saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NOC_CODE, true)) {
            Serializable serializableExtra5 = getIntent().getSerializableExtra(VContant.NOC_CODE);
            Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse");
            g2((NocDraftResponse) serializableExtra5);
            u1().b.setText(A1().b("noc_Confirm", "Application for No Objection Certificate (NOC) saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
            Serializable serializableExtra6 = getIntent().getSerializableExtra(VContant.DUPLICATE_FITNESS_CODE);
            Intrinsics.checkNotNull(serializableExtra6, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft");
            Z1((DuplicateFitessDraft) serializableExtra6);
            u1().b.setText(A1().b("duplicate_FitnessCert_Confirm", "Application for Duplicate Fitness Certificate saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
            Serializable serializableExtra7 = getIntent().getSerializableExtra(VContant.RC_CANCELLATION_CODE);
            Intrinsics.checkNotNull(serializableExtra7, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data");
            l2((Data) serializableExtra7);
            u1().b.setText(A1().b("rc_cancellation_Confirm", "Application for RC Cancellation saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
            Serializable serializableExtra8 = getIntent().getSerializableExtra(VContant.RC_SURRENDER_RC_CODE);
            Intrinsics.checkNotNull(serializableExtra8, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data");
            n2((com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) serializableExtra8);
            u1().b.setText(A1().b("rc_Surrender_Confirm", "Application for RC Surrender saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
            Serializable serializableExtra9 = getIntent().getSerializableExtra(VContant.DUPLICATE_PERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra9, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft");
            a2((DuplicatePermitDraft) serializableExtra9);
            u1().b.setText(A1().b("duplicate_Permit_Confirm", "Application for Duplicate Permit saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
            Serializable serializableExtra10 = getIntent().getSerializableExtra(VContant.RC_RELEASE_CODE);
            Intrinsics.checkNotNull(serializableExtra10, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data");
            m2((com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) serializableExtra10);
            u1().b.setText(A1().b("rc_release_Confirm", "Application for RC Release saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NP_CODE, true)) {
            Serializable serializableExtra11 = getIntent().getSerializableExtra(VContant.NP_CODE);
            Intrinsics.checkNotNull(serializableExtra11, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data");
            h2((com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) serializableExtra11);
            u1().b.setText(A1().b("renewalNpAuthorization_Permit_Confirm", "Application for Renewal of NP Authorization Permit saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TEMPERMIT_CODE, true)) {
            Serializable serializableExtra12 = getIntent().getSerializableExtra(VContant.TEMPERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra12, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data");
            s2((com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) serializableExtra12);
            u1().b.setText(A1().b("temporary_permit_Confirm", "Application for Temporary Permit saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
            Serializable serializableExtra13 = getIntent().getSerializableExtra(VContant.TRANFER_OF_OWNERSHIP_CODE);
            Intrinsics.checkNotNull(serializableExtra13, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data");
            t2((com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data) serializableExtra13);
            u1().b.setText(A1().b("to_Confirm", "Application for Transfer of Ownership saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.PERMIT_RENEWAL_CODE, true)) {
            Serializable serializableExtra14 = getIntent().getSerializableExtra(VContant.PERMIT_RENEWAL_CODE);
            Intrinsics.checkNotNull(serializableExtra14, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data");
            j2((com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) serializableExtra14);
            u1().b.setText(A1().b("renewPermit_Confirm", "Application for Permit Renewal saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
            Serializable serializableExtra15 = getIntent().getSerializableExtra(VContant.ALTERATION_CODE);
            Intrinsics.checkNotNull(serializableExtra15, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data");
            W1((com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data) serializableExtra15);
            u1().b.setText(A1().b("altVh_Confirm", "Application for Alteration of Vehicle saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.UPDATE_MOBILE_CODE, true)) {
            Serializable serializableExtra16 = getIntent().getSerializableExtra(VContant.UPDATE_MOBILE_CODE);
            Intrinsics.checkNotNull(serializableExtra16, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data");
            f2((com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data) serializableExtra16);
            u1().b.setText(A1().b("updateMobileNumber", "Application for Update Mobile Number saved successfully in draft with application no.") + ' ' + t1());
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.SPEICAL_PERMIT_CODE, true)) {
            Serializable serializableExtra17 = getIntent().getSerializableExtra(VContant.SPEICAL_PERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra17, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data");
            q2((com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) serializableExtra17);
            u1().b.setText("Application for Special Permit saved successfully in draft with application no. " + t1());
        }
        u1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanCommonConfirmationScreen.Q1(this.a, view);
            }
        });
        u1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanCommonConfirmationScreen.R1(this.a, view);
            }
        });
        u1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanCommonConfirmationScreen.S1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            SaveVahanlog.Companion aVar = SaveVahanlog.INSTANCE;
            NrvDetails nrvDetailsL1 = L1();
            boolean z = this.isFaceless;
            String strT1 = t1();
            String strG1 = G1();
            String strSubstring = K1().substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.a(this, nrvDetailsL1, z, strT1, strG1, strSubstring);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void p2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final String q1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final void q2(com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.specialPermitDraft = data;
    }

    public final String r1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data s1() {
        com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data data = this.alterDraft;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alterDraft");
        return null;
    }

    public final void s2(com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.temPermitDraft = data;
    }

    public final String t1() {
        String str = this.application;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    public final void t2(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.transferOfOwnerDraft = data;
    }

    public final e7 u1() {
        e7 e7Var = this.binding;
        if (e7Var != null) {
            return e7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DuplicateFitessDraft v1() {
        DuplicateFitessDraft duplicateFitessDraft = this.duplicate_FC;
        if (duplicateFitessDraft != null) {
            return duplicateFitessDraft;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_FC");
        return null;
    }

    public final DuplicatePermitDraft w1() {
        DuplicatePermitDraft duplicatePermitDraft = this.duplicate_Permit;
        if (duplicatePermitDraft != null) {
            return duplicatePermitDraft;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_Permit");
        return null;
    }

    public final dulicateRcResponseModle x1() {
        dulicateRcResponseModle dulicatercresponsemodle = this.duplicate_RC;
        if (dulicatercresponsemodle != null) {
            return dulicatercresponsemodle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duplicate_RC");
        return null;
    }

    public final HPAResModle y1() {
        HPAResModle hPAResModle = this.hpaObject;
        if (hPAResModle != null) {
            return hPAResModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hpaObject");
        return null;
    }

    public final HptTerResponse z1() {
        HptTerResponse hptTerResponse = this.hptObject;
        if (hptTerResponse != null) {
            return hptTerResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hptObject");
        return null;
    }
}
