package com.nic.mparivahan.dlservices.ui.photoandsign;

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
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse;
import com.nic.mparivahan.dlservices.data.model.PhotoDto;
import com.nic.mparivahan.dlservices.data.model.ResponseMsg;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.zepto.aj0;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jl0;
import com.zepto.kd1;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.sn0;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wm1;
import com.zepto.ws6;
import com.zepto.xa;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ¼\u00012\u00020\u0001:\u0002½\u0001B\t¢\u0006\u0006\bº\u0001\u0010»\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\fJ/\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000e\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fJ\u0017\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00104R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00102R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00102R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00102R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00102R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00102R\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u00102R\u0016\u0010E\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00102R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u00102R\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00102R\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00102R$\u0010Y\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010]\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u00102\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR$\u0010a\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00102\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\"\u0010e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00102\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR\"\u0010i\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u00102\u001a\u0004\bg\u0010V\"\u0004\bh\u0010XR\"\u0010m\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u00102\u001a\u0004\bk\u0010V\"\u0004\bl\u0010XR\"\u0010q\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u00102\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u00102\u001a\u0005\b\u0097\u0001\u0010V\"\u0005\b\u0098\u0001\u0010XR0\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R0\u0010¥\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009e\u0001\"\u0006\b¤\u0001\u0010 \u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R)\u0010³\u0001\u001a\u0014\u0012\u000f\u0012\r °\u0001*\u0005\u0018\u00010¯\u00010¯\u00010®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R;\u0010¹\u0001\u001a\u0014\u0012\u000f\u0012\r °\u0001*\u0005\u0018\u00010¯\u00010¯\u00010®\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010²\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/photoandsign/DlPhotoAndSignatureActivity;", "Lcom/zepto/o40;", "", "J2", "L2", "M2", "I2", "u2", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "x3", "", "message", "i3", "B3", "y3", "z3", "C3", "", "visible", "v3", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "k3", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "fdate", "v2", "acCd", "c3", "(Ljava/lang/Integer;)V", "Lcom/zepto/xa;", "F", "Lcom/zepto/xa;", "mBinding", "Lcom/zepto/wm1;", "G", "Lcom/zepto/wm1;", "viewModel", "H", "Ljava/lang/String;", "imgType", "I", "mStatus", "J", "mApplNo", "K", "mApplDob", "L", "mApplName", "M", "mApplFather", "N", "mApplRtoName", "O", "lastEndorseRTOCode", "P", "stateCode", "Q", "mAppdate", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "x2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "n3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "S", "serviceCode", "T", "mApplPhoto", "U", "mApplSign", "V", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "W", "getDob", "setDob", "dob", "X", "getMobile_no", "setMobile_no", "Mobile_no", "Y", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Z", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "a0", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "b0", "w2", "m3", "app_date", "Lcom/zepto/ws6;", "c0", "Lcom/zepto/ws6;", "F2", "()Lcom/zepto/ws6;", "t3", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "d0", "Lcom/zepto/wa3;", "B2", "()Lcom/zepto/wa3;", "p3", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/sw4;", "e0", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/zepto/kl0;", "f0", "Lcom/zepto/kl0;", "D2", "()Lcom/zepto/kl0;", "r3", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "g0", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "E2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "s3", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "h0", "A2", "o3", "imageVerify", "Ljava/util/ArrayList;", "i0", "Ljava/util/ArrayList;", "G2", "()Ljava/util/ArrayList;", "u3", "(Ljava/util/ArrayList;)V", "multiListName", "j0", "C2", "q3", "listHeaderSteps", "Lcom/zepto/wl5;", "k0", "Lcom/zepto/wl5;", "H2", "()Lcom/zepto/wl5;", "w3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "l0", "Lcom/zepto/of;", "startForProfileImageResult", "m0", "z2", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "n0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDlPhotoAndSignatureActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlPhotoAndSignatureActivity.kt\ncom/nic/mparivahan/dlservices/ui/photoandsign/DlPhotoAndSignatureActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1143:1\n1#2:1144\n*E\n"})
public final class DlPhotoAndSignatureActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public xa mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wm1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String imgType;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mApplName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String mApplFather;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String mApplRtoName;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String mAppdate;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String serviceCode;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String app_date;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int mStatus = -1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String mApplPhoto = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String mApplSign = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String imageVerify = "true";

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            DlPhotoAndSignatureActivity.this.getGetDocLauncher().a(intent);
            DlPhotoAndSignatureActivity.this.v3(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            DlPhotoAndSignatureActivity.this.startForProfileImageResult.a(intent);
            DlPhotoAndSignatureActivity.this.v3(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            DlPhotoAndSignatureActivity.this.startForProfileImageResult.a(intent);
            DlPhotoAndSignatureActivity.this.v3(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(DlApplStatusResponse dlApplStatusResponse) {
            Integer statusCode;
            String strValueOf;
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage == null || (statusCode = responseMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                    return;
                }
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity = DlPhotoAndSignatureActivity.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                dlPhotoAndSignatureActivity.mApplName = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = DlPhotoAndSignatureActivity.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                dlPhotoAndSignatureActivity2.mApplFather = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity3 = DlPhotoAndSignatureActivity.this;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                if (dlPhotoAndSignatureActivity3.v2(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity4 = DlPhotoAndSignatureActivity.this;
                    ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                    strValueOf = dlPhotoAndSignatureActivity4.v2(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                } else {
                    ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                    strValueOf = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                }
                dlPhotoAndSignatureActivity3.mAppdate = strValueOf;
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity5 = DlPhotoAndSignatureActivity.this;
                ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                dlPhotoAndSignatureActivity5.serviceCode = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity6 = DlPhotoAndSignatureActivity.this;
                StringBuilder sb = new StringBuilder();
                sb.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                dlPhotoAndSignatureActivity6.mApplRtoName = sb.toString();
                DlPhotoAndSignatureActivity.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                DlPhotoAndSignatureActivity.this.stateCode = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                xa xaVar = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar = null;
                }
                TextView textView = xaVar.D;
                String str2 = DlPhotoAndSignatureActivity.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                xa xaVar2 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar2 = null;
                }
                TextView textView2 = xaVar2.F;
                String str3 = DlPhotoAndSignatureActivity.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                xa xaVar3 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar3 = null;
                }
                TextView textView3 = xaVar3.E;
                String str4 = DlPhotoAndSignatureActivity.this.mApplName;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplName");
                    str4 = null;
                }
                textView3.setText(str4);
                xa xaVar4 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar4 = null;
                }
                TextView textView4 = xaVar4.H;
                String str5 = DlPhotoAndSignatureActivity.this.mApplFather;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplFather");
                    str5 = null;
                }
                textView4.setText(str5);
                xa xaVar5 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar5 = null;
                }
                TextView textView5 = xaVar5.W;
                String str6 = DlPhotoAndSignatureActivity.this.mApplRtoName;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplRtoName");
                    str6 = null;
                }
                textView5.setText(str6);
                DlPhotoAndSignatureActivity.this.mStatus = 0;
                if (!a.a.a(DlPhotoAndSignatureActivity.this)) {
                    Toast.makeText(DlPhotoAndSignatureActivity.this.getApplicationContext(), DlPhotoAndSignatureActivity.this.B2().b("label_log_check_internet", DlPhotoAndSignatureActivity.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                wm1 wm1Var = DlPhotoAndSignatureActivity.this.viewModel;
                if (wm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wm1Var = null;
                }
                String str7 = DlPhotoAndSignatureActivity.this.mApplNo;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str7 = null;
                }
                String str8 = DlPhotoAndSignatureActivity.this.mApplDob;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str8 = null;
                }
                String str9 = DlPhotoAndSignatureActivity.this.lastEndorseRTOCode;
                if (str9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
                } else {
                    str = str9;
                }
                wm1Var.i(str7, str8, str);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse) {
            Integer statusCode;
            try {
                ResponseMsg responseMsg = dlPhotoStatusDycryResponse.getResponseMsg();
                if (responseMsg == null || (statusCode = responseMsg.getStatusCode()) == null || statusCode.intValue() != 200) {
                    return;
                }
                PhotoDto photoDto = dlPhotoStatusDycryResponse.getPhotoDto();
                xa xaVar = null;
                Bitmap bitmapC = st6.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                xa xaVar2 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar2 = null;
                }
                xaVar2.A0.setImageBitmap(bitmapC);
                PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                Bitmap bitmapC2 = st6.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                xa xaVar3 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar = xaVar3;
                }
                xaVar.a0.setImageBitmap(bitmapC2);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlPhotoStatusDycryResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
        public final void a(com.nic.mparivahan.dlservices.data.model.temp.PhotoDto photoDto) {
            try {
                xa xaVar = DlPhotoAndSignatureActivity.this.mBinding;
                xa xaVar2 = null;
                if (xaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar = null;
                }
                xaVar.B0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity = DlPhotoAndSignatureActivity.this;
                    String statusDesc = photoDto.getStatusDesc();
                    xa xaVar3 = DlPhotoAndSignatureActivity.this.mBinding;
                    if (xaVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        xaVar2 = xaVar3;
                    }
                    dlPhotoAndSignatureActivity.w1(statusDesc, xaVar2.m());
                    return;
                }
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = DlPhotoAndSignatureActivity.this;
                dlPhotoAndSignatureActivity2.k3(dlPhotoAndSignatureActivity2, dlPhotoAndSignatureActivity2.B2().b("label_photo_sign_uploaded", DlPhotoAndSignatureActivity.this.getString(R.string.photo_uploaded)));
                xa xaVar4 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar4 = null;
                }
                xaVar4.b0.setVisibility(0);
                xa xaVar5 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar2 = xaVar5;
                }
                xaVar2.B0.setVisibility(8);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.nic.mparivahan.dlservices.data.model.temp.PhotoDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) throws Throwable {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                xa xaVar = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar = null;
                }
                xaVar.b0.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                DlPhotoAndSignatureActivity.this.x3(applStatusDetailsItem.getApplFlowStatusList());
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
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
            wm1 wm1Var;
            String str2;
            String str3;
            String str4;
            wm1 wm1Var2;
            String str5;
            String str6;
            String str7;
            try {
                DlPhotoAndSignatureActivity.this.o3(str.toString());
                if (StringsKt__StringsJVMKt.equals(DlPhotoAndSignatureActivity.this.getImageVerify(), "false", true)) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity = DlPhotoAndSignatureActivity.this;
                    dlPhotoAndSignatureActivity.k3(dlPhotoAndSignatureActivity, "Kindly upload your proper photo again");
                    return;
                }
                if (!a.a.a(DlPhotoAndSignatureActivity.this)) {
                    Toast.makeText(DlPhotoAndSignatureActivity.this.getApplicationContext(), DlPhotoAndSignatureActivity.this.B2().b("label_log_check_internet", DlPhotoAndSignatureActivity.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                xa xaVar = null;
                if (DlPhotoAndSignatureActivity.this.mStatus != -1 && Intrinsics.areEqual(DlPhotoAndSignatureActivity.this.H2().g(), "Y") && DlPhotoAndSignatureActivity.this.H2().h().length() > 0) {
                    xa xaVar2 = DlPhotoAndSignatureActivity.this.mBinding;
                    if (xaVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar2 = null;
                    }
                    xaVar2.B0.c(true);
                    wm1 wm1Var3 = DlPhotoAndSignatureActivity.this.viewModel;
                    if (wm1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        wm1Var2 = null;
                    } else {
                        wm1Var2 = wm1Var3;
                    }
                    String str8 = DlPhotoAndSignatureActivity.this.mApplNo;
                    if (str8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        str5 = null;
                    } else {
                        str5 = str8;
                    }
                    String str9 = DlPhotoAndSignatureActivity.this.mApplDob;
                    if (str9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                        str6 = null;
                    } else {
                        str6 = str9;
                    }
                    String str10 = DlPhotoAndSignatureActivity.this.stateCode;
                    if (str10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
                        str7 = null;
                    } else {
                        str7 = str10;
                    }
                    wm1Var2.n(str5, str6, str7, DlPhotoAndSignatureActivity.this.H2().h(), DlPhotoAndSignatureActivity.this.mApplSign, DlPhotoAndSignatureActivity.this.mStatus);
                    return;
                }
                if (DlPhotoAndSignatureActivity.this.mStatus == -1 || DlPhotoAndSignatureActivity.this.mApplPhoto.length() <= 0 || DlPhotoAndSignatureActivity.this.mApplSign.length() <= 0) {
                    DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity2 = DlPhotoAndSignatureActivity.this;
                    String strB = dlPhotoAndSignatureActivity2.B2().b("photo_signature", "");
                    xa xaVar3 = DlPhotoAndSignatureActivity.this.mBinding;
                    if (xaVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        xaVar = xaVar3;
                    }
                    dlPhotoAndSignatureActivity2.u1(strB, xaVar.m());
                    return;
                }
                xa xaVar4 = DlPhotoAndSignatureActivity.this.mBinding;
                if (xaVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    xaVar4 = null;
                }
                xaVar4.B0.c(true);
                wm1 wm1Var4 = DlPhotoAndSignatureActivity.this.viewModel;
                if (wm1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wm1Var = null;
                } else {
                    wm1Var = wm1Var4;
                }
                String str11 = DlPhotoAndSignatureActivity.this.mApplNo;
                if (str11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                } else {
                    str2 = str11;
                }
                String str12 = DlPhotoAndSignatureActivity.this.mApplDob;
                if (str12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                } else {
                    str3 = str12;
                }
                String str13 = DlPhotoAndSignatureActivity.this.stateCode;
                if (str13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateCode");
                    str4 = null;
                } else {
                    str4 = str13;
                }
                wm1Var.n(str2, str3, str4, DlPhotoAndSignatureActivity.this.mApplPhoto, DlPhotoAndSignatureActivity.this.mApplSign, DlPhotoAndSignatureActivity.this.mStatus);
            } catch (Exception unused) {
                DlPhotoAndSignatureActivity.this.o3("true");
                DlPhotoAndSignatureActivity dlPhotoAndSignatureActivity3 = DlPhotoAndSignatureActivity.this;
                dlPhotoAndSignatureActivity3.k3(dlPhotoAndSignatureActivity3, "Something went wrong,Please try after some time!");
            }
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    public DlPhotoAndSignatureActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.xm1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlPhotoAndSignatureActivity.A3(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.in1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlPhotoAndSignatureActivity.y2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void A3(DlPhotoAndSignatureActivity this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.v3(false);
                    return;
                } else {
                    this$0.v3(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            xa xaVar = null;
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
            String str = this$0.imgType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgType");
                str = null;
            }
            if (Intrinsics.areEqual(str, "0")) {
                xa xaVar2 = this$0.mBinding;
                if (xaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar = xaVar2;
                }
                xaVar.A0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                xa xaVar3 = this$0.mBinding;
                if (xaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar = xaVar3;
                }
                xaVar.a0.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.v3(false);
        } catch (Exception unused) {
        }
    }

    private final void B3() {
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
            intent.putExtra("dl_st_dl_details_obj", x2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", x2());
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
            if (Intrinsics.areEqual(H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", G2());
                intent.putExtra("listHeaderSteps", C2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void C3() {
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
            intent.putExtra("dl_st_dl_details_obj", x2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", x2());
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
            if (Intrinsics.areEqual(H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", G2());
                intent.putExtra("listHeaderSteps", C2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void I2() {
        if (aj0.a.a(this)) {
            ox2.a.b(this).e().f(600).i().h(new d());
        } else if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new c());
        }
    }

    private final void J2() {
        new wl5(this);
        this.viewModel = (wm1) new z(this).a(wm1.class);
        xa xaVar = this.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.v(this);
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                n3((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra3;
                Bundle extras3 = getIntent().getExtras();
                Serializable serializable = extras3 != null ? extras3.getSerializable("dl_st_dl_details_obj") : null;
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                n3((DldetobjX) serializable);
                String bioDlno = x2().getBioObj().getBioDlno();
                if (bioDlno != null && bioDlno.length() != 0) {
                    xa xaVar3 = this.mBinding;
                    if (xaVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar3 = null;
                    }
                    xaVar3.G.setText(B2().b("dl_no", "DL No. : ") + " : " + x2().getBioObj().getBioDlno());
                } else if (this.dlNo != null) {
                    xa xaVar4 = this.mBinding;
                    if (xaVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar4 = null;
                    }
                    xaVar4.G.setText(B2().b("dl_no", "DL No. : ") + " : " + this.dlNo);
                }
                BioImgObjX bioImgObj = x2().getBioImgObj();
                String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                if (biPhoto == null || biPhoto.length() == 0) {
                    xa xaVar5 = this.mBinding;
                    if (xaVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar5 = null;
                    }
                    xaVar5.I.f.setVisibility(4);
                } else {
                    xa xaVar6 = this.mBinding;
                    if (xaVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar6 = null;
                    }
                    xaVar6.I.f.setVisibility(0);
                    xa xaVar7 = this.mBinding;
                    if (xaVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar7 = null;
                    }
                    ImageView imageView = xaVar7.I.b;
                    BioImgObjX bioImgObj2 = x2().getBioImgObj();
                    imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                }
            } catch (Exception unused) {
            }
        }
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        m3(str);
        xa xaVar8 = this.mBinding;
        if (xaVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar8 = null;
        }
        xaVar8.C.setText(w2());
        if (a.a.a(this)) {
            wm1 wm1Var = this.viewModel;
            if (wm1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                wm1Var = null;
            }
            String str2 = this.mApplNo;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str2 = null;
            }
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            wm1Var.g(str2, str3);
        } else {
            Toast.makeText(getApplicationContext(), B2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        wm1 wm1Var2 = this.viewModel;
        if (wm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var2 = null;
        }
        wm1Var2.k().g(this, new j(new e()));
        xa xaVar9 = this.mBinding;
        if (xaVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar9 = null;
        }
        TextView textView = xaVar9.z0;
        xa xaVar10 = this.mBinding;
        if (xaVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar10 = null;
        }
        textView.setPaintFlags(xaVar10.z0.getPaintFlags() | 8);
        xa xaVar11 = this.mBinding;
        if (xaVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar11;
        }
        xaVar2.z0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.K2(this.a, view);
            }
        });
        s3(ClInter.INSTANCE.a(this));
        r3((kl0) new z(this, new sn0(new jl0(E2()))).a(kl0.class));
    }

    public static final void K2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.x2());
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
        } catch (Exception unused) {
        }
    }

    private final void L2() {
        wm1 wm1Var = this.viewModel;
        wm1 wm1Var2 = null;
        if (wm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        }
        wm1Var.j().g(this, new j(new f()));
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var3 = null;
        }
        wm1Var3.m().g(this, new j(new g()));
        wm1 wm1Var4 = this.viewModel;
        if (wm1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var2 = wm1Var4;
        }
        wm1Var2.l().g(this, new j(new h()));
    }

    private final void M2() {
        xa xaVar = null;
        if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) H2().g()).toString(), "Y") || H2().h().length() <= 0) {
            xa xaVar2 = this.mBinding;
            if (xaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar2 = null;
            }
            xaVar2.R.setClickable(true);
            xa xaVar3 = this.mBinding;
            if (xaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar3 = null;
            }
            xaVar3.S.setClickable(true);
            xa xaVar4 = this.mBinding;
            if (xaVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar4 = null;
            }
            xaVar4.R.setEnabled(true);
            xa xaVar5 = this.mBinding;
            if (xaVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar5 = null;
            }
            xaVar5.S.setEnabled(true);
            xa xaVar6 = this.mBinding;
            if (xaVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar6 = null;
            }
            xaVar6.S.setBackgroundResource(R.drawable.blue_drawable);
            xa xaVar7 = this.mBinding;
            if (xaVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar7 = null;
            }
            xaVar7.R.setBackgroundResource(R.drawable.blue_drawable);
        } else {
            xa xaVar8 = this.mBinding;
            if (xaVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar8 = null;
            }
            xaVar8.R.setClickable(false);
            xa xaVar9 = this.mBinding;
            if (xaVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar9 = null;
            }
            xaVar9.S.setClickable(false);
            xa xaVar10 = this.mBinding;
            if (xaVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar10 = null;
            }
            xaVar10.R.setEnabled(false);
            xa xaVar11 = this.mBinding;
            if (xaVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar11 = null;
            }
            xaVar11.S.setEnabled(false);
            xa xaVar12 = this.mBinding;
            if (xaVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar12 = null;
            }
            xaVar12.S.setBackgroundResource(R.drawable.unselected_button_grey);
            xa xaVar13 = this.mBinding;
            if (xaVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar13 = null;
            }
            xaVar13.R.setBackgroundResource(R.drawable.unselected_button_grey);
            xa xaVar14 = this.mBinding;
            if (xaVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar14 = null;
            }
            xaVar14.A0.setImageBitmap(kt6.a(H2().h()));
        }
        xa xaVar15 = this.mBinding;
        if (xaVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar15 = null;
        }
        xaVar15.R.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.un1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.Z2(this.a, view);
            }
        });
        xa xaVar16 = this.mBinding;
        if (xaVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar16 = null;
        }
        xaVar16.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.a3(this.a, view);
            }
        });
        xa xaVar17 = this.mBinding;
        if (xaVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar17 = null;
        }
        xaVar17.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.b3(this.a, view);
            }
        });
        xa xaVar18 = this.mBinding;
        if (xaVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar18 = null;
        }
        xaVar18.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.en1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.N2(this.a, view);
            }
        });
        xa xaVar19 = this.mBinding;
        if (xaVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar19 = null;
        }
        xaVar19.B0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.O2(this.a, view);
            }
        });
        D2().t().g(this, new j(new i()));
        xa xaVar20 = this.mBinding;
        if (xaVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar20 = null;
        }
        xaVar20.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.P2(this.a, view);
            }
        });
        xa xaVar21 = this.mBinding;
        if (xaVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar21 = null;
        }
        xaVar21.b0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.Q2(this.a, view);
            }
        });
        xa xaVar22 = this.mBinding;
        if (xaVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar22 = null;
        }
        xaVar22.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.R2(this.a, view);
            }
        });
        xa xaVar23 = this.mBinding;
        if (xaVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar23 = null;
        }
        xaVar23.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.S2(this.a, view);
            }
        });
        xa xaVar24 = this.mBinding;
        if (xaVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar24 = null;
        }
        xaVar24.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ln1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.T2(this.a, view);
            }
        });
        xa xaVar25 = this.mBinding;
        if (xaVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar25 = null;
        }
        xaVar25.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.U2(this.a, view);
            }
        });
        xa xaVar26 = this.mBinding;
        if (xaVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar26 = null;
        }
        xaVar26.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ym1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.V2(this.a, view);
            }
        });
        xa xaVar27 = this.mBinding;
        if (xaVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar27 = null;
        }
        xaVar27.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.W2(this.a, view);
            }
        });
        xa xaVar28 = this.mBinding;
        if (xaVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar28 = null;
        }
        xaVar28.c0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.an1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.X2(this.a, view);
            }
        });
        xa xaVar29 = this.mBinding;
        if (xaVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar = xaVar29;
        }
        xaVar.d0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.Y2(this.a, view);
            }
        });
    }

    public static final void N2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.u2();
    }

    public static final void O2(DlPhotoAndSignatureActivity this$0, View view) {
        wm1 wm1Var;
        String str;
        String str2;
        String str3;
        wm1 wm1Var2;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.B2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        xa xaVar = null;
        if (this$0.mStatus != -1 && Intrinsics.areEqual(this$0.H2().g(), "Y") && this$0.H2().h().length() > 0) {
            xa xaVar2 = this$0.mBinding;
            if (xaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar2 = null;
            }
            xaVar2.B0.c(true);
            wm1 wm1Var3 = this$0.viewModel;
            if (wm1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                wm1Var2 = null;
            } else {
                wm1Var2 = wm1Var3;
            }
            String str7 = this$0.mApplNo;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str4 = null;
            } else {
                str4 = str7;
            }
            String str8 = this$0.mApplDob;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str5 = null;
            } else {
                str5 = str8;
            }
            String str9 = this$0.stateCode;
            if (str9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateCode");
                str6 = null;
            } else {
                str6 = str9;
            }
            wm1Var2.n(str4, str5, str6, this$0.H2().h(), this$0.mApplSign, this$0.mStatus);
            return;
        }
        if (this$0.mStatus == -1 || this$0.mApplPhoto.length() <= 0 || this$0.mApplSign.length() <= 0) {
            String strB = this$0.B2().b("photo_signature", "");
            xa xaVar3 = this$0.mBinding;
            if (xaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                xaVar = xaVar3;
            }
            this$0.u1(strB, xaVar.m());
            return;
        }
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar4 = null;
        }
        xaVar4.B0.c(true);
        wm1 wm1Var4 = this$0.viewModel;
        if (wm1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        } else {
            wm1Var = wm1Var4;
        }
        String str10 = this$0.mApplNo;
        if (str10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        } else {
            str = str10;
        }
        String str11 = this$0.mApplDob;
        if (str11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str2 = null;
        } else {
            str2 = str11;
        }
        String str12 = this$0.stateCode;
        if (str12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateCode");
            str3 = null;
        } else {
            str3 = str12;
        }
        wm1Var.n(str, str2, str3, this$0.mApplPhoto, this$0.mApplSign, this$0.mStatus);
    }

    public static final void P2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        String str = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.b0.c(true);
        wm1 wm1Var = this$0.viewModel;
        if (wm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
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
        wm1Var.h(str2, str);
    }

    public static final void R2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.w.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.x.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.L.setVisibility(0);
    }

    public static final void S2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.x.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.w.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.L.setVisibility(8);
    }

    public static final void T2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.y.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.z.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.M.setVisibility(0);
    }

    public static final void U2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.z.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.y.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.M.setVisibility(8);
    }

    public static final void V2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.B.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.A.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.N.setVisibility(8);
    }

    public static final void W2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.A.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.B.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.N.setVisibility(0);
    }

    public static final void X2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.c0.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.d0.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.O.setVisibility(0);
    }

    public static final void Y2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xa xaVar = this$0.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        xaVar.d0.setVisibility(8);
        xa xaVar3 = this$0.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.c0.setVisibility(0);
        xa xaVar4 = this$0.mBinding;
        if (xaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar4;
        }
        xaVar2.O.setVisibility(8);
    }

    public static final void Z2(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.I2();
    }

    public static final void a3(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.u2();
    }

    public static final void b3(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.I2();
    }

    public static final void d3(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void e3(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.x2());
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
            if (Intrinsics.areEqual(this$0.H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.G2());
                intent.putExtra("listHeaderSteps", this$0.C2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void f3(DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!Intrinsics.areEqual(this$0.H2().b(), VContant.MULTISERVICE_PURPOSE_CODE) || this$0.C2().size() <= 1) {
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
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rn1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlPhotoAndSignatureActivity.g3(dialog, view2);
                }
            });
            int size = this$0.C2().size();
            String str = "";
            int i2 = 0;
            String string = "";
            while (i2 < size) {
                str = str + ((String) this$0.C2().get(i2)) + '\n';
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                i2++;
                sb.append(i2);
                sb.append(".\n");
                string = sb.toString();
            }
            textView2.setText(str);
            textView3.setText(string);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sn1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlPhotoAndSignatureActivity.h3(dialog, view2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void i3(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.j3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void j3(Dialog d2, DlPhotoAndSignatureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void l3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void u2() {
        if (st6.e(this)) {
            ox2.a.b(this).j().f(600).i().h(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(boolean visible) {
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
    public final void x3(List applFlowStatusList) throws Throwable {
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
            long j2 = Long.parseLong(str4);
            int i3 = Integer.parseInt(F2().k());
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
            companion.a(this, str, j2, i3, str5, str6, str2);
        } catch (Exception unused) {
        }
        c3(acCd);
    }

    public static final void y2(DlPhotoAndSignatureActivity this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.v3(false);
                    return;
                } else {
                    this$0.v3(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            xa xaVar = null;
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
            String str = this$0.imgType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgType");
                str = null;
            }
            if (Intrinsics.areEqual(str, "0")) {
                xa xaVar2 = this$0.mBinding;
                if (xaVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar = xaVar2;
                }
                xaVar.A0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                xa xaVar3 = this$0.mBinding;
                if (xaVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    xaVar = xaVar3;
                }
                xaVar.a0.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.v3(false);
        } catch (Exception unused) {
        }
    }

    private final void y3() {
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
            intent.putExtra("dl_st_dl_details_obj", x2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", x2());
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
            if (Intrinsics.areEqual(H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", G2());
                intent.putExtra("listHeaderSteps", C2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void z3() {
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
            intent.putExtra("dl_st_dl_details_obj", x2());
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", x2());
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
            if (Intrinsics.areEqual(H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", G2());
                intent.putExtra("listHeaderSteps", C2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final String getImageVerify() {
        return this.imageVerify;
    }

    public final wa3 B2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ArrayList C2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final kl0 D2() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter E2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final ws6 F2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final ArrayList G2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 H2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void c3(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            B3();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            z3();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            y3();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            C3();
            return;
        }
        if (acCd != null && acCd.intValue() == 133) {
            C3();
        } else if (acCd != null && acCd.intValue() == 455) {
            i3(B2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void k3(Context context, String message) {
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
        textView.setText(B2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.l3(dialog, view);
            }
        });
        dialog.show();
    }

    public final void m3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_date = str;
    }

    public final void n3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void o3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageVerify = str;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_status_photo_sign);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (xa) lq7VarF;
        t3(new ws6(this));
        p3(new wa3(this));
        ta3.a aVar = ta3.a;
        xa xaVar = this.mBinding;
        xa xaVar2 = null;
        if (xaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar = null;
        }
        aVar.E1(this, xaVar);
        w3(new wl5(this));
        J2();
        L2();
        M2();
        xa xaVar3 = this.mBinding;
        if (xaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar3 = null;
        }
        xaVar3.P.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.on1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.d3(this.a, view);
            }
        });
        if (Intrinsics.areEqual(H2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                u3((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                q3((ArrayList) serializableExtra2);
                if (C2().size() == 1) {
                    xa xaVar4 = this.mBinding;
                    if (xaVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar4 = null;
                    }
                    xaVar4.P.g.setText((CharSequence) C2().get(0));
                    xa xaVar5 = this.mBinding;
                    if (xaVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar5 = null;
                    }
                    xaVar5.P.f.setVisibility(8);
                } else {
                    xa xaVar6 = this.mBinding;
                    if (xaVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar6 = null;
                    }
                    TextView textView = xaVar6.P.g;
                    String strB = B2().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB);
                    textView.setText(strB);
                    xa xaVar7 = this.mBinding;
                    if (xaVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar7 = null;
                    }
                    xaVar7.P.f.setVisibility(8);
                    xa xaVar8 = this.mBinding;
                    if (xaVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar8 = null;
                    }
                    TextView textView2 = xaVar8.P.g;
                    xa xaVar9 = this.mBinding;
                    if (xaVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        xaVar9 = null;
                    }
                    textView2.setPaintFlags(xaVar9.P.g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            xa xaVar10 = this.mBinding;
            if (xaVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                xaVar10 = null;
            }
            xaVar10.P.g.setText(H2().k());
        }
        xa xaVar11 = this.mBinding;
        if (xaVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar11 = null;
        }
        xaVar11.P.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.e3(this.a, view);
            }
        });
        xa xaVar12 = this.mBinding;
        if (xaVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar12 = null;
        }
        xaVar12.P.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoAndSignatureActivity.f3(this.a, view);
            }
        });
        xa xaVar13 = this.mBinding;
        if (xaVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar13 = null;
        }
        xaVar13.P.e.setVisibility(8);
        xa xaVar14 = this.mBinding;
        if (xaVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar14 = null;
        }
        xaVar14.G.setVisibility(0);
        xa xaVar15 = this.mBinding;
        if (xaVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            xaVar15 = null;
        }
        xaVar15.z0.setVisibility(0);
        xa xaVar16 = this.mBinding;
        if (xaVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            xaVar2 = xaVar16;
        }
        xaVar2.I.g.setText(H2().k());
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 222) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, B2().b("go_settings", ""), 0).show();
            return;
        }
        if (requestCode != 1001) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            return;
        }
        Toast.makeText(this, B2().b("per_denied", getString(R.string.permission)), 0).show();
    }

    public final void p3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void q3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void r3(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void s3(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void t3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void u3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final String v2(String fdate) {
        String str;
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+ZZ:ZZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            str = simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            str = null;
        }
        return String.valueOf(str);
    }

    public final String w2() {
        String str = this.app_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app_date");
        return null;
    }

    public final void w3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final DldetobjX x2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final of getGetDocLauncher() {
        return this.getDocLauncher;
    }
}
