package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.Data;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.TOPurposeResponseData;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.bc6;
import com.zepto.cc6;
import com.zepto.dc6;
import com.zepto.ec6;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.of;
import com.zepto.om6;
import com.zepto.pq;
import com.zepto.qb6;
import com.zepto.rb6;
import com.zepto.sb6;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import com.zepto.yj4;
import com.zepto.zj4;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010<\u001a\n 5*\u0004\u0018\u000104048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR\"\u0010W\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR\"\u0010[\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR\"\u0010_\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010>\u001a\u0004\b]\u0010@\"\u0004\b^\u0010BR\"\u0010c\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010>\u001a\u0004\ba\u0010@\"\u0004\bb\u0010BR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010o\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010>\u001a\u0004\bm\u0010@\"\u0004\bn\u0010BR\"\u0010s\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010>\u001a\u0004\bq\u0010@\"\u0004\br\u0010BR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010>\u001a\u0005\b\u0085\u0001\u0010@\"\u0005\b\u0086\u0001\u0010BR&\u0010\u008b\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010>\u001a\u0005\b\u0089\u0001\u0010@\"\u0005\b\u008a\u0001\u0010BR&\u0010\u008f\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010>\u001a\u0005\b\u008d\u0001\u0010@\"\u0005\b\u008e\u0001\u0010BR*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R)\u0010\u009e\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bF\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R6\u0010¦\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u009f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R2\u0010®\u0001\u001a\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010§\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R,\u0010¶\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R,\u0010º\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010±\u0001\u001a\u0006\b¸\u0001\u0010³\u0001\"\u0006\b¹\u0001\u0010µ\u0001R-\u0010Á\u0001\u001a\u0013\u0012\u000e\u0012\f 5*\u0005\u0018\u00010¼\u00010¼\u00010»\u00018\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/TransferOfOwnerShipActivitySeller;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "p2", "Lcom/zepto/om6;", "C", "Lcom/zepto/om6;", "s1", "()Lcom/zepto/om6;", "V1", "(Lcom/zepto/om6;)V", "binding", "Lcom/zepto/sb6;", "D", "Lcom/zepto/sb6;", "K1", "()Lcom/zepto/sb6;", "o2", "(Lcom/zepto/sb6;)V", "viewModelTO", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "l2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;)V", "retrofitServiceTO", "Lcom/zepto/ec6;", "F", "Lcom/zepto/ec6;", "J1", "()Lcom/zepto/ec6;", "n2", "(Lcom/zepto/ec6;)V", "viewModelPurposeTO", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "k2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;)V", "retrofitServicePurposeTO", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "H", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "I", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "formated_date", "", "J", "Z", "L1", "()Z", "setFaceless", "(Z)V", "isFaceless", "K", "E1", "h2", "rc_number", "L", "z1", "c2", "off_code", "M", "t1", "W1", "chasis_no", "N", "u1", "X1", "chasis_no5", "O", "getReg_no", "j2", "reg_no", "P", "A1", "d2", "office_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "i2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "R", "r1", "U1", "aadhar_name", "S", "q1", "T1", "aadhar_address", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "Z1", "(Lcom/zepto/wa3;)V", "languageSession", "Landroid/app/ProgressDialog;", "U", "Landroid/app/ProgressDialog;", "C1", "()Landroid/app/ProgressDialog;", "f2", "(Landroid/app/ProgressDialog;)V", "pDialog", "V", "D1", "g2", "purposeGet", "W", "B1", "e2", "ownershipTypeGet", "X", "getNewOwnerCatagoryGet", "b2", "newOwnerCatagoryGet", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "m2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "Ljava/util/HashMap;", "a0", "Ljava/util/HashMap;", "getServiceSelectionHashMap", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "Ljava/util/ArrayList;", "b0", "Ljava/util/ArrayList;", "y1", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "c0", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "d0", "getDraftObj", "setDraftObj", "draftObj", "Lcom/zepto/of;", "Landroid/content/Intent;", "e0", "Lcom/zepto/of;", "getMessageLauncher", "()Lcom/zepto/of;", "messageLauncher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TransferOfOwnerShipActivitySeller extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public om6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public sb6 viewModelTO;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOCommonService retrofitServiceTO;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ec6 viewModelPurposeTO;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TOPurposeService retrofitServicePurposeTO;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String chasis_no;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String chasis_no5;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String reg_no;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String office_code;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String purposeGet;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String ownershipTypeGet;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String newOwnerCatagoryGet;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public MultiServiceDraftTO draftObj;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final of messageLauncher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
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
        public final void a(SellerResponse sellerResponse) {
            Integer statusCode;
            TransferOfOwnerShipActivitySeller.this.C1().dismiss();
            ApiMessage apiMessage = sellerResponse.getApiMessage();
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller = TransferOfOwnerShipActivitySeller.this;
                ApiMessage apiMessage2 = sellerResponse.getApiMessage();
                transferOfOwnerShipActivitySeller.p2(transferOfOwnerShipActivitySeller, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
                return;
            }
            try {
                SaveVahanlog.Companion companion = SaveVahanlog.INSTANCE;
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller2 = TransferOfOwnerShipActivitySeller.this;
                NrvDetails nrvDetailsF1 = transferOfOwnerShipActivitySeller2.F1();
                boolean isFaceless = TransferOfOwnerShipActivitySeller.this.getIsFaceless();
                Data data = sellerResponse.getData();
                String strValueOf = String.valueOf(data != null ? data.getApplNo() : null);
                String strSubstring = TransferOfOwnerShipActivitySeller.this.E1().substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                companion.a(transferOfOwnerShipActivitySeller2, nrvDetailsF1, isFaceless, strValueOf, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, strSubstring);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(TransferOfOwnerShipActivitySeller.this, (Class<?>) TransferOfOwnerShipConfirmationScreen.class);
            Data data2 = sellerResponse.getData();
            intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
            intent.putExtra("RcDetails", TransferOfOwnerShipActivitySeller.this.F1());
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, TransferOfOwnerShipActivitySeller.this.getMultiServiceList());
            TransferOfOwnerShipActivitySeller.this.startActivity(intent);
            TransferOfOwnerShipActivitySeller.this.finishAffinity();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SellerResponse) obj);
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
            TransferOfOwnerShipActivitySeller.this.C1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "error", true)) {
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller = TransferOfOwnerShipActivitySeller.this;
                transferOfOwnerShipActivitySeller.p2(transferOfOwnerShipActivitySeller, str);
            } else {
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller2 = TransferOfOwnerShipActivitySeller.this;
                transferOfOwnerShipActivitySeller2.p2(transferOfOwnerShipActivitySeller2, str);
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(ToCommonModel2 toCommonModel2) {
            TransferOfOwnerShipActivitySeller.this.C1().dismiss();
            try {
                Integer rc_owner_srNo = TransferOfOwnerShipActivitySeller.this.F1().getRc_owner_srNo();
                TransferOfOwnerShipActivitySeller.this.s1().d.setText(String.valueOf(rc_owner_srNo != null ? Integer.valueOf(rc_owner_srNo.intValue() + 1) : null));
                ArrayList<OwnerCatagory> ownerCatagory = toCommonModel2.getData().getOwnerCatagory();
                ownerCatagory.add(0, new OwnerCatagory(0, "Select Owner Category"));
                TransferOfOwnerShipActivitySeller.this.s1().j.setAdapter((SpinnerAdapter) new yj4(TransferOfOwnerShipActivitySeller.this, ownerCatagory));
                ArrayList<OwnerShipType> ownerShipType = toCommonModel2.getData().getOwnerShipType();
                ownerShipType.add(0, new OwnerShipType("Select Ownership Type", 0));
                TransferOfOwnerShipActivitySeller.this.s1().o.setAdapter((SpinnerAdapter) new zj4(TransferOfOwnerShipActivitySeller.this, ownerShipType));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ToCommonModel2) obj);
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
            TransferOfOwnerShipActivitySeller.this.C1().dismiss();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(TOPurposeResponseData tOPurposeResponseData) {
            try {
                ArrayList<com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data> data = tOPurposeResponseData.getData();
                if (data != null) {
                    data.add(0, new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data(0, "Select Purpose", "0"));
                }
                TransferOfOwnerShipActivitySeller.this.s1().s.setAdapter((SpinnerAdapter) new bc6(TransferOfOwnerShipActivitySeller.this, data));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TOPurposeResponseData) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            TransferOfOwnerShipActivitySeller.this.g2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
            Log.e("whichPurpose", TransferOfOwnerShipActivitySeller.this.D1());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            TransferOfOwnerShipActivitySeller.this.e2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
            Log.e("whichPurpose2", TransferOfOwnerShipActivitySeller.this.B1());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            TransferOfOwnerShipActivitySeller.this.b2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public TransferOfOwnerShipActivitySeller() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.fm6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TransferOfOwnerShipActivitySeller.M1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.messageLauncher = ofVarB0;
    }

    public static final void M1(TransferOfOwnerShipActivitySeller this$0, gf gfVar) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Test", "Working...");
        if (gfVar.d() == -1) {
            if (this$0.isFaceless) {
                Object selectedItem = this$0.s1().o.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
                OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
                Object selectedItem2 = this$0.s1().j.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
                OwnerCatagory ownerCatagory = (OwnerCatagory) selectedItem2;
                String strU1 = this$0.u1();
                String strValueOf = String.valueOf(this$0.F1().getState_cd());
                String string = this$0.s1().b.getText().toString();
                String string2 = this$0.s1().f.getText().toString();
                String string3 = this$0.s1().h.getText().toString();
                hz0.a aVar = hz0.a;
                String strR = aVar.r();
                int i2 = Integer.parseInt(this$0.A1());
                String strR2 = aVar.r();
                int catgCode = ownerCatagory.getCatgCode();
                String catgDescription = ownerCatagory.getCatgDescription();
                int owCode = ownerShipType.getOwCode();
                String codeDescription = ownerShipType.getCodeDescription();
                String string4 = this$0.s1().l.getText().toString();
                Integer rc_owner_srNo = this$0.F1().getRc_owner_srNo();
                numValueOf = rc_owner_srNo != null ? Integer.valueOf(rc_owner_srNo.intValue() + 1) : null;
                Intrinsics.checkNotNull(numValueOf);
                TransferOwnershipDto transferOwnershipDto = new TransferOwnershipDto(" ", "A", strU1, "", "", "", 0, 0, strValueOf, string, string2, " ", false, string3, strR, i2, strR2, catgCode, catgDescription, owCode, codeDescription, " ", string4, numValueOf.intValue(), this$0.s1().q.getText().toString(), "", "", "", 0, 0, "", Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), "SALE", this$0.F1().getRc_regn_no(), Long.parseLong(this$0.s1().z.getText().toString()), this$0.s1().B.getText().toString(), "", String.valueOf(this$0.F1().getState_cd()), aVar.r());
                MultiServiceDraftTO multiServiceDraftTO = this$0.multiServiceobj;
                Intrinsics.checkNotNull(multiServiceDraftTO);
                this$0.draftObj = MultiServiceDraftTO.copy$default(multiServiceDraftTO, null, "A", null, this$0.s1().h.getText().toString(), null, null, null, null, 0, null, null, null, String.valueOf(this$0.F1().getState_cd()), "S", transferOwnershipDto, null, 36853, null);
                String json = new Gson().toJson(this$0.draftObj);
                this$0.C1().show();
                MultiSelectionViewModel multiSelectionViewModelI1 = this$0.I1();
                Intrinsics.checkNotNull(json);
                multiSelectionViewModelI1.w(json, this$0.isFaceless);
                return;
            }
            Object selectedItem3 = this$0.s1().o.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
            OwnerShipType ownerShipType2 = (OwnerShipType) selectedItem3;
            Object selectedItem4 = this$0.s1().j.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
            OwnerCatagory ownerCatagory2 = (OwnerCatagory) selectedItem4;
            String strU12 = this$0.u1();
            String strValueOf2 = String.valueOf(this$0.F1().getState_cd());
            String string5 = this$0.s1().b.getText().toString();
            String string6 = this$0.s1().f.getText().toString();
            String string7 = this$0.s1().h.getText().toString();
            hz0.a aVar2 = hz0.a;
            String strR3 = aVar2.r();
            int i3 = Integer.parseInt(this$0.A1());
            String strR4 = aVar2.r();
            int catgCode2 = ownerCatagory2.getCatgCode();
            String catgDescription2 = ownerCatagory2.getCatgDescription();
            int owCode2 = ownerShipType2.getOwCode();
            String codeDescription2 = ownerShipType2.getCodeDescription();
            String string8 = this$0.s1().l.getText().toString();
            Integer rc_owner_srNo2 = this$0.F1().getRc_owner_srNo();
            numValueOf = rc_owner_srNo2 != null ? Integer.valueOf(rc_owner_srNo2.intValue() + 1) : null;
            Intrinsics.checkNotNull(numValueOf);
            TransferOwnershipDto transferOwnershipDto2 = new TransferOwnershipDto(" ", "M", strU12, "", "", "", 0, 0, strValueOf2, string5, string6, " ", false, string7, strR3, i3, strR4, catgCode2, catgDescription2, owCode2, codeDescription2, " ", string8, numValueOf.intValue(), this$0.s1().q.getText().toString(), "", "", "", 0, 0, "", Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), "SALE", this$0.F1().getRc_regn_no(), Long.parseLong(this$0.s1().z.getText().toString()), this$0.s1().B.getText().toString(), "", String.valueOf(this$0.F1().getState_cd()), aVar2.r());
            MultiServiceDraftTO multiServiceDraftTO2 = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraftTO2);
            this$0.draftObj = MultiServiceDraftTO.copy$default(multiServiceDraftTO2, null, "M", null, this$0.s1().h.getText().toString(), null, null, null, null, 0, null, null, null, String.valueOf(this$0.F1().getState_cd()), "S", transferOwnershipDto2, null, 36853, null);
            String json2 = new Gson().toJson(this$0.draftObj);
            this$0.C1().show();
            MultiSelectionViewModel multiSelectionViewModelI12 = this$0.I1();
            Intrinsics.checkNotNull(json2);
            multiSelectionViewModelI12.w(json2, this$0.isFaceless);
        }
    }

    public static final void N1(TransferOfOwnerShipActivitySeller this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.E1());
        intent.putExtra("RcDetails", this$0.F1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void O1(TransferOfOwnerShipActivitySeller this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.Y1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.s1().B.setText(this$0.v1().toString());
    }

    public static final void P1(TransferOfOwnerShipActivitySeller this$0, DatePickerDialog.OnDateSetListener dateSetListenerNominee, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerNominee, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerNominee, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void Q1(TransferOfOwnerShipActivitySeller this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.w1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void R1(TransferOfOwnerShipActivitySeller this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object selectedItem = this$0.s1().o.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
        OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
        Object selectedItem2 = this$0.s1().j.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
        if (this$0.s1().s.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_purpose", this$0.getString(R.string.to_validation_purpose)), 0).show();
            return;
        }
        if (this$0.s1().o.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_ownershipType", this$0.getString(R.string.to_validation_ownershipType)), 0).show();
            return;
        }
        if (this$0.s1().j.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_newOwnerCat", this$0.getString(R.string.to_validation_newOwnerCat)), 0).show();
            return;
        }
        if (this$0.s1().l.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_newOwnerName", this$0.getString(R.string.to_validation_newOwnerName)), 0).show();
            return;
        }
        if (this$0.s1().f.getText().length() == 0 && StringsKt__StringsJVMKt.equals(ownerShipType.getCodeDescription(), "INDIVIDUAL", true)) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_father_husband_name", this$0.getString(R.string.please_enter_father_husband_name)), 0).show();
            return;
        }
        if (this$0.s1().z.getText().length() < 1) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_saleAmount", this$0.getString(R.string.to_validation_saleAmount)), 0).show();
            return;
        }
        if (CharsKt__CharKt.equals(this$0.s1().z.getText().toString().charAt(0), '0', true)) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_valid_sale_amount", this$0.getString(R.string.please_enter_valid_sale_amount)), 0).show();
            return;
        }
        if (this$0.s1().B.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("to_validation_saleDate", this$0.getString(R.string.please_enter_valid_sale_amount)), 0).show();
            return;
        }
        mt6.a aVar = mt6.a;
        if (!aVar.t(this$0.s1().h.getText().toString())) {
            Toast.makeText(this$0, this$0.w1().b("label_log_entr_vali_mobno", this$0.getString(R.string.please_enter_the_valid)), 1).show();
            return;
        }
        if (this$0.s1().b.length() > 0 && !aVar.u(this$0.s1().b.getText().toString())) {
            Toast.makeText(this$0, this$0.w1().b("label_log_entr_valid_email", this$0.getString(R.string.label_log_entr_valid_email)), 1).show();
            return;
        }
        if (!this$0.isFaceless) {
            Intent intent = new Intent(this$0, (Class<?>) ToGenerateOTPScreenForResult.class);
            intent.putExtra("stateCd", this$0.F1().getState_cd());
            intent.putExtra("off_code", this$0.z1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra("RcDetails", this$0.F1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
            intent.putExtra("MobNo", this$0.s1().h.getText().toString());
            intent.putExtra("ServiceName", "Transfer of OwnerShip (Seller)");
            this$0.messageLauncher.a(intent);
            return;
        }
        this$0.serviceSelectionHashMap.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        Intent intent2 = new Intent(this$0, (Class<?>) ToGenerateOTPScreenForResult.class);
        intent2.putExtra("stateCd", this$0.F1().getState_cd());
        intent2.putExtra("off_code", this$0.z1());
        intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent2.putExtra("RcDetails", this$0.F1());
        intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        intent2.putExtra("MobNo", this$0.s1().h.getText().toString());
        intent2.putExtra("ServiceName", "Transfer of OwnerShip (Seller)");
        this$0.messageLauncher.a(intent2);
    }

    public static final void S1(TransferOfOwnerShipActivitySeller this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s1().l.setText("");
        this$0.s1().f.setText("");
        this$0.s1().z.setText("");
        this$0.s1().q.setText("");
        this$0.s1().b.setText("");
        this$0.s1().h.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.office_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("office_code");
        return null;
    }

    public final String B1() {
        String str = this.ownershipTypeGet;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ownershipTypeGet");
        return null;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String D1() {
        String str = this.purposeGet;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purposeGet");
        return null;
    }

    public final String E1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails F1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TOPurposeService G1() {
        TOPurposeService tOPurposeService = this.retrofitServicePurposeTO;
        if (tOPurposeService != null) {
            return tOPurposeService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServicePurposeTO");
        return null;
    }

    public final TOCommonService H1() {
        TOCommonService tOCommonService = this.retrofitServiceTO;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceTO");
        return null;
    }

    public final MultiSelectionViewModel I1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final ec6 J1() {
        ec6 ec6Var = this.viewModelPurposeTO;
        if (ec6Var != null) {
            return ec6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelPurposeTO");
        return null;
    }

    public final sb6 K1() {
        sb6 sb6Var = this.viewModelTO;
        if (sb6Var != null) {
            return sb6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelTO");
        return null;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void V1(om6 om6Var) {
        Intrinsics.checkNotNullParameter(om6Var, "<set-?>");
        this.binding = om6Var;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chasis_no = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chasis_no5 = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void Z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void a2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newOwnerCatagoryGet = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.office_code = str;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ownershipTypeGet = str;
    }

    public final void f2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purposeGet = str;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void i2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reg_no = str;
    }

    public final void k2(TOPurposeService tOPurposeService) {
        Intrinsics.checkNotNullParameter(tOPurposeService, "<set-?>");
        this.retrofitServicePurposeTO = tOPurposeService;
    }

    public final void l2(TOCommonService tOCommonService) {
        Intrinsics.checkNotNullParameter(tOCommonService, "<set-?>");
        this.retrofitServiceTO = tOCommonService;
    }

    public final void m2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final void n2(ec6 ec6Var) {
        Intrinsics.checkNotNullParameter(ec6Var, "<set-?>");
        this.viewModelPurposeTO = ec6Var;
    }

    public final void o2(sb6 sb6Var) {
        Intrinsics.checkNotNullParameter(sb6Var, "<set-?>");
        this.viewModelTO = sb6Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, w1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        om6 om6VarC = om6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(om6VarC, "inflate(...)");
        V1(om6VarC);
        setContentView(s1().b());
        getWindow().addFlags(128);
        a2(MultiService.INSTANCE.a(this));
        m2((MultiSelectionViewModel) new z(this, new y67(new sx3(x1()))).a(MultiSelectionViewModel.class));
        ta3.a.q2(this, s1());
        l2(TOCommonService.INSTANCE.a(this));
        k2(TOPurposeService.INSTANCE.a(this));
        Z1(new wa3(this));
        c2(String.valueOf(getIntent().getStringExtra("off_code")));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        h2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        i2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        Log.e("rcdetails-1", F1().toString());
        W1(String.valueOf(F1().getRc_chasi_no()));
        d2(String.valueOf(F1().getRc_off_cd()));
        j2(String.valueOf(F1().getRc_regn_no()));
        if (t1().length() > 5) {
            String strSubstring = t1().substring(t1().length() - 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            X1(strSubstring);
        } else {
            String strSubstring2 = t1().substring(t1().length() - 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            X1(strSubstring2);
        }
        Z1(new wa3(this));
        s1().D.i.setText(String.valueOf(w1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        s1().D.e.setVisibility(0);
        s1().D.e.setText(E1());
        SpannableString spannableString = new SpannableString(E1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        s1().D.e.setText(spannableString);
        s1().D.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.N1(this.a, view);
            }
        });
        f2(new ProgressDialog(this));
        C1().setMessage(w1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        o2((sb6) new z(this, new rb6(new qb6(H1()))).a(sb6.class));
        n2((ec6) new z(this, new dc6(new cc6(G1()))).a(ec6.class));
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.am6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                TransferOfOwnerShipActivitySeller.O1(this.a, datePicker, i2, i3, i4);
            }
        };
        s1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.P1(this.a, onDateSetListener, view);
            }
        });
        try {
            C1().show();
            K1().g();
        } catch (Exception unused) {
        }
        try {
            J1().g(String.valueOf(F1().getState_cd()));
        } catch (Exception unused2) {
        }
        s1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.Q1(this.a, view);
            }
        });
        K1().i().g(this, new i(new c()));
        K1().h().g(this, new i(new d()));
        J1().h().g(this, new i(new e()));
        s1().s.setOnItemSelectedListener(new f());
        s1().o.setOnItemSelectedListener(new g());
        s1().j.setOnItemSelectedListener(new h());
        s1().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.R1(this.a, view);
            }
        });
        s1().v.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.em6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.S1(this.a, view);
            }
        });
        I1().s().g(this, new i(new a()));
        I1().t().g(this, new i(new b()));
    }

    public final void p2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipActivitySeller.q2(dialog, view);
            }
        });
        dialog.show();
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

    public final om6 s1() {
        om6 om6Var = this.binding;
        if (om6Var != null) {
            return om6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String t1() {
        String str = this.chasis_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chasis_no");
        return null;
    }

    public final String u1() {
        String str = this.chasis_no5;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chasis_no5");
        return null;
    }

    public final String v1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final MultiService x1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final ArrayList getMultiServiceList() {
        return this.multiServiceList;
    }

    public final String z1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }
}
