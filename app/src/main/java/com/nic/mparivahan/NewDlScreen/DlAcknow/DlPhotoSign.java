package com.nic.mparivahan.NewDlScreen.DlAcknow;

import android.app.Dialog;
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
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlPhotoSign;
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
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wm1;
import com.zepto.ws6;
import com.zepto.z9;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u008a\u0001B\t¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\fJ/\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0007J\u0017\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00103R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00103R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00103R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u00103R\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010D\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u00103R\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u00103R\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00103R\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00103R$\u0010R\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00103\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u00103\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR$\u0010Z\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00103\u001a\u0004\bX\u0010O\"\u0004\bY\u0010QR\"\u0010^\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u00103\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\"\u0010b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u00103\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR\"\u0010f\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u00103\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR#\u0010\u0080\u0001\u001a\u0010\u0012\f\u0012\n }*\u0004\u0018\u00010|0|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR6\u0010\u0086\u0001\u001a\u0010\u0012\f\u0012\n }*\u0004\u0018\u00010|0|0{8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0081\u0001\u0010\u007f\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/DlAcknow/DlPhotoSign;", "Lcom/zepto/pq;", "", "f2", "g2", "h2", "e2", "X1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "J2", "", "message", "z2", "N2", "K2", "L2", "O2", "B2", "", "visible", "I2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "D2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "fdate", "Y1", "acCd", "y2", "(Ljava/lang/Integer;)V", "Lcom/zepto/z9;", "C", "Lcom/zepto/z9;", "mBinding", "Lcom/zepto/wm1;", "D", "Lcom/zepto/wm1;", "viewModel", "E", "Ljava/lang/String;", "imgType", "F", "I", "mStatus", "G", "mApplNo", "H", "mApplDob", "mApplName", "J", "mApplFather", "K", "mApplRtoName", "L", "lastEndorseRTOCode", "M", "stateCode", "N", "mAppdate", "O", "serviceCode", "P", "mApplPhoto", "Q", "mApplSign", "R", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "S", "getDob", "setDob", "dob", "T", "getMobile_no", "setMobile_no", "Mobile_no", "U", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "V", "getClPhoto", "setClPhoto", "clPhoto", "W", "Z1", "F2", "app_date", "Lcom/zepto/ws6;", "X", "Lcom/zepto/ws6;", "d2", "()Lcom/zepto/ws6;", "H2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "Y", "Lcom/zepto/wa3;", "c2", "()Lcom/zepto/wa3;", "G2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/sw4;", "Z", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "a0", "Lcom/zepto/of;", "startForProfileImageResult", "b0", "b2", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "c0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDlPhotoSign.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlPhotoSign.kt\ncom/nic/mparivahan/NewDlScreen/DlAcknow/DlPhotoSign\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,735:1\n1#2:736\n*E\n"})
public final class DlPhotoSign extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public z9 mBinding;

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
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
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
            DlPhotoSign.this.getGetDocLauncher().a(intent);
            DlPhotoSign.this.I2(true);
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
            DlPhotoSign.this.startForProfileImageResult.a(intent);
            DlPhotoSign.this.I2(true);
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
                DlPhotoSign dlPhotoSign = DlPhotoSign.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                dlPhotoSign.mApplName = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                DlPhotoSign dlPhotoSign2 = DlPhotoSign.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                dlPhotoSign2.mApplFather = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                DlPhotoSign dlPhotoSign3 = DlPhotoSign.this;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                if (dlPhotoSign3.Y1(String.valueOf(responseBody3 != null ? responseBody3.getApdAppldt() : null)).length() > 0) {
                    DlPhotoSign dlPhotoSign4 = DlPhotoSign.this;
                    ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                    strValueOf = dlPhotoSign4.Y1(String.valueOf(responseBody4 != null ? responseBody4.getApdAppldt() : null));
                } else {
                    ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                    strValueOf = String.valueOf(responseBody5 != null ? responseBody5.getApdAppldt() : null);
                }
                dlPhotoSign3.mAppdate = strValueOf;
                DlPhotoSign dlPhotoSign5 = DlPhotoSign.this;
                ResponseBody responseBody6 = dlApplStatusResponse.getResponseBody();
                dlPhotoSign5.serviceCode = String.valueOf((responseBody6 == null || (transReq = responseBody6.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody7 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody7 != null ? responseBody7.getOlaMast() : null;
                DlPhotoSign dlPhotoSign6 = DlPhotoSign.this;
                StringBuilder sb = new StringBuilder();
                sb.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                dlPhotoSign6.mApplRtoName = sb.toString();
                DlPhotoSign.this.lastEndorseRTOCode = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                DlPhotoSign.this.stateCode = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                z9 z9Var = DlPhotoSign.this.mBinding;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                TextView textView = z9Var.D;
                String str2 = DlPhotoSign.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                z9 z9Var2 = DlPhotoSign.this.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var2 = null;
                }
                TextView textView2 = z9Var2.F;
                String str3 = DlPhotoSign.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                z9 z9Var3 = DlPhotoSign.this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var3 = null;
                }
                TextView textView3 = z9Var3.E;
                String str4 = DlPhotoSign.this.mApplName;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplName");
                    str4 = null;
                }
                textView3.setText(str4);
                z9 z9Var4 = DlPhotoSign.this.mBinding;
                if (z9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var4 = null;
                }
                TextView textView4 = z9Var4.H;
                String str5 = DlPhotoSign.this.mApplFather;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplFather");
                    str5 = null;
                }
                textView4.setText(str5);
                z9 z9Var5 = DlPhotoSign.this.mBinding;
                if (z9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var5 = null;
                }
                TextView textView5 = z9Var5.S;
                String str6 = DlPhotoSign.this.mApplRtoName;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplRtoName");
                    str6 = null;
                }
                textView5.setText(str6);
                DlPhotoSign.this.mStatus = 0;
                if (!com.nic.mparivahan.a.a.a(DlPhotoSign.this)) {
                    Toast.makeText(DlPhotoSign.this.getApplicationContext(), DlPhotoSign.this.c2().b("label_log_check_internet", DlPhotoSign.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                wm1 wm1Var = DlPhotoSign.this.viewModel;
                if (wm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wm1Var = null;
                }
                String str7 = DlPhotoSign.this.mApplNo;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str7 = null;
                }
                String str8 = DlPhotoSign.this.mApplDob;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str8 = null;
                }
                String str9 = DlPhotoSign.this.lastEndorseRTOCode;
                if (str9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRTOCode");
                } else {
                    str = str9;
                }
                wm1Var.i(str7, str8, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
                z9 z9Var = null;
                Bitmap bitmapC = st6.c(String.valueOf(photoDto != null ? photoDto.getPhoto() : null));
                z9 z9Var2 = DlPhotoSign.this.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var2 = null;
                }
                z9Var2.u0.setImageBitmap(bitmapC);
                PhotoDto photoDto2 = dlPhotoStatusDycryResponse.getPhotoDto();
                Bitmap bitmapC2 = st6.c(String.valueOf(photoDto2 != null ? photoDto2.getSignature() : null));
                z9 z9Var3 = DlPhotoSign.this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var3;
                }
                z9Var.V.setImageBitmap(bitmapC2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlPhotoStatusDycryResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
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
                z9 z9Var = DlPhotoSign.this.mBinding;
                z9 z9Var2 = null;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                z9Var.v0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    DlPhotoSign.this.B2(photoDto.getStatusDesc());
                    return;
                }
                DlPhotoSign dlPhotoSign = DlPhotoSign.this;
                dlPhotoSign.D2(dlPhotoSign, dlPhotoSign.c2().b("label_photo_sign_uploaded", DlPhotoSign.this.getString(R.string.photo_uploaded)));
                z9 z9Var3 = DlPhotoSign.this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var3 = null;
                }
                z9Var3.W.setVisibility(0);
                z9 z9Var4 = DlPhotoSign.this.mBinding;
                if (z9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var2 = z9Var4;
                }
                z9Var2.v0.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.nic.mparivahan.dlservices.data.model.temp.PhotoDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) throws Throwable {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                z9 z9Var = DlPhotoSign.this.mBinding;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                z9Var.W.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                DlPhotoSign.this.J2(applStatusDetailsItem.getApplFlowStatusList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public DlPhotoSign() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.do1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlPhotoSign.M2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.eo1
            @Override // com.zepto.hf
            public final void a(Object obj) {
                DlPhotoSign.a2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    public static final void A2(Dialog d2, DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(String message) {
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
        textView.setText(c2().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(c2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(c2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.go1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.C2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void C2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(boolean visible) {
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
    public final void J2(List applFlowStatusList) throws Throwable {
        Integer acCd;
        String str;
        String str2;
        int size = applFlowStatusList.size();
        for (int i = 0; i < size; i++) {
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                Integer acCd2 = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd2 == null || acCd2.intValue() != 455) {
                    Object obj3 = applFlowStatusList.get(i);
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
            int i2 = Integer.parseInt(d2().k());
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
            companion.a(this, str, j, i2, str5, str6, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        y2(acCd);
    }

    private final void K2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocUpload.class);
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
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void L2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlFeePayment.class);
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
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void M2(DlPhotoSign this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.I2(false);
                    return;
                } else {
                    this$0.I2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z9 z9Var = null;
            Uri data = intentC != null ? intentC.getData() : null;
            Intrinsics.checkNotNull(data);
            if (Build.VERSION.SDK_INT >= 28) {
                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(this$0.getContentResolver(), data));
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
                z9 z9Var2 = this$0.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var2;
                }
                z9Var.u0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z9 z9Var3 = this$0.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var3;
                }
                z9Var.V.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.I2(false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void N2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoSign.class);
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
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void O2() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlSlots.class);
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
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        if (st6.e(this)) {
            ox2.a.b(this).j().f(600).i().h(new b());
        }
    }

    public static final void a2(DlPhotoSign this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.I2(false);
                    return;
                } else {
                    this$0.I2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z9 z9Var = null;
            Uri data = intentC != null ? intentC.getData() : null;
            Intrinsics.checkNotNull(data);
            if (Build.VERSION.SDK_INT >= 28) {
                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(this$0.getContentResolver(), data));
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
                z9 z9Var2 = this$0.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var2;
                }
                z9Var.u0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z9 z9Var3 = this$0.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var3;
                }
                z9Var.V.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.I2(false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void e2() {
        if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new c());
        }
    }

    private final void f2() {
        wl5 wl5Var = new wl5(this);
        this.viewModel = (wm1) new z(this).a(wm1.class);
        z9 z9Var = this.mBinding;
        wm1 wm1Var = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.v(this);
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
                z9 z9Var2 = this.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var2 = null;
                }
                z9Var2.I.g.setText(wl5Var.k());
                z9 z9Var3 = this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var3 = null;
                }
                z9Var3.G.setText("CL No. : " + this.dlNo);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        F2(str);
        z9 z9Var4 = this.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var4 = null;
        }
        z9Var4.C.setText(Z1());
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
            Toast.makeText(getApplicationContext(), c2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var = wm1Var3;
        }
        wm1Var.k().g(this, new h(new d()));
    }

    private final void g2() {
        wm1 wm1Var = this.viewModel;
        wm1 wm1Var2 = null;
        if (wm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        }
        wm1Var.j().g(this, new h(new e()));
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var3 = null;
        }
        wm1Var3.m().g(this, new h(new f()));
        wm1 wm1Var4 = this.viewModel;
        if (wm1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var2 = wm1Var4;
        }
        wm1Var2.l().g(this, new h(new g()));
    }

    private final void h2() {
        z9 z9Var = this.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.i2(this.a, view);
            }
        });
        z9 z9Var3 = this.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.q2(this.a, view);
            }
        });
        z9 z9Var4 = this.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var4 = null;
        }
        z9Var4.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.po1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.r2(this.a, view);
            }
        });
        z9 z9Var5 = this.mBinding;
        if (z9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var5 = null;
        }
        z9Var5.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.s2(this.a, view);
            }
        });
        z9 z9Var6 = this.mBinding;
        if (z9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var6 = null;
        }
        z9Var6.v0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.t2(this.a, view);
            }
        });
        z9 z9Var7 = this.mBinding;
        if (z9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var7 = null;
        }
        z9Var7.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.u2(this.a, view);
            }
        });
        z9 z9Var8 = this.mBinding;
        if (z9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var8 = null;
        }
        z9Var8.I.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.v2(this.a, view);
            }
        });
        z9 z9Var9 = this.mBinding;
        if (z9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var9 = null;
        }
        z9Var9.W.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ao1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.w2(this.a, view);
            }
        });
        z9 z9Var10 = this.mBinding;
        if (z9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var10 = null;
        }
        z9Var10.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.x2(this.a, view);
            }
        });
        z9 z9Var11 = this.mBinding;
        if (z9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var11 = null;
        }
        z9Var11.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.co1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.j2(this.a, view);
            }
        });
        z9 z9Var12 = this.mBinding;
        if (z9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var12 = null;
        }
        z9Var12.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ho1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.k2(this.a, view);
            }
        });
        z9 z9Var13 = this.mBinding;
        if (z9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var13 = null;
        }
        z9Var13.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.l2(this.a, view);
            }
        });
        z9 z9Var14 = this.mBinding;
        if (z9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var14 = null;
        }
        z9Var14.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ko1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.m2(this.a, view);
            }
        });
        z9 z9Var15 = this.mBinding;
        if (z9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var15 = null;
        }
        z9Var15.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.n2(this.a, view);
            }
        });
        z9 z9Var16 = this.mBinding;
        if (z9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var16 = null;
        }
        z9Var16.X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.o2(this.a, view);
            }
        });
        z9 z9Var17 = this.mBinding;
        if (z9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var17;
        }
        z9Var2.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.no1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.p2(this.a, view);
            }
        });
    }

    public static final void i2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.e2();
    }

    public static final void j2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.x.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.w.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.J.setVisibility(8);
    }

    public static final void k2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.y.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.z.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.K.setVisibility(0);
    }

    public static final void l2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.z.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.y.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.K.setVisibility(8);
    }

    public static final void m2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.B.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.A.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.L.setVisibility(8);
    }

    public static final void n2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.A.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.B.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.L.setVisibility(0);
    }

    public static final void o2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.X.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.Y.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.M.setVisibility(0);
    }

    public static final void p2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.Y.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.X.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.M.setVisibility(8);
    }

    public static final void q2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.X1();
    }

    public static final void r2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.e2();
    }

    public static final void s2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.X1();
    }

    public static final void t2(DlPhotoSign this$0, View view) {
        wm1 wm1Var;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.c2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (this$0.mStatus == -1 || this$0.mApplPhoto.length() <= 0 || this$0.mApplSign.length() <= 0) {
            this$0.B2(this$0.c2().b("photo_signature", ""));
            return;
        }
        z9 z9Var = this$0.mBinding;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.v0.c(true);
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

    public static final void u2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void w2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        String str = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.W.c(true);
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

    public static final void x2(DlPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.w.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.x.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.J.setVisibility(0);
    }

    private final void z2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.A2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void D2(Context context, String message) {
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
        textView.setText(c2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.io1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlPhotoSign.E2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void F2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_date = str;
    }

    public final void G2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void H2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final String Y1(String fdate) {
        String str;
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+ZZ:ZZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            str = simpleDateFormat2.format(date);
        } catch (ParseException e2) {
            e2.printStackTrace();
            str = null;
        }
        return String.valueOf(str);
    }

    public final String Z1() {
        String str = this.app_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app_date");
        return null;
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final of getGetDocLauncher() {
        return this.getDocLauncher;
    }

    public final wa3 c2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ws6 d2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl_photo_sign);
        z9 z9VarX = z9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(z9VarX, "inflate(...)");
        this.mBinding = z9VarX;
        if (z9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9VarX = null;
        }
        setContentView(z9VarX.m());
        H2(new ws6(this));
        G2(new wa3(this));
        f2();
        g2();
        h2();
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
            Toast.makeText(this, c2().b("go_settings", ""), 0).show();
            return;
        }
        if (requestCode != 1001) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            return;
        }
        Toast.makeText(this, c2().b("per_denied", getString(R.string.permission)), 0).show();
    }

    public final void y2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            N2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            L2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            K2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            O2();
        } else if (acCd != null && acCd.intValue() == 455) {
            z2(c2().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
