package com.nic.mparivahan.dlservices.ui.dlextract;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.zepto.d86;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mm1;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.r9;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bº\u0001\u0010»\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00104\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR2\u0010@\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010\u001bR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER \u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010H\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\u001bR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\u001b\u001a\u0004\b_\u0010\u001d\"\u0004\b`\u0010\u001fR$\u0010e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u001b\u001a\u0004\bc\u0010\u001d\"\u0004\bd\u0010\u001fR$\u0010i\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u001b\u001a\u0004\bg\u0010\u001d\"\u0004\bh\u0010\u001fR$\u0010m\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\u001b\u001a\u0004\bk\u0010\u001d\"\u0004\bl\u0010\u001fR$\u0010q\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010\u001b\u001a\u0004\bo\u0010\u001d\"\u0004\bp\u0010\u001fR$\u0010u\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010\u001b\u001a\u0004\bs\u0010\u001d\"\u0004\bt\u0010\u001fR$\u0010y\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010\u001b\u001a\u0004\bw\u0010\u001d\"\u0004\bx\u0010\u001fR$\u0010}\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010\u001b\u001a\u0004\b{\u0010\u001d\"\u0004\b|\u0010\u001fR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010\u001b\u001a\u0004\b\u007f\u0010\u001d\"\u0005\b\u0080\u0001\u0010\u001fR(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\u001b\u001a\u0005\b\u0083\u0001\u0010\u001d\"\u0005\b\u0084\u0001\u0010\u001fR(\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010\u001b\u001a\u0005\b\u0087\u0001\u0010\u001d\"\u0005\b\u0088\u0001\u0010\u001fR(\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010\u001b\u001a\u0005\b\u008b\u0001\u0010\u001d\"\u0005\b\u008c\u0001\u0010\u001fR(\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\u001b\u001a\u0005\b\u008f\u0001\u0010\u001d\"\u0005\b\u0090\u0001\u0010\u001fR(\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010\u001b\u001a\u0005\b\u0093\u0001\u0010\u001d\"\u0005\b\u0094\u0001\u0010\u001fR(\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010\u001b\u001a\u0005\b\u0097\u0001\u0010\u001d\"\u0005\b\u0098\u0001\u0010\u001fR(\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010\u001b\u001a\u0005\b\u009b\u0001\u0010\u001d\"\u0005\b\u009c\u0001\u0010\u001fR(\u0010¡\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010\u001b\u001a\u0005\b\u009f\u0001\u0010\u001d\"\u0005\b \u0001\u0010\u001fR(\u0010¥\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010\u001b\u001a\u0005\b£\u0001\u0010\u001d\"\u0005\b¤\u0001\u0010\u001fR&\u0010©\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010\u001b\u001a\u0005\b§\u0001\u0010\u001d\"\u0005\b¨\u0001\u0010\u001fR0\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ª\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dlextract/DLExtractActivity;", "Lcom/zepto/o40;", "", "Y1", "Z1", "d2", "", "message", "n2", "m2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "o2", "Lcom/zepto/r9;", "F", "Lcom/zepto/r9;", "mBinding", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "G", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "M1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "p2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "H", "Ljava/lang/String;", "N1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "I", "O1", "setDob", "dob", "J", "U1", "setMobile_no", "mobile_no", "K", "Q1", "setLastEndorseRto", "lastEndorseRto", "L", "R1", "setLastEndorseState", "lastEndorseState", "M", "S1", "setLastEndorseStateCode", "lastEndorseStateCode", "N", "W1", "setPurCode", "purCode", "Ljava/util/HashMap;", "O", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "P", "lastEndorseRTOCode", "Lcom/zepto/mm1;", "Q", "Lcom/zepto/mm1;", "viewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "R", "Ljava/util/List;", "mReasonList", "S", "willingToRelocate", "Lcom/zepto/wl5;", "T", "Lcom/zepto/wl5;", "X1", "()Lcom/zepto/wl5;", "t2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/ws6;", "U", "Lcom/zepto/ws6;", "T1", "()Lcom/zepto/ws6;", "r2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "V", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "W", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "X", "getPerHouseNo", "setPerHouseNo", "perHouseNo", "Y", "getPerStreet", "setPerStreet", "perStreet", "Z", "getPerLocation", "setPerLocation", "perLocation", "a0", "getPermVillageOrTown", "setPermVillageOrTown", "permVillageOrTown", "b0", "getPerSubDistrict", "setPerSubDistrict", "perSubDistrict", "c0", "getPerDistrict", "setPerDistrict", "perDistrict", "d0", "getPerState", "setPerState", "perState", "e0", "getPerPinCode", "setPerPinCode", "perPinCode", "f0", "getPresHouseNo", "setPresHouseNo", "presHouseNo", "g0", "getPresStreet", "setPresStreet", "presStreet", "h0", "getPresLocation", "setPresLocation", "presLocation", "i0", "getPresVillageOrTown", "setPresVillageOrTown", "presVillageOrTown", "j0", "getPresSubDistrict", "setPresSubDistrict", "presSubDistrict", "k0", "getPresDistrict", "setPresDistrict", "presDistrict", "l0", "getPresState", "setPresState", "presState", "m0", "getPresPincode", "setPresPincode", "presPincode", "n0", "getState_value", "setState_value", "state_value", "Ljava/util/ArrayList;", "o0", "Ljava/util/ArrayList;", "V1", "()Ljava/util/ArrayList;", "s2", "(Ljava/util/ArrayList;)V", "multiListName", "Lcom/zepto/wa3;", "p0", "Lcom/zepto/wa3;", "P1", "()Lcom/zepto/wa3;", "q2", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDLExtractActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DLExtractActivity.kt\ncom/nic/mparivahan/dlservices/ui/dlextract/DLExtractActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,695:1\n1855#2,2:696\n*S KotlinDebug\n*F\n+ 1 DLExtractActivity.kt\ncom/nic/mparivahan/dlservices/ui/dlextract/DLExtractActivity\n*L\n665#1:696,2\n*E\n"})
public final class DLExtractActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public r9 mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mobile_no;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public mm1 viewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String willingToRelocate = "N";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String state_value = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    DLExtractActivity.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    Toast.makeText(DLExtractActivity.this, "Something went wrong,Please try after some time!", 1).show();
                    String statusDesc = getReasonsTransWiseResponse.getStatusDesc();
                    if (statusDesc != null) {
                        DLExtractActivity.this.o2(statusDesc);
                    }
                }
            } catch (Exception unused) {
                DLExtractActivity dLExtractActivity = DLExtractActivity.this;
                String strB = dLExtractActivity.P1().b("service_is_not_present", DLExtractActivity.this.getString(R.string.unable_to_get_details));
                Intrinsics.checkNotNull(strB);
                dLExtractActivity.o2(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetReasonsTransWiseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetAckDetEx getAckDetEx) throws Throwable {
            List<ResultItemSubmit> result;
            r9 r9Var = null;
            try {
                r9 r9Var2 = DLExtractActivity.this.mBinding;
                if (r9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    r9Var2 = null;
                }
                r9Var2.D.c(false);
                DlSubmitResult dlSubmitresult = getAckDetEx.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetEx.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLExtractActivity dLExtractActivity = DLExtractActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetEx.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLExtractActivity.o2(reqStatus2);
                        return;
                    }
                    DLExtractActivity dLExtractActivity2 = DLExtractActivity.this;
                    String strB = dLExtractActivity2.P1().b("service_is_not_present", DLExtractActivity.this.getString(R.string.unable_to_get_details));
                    Intrinsics.checkNotNull(strB);
                    dLExtractActivity2.o2(strB);
                    return;
                }
                DlSubmitResult dlSubmitresult4 = getAckDetEx.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetEx.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    DLExtractActivity dLExtractActivity3 = DLExtractActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLExtractActivity3.T1().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLExtractActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = dLExtractActivity3.getPurCode();
                        String str = dLExtractActivity3.lastEndorseRTOCode;
                        Intrinsics.checkNotNull(str);
                        companion.a(dLExtractActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, str, dLExtractActivity3.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(dLExtractActivity3.X1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLExtractActivity3.s2(new ArrayList());
                        dLExtractActivity3.V1().add(dLExtractActivity3.X1().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLExtractActivity3, resultItemSubmit, dLExtractActivity3.lastEndorseRTOCode, dLExtractActivity3.M1(), dLExtractActivity3.getDlNo(), dLExtractActivity3.getDob(), dLExtractActivity3.getMobile_no(), dLExtractActivity3.getLastEndorseRto(), dLExtractActivity3.getLastEndorseState(), dLExtractActivity3.getLastEndorseStateCode(), dLExtractActivity3.V1());
                }
            } catch (Exception unused2) {
                r9 r9Var3 = DLExtractActivity.this.mBinding;
                if (r9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    r9Var = r9Var3;
                }
                r9Var.D.c(false);
                DLExtractActivity dLExtractActivity4 = DLExtractActivity.this;
                String strB2 = dLExtractActivity4.P1().b("service_is_not_present", DLExtractActivity.this.getString(R.string.unable_to_get_details));
                Intrinsics.checkNotNull(strB2);
                dLExtractActivity4.o2(strB2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetEx) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements d86.b {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ DLExtractActivity b;

        public c(ArrayList arrayList, DLExtractActivity dLExtractActivity) {
            this.a = arrayList;
            this.b = dLExtractActivity;
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            Object obj = this.a.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            int iIntValue = ((Number) obj).intValue();
            r9 r9Var = this.b.mBinding;
            r9 r9Var2 = null;
            if (r9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var = null;
            }
            r9Var.B.setText(str);
            r9 r9Var3 = this.b.mBinding;
            if (r9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var3 = null;
            }
            r9Var3.B.setContentDescription("" + iIntValue);
            r9 r9Var4 = this.b.mBinding;
            if (r9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var4 = null;
            }
            if (Intrinsics.areEqual(r9Var4.B.getText().toString(), "Miscellaneous")) {
                r9 r9Var5 = this.b.mBinding;
                if (r9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    r9Var2 = r9Var5;
                }
                r9Var2.y.setVisibility(0);
                return;
            }
            r9 r9Var6 = this.b.mBinding;
            if (r9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var6;
            }
            r9Var2.y.setVisibility(8);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d c = new d();

        public d() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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

    private final void Y1() {
        if (getIntent() != null) {
            try {
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                String stringExtra = getIntent().getStringExtra("state_value");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.state_value = stringExtra;
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                p2((DldetobjX) serializableExtra);
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorsedRTOCode");
                Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRTOCode = stringExtra5;
                this.mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra6 = getIntent().getStringExtra("purCode");
                Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.purCode = stringExtra6;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                this.whatServiceRequired = (HashMap) serializableExtra2;
                r9 r9Var = this.mBinding;
                r9 r9Var2 = null;
                if (r9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    r9Var = null;
                }
                r9Var.w.setText(P1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
                BioImgObjX bioImgObj = M1().getBioImgObj();
                if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                    r9 r9Var3 = this.mBinding;
                    if (r9Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        r9Var3 = null;
                    }
                    r9Var3.L.setVisibility(8);
                    r9 r9Var4 = this.mBinding;
                    if (r9Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        r9Var2 = r9Var4;
                    }
                    r9Var2.A.setVisibility(0);
                } else {
                    r9 r9Var5 = this.mBinding;
                    if (r9Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        r9Var5 = null;
                    }
                    r9Var5.L.setVisibility(0);
                    r9 r9Var6 = this.mBinding;
                    if (r9Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        r9Var6 = null;
                    }
                    r9Var6.A.setVisibility(8);
                    r9 r9Var7 = this.mBinding;
                    if (r9Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        r9Var2 = r9Var7;
                    }
                    r9Var2.E.setImageBitmap(kt6.a(M1().getBioImgObj().getBiPhoto()));
                }
            } catch (Exception unused) {
                String strB = P1().b("service_is_not_present", getString(R.string.unable_to_get_details));
                Intrinsics.checkNotNull(strB);
                o2(strB);
            }
        }
        if (!Intrinsics.areEqual(this.state_value, "same") || StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true)) {
            this.presHouseNo = String.valueOf(getIntent().getStringExtra("presHouseNo"));
            this.presStreet = String.valueOf(getIntent().getStringExtra("presStreet"));
            this.presLocation = String.valueOf(getIntent().getStringExtra("presLocation"));
            this.presVillageOrTown = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
            this.presSubDistrict = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
            this.presDistrict = String.valueOf(getIntent().getStringExtra("presDistrict"));
            this.presState = String.valueOf(getIntent().getStringExtra("presState"));
            this.presPincode = String.valueOf(getIntent().getStringExtra("presPincode"));
            this.perHouseNo = String.valueOf(getIntent().getStringExtra("perHouseNo"));
            this.perStreet = String.valueOf(getIntent().getStringExtra("perStreet"));
            this.perLocation = String.valueOf(getIntent().getStringExtra("perLocation"));
            this.permVillageOrTown = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
            this.perSubDistrict = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
            this.perDistrict = String.valueOf(getIntent().getStringExtra("perDistrict"));
            this.perState = String.valueOf(getIntent().getStringExtra("perState"));
            this.perPinCode = String.valueOf(getIntent().getStringExtra("perPinCode"));
        }
    }

    private final void Z1() {
        r9 r9Var = this.mBinding;
        r9 r9Var2 = null;
        if (r9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var = null;
        }
        r9Var.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.a2(this.a, view);
            }
        });
        r9 r9Var3 = this.mBinding;
        if (r9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var3 = null;
        }
        r9Var3.F.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.b2(view);
            }
        });
        this.viewModel = (mm1) new z(this).a(mm1.class);
        if (com.nic.mparivahan.a.a.a(this)) {
            mm1 mm1Var = this.viewModel;
            if (mm1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                mm1Var = null;
            }
            mm1Var.k();
        } else {
            Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        mm1 mm1Var2 = this.viewModel;
        if (mm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mm1Var2 = null;
        }
        mm1Var2.i().g(this, new e(new a()));
        mm1 mm1Var3 = this.viewModel;
        if (mm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mm1Var3 = null;
        }
        mm1Var3.j().g(this, new e(new b()));
        r9 r9Var4 = this.mBinding;
        if (r9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var4 = null;
        }
        TextView textView = r9Var4.R;
        r9 r9Var5 = this.mBinding;
        if (r9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var5 = null;
        }
        textView.setPaintFlags(r9Var5.R.getPaintFlags() | 8);
        r9 r9Var6 = this.mBinding;
        if (r9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            r9Var2 = r9Var6;
        }
        r9Var2.R.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.c2(this.a, view);
            }
        });
    }

    public static final void a2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void b2(View view) {
    }

    public static final void c2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.M1());
            intent.putExtra("Mobile_no", this$0.mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void d2() {
        r9 r9Var = this.mBinding;
        r9 r9Var2 = null;
        if (r9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var = null;
        }
        r9Var.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.f2(this.a, view);
            }
        });
        r9 r9Var3 = this.mBinding;
        if (r9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var3 = null;
        }
        r9Var3.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.g2(this.a, view);
            }
        });
        r9 r9Var4 = this.mBinding;
        if (r9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var4 = null;
        }
        r9Var4.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.h2(this.a, view);
            }
        });
        r9 r9Var5 = this.mBinding;
        if (r9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var5 = null;
        }
        r9Var5.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.i2(this.a, view);
            }
        });
        r9 r9Var6 = this.mBinding;
        if (r9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            r9Var2 = r9Var6;
        }
        r9Var2.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.e2(this.a, view);
            }
        });
    }

    public static final void e2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.P1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        try {
            r9 r9Var = this$0.mBinding;
            r9 r9Var2 = null;
            if (r9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var = null;
            }
            Editable text = r9Var.B.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0) {
                String strB = this$0.P1().b("label_select_reason", this$0.getString(R.string.sel_rsn));
                Intrinsics.checkNotNull(strB);
                this$0.o2(strB);
                return;
            }
            r9 r9Var3 = this$0.mBinding;
            if (r9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var3 = null;
            }
            if (r9Var3.y.getVisibility() != 0) {
                if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
                    String strB2 = this$0.P1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                    Intrinsics.checkNotNull(strB2);
                    this$0.n2(strB2);
                    return;
                }
                r9 r9Var4 = this$0.mBinding;
                if (r9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    r9Var4 = null;
                }
                Editable text2 = r9Var4.I.getText();
                Intrinsics.checkNotNull(text2);
                if (text2.length() == 0) {
                    String strB3 = this$0.P1().b("label_mb", "");
                    Intrinsics.checkNotNull(strB3);
                    this$0.o2(strB3);
                    return;
                }
                r9 r9Var5 = this$0.mBinding;
                if (r9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    r9Var5 = null;
                }
                Editable text3 = r9Var5.I.getText();
                Intrinsics.checkNotNull(text3);
                if (text3.length() < 10) {
                    String strB4 = this$0.P1().b("label_log_entr_vali_mobno", "");
                    Intrinsics.checkNotNull(strB4);
                    this$0.o2(strB4);
                    return;
                }
                mt6.a aVar = mt6.a;
                r9 r9Var6 = this$0.mBinding;
                if (r9Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    r9Var2 = r9Var6;
                }
                if (aVar.t(String.valueOf(r9Var2.I.getText()))) {
                    String strB5 = this$0.P1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                    Intrinsics.checkNotNull(strB5);
                    this$0.n2(strB5);
                    return;
                } else {
                    String strB6 = this$0.P1().b("label_log_entr_vali_mobno", "");
                    Intrinsics.checkNotNull(strB6);
                    this$0.o2(strB6);
                    return;
                }
            }
            r9 r9Var7 = this$0.mBinding;
            if (r9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var7 = null;
            }
            Editable text4 = r9Var7.C.getText();
            Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
            if (text4.length() == 0) {
                String strB7 = this$0.P1().b("edit_dl_serv_sel_reason", "");
                Intrinsics.checkNotNull(strB7);
                this$0.o2(strB7);
                return;
            }
            if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
                String strB8 = this$0.P1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                Intrinsics.checkNotNull(strB8);
                this$0.n2(strB8);
                return;
            }
            r9 r9Var8 = this$0.mBinding;
            if (r9Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var8 = null;
            }
            Editable text5 = r9Var8.I.getText();
            Intrinsics.checkNotNull(text5);
            if (text5.length() == 0) {
                String strB9 = this$0.P1().b("label_mb", "");
                Intrinsics.checkNotNull(strB9);
                this$0.o2(strB9);
                return;
            }
            r9 r9Var9 = this$0.mBinding;
            if (r9Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var9 = null;
            }
            Editable text6 = r9Var9.I.getText();
            Intrinsics.checkNotNull(text6);
            if (text6.length() < 10) {
                String strB10 = this$0.P1().b("label_log_entr_vali_mobno", "");
                Intrinsics.checkNotNull(strB10);
                this$0.o2(strB10);
                return;
            }
            mt6.a aVar2 = mt6.a;
            r9 r9Var10 = this$0.mBinding;
            if (r9Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var10;
            }
            if (aVar2.t(String.valueOf(r9Var2.I.getText()))) {
                String strB11 = this$0.P1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                Intrinsics.checkNotNull(strB11);
                this$0.n2(strB11);
            } else {
                String strB12 = this$0.P1().b("label_log_entr_vali_mobno", "");
                Intrinsics.checkNotNull(strB12);
                this$0.o2(strB12);
            }
        } catch (Exception unused) {
            String strB13 = this$0.P1().b("service_is_not_present", this$0.getString(R.string.are_you_want_to_proceed));
            Intrinsics.checkNotNull(strB13);
            this$0.o2(strB13);
        }
    }

    public static final void f2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            r9 r9Var = this$0.mBinding;
            r9 r9Var2 = null;
            if (r9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var = null;
            }
            r9Var.S.setChecked(true);
            r9 r9Var3 = this$0.mBinding;
            if (r9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var3 = null;
            }
            r9Var3.H.setChecked(false);
            r9 r9Var4 = this$0.mBinding;
            if (r9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var4 = null;
            }
            r9Var4.C.setText((CharSequence) null);
            r9 r9Var5 = this$0.mBinding;
            if (r9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var5 = null;
            }
            r9Var5.B.setText((CharSequence) null);
            r9 r9Var6 = this$0.mBinding;
            if (r9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var6 = null;
            }
            r9Var6.B.setContentDescription(null);
            r9 r9Var7 = this$0.mBinding;
            if (r9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var7;
            }
            r9Var2.y.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public static final void g2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.willingToRelocate = "Y";
            r9 r9Var = this$0.mBinding;
            r9 r9Var2 = null;
            if (r9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var = null;
            }
            r9Var.H.setChecked(false);
            r9 r9Var3 = this$0.mBinding;
            if (r9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var3 = null;
            }
            r9Var3.S.setChecked(true);
            r9 r9Var4 = this$0.mBinding;
            if (r9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var4 = null;
            }
            r9Var4.I.setText((CharSequence) null);
            r9 r9Var5 = this$0.mBinding;
            if (r9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var5;
            }
            r9Var2.I.setVisibility(0);
        } catch (Exception unused) {
            String strB = this$0.P1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details));
            Intrinsics.checkNotNull(strB);
            this$0.o2(strB);
        }
    }

    public static final void h2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.willingToRelocate = "N";
            r9 r9Var = this$0.mBinding;
            r9 r9Var2 = null;
            if (r9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var = null;
            }
            r9Var.S.setChecked(false);
            r9 r9Var3 = this$0.mBinding;
            if (r9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var3 = null;
            }
            r9Var3.H.setChecked(true);
            r9 r9Var4 = this$0.mBinding;
            if (r9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var4 = null;
            }
            r9Var4.I.setText((CharSequence) null);
            r9 r9Var5 = this$0.mBinding;
            if (r9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var5;
            }
            r9Var2.I.setVisibility(8);
        } catch (Exception unused) {
            String strB = this$0.P1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details));
            Intrinsics.checkNotNull(strB);
            this$0.o2(strB);
        }
    }

    public static final void i2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2();
    }

    public static final void j2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.M1());
            intent.putExtra("Mobile_no", this$0.mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(View view) {
    }

    public static final void l2(DLExtractActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void m2() {
        Integer reasonCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                Intrinsics.checkNotNull(reasonsMasterItem);
                if (!Intrinsics.areEqual(reasonsMasterItem.getReasonName(), "NULL") && ((reasonCode = reasonsMasterItem.getReasonCode()) == null || reasonCode.intValue() != 0)) {
                    arrayList.add(String.valueOf(reasonsMasterItem.getReasonName()));
                    Integer reasonCode2 = reasonsMasterItem.getReasonCode();
                    Intrinsics.checkNotNull(reasonCode2);
                    arrayList2.add(reasonCode2);
                }
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new c(arrayList2, this));
    }

    public final DldetobjX M1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final wa3 P1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ws6 T1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final ArrayList V1() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final wl5 X1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void n2(String message) {
        mm1 mm1Var;
        mm1 mm1Var2;
        mm1 mm1Var3;
        r9 r9Var = this.mBinding;
        r9 r9Var2 = null;
        if (r9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var = null;
        }
        String string = r9Var.B.getContentDescription().toString();
        if (!Intrinsics.areEqual(this.state_value, "same") || !Intrinsics.areEqual(this.bioRecGenesis, "S") || !Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
            if (Intrinsics.areEqual(this.state_value, "same") && Intrinsics.areEqual(this.bioRecGenesis, "S") && !Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
                r9 r9Var3 = this.mBinding;
                if (r9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    r9Var3 = null;
                }
                r9Var3.D.c(true);
                mm1 mm1Var4 = this.viewModel;
                if (mm1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    mm1Var2 = null;
                } else {
                    mm1Var2 = mm1Var4;
                }
                String str = this.dlNo;
                String str2 = this.dob;
                String str3 = this.lastEndorseRTOCode;
                r9 r9Var4 = this.mBinding;
                if (r9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    r9Var2 = r9Var4;
                }
                String string2 = r9Var2.B.getText().toString();
                String str4 = this.mobile_no;
                Intrinsics.checkNotNull(str4);
                mm1Var2.g(str, str2, str3, string, string2, "N", " ", str4, X1().f(), X1().g(), X1().e(), X1().h());
                return;
            }
            r9 r9Var5 = this.mBinding;
            if (r9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                r9Var5 = null;
            }
            r9Var5.D.c(true);
            mm1 mm1Var5 = this.viewModel;
            if (mm1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                mm1Var = null;
            } else {
                mm1Var = mm1Var5;
            }
            String str5 = this.dlNo;
            String str6 = this.dob;
            String str7 = this.lastEndorseRTOCode;
            r9 r9Var6 = this.mBinding;
            if (r9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                r9Var2 = r9Var6;
            }
            String string3 = r9Var2.B.getText().toString();
            String str8 = this.mobile_no;
            Intrinsics.checkNotNull(str8);
            mm1Var.g(str5, str6, str7, string, string3, "N", " ", str8, X1().f(), X1().g(), X1().e(), X1().h());
            return;
        }
        r9 r9Var7 = this.mBinding;
        if (r9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var7 = null;
        }
        r9Var7.D.c(true);
        mm1 mm1Var6 = this.viewModel;
        if (mm1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mm1Var3 = null;
        } else {
            mm1Var3 = mm1Var6;
        }
        String str9 = this.dlNo;
        String str10 = this.dob;
        String str11 = this.lastEndorseRTOCode;
        r9 r9Var8 = this.mBinding;
        if (r9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            r9Var2 = r9Var8;
        }
        String string4 = r9Var2.B.getText().toString();
        String str12 = this.presHouseNo;
        Intrinsics.checkNotNull(str12);
        String str13 = this.presStreet;
        Intrinsics.checkNotNull(str13);
        String str14 = this.presLocation;
        Intrinsics.checkNotNull(str14);
        String str15 = this.presVillageOrTown;
        Intrinsics.checkNotNull(str15);
        String str16 = this.presSubDistrict;
        Intrinsics.checkNotNull(str16);
        String str17 = this.presDistrict;
        Intrinsics.checkNotNull(str17);
        String str18 = this.presState;
        Intrinsics.checkNotNull(str18);
        String str19 = this.presPincode;
        Intrinsics.checkNotNull(str19);
        String str20 = this.perHouseNo;
        Intrinsics.checkNotNull(str20);
        String str21 = this.perStreet;
        Intrinsics.checkNotNull(str21);
        String str22 = this.perLocation;
        Intrinsics.checkNotNull(str22);
        String str23 = this.permVillageOrTown;
        Intrinsics.checkNotNull(str23);
        String str24 = this.perSubDistrict;
        Intrinsics.checkNotNull(str24);
        String str25 = this.perDistrict;
        Intrinsics.checkNotNull(str25);
        String str26 = this.perState;
        Intrinsics.checkNotNull(str26);
        String str27 = this.perPinCode;
        Intrinsics.checkNotNull(str27);
        String str28 = this.mobile_no;
        Intrinsics.checkNotNull(str28);
        mm1Var3.h(str9, str10, str11, string, string4, "N", " ", str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, X1().f(), X1().g(), X1().e(), X1().h());
    }

    public final void o2(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = P1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = P1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, d.c, 16, null);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_extract);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (r9) lq7VarF;
        t2(new wl5(this));
        r2(new ws6(this));
        q2(new wa3(this));
        ta3.a aVar = ta3.a;
        r9 r9Var = this.mBinding;
        r9 r9Var2 = null;
        if (r9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var = null;
        }
        aVar.O0(this, r9Var);
        Y1();
        Z1();
        d2();
        r9 r9Var3 = this.mBinding;
        if (r9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var3 = null;
        }
        r9Var3.G.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.j2(this.a, view);
            }
        });
        r9 r9Var4 = this.mBinding;
        if (r9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var4 = null;
        }
        r9Var4.G.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.k2(view);
            }
        });
        r9 r9Var5 = this.mBinding;
        if (r9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var5 = null;
        }
        r9Var5.G.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLExtractActivity.l2(this.a, view);
            }
        });
        r9 r9Var6 = this.mBinding;
        if (r9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var6 = null;
        }
        r9Var6.G.e.setVisibility(8);
        r9 r9Var7 = this.mBinding;
        if (r9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var7 = null;
        }
        r9Var7.F.g.setText(X1().k());
        r9 r9Var8 = this.mBinding;
        if (r9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            r9Var8 = null;
        }
        r9Var8.R.setVisibility(0);
        r9 r9Var9 = this.mBinding;
        if (r9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            r9Var2 = r9Var9;
        }
        r9Var2.w.setVisibility(0);
    }

    public final void p2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void q2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void r2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void s2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void t2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
