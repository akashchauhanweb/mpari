package com.nic.mparivahan.ClServices.View;

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
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
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
import com.zepto.aj0;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wm1;
import com.zepto.ws6;
import com.zepto.z7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001B\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ/\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000e\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rJ\u0017\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00104R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00104R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00104R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u00104R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u00104R\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00104R\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00104R$\u0010S\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010W\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00104\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR$\u0010[\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00104\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010_\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00104\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u0010P\"\u0004\bb\u0010RR\"\u0010g\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u00104\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR\"\u0010k\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u00104\u001a\u0004\bi\u0010P\"\u0004\bj\u0010RR\"\u0010o\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u00104\u001a\u0004\bm\u0010P\"\u0004\bn\u0010RR\"\u0010s\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u00104\u001a\u0004\bq\u0010P\"\u0004\br\u0010RR\"\u0010w\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u00104\u001a\u0004\bu\u0010P\"\u0004\bv\u0010RR\"\u0010{\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u00104\u001a\u0004\by\u0010P\"\u0004\bz\u0010RR\"\u0010\u007f\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u00104\u001a\u0004\b}\u0010P\"\u0004\b~\u0010RR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010¡\u0001\u001a\u0014\u0012\u000f\u0012\r \u009e\u0001*\u0005\u0018\u00010\u009d\u00010\u009d\u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R;\u0010§\u0001\u001a\u0014\u0012\u000f\u0012\r \u009e\u0001*\u0005\u0018\u00010\u009d\u00010\u009d\u00010\u009c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010 \u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ClPhotoSignature;", "Lcom/zepto/pq;", "", "B2", "i2", "j2", "k2", "h2", "Z1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "Q2", "", "message", "F2", "U2", "R2", "S2", "V2", "", "visible", "O2", "H2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "J2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "fdate", "a2", "acCd", "D2", "(Ljava/lang/Integer;)V", "Lcom/zepto/z7;", "C", "Lcom/zepto/z7;", "cBinding", "Lcom/zepto/wm1;", "D", "Lcom/zepto/wm1;", "viewModel", "E", "Ljava/lang/String;", "imgType", "F", "I", "mStatus", "G", "mApplNo", "H", "mApplDob", "mApplName", "J", "mApplFather", "K", "mApplRtoName", "L", "lastEndorseRTOCode", "M", "stateCode", "N", "mAppdate", "O", "serviceCode", "P", "mApplPhoto", "Q", "mApplSign", "R", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "S", "getDob", "setDob", "dob", "T", "getMobile_no", "setMobile_no", "Mobile_no", "U", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "V", "getClPhoto", "setClPhoto", "clPhoto", "W", "getClName", "setClName", "clName", "X", "getFatherName", "setFatherName", "fatherName", "Y", "getAddress", "setAddress", "address", "Z", "getCl_Status", "setCl_Status", "cl_Status", "a0", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "b0", "getValidity", "setValidity", "validity", "c0", "b2", "L2", "app_date", "Lcom/zepto/ws6;", "d0", "Lcom/zepto/ws6;", "f2", "()Lcom/zepto/ws6;", "N2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "e0", "Lcom/zepto/wa3;", "e2", "()Lcom/zepto/wa3;", "M2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "f0", "Lcom/zepto/wl5;", "g2", "()Lcom/zepto/wl5;", "P2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/sw4;", "g0", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "h0", "Lcom/zepto/of;", "startForProfileImageResult", "i0", "d2", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "j0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClPhotoSignature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClPhotoSignature.kt\ncom/nic/mparivahan/ClServices/View/ClPhotoSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class ClPhotoSignature extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public z7 cBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wm1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String imgType;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mApplName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mApplFather;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String mApplRtoName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String mAppdate;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String serviceCode;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String app_date;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int mStatus = -1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String mApplPhoto = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String mApplSign = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String clName = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String fatherName = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String validity = "";

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            ClPhotoSignature.this.getGetDocLauncher().a(intent);
            ClPhotoSignature.this.O2(true);
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
            ClPhotoSignature.this.startForProfileImageResult.a(intent);
            ClPhotoSignature.this.O2(true);
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
            ClPhotoSignature.this.startForProfileImageResult.a(intent);
            ClPhotoSignature.this.O2(true);
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
                ClPhotoSignature clPhotoSignature = ClPhotoSignature.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                clPhotoSignature.mApplName = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                ClPhotoSignature clPhotoSignature2 = ClPhotoSignature.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                clPhotoSignature2.mApplFather = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                ClPhotoSignature clPhotoSignature3 = ClPhotoSignature.this;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                if (clPhotoSignature3.a2(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                    ClPhotoSignature clPhotoSignature4 = ClPhotoSignature.this;
                    ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                    strValueOf = clPhotoSignature4.a2(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                } else {
                    ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                    strValueOf = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                }
                clPhotoSignature3.mAppdate = strValueOf;
                ClPhotoSignature clPhotoSignature5 = ClPhotoSignature.this;
                ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                clPhotoSignature5.serviceCode = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                ClPhotoSignature clPhotoSignature6 = ClPhotoSignature.this;
                StringBuilder sb = new StringBuilder();
                sb.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                clPhotoSignature6.mApplRtoName = sb.toString();
                ClPhotoSignature.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                ClPhotoSignature.this.stateCode = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                z7 z7Var = ClPhotoSignature.this.cBinding;
                if (z7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var = null;
                }
                TextView textView = z7Var.D;
                String str2 = ClPhotoSignature.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                z7 z7Var2 = ClPhotoSignature.this.cBinding;
                if (z7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var2 = null;
                }
                TextView textView2 = z7Var2.F;
                String str3 = ClPhotoSignature.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                z7 z7Var3 = ClPhotoSignature.this.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var3 = null;
                }
                TextView textView3 = z7Var3.E;
                String str4 = ClPhotoSignature.this.mApplName;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplName");
                    str4 = null;
                }
                textView3.setText(str4);
                z7 z7Var4 = ClPhotoSignature.this.cBinding;
                if (z7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var4 = null;
                }
                TextView textView4 = z7Var4.H;
                String str5 = ClPhotoSignature.this.mApplFather;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplFather");
                    str5 = null;
                }
                textView4.setText(str5);
                z7 z7Var5 = ClPhotoSignature.this.cBinding;
                if (z7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var5 = null;
                }
                TextView textView5 = z7Var5.T;
                String str6 = ClPhotoSignature.this.mApplRtoName;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplRtoName");
                    str6 = null;
                }
                textView5.setText(str6);
                ClPhotoSignature.this.mStatus = 0;
                if (!com.nic.mparivahan.a.a.a(ClPhotoSignature.this)) {
                    Toast.makeText(ClPhotoSignature.this.getApplicationContext(), ClPhotoSignature.this.e2().b("label_log_check_internet", ClPhotoSignature.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                wm1 wm1Var = ClPhotoSignature.this.viewModel;
                if (wm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wm1Var = null;
                }
                String str7 = ClPhotoSignature.this.mApplNo;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str7 = null;
                }
                String str8 = ClPhotoSignature.this.mApplDob;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str8 = null;
                }
                String str9 = ClPhotoSignature.this.lastEndorseRTOCode;
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
                z7 z7Var = null;
                Bitmap bitmapC = st6.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                z7 z7Var2 = ClPhotoSignature.this.cBinding;
                if (z7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var2 = null;
                }
                z7Var2.v0.setImageBitmap(bitmapC);
                PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                Bitmap bitmapC2 = st6.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                z7 z7Var3 = ClPhotoSignature.this.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var = z7Var3;
                }
                z7Var.W.setImageBitmap(bitmapC2);
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
                z7 z7Var = ClPhotoSignature.this.cBinding;
                z7 z7Var2 = null;
                if (z7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var = null;
                }
                z7Var.w0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    ClPhotoSignature.this.H2(photoDto.getStatusDesc());
                    return;
                }
                ClPhotoSignature clPhotoSignature = ClPhotoSignature.this;
                clPhotoSignature.J2(clPhotoSignature, clPhotoSignature.e2().b("label_photo_sign_uploaded", ClPhotoSignature.this.getString(R.string.photo_uploaded)));
                z7 z7Var3 = ClPhotoSignature.this.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var3 = null;
                }
                z7Var3.X.setVisibility(0);
                z7 z7Var4 = ClPhotoSignature.this.cBinding;
                if (z7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var2 = z7Var4;
                }
                z7Var2.w0.setVisibility(8);
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
                z7 z7Var = ClPhotoSignature.this.cBinding;
                if (z7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var = null;
                }
                z7Var.X.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                ClPhotoSignature.this.Q2(applStatusDetailsItem.getApplFlowStatusList());
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
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

    public ClPhotoSignature() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.zn0
            @Override // com.zepto.hf
            public final void a(Object obj) {
                ClPhotoSignature.T2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.ko0
            @Override // com.zepto.hf
            public final void a(Object obj) {
                ClPhotoSignature.c2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void A2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void B2() {
        try {
            z7 z7Var = this.cBinding;
            z7 z7Var2 = null;
            if (z7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                z7Var = null;
            }
            z7Var.N.g.setText(g2().k());
            z7 z7Var3 = this.cBinding;
            if (z7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                z7Var3 = null;
            }
            TextView textView = z7Var3.N.h;
            z7 z7Var4 = this.cBinding;
            if (z7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                z7Var4 = null;
            }
            textView.setPaintFlags(z7Var4.N.h.getPaintFlags() | 8);
            z7 z7Var5 = this.cBinding;
            if (z7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                z7Var5 = null;
            }
            TextView textView2 = z7Var5.N.h;
            String str = this.dlNo;
            Intrinsics.checkNotNull(str);
            textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
            if (Intrinsics.areEqual(g2().b(), "551")) {
                z7 z7Var6 = this.cBinding;
                if (z7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var6 = null;
                }
                z7Var6.N.h.setVisibility(8);
            } else {
                z7 z7Var7 = this.cBinding;
                if (z7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var7 = null;
                }
                z7Var7.N.h.setVisibility(0);
            }
            z7 z7Var8 = this.cBinding;
            if (z7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                z7Var2 = z7Var8;
            }
            z7Var2.N.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.no0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClPhotoSignature.C2(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void C2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.g2().b(), "551")) {
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

    public static final void E2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void F2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.G2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void G2(Dialog d2, ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(e2().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(e2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(e2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.I2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void I2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void K2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(boolean visible) {
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
    public final void Q2(List applFlowStatusList) throws Throwable {
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
            int i3 = Integer.parseInt(f2().k());
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

    private final void R2() {
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

    private final void S2() {
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

    public static final void T2(ClPhotoSignature this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.O2(false);
                    return;
                } else {
                    this$0.O2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z7 z7Var = null;
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
                z7 z7Var2 = this$0.cBinding;
                if (z7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var = z7Var2;
                }
                z7Var.v0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z7 z7Var3 = this$0.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var = z7Var3;
                }
                z7Var.W.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.O2(false);
        } catch (Exception unused) {
        }
    }

    private final void U2() {
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

    private final void V2() {
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

    public static final void c2(ClPhotoSignature this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.O2(false);
                    return;
                } else {
                    this$0.O2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z7 z7Var = null;
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
                z7 z7Var2 = this$0.cBinding;
                if (z7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var = z7Var2;
                }
                z7Var.v0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z7 z7Var3 = this$0.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    z7Var = z7Var3;
                }
                z7Var.W.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.O2(false);
        } catch (Exception unused) {
        }
    }

    private final void i2() {
        this.viewModel = (wm1) new z(this).a(wm1.class);
        z7 z7Var = this.cBinding;
        wm1 wm1Var = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.v(this);
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                z7 z7Var2 = this.cBinding;
                if (z7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var2 = null;
                }
                z7Var2.I.g.setText(g2().k());
                z7 z7Var3 = this.cBinding;
                if (z7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    z7Var3 = null;
                }
                z7Var3.G.setText("CL No. : " + this.dlNo);
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
            } catch (Exception unused) {
            }
        }
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        L2(str);
        z7 z7Var4 = this.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var4 = null;
        }
        z7Var4.C.setText(b2());
        if (com.nic.mparivahan.a.a.a(this)) {
            wm1 wm1Var2 = this.viewModel;
            if (wm1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                wm1Var2 = null;
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
            wm1Var2.g(str2, str3);
        } else {
            Toast.makeText(getApplicationContext(), e2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var = wm1Var3;
        }
        wm1Var.k().g(this, new i(new e()));
    }

    private final void j2() {
        wm1 wm1Var = this.viewModel;
        wm1 wm1Var2 = null;
        if (wm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        }
        wm1Var.j().g(this, new i(new f()));
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var3 = null;
        }
        wm1Var3.m().g(this, new i(new g()));
        wm1 wm1Var4 = this.viewModel;
        if (wm1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var2 = wm1Var4;
        }
        wm1Var2.l().g(this, new i(new h()));
    }

    private final void k2() {
        z7 z7Var = this.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.po0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.u2(this.a, view);
            }
        });
        z7 z7Var3 = this.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.Q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ao0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.v2(this.a, view);
            }
        });
        z7 z7Var4 = this.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var4 = null;
        }
        z7Var4.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.w2(this.a, view);
            }
        });
        z7 z7Var5 = this.cBinding;
        if (z7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var5 = null;
        }
        z7Var5.V.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.co0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.x2(this.a, view);
            }
        });
        z7 z7Var6 = this.cBinding;
        if (z7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var6 = null;
        }
        z7Var6.w0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.do0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.y2(this.a, view);
            }
        });
        z7 z7Var7 = this.cBinding;
        if (z7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var7 = null;
        }
        z7Var7.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.z2(this.a, view);
            }
        });
        z7 z7Var8 = this.cBinding;
        if (z7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var8 = null;
        }
        z7Var8.I.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.A2(this.a, view);
            }
        });
        z7 z7Var9 = this.cBinding;
        if (z7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var9 = null;
        }
        z7Var9.X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.go0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.l2(this.a, view);
            }
        });
        z7 z7Var10 = this.cBinding;
        if (z7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var10 = null;
        }
        z7Var10.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ho0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.m2(this.a, view);
            }
        });
        z7 z7Var11 = this.cBinding;
        if (z7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var11 = null;
        }
        z7Var11.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.io0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.n2(this.a, view);
            }
        });
        z7 z7Var12 = this.cBinding;
        if (z7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var12 = null;
        }
        z7Var12.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.o2(this.a, view);
            }
        });
        z7 z7Var13 = this.cBinding;
        if (z7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var13 = null;
        }
        z7Var13.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.p2(this.a, view);
            }
        });
        z7 z7Var14 = this.cBinding;
        if (z7Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var14 = null;
        }
        z7Var14.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.so0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.q2(this.a, view);
            }
        });
        z7 z7Var15 = this.cBinding;
        if (z7Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var15 = null;
        }
        z7Var15.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.to0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.r2(this.a, view);
            }
        });
        z7 z7Var16 = this.cBinding;
        if (z7Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var16 = null;
        }
        z7Var16.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.s2(this.a, view);
            }
        });
        z7 z7Var17 = this.cBinding;
        if (z7Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var17;
        }
        z7Var2.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.t2(this.a, view);
            }
        });
    }

    public static final void l2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        String str = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.X.c(true);
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

    public static final void m2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.w.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.x.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.J.setVisibility(0);
    }

    public static final void n2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.x.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.w.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.J.setVisibility(8);
    }

    public static final void o2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.y.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.z.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.K.setVisibility(0);
    }

    public static final void p2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.z.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.y.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.K.setVisibility(8);
    }

    public static final void q2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.B.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.A.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.L.setVisibility(8);
    }

    public static final void r2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.A.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.B.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.L.setVisibility(0);
    }

    public static final void s2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.Y.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.Z.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.M.setVisibility(0);
    }

    public static final void t2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z7 z7Var = this$0.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.Z.setVisibility(8);
        z7 z7Var3 = this$0.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var3 = null;
        }
        z7Var3.Y.setVisibility(0);
        z7 z7Var4 = this$0.cBinding;
        if (z7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var4;
        }
        z7Var2.M.setVisibility(8);
    }

    public static final void u2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.h2();
    }

    public static final void v2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.Z1();
    }

    public static final void w2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.h2();
    }

    public static final void x2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.Z1();
    }

    public static final void y2(ClPhotoSignature this$0, View view) {
        wm1 wm1Var;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.e2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (this$0.mStatus == -1 || this$0.mApplPhoto.length() <= 0 || this$0.mApplSign.length() <= 0) {
            this$0.H2(this$0.e2().b("photo_signature", ""));
            return;
        }
        z7 z7Var = this$0.cBinding;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        z7Var.w0.c(true);
        wm1 wm1Var2 = this$0.viewModel;
        if (wm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        } else {
            wm1Var = wm1Var2;
        }
        String str4 = this$0.mApplNo;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        } else {
            str = str4;
        }
        String str5 = this$0.mApplDob;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str2 = null;
        } else {
            str2 = str5;
        }
        String str6 = this$0.stateCode;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateCode");
            str3 = null;
        } else {
            str3 = str6;
        }
        wm1Var.n(str, str2, str3, this$0.mApplPhoto, this$0.mApplSign, this$0.mStatus);
    }

    public static final void z2(ClPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void D2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            U2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            S2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            R2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            V2();
        } else if (acCd != null && acCd.intValue() == 455) {
            F2(e2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void J2(Context context, String message) {
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
        textView.setText(e2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.K2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void L2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_date = str;
    }

    public final void M2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void N2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void P2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void Z1() {
        if (st6.e(this)) {
            ox2.a.b(this).j().f(600).i().h(new b());
        }
    }

    public final String a2(String fdate) {
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

    public final String b2() {
        String str = this.app_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app_date");
        return null;
    }

    /* JADX INFO: renamed from: d2, reason: from getter */
    public final of getGetDocLauncher() {
        return this.getDocLauncher;
    }

    public final wa3 e2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ws6 f2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 g2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void h2() {
        if (aj0.a.a(this)) {
            ox2.a.b(this).e().f(600).i().h(new d());
        } else if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new c());
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_photo_signature);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.cBinding = (z7) lq7VarF;
        N2(new ws6(this));
        M2(new wa3(this));
        P2(new wl5(this));
        i2();
        j2();
        k2();
        B2();
        ta3.a aVar = ta3.a;
        z7 z7Var = this.cBinding;
        z7 z7Var2 = null;
        if (z7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            z7Var = null;
        }
        aVar.c0(this, z7Var);
        z7 z7Var3 = this.cBinding;
        if (z7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            z7Var2 = z7Var3;
        }
        z7Var2.N.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClPhotoSignature.E2(this.a, view);
            }
        });
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
            Toast.makeText(this, e2().b("go_settings", ""), 0).show();
            return;
        }
        if (requestCode != 1001) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            return;
        }
        Toast.makeText(this, e2().b("per_denied", getString(R.string.permission)), 0).show();
    }
}
