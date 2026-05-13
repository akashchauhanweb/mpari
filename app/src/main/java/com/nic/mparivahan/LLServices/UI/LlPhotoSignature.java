package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;
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
import com.zepto.hd;
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
import java.io.Serializable;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002\u009b\u0001B\t¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ/\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000e\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rJ\u0017\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00104R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00104R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00104R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u00104R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u00104R\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00104R\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00104R$\u0010S\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010W\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00104\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR$\u0010[\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00104\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010_\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00104\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00104\u001a\u0004\ba\u0010P\"\u0004\bb\u0010RR\"\u0010g\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00104\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u0091\u0001\u001a\u0014\u0012\u000f\u0012\r \u008e\u0001*\u0005\u0018\u00010\u008d\u00010\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R;\u0010\u0097\u0001\u001a\u0014\u0012\u000f\u0012\r \u008e\u0001*\u0005\u0018\u00010\u008d\u00010\u008d\u00010\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0090\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/LlPhotoSignature;", "Lcom/zepto/pq;", "", "C2", "j2", "k2", "l2", "i2", "Z1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "S2", "", "message", "G2", "W2", "T2", "U2", "X2", "", "visible", "Q2", "I2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "K2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "fdate", "a2", "acCd", "E2", "(Ljava/lang/Integer;)V", "Lcom/zepto/hd;", "C", "Lcom/zepto/hd;", "cBinding", "Lcom/zepto/wm1;", "D", "Lcom/zepto/wm1;", "viewModel", "E", "Ljava/lang/String;", "imgType", "F", "I", "mStatus", "G", "mApplNo", "H", "mApplDob", "mApplName", "J", "mApplFather", "K", "mApplRtoName", "L", "lastEndorseRTOCode", "M", "stateCode", "N", "mAppdate", "O", "serviceCode", "P", "mApplPhoto", "Q", "mApplSign", "R", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "S", "getDob", "setDob", "dob", "T", "getMobile_no", "setMobile_no", "Mobile_no", "U", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "V", "getClPhoto", "setClPhoto", "clPhoto", "W", "b2", "M2", "app_date", "Lcom/zepto/ws6;", "X", "Lcom/zepto/ws6;", "g2", "()Lcom/zepto/ws6;", "P2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "Y", "Lcom/zepto/wa3;", "e2", "()Lcom/zepto/wa3;", "N2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "Z", "Lcom/zepto/wl5;", "h2", "()Lcom/zepto/wl5;", "R2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/sw4;", "a0", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "b0", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "f2", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "O2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "c0", "Lcom/zepto/of;", "startForProfileImageResult", "d0", "d2", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "e0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLlPhotoSignature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlPhotoSignature.kt\ncom/nic/mparivahan/LLServices/UI/LlPhotoSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,794:1\n1#2:795\n*E\n"})
public final class LlPhotoSignature extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hd cBinding;

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

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String app_date;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
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

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LlPhotoSignature.this.getGetDocLauncher().a(intent);
            LlPhotoSignature.this.Q2(true);
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
            LlPhotoSignature.this.startForProfileImageResult.a(intent);
            LlPhotoSignature.this.Q2(true);
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
            LlPhotoSignature.this.startForProfileImageResult.a(intent);
            LlPhotoSignature.this.Q2(true);
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
                LlPhotoSignature llPhotoSignature = LlPhotoSignature.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                llPhotoSignature.mApplName = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                LlPhotoSignature llPhotoSignature2 = LlPhotoSignature.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                llPhotoSignature2.mApplFather = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                LlPhotoSignature llPhotoSignature3 = LlPhotoSignature.this;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                if (llPhotoSignature3.a2(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                    LlPhotoSignature llPhotoSignature4 = LlPhotoSignature.this;
                    ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                    strValueOf = llPhotoSignature4.a2(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                } else {
                    ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                    strValueOf = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                }
                llPhotoSignature3.mAppdate = strValueOf;
                LlPhotoSignature llPhotoSignature5 = LlPhotoSignature.this;
                ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                llPhotoSignature5.serviceCode = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                LlPhotoSignature llPhotoSignature6 = LlPhotoSignature.this;
                StringBuilder sb = new StringBuilder();
                sb.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                llPhotoSignature6.mApplRtoName = sb.toString();
                LlPhotoSignature.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                LlPhotoSignature.this.stateCode = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                hd hdVar = LlPhotoSignature.this.cBinding;
                if (hdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar = null;
                }
                TextView textView = hdVar.D;
                String str2 = LlPhotoSignature.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                hd hdVar2 = LlPhotoSignature.this.cBinding;
                if (hdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar2 = null;
                }
                TextView textView2 = hdVar2.F;
                String str3 = LlPhotoSignature.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                hd hdVar3 = LlPhotoSignature.this.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar3 = null;
                }
                TextView textView3 = hdVar3.E;
                String str4 = LlPhotoSignature.this.mApplName;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplName");
                    str4 = null;
                }
                textView3.setText(str4);
                hd hdVar4 = LlPhotoSignature.this.cBinding;
                if (hdVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar4 = null;
                }
                TextView textView4 = hdVar4.H;
                String str5 = LlPhotoSignature.this.mApplFather;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplFather");
                    str5 = null;
                }
                textView4.setText(str5);
                hd hdVar5 = LlPhotoSignature.this.cBinding;
                if (hdVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar5 = null;
                }
                TextView textView5 = hdVar5.T;
                String str6 = LlPhotoSignature.this.mApplRtoName;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplRtoName");
                    str6 = null;
                }
                textView5.setText(str6);
                LlPhotoSignature.this.mStatus = 0;
                if (!com.nic.mparivahan.a.a.a(LlPhotoSignature.this)) {
                    Toast.makeText(LlPhotoSignature.this.getApplicationContext(), LlPhotoSignature.this.e2().b("label_log_check_internet", LlPhotoSignature.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                wm1 wm1Var = LlPhotoSignature.this.viewModel;
                if (wm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wm1Var = null;
                }
                String str7 = LlPhotoSignature.this.mApplNo;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str7 = null;
                }
                String str8 = LlPhotoSignature.this.mApplDob;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str8 = null;
                }
                String str9 = LlPhotoSignature.this.lastEndorseRTOCode;
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
                hd hdVar = null;
                Bitmap bitmapC = st6.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                hd hdVar2 = LlPhotoSignature.this.cBinding;
                if (hdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar2 = null;
                }
                hdVar2.v0.setImageBitmap(bitmapC);
                PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                Bitmap bitmapC2 = st6.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                hd hdVar3 = LlPhotoSignature.this.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar = hdVar3;
                }
                hdVar.W.setImageBitmap(bitmapC2);
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
                hd hdVar = LlPhotoSignature.this.cBinding;
                hd hdVar2 = null;
                if (hdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar = null;
                }
                hdVar.w0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    LlPhotoSignature.this.I2(photoDto.getStatusDesc());
                    return;
                }
                LlPhotoSignature llPhotoSignature = LlPhotoSignature.this;
                llPhotoSignature.K2(llPhotoSignature, llPhotoSignature.e2().b("label_photo_sign_uploaded", LlPhotoSignature.this.getString(R.string.photo_uploaded)));
                hd hdVar3 = LlPhotoSignature.this.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar3 = null;
                }
                hdVar3.X.setVisibility(0);
                hd hdVar4 = LlPhotoSignature.this.cBinding;
                if (hdVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar2 = hdVar4;
                }
                hdVar2.w0.setVisibility(8);
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
                hd hdVar = LlPhotoSignature.this.cBinding;
                if (hdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar = null;
                }
                hdVar.X.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                LlPhotoSignature.this.S2(applStatusDetailsItem.getApplFlowStatusList());
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

    public LlPhotoSignature() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.vk3
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LlPhotoSignature.V2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.zk3
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LlPhotoSignature.c2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void A2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void C2() {
        hd hdVar = this.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.N.g.setText(h2().k());
        hd hdVar3 = this.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        TextView textView = hdVar3.N.h;
        hd hdVar4 = this.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar4 = null;
        }
        textView.setPaintFlags(hdVar4.N.h.getPaintFlags() | 8);
        hd hdVar5 = this.cBinding;
        if (hdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar5 = null;
        }
        TextView textView2 = hdVar5.N.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        hd hdVar6 = this.cBinding;
        if (hdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar6;
        }
        hdVar2.N.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.D2(this.a, view);
            }
        });
    }

    public static final void D2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.f2());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void F2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void G2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.al3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.H2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void H2(Dialog d2, LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.J2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(boolean visible) {
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
    public final void S2(List applFlowStatusList) throws Throwable {
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
            int i3 = Integer.parseInt(g2().k());
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
        E2(acCd);
    }

    private final void T2() {
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
            intent.putExtra("LLDetails", f2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void U2() {
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
            intent.putExtra("LLDetails", f2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void V2(LlPhotoSignature this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.Q2(false);
                    return;
                } else {
                    this$0.Q2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            hd hdVar = null;
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
                hd hdVar2 = this$0.cBinding;
                if (hdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar = hdVar2;
                }
                hdVar.v0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                hd hdVar3 = this$0.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar = hdVar3;
                }
                hdVar.W.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.Q2(false);
        } catch (Exception unused) {
        }
    }

    private final void W2() {
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
            intent.putExtra("LLDetails", f2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void X2() {
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
            intent.putExtra("LLDetails", f2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void Z1() {
        if (st6.e(this)) {
            ox2.a.b(this).j().f(600).i().h(new b());
        }
    }

    public static final void c2(LlPhotoSignature this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.Q2(false);
                    return;
                } else {
                    this$0.Q2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            hd hdVar = null;
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
                hd hdVar2 = this$0.cBinding;
                if (hdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar = hdVar2;
                }
                hdVar.v0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                hd hdVar3 = this$0.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                } else {
                    hdVar = hdVar3;
                }
                hdVar.W.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.Q2(false);
        } catch (Exception unused) {
        }
    }

    private final void i2() {
        if (aj0.a.a(this)) {
            ox2.a.b(this).e().f(600).i().h(new d());
        } else if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new c());
        }
    }

    private final void j2() {
        this.viewModel = (wm1) new z(this).a(wm1.class);
        hd hdVar = this.cBinding;
        wm1 wm1Var = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.v(this);
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
                hd hdVar2 = this.cBinding;
                if (hdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar2 = null;
                }
                hdVar2.I.g.setText(h2().k());
                hd hdVar3 = this.cBinding;
                if (hdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                    hdVar3 = null;
                }
                hdVar3.G.setText("CL No. : " + this.dlNo);
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                O2((FetchLlDetails) serializableExtra);
            } catch (Exception unused) {
            }
        }
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        M2(str);
        hd hdVar4 = this.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar4 = null;
        }
        hdVar4.C.setText(b2());
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

    private final void k2() {
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

    private final void l2() {
        hd hdVar = this.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.v2(this.a, view);
            }
        });
        hd hdVar3 = this.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.Q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.w2(this.a, view);
            }
        });
        hd hdVar4 = this.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar4 = null;
        }
        hdVar4.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.x2(this.a, view);
            }
        });
        hd hdVar5 = this.cBinding;
        if (hdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar5 = null;
        }
        hdVar5.V.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ok3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.y2(this.a, view);
            }
        });
        hd hdVar6 = this.cBinding;
        if (hdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar6 = null;
        }
        hdVar6.w0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.z2(this.a, view);
            }
        });
        hd hdVar7 = this.cBinding;
        if (hdVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar7 = null;
        }
        hdVar7.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.A2(this.a, view);
            }
        });
        hd hdVar8 = this.cBinding;
        if (hdVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar8 = null;
        }
        hdVar8.I.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.B2(this.a, view);
            }
        });
        hd hdVar9 = this.cBinding;
        if (hdVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar9 = null;
        }
        hdVar9.X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.m2(this.a, view);
            }
        });
        hd hdVar10 = this.cBinding;
        if (hdVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar10 = null;
        }
        hdVar10.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.n2(this.a, view);
            }
        });
        hd hdVar11 = this.cBinding;
        if (hdVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar11 = null;
        }
        hdVar11.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.o2(this.a, view);
            }
        });
        hd hdVar12 = this.cBinding;
        if (hdVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar12 = null;
        }
        hdVar12.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.p2(this.a, view);
            }
        });
        hd hdVar13 = this.cBinding;
        if (hdVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar13 = null;
        }
        hdVar13.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.q2(this.a, view);
            }
        });
        hd hdVar14 = this.cBinding;
        if (hdVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar14 = null;
        }
        hdVar14.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.r2(this.a, view);
            }
        });
        hd hdVar15 = this.cBinding;
        if (hdVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar15 = null;
        }
        hdVar15.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.s2(this.a, view);
            }
        });
        hd hdVar16 = this.cBinding;
        if (hdVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar16 = null;
        }
        hdVar16.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.t2(this.a, view);
            }
        });
        hd hdVar17 = this.cBinding;
        if (hdVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar17;
        }
        hdVar2.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.u2(this.a, view);
            }
        });
    }

    public static final void m2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        String str = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.X.c(true);
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

    public static final void n2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.w.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.x.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.J.setVisibility(0);
    }

    public static final void o2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.x.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.w.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.J.setVisibility(8);
    }

    public static final void p2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.y.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.z.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.K.setVisibility(0);
    }

    public static final void q2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.z.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.y.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.K.setVisibility(8);
    }

    public static final void r2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.B.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.A.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.L.setVisibility(8);
    }

    public static final void s2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.A.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.B.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.L.setVisibility(0);
    }

    public static final void t2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.Y.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.Z.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.M.setVisibility(0);
    }

    public static final void u2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hd hdVar = this$0.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.Z.setVisibility(8);
        hd hdVar3 = this$0.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar3 = null;
        }
        hdVar3.Y.setVisibility(0);
        hd hdVar4 = this$0.cBinding;
        if (hdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar4;
        }
        hdVar2.M.setVisibility(8);
    }

    public static final void v2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.i2();
    }

    public static final void w2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.Z1();
    }

    public static final void x2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.i2();
    }

    public static final void y2(LlPhotoSignature this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.Z1();
    }

    public static final void z2(LlPhotoSignature this$0, View view) {
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
            this$0.I2(this$0.e2().b("photo_signature", ""));
            return;
        }
        hd hdVar = this$0.cBinding;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        hdVar.w0.c(true);
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

    public final void E2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            W2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            U2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            T2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            X2();
        } else if (acCd != null && acCd.intValue() == 455) {
            G2(e2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void K2(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.L2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void M2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_date = str;
    }

    public final void N2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void O2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void P2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void R2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
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

    public final FetchLlDetails f2() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final ws6 g2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final wl5 h2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_ll_photo_signature);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.cBinding = (hd) lq7VarF;
        P2(new ws6(this));
        N2(new wa3(this));
        R2(new wl5(this));
        ta3.a aVar = ta3.a;
        hd hdVar = this.cBinding;
        hd hdVar2 = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            hdVar = null;
        }
        aVar.i1(this, hdVar);
        j2();
        k2();
        l2();
        C2();
        hd hdVar3 = this.cBinding;
        if (hdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            hdVar2 = hdVar3;
        }
        hdVar2.N.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlPhotoSignature.F2(this.a, view);
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
