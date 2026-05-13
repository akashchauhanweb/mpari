package com.nic.mparivahan.ClServices.View;

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
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
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
import com.zepto.q7;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.File;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b±\u0001\u0010²\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\nH\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\nH\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0012\u0010$\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014J\u001a\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0016J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016J\u0017\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010(¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010?R\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010?R\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010?R(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010?\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR$\u0010`\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR$\u0010d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR\"\u0010h\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010U\"\u0004\bg\u0010WR\"\u0010l\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010?\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010p\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010?\u001a\u0004\bn\u0010U\"\u0004\bo\u0010WR\"\u0010t\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010?\u001a\u0004\br\u0010U\"\u0004\bs\u0010WR\"\u0010x\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010?\u001a\u0004\bv\u0010U\"\u0004\bw\u0010WR\"\u0010|\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010?\u001a\u0004\bz\u0010U\"\u0004\b{\u0010WR#\u0010\u0080\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010?\u001a\u0004\b~\u0010U\"\u0004\b\u007f\u0010WR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008e\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010RR*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010¤\u0001\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009f\u0001\u0010E\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R)\u0010ª\u0001\u001a\u0014\u0012\u000f\u0012\r §\u0001*\u0005\u0018\u00010¦\u00010¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R9\u0010°\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u000e0\u000e0¥\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010©\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001¨\u0006³\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ClDocumentsUpload;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/ClServices/View/a$a;", "", "h2", "W1", "c2", "", "b2", "Z1", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/DocumentListItem;", "documentList", "E2", "", "message", "o2", "m2", "P1", "Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedDocBeanItem;", "a2", "y2", "Ljava/util/ArrayList;", "docItems", "V1", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "x2", "C2", "z2", "A2", "D2", "visible", "v2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "q2", "", "pos", "item", "c", "b", "a", "Q1", "acCd", "j2", "(Ljava/lang/Integer;)V", "Lcom/zepto/q7;", "C", "Lcom/zepto/q7;", "mBinding", "Lcom/zepto/fm1;", "D", "Lcom/zepto/fm1;", "viewModel", "Lcom/nic/mparivahan/ClServices/View/a;", "E", "Lcom/nic/mparivahan/ClServices/View/a;", "adapter", "F", "Ljava/lang/String;", "mApplNo", "G", "mApplDob", "H", "mApplStateCd", "I", "lastEndorseRTOCode", "J", "serviceCode", "", "K", "[Ljava/lang/String;", "getCameraPermission", "()[Ljava/lang/String;", "s2", "([Ljava/lang/String;)V", "cameraPermission", "L", "Ljava/util/ArrayList;", "M", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "N", "getDob", "setDob", "dob", "O", "getMobile_no", "setMobile_no", "Mobile_no", "P", "getClPhoto", "setClPhoto", "clPhoto", "Q", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "R", "getClName", "setClName", "clName", "S", "getFatherName", "setFatherName", "fatherName", "T", "getAddress", "setAddress", "address", "U", "getCl_Status", "setCl_Status", "cl_Status", "V", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "W", "getValidity", "setValidity", "validity", "Lcom/zepto/ws6;", "X", "Lcom/zepto/ws6;", "T1", "()Lcom/zepto/ws6;", "u2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/sw4;", "Y", "Lcom/zepto/sw4;", "mProgressApplication", "Z", "dCodes", "Lcom/zepto/wa3;", "a0", "Lcom/zepto/wa3;", "S1", "()Lcom/zepto/wa3;", "t2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "b0", "Lcom/zepto/wl5;", "U1", "()Lcom/zepto/wl5;", "w2", "(Lcom/zepto/wl5;)V", "sarthiSession", "c0", "getMPos", "()I", "setMPos", "(I)V", "mPos", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "d0", "Lcom/zepto/of;", "startForProfileImageResult", "e0", "getGetDocLauncher", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClDocumentsUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClDocumentsUpload.kt\ncom/nic/mparivahan/ClServices/View/ClDocumentsUpload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,994:1\n1855#2,2:995\n1855#2,2:997\n1855#2:999\n1855#2,2:1000\n1856#2:1002\n1855#2,2:1003\n1855#2,2:1005\n1#3:1007\n*S KotlinDebug\n*F\n+ 1 ClDocumentsUpload.kt\ncom/nic/mparivahan/ClServices/View/ClDocumentsUpload\n*L\n324#1:995,2\n445#1:997,2\n490#1:999\n492#1:1000,2\n490#1:1002\n528#1:1003,2\n620#1:1005,2\n*E\n"})
public final class ClDocumentsUpload extends pq implements a.InterfaceC0044a {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public q7 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public fm1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public com.nic.mparivahan.ClServices.View.a adapter;

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

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String clName = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String fatherName = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ArrayList dCodes = new ArrayList();

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
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
                ClDocumentsUpload clDocumentsUpload = ClDocumentsUpload.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                clDocumentsUpload.serviceCode = String.valueOf((responseBody == null || (transReq = responseBody.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody2 != null ? responseBody2.getOlaMast() : null;
                ClDocumentsUpload.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                ClDocumentsUpload.this.mApplStateCd = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                q7 q7Var = ClDocumentsUpload.this.mBinding;
                if (q7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var = null;
                }
                TextView textView = q7Var.y;
                String str2 = ClDocumentsUpload.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                q7 q7Var2 = ClDocumentsUpload.this.mBinding;
                if (q7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var2 = null;
                }
                TextView textView2 = q7Var2.C;
                String str3 = ClDocumentsUpload.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                String str4 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                q7 q7Var3 = ClDocumentsUpload.this.mBinding;
                if (q7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var3 = null;
                }
                q7Var3.B.setText(str4);
                q7 q7Var4 = ClDocumentsUpload.this.mBinding;
                if (q7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var4 = null;
                }
                TextView textView3 = q7Var4.E;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                textView3.setText(String.valueOf(responseBody3 != null ? responseBody3.getApdFullName() : null));
                q7 q7Var5 = ClDocumentsUpload.this.mBinding;
                if (q7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var5 = null;
                }
                TextView textView4 = q7Var5.D;
                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                textView4.setText(String.valueOf(responseBody4 != null ? responseBody4.getApdSwdFullName() : null));
                String str5 = ClDocumentsUpload.this.mApplNo;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str5 = null;
                }
                if (str5.length() > 0) {
                    String str6 = ClDocumentsUpload.this.mApplStateCd;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                        str6 = null;
                    }
                    if (str6.length() > 0) {
                        if (!com.nic.mparivahan.a.a.a(ClDocumentsUpload.this)) {
                            Toast.makeText(ClDocumentsUpload.this.getApplicationContext(), ClDocumentsUpload.this.S1().b("label_log_check_internet", ClDocumentsUpload.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                            return;
                        }
                        fm1 fm1Var = ClDocumentsUpload.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str7 = ClDocumentsUpload.this.mApplNo;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str7 = null;
                        }
                        String str8 = ClDocumentsUpload.this.mApplStateCd;
                        if (str8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str8 = null;
                        }
                        String str9 = ClDocumentsUpload.this.serviceCode;
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
                    ClDocumentsUpload.this.E2(uploadDocListResponse.getDocumentList());
                }
                fm1 fm1Var = ClDocumentsUpload.this.viewModel;
                String str = null;
                if (fm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    fm1Var = null;
                }
                String str2 = ClDocumentsUpload.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                String str3 = ClDocumentsUpload.this.mApplStateCd;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    str3 = null;
                }
                String str4 = ClDocumentsUpload.this.serviceCode;
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
                                ClDocumentsUpload.this.dCodes.add(it.next());
                            }
                        }
                        ClDocumentsUpload.this.P1(uploadDocListResponse.getDocumentList());
                        return;
                    }
                    fm1 fm1Var = ClDocumentsUpload.this.viewModel;
                    if (fm1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        fm1Var = null;
                    }
                    String str = ClDocumentsUpload.this.mApplNo;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        str = null;
                    }
                    String str2 = ClDocumentsUpload.this.mApplStateCd;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    } else {
                        str = str2;
                    }
                    fm1Var.p(str, str);
                    return;
                }
                q7 q7Var = ClDocumentsUpload.this.mBinding;
                if (q7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var = null;
                }
                q7Var.U.setVisibility(8);
                ClDocumentsUpload clDocumentsUpload = ClDocumentsUpload.this;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                clDocumentsUpload.o2(responseBean2 != null ? responseBean2.getDeveloperMessage() : null);
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
                        ClDocumentsUpload.this.y2();
                        return;
                    } else {
                        ClDocumentsUpload.this.a2(insertedUploadDocResponse.getInsertedDocBean());
                        return;
                    }
                }
                ClDocumentsUpload clDocumentsUpload = ClDocumentsUpload.this;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                clDocumentsUpload.o2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
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
                q7 q7Var = ClDocumentsUpload.this.mBinding;
                ResponsesItem responsesItem = null;
                String str = null;
                responsesItem = null;
                if (q7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var = null;
                }
                q7Var.U.c(false);
                if (uploadedDocResponse != null && (statusCode = uploadedDocResponse.getStatusCode()) != null && statusCode.intValue() == 200) {
                    ResponsesItem responsesItem2 = (uploadedDocResponse == null || (responses2 = uploadedDocResponse.getResponses()) == null) ? null : responses2.get(0);
                    Intrinsics.checkNotNull(responsesItem2);
                    Integer statusCode2 = responsesItem2.getStatusCode();
                    if (statusCode2 != null && statusCode2.intValue() == 200) {
                        if (!ClDocumentsUpload.this.docItems.isEmpty()) {
                            ClDocumentsUpload.this.docItems.clear();
                        }
                        fm1 fm1Var = ClDocumentsUpload.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str2 = ClDocumentsUpload.this.mApplNo;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str2 = null;
                        }
                        String str3 = ClDocumentsUpload.this.mApplStateCd;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str3 = null;
                        }
                        String str4 = ClDocumentsUpload.this.serviceCode;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                        } else {
                            str = str4;
                        }
                        fm1Var.m(str2, str3, str, "A");
                        return;
                    }
                }
                ClDocumentsUpload clDocumentsUpload = ClDocumentsUpload.this;
                if (uploadedDocResponse != null && (responses = uploadedDocResponse.getResponses()) != null) {
                    responsesItem = responses.get(0);
                }
                Intrinsics.checkNotNull(responsesItem);
                clDocumentsUpload.o2(responsesItem.getDeveloperMessage());
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
                q7 q7Var = ClDocumentsUpload.this.mBinding;
                if (q7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var = null;
                }
                q7Var.L.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                ClDocumentsUpload.this.x2(applStatusDetailsItem.getApplFlowStatusList());
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
            ClDocumentsUpload.this.startForProfileImageResult.a(intent);
            ClDocumentsUpload.this.v2(true);
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
            ClDocumentsUpload.this.startForProfileImageResult.a(intent);
            ClDocumentsUpload.this.v2(true);
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

    public ClDocumentsUpload() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.cm0
            @Override // com.zepto.hf
            public final void a(Object obj) {
                ClDocumentsUpload.B2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new jf(), new hf() { // from class: com.zepto.dm0
            @Override // com.zepto.hf
            public final void a(Object obj) {
                ClDocumentsUpload.R1(this.a, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void B2(ClDocumentsUpload this$0, gf result) {
        Bitmap bitmap;
        DocumentListItem documentListItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.v2(false);
                    return;
                } else {
                    this$0.v2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            com.nic.mparivahan.ClServices.View.a aVar = null;
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
            com.nic.mparivahan.ClServices.View.a aVar2 = this$0.adapter;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                aVar = aVar2;
            }
            aVar.k(this$0.mPos);
            this$0.v2(false);
        } catch (Exception unused) {
        }
    }

    public static final void R1(ClDocumentsUpload this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            try {
                String strQ = st6.q(this$0, uri);
                String strR = st6.r(this$0, uri);
                if (!this$0.Q1().contains(StringsKt__StringsKt.trim((CharSequence) strR).toString())) {
                    this$0.o2(this$0.S1().b("upload_file_types", this$0.getString(R.string.you_can_upload)));
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
                com.nic.mparivahan.ClServices.View.a aVar = null;
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
                com.nic.mparivahan.ClServices.View.a aVar2 = this$0.adapter;
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

    private final void W1() {
        q7 q7Var = null;
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
                String stringExtra2 = getIntent().getStringExtra("clName");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.clName = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("fatherName");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.fatherName = stringExtra3;
                this.address = String.valueOf(getIntent().getStringExtra("address"));
                this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.validity = String.valueOf(getIntent().getStringExtra("validity"));
                this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra4 = getIntent().getStringExtra("clPhoto");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.clPhoto = stringExtra4;
                q7 q7Var2 = this.mBinding;
                if (q7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var2 = null;
                }
                q7Var2.F.g.setText(U1().k());
                q7 q7Var3 = this.mBinding;
                if (q7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var3 = null;
                }
                q7Var3.A.setText("CL No. : " + this.dlNo);
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
        q7 q7Var4 = this.mBinding;
        if (q7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var4 = null;
        }
        q7Var4.V.setLayoutManager(new LinearLayoutManager(this));
        q7 q7Var5 = this.mBinding;
        if (q7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var5 = null;
        }
        q7Var5.V.setHasFixedSize(true);
        q7 q7Var6 = this.mBinding;
        if (q7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var6 = null;
        }
        q7Var6.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.X1(this.a, view);
            }
        });
        q7 q7Var7 = this.mBinding;
        if (q7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q7Var = q7Var7;
        }
        q7Var.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.am0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.Y1(this.a, view);
            }
        });
    }

    public static final void X1(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q7 q7Var = this$0.mBinding;
        q7 q7Var2 = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.w.setVisibility(8);
        q7 q7Var3 = this$0.mBinding;
        if (q7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var3 = null;
        }
        q7Var3.x.setVisibility(0);
        q7 q7Var4 = this$0.mBinding;
        if (q7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q7Var2 = q7Var4;
        }
        q7Var2.H.setVisibility(0);
    }

    public static final void Y1(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q7 q7Var = this$0.mBinding;
        q7 q7Var2 = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.x.setVisibility(8);
        q7 q7Var3 = this$0.mBinding;
        if (q7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var3 = null;
        }
        q7Var3.w.setVisibility(0);
        q7 q7Var4 = this$0.mBinding;
        if (q7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q7Var2 = q7Var4;
        }
        q7Var2.H.setVisibility(8);
    }

    private final void c2() {
        q7 q7Var = this.mBinding;
        q7 q7Var2 = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.im0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.d2(this.a, view);
            }
        });
        q7 q7Var3 = this.mBinding;
        if (q7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var3 = null;
        }
        q7Var3.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.e2(this.a, view);
            }
        });
        q7 q7Var4 = this.mBinding;
        if (q7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var4 = null;
        }
        q7Var4.F.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.f2(view);
            }
        });
        q7 q7Var5 = this.mBinding;
        if (q7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q7Var2 = q7Var5;
        }
        q7Var2.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.g2(this.a, view);
            }
        });
    }

    public static final void d2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!(!this$0.docItems.isEmpty()) || !this$0.b2()) {
            this$0.o2(this$0.S1().b("label_attach_document", this$0.getString(R.string.attach_doc)));
            return;
        }
        q7 q7Var = this$0.mBinding;
        String str = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.U.c(true);
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

    public static final void e2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void f2(View view) {
    }

    public static final void g2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.S1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        q7 q7Var = this$0.mBinding;
        String str = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.L.c(true);
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

    private final void h2() {
        try {
            q7 q7Var = this.mBinding;
            q7 q7Var2 = null;
            if (q7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var = null;
            }
            q7Var.I.g.setText(U1().k());
            q7 q7Var3 = this.mBinding;
            if (q7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var3 = null;
            }
            TextView textView = q7Var3.I.h;
            q7 q7Var4 = this.mBinding;
            if (q7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var4 = null;
            }
            textView.setPaintFlags(q7Var4.I.h.getPaintFlags() | 8);
            if (Intrinsics.areEqual(U1().b(), "551")) {
                q7 q7Var5 = this.mBinding;
                if (q7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var5 = null;
                }
                q7Var5.I.h.setVisibility(8);
            } else {
                q7 q7Var6 = this.mBinding;
                if (q7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    q7Var6 = null;
                }
                q7Var6.I.h.setVisibility(0);
            }
            q7 q7Var7 = this.mBinding;
            if (q7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var7 = null;
            }
            q7Var7.I.h.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
            q7 q7Var8 = this.mBinding;
            if (q7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                q7Var2 = q7Var8;
            }
            q7Var2.I.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.em0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClDocumentsUpload.i2(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void i2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.U1().b(), "551")) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", this$0.dlNo);
            intent.putExtra("dobValue", this$0.dob);
            intent.putExtra("fatherName", this$0.fatherName);
            intent.putExtra("clName", this$0.clName);
            intent.putExtra("clPhoto", this$0.clPhoto);
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void k2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void l2(ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void n2(Dialog d2, ClDocumentsUpload this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.p2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void p2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void r2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v2(boolean visible) {
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

    public final void A2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void C2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void D2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClSots.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void E2(List documentList) {
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

    public final ws6 T1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 U1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V1(java.util.ArrayList r7) {
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
            r6.q2(r6, r7)
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
            com.zepto.q7 r7 = r6.mBinding
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L7d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r4
        L7d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.U
            r1 = 8
            r7.setVisibility(r1)
            com.zepto.q7 r7 = r6.mBinding
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClDocumentsUpload.V1(java.util.ArrayList):void");
    }

    public final void Z1() {
        q7 q7Var = this.mBinding;
        fm1 fm1Var = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.K.o();
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

    @Override // com.nic.mparivahan.ClServices.View.a.InterfaceC0044a
    public void a(int pos) {
        DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem != null) {
            documentListItem.setBrowseStatus(false);
        }
        DocumentListItem documentListItem2 = (DocumentListItem) this.docItems.get(pos);
        com.nic.mparivahan.ClServices.View.a aVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI(null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        com.nic.mparivahan.ClServices.View.a aVar2 = this.adapter;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.k(pos);
    }

    public final void a2(List documentList) {
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
        V1(this.docItems);
        y2();
    }

    @Override // com.nic.mparivahan.ClServices.View.a.InterfaceC0044a
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

    public final boolean b2() {
        for (DocumentListItem documentListItem : this.docItems) {
            if (documentListItem != null && documentListItem.getIsBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.nic.mparivahan.ClServices.View.a.InterfaceC0044a
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

    public final void j2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            C2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            A2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            z2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            D2();
        } else if (acCd != null && acCd.intValue() == 455) {
            m2(S1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void m2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.n2(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_documents_upload);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (q7) lq7VarF;
        this.viewModel = (fm1) new z(this).a(fm1.class);
        q7 q7Var = this.mBinding;
        q7 q7Var2 = null;
        if (q7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var = null;
        }
        q7Var.v(this);
        u2(new ws6(this));
        t2(new wa3(this));
        w2(new wl5(this));
        s2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        W1();
        Z1();
        c2();
        h2();
        q7 q7Var3 = this.mBinding;
        if (q7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            q7Var3 = null;
        }
        q7Var3.I.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.k2(this.a, view);
            }
        });
        q7 q7Var4 = this.mBinding;
        if (q7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            q7Var2 = q7Var4;
        }
        q7Var2.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.l2(this.a, view);
            }
        });
    }

    public final void q2(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDocumentsUpload.r2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void s2(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.cameraPermission = strArr;
    }

    public final void t2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void u2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void w2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void x2(List applFlowStatusList) throws Throwable {
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
            int i3 = Integer.parseInt(T1().k());
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
        j2(acCd);
    }

    public final void y2() {
        try {
            if (this.docItems.size() > 0) {
                List list = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toSet(this.docItems));
                this.docItems.clear();
                this.docItems.addAll(list);
            }
            q7 q7Var = this.mBinding;
            q7 q7Var2 = null;
            if (q7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var = null;
            }
            q7Var.K.p();
            q7 q7Var3 = this.mBinding;
            if (q7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var3 = null;
            }
            q7Var3.K.setVisibility(8);
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            this.adapter = new com.nic.mparivahan.ClServices.View.a(this, application, this.docItems, this);
            q7 q7Var4 = this.mBinding;
            if (q7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var4 = null;
            }
            RecyclerView recyclerView = q7Var4.V;
            com.nic.mparivahan.ClServices.View.a aVar = this.adapter;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            q7 q7Var5 = this.mBinding;
            if (q7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                q7Var5 = null;
            }
            q7Var5.z.setVisibility(0);
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
                            com.nic.mparivahan.ClServices.View.a aVar2 = this.adapter;
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
                q7 q7Var6 = this.mBinding;
                if (q7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    q7Var2 = q7Var6;
                }
                q7Var2.z.setVisibility(0);
                return;
            }
            q7 q7Var7 = this.mBinding;
            if (q7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                q7Var2 = q7Var7;
            }
            q7Var2.z.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public final void z2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
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
            intent.putExtra("fatherName", this.fatherName);
            intent.putExtra("clName", this.clName);
            intent.putExtra("clPhoto", this.clPhoto);
            intent.putExtra("address", this.address).toString();
            intent.putExtra("issuing_authority", this.issuing_authority).toString();
            intent.putExtra("validity", this.validity).toString();
            intent.putExtra("cl_Status", this.cl_Status).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }
}
