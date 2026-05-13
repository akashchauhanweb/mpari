package com.nic.mparivahan.LLServices.UI;

import android.app.Application;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;
import com.nic.mparivahan.LLServices.UI.a;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadResponseMessage;
import com.nic.mparivahan.dlservices.data.model.temp.ResponseBean;
import com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.zepto.aj0;
import com.zepto.fm1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jf;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.n55;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.xc;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\nH\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\nH\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0012\u0010$\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014J\u001a\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0016J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016J\u0017\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010(¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010?R\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010?R\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010?R(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010?\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR$\u0010`\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR$\u0010d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR\"\u0010h\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010U\"\u0004\bg\u0010WR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010RR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R(\u0010\u0094\u0001\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010E\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u0010\u009a\u0001\u001a\u0014\u0012\u000f\u0012\r \u0097\u0001*\u0005\u0018\u00010\u0096\u00010\u0096\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R9\u0010 \u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u00010\u000e0\u000e0\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0099\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006£\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/LlDocumentUpload;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/LLServices/UI/a$a;", "", "k2", "X1", "d2", "", "c2", "a2", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/DocumentListItem;", "documentList", "G2", "", "message", "p2", "n2", "P1", "Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedDocBeanItem;", "b2", "A2", "Ljava/util/ArrayList;", "docItems", "W1", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "z2", "E2", "B2", "C2", "F2", "visible", "x2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "r2", "", "pos", "item", "c", "b", "a", "Q1", "acCd", "m2", "(Ljava/lang/Integer;)V", "Lcom/zepto/xc;", "C", "Lcom/zepto/xc;", "mBinding", "Lcom/zepto/fm1;", "D", "Lcom/zepto/fm1;", "viewModel", "Lcom/nic/mparivahan/LLServices/UI/a;", "E", "Lcom/nic/mparivahan/LLServices/UI/a;", "adapter", "F", "Ljava/lang/String;", "mApplNo", "G", "mApplDob", "H", "mApplStateCd", "I", "lastEndorseRTOCode", "J", "serviceCode", "", "K", "[Ljava/lang/String;", "getCameraPermission", "()[Ljava/lang/String;", "t2", "([Ljava/lang/String;)V", "cameraPermission", "L", "Ljava/util/ArrayList;", "M", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "N", "getDob", "setDob", "dob", "O", "getMobile_no", "setMobile_no", "Mobile_no", "P", "getClPhoto", "setClPhoto", "clPhoto", "Q", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Lcom/zepto/ws6;", "R", "Lcom/zepto/ws6;", "U1", "()Lcom/zepto/ws6;", "w2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/sw4;", "S", "Lcom/zepto/sw4;", "mProgressApplication", "T", "dCodes", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "S1", "()Lcom/zepto/wa3;", "u2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "V", "Lcom/zepto/wl5;", "V1", "()Lcom/zepto/wl5;", "y2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "W", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "T1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "v2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "X", "getMPos", "()I", "setMPos", "(I)V", "mPos", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Y", "Lcom/zepto/of;", "startForProfileImageResult", "Z", "getGetDocLauncher", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLlDocumentUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlDocumentUpload.kt\ncom/nic/mparivahan/LLServices/UI/LlDocumentUpload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,923:1\n1855#2,2:924\n1855#2,2:926\n1855#2:928\n1855#2,2:929\n1856#2:931\n1855#2,2:932\n1855#2,2:934\n1#3:936\n*S KotlinDebug\n*F\n+ 1 LlDocumentUpload.kt\ncom/nic/mparivahan/LLServices/UI/LlDocumentUpload\n*L\n295#1:924,2\n416#1:926,2\n461#1:928\n463#1:929,2\n461#1:931\n499#1:932,2\n591#1:934,2\n*E\n"})
public final class LlDocumentUpload extends pq implements a.InterfaceC0054a {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public xc mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public fm1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public com.nic.mparivahan.LLServices.UI.a adapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mApplStateCd;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String serviceCode;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String[] cameraPermission;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList docItems = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ArrayList dCodes = new ArrayList();

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public int mPos = -1;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusResponse dlApplStatusResponse) {
            Integer statusCode;
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage == null || (statusCode = responseMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                    return;
                }
                LlDocumentUpload llDocumentUpload = LlDocumentUpload.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                llDocumentUpload.serviceCode = String.valueOf((responseBody == null || (transReq = responseBody.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody2 != null ? responseBody2.getOlaMast() : null;
                LlDocumentUpload.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                LlDocumentUpload.this.mApplStateCd = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                xc xcVar = LlDocumentUpload.this.mBinding;
                if (xcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar = null;
                }
                TextView textView = xcVar.y;
                String str2 = LlDocumentUpload.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                xc xcVar2 = LlDocumentUpload.this.mBinding;
                if (xcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar2 = null;
                }
                TextView textView2 = xcVar2.C;
                String str3 = LlDocumentUpload.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                String str4 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                xc xcVar3 = LlDocumentUpload.this.mBinding;
                if (xcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar3 = null;
                }
                xcVar3.B.setText(str4);
                xc xcVar4 = LlDocumentUpload.this.mBinding;
                if (xcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar4 = null;
                }
                TextView textView3 = xcVar4.E;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                textView3.setText(String.valueOf(responseBody3 != null ? responseBody3.getApdFullName() : null));
                xc xcVar5 = LlDocumentUpload.this.mBinding;
                if (xcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar5 = null;
                }
                TextView textView4 = xcVar5.D;
                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                textView4.setText(String.valueOf(responseBody4 != null ? responseBody4.getApdSwdFullName() : null));
                String str5 = LlDocumentUpload.this.mApplNo;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str5 = null;
                }
                if (str5.length() > 0) {
                    String str6 = LlDocumentUpload.this.mApplStateCd;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                        str6 = null;
                    }
                    if (str6.length() > 0) {
                        if (!com.nic.mparivahan.a.a.a(LlDocumentUpload.this)) {
                            Toast.makeText(LlDocumentUpload.this.getApplicationContext(), LlDocumentUpload.this.S1().b("label_log_check_internet", LlDocumentUpload.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                            return;
                        }
                        fm1 fm1Var = LlDocumentUpload.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str7 = LlDocumentUpload.this.mApplNo;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str7 = null;
                        }
                        String str8 = LlDocumentUpload.this.mApplStateCd;
                        if (str8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str8 = null;
                        }
                        String str9 = LlDocumentUpload.this.serviceCode;
                        if (str9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                        } else {
                            str = str9;
                        }
                        fm1Var.m(str7, str8, str, "A");
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(UploadDocListResponse uploadDocListResponse) {
            Integer statusCode;
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null && (statusCode = responseBean.getStatusCode()) != null && statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                    LlDocumentUpload.this.G2(uploadDocListResponse.getDocumentList());
                }
                fm1 fm1Var = LlDocumentUpload.this.viewModel;
                String str = null;
                if (fm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    fm1Var = null;
                }
                String str2 = LlDocumentUpload.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                String str3 = LlDocumentUpload.this.mApplStateCd;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    str3 = null;
                }
                String str4 = LlDocumentUpload.this.serviceCode;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                } else {
                    str = str4;
                }
                fm1Var.i(str2, str3, str);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocListResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(UploadDocListResponse uploadDocListResponse) {
            Integer statusCode;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null && (statusCode = responseBean.getStatusCode()) != null && statusCode.intValue() == 200) {
                    if (uploadDocListResponse.getDocumentList() != null && (!r0.isEmpty())) {
                        List<Integer> dCodes = uploadDocListResponse.getDCodes();
                        if (dCodes != null && !dCodes.isEmpty()) {
                            Iterator<Integer> it = uploadDocListResponse.getDCodes().iterator();
                            while (it.hasNext()) {
                                LlDocumentUpload.this.dCodes.add(it.next());
                            }
                        }
                        LlDocumentUpload.this.P1(uploadDocListResponse.getDocumentList());
                        return;
                    }
                    fm1 fm1Var = LlDocumentUpload.this.viewModel;
                    if (fm1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        fm1Var = null;
                    }
                    String str = LlDocumentUpload.this.mApplNo;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        str = null;
                    }
                    String str2 = LlDocumentUpload.this.mApplStateCd;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    } else {
                        str = str2;
                    }
                    fm1Var.p(str, str);
                    return;
                }
                xc xcVar = LlDocumentUpload.this.mBinding;
                if (xcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar = null;
                }
                xcVar.U.setVisibility(8);
                LlDocumentUpload llDocumentUpload = LlDocumentUpload.this;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                llDocumentUpload.p2(responseBean2 != null ? responseBean2.getDeveloperMessage() : null);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocListResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(InsertedUploadDocResponse insertedUploadDocResponse) {
            Integer statusCode;
            try {
                InsertedUploadResponseMessage responseMessage = insertedUploadDocResponse.getResponseMessage();
                if (responseMessage != null && (statusCode = responseMessage.getStatusCode()) != null && statusCode.intValue() == 200) {
                    if (insertedUploadDocResponse.getInsertedDocBean() == null || !(!r0.isEmpty())) {
                        LlDocumentUpload.this.A2();
                        return;
                    } else {
                        LlDocumentUpload.this.b2(insertedUploadDocResponse.getInsertedDocBean());
                        return;
                    }
                }
                LlDocumentUpload llDocumentUpload = LlDocumentUpload.this;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                llDocumentUpload.p2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InsertedUploadDocResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(UploadedDocResponse uploadedDocResponse) {
            List<ResponsesItem> responses;
            Integer statusCode;
            List<ResponsesItem> responses2;
            try {
                xc xcVar = LlDocumentUpload.this.mBinding;
                ResponsesItem responsesItem = null;
                String str = null;
                responsesItem = null;
                if (xcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar = null;
                }
                xcVar.U.c(false);
                if (uploadedDocResponse != null && (statusCode = uploadedDocResponse.getStatusCode()) != null && statusCode.intValue() == 200) {
                    ResponsesItem responsesItem2 = (uploadedDocResponse == null || (responses2 = uploadedDocResponse.getResponses()) == null) ? null : responses2.get(0);
                    Intrinsics.checkNotNull(responsesItem2);
                    Integer statusCode2 = responsesItem2.getStatusCode();
                    if (statusCode2 != null && statusCode2.intValue() == 200) {
                        if (!LlDocumentUpload.this.docItems.isEmpty()) {
                            LlDocumentUpload.this.docItems.clear();
                        }
                        fm1 fm1Var = LlDocumentUpload.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str2 = LlDocumentUpload.this.mApplNo;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str2 = null;
                        }
                        String str3 = LlDocumentUpload.this.mApplStateCd;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str3 = null;
                        }
                        String str4 = LlDocumentUpload.this.serviceCode;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                        } else {
                            str = str4;
                        }
                        fm1Var.m(str2, str3, str, "A");
                        return;
                    }
                }
                LlDocumentUpload llDocumentUpload = LlDocumentUpload.this;
                if (uploadedDocResponse != null && (responses = uploadedDocResponse.getResponses()) != null) {
                    responsesItem = responses.get(0);
                }
                Intrinsics.checkNotNull(responsesItem);
                llDocumentUpload.p2(responsesItem.getDeveloperMessage());
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadedDocResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) throws Throwable {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                xc xcVar = LlDocumentUpload.this.mBinding;
                if (xcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar = null;
                }
                xcVar.L.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                LlDocumentUpload.this.z2(applStatusDetailsItem.getApplFlowStatusList());
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LlDocumentUpload.this.startForProfileImageResult.a(intent);
            LlDocumentUpload.this.x2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LlDocumentUpload.this.startForProfileImageResult.a(intent);
            LlDocumentUpload.this.x2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
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

    public LlDocumentUpload() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.uh3
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LlDocumentUpload.D2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new jf(), new hf() { // from class: com.zepto.vh3
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LlDocumentUpload.R1(this.a, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2() {
        try {
            if (this.docItems.size() > 0) {
                List list = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toSet(this.docItems));
                this.docItems.clear();
                this.docItems.addAll(list);
            }
            xc xcVar = this.mBinding;
            xc xcVar2 = null;
            if (xcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xcVar = null;
            }
            xcVar.K.p();
            xc xcVar3 = this.mBinding;
            if (xcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xcVar3 = null;
            }
            xcVar3.K.setVisibility(8);
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            this.adapter = new com.nic.mparivahan.LLServices.UI.a(this, application, this.docItems, this);
            xc xcVar4 = this.mBinding;
            if (xcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xcVar4 = null;
            }
            RecyclerView recyclerView = xcVar4.V;
            com.nic.mparivahan.LLServices.UI.a aVar = this.adapter;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            xc xcVar5 = this.mBinding;
            if (xcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xcVar5 = null;
            }
            xcVar5.z.setVisibility(0);
            ArrayList arrayList = this.dCodes;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            int size = this.dCodes.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num = (Integer) this.dCodes.get(i2);
                String strValueOf = num != null ? String.valueOf(num) : null;
                int size2 = this.docItems.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (i3 < this.docItems.size()) {
                        DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(i3);
                        if (Intrinsics.areEqual(strValueOf, String.valueOf(documentListItem != null ? documentListItem.getId() : null))) {
                            com.nic.mparivahan.LLServices.UI.a aVar2 = this.adapter;
                            if (aVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                aVar2 = null;
                            }
                            aVar2.Z(i3);
                        }
                    }
                }
            }
            if (this.docItems.size() > 0) {
                xc xcVar6 = this.mBinding;
                if (xcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xcVar2 = xcVar6;
                }
                xcVar2.z.setVisibility(0);
                return;
            }
            xc xcVar7 = this.mBinding;
            if (xcVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                xcVar2 = xcVar7;
            }
            xcVar2.z.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    private final void B2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlDocumentUpload.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("LLDetails", T1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void C2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPayment.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("LLDetails", T1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void D2(LlDocumentUpload this$0, gf result) {
        Bitmap bitmap;
        DocumentListItem documentListItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.x2(false);
                    return;
                } else {
                    this$0.x2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            com.nic.mparivahan.LLServices.UI.a aVar = null;
            Uri data = intentC != null ? intentC.getData() : null;
            Intrinsics.checkNotNull(data);
            if (Build.VERSION.SDK_INT >= 28) {
                ContentResolver contentResolver = this$0.getContentResolver();
                Intrinsics.checkNotNull(data);
                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                Intrinsics.checkNotNullExpressionValue(bitmap, "decodeBitmap(...)");
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(this$0.getContentResolver(), data);
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            }
            File file = new File(n55.b(this$0, data));
            DocumentListItem documentListItem2 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
            if (documentListItem2 != null) {
                documentListItem2.setBrowseStatus(true);
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
            if (documentListItem3 != null) {
                documentListItem3.setURI(data);
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
            if (documentListItem4 != null) {
                documentListItem4.setFileNmae(file.getName());
            }
            String strF = st6.f(bitmap);
            if (strF != null && (documentListItem = (DocumentListItem) this$0.docItems.get(this$0.mPos)) != null) {
                documentListItem.setFileToUpload(strF);
            }
            com.nic.mparivahan.LLServices.UI.a aVar2 = this$0.adapter;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                aVar = aVar2;
            }
            aVar.k(this$0.mPos);
            this$0.x2(false);
        } catch (Exception unused) {
        }
    }

    private final void E2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPhotoSignature.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("LLDetails", T1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void F2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlSlots.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("LLDetails", T1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(List documentList) {
        Iterator it = documentList.iterator();
        while (it.hasNext()) {
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            String str = null;
            if (documentListItem != null) {
                String str2 = this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                documentListItem.setApplication_no(str2);
            }
            if (documentListItem != null) {
                String str3 = this.mApplStateCd;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    str3 = null;
                }
                documentListItem.setStateCode(str3);
            }
            if (documentListItem != null) {
                String str4 = this.serviceCode;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                } else {
                    str = str4;
                }
                documentListItem.setTransationCode(str);
            }
            this.docItems.add(documentListItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(List documentList) {
        String str;
        Iterator it = documentList.iterator();
        while (true) {
            boolean z = false;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            for (DocumentListItem documentListItem2 : this.docItems) {
                if (Intrinsics.areEqual(documentListItem != null ? documentListItem.getId() : null, documentListItem2 != null ? documentListItem2.getId() : null)) {
                    z = true;
                }
            }
            if (!z) {
                if (documentListItem != null) {
                    String str2 = this.mApplNo;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        str2 = null;
                    }
                    documentListItem.setApplication_no(str2);
                }
                if (documentListItem != null) {
                    String str3 = this.mApplStateCd;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                        str3 = null;
                    }
                    documentListItem.setStateCode(str3);
                }
                if (documentListItem != null) {
                    String str4 = this.serviceCode;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                    } else {
                        str = str4;
                    }
                    documentListItem.setTransationCode(str);
                }
                this.docItems.add(documentListItem);
            }
        }
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), S1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        fm1 fm1Var = this.viewModel;
        if (fm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var = null;
        }
        String str5 = this.mApplNo;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str5 = null;
        }
        String str6 = this.mApplStateCd;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
        } else {
            str = str6;
        }
        fm1Var.p(str5, str);
    }

    public static final void R1(LlDocumentUpload this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            try {
                String strQ = st6.q(this$0, uri);
                String strR = st6.r(this$0, uri);
                if (!this$0.Q1().contains(StringsKt__StringsKt.trim((CharSequence) strR).toString())) {
                    this$0.p2(this$0.S1().b("upload_file_types", this$0.getString(R.string.you_can_upload)));
                    return;
                }
                DocumentListItem documentListItem = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(uri);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(strQ);
                }
                boolean zEquals = StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) strR).toString(), "pdf", true);
                com.nic.mparivahan.LLServices.UI.a aVar = null;
                if (zEquals) {
                    String strA = st6.a(this$0, uri);
                    Log.e("log", strA);
                    DocumentListItem documentListItem4 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(strA);
                    }
                    DocumentListItem documentListItem5 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                    Log.e("log2", String.valueOf(documentListItem5 != null ? documentListItem5.getFileToUpload() : null));
                } else {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this$0.getContentResolver(), uri);
                    Intrinsics.checkNotNull(bitmap);
                    String strF = st6.f(bitmap);
                    DocumentListItem documentListItem6 = (DocumentListItem) this$0.docItems.get(this$0.mPos);
                    if (documentListItem6 != null) {
                        documentListItem6.setFileToUpload(strF);
                    }
                }
                com.nic.mparivahan.LLServices.UI.a aVar2 = this$0.adapter;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    aVar = aVar2;
                }
                aVar.k(this$0.mPos);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W1(java.util.ArrayList r7) {
        /*
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 1
            r1 = r0
        L6:
            boolean r2 = r7.hasNext()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L28
            java.lang.Object r2 = r7.next()
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r2 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r2
            if (r2 == 0) goto L1d
            boolean r5 = r2.getIsDocInsertedStatus()
            if (r5 != r0) goto L1d
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r2 == 0) goto L24
            java.lang.String r4 = r2.getRemarks()
        L24:
            if (r4 == 0) goto L6
            r1 = r3
            goto L6
        L28:
            if (r1 == 0) goto L92
            com.zepto.wa3 r7 = r6.S1()
            r0 = 2132017709(0x7f14022d, float:1.9673704E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.r2(r6, r7)
            com.zepto.fm1 r7 = r6.viewModel
            if (r7 != 0) goto L48
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r7 = r4
        L48:
            java.lang.String r0 = r6.mApplNo
            if (r0 != 0) goto L52
            java.lang.String r0 = "mApplNo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r4
        L52:
            java.lang.String r1 = r6.serviceCode
            if (r1 != 0) goto L5c
            java.lang.String r1 = "serviceCode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r4
        L5c:
            java.lang.String r2 = r6.mApplStateCd
            if (r2 != 0) goto L66
            java.lang.String r2 = "mApplStateCd"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r4
        L66:
            java.lang.String r5 = r6.lastEndorseRTOCode
            if (r5 != 0) goto L70
            java.lang.String r5 = "lastEndorseRTOCode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = r4
        L70:
            r7.r(r0, r1, r2, r5)
            com.zepto.xc r7 = r6.mBinding
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L7d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r4
        L7d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.U
            r1 = 8
            r7.setVisibility(r1)
            com.zepto.xc r7 = r6.mBinding
            if (r7 != 0) goto L8c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L8d
        L8c:
            r4 = r7
        L8d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r4.L
            r7.setVisibility(r3)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.LlDocumentUpload.W1(java.util.ArrayList):void");
    }

    private final void X1() {
        xc xcVar = null;
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                Bundle extras3 = getIntent().getExtras();
                this.lastEndorseRTOCode = String.valueOf(extras3 != null ? extras3.get("lastEndorseRTOCode") : null);
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                xc xcVar2 = this.mBinding;
                if (xcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar2 = null;
                }
                xcVar2.F.g.setText(V1().k());
                xc xcVar3 = this.mBinding;
                if (xcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xcVar3 = null;
                }
                xcVar3.A.setText("LL No. : " + this.dlNo);
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                v2((FetchLlDetails) serializableExtra);
            } catch (Exception unused) {
            }
        }
        if (com.nic.mparivahan.a.a.a(this)) {
            fm1 fm1Var = this.viewModel;
            if (fm1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fm1Var = null;
            }
            String str = this.mApplNo;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            String str2 = this.mApplDob;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            }
            fm1Var.g(str, str2);
        } else {
            Toast.makeText(getApplicationContext(), S1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        fm1 fm1Var2 = this.viewModel;
        if (fm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var2 = null;
        }
        fm1Var2.n().g(this, new i(new a()));
        xc xcVar4 = this.mBinding;
        if (xcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar4 = null;
        }
        xcVar4.V.setLayoutManager(new LinearLayoutManager(this));
        xc xcVar5 = this.mBinding;
        if (xcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar5 = null;
        }
        xcVar5.V.setHasFixedSize(true);
        xc xcVar6 = this.mBinding;
        if (xcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar6 = null;
        }
        xcVar6.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.th3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.Y1(this.a, view);
            }
        });
        xc xcVar7 = this.mBinding;
        if (xcVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar = xcVar7;
        }
        xcVar.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.Z1(this.a, view);
            }
        });
    }

    public static final void Y1(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc xcVar = this$0.mBinding;
        xc xcVar2 = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.w.setVisibility(8);
        xc xcVar3 = this$0.mBinding;
        if (xcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar3 = null;
        }
        xcVar3.x.setVisibility(0);
        xc xcVar4 = this$0.mBinding;
        if (xcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar2 = xcVar4;
        }
        xcVar2.H.setVisibility(0);
    }

    public static final void Z1(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc xcVar = this$0.mBinding;
        xc xcVar2 = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.x.setVisibility(8);
        xc xcVar3 = this$0.mBinding;
        if (xcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar3 = null;
        }
        xcVar3.w.setVisibility(0);
        xc xcVar4 = this$0.mBinding;
        if (xcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar2 = xcVar4;
        }
        xcVar2.H.setVisibility(8);
    }

    private final void a2() {
        xc xcVar = this.mBinding;
        fm1 fm1Var = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.K.o();
        fm1 fm1Var2 = this.viewModel;
        if (fm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var2 = null;
        }
        fm1Var2.k().g(this, new i(new b()));
        fm1 fm1Var3 = this.viewModel;
        if (fm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var3 = null;
        }
        fm1Var3.j().g(this, new i(new c()));
        fm1 fm1Var4 = this.viewModel;
        if (fm1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var4 = null;
        }
        fm1Var4.l().g(this, new i(new d()));
        fm1 fm1Var5 = this.viewModel;
        if (fm1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var5 = null;
        }
        fm1Var5.q().g(this, new i(new e()));
        fm1 fm1Var6 = this.viewModel;
        if (fm1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fm1Var = fm1Var6;
        }
        fm1Var.o().g(this, new i(new f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(List documentList) {
        if (documentList != null) {
            try {
                Iterator it = documentList.iterator();
                while (it.hasNext()) {
                    InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) it.next();
                    String remarks = insertedDocBeanItem != null ? insertedDocBeanItem.getRemarks() : null;
                    if (remarks == null || remarks.length() == 0) {
                        for (DocumentListItem documentListItem : this.docItems) {
                            if (documentListItem != null && insertedDocBeanItem != null) {
                                try {
                                    if (StringsKt__StringsJVMKt.equals(documentListItem.getId(), String.valueOf(insertedDocBeanItem.getDocCode()), true)) {
                                        documentListItem.setProofCode(String.valueOf(insertedDocBeanItem.getProofCode()));
                                        documentListItem.setDocCode(String.valueOf(insertedDocBeanItem.getDocCode()));
                                        documentListItem.setDocName(insertedDocBeanItem.getDocName());
                                        documentListItem.setProofName(insertedDocBeanItem.getProofName());
                                        documentListItem.setFileNmae(insertedDocBeanItem.getFileNmae());
                                        documentListItem.setDocURL(insertedDocBeanItem.getDocURL());
                                        documentListItem.setDocNo(insertedDocBeanItem.getDocNo());
                                        documentListItem.setIssueAuthDesg(insertedDocBeanItem.getIssueAuthDesg());
                                        documentListItem.setIssueDate(insertedDocBeanItem.getIssueDate());
                                        documentListItem.setContactNo(insertedDocBeanItem.getContactNo());
                                        documentListItem.setDocInsertedStatus(true);
                                        documentListItem.setReuploaded(insertedDocBeanItem.getReuploaded());
                                        documentListItem.setVerifyStatus(insertedDocBeanItem.getVerifyStatus());
                                        documentListItem.setDocStatus(insertedDocBeanItem.getDocStatus());
                                        documentListItem.setPutUpCase(insertedDocBeanItem.getPutUpCase());
                                        documentListItem.setRemarks(insertedDocBeanItem.getRemarks());
                                        documentListItem.setDocseqNo(String.valueOf(insertedDocBeanItem.getDocseqNo()));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                return;
            }
        }
        W1(this.docItems);
        A2();
    }

    private final boolean c2() {
        for (DocumentListItem documentListItem : this.docItems) {
            if (documentListItem != null && documentListItem.getIsBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void d2() {
        xc xcVar = this.mBinding;
        xc xcVar2 = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.e2(this.a, view);
            }
        });
        xc xcVar3 = this.mBinding;
        if (xcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar3 = null;
        }
        xcVar3.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.f2(this.a, view);
            }
        });
        xc xcVar4 = this.mBinding;
        if (xcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar4 = null;
        }
        xcVar4.F.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.g2(this.a, view);
            }
        });
        xc xcVar5 = this.mBinding;
        if (xcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar5 = null;
        }
        xcVar5.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.h2(this.a, view);
            }
        });
        xc xcVar6 = this.mBinding;
        if (xcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar6 = null;
        }
        xcVar6.I.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.i2(this.a, view);
            }
        });
        xc xcVar7 = this.mBinding;
        if (xcVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar2 = xcVar7;
        }
        xcVar2.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.j2(this.a, view);
            }
        });
    }

    public static final void e2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!(!this$0.docItems.isEmpty()) || !this$0.c2()) {
            this$0.p2(this$0.S1().b("label_attach_document", this$0.getString(R.string.attach_doc)));
            return;
        }
        xc xcVar = this$0.mBinding;
        String str = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.U.c(true);
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.S1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        fm1 fm1Var = this$0.viewModel;
        if (fm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var = null;
        }
        String str2 = this$0.lastEndorseRTOCode;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
        } else {
            str = str2;
        }
        fm1Var.s(str, this$0.docItems);
    }

    public static final void f2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void g2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void h2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.S1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        xc xcVar = this$0.mBinding;
        String str = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.L.c(true);
        fm1 fm1Var = this$0.viewModel;
        if (fm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var = null;
        }
        String str2 = this$0.mApplNo;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str2 = null;
        }
        String str3 = this$0.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str = str3;
        }
        fm1Var.h(str2, str);
    }

    public static final void i2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void j2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void k2() {
        xc xcVar = this.mBinding;
        xc xcVar2 = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.I.g.setText(V1().k());
        xc xcVar3 = this.mBinding;
        if (xcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar3 = null;
        }
        TextView textView = xcVar3.I.h;
        xc xcVar4 = this.mBinding;
        if (xcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar4 = null;
        }
        textView.setPaintFlags(xcVar4.I.h.getPaintFlags() | 8);
        xc xcVar5 = this.mBinding;
        if (xcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar5 = null;
        }
        TextView textView2 = xcVar5.I.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        xc xcVar6 = this.mBinding;
        if (xcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar2 = xcVar6;
        }
        xcVar2.I.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.l2(this.a, view);
            }
        });
    }

    public static final void l2(LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.T1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void n2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.o2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void o2(Dialog d2, LlDocumentUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ai3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.q2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(boolean visible) {
        if (visible) {
            try {
                this.mProgressApplication = new sw4(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
                return;
            }
        }
        sw4 sw4Var = this.mProgressApplication;
        if (sw4Var != null) {
            if (visible) {
                sw4Var.b();
            } else {
                sw4Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(List applFlowStatusList) throws Throwable {
        Integer acCd;
        String str;
        String str2;
        int size = applFlowStatusList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = applFlowStatusList.get(i2);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i2);
                Intrinsics.checkNotNull(obj2);
                Integer acCd2 = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd2 == null || acCd2.intValue() != 455) {
                    Object obj3 = applFlowStatusList.get(i2);
                    Intrinsics.checkNotNull(obj3);
                    acCd = ((ApplFlowStatusListItem) obj3).getAcCd();
                    break;
                }
            }
        }
        acCd = null;
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
            return;
        }
        try {
            DlLogUpdate.Companion companion = DlLogUpdate.INSTANCE;
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.mApplNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str4 = null;
            }
            long j = Long.parseLong(str4);
            int i3 = Integer.parseInt(U1().k());
            String str5 = this.dob;
            Intrinsics.checkNotNull(str5);
            String str6 = this.dlNo;
            Intrinsics.checkNotNull(str6);
            String str7 = this.lastEndorseRTOCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str7;
            }
            companion.a(this, str, j, i3, str5, str6, str2);
        } catch (Exception unused) {
        }
        m2(acCd);
    }

    public final ArrayList Q1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("JPEG");
        arrayList.add("JPG");
        arrayList.add("PDF");
        arrayList.add("jpeg");
        arrayList.add("jpg");
        arrayList.add("pdf");
        arrayList.add("PNG");
        arrayList.add(".png");
        return arrayList;
    }

    public final wa3 S1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails T1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final ws6 U1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 V1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    @Override // com.nic.mparivahan.LLServices.UI.a.InterfaceC0054a
    public void a(int pos) {
        DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem != null) {
            documentListItem.setBrowseStatus(false);
        }
        DocumentListItem documentListItem2 = (DocumentListItem) this.docItems.get(pos);
        com.nic.mparivahan.LLServices.UI.a aVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI(null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        com.nic.mparivahan.LLServices.UI.a aVar2 = this.adapter;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.k(pos);
    }

    @Override // com.nic.mparivahan.LLServices.UI.a.InterfaceC0054a
    public void b(int pos, DocumentListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mPos = pos;
        try {
            DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(pos);
            if (documentListItem != null) {
                documentListItem.setIssueAuthDesg(item.getIssueAuthDesg());
            }
            DocumentListItem documentListItem2 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem2 != null) {
                documentListItem2.setIssueDate(item.getIssueDate());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem3 != null) {
                documentListItem3.setDocNo(item.getDocNo());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem4 != null) {
                documentListItem4.setContactNo(item.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (st6.e(this)) {
            this.getDocLauncher.a("*/*");
        }
    }

    @Override // com.nic.mparivahan.LLServices.UI.a.InterfaceC0054a
    public void c(int pos, DocumentListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mPos = pos;
        try {
            DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(pos);
            if (documentListItem != null) {
                documentListItem.setIssueAuthDesg(item.getIssueAuthDesg());
            }
            DocumentListItem documentListItem2 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem2 != null) {
                documentListItem2.setIssueDate(item.getIssueDate());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem3 != null) {
                documentListItem3.setDocNo(item.getDocNo());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.docItems.get(this.mPos);
            if (documentListItem4 != null) {
                documentListItem4.setContactNo(item.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (aj0.a.a(this)) {
            ox2.a.b(this).e().f(600).i().h(new h());
        } else if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new g());
        }
    }

    public final void m2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            E2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            C2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            B2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            F2();
        } else if (acCd != null && acCd.intValue() == 455) {
            n2(S1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_ll_document_upload);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (xc) lq7VarF;
        this.viewModel = (fm1) new z(this).a(fm1.class);
        xc xcVar = this.mBinding;
        xc xcVar2 = null;
        if (xcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xcVar = null;
        }
        xcVar.v(this);
        w2(new ws6(this));
        u2(new wa3(this));
        t2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        ta3.a aVar = ta3.a;
        xc xcVar3 = this.mBinding;
        if (xcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xcVar2 = xcVar3;
        }
        aVar.f1(this, xcVar2);
        y2(new wl5(this));
        X1();
        a2();
        d2();
        k2();
    }

    public final void r2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(S1().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDocumentUpload.s2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void t2(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.cameraPermission = strArr;
    }

    public final void u2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void v2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void w2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void y2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }
}
