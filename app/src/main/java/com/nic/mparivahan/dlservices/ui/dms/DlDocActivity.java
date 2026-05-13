package com.nic.mparivahan.dlservices.ui.dms;

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
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
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.dms.a;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.zepto.aj0;
import com.zepto.fm1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jf;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.n55;
import com.zepto.o40;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.va;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
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
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b»\u0001\u0010¼\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\tH\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\tH\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0012\u0010$\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014J\u001a\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0018\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\nH\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\nH\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0016J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u0017\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010(¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010?R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010?R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010?R(\u0010X\u001a\b\u0012\u0004\u0012\u00020\r0Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010`\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010]\"\u0004\bc\u0010_R$\u0010h\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R\"\u0010l\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010?\u001a\u0004\bj\u0010]\"\u0004\bk\u0010_R\"\u0010p\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010?\u001a\u0004\bn\u0010]\"\u0004\bo\u0010_R\"\u0010t\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010?\u001a\u0004\br\u0010]\"\u0004\bs\u0010_R\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010?\u001a\u0004\b~\u0010]\"\u0004\b\u007f\u0010_R \u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010ZR*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R.\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0097\u0001\u0010Z\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010 \u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010?\u001a\u0005\b\u009e\u0001\u0010]\"\u0005\b\u009f\u0001\u0010_R.\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¡\u0001\u0010Z\u001a\u0006\b¢\u0001\u0010\u0099\u0001\"\u0006\b£\u0001\u0010\u009b\u0001R(\u0010¨\u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010?\u001a\u0005\b¦\u0001\u0010]\"\u0005\b§\u0001\u0010_R(\u0010®\u0001\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b©\u0001\u0010>\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R)\u0010´\u0001\u001a\u0014\u0012\u000f\u0012\r ±\u0001*\u0005\u0018\u00010°\u00010°\u00010¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R9\u0010º\u0001\u001a\u0012\u0012\r\u0012\u000b ±\u0001*\u0004\u0018\u00010\r0\r0¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010³\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001¨\u0006½\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dms/DlDocActivity;", "Lcom/zepto/o40;", "Lcom/nic/mparivahan/dlservices/ui/dms/a$a;", "", "s2", "y2", "", "x2", "v2", "", "Lcom/nic/mparivahan/dlservices/data/model/temp/DocumentListItem;", "documentList", "g3", "", "message", "L2", "J2", "h2", "P2", "Lcom/nic/mparivahan/dlservices/data/model/temp/InsertedDocBeanItem;", "w2", "a3", "Ljava/util/ArrayList;", "docItems", "r2", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "Z2", "e3", "b3", "c3", "f3", "visible", "X2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "N2", "", "pos", "item", "c", "b", "a", "i2", "acCd", "D2", "(Ljava/lang/Integer;)V", "Lcom/zepto/va;", "F", "Lcom/zepto/va;", "mBinding", "Lcom/zepto/fm1;", "G", "Lcom/zepto/fm1;", "viewModel", "Lcom/nic/mparivahan/dlservices/ui/dms/a;", "H", "Lcom/nic/mparivahan/dlservices/ui/dms/a;", "adapter", "I", "Ljava/lang/String;", "mApplNo", "J", "mApplDob", "K", "mApplStateCd", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "L", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "k2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "S2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "M", "lastEndorseRTOCode", "N", "serviceCode", "", "O", "[Ljava/lang/String;", "getCameraPermission", "()[Ljava/lang/String;", "R2", "([Ljava/lang/String;)V", "cameraPermission", "P", "Ljava/util/ArrayList;", "Q", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "R", "getDob", "setDob", "dob", "S", "getMobile_no", "setMobile_no", "Mobile_no", "T", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "U", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "V", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Lcom/zepto/ws6;", "W", "Lcom/zepto/ws6;", "o2", "()Lcom/zepto/ws6;", "V2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "X", "j2", "Q2", "apdApplicant", "Y", "dCodes", "Lcom/zepto/wa3;", "Z", "Lcom/zepto/wa3;", "m2", "()Lcom/zepto/wa3;", "T2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/sw4;", "a0", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/zepto/wl5;", "b0", "Lcom/zepto/wl5;", "q2", "()Lcom/zepto/wl5;", "Y2", "(Lcom/zepto/wl5;)V", "sarthiSession", "c0", "p2", "()Ljava/util/ArrayList;", "W2", "(Ljava/util/ArrayList;)V", "multiListName", "d0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "e0", "n2", "U2", "listHeaderSteps", "f0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "g0", "getMPos", "()I", "setMPos", "(I)V", "mPos", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "h0", "Lcom/zepto/of;", "startForProfileImageResult", "i0", "getGetDocLauncher", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDlDocActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlDocActivity.kt\ncom/nic/mparivahan/dlservices/ui/dms/DlDocActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1181:1\n1855#2,2:1182\n1855#2,2:1184\n1855#2:1186\n1855#2,2:1187\n1856#2:1189\n1855#2,2:1190\n1855#2,2:1192\n1#3:1194\n*S KotlinDebug\n*F\n+ 1 DlDocActivity.kt\ncom/nic/mparivahan/dlservices/ui/dms/DlDocActivity\n*L\n417#1:1182,2\n538#1:1184,2\n583#1:1186\n585#1:1187,2\n583#1:1189\n625#1:1190,2\n712#1:1192,2\n*E\n"})
public final class DlDocActivity extends o40 implements a.InterfaceC0060a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public va mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public fm1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public com.nic.mparivahan.dlservices.ui.dms.a adapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String mApplStateCd;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String[] cameraPermission;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String apdApplicant;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList docItems = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ArrayList dCodes = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
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
                DlDocActivity dlDocActivity = DlDocActivity.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                String apdApplicantCatg = responseBody != null ? responseBody.getApdApplicantCatg() : null;
                Intrinsics.checkNotNull(apdApplicantCatg);
                dlDocActivity.Q2(apdApplicantCatg);
                DlDocActivity dlDocActivity2 = DlDocActivity.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                dlDocActivity2.serviceCode = String.valueOf((responseBody2 == null || (transReq = responseBody2.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody3 != null ? responseBody3.getOlaMast() : null;
                DlDocActivity.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                DlDocActivity.this.mApplStateCd = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                va vaVar = DlDocActivity.this.mBinding;
                if (vaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar = null;
                }
                TextView textView = vaVar.y;
                String str2 = DlDocActivity.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                va vaVar2 = DlDocActivity.this.mBinding;
                if (vaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar2 = null;
                }
                TextView textView2 = vaVar2.C;
                String str3 = DlDocActivity.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                String str4 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                va vaVar3 = DlDocActivity.this.mBinding;
                if (vaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar3 = null;
                }
                vaVar3.B.setText(str4);
                va vaVar4 = DlDocActivity.this.mBinding;
                if (vaVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar4 = null;
                }
                TextView textView3 = vaVar4.E;
                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                textView3.setText(String.valueOf(responseBody4 != null ? responseBody4.getApdFullName() : null));
                va vaVar5 = DlDocActivity.this.mBinding;
                if (vaVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar5 = null;
                }
                TextView textView4 = vaVar5.D;
                ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                textView4.setText(String.valueOf(responseBody5 != null ? responseBody5.getApdSwdFullName() : null));
                String str5 = DlDocActivity.this.mApplNo;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str5 = null;
                }
                if (str5.length() > 0) {
                    String str6 = DlDocActivity.this.mApplStateCd;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                        str6 = null;
                    }
                    if (str6.length() > 0) {
                        if (!com.nic.mparivahan.a.a.a(DlDocActivity.this)) {
                            Toast.makeText(DlDocActivity.this.getApplicationContext(), DlDocActivity.this.m2().b("label_log_check_internet", DlDocActivity.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                            return;
                        }
                        fm1 fm1Var = DlDocActivity.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str7 = DlDocActivity.this.mApplNo;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str7 = null;
                        }
                        String str8 = DlDocActivity.this.mApplStateCd;
                        if (str8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str8 = null;
                        }
                        String str9 = DlDocActivity.this.serviceCode;
                        if (str9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                        } else {
                            str = str9;
                        }
                        fm1Var.m(str7, str8, str, DlDocActivity.this.j2());
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
                    DlDocActivity.this.g3(uploadDocListResponse.getDocumentList());
                }
                fm1 fm1Var = DlDocActivity.this.viewModel;
                String str = null;
                if (fm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    fm1Var = null;
                }
                String str2 = DlDocActivity.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                String str3 = DlDocActivity.this.mApplStateCd;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    str3 = null;
                }
                String str4 = DlDocActivity.this.serviceCode;
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
                va vaVar = null;
                String str = null;
                if (responseBean != null && (statusCode = responseBean.getStatusCode()) != null && statusCode.intValue() == 200) {
                    if (uploadDocListResponse.getDocumentList() != null && (!r0.isEmpty())) {
                        List<Integer> dCodes = uploadDocListResponse.getDCodes();
                        if (dCodes != null && !dCodes.isEmpty()) {
                            Iterator<Integer> it = uploadDocListResponse.getDCodes().iterator();
                            while (it.hasNext()) {
                                DlDocActivity.this.dCodes.add(it.next());
                            }
                        }
                        DlDocActivity.this.h2(uploadDocListResponse.getDocumentList());
                        return;
                    }
                    fm1 fm1Var = DlDocActivity.this.viewModel;
                    if (fm1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        fm1Var = null;
                    }
                    String str2 = DlDocActivity.this.mApplNo;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        str2 = null;
                    }
                    String str3 = DlDocActivity.this.mApplStateCd;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                    } else {
                        str = str3;
                    }
                    fm1Var.p(str2, str);
                    return;
                }
                va vaVar2 = DlDocActivity.this.mBinding;
                if (vaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar2 = null;
                }
                vaVar2.Z.setVisibility(8);
                DlDocActivity dlDocActivity = DlDocActivity.this;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                String developerMessage = responseBean2 != null ? responseBean2.getDeveloperMessage() : null;
                va vaVar3 = DlDocActivity.this.mBinding;
                if (vaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    vaVar = vaVar3;
                }
                dlDocActivity.w1(developerMessage, vaVar.m());
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
                        DlDocActivity.this.a3();
                        return;
                    } else {
                        DlDocActivity.this.w2(insertedUploadDocResponse.getInsertedDocBean());
                        return;
                    }
                }
                DlDocActivity dlDocActivity = DlDocActivity.this;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                va vaVar = null;
                String developerMessage = responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null;
                va vaVar2 = DlDocActivity.this.mBinding;
                if (vaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    vaVar = vaVar2;
                }
                dlDocActivity.w1(developerMessage, vaVar.m());
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
                va vaVar = DlDocActivity.this.mBinding;
                ResponsesItem responsesItem = null;
                String str = null;
                responsesItem = null;
                if (vaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar = null;
                }
                vaVar.Z.c(false);
                if (uploadedDocResponse != null && (statusCode = uploadedDocResponse.getStatusCode()) != null && statusCode.intValue() == 200) {
                    ResponsesItem responsesItem2 = (uploadedDocResponse == null || (responses2 = uploadedDocResponse.getResponses()) == null) ? null : responses2.get(0);
                    Intrinsics.checkNotNull(responsesItem2);
                    Integer statusCode2 = responsesItem2.getStatusCode();
                    if (statusCode2 != null && statusCode2.intValue() == 200) {
                        if (!DlDocActivity.this.docItems.isEmpty()) {
                            DlDocActivity.this.docItems.clear();
                        }
                        fm1 fm1Var = DlDocActivity.this.viewModel;
                        if (fm1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            fm1Var = null;
                        }
                        String str2 = DlDocActivity.this.mApplNo;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                            str2 = null;
                        }
                        String str3 = DlDocActivity.this.mApplStateCd;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplStateCd");
                            str3 = null;
                        }
                        String str4 = DlDocActivity.this.serviceCode;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serviceCode");
                        } else {
                            str = str4;
                        }
                        fm1Var.m(str2, str3, str, DlDocActivity.this.j2());
                        return;
                    }
                }
                DlDocActivity dlDocActivity = DlDocActivity.this;
                if (uploadedDocResponse != null && (responses = uploadedDocResponse.getResponses()) != null) {
                    responsesItem = responses.get(0);
                }
                Intrinsics.checkNotNull(responsesItem);
                dlDocActivity.L2(responsesItem.getDeveloperMessage());
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
                va vaVar = DlDocActivity.this.mBinding;
                if (vaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    vaVar = null;
                }
                vaVar.P.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                DlDocActivity.this.Z2(applStatusDetailsItem.getApplFlowStatusList());
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
            DlDocActivity.this.startForProfileImageResult.a(intent);
            DlDocActivity.this.X2(true);
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
            DlDocActivity.this.startForProfileImageResult.a(intent);
            DlDocActivity.this.X2(true);
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

    public DlDocActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.nl1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlDocActivity.d3(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new jf(), new hf() { // from class: com.zepto.ol1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlDocActivity.l2(this.a, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void A2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        va vaVar = null;
        String str = null;
        if (!(!this$0.docItems.isEmpty()) || !this$0.x2()) {
            String strB = this$0.m2().b("label_attach_document", this$0.getString(R.string.attach_doc));
            va vaVar2 = this$0.mBinding;
            if (vaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                vaVar = vaVar2;
            }
            this$0.w1(strB, vaVar.m());
            return;
        }
        va vaVar3 = this$0.mBinding;
        if (vaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar3 = null;
        }
        vaVar3.Z.c(true);
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.m2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
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

    public static final void B2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void C2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.m2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        va vaVar = this$0.mBinding;
        String str = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        vaVar.P.c(true);
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

    public static final void E2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
        intent.putExtra("DL", this$0.dlNo);
        intent.putExtra("dob", this$0.dob);
        intent.putExtra("DLDetails", this$0.k2());
        intent.putExtra("Mobile_no", this$0.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
        String str = this$0.lastEndorseRTOCode;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            str = null;
        }
        intent.putExtra("lastEndorsedRTOCode", str);
        intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
        this$0.startActivity(intent);
    }

    public static final void F2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void G2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!Intrinsics.areEqual(this$0.q2().b(), VContant.MULTISERVICE_PURPOSE_CODE) || this$0.n2().size() <= 1) {
                return;
            }
            final Dialog dialog = new Dialog(this$0);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) viewFindViewById4;
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlDocActivity.H2(dialog, view2);
                }
            });
            int size = this$0.n2().size();
            String str = "";
            int i2 = 0;
            String string = "";
            while (i2 < size) {
                str = str + ((String) this$0.n2().get(i2)) + '\n';
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                i2++;
                sb.append(i2);
                sb.append(".\n");
                string = sb.toString();
            }
            textView2.setText(str);
            textView3.setText(string);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ql1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlDocActivity.I2(dialog, view2);
                }
            });
            Window window2 = dialog.getWindow();
            Intrinsics.checkNotNull(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        } catch (Exception unused) {
        }
    }

    public static final void H2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void J2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.K2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void K2(Dialog d2, DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.M2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void O2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(boolean visible) {
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
    public final void Z2(List applFlowStatusList) throws Throwable {
        Integer acCd;
        String str;
        String str2;
        int size = applFlowStatusList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                acCd = null;
                break;
            }
            Object obj = applFlowStatusList.get(i2);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i2);
                Intrinsics.checkNotNull(obj2);
                acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i2++;
        }
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
            int i3 = Integer.parseInt(o2().k());
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
        D2(acCd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3() {
        try {
            if (this.docItems.size() > 0) {
                List list = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toSet(this.docItems));
                this.docItems.clear();
                this.docItems.addAll(list);
            }
            va vaVar = this.mBinding;
            va vaVar2 = null;
            if (vaVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                vaVar = null;
            }
            vaVar.O.p();
            va vaVar3 = this.mBinding;
            if (vaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                vaVar3 = null;
            }
            vaVar3.O.setVisibility(8);
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            this.adapter = new com.nic.mparivahan.dlservices.ui.dms.a(this, application, this.docItems, this);
            va vaVar4 = this.mBinding;
            if (vaVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                vaVar4 = null;
            }
            RecyclerView recyclerView = vaVar4.a0;
            com.nic.mparivahan.dlservices.ui.dms.a aVar = this.adapter;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            va vaVar5 = this.mBinding;
            if (vaVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                vaVar5 = null;
            }
            vaVar5.z.setVisibility(0);
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
                            com.nic.mparivahan.dlservices.ui.dms.a aVar2 = this.adapter;
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
                va vaVar6 = this.mBinding;
                if (vaVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    vaVar2 = vaVar6;
                }
                vaVar2.z.setVisibility(0);
                return;
            }
            va vaVar7 = this.mBinding;
            if (vaVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                vaVar2 = vaVar7;
            }
            vaVar2.z.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    private final void b3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", k2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", p2());
                intent.putExtra("listHeaderSteps", n2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void c3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DLRenewalFeePaymentActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", k2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", p2());
                intent.putExtra("listHeaderSteps", n2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void d3(DlDocActivity this$0, gf result) {
        Bitmap bitmap;
        DocumentListItem documentListItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.X2(false);
                    return;
                } else {
                    this$0.X2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            com.nic.mparivahan.dlservices.ui.dms.a aVar = null;
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
            com.nic.mparivahan.dlservices.ui.dms.a aVar2 = this$0.adapter;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                aVar = aVar2;
            }
            aVar.k(this$0.mPos);
            this$0.X2(false);
        } catch (Exception unused) {
        }
    }

    private final void e3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoAndSignatureActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", k2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", p2());
                intent.putExtra("listHeaderSteps", n2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void f3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlRenewalSlotsActivity.class);
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
            intent.putExtra("dl_st_dl_details_obj", k2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            String str4 = this.lastEndorseRTOCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            if (Intrinsics.areEqual(q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", p2());
                intent.putExtra("listHeaderSteps", n2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(List documentList) {
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
    public final void h2(List documentList) {
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
        P2();
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), m2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
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

    public static final void l2(DlDocActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            try {
                String strQ = st6.q(this$0, uri);
                String strR = st6.r(this$0, uri);
                va vaVar = null;
                com.nic.mparivahan.dlservices.ui.dms.a aVar = null;
                if (!this$0.i2().contains(StringsKt__StringsKt.trim((CharSequence) strR).toString())) {
                    String strB = this$0.m2().b("upload_file_types", this$0.getString(R.string.you_can_upload));
                    va vaVar2 = this$0.mBinding;
                    if (vaVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        vaVar = vaVar2;
                    }
                    this$0.w1(strB, vaVar.m());
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
                if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) strR).toString(), "pdf", true)) {
                    String strA = st6.a(this$0, uri);
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
                com.nic.mparivahan.dlservices.ui.dms.a aVar2 = this$0.adapter;
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
    private final void r2(java.util.ArrayList r7) {
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
            com.zepto.wa3 r7 = r6.m2()
            r0 = 2132017709(0x7f14022d, float:1.9673704E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.N2(r6, r7)
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
            com.zepto.va r7 = r6.mBinding
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L7d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r7 = r4
        L7d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.Z
            r1 = 8
            r7.setVisibility(r1)
            com.zepto.va r7 = r6.mBinding
            if (r7 != 0) goto L8c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L8d
        L8c:
            r4 = r7
        L8d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r4.P
            r7.setVisibility(r3)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.r2(java.util.ArrayList):void");
    }

    private final void s2() {
        new wl5(this);
        va vaVar = null;
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
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                S2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra3;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                S2((DldetobjX) serializableExtra2);
                Bundle extras4 = getIntent().getExtras();
                Serializable serializable = extras4 != null ? extras4.getSerializable("dl_st_dl_details_obj") : null;
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                S2((DldetobjX) serializable);
                String bioDlno = k2().getBioObj().getBioDlno();
                if (bioDlno != null && bioDlno.length() != 0) {
                    va vaVar2 = this.mBinding;
                    if (vaVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar2 = null;
                    }
                    vaVar2.A.setText(m2().b("dl_no", "DL No. : ") + ' ' + k2().getBioObj().getBioDlno());
                } else if (this.dlNo != null) {
                    va vaVar3 = this.mBinding;
                    if (vaVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar3 = null;
                    }
                    vaVar3.A.setText(m2().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
                }
                BioImgObjX bioImgObj = k2().getBioImgObj();
                String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                if (biPhoto == null || biPhoto.length() == 0) {
                    va vaVar4 = this.mBinding;
                    if (vaVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar4 = null;
                    }
                    vaVar4.F.f.setVisibility(4);
                } else {
                    va vaVar5 = this.mBinding;
                    if (vaVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar5 = null;
                    }
                    vaVar5.F.f.setVisibility(0);
                    va vaVar6 = this.mBinding;
                    if (vaVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar6 = null;
                    }
                    ImageView imageView = vaVar6.F.b;
                    BioImgObjX bioImgObj2 = k2().getBioImgObj();
                    imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                }
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
            Toast.makeText(getApplicationContext(), m2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        fm1 fm1Var2 = this.viewModel;
        if (fm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fm1Var2 = null;
        }
        fm1Var2.n().g(this, new i(new a()));
        va vaVar7 = this.mBinding;
        if (vaVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar7 = null;
        }
        vaVar7.a0.setLayoutManager(new LinearLayoutManager(this));
        va vaVar8 = this.mBinding;
        if (vaVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar8 = null;
        }
        vaVar8.a0.setHasFixedSize(true);
        va vaVar9 = this.mBinding;
        if (vaVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar9 = null;
        }
        vaVar9.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.t2(this.a, view);
            }
        });
        va vaVar10 = this.mBinding;
        if (vaVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            vaVar = vaVar10;
        }
        vaVar.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.u2(this.a, view);
            }
        });
    }

    public static final void t2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        va vaVar = this$0.mBinding;
        va vaVar2 = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        vaVar.w.setVisibility(8);
        va vaVar3 = this$0.mBinding;
        if (vaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar3 = null;
        }
        vaVar3.x.setVisibility(0);
        va vaVar4 = this$0.mBinding;
        if (vaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            vaVar2 = vaVar4;
        }
        vaVar2.J.setVisibility(0);
    }

    public static final void u2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        va vaVar = this$0.mBinding;
        va vaVar2 = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        vaVar.x.setVisibility(8);
        va vaVar3 = this$0.mBinding;
        if (vaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar3 = null;
        }
        vaVar3.w.setVisibility(0);
        va vaVar4 = this$0.mBinding;
        if (vaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            vaVar2 = vaVar4;
        }
        vaVar2.J.setVisibility(8);
    }

    private final void v2() {
        va vaVar = this.mBinding;
        fm1 fm1Var = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        vaVar.O.o();
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
    public final void w2(List documentList) {
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
        r2(this.docItems);
        a3();
    }

    private final boolean x2() {
        for (DocumentListItem documentListItem : this.docItems) {
            if (documentListItem != null && documentListItem.getIsBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void y2() {
        va vaVar = this.mBinding;
        va vaVar2 = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        vaVar.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.A2(this.a, view);
            }
        });
        va vaVar3 = this.mBinding;
        if (vaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar3 = null;
        }
        vaVar3.F.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.B2(this.a, view);
            }
        });
        va vaVar4 = this.mBinding;
        if (vaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar4 = null;
        }
        vaVar4.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.C2(this.a, view);
            }
        });
        va vaVar5 = this.mBinding;
        if (vaVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            vaVar2 = vaVar5;
        }
        vaVar2.K.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.z2(this.a, view);
            }
        });
    }

    public static final void z2(DlDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.k2());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            String str = this$0.lastEndorseRTOCode;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
                str = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            if (Intrinsics.areEqual(this$0.q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.p2());
                intent.putExtra("listHeaderSteps", this$0.n2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void D2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            e3();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            c3();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            b3();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            f3();
            return;
        }
        if (acCd != null && acCd.intValue() == 133) {
            f3();
        } else if (acCd != null && acCd.intValue() == 455) {
            J2(m2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void N2(Context context, String message) {
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
        textView.setText(m2().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.O2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void P2() {
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apdApplicant = str;
    }

    public final void R2(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.cameraPermission = strArr;
    }

    public final void S2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void T2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void U2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void V2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void W2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void Y2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.nic.mparivahan.dlservices.ui.dms.a.InterfaceC0060a
    public void a(int pos) {
        DocumentListItem documentListItem = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem != null) {
            documentListItem.setBrowseStatus(false);
        }
        DocumentListItem documentListItem2 = (DocumentListItem) this.docItems.get(pos);
        com.nic.mparivahan.dlservices.ui.dms.a aVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI(null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.docItems.get(pos);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        com.nic.mparivahan.dlservices.ui.dms.a aVar2 = this.adapter;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.k(pos);
    }

    @Override // com.nic.mparivahan.dlservices.ui.dms.a.InterfaceC0060a
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

    @Override // com.nic.mparivahan.dlservices.ui.dms.a.InterfaceC0060a
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

    public final ArrayList i2() {
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

    public final String j2() {
        String str = this.apdApplicant;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apdApplicant");
        return null;
    }

    public final DldetobjX k2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 m2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ArrayList n2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final ws6 o2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_status_documents);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        va vaVar = (va) lq7VarF;
        this.mBinding = vaVar;
        ta3.a aVar = ta3.a;
        va vaVar2 = null;
        if (vaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar = null;
        }
        aVar.B0(this, vaVar);
        Y2(new wl5(this));
        this.viewModel = (fm1) new z(this).a(fm1.class);
        va vaVar3 = this.mBinding;
        if (vaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar3 = null;
        }
        vaVar3.v(this);
        V2(new ws6(this));
        T2(new wa3(this));
        R2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        s2();
        v2();
        y2();
        va vaVar4 = this.mBinding;
        if (vaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar4 = null;
        }
        TextView textView = vaVar4.Y;
        va vaVar5 = this.mBinding;
        if (vaVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar5 = null;
        }
        textView.setPaintFlags(vaVar5.Y.getPaintFlags() | 8);
        va vaVar6 = this.mBinding;
        if (vaVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar6 = null;
        }
        vaVar6.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.E2(this.a, view);
            }
        });
        va vaVar7 = this.mBinding;
        if (vaVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar7 = null;
        }
        vaVar7.K.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ll1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.F2(this.a, view);
            }
        });
        if (Intrinsics.areEqual(q2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                W2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                U2((ArrayList) serializableExtra2);
                if (n2().size() == 1) {
                    va vaVar8 = this.mBinding;
                    if (vaVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar8 = null;
                    }
                    vaVar8.K.g.setText((CharSequence) n2().get(0));
                    va vaVar9 = this.mBinding;
                    if (vaVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar9 = null;
                    }
                    vaVar9.K.f.setVisibility(8);
                } else {
                    va vaVar10 = this.mBinding;
                    if (vaVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar10 = null;
                    }
                    TextView textView2 = vaVar10.K.g;
                    String strB = m2().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB);
                    textView2.setText(strB);
                    va vaVar11 = this.mBinding;
                    if (vaVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar11 = null;
                    }
                    vaVar11.K.f.setVisibility(8);
                    va vaVar12 = this.mBinding;
                    if (vaVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar12 = null;
                    }
                    TextView textView3 = vaVar12.K.g;
                    va vaVar13 = this.mBinding;
                    if (vaVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        vaVar13 = null;
                    }
                    textView3.setPaintFlags(vaVar13.K.g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            va vaVar14 = this.mBinding;
            if (vaVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                vaVar14 = null;
            }
            vaVar14.K.g.setText(q2().k());
        }
        va vaVar15 = this.mBinding;
        if (vaVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar15 = null;
        }
        vaVar15.K.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ml1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlDocActivity.G2(this.a, view);
            }
        });
        va vaVar16 = this.mBinding;
        if (vaVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar16 = null;
        }
        vaVar16.K.e.setVisibility(8);
        va vaVar17 = this.mBinding;
        if (vaVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar17 = null;
        }
        vaVar17.A.setVisibility(0);
        va vaVar18 = this.mBinding;
        if (vaVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            vaVar18 = null;
        }
        vaVar18.Y.setVisibility(0);
        va vaVar19 = this.mBinding;
        if (vaVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            vaVar2 = vaVar19;
        }
        vaVar2.F.g.setText(q2().k());
    }

    public final ArrayList p2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 q2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }
}
