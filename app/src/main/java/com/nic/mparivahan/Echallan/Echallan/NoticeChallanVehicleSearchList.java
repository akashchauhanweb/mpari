package com.nic.mparivahan.Echallan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.PrintChallanWebView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.dz1;
import com.zepto.ec1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.lc1;
import com.zepto.lc4;
import com.zepto.ld7;
import com.zepto.mc1;
import com.zepto.mf4;
import com.zepto.od4;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yc4;
import com.zepto.yy0;
import java.util.ArrayList;
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
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003J \u0010\u0011\u001a\u00020\u00022\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0003J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0007J\u001e\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012J\b\u0010#\u001a\u00020\u0002H\u0007J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0012H\u0007R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R2\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R2\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R2\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\"\u0010W\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010E\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010E\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010_\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010E\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR\"\u0010c\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010E\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR\"\u0010g\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010E\u001a\u0004\be\u0010T\"\u0004\bf\u0010VR\"\u0010k\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010E\u001a\u0004\bi\u0010T\"\u0004\bj\u0010VR\"\u0010o\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010E\u001a\u0004\bm\u0010T\"\u0004\bn\u0010VR\"\u0010v\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010z\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010q\u001a\u0004\bx\u0010s\"\u0004\by\u0010uR\"\u0010~\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010q\u001a\u0004\b|\u0010s\"\u0004\b}\u0010uR%\u0010\u0082\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010q\u001a\u0005\b\u0080\u0001\u0010s\"\u0005\b\u0081\u0001\u0010uR\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u0094\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010;R6\u0010\u0098\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010;\u001a\u0005\b\u0096\u0001\u0010=\"\u0005\b\u0097\u0001\u0010?R\u0018\u0010\u009a\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010qR\u0018\u0010\u009c\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010qR\u0017\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010qR\u0018\u0010\u009f\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010qR\u0018\u0010¡\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010qR\u0018\u0010£\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010qR\u001a\u0010§\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010«\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010¯\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010µ\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010¦\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010»\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¶\u0001\u0010ª\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R&\u0010¿\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010q\u001a\u0005\b½\u0001\u0010s\"\u0005\b¾\u0001\u0010uR,\u0010Ç\u0001\u001a\u0005\u0018\u00010À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ê\u0001"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/NoticeChallanVehicleSearchList;", "Lcom/zepto/pq;", "", "Y1", "", "c2", "E1", "J1", "G1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "i2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "Lkotlin/collections/ArrayList;", "list", "u2", "", "message", "g2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "v2", "vehicleNo", "challanNoValue", "challanStateCd", "H1", "challanNo", "otp", "otpId", "F1", "d2", "developermess", "x2", "Lcom/zepto/yc4;", "C", "Lcom/zepto/yc4;", "binding", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "D", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "E", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "Q1", "()Lcom/zepto/wa3;", "o2", "(Lcom/zepto/wa3;)V", "langSession", "G", "Ljava/util/ArrayList;", "R1", "()Ljava/util/ArrayList;", "setPendingChallanList", "(Ljava/util/ArrayList;)V", "pendingChallanList", "H", "M1", "setDisposeChallanList", "disposeChallanList", "I", "I1", "j2", "allChallanList", "J", "S1", "setPendingNoticeList", "pendingNoticeList", "K", "N1", "setDisposeNoticeList", "disposeNoticeList", "", "L", "V1", "()I", "setTabClicked", "(I)V", "tabClicked", "M", "K1", "k2", "allTotalChallanListCount", "N", "T1", "p2", "pendingTotalChallanListCount", "O", "O1", "l2", "disposeTotalChallanListCount", "P", "W1", "s2", "totalNoticeListCount", "Q", "getPendingTotalNoticeListCount", "q2", "pendingTotalNoticeListCount", "R", "getDisposeTotalNoticeListCount", "m2", "disposeTotalNoticeListCount", "S", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "T", "getInputType", "setInputType", "inputType", "U", "getEngineNo", "setEngineNo", "engineNo", "V", "getChassisNo", "setChassisNo", "chassisNo", "Lcom/zepto/lc4;", "W", "Lcom/zepto/lc4;", "adapter", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "X", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "noticeService", "Lcom/zepto/mc1;", "Y", "Lcom/zepto/mc1;", "noticeViewModel", "Lcom/zepto/od4;", "Z", "Lcom/zepto/od4;", "noticeAdapter", "a0", "noticeSearchArray", "b0", "P1", "n2", "filteredList", "c0", "serviceCode", "d0", "serviceName", "e0", "f0", "stateCodeValue", "g0", "challanStateCdValue", "h0", "selectedChallanNo", "Lcom/zepto/ld7;", "i0", "Lcom/zepto/ld7;", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "j0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "retrofitServiceAddMob", "Lcom/zepto/ws6;", "k0", "Lcom/zepto/ws6;", "sessionManager", "l0", "X1", "()Lcom/zepto/ld7;", "t2", "(Lcom/zepto/ld7;)V", "viewModelv1", "m0", "U1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "r2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "proservice", "n0", "getRcNo", "setRcNo", "rcNo", "Landroid/app/Dialog;", "o0", "Landroid/app/Dialog;", "L1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNoticeChallanVehicleSearchList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeChallanVehicleSearchList.kt\ncom/nic/mparivahan/Echallan/Echallan/NoticeChallanVehicleSearchList\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1198:1\n260#2:1199\n260#2:1200\n260#2:1201\n*S KotlinDebug\n*F\n+ 1 NoticeChallanVehicleSearchList.kt\ncom/nic/mparivahan/Echallan/Echallan/NoticeChallanVehicleSearchList\n*L\n781#1:1199\n830#1:1200\n888#1:1201\n*E\n"})
public final class NoticeChallanVehicleSearchList extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public yc4 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int tabClicked;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int allTotalChallanListCount;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int pendingTotalChallanListCount;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int disposeTotalChallanListCount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int totalNoticeListCount;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int pendingTotalNoticeListCount;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int disposeTotalNoticeListCount;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public lc4 adapter;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public NoticeService noticeService;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public mc1 noticeViewModel;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public od4 noticeAdapter;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList pendingChallanList = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList disposeChallanList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList allChallanList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList pendingNoticeList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList disposeNoticeList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ArrayList noticeSearchArray = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ArrayList filteredList = new ArrayList();

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String serviceCode = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String stateCodeValue = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String challanStateCdValue = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String selectedChallanNo = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String rcNo = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
                yc4 yc4Var2 = null;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                ProgressBar progressBar = yc4Var.k;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yc4Var2 = yc4Var3;
                    }
                    yc4Var2.k.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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
            yc4 yc4Var = null;
            try {
                yc4 yc4Var2 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var2 = null;
                }
                ProgressBar progressBar = yc4Var2.k;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yc4Var3 = null;
                    }
                    yc4Var3.k.setVisibility(8);
                }
                if (NoticeChallanVehicleSearchList.this.getD() != null) {
                    Dialog d = NoticeChallanVehicleSearchList.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(NoticeChallanVehicleSearchList.this, str, 0).show();
                NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                noticeChallanVehicleSearchList.F1(noticeChallanVehicleSearchList.challanNo, "", "");
            } catch (Exception e) {
                yc4 yc4Var4 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var4 = null;
                }
                ProgressBar progressBar2 = yc4Var4.k;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    yc4 yc4Var5 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yc4Var = yc4Var5;
                    }
                    yc4Var.k.setVisibility(8);
                }
                e.printStackTrace();
                NoticeChallanVehicleSearchList noticeChallanVehicleSearchList2 = NoticeChallanVehicleSearchList.this;
                noticeChallanVehicleSearchList2.g2(noticeChallanVehicleSearchList2.Q1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
            yc4 yc4Var2 = null;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            ProgressBar progressBar = yc4Var.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yc4Var2 = yc4Var3;
                }
                yc4Var2.k.setVisibility(8);
            }
            if (!StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                NoticeChallanVehicleSearchList.this.g2(str);
            } else {
                NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                noticeChallanVehicleSearchList.g2(noticeChallanVehicleSearchList.Q1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x01a1 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:3:0x000c, B:5:0x0017, B:9:0x003f, B:12:0x004d, B:14:0x0063, B:29:0x0106, B:17:0x007b, B:20:0x0089, B:22:0x009f, B:23:0x00b3, B:25:0x00c9, B:26:0x00dd, B:28:0x00f3, B:30:0x010a, B:32:0x0116, B:33:0x0123, B:35:0x012f, B:36:0x013c, B:39:0x0155, B:41:0x015d, B:42:0x0161, B:44:0x0169, B:46:0x017e, B:47:0x0182, B:60:0x0226, B:62:0x022e, B:63:0x0232, B:65:0x023d, B:67:0x0245, B:68:0x0249, B:69:0x024e, B:71:0x0256, B:73:0x025e, B:74:0x0262, B:76:0x026a, B:48:0x01a1, B:50:0x01ad, B:52:0x01c2, B:53:0x01c6, B:54:0x01e4, B:56:0x01f0, B:58:0x0205, B:59:0x0209, B:77:0x0271, B:79:0x0279, B:81:0x0281, B:82:0x0285, B:84:0x0290, B:86:0x0298, B:87:0x029c, B:88:0x02a1, B:90:0x02b2, B:91:0x02c2, B:93:0x02ca, B:94:0x02ce, B:96:0x02d9, B:98:0x02e1, B:99:0x02e5, B:100:0x02ea, B:102:0x02fb), top: B:118:0x000c }] */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal r12) {
            /*
                Method dump skipped, instruction units count: 874
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList.d.a(com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanListModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
            yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
            yc4 yc4Var2 = null;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            ProgressBar progressBar = yc4Var.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yc4Var2 = yc4Var3;
                }
                yc4Var2.k.setVisibility(8);
            }
            NoticeChallanVehicleSearchList.this.getAllChallanList().clear();
            NoticeChallanVehicleSearchList.this.getDisposeChallanList().clear();
            NoticeChallanVehicleSearchList.this.getPendingChallanList().clear();
            NoticeChallanVehicleSearchList.this.G1();
            NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
            noticeChallanVehicleSearchList.v2(noticeChallanVehicleSearchList, noticeChallanVehicleSearchList.Q1().b("error_msg_record_not_found", NoticeChallanVehicleSearchList.this.getString(R.string.service_unavable_please_try)));
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(NoticeListModel noticeListModel) {
            try {
                yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
                yc4 yc4Var2 = null;
                od4 od4Var = null;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                yc4Var.k.setVisibility(8);
                yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var3 = null;
                }
                yc4Var3.i.setVisibility(0);
                Intrinsics.checkNotNull(noticeListModel);
                if (StringsKt__StringsJVMKt.equals(noticeListModel.getCode(), "200", true)) {
                    if (StringsKt__StringsJVMKt.equals(NoticeChallanVehicleSearchList.this.serviceCode, "113", true)) {
                        NoticeChallanVehicleSearchList.this.n2(noticeListModel.getData());
                        if (NoticeChallanVehicleSearchList.this.getFilteredList().size() > 0) {
                            int size = NoticeChallanVehicleSearchList.this.getFilteredList().size();
                            for (int i = 0; i < size; i++) {
                                if (((DPTNoticeDataModel) NoticeChallanVehicleSearchList.this.getFilteredList().get(i)).getPayment_eligible() == 0) {
                                    NoticeChallanVehicleSearchList.this.noticeSearchArray.add(NoticeChallanVehicleSearchList.this.getFilteredList().get(i));
                                }
                            }
                        }
                    } else {
                        NoticeChallanVehicleSearchList.this.noticeSearchArray = noticeListModel.getData();
                    }
                    NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                    noticeChallanVehicleSearchList.s2(noticeChallanVehicleSearchList.noticeSearchArray.size());
                    int allTotalChallanListCount = NoticeChallanVehicleSearchList.this.getAllTotalChallanListCount() + NoticeChallanVehicleSearchList.this.getTotalNoticeListCount();
                    yc4 yc4Var4 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        yc4Var4 = null;
                    }
                    yc4Var4.n.setText("Total Challan/Notice: " + allTotalChallanListCount);
                    int size2 = NoticeChallanVehicleSearchList.this.noticeSearchArray.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (StringsKt__StringsJVMKt.equals(((DPTNoticeDataModel) NoticeChallanVehicleSearchList.this.noticeSearchArray.get(i2)).getStatus(), "Pending", true)) {
                            NoticeChallanVehicleSearchList.this.getPendingNoticeList().add(NoticeChallanVehicleSearchList.this.noticeSearchArray.get(i2));
                        } else if (StringsKt__StringsJVMKt.equals(((DPTNoticeDataModel) NoticeChallanVehicleSearchList.this.noticeSearchArray.get(i2)).getStatus(), "Disposed", true)) {
                            NoticeChallanVehicleSearchList.this.getDisposeNoticeList().add(NoticeChallanVehicleSearchList.this.noticeSearchArray.get(i2));
                        }
                    }
                    if (NoticeChallanVehicleSearchList.this.getPendingNoticeList().size() > 0) {
                        NoticeChallanVehicleSearchList noticeChallanVehicleSearchList2 = NoticeChallanVehicleSearchList.this;
                        noticeChallanVehicleSearchList2.q2(noticeChallanVehicleSearchList2.getPendingNoticeList().size());
                    }
                    if (NoticeChallanVehicleSearchList.this.getDisposeNoticeList().size() > 0) {
                        NoticeChallanVehicleSearchList noticeChallanVehicleSearchList3 = NoticeChallanVehicleSearchList.this;
                        noticeChallanVehicleSearchList3.m2(noticeChallanVehicleSearchList3.getDisposeNoticeList().size());
                    }
                    if (NoticeChallanVehicleSearchList.this.noticeSearchArray.size() > 0) {
                        yc4 yc4Var5 = NoticeChallanVehicleSearchList.this.binding;
                        if (yc4Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            yc4Var5 = null;
                        }
                        yc4Var5.i.setVisibility(0);
                        od4 od4Var2 = NoticeChallanVehicleSearchList.this.noticeAdapter;
                        if (od4Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("noticeAdapter");
                        } else {
                            od4Var = od4Var2;
                        }
                        od4Var.B(NoticeChallanVehicleSearchList.this.noticeSearchArray);
                    } else {
                        yc4 yc4Var6 = NoticeChallanVehicleSearchList.this.binding;
                        if (yc4Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            yc4Var2 = yc4Var6;
                        }
                        yc4Var2.i.setVisibility(8);
                    }
                    NoticeChallanVehicleSearchList.this.G1();
                }
            } catch (Exception e) {
                e.printStackTrace();
                NoticeChallanVehicleSearchList.this.G1();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NoticeListModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
            yc4 yc4Var2 = null;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            yc4Var.k.setVisibility(8);
            yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yc4Var2 = yc4Var3;
            }
            yc4Var2.i.setVisibility(8);
            NoticeChallanVehicleSearchList.this.G1();
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(ChallanPdfDataModal challanPdfDataModal) {
            yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
            yc4 yc4Var2 = null;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            ProgressBar progressBar = yc4Var.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yc4Var2 = yc4Var3;
                }
                yc4Var2.k.setVisibility(8);
            }
            if (challanPdfDataModal.getStatus() != 200) {
                if (kt6.d(challanPdfDataModal.getMessage())) {
                    NoticeChallanVehicleSearchList.this.g2(challanPdfDataModal.getMessage());
                    return;
                }
                NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                String strB = noticeChallanVehicleSearchList.Q1().b("label_went_wrong", NoticeChallanVehicleSearchList.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                noticeChallanVehicleSearchList.g2(strB);
                return;
            }
            String pdf_url = StringsKt__StringsJVMKt.equals(NoticeChallanVehicleSearchList.this.serviceCode, "114", true) ? challanPdfDataModal.getResults().getPdf_url() : challanPdfDataModal.getResults().getReceipt_url();
            if (!kt6.d(pdf_url)) {
                Toast.makeText(NoticeChallanVehicleSearchList.this, "Payment is pending so can't view payment receipt", 0).show();
                return;
            }
            String strA = com.zepto.j.a.a(pdf_url, "E@CHALLAN*#2017$");
            Intent intent = new Intent(NoticeChallanVehicleSearchList.this, (Class<?>) PrintChallanWebView.class);
            if (StringsKt__StringsJVMKt.equals(NoticeChallanVehicleSearchList.this.serviceCode, "114", true)) {
                intent.putExtra("challanPdfUrl", strA);
                intent.putExtra("challan_receipt_url", "");
                intent.putExtra("fromActivity", "printChallan");
            } else if (StringsKt__StringsJVMKt.equals(NoticeChallanVehicleSearchList.this.serviceCode, "115", true)) {
                intent.putExtra("challanPdfUrl", "");
                intent.putExtra("challan_receipt_url", strA);
                intent.putExtra("fromActivity", "printReceiptActivity");
            }
            intent.putExtra("challanNo", NoticeChallanVehicleSearchList.this.selectedChallanNo);
            NoticeChallanVehicleSearchList.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanPdfDataModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
            yc4 yc4Var2 = null;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            ProgressBar progressBar = yc4Var.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yc4Var2 = yc4Var3;
                }
                yc4Var2.k.setVisibility(8);
            }
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
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
        public final void a(Vahangenotp vahangenotp) {
            try {
                yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
                yc4 yc4Var2 = null;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                ProgressBar progressBar = yc4Var.k;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yc4Var2 = yc4Var3;
                    }
                    yc4Var2.k.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    Toast.makeText(NoticeChallanVehicleSearchList.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                } else {
                    NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                    noticeChallanVehicleSearchList.x2(noticeChallanVehicleSearchList, String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(NoticeChallanVehicleSearchList.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
                yc4 yc4Var2 = null;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                ProgressBar progressBar = yc4Var.k;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yc4Var2 = yc4Var3;
                    }
                    yc4Var2.k.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(NoticeChallanVehicleSearchList.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
            super(1);
        }

        public final void a(Vahangenotp vahangenotp) {
            try {
                yc4 yc4Var = NoticeChallanVehicleSearchList.this.binding;
                yc4 yc4Var2 = null;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                ProgressBar progressBar = yc4Var.k;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    yc4 yc4Var3 = NoticeChallanVehicleSearchList.this.binding;
                    if (yc4Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        yc4Var2 = yc4Var3;
                    }
                    yc4Var2.k.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    NoticeChallanVehicleSearchList.this.g2("Unable to send the OTP, Please try after some time");
                } else {
                    NoticeChallanVehicleSearchList noticeChallanVehicleSearchList = NoticeChallanVehicleSearchList.this;
                    noticeChallanVehicleSearchList.g2(noticeChallanVehicleSearchList.Q1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                NoticeChallanVehicleSearchList.this.g2("Unable to send the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    public static final class n extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class o extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final void A2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void B2(NoticeChallanVehicleSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void C2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    private final void Y1() {
        SearchChallanService searchChallanService = this.retrofitService;
        yc4 yc4Var = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        NoticeService noticeService = this.noticeService;
        if (noticeService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeService");
            noticeService = null;
        }
        this.noticeViewModel = (mc1) new z(this, new lc1(new ec1(noticeService))).a(mc1.class);
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
            vahanProService = null;
        }
        this.viewModelAddMob = (ld7) new z(this, new kd7(new jd7(vahanProService))).a(ld7.class);
        t2((ld7) new z(this, new kd7(new jd7(U1()))).a(ld7.class));
        yc4 yc4Var2 = this.binding;
        if (yc4Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var2 = null;
        }
        yc4Var2.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.Z1(this.a, view);
            }
        });
        yc4 yc4Var3 = this.binding;
        if (yc4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var3 = null;
        }
        yc4Var3.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.a2(this.a, view);
            }
        });
        yc4 yc4Var4 = this.binding;
        if (yc4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yc4Var = yc4Var4;
        }
        yc4Var.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.b2(this.a, view);
            }
        });
        E1();
    }

    public static final void Z1(NoticeChallanVehicleSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 0;
        yc4 yc4Var = this$0.binding;
        yc4 yc4Var2 = null;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_with_two_corner));
        yc4 yc4Var3 = this$0.binding;
        if (yc4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var3 = null;
        }
        yc4Var3.j.setBackground(yy0.e(this$0, R.drawable.rectanlge_without_corner_unselected));
        yc4 yc4Var4 = this$0.binding;
        if (yc4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var4 = null;
        }
        yc4Var4.e.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        yc4 yc4Var5 = this$0.binding;
        if (yc4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var5 = null;
        }
        yc4Var5.b.setTextColor(yy0.c(this$0, R.color.white));
        yc4 yc4Var6 = this$0.binding;
        if (yc4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var6 = null;
        }
        yc4Var6.e.setTextColor(yy0.c(this$0, R.color.dove_grey));
        yc4 yc4Var7 = this$0.binding;
        if (yc4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yc4Var2 = yc4Var7;
        }
        yc4Var2.j.setTextColor(yy0.c(this$0, R.color.dove_grey));
        this$0.i2(this$0.allChallanList);
        this$0.u2(this$0.noticeSearchArray);
        this$0.G1();
    }

    public static final void a2(NoticeChallanVehicleSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 1;
        yc4 yc4Var = this$0.binding;
        yc4 yc4Var2 = null;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        yc4 yc4Var3 = this$0.binding;
        if (yc4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var3 = null;
        }
        yc4Var3.j.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_selected));
        yc4 yc4Var4 = this$0.binding;
        if (yc4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var4 = null;
        }
        yc4Var4.e.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        yc4 yc4Var5 = this$0.binding;
        if (yc4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var5 = null;
        }
        yc4Var5.j.setTextColor(yy0.c(this$0, R.color.white));
        yc4 yc4Var6 = this$0.binding;
        if (yc4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var6 = null;
        }
        yc4Var6.e.setTextColor(yy0.c(this$0, R.color.dove_grey));
        yc4 yc4Var7 = this$0.binding;
        if (yc4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yc4Var2 = yc4Var7;
        }
        yc4Var2.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        this$0.i2(this$0.pendingChallanList);
        this$0.u2(this$0.pendingNoticeList);
        this$0.G1();
    }

    public static final void b2(NoticeChallanVehicleSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 2;
        yc4 yc4Var = this$0.binding;
        yc4 yc4Var2 = null;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.e.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_right_dodger_blue));
        yc4 yc4Var3 = this$0.binding;
        if (yc4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var3 = null;
        }
        yc4Var3.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        yc4 yc4Var4 = this$0.binding;
        if (yc4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var4 = null;
        }
        yc4Var4.j.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_left_unselected));
        yc4 yc4Var5 = this$0.binding;
        if (yc4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var5 = null;
        }
        yc4Var5.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        yc4 yc4Var6 = this$0.binding;
        if (yc4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var6 = null;
        }
        yc4Var6.j.setTextColor(yy0.c(this$0, R.color.dove_grey));
        yc4 yc4Var7 = this$0.binding;
        if (yc4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yc4Var2 = yc4Var7;
        }
        yc4Var2.e.setTextColor(yy0.c(this$0, R.color.white));
        this$0.i2(this$0.disposeChallanList);
        this$0.u2(this$0.disposeNoticeList);
        this$0.G1();
    }

    private final boolean c2() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public static final void e2(EditText enteredChassisNo, NoticeChallanVehicleSearchList this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(enteredChassisNo, "$enteredChassisNo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (enteredChassisNo.getText().toString().length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.Q1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        d2.dismiss();
        this$0.chassisNo = enteredChassisNo.getText().toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add("62");
        String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
        String string2 = enteredChassisNo.getText().toString();
        String str = this$0.rcNo;
        String str2 = this$0.challanStateCdValue;
        ws6 ws6Var = this$0.sessionManager;
        if (ws6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var = null;
        }
        String strE = ws6Var.e();
        ws6 ws6Var2 = this$0.sessionManager;
        if (ws6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var2 = null;
        }
        GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", string2, string, "No", " ", "", "", " ", true, arrayList, str, str2, strE, "", ws6Var2.k());
        yc4 yc4Var = this$0.binding;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.k.setVisibility(0);
        this$0.X1().B1(this$0, generateUserVerify);
    }

    public static final void f2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.h2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void h2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(List searchList) {
        lc4 lc4Var = this.adapter;
        yc4 yc4Var = null;
        if (lc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            lc4Var = null;
        }
        lc4Var.B(searchList);
        lc4Var.j();
        yc4 yc4Var2 = this.binding;
        if (yc4Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var2 = null;
        }
        ProgressBar progressBar = yc4Var2.k;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        if (progressBar.getVisibility() == 0) {
            yc4 yc4Var3 = this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yc4Var = yc4Var3;
            }
            yc4Var.k.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void y2(NoticeChallanVehicleSearchList this$0, TextView time_text, wa3 langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        new o(time_text, langSession, context, resendOtp).start();
        yc4 yc4Var = this$0.binding;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.k.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add("62");
        String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
        String str = this$0.chassisNo;
        String str2 = this$0.rcNo;
        String str3 = this$0.challanStateCdValue;
        ws6 ws6Var = this$0.sessionManager;
        if (ws6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var = null;
        }
        String strE = ws6Var.e();
        ws6 ws6Var2 = this$0.sessionManager;
        if (ws6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
            ws6Var2 = null;
        }
        this$0.X1().A1(this$0, new GenerateUserVerify(" ", "", str, string, "No", " ", "", "", " ", true, arrayList, str2, str3, strE, "", ws6Var2.k()));
    }

    public static final void z2(EditText enterOtp, Context context, wa3 langSession, NoticeChallanVehicleSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(context, langSession.b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        if (string.length() < 4) {
            Toast.makeText(context, langSession.b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
            return;
        }
        yc4 yc4Var = this$0.binding;
        if (yc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var = null;
        }
        yc4Var.k.setVisibility(0);
        this$0.X1().C1(this$0, "", this$0.rcNo, this$0.challanStateCdValue, "M", "62", string, "", new ws6(this$0).k(), this$0.chassisNo);
    }

    public final void E1() {
        if (c2()) {
            J1();
        } else {
            v2(this, Q1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    public final void F1(String challanNo, String otp, String otpId) {
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpId, "otpId");
        yc4 yc4Var = null;
        try {
            this.selectedChallanNo = challanNo;
            yc4 yc4Var2 = this.binding;
            if (yc4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var2 = null;
            }
            yc4Var2.k.setVisibility(0);
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            fz1Var.n(this, challanNo, otp, otpId, this.challanStateCdValue, this.rcNo, "62", this.chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
            yc4 yc4Var3 = this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                yc4Var = yc4Var3;
            }
            yc4Var.k.setVisibility(8);
        }
    }

    public final void G1() {
        int i2;
        int i3;
        int i4 = this.tabClicked;
        if (i4 == 0) {
            i2 = this.allTotalChallanListCount;
            i3 = this.totalNoticeListCount;
        } else if (i4 == 1) {
            i2 = this.pendingTotalChallanListCount;
            i3 = this.pendingTotalNoticeListCount;
        } else if (i4 != 2) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = this.disposeTotalChallanListCount;
            i3 = this.disposeTotalNoticeListCount;
        }
        int i5 = i2 + i3;
        yc4 yc4Var = null;
        if (i2 == 0) {
            yc4 yc4Var2 = this.binding;
            if (yc4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var2 = null;
            }
            yc4Var2.c.setVisibility(8);
        } else {
            yc4 yc4Var3 = this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var3 = null;
            }
            yc4Var3.c.setVisibility(0);
        }
        if (i3 == 0) {
            yc4 yc4Var4 = this.binding;
            if (yc4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var4 = null;
            }
            yc4Var4.h.setVisibility(8);
        } else {
            yc4 yc4Var5 = this.binding;
            if (yc4Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var5 = null;
            }
            yc4Var5.h.setVisibility(0);
        }
        yc4 yc4Var6 = this.binding;
        if (yc4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yc4Var = yc4Var6;
        }
        yc4Var.n.setText("Total Challan/Notice: " + i5);
    }

    public final void H1(String vehicleNo, String challanNoValue, String challanStateCd) {
        Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
        Intrinsics.checkNotNullParameter(challanNoValue, "challanNoValue");
        Intrinsics.checkNotNullParameter(challanStateCd, "challanStateCd");
        try {
            this.challanNo = challanNoValue;
            String strSubstring = StringsKt__StringsKt.trim((CharSequence) vehicleNo).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.stateCodeValue = strSubstring;
            this.challanStateCdValue = challanStateCd;
            this.rcNo = vehicleNo;
            yc4 yc4Var = this.binding;
            if (yc4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var = null;
            }
            yc4Var.k.setVisibility(0);
            if (StringsKt__StringsJVMKt.equals(this.stateCodeValue, "AP", true)) {
                F1(challanNoValue, "", "");
                return;
            }
            Log.d("Input Type", this.inputType + 'a');
            if (kt6.d(this.inputType) && !Intrinsics.areEqual(this.inputType, "RC")) {
                d2();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("62");
            String string = Settings.Secure.getString(getContentResolver(), "android_id");
            String str = this.chassisNo;
            String str2 = this.challanStateCdValue;
            ws6 ws6Var = this.sessionManager;
            if (ws6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
                ws6Var = null;
            }
            String strE = ws6Var.e();
            ws6 ws6Var2 = this.sessionManager;
            if (ws6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
                ws6Var2 = null;
            }
            GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", str, string, "No", " ", "", "", " ", true, arrayList, vehicleNo, str2, strE, "", ws6Var2.k());
            yc4 yc4Var2 = this.binding;
            if (yc4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var2 = null;
            }
            yc4Var2.k.setVisibility(0);
            X1().B1(this, generateUserVerify);
        } catch (Exception e2) {
            e2.printStackTrace();
            yc4 yc4Var3 = this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var3 = null;
            }
            ProgressBar progressBar = yc4Var3.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var4 = this.binding;
                if (yc4Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var4 = null;
                }
                yc4Var4.k.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final ArrayList getAllChallanList() {
        return this.allChallanList;
    }

    public final void J1() {
        fz1 fz1Var;
        yc4 yc4Var = null;
        try {
            yc4 yc4Var2 = this.binding;
            if (yc4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var2 = null;
            }
            yc4Var2.k.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            fz1Var.l(this, this.inputType, this.inputValue, 1, this.engineNo, this.chassisNo);
            mc1 mc1Var = this.noticeViewModel;
            if (mc1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noticeViewModel");
                mc1Var = null;
            }
            mc1Var.l("RC", this.inputValue);
        } catch (Exception e2) {
            e2.printStackTrace();
            yc4 yc4Var3 = this.binding;
            if (yc4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                yc4Var3 = null;
            }
            ProgressBar progressBar = yc4Var3.k;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                yc4 yc4Var4 = this.binding;
                if (yc4Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yc4Var = yc4Var4;
                }
                yc4Var.k.setVisibility(8);
            }
            if (this.tabClicked == 0) {
                G1();
            }
        }
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final int getAllTotalChallanListCount() {
        return this.allTotalChallanListCount;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final ArrayList getDisposeChallanList() {
        return this.disposeChallanList;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ArrayList getDisposeNoticeList() {
        return this.disposeNoticeList;
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final int getDisposeTotalChallanListCount() {
        return this.disposeTotalChallanListCount;
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public final ArrayList getFilteredList() {
        return this.filteredList;
    }

    public final wa3 Q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final ArrayList getPendingChallanList() {
        return this.pendingChallanList;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final ArrayList getPendingNoticeList() {
        return this.pendingNoticeList;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final int getPendingTotalChallanListCount() {
        return this.pendingTotalChallanListCount;
    }

    public final VahanProService U1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final int getTabClicked() {
        return this.tabClicked;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final int getTotalNoticeListCount() {
        return this.totalNoticeListCount;
    }

    public final ld7 X1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void d2() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_enter_chassis_no);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.tv_chassi_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.proceedBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.closeBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.e2(editText, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.f2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void j2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.allChallanList = arrayList;
    }

    public final void k2(int i2) {
        this.allTotalChallanListCount = i2;
    }

    public final void l2(int i2) {
        this.disposeTotalChallanListCount = i2;
    }

    public final void m2(int i2) {
        this.disposeTotalNoticeListCount = i2;
    }

    public final void n2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.filteredList = arrayList;
    }

    public final void o2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yc4 yc4VarC = yc4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yc4VarC, "inflate(...)");
        this.binding = yc4VarC;
        fz1 fz1Var = null;
        if (yc4VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4VarC = null;
        }
        setContentView(yc4VarC.b());
        this.sessionManager = new ws6(this);
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra);
            this.serviceCode = stringExtra;
        }
        if (getIntent().hasExtra("Service_name")) {
            String stringExtra2 = getIntent().getStringExtra("Service_name");
            Intrinsics.checkNotNull(stringExtra2);
            this.serviceName = stringExtra2;
        }
        o2(new wa3(this));
        String stringExtra3 = getIntent().getStringExtra("inputValue");
        Intrinsics.checkNotNull(stringExtra3);
        this.inputValue = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra4);
        this.inputType = stringExtra4;
        if (getIntent().hasExtra("inputengineno")) {
            String stringExtra5 = getIntent().getStringExtra("inputengineno");
            Intrinsics.checkNotNull(stringExtra5);
            this.engineNo = stringExtra5;
        }
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra6 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra6);
            this.chassisNo = stringExtra6;
        }
        this.d = new Dialog(this);
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        VahanProService.Companion companion = VahanProService.INSTANCE;
        this.retrofitServiceAddMob = companion.a(this);
        this.noticeService = NoticeService.INSTANCE.a(this);
        r2(companion.a(this));
        if (kt6.d(this.serviceCode)) {
            if (StringsKt__StringsJVMKt.equals(this.serviceCode, "111", true)) {
                yc4 yc4Var = this.binding;
                if (yc4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var = null;
                }
                yc4Var.m.i.setText(Q1().b("cn_statusTitle", getString(R.string.challan_notice_status)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true)) {
                yc4 yc4Var2 = this.binding;
                if (yc4Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var2 = null;
                }
                yc4Var2.m.i.setText(Q1().b("cn_PaymentTitle", getString(R.string.challan_notice_payment_title)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "114", true)) {
                yc4 yc4Var3 = this.binding;
                if (yc4Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var3 = null;
                }
                yc4Var3.m.i.setText(Q1().b("cn_downloadTitle", getString(R.string.challan_notice_download_title)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "115", true)) {
                yc4 yc4Var4 = this.binding;
                if (yc4Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var4 = null;
                }
                yc4Var4.l.setVisibility(8);
                yc4 yc4Var5 = this.binding;
                if (yc4Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var5 = null;
                }
                yc4Var5.m.i.setText(Q1().b("View_Payment_Receipt", getString(R.string.view_payment_receipt)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "113", true)) {
                yc4 yc4Var6 = this.binding;
                if (yc4Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var6 = null;
                }
                yc4Var6.l.setVisibility(8);
                yc4 yc4Var7 = this.binding;
                if (yc4Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yc4Var7 = null;
                }
                yc4Var7.m.i.setText(Q1().b("label_challan_verify_payment_status", getString(R.string.verify_challan_payment)));
            }
        }
        yc4 yc4Var8 = this.binding;
        if (yc4Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var8 = null;
        }
        yc4Var8.i.setLayoutManager(new LinearLayoutManager(this));
        this.noticeAdapter = new od4(this, this.noticeSearchArray, this.inputType, Q1(), "", this.serviceCode);
        yc4 yc4Var9 = this.binding;
        if (yc4Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var9 = null;
        }
        RecyclerView recyclerView = yc4Var9.i;
        od4 od4Var = this.noticeAdapter;
        if (od4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeAdapter");
            od4Var = null;
        }
        recyclerView.setAdapter(od4Var);
        yc4 yc4Var10 = this.binding;
        if (yc4Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var10 = null;
        }
        yc4Var10.d.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new lc4(this, new ArrayList(), 0, this.inputType, Q1(), this.serviceCode, this, this.chassisNo);
        yc4 yc4Var11 = this.binding;
        if (yc4Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yc4Var11 = null;
        }
        RecyclerView recyclerView2 = yc4Var11.d;
        lc4 lc4Var = this.adapter;
        if (lc4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            lc4Var = null;
        }
        recyclerView2.setAdapter(lc4Var);
        Y1();
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.i().g(this, new m(new d()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var3 = null;
        }
        fz1Var3.h().g(this, new m(new e()));
        mc1 mc1Var = this.noticeViewModel;
        if (mc1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeViewModel");
            mc1Var = null;
        }
        mc1Var.h().g(this, new m(new f()));
        mc1 mc1Var2 = this.noticeViewModel;
        if (mc1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeViewModel");
            mc1Var2 = null;
        }
        mc1Var2.g().g(this, new m(new g()));
        fz1 fz1Var4 = this.viewModel;
        if (fz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var4 = null;
        }
        fz1Var4.m().g(this, new m(new h()));
        fz1 fz1Var5 = this.viewModel;
        if (fz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var5;
        }
        fz1Var.r().g(this, new m(new i()));
        X1().i1().g(this, new m(new j()));
        X1().j1().g(this, new m(new k()));
        X1().g1().g(this, new m(new l()));
        X1().h1().g(this, new m(new a()));
        X1().e1().g(this, new m(new b()));
        X1().f1().g(this, new m(new c()));
    }

    public final void p2(int i2) {
        this.pendingTotalChallanListCount = i2;
    }

    public final void q2(int i2) {
        this.pendingTotalNoticeListCount = i2;
    }

    public final void r2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final void s2(int i2) {
        this.totalNoticeListCount = i2;
    }

    public final void t2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void u2(ArrayList list) {
        od4 od4Var = this.noticeAdapter;
        if (od4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeAdapter");
            od4Var = null;
        }
        od4Var.B(list);
        od4Var.j();
    }

    public final void v2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(Q1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(Q1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.w2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void x2(final Context context, String developermess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(developermess, "developermess");
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setContentView(R.layout.validateotp);
        }
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        ImageView imageView = dialog5 != null ? (ImageView) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(imageView);
        Dialog dialog6 = this.d;
        TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView);
        Dialog dialog7 = this.d;
        final ImageView imageView2 = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView2);
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2);
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText);
        Dialog dialog10 = this.d;
        final TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3);
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4);
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5);
        Dialog dialog13 = this.d;
        TextView textView6 = dialog13 != null ? (TextView) dialog13.findViewById(R.id.enter_otp_txt) : null;
        Intrinsics.checkNotNull(textView6);
        Dialog dialog14 = this.d;
        TextView textView7 = dialog14 != null ? (TextView) dialog14.findViewById(R.id.disPlay) : null;
        Intrinsics.checkNotNull(textView7);
        Dialog dialog15 = this.d;
        Intrinsics.checkNotNull(dialog15 != null ? (TextView) dialog15.findViewById(R.id.otpdisplay) : null);
        final wa3 wa3Var = new wa3(context);
        textView6.setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView7.setText(wa3Var.b("otp_verification", context.getString(R.string.otp_verification)));
        textView2.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        textView4.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        textView.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
        editText.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView5.setText(wa3Var.b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
        new n(textView3, wa3Var, context, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.C2(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.y2(this.a, textView3, wa3Var, context, textView8, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.z2(editText, context, wa3Var, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.A2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeChallanVehicleSearchList.B2(this.a, view);
            }
        });
        Dialog dialog16 = this.d;
        if (dialog16 != null) {
            dialog16.show();
        }
    }
}
